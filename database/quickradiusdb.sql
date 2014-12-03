-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 03, 2014 at 11:02 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `quickradiusdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `billing`
--

CREATE TABLE IF NOT EXISTS `billing` (
  `billID` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(45) NOT NULL,
  `plan` varchar(45) NOT NULL,
  `company` varchar(45) DEFAULT NULL,
  `contactPerson` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `tel` varchar(45) DEFAULT NULL,
  `vat` double DEFAULT NULL,
  `userID` int(11) NOT NULL,
  PRIMARY KEY (`billID`),
  KEY `e_idx` (`userID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `billing`
--

INSERT INTO `billing` (`billID`, `userName`, `plan`, `company`, `contactPerson`, `email`, `tel`, `vat`, `userID`) VALUES
(5, 'thapelo', 'uncapped', NULL, 'thapelo', NULL, NULL, NULL, 2);

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE IF NOT EXISTS `company` (
  `companyID` int(11) NOT NULL AUTO_INCREMENT,
  `companyName` varchar(45) NOT NULL,
  `tel` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  PRIMARY KEY (`companyID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `company`
--

INSERT INTO `company` (`companyID`, `companyName`, `tel`, `address`, `latitude`, `longitude`) VALUES
(5, 'Quick Connect Wireless', '0848674449', 'The Innovation Hub Mark Shuttleworth Street P', 29.5432, 3.453);

-- --------------------------------------------------------

--
-- Table structure for table `lastconnectionattempt`
--

CREATE TABLE IF NOT EXISTS `lastconnectionattempt` (
  `lastConnectionAttemptID` int(11) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `startTime` varchar(45) DEFAULT NULL,
  `radiusReply` varchar(45) DEFAULT NULL,
  `userID` int(11) NOT NULL,
  PRIMARY KEY (`lastConnectionAttemptID`),
  KEY `d_idx` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lastconnectionattempt`
--

INSERT INTO `lastconnectionattempt` (`lastConnectionAttemptID`, `userName`, `password`, `startTime`, `radiusReply`, `userID`) VALUES
(3, 'thapelo', '1023', '12:50', 'out of range', 2);

-- --------------------------------------------------------

--
-- Table structure for table `onlineusers`
--

CREATE TABLE IF NOT EXISTS `onlineusers` (
  `onlineUserID` int(11) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `ipAddress` double DEFAULT NULL,
  `startTime` varchar(45) NOT NULL,
  `totalTime` varchar(45) NOT NULL,
  `hotSpot` double DEFAULT NULL,
  `totalTraffic` double DEFAULT NULL,
  `userID` int(11) NOT NULL,
  PRIMARY KEY (`onlineUserID`),
  KEY `c_idx` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `onlineusers`
--

INSERT INTO `onlineusers` (`onlineUserID`, `userName`, `name`, `ipAddress`, `startTime`, `totalTime`, `hotSpot`, `totalTraffic`, `userID`) VALUES
(2, 'Thapelo', 'Thapelo', 0, '12:50', '2', NULL, NULL, 2);

-- --------------------------------------------------------

--
-- Table structure for table `operators`
--

CREATE TABLE IF NOT EXISTS `operators` (
  `operatorID` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `userName` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `tel` varchar(45) DEFAULT NULL,
  `companyID` int(11) NOT NULL,
  PRIMARY KEY (`operatorID`),
  KEY `a_idx` (`companyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `operators`
--

INSERT INTO `operators` (`operatorID`, `name`, `lastName`, `userName`, `password`, `email`, `tel`, `companyID`) VALUES
(2, 'Brandon', 'Muller', 'Brandon', '1023', 'brandon@quickConnect.net', '082 786 67678', 5),
(6, 'george', 'kapoya', 'george', '23453', 'gkapoya@gmail.com', '071 5454 847', 5),
(8, 'James', 'Coetzee', 'jamo', '1023', 'jamo.coetzee@gmail.com', '084 345 3453', 5);

-- --------------------------------------------------------

--
-- Table structure for table `planinformation`
--

CREATE TABLE IF NOT EXISTS `planinformation` (
  `planInformationID` int(11) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `plan` varchar(45) NOT NULL,
  `used` double NOT NULL,
  `allowedByPlan` double NOT NULL,
  `remaining` double DEFAULT NULL,
  `companyID` int(11) NOT NULL,
  PRIMARY KEY (`planInformationID`),
  KEY `g_idx` (`companyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `planinformation`
--

INSERT INTO `planinformation` (`planInformationID`, `userName`, `plan`, `used`, `allowedByPlan`, `remaining`, `companyID`) VALUES
(2, 'Thapelo', 'Uncaped', 200, 1000, 800, 5);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `userID` int(11) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `groups` varchar(45) DEFAULT NULL,
  `operatorID` int(11) NOT NULL,
  `planInformationID` int(11) NOT NULL,
  PRIMARY KEY (`userID`),
  KEY `b_idx` (`operatorID`),
  KEY `j_idx` (`planInformationID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userID`, `userName`, `email`, `password`, `latitude`, `longitude`, `groups`, `operatorID`, `planInformationID`) VALUES
(2, 'Thapelo', 'thapelo@gmail.com', '12334', 0, NULL, NULL, 2, 2);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `billing`
--
ALTER TABLE `billing`
  ADD CONSTRAINT `e` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `lastconnectionattempt`
--
ALTER TABLE `lastconnectionattempt`
  ADD CONSTRAINT `d` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `onlineusers`
--
ALTER TABLE `onlineusers`
  ADD CONSTRAINT `c` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `operators`
--
ALTER TABLE `operators`
  ADD CONSTRAINT `a` FOREIGN KEY (`companyID`) REFERENCES `company` (`companyID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `planinformation`
--
ALTER TABLE `planinformation`
  ADD CONSTRAINT `g` FOREIGN KEY (`companyID`) REFERENCES `company` (`companyID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `b` FOREIGN KEY (`operatorID`) REFERENCES `operators` (`operatorID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `j` FOREIGN KEY (`planInformationID`) REFERENCES `planinformation` (`planInformationID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
