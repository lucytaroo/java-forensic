-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 21, 2023 at 02:22 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `forensic`
--

-- --------------------------------------------------------

--
-- Table structure for table `caseinfo`
--

CREATE TABLE `caseinfo` (
  `caseid` varchar(100) NOT NULL,
  `date` varchar(100) NOT NULL,
  `crimetype` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `criminalinfo`
--

CREATE TABLE `criminalinfo` (
  `no` int(11) NOT NULL,
  `cname` varchar(100) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `cfrom` varchar(100) NOT NULL,
  `caseid` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `evidenceinfo`
--

CREATE TABLE `evidenceinfo` (
  `no` int(11) NOT NULL,
  `type` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL,
  `total` int(11) NOT NULL,
  `caseid` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `forensicinfo`
--

CREATE TABLE `forensicinfo` (
  `no` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `caseid` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `forensicstaff`
--

CREATE TABLE `forensicstaff` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `hqstaff`
--

CREATE TABLE `hqstaff` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `policeinfo`
--

CREATE TABLE `policeinfo` (
  `no` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `stationlocation` varchar(100) NOT NULL,
  `caseid` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `victiminfo`
--

CREATE TABLE `victiminfo` (
  `no` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `caseid` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `caseinfo`
--
ALTER TABLE `caseinfo`
  ADD PRIMARY KEY (`caseid`);

--
-- Indexes for table `criminalinfo`
--
ALTER TABLE `criminalinfo`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `evidenceinfo`
--
ALTER TABLE `evidenceinfo`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `forensicinfo`
--
ALTER TABLE `forensicinfo`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `forensicstaff`
--
ALTER TABLE `forensicstaff`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `hqstaff`
--
ALTER TABLE `hqstaff`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `policeinfo`
--
ALTER TABLE `policeinfo`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `victiminfo`
--
ALTER TABLE `victiminfo`
  ADD PRIMARY KEY (`no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `criminalinfo`
--
ALTER TABLE `criminalinfo`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `evidenceinfo`
--
ALTER TABLE `evidenceinfo`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `forensicinfo`
--
ALTER TABLE `forensicinfo`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `policeinfo`
--
ALTER TABLE `policeinfo`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `victiminfo`
--
ALTER TABLE `victiminfo`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
