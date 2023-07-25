-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 20, 2023 at 08:39 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lawyer`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_kasus`
--

CREATE TABLE `data_kasus` (
  `ID_Klien` varchar(20) NOT NULL,
  `Nama_Klien` varchar(100) NOT NULL,
  `Nama_Kasus` varchar(50) NOT NULL,
  `Tanggal_Kasus` date NOT NULL,
  `Status_Kasus` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_kasus`
--

INSERT INTO `data_kasus` (`ID_Klien`, `Nama_Klien`, `Nama_Kasus`, `Tanggal_Kasus`, `Status_Kasus`) VALUES
('A0002', 'Husein', 'Asusila', '2023-07-12', 'Aktif'),
('A0006', '', 'Narkoba', '2023-04-13', 'Aktif'),
('A0007', '', 'Penipuan', '2023-04-14', 'Aktif'),
('A0008', 'sayson', 'narkoba', '2023-07-14', 'Aktif'),
('A0009', 'Kyle', 'Pengedar', '2023-07-03', 'Aktif');

-- --------------------------------------------------------

--
-- Table structure for table `data_kasus_phi`
--

CREATE TABLE `data_kasus_phi` (
  `ID_Klien` varchar(20) NOT NULL,
  `Nama_Klien` varchar(100) NOT NULL,
  `Nama_Kasus` varchar(100) NOT NULL,
  `Tanggal_Kasus` date NOT NULL,
  `Status_Kasus` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_kasus_phi`
--

INSERT INTO `data_kasus_phi` (`ID_Klien`, `Nama_Klien`, `Nama_Kasus`, `Tanggal_Kasus`, `Status_Kasus`) VALUES
('A0001', '', 'Tuntutan', '2023-05-18', 'Aktif');

-- --------------------------------------------------------

--
-- Table structure for table `data_kasus_pidana`
--

CREATE TABLE `data_kasus_pidana` (
  `ID_Klien` varchar(20) NOT NULL,
  `Nama_Klien` varchar(100) NOT NULL,
  `Nama_Kasus` varchar(100) NOT NULL,
  `Tanggal_Kasus` date NOT NULL,
  `Status_Kasus` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_kasus_pidana`
--

INSERT INTO `data_kasus_pidana` (`ID_Klien`, `Nama_Klien`, `Nama_Kasus`, `Tanggal_Kasus`, `Status_Kasus`) VALUES
('A0001', 'Agnes', 'Korupsi', '2023-07-07', 'Aktif'),
('A0002', 'Pranata', 'Pembunuhan', '2023-07-20', 'Aktif');

-- --------------------------------------------------------

--
-- Table structure for table `data_kasus_pkpu`
--

CREATE TABLE `data_kasus_pkpu` (
  `ID_Klien` varchar(20) NOT NULL,
  `Nama_Klien` varchar(100) NOT NULL,
  `Nama_Kasus` varchar(100) NOT NULL,
  `Tanggal_Kasus` date NOT NULL,
  `Status_Kasus` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_kasus_pkpu`
--

INSERT INTO `data_kasus_pkpu` (`ID_Klien`, `Nama_Klien`, `Nama_Kasus`, `Tanggal_Kasus`, `Status_Kasus`) VALUES
('A0001', '', 'Pembunuhan', '2023-05-18', 'Aktif');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `Nama` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`, `Nama`) VALUES
('vigapratama', '123456', 'Viga'),
('vpratama', 'kalibata', 'Viga Pratama');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_kasus`
--
ALTER TABLE `data_kasus`
  ADD PRIMARY KEY (`ID_Klien`);

--
-- Indexes for table `data_kasus_phi`
--
ALTER TABLE `data_kasus_phi`
  ADD PRIMARY KEY (`ID_Klien`);

--
-- Indexes for table `data_kasus_pidana`
--
ALTER TABLE `data_kasus_pidana`
  ADD PRIMARY KEY (`ID_Klien`);

--
-- Indexes for table `data_kasus_pkpu`
--
ALTER TABLE `data_kasus_pkpu`
  ADD PRIMARY KEY (`ID_Klien`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
