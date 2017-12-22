-- --------------------------------------------------------
-- Сервер:                       127.0.0.1
-- Версія сервера:               5.5.46-log - MySQL Community Server (GPL)
-- ОС сервера:                   Win64
-- HeidiSQL Версія:              9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for shop
CREATE DATABASE IF NOT EXISTS `shop` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `shop`;

-- Dumping structure for таблиця shop.basket
CREATE TABLE IF NOT EXISTS `basket` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `user_id` int(5) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `basket_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table shop.basket: ~0 rows (приблизно)
/*!40000 ALTER TABLE `basket` DISABLE KEYS */;
/*!40000 ALTER TABLE `basket` ENABLE KEYS */;

-- Dumping structure for таблиця shop.catalog
CREATE TABLE IF NOT EXISTS `catalog` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table shop.catalog: ~0 rows (приблизно)
/*!40000 ALTER TABLE `catalog` DISABLE KEYS */;
/*!40000 ALTER TABLE `catalog` ENABLE KEYS */;

-- Dumping structure for таблиця shop.product
CREATE TABLE IF NOT EXISTS `product` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `value` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table shop.product: ~0 rows (приблизно)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

-- Dumping structure for таблиця shop.pr_ct
CREATE TABLE IF NOT EXISTS `pr_ct` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `cat_id` int(5) NOT NULL,
  `prod_id` int(5) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `cat_id` (`cat_id`),
  KEY `prod_id` (`prod_id`),
  CONSTRAINT `pr_ct_ibfk_1` FOREIGN KEY (`cat_id`) REFERENCES `catalog` (`id`),
  CONSTRAINT `pr_ct_ibfk_2` FOREIGN KEY (`prod_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table shop.pr_ct: ~0 rows (приблизно)
/*!40000 ALTER TABLE `pr_ct` DISABLE KEYS */;
/*!40000 ALTER TABLE `pr_ct` ENABLE KEYS */;

-- Dumping structure for таблиця shop.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `login` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table shop.user: ~0 rows (приблизно)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- Dumping structure for таблиця shop.us_bask
CREATE TABLE IF NOT EXISTS `us_bask` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `basket_id` int(5) NOT NULL,
  `prod_id` int(5) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `basket_id` (`basket_id`),
  KEY `prod_id` (`prod_id`),
  CONSTRAINT `us_bask_ibfk_1` FOREIGN KEY (`basket_id`) REFERENCES `basket` (`id`),
  CONSTRAINT `us_bask_ibfk_2` FOREIGN KEY (`prod_id`) REFERENCES `pr_ct` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table shop.us_bask: ~0 rows (приблизно)
/*!40000 ALTER TABLE `us_bask` DISABLE KEYS */;
/*!40000 ALTER TABLE `us_bask` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
