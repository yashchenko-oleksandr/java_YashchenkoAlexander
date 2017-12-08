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


-- Dumping database structure for catalog
CREATE DATABASE IF NOT EXISTS `catalog` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `catalog`;

-- Dumping structure for таблиця catalog.phones
CREATE TABLE IF NOT EXISTS `phones` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `user_id` int(5) DEFAULT NULL,
  `phone_number` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Dumping data for table catalog.phones: ~4 rows (приблизно)
/*!40000 ALTER TABLE `phones` DISABLE KEYS */;
INSERT INTO `phones` (`id`, `user_id`, `phone_number`) VALUES
	(3, 2, '8093457682'),
	(4, 3, '093457555'),
	(5, 5, '8093457333'),
	(6, 4, '093457444');
/*!40000 ALTER TABLE `phones` ENABLE KEYS */;

-- Dumping structure for таблиця catalog.rooms
CREATE TABLE IF NOT EXISTS `rooms` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `phone_id` int(5) DEFAULT NULL,
  `room_number` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Dumping data for table catalog.rooms: ~4 rows (приблизно)
/*!40000 ALTER TABLE `rooms` DISABLE KEYS */;
INSERT INTO `rooms` (`id`, `phone_id`, `room_number`) VALUES
	(1, 5, 327),
	(2, 2, 326),
	(3, 4, 326),
	(4, 3, 327);
/*!40000 ALTER TABLE `rooms` ENABLE KEYS */;

-- Dumping structure for таблиця catalog.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Dumping data for table catalog.users: ~4 rows (приблизно)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `username`) VALUES
	(2, 'Александр'),
	(3, 'Богдан'),
	(4, 'Лиза'),
	(5, 'Антон');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
