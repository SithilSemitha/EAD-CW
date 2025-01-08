-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: ags
-- ------------------------------------------------------
-- Server version	8.0.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('Sithilsemitha','12345'),('Amil','444'),('Nayomi','222'),('sithil','111'),('kaveen','666'),('ruvindhu','99'),('sithuli','2223'),('kavindhu','5556'),('kelum','777');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `sid` varchar(20) DEFAULT NULL,
  `pid` varchar(20) DEFAULT NULL,
  `DATE` varchar(20) DEFAULT NULL,
  `FullName` varchar(50) DEFAULT NULL,
  `Termfees` double DEFAULT NULL,
  `additionalFees` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES ('1','1','04 - Jan - 2025','Sithil',2000,250),('1','2','04 - Jan - 2025','Sithil',25000,240),('2','2','04 - Jan - 2025','Kavindhu',2500,322),('2','3','04 - Jan - 2025','Kavindhu',5000,122),('3','3','05 - Jan - 2025','sithuli',20000,100),('3','4','05 - Jan - 2025','sithuli',5000,100),('2','4','08 - Jan - 2025','Kavindhu',1000,10);
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `sid` varchar(20) DEFAULT NULL,
  `sFullName` varchar(50) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `mobile` int DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `DOB` varchar(50) DEFAULT NULL,
  `Grade` varchar(50) DEFAULT NULL,
  `enrollmentDate` varchar(20) DEFAULT NULL,
  `FName` varchar(20) DEFAULT NULL,
  `FMobile` int DEFAULT NULL,
  `FAddress` varchar(20) DEFAULT NULL,
  `MName` varchar(20) DEFAULT NULL,
  `MMobile` int DEFAULT NULL,
  `MAddress` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('1','Sithil',18,'Colombo',719189794,'sithilsemitha@gmail.com','12/32/2006','Grade 07','12/24/2006','Amil Udanaka',719189797,'Colombo ','Nayomi De Silva',718206850,'Colombo '),('2','amil',15,'Rajagitiya,himbutana',775226351,'kavbindhug@gmail.com','12/06/2021','Grade 01','13/01/2008','Munil Peris',715523316,'Rajagitiya,himbutana','Kumudini rajapaksha',749662515,'Rajagitiya,himbutana'),('3','sithuli',8,'rajagiriyia',719189797,'sithuli@gmail.com','13/12/2012','Grade 08','12/45/2021\n','sujjeva peris',774569821,'Kollonawa','anitha bachchan',714895122,'Rajagiriya');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-01-08 20:02:27
