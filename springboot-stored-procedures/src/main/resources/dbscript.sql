-- Dumping database structure for roytuts
CREATE DATABASE IF NOT EXISTS `roytuts` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `roytuts`;

-- Dumping structure for procedure roytuts.get_users
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_users`()
BEGIN

	SELECT * FROM user_details;

END//
DELIMITER ;

-- Dumping structure for procedure roytuts.get_user_full_name_inout
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_user_full_name_inout`(
	INOUT `in_out` VARCHAR(50)

)
BEGIN

	SELECT concat(first_name, ' ', last_name) INTO in_out FROm user_details WHERE dob = in_out;
	
END//
DELIMITER ;

-- Dumping structure for procedure roytuts.get_user_full_name_in_out
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_user_full_name_in_out`(
	IN `user_id` INT,
	OUT `full_name` VARCHAR(50)

)
BEGIN

	SELECT concat(first_name, ' ', last_name) into full_name FROM user_details WHERE id = user_id;	

END//
DELIMITER ;

-- Dumping structure for table roytuts.user_details
CREATE TABLE IF NOT EXISTS `user_details` (
  `id` integer unsigned COLLATE utf8mb4_unicode_ci NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `last_name` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dob` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table roytuts.user_details: ~3 rows (approximately)
/*!40000 ALTER TABLE `user_details` DISABLE KEYS */;
INSERT INTO `user_details` (`id`, `first_name`, `last_name`, `email`, `dob`) VALUES
	(7, 'Soumitra', 'Roy', 'contact@roytuts.com', '30-08-2016'),
	(8, 'Souvik', 'Sanyal', 'souvik.sanyal@email.com', '30-09-1991'),
	(9, 'Abc', 'Xyz', 'abc@xyz.com', '12-01-1998'),
	(10, 'Liton', 'Sarkar', 'liton@email.com', '30-08-2012');