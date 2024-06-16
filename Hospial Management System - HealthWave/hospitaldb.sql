-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2024 at 01:21 AM
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
-- Database: `hospitaldb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(100) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin'),
(2, 'imasha', 'r0llr0ll');

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `count` int(11) NOT NULL,
  `pId` varchar(20) NOT NULL,
  `pName` varchar(30) NOT NULL,
  `dType` varchar(20) NOT NULL,
  `dId` varchar(20) NOT NULL,
  `dName` varchar(30) NOT NULL,
  `appDate` varchar(20) NOT NULL,
  `appTime` varchar(20) NOT NULL,
  `ward` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`count`, `pId`, `pName`, `dType`, `dId`, `dName`, `appDate`, `appTime`, `ward`) VALUES
(3, 'HWPAT003', 'niran', 'Anesthesiologist', 'HWDOC003', 'shanika', '2024-06-05', '09.00', 2),
(5, 'HWPAT005', 'Pabba', 'Cardiologist', 'HWDOC002', 'hareen', '2024-06-09', '10.00', 3),
(6, 'HWPAT006', 'Irosh', 'Surgeon', 'HWDOC006', 'dilmi', '2024-06-27', '14.00', 6),
(7, 'HWPAT001', 'maya', 'Cardiologist', 'HWDOC002', 'hareen', '2024-06-21', '10.00', 3),
(8, 'HWPAT011', 'ranji', 'Surgeon', 'HWDOC008', 'malki', '2024-06-17', '13.00', 6);

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `count` int(11) NOT NULL,
  `date` varchar(10) NOT NULL,
  `id` varchar(10) NOT NULL,
  `name` varchar(30) NOT NULL,
  `age` int(5) NOT NULL,
  `gender` varchar(8) NOT NULL,
  `blood` varchar(4) NOT NULL,
  `dept` varchar(20) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `email` varchar(30) NOT NULL,
  `status` varchar(10) NOT NULL,
  `address` varchar(20) NOT NULL,
  `ward` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`count`, `date`, `id`, `name`, `age`, `gender`, `blood`, `dept`, `phone`, `email`, `status`, `address`, `ward`, `username`, `password`) VALUES
(2, '2010-08-21', 'HWDOC002', 'hareen', 45, 'Male', 'B-', 'Cardiologist', '+9478926616', 'sefeWRr', 'Married', 'ekjueuuhe', 3, 'hareen', 'hareen'),
(3, '2010-08-29', 'HWDOC003', 'shanika', 30, 'Female', 'A-', 'Anesthesiologist', '+94789563', 'ewbyigfuufgw', 'Divorced', 'ewpwekooe', 2, 'shanika', 'shanika'),
(5, '2010-09-02', 'HWDOC005', 'chathura', 29, 'Male', 'A-', 'Pediatrician', '+9478459315', 'dffda', 'Single', 'Athurugiriya', 5, 'chathura', 'char'),
(9, '2011-01-06', 'HWDOC006', 'dilmi', 25, 'Female', 'O+', 'Surgeon', '+9471458793', 'dyiikmlj', 'Single', 'Athurugiriya', 6, 'dilmi', 'dil12'),
(11, '2024-05-14', 'HWDOC007', 'Thila', 26, 'Male', 'AB-', 'Dermatologist', '+9478941266', 'dndjsdjjs', 'Married', 'Malabe', 4, 'thila', 'wrz'),
(12, '2019-04-31', 'HWDOC008', 'malki', 36, 'Female', 'AB-', 'Surgeon', '+9478964122', 'rfwrwrg', 'Married', 'fegete', 6, 'malki', 'malki');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `count` int(100) NOT NULL,
  `date` varchar(12) NOT NULL,
  `id` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `age` int(5) NOT NULL,
  `gender` varchar(12) NOT NULL,
  `address` varchar(35) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `status` varchar(10) NOT NULL,
  `disease` varchar(20) NOT NULL,
  `room` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`count`, `date`, `id`, `name`, `age`, `gender`, `address`, `phone`, `status`, `disease`, `room`) VALUES
(1, '2024-05-10', 'HWPAT001', 'Maya', 12, 'Male', 'Godagama', '+9478945612', 'Married', 'idk', 11),
(3, '2024-05-23', 'HWPAT003', 'Niran', 17, 'Male', 'Koswatta', '+9471914563', 'Single', 'gasritease', 8),
(10, '2024-05-29', 'HWPAT005', 'Pabba', 22, 'Male', 'Nittabuwa', '+94784512893', 'Single', 'Stress', 140),
(11, '2024-05-30', 'HWPAT006', 'Irosh', 25, 'Male', 'FSsf', '+94sFfs', 'Single', 'Injury', 15),
(12, '2024-06-13', 'HWPAT011', 'ranji', 35, 'Male', 'kollonnawa', '+947845639', 'Divorced', 'arm injury', 125);

-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

CREATE TABLE `receptionist` (
  `count` int(11) NOT NULL,
  `joining` varchar(15) NOT NULL,
  `id` varchar(15) NOT NULL,
  `name` varchar(30) NOT NULL,
  `age` varchar(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `blood` varchar(5) NOT NULL,
  `email` varchar(40) NOT NULL,
  `phone` varchar(17) NOT NULL,
  `address` varchar(30) NOT NULL,
  `status` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `receptionist`
--

INSERT INTO `receptionist` (`count`, `joining`, `id`, `name`, `age`, `gender`, `blood`, `email`, `phone`, `address`, `status`, `username`, `password`) VALUES
(1, '2010-08-15', 'HWREP001', 'Gayani', '22', 'Female', 'O+', 'UJHDSHUOFUOFOI', '+94768415239', 'dnsnsgnjgrs', 'Single', 'gayani', 'gayani12'),
(6, '2017-10-10', 'HWREP003', 'gayan', '29', 'Male', 'O+', 'gayana22@gmail.com', '+94784589', 'nuwara', 'Single', 'gayan', 'gayan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`count`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`count`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`count`);

--
-- Indexes for table `receptionist`
--
ALTER TABLE `receptionist`
  ADD PRIMARY KEY (`count`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `appointment`
--
ALTER TABLE `appointment`
  MODIFY `count` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `count` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `count` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `receptionist`
--
ALTER TABLE `receptionist`
  MODIFY `count` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
