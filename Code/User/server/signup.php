<?php
	include"connect.php";
	mysqli_set_charset($conn,'utf8');
	/** Array for JSON response*/
	$response = array();
	$username = $_POST['username'];
	$password = $_POST['password'];
	$email = $_POST['email'];
	$sqlCheck = "SELECT * FROM khachhang WHERE username = '$username'";
	$result = mysqli_query($conn,$sqlCheck);
	$gt = mysqli_num_rows($result);
	if (mysqli_num_rows($result) != 0) {	
			$response["success"] = 0;
			$response["message"] = "Tên đăng nhập hoặc email đã có người sử dụng!";
	    } else {	
			$sqlInsert = "INSERT INTO khachhang (username,password,email) VALUES ('$username','$password','$email')";
			$resultInsert = mysqli_query($conn,$sqlInsert);
			if ($resultInsert) {
					$sqlGetInfo = "SELECT username,password  FROM khachhang WHERE user_name = '$username' AND password = '$password'";
					$result = mysqli_query($conn,$sqlGetInfo);
					$row = mysqli_fetch_array($result);
					
					$response["success"] = 1;
					$response["message"] = "Đăng ký thành công!";
					$response["user_name"] = $username;
					$response["email"] = $email;
			} else {
				$response["success"] = 0;
				$response["message"] = "Đăng ký thất bại!";
			}
		}	
		/**Return json*/
	echo json_encode($response);
?>