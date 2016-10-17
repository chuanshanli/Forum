-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 
-- Версия на сървъра: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `jsf`
--

-- --------------------------------------------------------

--
-- Структура на таблица `comments`
--

CREATE TABLE IF NOT EXISTS `comments` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `coment` varchar(20) NOT NULL,
  `topic_id` int(10) NOT NULL,
  `date` date DEFAULT NULL,
  `user_id` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=126 ;

--
-- Схема на данните от таблица `comments`
--

INSERT INTO `comments` (`id`, `coment`, `topic_id`, `date`, `user_id`) VALUES
(1, 'da', 2, '2016-10-17', 7),
(28, 'dsafsd', 5, '2016-10-04', 0),
(29, 'dsafsd', 5, '2016-10-04', 0),
(31, 'dsf', 6, '2016-10-04', 10),
(32, 'dsf', 7, '2016-10-04', 10),
(33, 'dsf', 6, '2016-10-04', 11),
(34, 'dsf', 7, '2016-10-04', 11),
(38, 'guck you', 6, '2016-10-04', 10),
(39, 'guck you', 7, '2016-10-04', 10),
(40, 'guck you', 6, '2016-10-04', 11),
(41, 'guck you', 7, '2016-10-04', 11),
(45, 'fuck oy', 6, '2016-10-04', 10),
(46, 'fuck oy', 7, '2016-10-04', 10),
(47, 'fuck oy', 6, '2016-10-04', 11),
(48, 'fuck oy', 7, '2016-10-04', 11),
(52, 'fuck oy', 6, '2016-10-04', 10),
(53, 'fuck oy', 7, '2016-10-04', 10),
(54, 'fuck oy', 6, '2016-10-04', 11),
(55, 'fuck oy', 7, '2016-10-04', 11),
(59, 'cxvcx', 6, '2016-10-04', 7),
(60, 'cxvcx', 7, '2016-10-04', 7),
(62, 'cxvcxcxzc', 6, '2016-10-04', 7),
(63, 'cxvcxcxzc', 7, '2016-10-04', 7),
(65, 'cxvcxcxzc', 9, '2016-10-04', 7),
(66, 'cxvcxcxzc', 9, '2016-10-04', 7),
(67, '', 5, '2016-10-04', 7),
(68, 'comments', 5, '2016-10-04', 7),
(69, 'comments', 5, '2016-10-04', 7),
(70, 'comments', 5, '2016-10-04', 7),
(71, 'comments', 5, '2016-10-04', 7),
(72, 'commentsk', 5, '2016-10-04', 7),
(73, 'david e gei', 5, '2016-10-04', 7),
(74, 'fuck you', 5, '2016-10-04', 7),
(75, 'comments', 9, '2016-10-04', 7),
(76, 'life is good', 9, '2016-10-04', 7),
(77, 'lifee is fuck', 9, '2016-10-04', 7),
(78, 'ssss', 5, '2016-10-04', 7),
(79, 'gggggggggg', 5, '2016-10-04', 7),
(80, 'vvvvvvvvvvvv', 5, '2016-10-04', 7),
(81, 'ssss', 5, '2016-10-04', 7),
(82, 'rerere', 5, '2016-10-04', 7),
(83, 'gonzoooo', 5, '2016-10-04', 7),
(84, 'gonzo', 5, '2016-10-04', 7),
(85, 'fdsfdsfdsf', 5, '2016-10-04', 7),
(86, 'david david david', 5, '2016-10-04', 7),
(87, 'comments', 5, '2016-10-04', 7),
(88, 'la la la la', 9, '2016-10-04', 7),
(89, 'ja jaj a', 9, '2016-10-04', 7),
(90, 'daad', 6, '2016-10-05', 7),
(91, 'daad', 7, '2016-10-05', 7),
(93, 'ehoooo', 5, '2016-10-05', 7),
(94, 'ehoooo', 5, '2016-10-05', 7),
(95, 'xzc', 5, '2016-10-05', 10),
(96, 'xzc', 5, '2016-10-05', 11),
(98, 'ggege', 6, '2016-10-05', 7),
(99, 'ggege', 7, '2016-10-05', 7),
(101, 'dsa', 6, '2016-10-05', 7),
(102, 'dsa', 7, '2016-10-05', 7),
(104, 'fuck', 6, '2016-10-05', 7),
(105, 'fuck', 7, '2016-10-05', 7),
(107, 'hi', 5, '2016-10-05', 7),
(108, 'ops', 5, '2016-10-05', 7),
(109, 'dsadsa', 9, '2016-10-05', 10),
(110, 'dsadsa', 9, '2016-10-05', 11),
(112, 'dsa', 11, '2016-10-05', 12),
(113, 'dsa', 12, '2016-10-05', 12),
(114, 'dsa', 11, '2016-10-05', 13),
(115, 'dsa', 12, '2016-10-05', 13),
(119, 'ds', 5, '2016-10-05', 12),
(120, 'ds', 5, '2016-10-05', 13),
(122, 'david', 14, '2016-10-05', 7),
(123, 'das', 15, '2016-10-05', 7),
(124, 'gonzo e gei', 16, '2016-10-05', 14),
(125, 'david e qk', 16, '2016-10-05', 14);

