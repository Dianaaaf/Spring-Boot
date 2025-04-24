SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

CREATE DATABASE IF NOT EXISTS `avaliacao01_dianaalves` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `avaliacao01_dianaalves`;

DROP TABLE IF EXISTS `autor`;
CREATE TABLE `autor` (
  `id` bigint(20) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `nacionalidade` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `autor` (`id`, `nome`, `nacionalidade`) VALUES
(1, 'Machado de Assis', 'Brasileiro'),
(2, 'J.K. Rowling', 'Britânica');

DROP TABLE IF EXISTS `livro`;
CREATE TABLE `livro` (
  `id` bigint(20) NOT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `genero` varchar(100) DEFAULT NULL,
  `autor_id` bigint(20) DEFAULT NULL,
  `ano_publicacao` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `livro` (`id`, `titulo`, `genero`, `autor_id`, `ano_publicacao`) VALUES
(1, 'Dom Casmurro', 'Romance', 1, NULL),
(2, 'Memórias Póstumas de Brás Cubas', 'Romance', 1, NULL),
(3, 'Harry Potter e a Pedra Filosofal', 'Fantasia', 2, NULL);


ALTER TABLE `autor`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `livro`
  ADD PRIMARY KEY (`id`),
  ADD KEY `autor_id` (`autor_id`);


ALTER TABLE `autor`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `livro`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;


ALTER TABLE `livro`
  ADD CONSTRAINT `livro_ibfk_1` FOREIGN KEY (`autor_id`) REFERENCES `autor` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
