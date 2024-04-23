-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-04-2024 a las 17:40:14
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `la_pasteleria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encargo`
--

CREATE TABLE `encargo` (
  `Id_encargo` int(10) NOT NULL,
  `FechaPedido` varchar(40) NOT NULL,
  `FechaEntrega` varchar(40) NOT NULL,
  `Descripcion` text NOT NULL,
  `Precio` int(11) NOT NULL,
  `Abono` int(11) NOT NULL,
  `SaldoPendiente` int(11) NOT NULL,
  `Estado` varchar(40) NOT NULL,
  `persona_Id` int(10) NOT NULL,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `encargo`
--

INSERT INTO `encargo` (`Id_encargo`, `FechaPedido`, `FechaEntrega`, `Descripcion`, `Precio`, `Abono`, `SaldoPendiente`, `Estado`, `persona_Id`, `id_usuario`) VALUES
(1, '2024-04-22', '2024-05-05', 'Pastel de chocolate y vainilla, con decoración de flores de azúcar', 80000, 20000, 60000, 'En espera', 1034569123, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `ID_persona` int(10) NOT NULL,
  `Nombre` varchar(40) NOT NULL,
  `Apellido` varchar(40) NOT NULL,
  `Telefono` varchar(15) NOT NULL,
  `Email` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`ID_persona`, `Nombre`, `Apellido`, `Telefono`, `Email`) VALUES
(25170237, 'Coni', 'Morales', '35041628', 'coni@gmail.com'),
(1034569123, 'Emily', 'Montes', '3205047641', 'emily@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `ID_reserva` int(10) NOT NULL,
  `persona_id` int(10) NOT NULL,
  `FechaReserva` varchar(40) NOT NULL,
  `Zona` int(11) NOT NULL,
  `horaReserva` varchar(10) NOT NULL,
  `Anexos` text NOT NULL,
  `Precio` int(11) NOT NULL,
  `Abono` int(11) NOT NULL,
  `SaldoPendiente` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`ID_reserva`, `persona_id`, `FechaReserva`, `Zona`, `horaReserva`, `Anexos`, `Precio`, `Abono`, `SaldoPendiente`, `id_usuario`) VALUES
(1, 25170237, '2024-04-29', 1, '14:00', 'Reserva del salón para evento de cumpleaños, con 40 personas, decoraciones y comidas reservadas', 120000, 20000, 100000, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `IdUsuario` int(11) NOT NULL,
  `contraseña` varchar(40) NOT NULL,
  `cargo` varchar(40) NOT NULL,
  `Nombre` varchar(40) NOT NULL,
  `Apellido` varchar(40) NOT NULL,
  `Telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`IdUsuario`, `contraseña`, `cargo`, `Nombre`, `Apellido`, `Telefono`) VALUES
(1, 'Fabio#1234', 'Recepcionista', 'Fabio', 'Arango', 321654987),
(2, 'Valentina#4321', 'Chef', 'Valentina', 'Gonzalez', 315468921),
(3, 'Jordy#0987', 'Recepcionista', 'Jordy', 'Arias', 314469552);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `zonas`
--

CREATE TABLE `zonas` (
  `idZonas` int(11) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `descripcion` text NOT NULL,
  `estado` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `zonas`
--

INSERT INTO `zonas` (`idZonas`, `nombre`, `descripcion`, `estado`) VALUES
(1, 'Salón Principal', 'salón con capacidad de 20 mesas, funcional para eventos especiales', 'Activo'),
(2, 'salón con piscina', 'salón con capacidad de 10 mesas, acceso al puente y vista a la piscina', 'Activo'),
(3, 'Segundo piso', 'segundo piso con capacidad de 30 mesas, y funcional para reuniones', 'Activo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `encargo`
--
ALTER TABLE `encargo`
  ADD PRIMARY KEY (`Id_encargo`),
  ADD KEY `persona_Id` (`persona_Id`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`ID_persona`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`ID_reserva`),
  ADD KEY `persona_id` (`persona_id`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `Zona` (`Zona`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`IdUsuario`);

--
-- Indices de la tabla `zonas`
--
ALTER TABLE `zonas`
  ADD PRIMARY KEY (`idZonas`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `encargo`
--
ALTER TABLE `encargo`
  MODIFY `Id_encargo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `ID_persona` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1034569124;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `ID_reserva` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `IdUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `zonas`
--
ALTER TABLE `zonas`
  MODIFY `idZonas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `encargo`
--
ALTER TABLE `encargo`
  ADD CONSTRAINT `encargo_ibfk_1` FOREIGN KEY (`persona_Id`) REFERENCES `persona` (`ID_persona`) ON UPDATE CASCADE,
  ADD CONSTRAINT `encargo_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`IdUsuario`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`ID_persona`) ON UPDATE CASCADE,
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`IdUsuario`) ON UPDATE CASCADE,
  ADD CONSTRAINT `reserva_ibfk_3` FOREIGN KEY (`Zona`) REFERENCES `zonas` (`idZonas`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
