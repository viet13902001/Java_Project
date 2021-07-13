<?php
	include "connect.php";
	$json = $_POST['json'];
	$data = json_decode($json,true);
	foreach ($data as $value) {
        $madonhang=$value['madonhang'];
        $maphong=$value['maphong'];
        $tenphong=$value['tenphong'];
        $giaphong=$value['giaphong'];
		$soluongphong=$value['soluongphong'];
        $query="INSERT INTO chitietdonhang(id,madonhang,maphong,tenphong,giaphong,soluongphong) VALUES (NULL,'$madonhang','$maphong','$tenphong','$giaphong','$soluongphong')";
		$Dta = mysqli_query($conn,$query);
	}
	if ($Dta) {
		echo "1";
	}else{
		echo "0";
	}
?>