-- --------------------------------------------------------

--
-- Структура на таблица `gender`
--

CREATE TABLE IF NOT EXISTS `gender` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Схема на данните от таблица `gender`
--

INSERT INTO `gender` (`id`, `name`) VALUES
(1, 'male'),
(2, 'female');

-- --------------------------------------------------------

--
-- Структура на таблица `topic`
--

CREATE TABLE IF NOT EXISTS `topic` (
  `user_creatoror_id` int(10) NOT NULL,
  `topic_name` varchar(20) NOT NULL,
  `date` datetime(6) DEFAULT NULL,
  `id` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Схема на данните от таблица `topic`
--

INSERT INTO `topic` (`user_creatoror_id`, `topic_name`, `date`, `id`) VALUES
(7, 'a', '2016-10-03 00:00:00.000000', 5),
(10, 'hello man', '2016-10-04 00:00:00.000000', 6),
(11, 'hello man', '2016-10-04 00:00:00.000000', 7),
(7, 'for life', '2016-10-04 00:00:00.000000', 9),
(7, 're', '2016-10-04 00:00:00.000000', 10),
(12, 'dsa', '2016-10-05 00:00:00.000000', 11),
(13, 'dsa', '2016-10-05 00:00:00.000000', 12),
(7, 'd', '2016-10-05 00:00:00.000000', 14),
(7, 'dd', '2016-10-05 00:00:00.000000', 15),
(14, 'za gonzo', '2016-10-05 00:00:00.000000', 16);

-- --------------------------------------------------------

--
-- Структура на таблица `town`
--

CREATE TABLE IF NOT EXISTS `town` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Схема на данните от таблица `town`
--

INSERT INTO `town` (`id`, `name`) VALUES
(1, 'Sofia'),
(2, 'Smolian'),
(3, 'Kaspichan');

-- --------------------------------------------------------

--
-- Структура на таблица `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  `password` varchar(11) NOT NULL,
  `gender_id` int(11) DEFAULT NULL,
  `town_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `gender_id` (`gender_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Схема на данните от таблица `user`
--

INSERT INTO `user` (`Id`, `name`, `password`, `gender_id`, `town_id`) VALUES
(7, 'david', 'hesoyam', 1, 1),
(8, 'dsa', 'dsa', 1, 2),
(9, 'dsa', 'dsa', 1, 2),
(10, 'user1', 'user1', 1, 1),
(11, 'user1', 'user1', 1, 1),
(12, 'w', 'w', 1, 1),
(13, 'w', 'w', 1, 1),
(14, 'gozno', 'gonzo', 1, 1),
(15, 'magi', 'magi', 1, 1);

--
-- Ограничения за дъмпнати таблици
--

--
-- Ограничения за таблица `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`gender_id`) REFERENCES `gender` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
