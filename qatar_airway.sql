-- MariaDB dump 10.17  Distrib 10.4.8-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: qatar_airway
-- ------------------------------------------------------
-- Server version	10.4.8-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `airports`
--

DROP TABLE IF EXISTS `airports`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `airports` (
  `airports_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `city` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `country` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`airports_id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `airports`
--

LOCK TABLES `airports` WRITE;
/*!40000 ALTER TABLE `airports` DISABLE KEYS */;
INSERT INTO `airports` VALUES (2,'Loratadine ODT','Bích Động','Vietnam'),(3,'Hydromorphone Hydrochloride','København','Denmark'),(4,'MINTOX','Noyemberyan','Armenia'),(5,'Azithromycin','Skoghall','Sweden'),(6,'Duloxetine','Dalang','China'),(7,'sinus pressure and congestion relief','Kulotino','Russia'),(8,'Right Guard Total Defense 5','Praia da Tocha','Portugal'),(9,'CLORAZEPATE DIPOTASSIUM','Seoul','South Korea'),(10,'Honey Bisque Foundation SPF 20','Xushuguan','China'),(11,'LOVAZA','Changchi','China'),(12,'dg health calcium antacid','Bulag','Mongolia'),(13,'Sulfamethoxazole and Trimethoprim','Jām Sāhib','Pakistan'),(14,'Care One Nicotine','Avignon','France'),(15,'Nevanac','Mamonit','Philippines'),(16,'Quality Choice Quick Relief Diaper Rash','Union','Philippines'),(17,'New Lip Protector Sunscreen SPF15','Yanglin','China'),(18,'Benztropine Mesylate','Dome','Ghana'),(19,'up and up nasal','Dangjiaxian','China'),(20,'Ropinirole Hydrochloride','Pojok','Indonesia'),(21,'Ravicti','Bayt Qād','Palestinian Territory'),(22,'Antibacterial Liquid Hand','Taiping','China'),(23,'Parastat','Hamburg','Germany'),(24,'No7 Beautifully Matte Foundation Sunscreen Br','Whitchurch','United Kingdom'),(25,'Hepar Stannum 17/20','Lagoa do Itaenga','Brazil'),(26,'Quetiapine fumarate','Jiuxian','China'),(27,'cisatracurium besylate','Bunder','Indonesia'),(28,'Nabumetone','Itaberaí','Brazil'),(29,'SIncalide','Nowe','Poland'),(30,'Senna-Time','Aserrío de Gariché','Panama'),(31,'Ultravate X','Masinloc','Philippines'),(32,'Olanzapine and Fluoxetine','Chamalières','France'),(33,'Cough DM','Dragomer','Slovenia'),(34,'Spironolactone','Fovissste','Mexico'),(35,'Clindamycin Hydrochloride','Khodzhi-Gasan','Azerbaijan'),(36,'Ultracare Anesthetic','Wenchun','China'),(37,'Lysol','Oued Zem','Morocco'),(38,'Hamster Epithelium','Prigi','Indonesia'),(39,'Clopidogrel bisulfate','Ji’an','China'),(40,'Allfen DM','København','Denmark'),(41,'CVS Pharmacy Premium Wash','Lac du Bonnet','Canada'),(42,'rexall sleep aid','Polowat','Micronesia'),(43,'Donepezil hydrochloride','Chemerivtsi','Ukraine'),(44,'CEFTRIAXONE','Huatajata','Bolivia'),(45,'miconazole 1','Viana','Brazil'),(46,'Histamin','Manhush','Ukraine'),(47,'Protex','Kendari','Indonesia'),(48,'Lithium Carbonate','Sarirejo Satu','Indonesia'),(49,'ABILIFY','Binalbagan','Philippines'),(50,'Lithium Carbonate','Robīt','Ethiopia'),(51,'Pumpkin Anti-bacterial foaming Hand Wash','Xinxing','China'),(52,'Citalopram','Jacksonville','United States'),(53,'Risperidone','Taen Tengah','Indonesia'),(54,'Finasteride','Pasrukrajan Satu','Indonesia'),(55,'ReCreate Foundation','København','Denmark'),(56,'Animi-3','Stockholm','Sweden'),(57,'Rabbit Epithelium','Petaling Jaya','Malaysia'),(58,'LIDODERM','Naebugis','Indonesia'),(59,'Natural Lemon Verbena with White Tea Herb Thr','Andalucía','Colombia'),(60,'Berberis Vulgaris','Libacao','Philippines'),(61,'Olive Antibacterial Hand Sanitizer','Mont-Laurier','Canada'),(62,'Levothyroxine Sodium','Montemor-o-Velho','Portugal'),(63,'Stool Softener','Mölndal','Sweden'),(64,'Salicylic Acid','Río Grande','Peru'),(65,'Ultane','Nesterovskaya','Russia'),(66,'Poverty Weed','San Lorenzo','Peru'),(67,'Clorazepate Dipotassium','São Silvestre','Portugal'),(68,'Fresh Sugar Honey Tinted Lip Treatment SPF15','Tarrafal de São Nicolau','Cape Verde'),(69,'Neutrogena Wet Skin Swim Humidity Sweat','Santiago de Baney','Equatorial Guinea'),(70,'Standardized Bermuda Grass Pollen','Kampungsusah','Indonesia'),(71,'ibuprofen','Labao','China'),(72,'Sani Professional Brand Sani-Hands for Kids','Nar\'yan-Mar','Russia'),(73,'CONSTIPATION','Tegalsari','Indonesia'),(74,'Norepinephrine','Velké Bílovice','Czech Republic'),(75,'Saizen','Voskopojë','Albania'),(76,'CD CAPTURE TOTALE Triple Correcting Serum Fou','Jaguariaíva','Brazil'),(77,'Losartan potassium and Hydrochlorothiazide','Itapecerica','Brazil'),(78,'Fresh Umbrain Clay Freshface Foundation SPF 2','El Calafate','Argentina'),(79,'Bupropion Hydrochloride','Rönninge','Sweden'),(80,'Easydew EX Fresh Mild SunScreen','Sīlat al Ḩārithīyah','Palestinian Territory'),(81,'Oxygen','Brvenica','Macedonia'),(82,'WHITE FLOWER STRAIN RELIEF','San Andres','Philippines'),(83,'ALMOND','Gweru','Zimbabwe'),(84,'Ciprofloxacin','Qinhe','China'),(85,'day time','Tapacocha','Peru'),(86,'TopCare Heartburn Relief','Yongledian','China'),(87,'Miconazole 7','Pinyug','Russia'),(88,'Climara Pro','Kurmuk','Sudan'),(89,'Losartan Potassium and Hydrochlorothiazide','Semënovskoye','Russia'),(90,'Hydrochlorothiazide','Wendengying','China'),(91,'FAMILY CARE LUBRICANT SINGLE USE EYE','Rungis','France'),(92,'Neutrogena Sensitive Skin Sunblock','Koncang','Indonesia'),(93,'Heparin Sodium','Phunphin','Thailand'),(94,'DHC Hand','Veldhoven','Netherlands'),(95,'Food - Plant Source, Celery Apium graveolens','Chimbas','Argentina'),(96,'Oxymorphone Hydrochloride','Pskov','Russia'),(97,'HAND SANITIZING','Marly-le-Roi','France'),(98,'Astound Antibacterial','Åkersberga','Sweden'),(99,'Levofloxacin','Hŭngnam','North Korea'),(100,'Actos','Kagadi','Uganda'),(101,'CELTIS OCCIDENTALIS POLLEN','Esch-sur-Alzette','Luxembourg');
/*!40000 ALTER TABLE `airports` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `details`
--

DROP TABLE IF EXISTS `details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `details` (
  `details_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `standard_price` float unsigned NOT NULL,
  `vip_price` float unsigned NOT NULL,
  PRIMARY KEY (`details_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `details`
--

LOCK TABLES `details` WRITE;
/*!40000 ALTER TABLE `details` DISABLE KEYS */;
INSERT INTO `details` VALUES (1,766,1161),(2,804,1175),(3,156,544),(4,993,1493),(5,387,812),(6,715,1149),(7,952,1413),(8,147,493),(9,236,639),(10,922,1258),(11,955,1305);
/*!40000 ALTER TABLE `details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flights`
--

DROP TABLE IF EXISTS `flights`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flights` (
  `flights_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `departure` datetime NOT NULL,
  `arrival` datetime NOT NULL,
  `airports_id` int(10) unsigned NOT NULL,
  `details_id` int(10) unsigned NOT NULL,
  `vip_passengers` int(10) unsigned NOT NULL,
  `standard_passengers` int(10) unsigned NOT NULL,
  `planes_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`flights_id`),
  KEY `fk_airport_id_idx` (`airports_id`),
  KEY `fk_details_id_idx` (`details_id`),
  KEY `fk_planes_id_idx` (`planes_id`),
  CONSTRAINT `fk_airport_id` FOREIGN KEY (`airports_id`) REFERENCES `airports` (`airports_id`) ON DELETE CASCADE,
  CONSTRAINT `fk_details_id` FOREIGN KEY (`details_id`) REFERENCES `details` (`details_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_planes_id` FOREIGN KEY (`planes_id`) REFERENCES `planes` (`planes_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flights`
--

LOCK TABLES `flights` WRITE;
/*!40000 ALTER TABLE `flights` DISABLE KEYS */;
INSERT INTO `flights` VALUES (1,'2020-05-14 21:33:14','2020-05-15 01:33:14',6,1,51,31,2),(2,'2019-11-15 18:12:21','2019-11-15 22:12:21',81,5,38,51,6),(3,'2020-09-19 15:16:10','2020-09-19 23:16:10',8,8,34,63,7),(4,'2020-10-18 17:46:48','2020-10-18 19:46:48',91,8,63,13,9),(5,'2020-07-22 02:53:37','2020-07-22 12:53:37',63,10,44,76,1),(6,'2021-01-17 04:11:42','2021-01-17 10:11:42',89,2,22,141,12),(7,'2020-09-29 07:46:47','2020-09-29 18:46:47',97,3,56,102,9),(8,'2021-08-16 01:02:20','2021-08-16 06:02:20',95,2,7,115,9),(9,'2019-09-13 06:53:17','2019-09-13 15:53:17',92,5,76,142,5),(10,'2021-01-22 12:16:48','2021-01-22 19:16:48',49,7,29,68,10),(11,'2019-08-16 21:34:40','2019-08-17 06:34:40',96,10,94,60,12),(12,'2021-01-20 14:01:22','2021-01-20 22:01:22',85,7,56,55,13),(13,'2019-09-25 18:50:46','2019-09-26 02:50:46',40,8,39,145,11),(14,'2021-01-19 04:30:10','2021-01-19 11:30:10',35,1,47,141,3),(15,'2021-03-12 12:18:11','2021-03-12 21:18:11',66,9,31,107,7),(16,'2021-01-16 22:40:38','2021-01-17 07:40:38',22,2,5,45,7),(17,'2020-04-17 07:30:02','2020-04-17 19:30:02',46,6,62,110,4),(18,'2019-12-30 06:00:25','2019-12-30 13:00:25',35,1,83,24,2),(19,'2021-06-30 12:13:38','2021-06-30 22:13:38',78,8,41,110,14),(20,'2020-03-04 19:44:03','2020-03-05 06:44:03',10,3,19,48,5),(21,'2021-07-27 10:34:51','2021-07-27 20:34:51',11,5,53,20,3),(22,'2020-12-14 02:44:22','2020-12-14 13:44:22',26,2,74,108,9),(23,'2020-02-29 22:13:21','2020-03-01 10:13:21',93,3,44,148,10),(24,'2021-01-11 21:51:53','2021-01-12 08:51:53',12,1,28,2,13),(25,'2021-05-31 10:20:25','2021-05-31 23:20:25',42,7,66,70,11),(26,'2021-05-25 12:33:42','2021-05-25 19:33:42',19,2,79,149,1),(27,'2021-04-01 14:08:19','2021-04-01 22:08:19',62,8,61,43,6),(28,'2020-09-30 22:07:58','2020-10-01 09:07:58',62,4,85,133,11),(29,'2020-09-18 08:17:16','2020-09-18 18:17:16',22,6,6,79,8),(30,'2019-08-16 00:15:05','2019-08-16 10:15:05',24,3,27,43,4),(92,'2019-12-29 21:33:14','2019-12-29 01:33:14',5,5,100,10,1);
/*!40000 ALTER TABLE `flights` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planes`
--

DROP TABLE IF EXISTS `planes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `planes` (
  `planes_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `model` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `max_seats` int(10) unsigned NOT NULL,
  PRIMARY KEY (`planes_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planes`
--

LOCK TABLES `planes` WRITE;
/*!40000 ALTER TABLE `planes` DISABLE KEYS */;
INSERT INTO `planes` VALUES (1,'707',137),(2,'717-200',134),(3,'720',131),(4,'727',155),(5,'737',215),(6,'7373',149),(7,'7376',214),(8,'7378',200),(9,'747',400),(10,'757',243),(11,'767',245),(12,'777',368),(13,'7771',384),(14,'787',242);
/*!40000 ALTER TABLE `planes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-18 14:38:30
