-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mydbhorarios
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `asignaturaprofesor`
--

DROP TABLE IF EXISTS `asignaturaprofesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignaturaprofesor` (
  `CodAp` varchar(1) NOT NULL,
  `CodAsigAP` varchar(2) NOT NULL,
  `RunProfAP` varchar(12) NOT NULL,
  PRIMARY KEY (`CodAp`),
  KEY `CodAsigAp_idx` (`CodAsigAP`),
  KEY `RunProfAP_idx` (`RunProfAP`),
  CONSTRAINT `CodAsigAP` FOREIGN KEY (`CodAsigAP`) REFERENCES `asignaturas` (`CodAsig`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `RunProfAP` FOREIGN KEY (`RunProfAP`) REFERENCES `profesores` (`RunProf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignaturaprofesor`
--

LOCK TABLES `asignaturaprofesor` WRITE;
/*!40000 ALTER TABLE `asignaturaprofesor` DISABLE KEYS */;
INSERT INTO `asignaturaprofesor` VALUES ('1','25','19.198.136-7'),('2','24','12.123.456-8');
/*!40000 ALTER TABLE `asignaturaprofesor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asignaturas`
--

DROP TABLE IF EXISTS `asignaturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignaturas` (
  `CodAsig` varchar(2) NOT NULL,
  `NomAsig` varchar(100) DEFAULT NULL,
  `SemAsig` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`CodAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignaturas`
--

LOCK TABLES `asignaturas` WRITE;
/*!40000 ALTER TABLE `asignaturas` DISABLE KEYS */;
INSERT INTO `asignaturas` VALUES ('24','Sellos Sellos Educativos','2'),('25','Programacion De Sistemas Informaticos','2');
/*!40000 ALTER TABLE `asignaturas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamento profesor`
--

DROP TABLE IF EXISTS `departamento profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departamento profesor` (
  `CodDP` varchar(3) NOT NULL,
  `RunProfDP` varchar(12) NOT NULL,
  `NroDeptDP` varchar(3) NOT NULL,
  PRIMARY KEY (`CodDP`),
  KEY `RunProfDP_idx` (`RunProfDP`),
  KEY `NroDeptDP_idx` (`NroDeptDP`),
  CONSTRAINT `NroDeptDP` FOREIGN KEY (`NroDeptDP`) REFERENCES `departamentos` (`NroDept`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `RunProfDP` FOREIGN KEY (`RunProfDP`) REFERENCES `profesores` (`RunProf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamento profesor`
--

LOCK TABLES `departamento profesor` WRITE;
/*!40000 ALTER TABLE `departamento profesor` DISABLE KEYS */;
INSERT INTO `departamento profesor` VALUES ('765','12.123.456-8','251'),('980','19.198.136-7','250');
/*!40000 ALTER TABLE `departamento profesor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamentos`
--

DROP TABLE IF EXISTS `departamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departamentos` (
  `NroDept` varchar(3) NOT NULL,
  `DescDept` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`NroDept`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamentos`
--

LOCK TABLES `departamentos` WRITE;
/*!40000 ALTER TABLE `departamentos` DISABLE KEYS */;
INSERT INTO `departamentos` VALUES ('250','Informatica'),('251','Formacion General');
/*!40000 ALTER TABLE `departamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamentos asignatura`
--

DROP TABLE IF EXISTS `departamentos asignatura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departamentos asignatura` (
  `CodDA` varchar(2) NOT NULL,
  `NroDeptDA` varchar(3) NOT NULL,
  `CodAsigDA` varchar(2) NOT NULL,
  PRIMARY KEY (`CodDA`),
  KEY `NroDeptDA_idx` (`NroDeptDA`),
  KEY `CodAsigDa_idx` (`CodAsigDA`),
  CONSTRAINT `CodAsigDA` FOREIGN KEY (`CodAsigDA`) REFERENCES `asignaturas` (`CodAsig`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `NroDeptDA` FOREIGN KEY (`NroDeptDA`) REFERENCES `departamentos` (`NroDept`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamentos asignatura`
--

LOCK TABLES `departamentos asignatura` WRITE;
/*!40000 ALTER TABLE `departamentos asignatura` DISABLE KEYS */;
INSERT INTO `departamentos asignatura` VALUES ('67','250','25'),('68','251','24');
/*!40000 ALTER TABLE `departamentos asignatura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pizarras`
--

DROP TABLE IF EXISTS `pizarras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pizarras` (
  `CodPiz` varchar(4) NOT NULL,
  `DimPiz` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`CodPiz`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pizarras`
--

LOCK TABLES `pizarras` WRITE;
/*!40000 ALTER TABLE `pizarras` DISABLE KEYS */;
INSERT INTO `pizarras` VALUES ('2300','80x120x4'),('2500','80x120x4');
/*!40000 ALTER TABLE `pizarras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesores`
--

DROP TABLE IF EXISTS `profesores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesores` (
  `RunProf` varchar(12) NOT NULL,
  `NomProf` varchar(100) DEFAULT NULL,
  `AppProf` varchar(100) DEFAULT NULL,
  `ApmProf` varchar(100) DEFAULT NULL,
  `TlfProf` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`RunProf`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesores`
--

LOCK TABLES `profesores` WRITE;
/*!40000 ALTER TABLE `profesores` DISABLE KEYS */;
INSERT INTO `profesores` VALUES ('12.123.456-8','Marcela Cristina ','Vivallo','Cerrada','56 9 7421 3265'),('19.198.136-7','Luis Fernando','Miranda','Segovia','56 9 8978 3221');
/*!40000 ALTER TABLE `profesores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sala`
--

DROP TABLE IF EXISTS `sala`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sala` (
  `NroSala` varchar(3) NOT NULL,
  `DescSala` varchar(16) DEFAULT NULL,
  `CapSala` varchar(2) DEFAULT NULL,
  `LabInf` tinyint(4) DEFAULT NULL,
  `Comp` varchar(2) DEFAULT NULL,
  `CodPizSA` varchar(4) NOT NULL,
  `CodAsigSA` varchar(2) NOT NULL,
  PRIMARY KEY (`NroSala`),
  KEY `CodPizSa_idx` (`CodPizSA`),
  KEY `CodAsigSA_idx` (`CodAsigSA`),
  CONSTRAINT `CodAsigSA` FOREIGN KEY (`CodAsigSA`) REFERENCES `asignaturas` (`CodAsig`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `CodPizSA` FOREIGN KEY (`CodPizSA`) REFERENCES `pizarras` (`CodPiz`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sala`
--

LOCK TABLES `sala` WRITE;
/*!40000 ALTER TABLE `sala` DISABLE KEYS */;
INSERT INTO `sala` VALUES ('105','Sala De Informat','25',0,'24','2500','24'),('107','Sala De Informat','25',0,'25','2300','25');
/*!40000 ALTER TABLE `sala` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'mydbhorarios'
--

--
-- Dumping routines for database 'mydbhorarios'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-07 22:13:00
