-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.10.1-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para gimnasio
CREATE DATABASE IF NOT EXISTS `gimnasio` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `gimnasio`;

-- Volcando estructura para tabla gimnasio.clientes
CREATE TABLE IF NOT EXISTS `clientes` (
  `cod_cliente` int(10) NOT NULL,
  `nombre_cliente` varchar(100) NOT NULL DEFAULT '',
  `apellido_cliente` varchar(100) NOT NULL,
  `telefono_cliente` int(12) NOT NULL,
  `email_cliente` varchar(100) NOT NULL DEFAULT '',
  `id_number_cliente` int(10) NOT NULL,
  `password_cliente` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`cod_cliente`),
  UNIQUE KEY `cod_cliente` (`cod_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla gimnasio.listado_membresias
CREATE TABLE IF NOT EXISTS `listado_membresias` (
  `cod_membresia` int(10) NOT NULL,
  `nombre_membresia` varchar(20) NOT NULL DEFAULT '',
  `valor_membresia` int(10) NOT NULL DEFAULT 0,
  PRIMARY KEY (`cod_membresia`),
  UNIQUE KEY `cod_membresia` (`cod_membresia`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla gimnasio.membresia_clientes
CREATE TABLE IF NOT EXISTS `membresia_clientes` (
  `cod` int(10) NOT NULL,
  `cod_cliente` int(10) NOT NULL,
  `cod_membresia` int(10) NOT NULL,
  `fecha_inscripcion` datetime NOT NULL,
  `status` int(1) NOT NULL DEFAULT 0,
  `token` int(10) NOT NULL DEFAULT 0,
  `fecha_token` datetime NOT NULL,
  PRIMARY KEY (`cod`),
  KEY `FK_membresia_clientes_gimnasio_clientes` (`cod_cliente`),
  KEY `FK_membresia_clientes_listado_membresias` (`cod_membresia`),
  CONSTRAINT `FK_membresia_clientes_gimnasio_clientes` FOREIGN KEY (`cod_cliente`) REFERENCES `clientes` (`cod_cliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_membresia_clientes_listado_membresias` FOREIGN KEY (`cod_membresia`) REFERENCES `listado_membresias` (`cod_membresia`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
