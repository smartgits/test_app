CREATE TABLE `hq_goods_safter` ( 
`id` int(11) NOT NULL AUTO_INCREMENT,  
`goods_id` int(11) NOT NULL,
`safety_1_name` varchar(255) DEFAULT NULL,  
`safety_1_unit` int(1) DEFAULT NULL,
`safety_1_num` float DEFAULT NULL,
`safety_1_cps` varchar(255) DEFAULT NULL,
`safety_2_name` varchar(255) DEFAULT NULL,
`safety_2_unit` int(1) DEFAULT NULL,
`safety_2_num` float DEFAULT NULL,
`safety_2_cps` varchar(255) DEFAULT NULL,
`safety_3_name` varchar(255) DEFAULT NULL,
`safety_3_unit` int(1) DEFAULT NULL,
`safety_3_num` float DEFAULT NULL,
`safety_3_cps` varchar(255) DEFAULT NULL,
`safety_4_name` varchar(255) DEFAULT NULL,
`safety_4_unit` int(1) DEFAULT NULL,
`safety_4_num` float DEFAULT NULL,
`safety_4_cps` varchar(255) DEFAULT NULL,
`safety_5_name` varchar(255) DEFAULT NULL,
`safety_5_unit` int(1) DEFAULT NULL,
`safety_5_num` float DEFAULT NULL,
`safety_5_cps` varchar(255) DEFAULT NULL,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 |COMMENT='安全星级' |