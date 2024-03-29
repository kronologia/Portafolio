USE [master]
GO
/****** Object:  Database [mydbpokemon]    Script Date: 29-05-2023 17:09:44 ******/
CREATE DATABASE [mydbpokemon]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'mydbpokemon', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\mydbpokemon.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'mydbpokemon_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\mydbpokemon_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [mydbpokemon] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [mydbpokemon].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [mydbpokemon] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [mydbpokemon] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [mydbpokemon] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [mydbpokemon] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [mydbpokemon] SET ARITHABORT OFF 
GO
ALTER DATABASE [mydbpokemon] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [mydbpokemon] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [mydbpokemon] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [mydbpokemon] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [mydbpokemon] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [mydbpokemon] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [mydbpokemon] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [mydbpokemon] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [mydbpokemon] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [mydbpokemon] SET  DISABLE_BROKER 
GO
ALTER DATABASE [mydbpokemon] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [mydbpokemon] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [mydbpokemon] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [mydbpokemon] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [mydbpokemon] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [mydbpokemon] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [mydbpokemon] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [mydbpokemon] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [mydbpokemon] SET  MULTI_USER 
GO
ALTER DATABASE [mydbpokemon] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [mydbpokemon] SET DB_CHAINING OFF 
GO
ALTER DATABASE [mydbpokemon] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [mydbpokemon] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [mydbpokemon] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [mydbpokemon] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [mydbpokemon] SET QUERY_STORE = OFF
GO
USE [mydbpokemon]
GO
/****** Object:  Table [dbo].[condicion_evolucion_pokemon]    Script Date: 29-05-2023 17:09:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[condicion_evolucion_pokemon](
	[cod_evolucion_pokemon] [int] IDENTITY(1,1) NOT NULL,
	[evolucion_por_experiencia] [smallint] NOT NULL,
	[megavolucion] [smallint] NOT NULL,
	[evolucion_por_objeto] [smallint] NOT NULL,
 CONSTRAINT [PK_condicion_evolucion_pokemon] PRIMARY KEY CLUSTERED 
(
	[cod_evolucion_pokemon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[pokemon]    Script Date: 29-05-2023 17:09:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[pokemon](
	[cod_pokemon] [int] IDENTITY(1,1) NOT NULL,
	[nombre_pokemon] [varchar](25) NOT NULL,
	[punto_salud] [int] NOT NULL,
	[punto_ataque] [int] NOT NULL,
	[punto_defensa] [int] NOT NULL,
	[punto_velocidad] [int] NOT NULL,
	[habilidad_secreta] [smallint] NOT NULL,
 CONSTRAINT [PK_pokemon] PRIMARY KEY CLUSTERED 
(
	[cod_pokemon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[pokemon_condicion_evolucion_pokemon]    Script Date: 29-05-2023 17:09:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[pokemon_condicion_evolucion_pokemon](
	[cod_pokemon] [int] NOT NULL,
	[cod_evolucion_pokemon] [int] IDENTITY(1,1) NOT NULL,
 CONSTRAINT [PK_pokemon_condicion_evolucion_pokemon] PRIMARY KEY CLUSTERED 
(
	[cod_pokemon] ASC,
	[cod_evolucion_pokemon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[pokemon_tipo_pokemon]    Script Date: 29-05-2023 17:09:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[pokemon_tipo_pokemon](
	[cod_pokemon] [int] NOT NULL,
	[cod_tipo_pokemon] [int] IDENTITY(1,1) NOT NULL,
	[doble_tipo] [smallint] NOT NULL,
	[legendario] [smallint] NOT NULL,
 CONSTRAINT [PK_pokemon_tipo_pokemon] PRIMARY KEY CLUSTERED 
(
	[cod_pokemon] ASC,
	[cod_tipo_pokemon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[region]    Script Date: 29-05-2023 17:09:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[region](
	[cod_region] [int] IDENTITY(1,1) NOT NULL,
	[desc_region] [varchar](20) NOT NULL,
 CONSTRAINT [PK_region] PRIMARY KEY CLUSTERED 
(
	[cod_region] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[region_pokemon]    Script Date: 29-05-2023 17:09:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[region_pokemon](
	[cod_pokemon] [int] NOT NULL,
	[cod_region] [int] IDENTITY(1,1) NOT NULL,
	[version_regional] [smallint] NOT NULL,
 CONSTRAINT [PK_region_pokemon] PRIMARY KEY CLUSTERED 
(
	[cod_pokemon] ASC,
	[cod_region] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tipo_pokemon]    Script Date: 29-05-2023 17:09:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tipo_pokemon](
	[cod_tipo_pokemon] [int] IDENTITY(1,1) NOT NULL,
	[des_tipo_pokemon] [varchar](50) NOT NULL,
 CONSTRAINT [PK_tipo_pokemon] PRIMARY KEY CLUSTERED 
(
	[cod_tipo_pokemon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[pokemon_condicion_evolucion_pokemon]  WITH CHECK ADD  CONSTRAINT [FK_pokemon_condicion_evolucion_pokemon_condicion_evolucion_pokemon] FOREIGN KEY([cod_evolucion_pokemon])
REFERENCES [dbo].[condicion_evolucion_pokemon] ([cod_evolucion_pokemon])
GO
ALTER TABLE [dbo].[pokemon_condicion_evolucion_pokemon] CHECK CONSTRAINT [FK_pokemon_condicion_evolucion_pokemon_condicion_evolucion_pokemon]
GO
ALTER TABLE [dbo].[pokemon_condicion_evolucion_pokemon]  WITH CHECK ADD  CONSTRAINT [FK_pokemon_condicion_evolucion_pokemon_pokemon] FOREIGN KEY([cod_pokemon])
REFERENCES [dbo].[pokemon] ([cod_pokemon])
GO
ALTER TABLE [dbo].[pokemon_condicion_evolucion_pokemon] CHECK CONSTRAINT [FK_pokemon_condicion_evolucion_pokemon_pokemon]
GO
ALTER TABLE [dbo].[pokemon_tipo_pokemon]  WITH CHECK ADD  CONSTRAINT [FK_pokemon_tipo_pokemon_pokemon] FOREIGN KEY([cod_pokemon])
REFERENCES [dbo].[pokemon] ([cod_pokemon])
GO
ALTER TABLE [dbo].[pokemon_tipo_pokemon] CHECK CONSTRAINT [FK_pokemon_tipo_pokemon_pokemon]
GO
ALTER TABLE [dbo].[pokemon_tipo_pokemon]  WITH CHECK ADD  CONSTRAINT [FK_pokemon_tipo_pokemon_tipo_pokemon] FOREIGN KEY([cod_tipo_pokemon])
REFERENCES [dbo].[tipo_pokemon] ([cod_tipo_pokemon])
GO
ALTER TABLE [dbo].[pokemon_tipo_pokemon] CHECK CONSTRAINT [FK_pokemon_tipo_pokemon_tipo_pokemon]
GO
ALTER TABLE [dbo].[region_pokemon]  WITH CHECK ADD  CONSTRAINT [FK_region_pokemon_pokemon] FOREIGN KEY([cod_pokemon])
REFERENCES [dbo].[pokemon] ([cod_pokemon])
GO
ALTER TABLE [dbo].[region_pokemon] CHECK CONSTRAINT [FK_region_pokemon_pokemon]
GO
ALTER TABLE [dbo].[region_pokemon]  WITH CHECK ADD  CONSTRAINT [FK_region_pokemon_region] FOREIGN KEY([cod_region])
REFERENCES [dbo].[region] ([cod_region])
GO
ALTER TABLE [dbo].[region_pokemon] CHECK CONSTRAINT [FK_region_pokemon_region]
GO
USE [master]
GO
ALTER DATABASE [mydbpokemon] SET  READ_WRITE 
GO
