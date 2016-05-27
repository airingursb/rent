# ************************************************************
# Sequel Pro SQL dump
# Version 4135
#
# http://www.sequelpro.com/
# http://code.google.com/p/sequel-pro/
#
# Host: 127.0.0.1 (MySQL 5.1.63)
# Database: wechatoa
# Generation Time: 2016-05-27 06:51:52 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table equipment
# ------------------------------------------------------------

DROP TABLE IF EXISTS `equipment`;

CREATE TABLE `equipment` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `equipment_stat` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `equipment` WRITE;
/*!40000 ALTER TABLE `equipment` DISABLE KEYS */;

INSERT INTO `equipment` (`id`, `name`, `equipment_stat`)
VALUES
	(1,'xxx牌摄像机',0),
	(2,'xxx牌电池',0);

/*!40000 ALTER TABLE `equipment` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table rent
# ------------------------------------------------------------

DROP TABLE IF EXISTS `rent`;

CREATE TABLE `rent` (
  `id` int(11) NOT NULL,
  `equipment_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `rent_time` datetime DEFAULT NULL,
  `rent_stat` int(11) DEFAULT NULL,
  `password` int(11) DEFAULT NULL,
  `back_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `equipment_id_fk_rent_idx` (`equipment_id`),
  CONSTRAINT `equipment_id_fk_rent` FOREIGN KEY (`equipment_id`) REFERENCES `equipment` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `rent` WRITE;
/*!40000 ALTER TABLE `rent` DISABLE KEYS */;

INSERT INTO `rent` (`id`, `equipment_id`, `user_id`, `username`, `rent_time`, `rent_stat`, `password`, `back_time`)
VALUES
	(1,1,1308200047,'邓国雄','2016-05-27 14:01:10',0,90430103,'2016-05-27 14:01:24'),
	(3,1,1308200045,'刘杰容','2016-05-27 14:34:57',1,26505904,NULL),
	(4,1,1308200045,'刘吉尔','2016-05-27 14:35:41',0,17412024,'2016-05-27 14:36:25');

/*!40000 ALTER TABLE `rent` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
