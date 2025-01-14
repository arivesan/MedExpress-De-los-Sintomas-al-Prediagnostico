-- MySQL Script generated by MySQL Workbench
-- Sun Jul 11 11:13:40 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema medexpress
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `medexpress` ;

-- -----------------------------------------------------
-- Schema medexpress
-- -----------------------------------------------------
CREATE SCHEMA `medexpress` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `medexpress` ;

-- -----------------------------------------------------
-- Table `medexpress`.`adm_fac_med`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `medexpress`.`adm_fac_med` ;

CREATE TABLE `medexpress`.`adm_fac_med` (
  `ID_Empleado` VARCHAR(10) NOT NULL,
  `Pwd` VARCHAR(20) NOT NULL,
  `Nombre` VARCHAR(50) NOT NULL,
  `Apellidos` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`ID_Empleado`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `medexpress`.`pacientes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `medexpress`.`pacientes` ;

CREATE TABLE `medexpress`.`pacientes` (
  `ID_Paciente` VARCHAR(10) NOT NULL,
  `Pwd` VARCHAR(20) NOT NULL,
  `SS` INT(4) NULL DEFAULT NULL,
  `Num_Tel` VARCHAR(15) NULL DEFAULT NULL,
  `Buzon_Apartado` VARCHAR(50) NOT NULL,
  `Pueblo` VARCHAR(20) NOT NULL,
  `Estado` VARCHAR(20) NOT NULL,
  `Zip_Code` VARCHAR(5) NULL DEFAULT NULL,
  `Carretera_Calle` VARCHAR(70) NOT NULL,
  `Nombre` VARCHAR(50) NOT NULL,
  `Apellidos` VARCHAR(50) NOT NULL,
  `Fec_Nac` DATE NOT NULL,
  `Edad` INT(2) NOT NULL,
  `Genero` VARCHAR(1) NOT NULL,
  `Plan` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`ID_Paciente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `medexpress`.`comentarios`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `medexpress`.`comentarios` ;

CREATE TABLE `medexpress`.`comentarios` (
  `ID_Comentario` INT(11) NOT NULL AUTO_INCREMENT,
  `ID_Paciente` VARCHAR(10) NOT NULL,
  `fecha_comentario` DATE NOT NULL,
  `Hora_Comentario` TIME NOT NULL,
  `ID_Med_OM_SE` VARCHAR(10) NOT NULL,
  `Comentarios` VARCHAR(200) NULL DEFAULT NULL,
  `Rating_Numerico` INT(2) NOT NULL,
  PRIMARY KEY (`ID_Comentario`),
  INDEX `ID_Paciente` (`ID_Paciente` ASC) VISIBLE,
  CONSTRAINT `comentarios_ibfk_1`
    FOREIGN KEY (`ID_Paciente`)
    REFERENCES `medexpress`.`pacientes` (`ID_Paciente`))
ENGINE = InnoDB
AUTO_INCREMENT = 32
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `medexpress`.`especialidades`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `medexpress`.`especialidades` ;

CREATE TABLE `medexpress`.`especialidades` (
  `ID_Especialidad` INT(2) NOT NULL AUTO_INCREMENT,
  `Especialidad` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`ID_Especialidad`),
  UNIQUE INDEX `Especialidad` (`Especialidad` ASC) VISIBLE,
  UNIQUE INDEX `Especialidad_2` (`Especialidad` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `medexpress`.`historial_medico`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `medexpress`.`historial_medico` ;

CREATE TABLE `medexpress`.`historial_medico` (
  `ID_Hist_Med` INT(10) NOT NULL AUTO_INCREMENT,
  `ID_Medico` VARCHAR(10) NOT NULL,
  `Estatura` INT(2) NOT NULL,
  `Resultado_Exam_Fis` VARCHAR(100) NULL DEFAULT NULL,
  `Problema_Actual` VARCHAR(100) NOT NULL,
  `Fec_Consulta` DATE NOT NULL,
  `Peso` INT(3) NOT NULL,
  `Cond_Salud` VARCHAR(100) NOT NULL,
  `Alergias` VARCHAR(50) NOT NULL,
  `ID_Paciente` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`ID_Hist_Med`),
  INDEX `FKHistorial_825557` (`ID_Paciente` ASC) VISIBLE,
  CONSTRAINT `FKHistorial_825557`
    FOREIGN KEY (`ID_Paciente`)
    REFERENCES `medexpress`.`pacientes` (`ID_Paciente`))
ENGINE = InnoDB
AUTO_INCREMENT = 9718
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `medexpress`.`hospitales`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `medexpress`.`hospitales` ;

CREATE TABLE `medexpress`.`hospitales` (
  `ID_Facilidad` VARCHAR(10) NOT NULL,
  `Nombre` VARCHAR(50) NOT NULL,
  `Horario_Apertura` TIME NOT NULL,
  `Horario_Cierre` TIME NOT NULL,
  `Cap_Est` INT(3) NOT NULL,
  `Plan` VARCHAR(100) NOT NULL,
  `Equipo_Med` VARCHAR(100) NOT NULL,
  `Carretera_Calle` VARCHAR(100) NOT NULL,
  `Estado` VARCHAR(20) NOT NULL,
  `Pueblo` VARCHAR(20) NOT NULL,
  `Zip_Code` INT(5) NOT NULL,
  `Num_Tel` VARCHAR(15) NULL DEFAULT NULL,
  `Cant_Doc` INT(2) NOT NULL,
  PRIMARY KEY (`ID_Facilidad`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `medexpress`.`oficinas_medicas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `medexpress`.`oficinas_medicas` ;

CREATE TABLE `medexpress`.`oficinas_medicas` (
  `ID_Facilidad` VARCHAR(10) NOT NULL,
  `Nombre` VARCHAR(50) NOT NULL,
  `Horario_Apertura` TIME NOT NULL,
  `Horario_Cierre` TIME NOT NULL,
  `Cap_Est` INT(3) NOT NULL,
  `Plan` VARCHAR(100) NOT NULL,
  `Carretera_Calle` VARCHAR(100) NOT NULL,
  `Estado` VARCHAR(20) NOT NULL,
  `Pueblo` VARCHAR(20) NOT NULL,
  `Zip_Code` INT(5) NOT NULL,
  `Num_Tel` VARCHAR(15) NULL DEFAULT NULL,
  `Cant_Doc` INT(1) NOT NULL,
  PRIMARY KEY (`ID_Facilidad`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `medexpress`.`ingresos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `medexpress`.`ingresos` ;

CREATE TABLE `medexpress`.`ingresos` (
  `ID_Ingresos` VARCHAR(10) NOT NULL,
  `ID_Paciente` VARCHAR(10) NOT NULL,
  `ID_Facilidad` VARCHAR(10) NOT NULL,
  `Hora_Ingreso` TIME NOT NULL,
  `Fec_Ingreso` DATE NOT NULL,
  `Prediagnostico` VARCHAR(100) NULL DEFAULT NULL,
  `Atendido` TINYINT(1) NULL DEFAULT NULL,
  PRIMARY KEY (`ID_Ingresos`),
  INDEX `FKIngresos912588` (`ID_Paciente` ASC) VISIBLE,
  INDEX `id_facilidad1_idx` (`ID_Facilidad` ASC) VISIBLE,
  CONSTRAINT `FKIngresos912588`
    FOREIGN KEY (`ID_Paciente`)
    REFERENCES `medexpress`.`pacientes` (`ID_Paciente`),
  CONSTRAINT `id_facilidad1`
    FOREIGN KEY (`ID_Facilidad`)
    REFERENCES `medexpress`.`hospitales` (`ID_Facilidad`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `id_facilidad2`
    FOREIGN KEY (`ID_Facilidad`)
    REFERENCES `medexpress`.`oficinas_medicas` (`ID_Facilidad`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `medexpress`.`medicos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `medexpress`.`medicos` ;

CREATE TABLE `medexpress`.`medicos` (
  `ID_Medico` VARCHAR(10) NOT NULL,
  `Pwd` VARCHAR(20) NOT NULL,
  `Nombre` VARCHAR(50) NOT NULL,
  `Apellidos` VARCHAR(50) NOT NULL,
  `ID_especialidad` INT(2) NULL DEFAULT NULL,
  PRIMARY KEY (`ID_Medico`),
  INDEX `ID_especialidad` (`ID_especialidad` ASC) VISIBLE,
  CONSTRAINT `medicos_ibfk_1`
    FOREIGN KEY (`ID_especialidad`)
    REFERENCES `medexpress`.`especialidades` (`ID_Especialidad`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `medexpress`.`trabaja`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `medexpress`.`trabaja` ;

CREATE TABLE `medexpress`.`trabaja` (
  `ID_Empleado` VARCHAR(10) NOT NULL,
  `ID_Facilidad` VARCHAR(10) NOT NULL,
  `Hora_Entrada` TIME NOT NULL,
  `Hora_Salida` TIME NOT NULL,
  `Dia_Trab` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`ID_Empleado`, `ID_Facilidad`),
  INDEX `id_facilidad1_idx` (`ID_Facilidad` ASC) VISIBLE,
  CONSTRAINT `id_empleado1`
    FOREIGN KEY (`ID_Empleado`)
    REFERENCES `medexpress`.`medicos` (`ID_Medico`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `id_empleado2`
    FOREIGN KEY (`ID_Empleado`)
    REFERENCES `medexpress`.`adm_fac_med` (`ID_Empleado`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `id_facilidad1`
    FOREIGN KEY (`ID_Facilidad`)
    REFERENCES `medexpress`.`hospitales` (`ID_Facilidad`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `id_facilidad2`
    FOREIGN KEY (`ID_Facilidad`)
    REFERENCES `medexpress`.`oficinas_medicas` (`ID_Facilidad`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `medexpress`.`especialidades`
-- -----------------------------------------------------
START TRANSACTION;
USE `medexpress`;
INSERT INTO `medexpress`.`especialidades` (`ID_Especialidad`, `Especialidad`) VALUES (1, 'Dermatologia');
INSERT INTO `medexpress`.`especialidades` (`ID_Especialidad`, `Especialidad`) VALUES (2, 'Generalista');
INSERT INTO `medexpress`.`especialidades` (`ID_Especialidad`, `Especialidad`) VALUES (3, 'Alergia e Inmunologia');
INSERT INTO `medexpress`.`especialidades` (`ID_Especialidad`, `Especialidad`) VALUES (4, 'Gastroenterologia');
INSERT INTO `medexpress`.`especialidades` (`ID_Especialidad`, `Especialidad`) VALUES (5, 'Pediatra');
INSERT INTO `medexpress`.`especialidades` (`ID_Especialidad`, `Especialidad`) VALUES (6, 'Endocrinologia');
INSERT INTO `medexpress`.`especialidades` (`ID_Especialidad`, `Especialidad`) VALUES (7, 'Cardiologia');

COMMIT;


-- -----------------------------------------------------
-- Data for table `medexpress`.`hospitales`
-- -----------------------------------------------------
START TRANSACTION;
USE `medexpress`;
INSERT INTO `medexpress`.`hospitales` (`ID_Facilidad`, `Nombre`, `Horario_Apertura`, `Horario_Cierre`, `Cap_Est`, `Plan`, `Equipo_Med`, `Carretera_Calle`, `Estado`, `Pueblo`, `Zip_Code`, `Num_Tel`, `Cant_Doc`) VALUES ('E-001', 'Hospital X', '00:00:00', '23:59:59', 100, 'Plan XYZ', 'Rayos-X, Máquina de ECG, CT-Scan, Laboratorios, Ultrasonidos 3D, Colonoscopia, Endoscopia', 'Calle 1', 'PR', 'San Juan', 919, '(787)-777-7777', 50);
INSERT INTO `medexpress`.`hospitales` (`ID_Facilidad`, `Nombre`, `Horario_Apertura`, `Horario_Cierre`, `Cap_Est`, `Plan`, `Equipo_Med`, `Carretera_Calle`, `Estado`, `Pueblo`, `Zip_Code`, `Num_Tel`, `Cant_Doc`) VALUES ('E-002', 'Hospital Y', '00:00:00', '23:59:59', 75, 'Plan ABC', 'Rayos-X, Máquina de ECG, CT-Scan, Laboratorios, Ultrasonidos 3D, Colonoscopia, Endoscopia', 'Calle 2', 'PR', 'Juncos', 777, '(787)-777-7778', 45);

COMMIT;


-- -----------------------------------------------------
-- Data for table `medexpress`.`oficinas_medicas`
-- -----------------------------------------------------
START TRANSACTION;
USE `medexpress`;
INSERT INTO `medexpress`.`oficinas_medicas` (`ID_Facilidad`, `Nombre`, `Horario_Apertura`, `Horario_Cierre`, `Cap_Est`, `Plan`, `Carretera_Calle`, `Estado`, `Pueblo`, `Zip_Code`, `Num_Tel`, `Cant_Doc`) VALUES ('O-001', 'Oficina Médica XYZ', '08:00:00', '17:00:00', 15, 'Plan XYZ', 'Calle 1', 'PR', 'San Juan', 926, '(787)-777-7779', 3);
INSERT INTO `medexpress`.`oficinas_medicas` (`ID_Facilidad`, `Nombre`, `Horario_Apertura`, `Horario_Cierre`, `Cap_Est`, `Plan`, `Carretera_Calle`, `Estado`, `Pueblo`, `Zip_Code`, `Num_Tel`, `Cant_Doc`) VALUES ('O-002', 'Oficina Médica ABC', '08:00:00', '18:00:00', 10, 'Plan ABC', 'Calle 2', 'PR', 'Caguas', 726, '(787)-777-7780', 2);

COMMIT;

