-- MySQL Script generated by MySQL Workbench
-- Wed Dec  7 16:32:26 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydbHorarios
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydbHorarios
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydbHorarios` DEFAULT CHARACTER SET utf8 ;
USE `mydbHorarios` ;

-- -----------------------------------------------------
-- Table `mydbHorarios`.`Pizarras`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydbHorarios`.`Pizarras` (
  `CodPiz` VARCHAR(4) NOT NULL,
  `DimPiz` VARCHAR(8) NULL,
  PRIMARY KEY (`CodPiz`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydbHorarios`.`Asignaturas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydbHorarios`.`Asignaturas` (
  `CodAsig` VARCHAR(2) NOT NULL,
  `NomAsig` VARCHAR(100) NULL,
  `SemAsig` VARCHAR(1) NULL,
  PRIMARY KEY (`CodAsig`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydbHorarios`.`Sala`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydbHorarios`.`Sala` (
  `NroSala` VARCHAR(3) NOT NULL,
  `DescSala` VARCHAR(16) NULL,
  `CapSala` VARCHAR(2) NULL,
  `LabInf` TINYINT NULL,
  `Comp` VARCHAR(2) NULL,
  `CodPizSA` VARCHAR(4) NOT NULL,
  `CodAsigSA` VARCHAR(2) NOT NULL,
  PRIMARY KEY (`NroSala`),
  INDEX `CodPizSa_idx` (`CodPizSA` ASC),
  INDEX `CodAsigSA_idx` (`CodAsigSA` ASC),
  CONSTRAINT `CodPizSA`
    FOREIGN KEY (`CodPizSA`)
    REFERENCES `mydbHorarios`.`Pizarras` (`CodPiz`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `CodAsigSA`
    FOREIGN KEY (`CodAsigSA`)
    REFERENCES `mydbHorarios`.`Asignaturas` (`CodAsig`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydbHorarios`.`Profesores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydbHorarios`.`Profesores` (
  `RunProf` VARCHAR(12) NOT NULL,
  `NomProf` VARCHAR(100) NULL,
  `AppProf` VARCHAR(100) NULL,
  `ApmProf` VARCHAR(100) NULL,
  `TlfProf` VARCHAR(14) NULL,
  PRIMARY KEY (`RunProf`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydbHorarios`.`AsignaturaProfesor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydbHorarios`.`AsignaturaProfesor` (
  `CodAp` VARCHAR(1) NOT NULL,
  `CodAsigAP` VARCHAR(2) NOT NULL,
  `RunProfAP` VARCHAR(12) NOT NULL,
  PRIMARY KEY (`CodAp`),
  INDEX `CodAsigAp_idx` (`CodAsigAP` ASC),
  INDEX `RunProfAP_idx` (`RunProfAP` ASC),
  CONSTRAINT `CodAsigAP`
    FOREIGN KEY (`CodAsigAP`)
    REFERENCES `mydbHorarios`.`Asignaturas` (`CodAsig`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `RunProfAP`
    FOREIGN KEY (`RunProfAP`)
    REFERENCES `mydbHorarios`.`Profesores` (`RunProf`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydbHorarios`.`Departamentos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydbHorarios`.`Departamentos` (
  `NroDept` VARCHAR(3) NOT NULL,
  `DescDept` VARCHAR(100) NULL,
  PRIMARY KEY (`NroDept`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydbHorarios`.`Departamento Profesor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydbHorarios`.`Departamento Profesor` (
  `CodDP` VARCHAR(3) NOT NULL,
  `RunProfDP` VARCHAR(12) NOT NULL,
  `NroDeptDP` VARCHAR(3) NOT NULL,
  PRIMARY KEY (`CodDP`),
  INDEX `RunProfDP_idx` (`RunProfDP` ASC),
  INDEX `NroDeptDP_idx` (`NroDeptDP` ASC),
  CONSTRAINT `RunProfDP`
    FOREIGN KEY (`RunProfDP`)
    REFERENCES `mydbHorarios`.`Profesores` (`RunProf`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `NroDeptDP`
    FOREIGN KEY (`NroDeptDP`)
    REFERENCES `mydbHorarios`.`Departamentos` (`NroDept`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydbHorarios`.`Departamentos Asignatura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydbHorarios`.`Departamentos Asignatura` (
  `CodDA` VARCHAR(2) NOT NULL,
  `NroDeptDA` VARCHAR(3) NOT NULL,
  `CodAsigDA` VARCHAR(2) NOT NULL,
  PRIMARY KEY (`CodDA`),
  INDEX `NroDeptDA_idx` (`NroDeptDA` ASC),
  INDEX `CodAsigDa_idx` (`CodAsigDA` ASC),
  CONSTRAINT `NroDeptDA`
    FOREIGN KEY (`NroDeptDA`)
    REFERENCES `mydbHorarios`.`Departamentos` (`NroDept`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `CodAsigDA`
    FOREIGN KEY (`CodAsigDA`)
    REFERENCES `mydbHorarios`.`Asignaturas` (`CodAsig`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;