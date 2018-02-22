CREATE DATABASE  IF NOT EXISTS `autentic`
USE `autentic`;

DROP TABLE IF EXISTS `preventa`;
CREATE TABLE `preventa` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `comercial` VARCHAR(100) NOT NULL,
  `lugardespacho` VARCHAR(100) NOT NULL,
  `estado` INT(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `producto`;
CREATE TABLE `producto` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `valor` DOUBLE NOT NULL,
  `estado` INT(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;


--
-- Table structure for table `preventaproducto`
--

DROP TABLE IF EXISTS `preventaproducto`;
CREATE TABLE `preventaproducto` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `idproducto` BIGINT(20) NOT NULL,
  `idpreventa` BIGINT(20) NOT NULL,
  `cantidad` INT(11) NOT NULL,
  `valor` DOUBLE NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idproducto_idx` (`idproducto`),
  KEY `idpreventa_idx` (`idpreventa`),
  CONSTRAINT `idpreventa` FOREIGN KEY (`idpreventa`) REFERENCES `preventa` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `idproducto` FOREIGN KEY (`idproducto`) REFERENCES `producto` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=INNODB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `ventafactura`;
CREATE TABLE `ventafactura` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `idpreventa` BIGINT(20) NOT NULL,
  `valortotal` DOUBLE NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idpreventa_idx` (`idpreventa`),
  CONSTRAINT `idpreventafactura` FOREIGN KEY (`idpreventa`) REFERENCES `preventa` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=INNODB DEFAULT CHARSET=utf8;