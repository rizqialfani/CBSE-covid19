-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 19, 2020 at 09:45 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penanganancovid19`
--

-- --------------------------------------------------------

--
-- Table structure for table `pendaftaranrelawan`
--

CREATE TABLE `pendaftaranrelawan` (
  `Nama` varchar(100) DEFAULT NULL,
  `No_HP` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Jns_Id` varchar(50) DEFAULT NULL,
  `No_Id` varchar(100) NOT NULL,
  `Alamat_KId` varchar(600) DEFAULT NULL,
  `Jenis_Klmn` varchar(50) DEFAULT NULL,
  `TTL` varchar(100) DEFAULT NULL,
  `Agama` varchar(50) DEFAULT NULL,
  `Status_Perkawinan` varchar(50) DEFAULT NULL,
  `Pekerjaan` varchar(100) DEFAULT NULL,
  `Pendidikan` varchar(50) DEFAULT NULL,
  `Goldar` varchar(20) DEFAULT NULL,
  `Alamat_Domisili` varchar(600) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pendaftaranrelawan`
--

INSERT INTO `pendaftaranrelawan` (`Nama`, `No_HP`, `Email`, `Jns_Id`, `No_Id`, `Alamat_KId`, `Jenis_Klmn`, `TTL`, `Agama`, `Status_Perkawinan`, `Pekerjaan`, `Pendidikan`, `Goldar`, `Alamat_Domisili`) VALUES
('Yarnish Dwi Sagita Fidarliyan', '0812345678', 'yarnish@mail.com', 'KTM', '21120117130049', 'Jalan Prof. Soedarto', 'Perempuan', 'Tasikmalaya, 19/06/2020', 'Islam', 'Belum Menikah', 'Mahasiswa', 'SMA/Sederajat', 'AB', 'Jalan Prof. Soedarto'),
('M. Rizqi Alfani', '0812345678', 'alfani@mail.com', 'KTP', '21120117140007', 'Jalan Prof. Soedarto', 'Laki-laki', 'Semarang, 19/06/2020', 'Islam', 'Belum Menikah', 'Mahasiswa', 'SMA/Sederajat', 'O', 'Jalan Prof. Soedarto'),
('Dita Ananda Elisa Reviana', '0812345678', 'dita@mail.com', 'KTM', '21120117140009', 'Jalan Prof. Soedarto', 'Perempuan', 'Pati, 19/06/2020', 'Islam', 'Belum Menikah', 'Mahasiswa', 'SMA/Sederajat', 'AB', 'Jalan Prof. Soedarto');

-- --------------------------------------------------------

--
-- Table structure for table `pendataanpendatangkekotasemarang`
--

CREATE TABLE `pendataanpendatangkekotasemarang` (
  `NIK` varchar(50) NOT NULL,
  `Nama` varchar(100) DEFAULT NULL,
  `Umur` varchar(100) DEFAULT NULL,
  `No_HP` varchar(50) DEFAULT NULL,
  `Jenis_Kelamin` varchar(50) DEFAULT NULL,
  `Alamat` varchar(600) DEFAULT NULL,
  `Asal_Keberangkatan` varchar(200) DEFAULT NULL,
  `Lokasi_Kedatangan` varchar(200) DEFAULT NULL,
  `TanggalWaktu_Kedatangan` varchar(200) DEFAULT NULL,
  `KKKRTRW_Tujuan` varchar(600) DEFAULT NULL,
  `Lama_Berkunjung` varchar(100) DEFAULT NULL,
  `Kondisi_Kesehatan` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pendataanpendatangkekotasemarang`
--

INSERT INTO `pendataanpendatangkekotasemarang` (`NIK`, `Nama`, `Umur`, `No_HP`, `Jenis_Kelamin`, `Alamat`, `Asal_Keberangkatan`, `Lokasi_Kedatangan`, `TanggalWaktu_Kedatangan`, `KKKRTRW_Tujuan`, `Lama_Berkunjung`, `Kondisi_Kesehatan`) VALUES
('211201171', 'M. Rizqi Alfani', '20 tahun', '0812345678', 'Laki-laki', 'Jalan Prof Soedarto', 'Klaten', 'Terminal Banyumanik', '19/06/2020 09:30 WIB', 'Jalan Prof Soedarto', '6 bulan', 'Sehat'),
('2112011713', 'Yarnish Dwi', '19 tahun', '0812345678', 'Perempuan', 'Jalan Prof Soedarto', 'Tasikmalaya', 'Terminal Banyumanik', '19/06/2020 09:30 WIB', 'Jalan Prof Soedarto', '6 bulan', 'Sehat'),
('21120117140000', 'Dita Ananda Elisa Reviana', '20 tahun', '0812345678', 'Perempuan', 'Jalan Prof Soedarto', 'Pati', 'Terminal Banyumanik', '19/06/2020 09:30 WIB', 'Jalan Prof Soedarto', '6 bulan', 'Sehat');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pendaftaranrelawan`
--
ALTER TABLE `pendaftaranrelawan`
  ADD PRIMARY KEY (`No_Id`);

--
-- Indexes for table `pendataanpendatangkekotasemarang`
--
ALTER TABLE `pendataanpendatangkekotasemarang`
  ADD PRIMARY KEY (`NIK`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
