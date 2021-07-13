<?php
	include "connect.php";
	$mangsanphammoinhat = array();
	$query = "SELECT * FROM sanpham ORDER BY ID DESC LIMIT 6";
	$data = mysqli_query($conn,$query);
	while ($row = mysqli_fetch_assoc($data)) {
		array_push($mangsanphammoinhat,new Sanphammoinhat(
			$row['ID'],
			$row['tensanpham'],
			$row['giasanpham'],
			$row['hinhanhsanpham'],
			$row['motasanpham'],
			$row['IDsanpham']));
	}
	echo json_encode($mangsanphammoinhat);
	class Sanphammoinhat{
		function Sanphammoinhat($id,$tensp,$giasp,$hinhanhsp,$motasp,$idsanpham){
			$this->id=$id;
			$this->tensp=$tensp;
			$this->giasp=$giasp;
			$this->hinhanhsp=$hinhanhsp;
			$this->motasp=$motasp;
			$this->idsanpham=$idsanpham;
		}
	}
?>