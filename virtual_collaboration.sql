-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 04, 2023 at 02:56 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `virtual_collaboration`
--

-- --------------------------------------------------------

--
-- Table structure for table `announcement`
--

CREATE TABLE `announcement` (
  `AnnounceID` int(11) NOT NULL,
  `Description` text NOT NULL,
  `Time` time DEFAULT current_timestamp(),
  `GroupID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `announcement`
--

INSERT INTO `announcement` (`AnnounceID`, `Description`, `Time`, `GroupID`) VALUES
(2, 'Asslam o Alaikum everyone,\r\nSir Ahmed extended the project\'s date.', '00:00:00', 1),
(6, 'We can return string array by iterating a variable in while loop with condition rs.next(); and then assign that variable as size of array.', '00:00:00', 1),
(8, 'We are going to give online demo of our project, today at 07:00 p.m.', '04:25:49', 1),
(12, 'Our next demo is on 4th january, 3:30 p.m. ', '00:00:00', 2),
(13, 'Always do all projects on time.\r\nDon\'t leave you work for last days,otherwise panic monster will kill you.', '11:44:13', 2),
(15, 'Improve your mistakes and then again give demo.', '09:00:00', 6),
(17, 'Project is almost updated with new changes', '22:26:30', 1),
(18, 'New changes are implemented', '22:28:52', 2);

-- --------------------------------------------------------

--
-- Table structure for table `assignedtasks`
--

CREATE TABLE `assignedtasks` (
  `AssignedTaskID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Description` text NOT NULL,
  `Date` date NOT NULL DEFAULT current_timestamp(),
  `Time` time NOT NULL DEFAULT current_timestamp(),
  `UserID` int(11) NOT NULL,
  `Status` varchar(50) NOT NULL DEFAULT 'Pending'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `assignedtasks`
--

INSERT INTO `assignedtasks` (`AssignedTaskID`, `Name`, `Description`, `Date`, `Time`, `UserID`, `Status`) VALUES
(1, 'Phase 4', 'Create interface of you project.', '2022-12-29', '00:00:00', 1, 'Pending'),
(3, 'Demo2', 'Improve Mistakes.', '2023-01-04', '03:30:00', 2, 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `dailyreport`
--

CREATE TABLE `dailyreport` (
  `ReportID` int(11) NOT NULL,
  `NoOfMembers` int(11) DEFAULT 0,
  `Title` varchar(50) NOT NULL,
  `Task` varchar(50) NOT NULL,
  `GroupID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dailyreport`
--

INSERT INTO `dailyreport` (`ReportID`, `NoOfMembers`, `Title`, `Task`, `GroupID`) VALUES
(1, NULL, 'Project\'s Phase 3', 'Not completed yet!', 1);

-- --------------------------------------------------------

--
-- Table structure for table `document`
--

CREATE TABLE `document` (
  `DocID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Category` varchar(50) NOT NULL,
  `Date` date DEFAULT current_timestamp(),
  `GroupID` int(11) DEFAULT NULL,
  `UserID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `document`
--

INSERT INTO `document` (`DocID`, `Name`, `Category`, `Date`, `GroupID`, `UserID`) VALUES
(1, 'Project\'s Github Repository', 'Project', '2022-12-16', NULL, 1),
(2, 'DBMS Project Document', 'Project', '2022-12-16', 1, NULL),
(3, 'https://classroom.google.com/u/0/c/NTQ3OTIyMTAwMzQ', 'Classroom Document', '2022-12-17', 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `groupmembers`
--

CREATE TABLE `groupmembers` (
  `GroupID` int(11) NOT NULL,
  `UserID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `groupmembers`
--

INSERT INTO `groupmembers` (`GroupID`, `UserID`) VALUES
(1, 1),
(2, 1),
(1, 3),
(1, 1),
(2, 2),
(2, 4),
(6, 1),
(1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `groups`
--

CREATE TABLE `groups` (
  `GroupID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Purpose` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `groups`
--

INSERT INTO `groups` (`GroupID`, `Name`, `Purpose`) VALUES
(1, 'Friendmily', 'Study Group'),
(2, 'Project', 'Project Disscussion'),
(6, 'SCD', 'Demonstration');

-- --------------------------------------------------------

--
-- Table structure for table `meetings`
--

CREATE TABLE `meetings` (
  `MeetingID` int(11) NOT NULL,
  `NoOfMembers` int(11) DEFAULT NULL,
  `Title` varchar(50) NOT NULL,
  `Time` time NOT NULL DEFAULT current_timestamp(),
  `Venue` varchar(50) DEFAULT '',
  `GroupID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `meetings`
--

INSERT INTO `meetings` (`MeetingID`, `NoOfMembers`, `Title`, `Time`, `Venue`, `GroupID`) VALUES
(1, NULL, 'OB Project', '00:00:00', 'A-Library', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tasks`
--

CREATE TABLE `tasks` (
  `TaskID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Date` date NOT NULL DEFAULT current_timestamp(),
  `Time` time NOT NULL DEFAULT current_timestamp(),
  `NoOfMembers` int(11) NOT NULL DEFAULT 1,
  `Status` varchar(50) NOT NULL DEFAULT 'Not Completed',
  `Type` varchar(50) NOT NULL DEFAULT 'Personal',
  `GroupID` int(11) DEFAULT NULL,
  `UserID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tasks`
--

INSERT INTO `tasks` (`TaskID`, `Name`, `Date`, `Time`, `NoOfMembers`, `Status`, `Type`, `GroupID`, `UserID`) VALUES
(1, 'No Work to do', '2022-12-18', '00:00:00', 1, 'Not Completed', 'Personal', 2, NULL),
(2, 'Project Submission', '2022-12-18', '11:44:13', 4, 'Phase 3 done', 'Group', 1, NULL),
(3, 'Project Phase 4', '2022-12-18', '12:00:00', 1, 'Start', 'Group', 6, 1),
(9, 'Demonstration', '2023-10-10', '09:00:00', 1, 'Not Completed', 'Personal', 1, NULL),
(10, 'Demonstration', '2023-10-10', '09:00:00', 1, 'Not Completed', 'Personal', 1, NULL),
(11, 'Practice', '2023-01-10', '09:00:00', 1, 'Not Completed', 'Personal', 2, NULL),
(12, 'Demonstration', '2023-10-10', '09:45:50', 1, 'Not Completed', 'Personal', 6, NULL),
(13, 'Demo input', '2023-10-10', '09:45:50', 1, 'Not Completed', 'Personal', 2, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `UserID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Email` varchar(70) NOT NULL,
  `MeetingID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`UserID`, `Name`, `Username`, `Email`, `MeetingID`) VALUES
(1, 'Iqra Jawaid', 'IJ_0021', 'sp21bsse0021@maju.edu.pk', 1),
(2, 'Mohammad Rafique', 'RJ_0037', 'sp21bsse0037@maju.edu.pk', 1),
(3, 'Mohammad Bilal', 'MB_0023', 'sp21bsse0023@maju.edu.pk', 1),
(4, 'Malaika Asad', 'MA_0026', 'sp21bsse0026@maju.edu.pk', 1),
(5, 'Hafiza Hafsa Ahmed', 'HHA_0020', 'sp21bsse0020@maju.edu.pk', 2),
(6, 'Sadaf Razzaq', 'SR_0024', 'sp21bsse0024@maju.edu.pk', 2),
(7, 'Geroge Wordsworth', 'GW_0001', 'GeorgeW@abc.com.pk', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `announcement`
--
ALTER TABLE `announcement`
  ADD PRIMARY KEY (`AnnounceID`);

--
-- Indexes for table `assignedtasks`
--
ALTER TABLE `assignedtasks`
  ADD PRIMARY KEY (`AssignedTaskID`);

--
-- Indexes for table `dailyreport`
--
ALTER TABLE `dailyreport`
  ADD PRIMARY KEY (`ReportID`);

--
-- Indexes for table `document`
--
ALTER TABLE `document`
  ADD PRIMARY KEY (`DocID`);

--
-- Indexes for table `groups`
--
ALTER TABLE `groups`
  ADD PRIMARY KEY (`GroupID`),
  ADD UNIQUE KEY `Name` (`Name`);

--
-- Indexes for table `meetings`
--
ALTER TABLE `meetings`
  ADD PRIMARY KEY (`MeetingID`);

--
-- Indexes for table `tasks`
--
ALTER TABLE `tasks`
  ADD PRIMARY KEY (`TaskID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`UserID`),
  ADD UNIQUE KEY `Username` (`Username`),
  ADD UNIQUE KEY `Email` (`Email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `announcement`
--
ALTER TABLE `announcement`
  MODIFY `AnnounceID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `assignedtasks`
--
ALTER TABLE `assignedtasks`
  MODIFY `AssignedTaskID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `dailyreport`
--
ALTER TABLE `dailyreport`
  MODIFY `ReportID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `document`
--
ALTER TABLE `document`
  MODIFY `DocID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `groups`
--
ALTER TABLE `groups`
  MODIFY `GroupID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `meetings`
--
ALTER TABLE `meetings`
  MODIFY `MeetingID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tasks`
--
ALTER TABLE `tasks`
  MODIFY `TaskID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
