/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dbfastbuy` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `dbfastbuy`;

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `nombres` varchar(20) NOT NULL,
  `apellidos` varchar(20) NOT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `cedula` varchar(10) NOT NULL,
  `edad` varchar(3) DEFAULT NULL,
  `nombreTienda` varchar(20) DEFAULT NULL,
  `ruc` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `usuario` VALUES ('Minerva','Cremin','0969920249','0913482126',NULL,'Proactive mission-cr','19264655443'),
('Randal','Tremblay','0912401398','0913771172',NULL,'Seamless multi-taski','19179816383'),
('Wilburn','Runte','0819473829','0917616009',NULL,'Phased responsive ci','19577719688'),
('Arlie','Botsford','0809082145','0918283435',NULL,'Reverse-engineered o','19816474395'),
('Tabitha','Bahringer','844041242','921036309',NULL,'Multi-channelled ter','19098398373'),
('Brayan','Luettgen','0817623859','0921077992',NULL,'Future-proofed high-','19857968100'),
('Vivien','Weber','0894943019','0924372095',NULL,'Advanced cohesive mo','19929154646'),
('Roxane','Kuhlman','0989202427','0926554035',NULL,'Ameliorated transiti','19990378646'),
('Lew','Altenwerth','0983706898','0929649852',NULL,'Future-proofed globa','19014148287'),
('Emery','Bode','0849843322','0937617646',NULL,'Persevering exuding ','19861691320'),
('Jordan','Fadel','0913346309','0918880938','',NULL,NULL),
('Ericka','Murray','0816671582','0919574040','46',NULL,NULL),
('Cristian','Jones','0874726546','0923195579','72',NULL,NULL),
('Alvina','Corwin','0875703664','0929547770','',NULL,NULL),
('Celia','Howell','0841331417','0932660367','',NULL,NULL),
('Laron','Kris','0813441465','0934264915','',NULL,NULL),
('Kole','Pacocha','0861542384','0936981674','30',NULL,NULL),
('Lora','Kertzmann','0934026171','0938248440','75',NULL,NULL),
('Bernadette','Franecki','0892026708','0951872540','54',NULL,NULL),
('Kariane','Leffler','0841234467','0952556931','38',NULL,NULL);


/*Table structure for table `cuenta` */

DROP TABLE IF EXISTS `cuenta`;

CREATE TABLE `cuenta` (
  `idCuenta` int(5) auto_increment,
  `tipo` char(1) NOT NULL,
  `usuario` varchar(10) NOT NULL,
  `correo` varchar(200) NOT NULL,
  `contraseña` varchar(12) NOT NULL,
  PRIMARY KEY (`idCuenta`),
  KEY `usuario` (`usuario`),
  CONSTRAINT `cuenta_fk_1` FOREIGN KEY (`usuario`) REFERENCES `usuario` (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO cuenta(tipo,usuario,correo,contraseña) VALUES ('V','0924372095','rrau@hotmail.com','as35d435'),
('V','0926554035','harris.sage@yahoo.com','sdf3cv5454'),
('V','0938248440','stoy@gmail.com','asd43as5'),
('V','0921077992','areilly@gmail.com','a5c2w4a3'),
('V','0923195579','kian.reilly@yahoo.com','a8f3ax9c1'),
('V','0918880938','keegan94@hotmail.com','asex53A4d1'),
('V','0932660367','hkulas@yahoo.com','asf54215'),
('V','0919574040','medhurst.ashlynn@yahoo.com','rvx3521'),
('V','0929547770','ugoodwin@yahoo.com','ewg54x3'),
('V','0921036309','bartholome.strosin@gmail.com','ethvb354'),
('C','0936981674','lgottlieb@yahoo.com','sd4g562'),
('C','0934264915','jeremie23@gmail.com','sd4f24'),
('C','0951872540','edwina.renner@hotmail.com','s42465'),
('C','0952556931','zkeeling@yahoo.com','asf421'),
('C','0937617646','jfranecki@yahoo.com','er2t147'),
('C','0929649852','collins.virgil@hotmail.com','we2r42'),
('C','0918283435','jast.eldora@yahoo.com','ruy45412'),
('C','0913771172','ulueilwitz@yahoo.com','ergfdv4'),
('C','0913482126','fbotsford@gmail.com','n24n542'),
('C','0917616009','greenfelder.kennedy@hotmail.com','bhf553'); 

/*Table structure for table `ubicacion` */

DROP TABLE IF EXISTS `ubicacion`;

CREATE TABLE `ubicacion` (
  `id_ubicacion` char(10) NOT NULL,
  `pais` varchar(20) NOT NULL,
  `cuidad` varchar(20) NOT NULL,
  `sector` varchar(15) DEFAULT NULL,
  `calle` varchar(15) DEFAULT NULL,
  `manzana` varchar(4) DEFAULT NULL,
  `villa` varchar(4) DEFAULT NULL,
  `codigo_postal` varchar(6) DEFAULT NULL,
  `cedula` varchar(10) NOT NULL,
  PRIMARY KEY (`id_ubicacion`),
  KEY `cedula` (`cedula`),
  CONSTRAINT `ubic_fk_1` FOREIGN KEY (`cedula`) REFERENCES `usuario` (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `ubicacion` VALUES ('1320','Jersey','North Theo','Manor','Lora Mills','181','996','72154-','921036309'),
('1577','Burundi','Ardenchester','Squares','Hills Pass','177','981','46729-','0918283435'),
('1626','Honduras','Gilesshire','Rapids','Zulauf Port','860','659','80556','0938248440'),
('1763','Marshall Islands','South Bethanyfort','Estates','Evalyn Junction','764','977','86578-','0923195579'),
('3471','Guinea-Bissau','Lake Stuartchester','Cape','Jaida Pines','285','531','94972','0951872540'),
('4130','Pakistan','Elodymouth','Crest','Boyle Course','965','143','14822-','0934264915'),
('4846','Niger','North Serenity','Rest','Mitchell Ridges','113','457','81385-','0929547770'),
('5563','Uzbekistan','New Dovieside','Stream','Newell Dam','610','498','51876-','0913482126'),
('5735','Portugal','Aufderharmouth','Crossroad','Windler Via','403','796','95598-','0918880938'),
('6378','Guinea','Runolfssonfort','Pines','Adeline Way','257','148','40172-','0926554035'),
('6645','Qatar','Faheyside','Extensions','Bettie Trail','877','89','02006','0924372095'),
('6900','Puerto Rico','South Dorotheabury','Point','Lindsey River','981','809','10030-','0952556931'),
('7022','French Polynesia','Lake Durwardchester','River','Daugherty Stati','944','972','89279-','0921077992'),
('7076','Turkmenistan','South Brayanmouth','Plain','Boyle Trail','533','630','29112-','0929649852'),
('7853','Ecuador','Port Alanis','Ramp','Lynch Brooks','151','714','52263-','0936981674'),
('8075','Venezuela','North Felix','Drive','Estelle Parks','648','868','17829-','0919574040'),
('8608','Cyprus','New Jarrodborough','Lodge','Jadon Landing','344','871','72019','0937617646'),
('8768','Kazakhstan','Kristinaburgh','Burg','Doyle Valleys','202','900','94283-','0917616009'),
('9251','Vietnam','Port Holden','Burg','Kihn Shore','514','944','82864','0932660367'),
('9320','Sao Tome and Princip','North Kiley','Crossing','Okuneva Through','870','908','30588','0913771172'); 


/*Table structure for table `tarjeta` */

DROP TABLE IF EXISTS `tarjeta`;

CREATE TABLE `tarjeta` (
  `numTarjeta` char(16) NOT NULL,
  `fechaExp` varchar(5) NOT NULL,
  `CVS` varchar(3) NOT NULL,
  `banco` varchar(20) NULL,
  `tipoPago` char(1) NOT NULL,
  `cedula` char(10) NOT NULL,
  PRIMARY KEY (`numTarjeta`),
  KEY `cedula` (`cedula`),
  CONSTRAINT `tarj_fk_1` FOREIGN KEY (`cedula`) REFERENCES `usuario` (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `tarjeta` VALUES ('1133328018089135','05-20','365','Realigned 24hour all','D','921036309'),
('1289290193882253','07-20','623','User-friendly local ','C','0923195579'),
('1410609239505396','02-22','512','Switchable responsiv','D','0923195579'),
('1497331928047868','09-21','856','Balanced optimizing ','D','0913482126'),
('1656269911262724','02-20','512','Switchable zerodefec','D','0918283435'),
('1698427394860320','06-21','517','Cross-platform dedic','C','0932660367'),
('1727790625558959','05-22','136','Object-based recipro','D','0952556931'),
('2035435661673545','04-20','258','Organized scalable s','C','0921077992'),
('2085440696941481','08-21','789','Expanded intangible ','D','0918880938'),
('2114256330662303','06-20','125','Fully-configurable d','C','0913771172'),
('2192771426505512','01-22','142','Programmable cohesiv','C','0932660367'),
('2196313006182511','03-23','136','Integrated contextua','D','0913482126'),
('2294353610939449','05-23','259','Total motivating bud','C','0924372095'),
('2434109101692835','05-23','136','Grass-roots zeroadmi','D','0917616009');
/*Table structure for table `categoria` */
DROP TABLE IF EXISTS `categoria`;

CREATE TABLE `categoria` (
  `idCategoria` char(5) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `descripcion` varchar(200) default NULL,
  PRIMARY KEY (`idCategoria`)
 ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 
INSERT INTO `categoria` VALUES ('001','Computadoras','Computadoras a los mejores precios'),
('002','Tablets',NULL),('003','Perefericos', 'Impresoras, Monitores y mucho mas');

 
/*Table structure for table `tipoProducto` */
DROP TABLE IF EXISTS `tipoProducto`;

CREATE TABLE `tipoProducto` (
  `idTipoProducto` char(5) NOT NULL,
  `idCategoria` char(5) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  PRIMARY KEY (`idTipoProducto`,`idCategoria` ),
  KEY (`idCategoria`) ,
  CONSTRAINT `tipoP_fk_1` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`)

 ) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `tipoProducto` VALUES ('001','001','repuestos de computadora'),
('002','001','accesorios para computadora'),
('003','001','accesorios para computadoras portatiles'),
('004','003','impresoras'),
('005','003','escaneres'),
('006','003','monitores'),
('007','003','servidores'),
('008','002','respuestos para tablets'),
('009','002','accesorios para tablets'),
('010','003','componentes de almacenamiento'),
('011','001','Computadora portatil'),
('012','001','Computadora de escritorio'),
('013','002','tablets');



/*Table structure for table `producto` */
DROP TABLE IF EXISTS `producto`;

CREATE TABLE `producto` (
  `idProducto` char(10) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `precio` double NOT NULL,
  `cantidad` integer NOT NULL,
  `idTipoProducto` char(5) NOT NULL,
  `idCategoria` char(5) NOT NULL,
  `idVendedor` char(10) NOT NULL,
  PRIMARY KEY (`idProducto`),
  KEY `idVendedor` (`idVendedor`),KEY `idTipoProducto` (`idTipoProducto`),KEY `idCategoria` (`idCategoria`),  
  CONSTRAINT `prod_fk_1` FOREIGN KEY (`idVendedor`) REFERENCES `usuario` (`cedula`),
  CONSTRAINT `prod_fk_2` FOREIGN KEY (`idTipoProducto`) REFERENCES `tipoProducto` (`idTipoProducto`),
  CONSTRAINT `prod_fk_3` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `producto` VALUES ('001','memoria ram 4gb',30.00,3,'001','001','0937617646'),
('002','memoria ram 8gb',40.00,2,'001','001','0917616009'),
('003','memoria ram 8gb',44.00,1,'011','001','0924372095'),
('004','teclado para laptop',18.00,5,'011','001','0917616009'),
('005','audifonos gamer',18.99,3,'002','001','0921077992'),
('006','cargador original toshiba',24.99,2,'002','001','0937617646'),
('007','mouse inalambrico',9.99,1,'003','001','0913482126'),
('008','plotter hp',989.99,5,'004','003','0913771172'),
('009','scanner duplex',489.99,1,'005','003','0921077992'),
('010','monitor LG',85.99,2,'006','003','0929649852'),
('011','monitor LG',85.99,1,'006','003','0924372095'),
('012','computadora interCore i3',345.99,6,'007','003','0926554035'),
('013','computadora interCore i3',345.99,3,'007','003','0921077992'),
('014','samsung galaxy tab',169.9,2,'013','002','0913771172'),
('015','bateria lipo 3.7v',22.99,1,'008','002','0921077992'),
('016','estuche Ipad',17.59,3,'009','002','0918283435'),
('017','pendrive Kingston',5.25,2,'010','003','0913771172');



/*Table structure for table `foto` */
DROP TABLE IF EXISTS `foto`;

CREATE TABLE `foto` (
  `idFoto` int(5) auto_increment,
  `url` varchar(400) NOT NULL,
  `idProducto` char(10) NOT NULL,
  PRIMARY KEY (`idFoto`),
  KEY `idProducto` (`idProducto`),  
  CONSTRAINT `foto_fk_1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`)
 ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

insert into foto(url,idProducto) values ('\\ImagenesProductos\\001.jpg','001'),
('\\ImagenesProductos\\002.jpg','002'),
('\\ImagenesProductos\\003.jpg','003'),
('\\ImagenesProductos\\004.jpg','004'),
('\\ImagenesProductos\\005.jpg','005'),
('\\ImagenesProductos\\006.jpg','006'),
('\\ImagenesProductos\\007.jpg','007'),
('\\ImagenesProductos\\008.jpg','008'),
('\\ImagenesProductos\\009.jpg','009'),
('\\ImagenesProductos\\010.jpg','010'),
('\\ImagenesProductos\\011.jpg','011'),
('\\ImagenesProductos\\012.jpg','012'),
('\\ImagenesProductos\\013.jpg','013'),
('\\ImagenesProductos\\014.jpg','014'),
('\\ImagenesProductos\\015.jpg','015'),
('\\ImagenesProductos\\016.jpg','016'),
('\\ImagenesProductos\\017.jpg','017');

/*Table structure for table `orden_pedido` */

DROP TABLE IF EXISTS `orden_pedido`;

CREATE TABLE `orden_pedido` (
  `idOrden` char(10) NOT NULL,
  `nombreReceptor` varchar(50) default NULL,
  `total_pedido` double default NULL,
  `notas` varchar(15) default NULL,
  `estado` char(1) default NULL,
  `numTarjeta` char(16) NOT NULL,
  `cedula` char(10) NOT NULL,
  `fechaEntrega` date default NULL,
  `fechaEnvio` date default NULL,
  `id_ubicacion` char(10) NOT NULL,
  PRIMARY KEY (`idOrden`),
  KEY `cedula` (`cedula`),KEY `numTarjeta` (`numTarjeta`),KEY `ubicacion` (`id_ubicacion`),  
  CONSTRAINT `ordP_fk_1` FOREIGN KEY (`cedula`) REFERENCES `usuario` (`cedula`),
  CONSTRAINT `ordP_fk_2` FOREIGN KEY (`numTarjeta`) REFERENCES `tarjeta` (`numTarjeta`),
  CONSTRAINT `ordP_fk_3` FOREIGN KEY (`id_ubicacion`) REFERENCES `ubicacion` (`id_ubicacion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

insert into orden_pedido values ('001','alex',206.00,null,null,'1410609239505396','0923195579',null,null,'1763');


/*Table structure for table `orden_detalle` */

DROP TABLE IF EXISTS `orden_detalle`;

CREATE TABLE `orden_detalle` (
  `idOrdenD` char(10) NOT NULL,
  `cantProd` integer NOT NULL,
  `precioUnitario` double not NULL,
  `preciototal` double not NULL,
  `idOrden` char(10) NOT NULL,
  `idProd` char(10) NOT NULL,
  PRIMARY KEY (`idOrdenD`),
  KEY `idOrden` (`idOrden`),KEY `idProd` (`idProd`),  
  CONSTRAINT `ordD_fk_1` FOREIGN KEY (`idOrden`) REFERENCES `orden_pedido` (`idOrden`),
  CONSTRAINT `ordD_fk_2` FOREIGN KEY (`idProd`) REFERENCES `producto` (`idProducto`)
  ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

insert into orden_detalle values ('001',2,30.00,60.00,'001','001'), 
('002',1,40.00,40.00,'001','002'),
('003',2,44.00,88.00,'001','003'),
('004',1,18.00,18.00,'001','004');
/*Table structure for table `wishlist` */

DROP TABLE IF EXISTS `wishlist`;

CREATE TABLE `wishlist` (
  `idwish` char(10) NOT NULL,
  `idComprador` char(10) NOT NULL,
  PRIMARY KEY (`idwish`),
  KEY `idComprador` (`idComprador`),
  CONSTRAINT `wish_fk_1` FOREIGN KEY (`idComprador`) REFERENCES `usuario` (`cedula`)
  ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
  
INSERT INTO `wishlist` VALUES  ('7991','0918880938'),
('6325','0919574040'),
('3403','0923195579'),
('586','0929547770'),
('9362','0932660367'),
('3165','0934264915'),
('5183','0936981674'),
('1667','0938248440'),
('374','0951872540'),
('5178','0952556931');
/*Table structure for table `califica` */

DROP TABLE IF EXISTS `califica`;

CREATE TABLE `califica` (
  `idComprador` char(10) NOT NULL,
  `idVendedor` char(10) NOT NULL,
  `nota` integer default NULL,
  `comentario` varchar(400) default NULL,
  PRIMARY KEY (`idComprador`,`idVendedor`),
  KEY `idComprador` (`idComprador`),KEY `idVendedor` (`idVendedor`),
  CONSTRAINT `ev_fk_1` FOREIGN KEY (`idComprador`) REFERENCES `usuario` (`cedula`),
  CONSTRAINT `ev_fk_2` FOREIGN KEY (`idVendedor`) REFERENCES `usuario` (`cedula`)
  ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
  
/*Table structure for table `evalua` */

INSERT INTO `califica` VALUES ('0918880938','0918283435',4,null),
('0919574040','0921077992',5,'buen vendedor'),
('0923195579','0921077992',3,null),
('0929547770','0918283435',5,null),
('0932660367','0926554035',4, 'bien'),
('0934264915','0937617646',2,null),
('0936981674','0937617646',1, null),
('0938248440','0929649852',5,null),
('0951872540','0937617646',4,null),
('0952556931','0937617646',4,null);



DROP TABLE IF EXISTS `evalua`;

CREATE TABLE `evalua` (
  `idComprador` char(10) NOT NULL,
  `idProd` char(10) NOT NULL,
  `nota` integer default NULL,
  `comentario` varchar(400) default NULL,
  PRIMARY KEY (`idComprador`,`idProd`),
  KEY `idComprador` (`idComprador`),KEY `idProd` (`idProd`),
  CONSTRAINT `cal_fk_1` FOREIGN KEY (`idComprador`) REFERENCES `usuario` (`cedula`),
  CONSTRAINT `cal_fk_2` FOREIGN KEY (`idProd`) REFERENCES `producto` (`idProducto`)
  ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
  
INSERT INTO `evalua` VALUES ('0918880938',001,4,null),
('0919574040',001,5,'buen producto'),
('0923195579',005,3,null),
('0929547770',006,5,null),
('0932660367',007,4, 'bien'),
('0934264915',003,2,null),
('0936981674',002,1, 'No fue un buen producto'),
('0938248440',006,5,null),
('0951872540',008,4,null),
('0952556931',004,4,null);
  
  /*Table structure for table `conforma` */

DROP TABLE IF EXISTS `conforma`;

CREATE TABLE `conforma` (
  `idProd` char(10) NOT NULL,
  `idWish` char(10) not NULL,
  `cantidad` integer not NULL,
  PRIMARY KEY (`idWish`,`idProd`),
  KEY `idWish` (`idWish`),KEY `idProd` (`idProd`),
  CONSTRAINT `conf_fk_1` FOREIGN KEY (`idWish`) REFERENCES `wishlist` (`idwish`),
  CONSTRAINT `conf_fk_2` FOREIGN KEY (`idProd`) REFERENCES `producto` (`idProducto`)
  ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
  
 INSERT INTO `conforma` VALUES ('001','1667',3),
('011','1667',6),
('002','3165',5),
('012','3165',5),
('003','3403',1),
('013','3403',2),
('004','374',5),
('014','374',8),
('005','5178',3),
('015','5178',4),
('006','5183',1),
('016','5183',2),
('007','586',3),
('017','586',2),
('001','6325',2),
('008','6325',8),
('002','7991',4),
('009','7991',3),
('003','9362',1),
('010','9362',1); 




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

 
 
DROP PROCEDURE IF EXISTS REGISTRAR_USUARIO_COMPRADOR;
DELIMITER $
CREATE PROCEDURE REGISTRAR_USUARIO_COMPRADOR(IN cedula1 VARCHAR(10), IN nombres1 VARCHAR(40), IN apellidos1 VARCHAR(40),IN tipoUsuario1 CHAR(1), IN edad1 VARCHAR(3), IN telefono1 VARCHAR(10),IN correo1 VARCHAR(200), IN contraseña1 VARCHAR(12))
	BEGIN
		IF NOT EXISTS (select usuario,tipo from cuenta where usuario = cedula1 and tipo = tipoUsuario1) THEN
			INSERT INTO usuario(cedula,nombres,apellidos,edad,telefono) VALUES (cedula1,nombres1,apellidos1,edad1,telefono1);
            INSERT INTO cuenta(tipo,usuario,correo,contraseña) VALUES (tipoUsuario1,cedula1,correo1,contraseña1);
		END IF;
	END$
DELIMITER ;

DROP PROCEDURE IF EXISTS REGISTRAR_USUARIO_VENDEDOR;
DELIMITER $
CREATE PROCEDURE REGISTRAR_USUARIO_VENDEDOR(IN cedula1 VARCHAR(10), IN nombres1 VARCHAR(40), IN apellidos1 VARCHAR(40),IN tipoUsuario1 CHAR(1),IN nombreTienda1 VARCHAR(20),IN telefono1 VARCHAR(10),IN ruc1 VARCHAR(11),IN correo1 VARCHAR(200), IN contraseña1 VARCHAR(12))
	BEGIN
		IF NOT EXISTS (select usuario,tipo from cuenta where usuario = cedula1 and tipo = tipoUsuario1) THEN
			INSERT INTO usuario(cedula,nombres,apellidos,nombreTienda,telefono,ruc) VALUES (cedula1,nombres1,apellidos1,edad1,telefono1);
            INSERT INTO cuenta(tipo,usuario,correo,contraseña) VALUES (tipoUsuario1,cedula1,correo1,contraseña1);
		END IF;
	END$
DELIMITER ;

#Indice para ordenar los usuario por apellido y nombre
CREATE INDEX usuarioAlfabetico ON usuario(apellidos,nombres);

DROP TRIGGER IF EXISTS CONTROLAR_STOCK;
DELIMITER $
CREATE TRIGGER CONTROLAR_STOCK 
AFTER INSERT ON orden_detalle 
FOR EACH ROW
	BEGIN
		DECLARE cant INT;
	    SET cant = (SELECT cantProd FROM orden_detalle ORDER BY idOrdenD DESC LIMIT 1);
		IF cant >=1 THEN 
			UPDATE producto SET cantidad = (cantidad - cant) WHERE idProducto = (SELECT idProd FROM orden_detalle ORDER BY idOrdenD DESC LIMIT 1);
	    END IF;
END$
DELIMITER ;


DROP PROCEDURE IF EXISTS AGREGARPRODUCTO;

DELIMITER $
CREATE PROCEDURE AGREGARPRODUCTO(IN nombreP VARCHAR(200), IN precioP double, 
IN cant int,IN tipoprod varchar(100),IN nombreC varCHAR(100),
IN cedulaVend CHAR(10))
	BEGIN
    DECLARE idP char(10);
    DECLARE tipoP varchar(100);
    DECLARE catP varchar(100);
	select CAST(FLOOR(RAND()*(999-1)+1) AS char(5)) into idP;
    select tp.idTipoProducto INTO tipoP from tipoproducto tp where tp.nombre=tipoprod;
    select idCategoria INTO catP from categoria where nombre=nombreC;
		IF EXISTS (select u.cedula from usuario u join producto p on u.cedula=p.idVendedor where u.cedula=cedulaVend)
        THEN        
            INSERT INTO producto VALUES (idP,nombreP,precioP,cant,tipoP,catP,cedulaVend);
		        END IF;
        	END$
DELIMITER ;


DROP PROCEDURE IF EXISTS ELIMINAR_PROD;
DELIMITER $
CREATE PROCEDURE ELIMINAR_PROD(IN idProd CHAR(50))
	BEGIN
		DELETE FROM producto WHERE idProducto = idProd;
	END$
DELIMITER ;

DROP PROCEDURE IF EXISTS BUSCAR_CUENTA;
DELIMITER $
CREATE PROCEDURE BUSCAR_CUENTA(IN correo1 varchar(200),out contraseña1 varchar(12) , out tipo1 char(1),out existe char(1),out usuario1 varchar(10))
	BEGIN
		IF EXISTS (SELECT tipo,usuario,correo,contraseña from cuenta where correo = correo1) THEN
			SELECT contraseña from cuenta where correo = correo1 into contraseña1;
            SELECT tipo from cuenta where correo = correo1 into tipo1;
            set existe = '1';
            SELECT usuario from cuenta where correo = correo1 into usuario1;
		ELSE
			set tipo1 = '0';
			set existe = '0';
            set contraseña1 = '0';
            set usuario1 = '0';
        END IF;
    END$

DELIMITER ;

DROP PROCEDURE IF EXISTS obtenerWishlist;
DELIMITER $

CREATE PROCEDURE obtenerWishlist(in cedulaC VARCHAR(10))
begin 
select p.idProducto, p.nombre, c.cantidad from conforma c join producto p on c.idProd=p.idProducto 
			join wishlist w on c.idWish=w.idwish where w.idComprador=cedulaC;/*7991*/
end$
DELIMITER ;

call obtenerWishList('0918880938');


DROP PROCEDURE IF EXISTS BUSCAR_USUARIO_DEVUELVE_NOMBRE;
DELIMITER $
CREATE PROCEDURE BUSCAR_USUARIO_DEVUELVE_NOMBRE(IN cedula1 varchar(10), out nombres1 varchar(20))
	BEGIN
		IF exists (SELECT nombres,apellidos,cedula from usuario where cedula = cedula1) THEN
            SELECT nombres from usuario where cedula = cedula1 into nombres1;
        END IF;
    END$
DELIMITER ;



drop procedure añadirProductoWishlist;
delimiter $
CREATE PROCEDURE añadirProductoWishlist(in cedulaC VARCHAR(10), in idProd char(5), in cant int) 
begin
declare idw char(5);
select distinct w.idwish into idw from conforma c join producto p on c.idProd=p.idProducto 
			join wishlist w on c.idWish=w.idwish where w.idComprador=cedulaC;            
IF EXISTS(select p.idProducto from producto p ) THEN
INSERT INTO conforma(idProd,idWish,cantidad) VALUES (idprod,idw,cant);
            END IF;
END$
DELIMITER ;



drop procedure if exists anadirOrdenD;
delimiter $
create procedure anadirOrdenD(in cantp int, in idProd char(5),in idOrden char(5))
begin
declare precioT double;
declare precioP double;
declare idO char(5);
select precio from producto where idProducto=idProd into precioP;
SET precioT=precioP*cantp;
select CAST(FLOOR(RAND()*(999-1)+1) AS char(5)) into idO;
		IF NOT EXISTS (select idOrdenD from orden_detalle where idOrdenD=idO)
        then insert into orden_detalle values(idO,cantp,precioP,precioT,idOrden,idProd);
	end if;
    end $
delimiter ;

drop procedure if exists eliminarCuenta;
delimiter $
create procedure eliminarCuenta(cedulaU varchar(10))
begin 
DELETE FROM cuenta WHERE usuario = cedulaU;
   end $
delimiter ;

DROP PROCEDURE IF EXISTS BUSCAR_FOTO;
DELIMITER $
CREATE PROCEDURE BUSCAR_FOTO(IN idProducto1 char(10),out url1 varchar(400))
	BEGIN
		IF EXISTS (SELECT url,idProducto from foto where idProducto = idProducto1) THEN
			SELECT url from foto where idProducto = idProducto1 into url1;
        END IF;
    END$
DELIMITER ;
 

 /*procedure que se utilizara al dar clic en comprar*/
drop procedure if exists crearOrdenP;
delimiter $
create procedure crearOrdenP(in numT char(16), in ced varchar(10), in ubi char(5))
begin
declare idO char(5);
select CAST(FLOOR(RAND()*(999-1)+1) AS char(5)) into idO;
		IF NOT EXISTS (select idOrden from orden_pedido where idOrden=idO) 
        and exists(select numTarjeta from tarjeta where tarjeta.cedula=ced and numTarjeta=numT)
        then insert into orden_pedido(idOrden,nombreReceptor,total_pedido,notas,estado,
										numTarjeta,cedula,fechaEntrega,fechaEnvio,id_ubicacion ) 
        values(idO,NULL,NULL,NULL,NULL,numT,ced,NULL,NULL,ubi) ;
	end if;
	
    end $
delimiter ;


DROP PROCEDURE IF EXISTS agregarUbicacion;
delimiter $   
CREATE PROCEDURE agregarUbicacion(in pais varchar(50),in ciudad varchar(20), in sector varchar(15),
					in calle varchar(15), in manzana varchar(4),in villa varchar(4),in codigo_postal varchar(6),                   
                    in cedula varchar(10))
begin
declare idU char(5);
select CAST(FLOOR(RAND()*(999-1)+1) AS char(5)) into idU;
    IF NOT EXISTS(select u.id_ubicacion from ubicacion u where u.id_ubicacion=idU) THEN
INSERT INTO ubicacion  VALUES (idU, pais, ciudad, sector, calle, manzana, villa, codigo_postal,cedula);
            END IF;
                
END$
DELIMITER ;


DROP PROCEDURE IF EXISTS agregarTarjeta;
delimiter $   
CREATE PROCEDURE agregarTarjeta(in numTarjeta varchar(16),in fechaexp varchar(5), in cvs varchar(3),
					in banco varchar(20), in tipoPago char(1), in cedula varchar(10))
begin
    IF NOT EXISTS(select t.numTarjeta from tarjeta t where t.numTarjeta=numTarjeta) THEN
INSERT INTO tarjeta  VALUES (numTarjeta, fechaexp, cvs, banco, tipoPago,cedula);
            END IF;
                
END$
DELIMITER ;

DROP PROCEDURE IF EXISTS ELIMINAR_TARJETA;
DELIMITER $
CREATE PROCEDURE ELIMINAR_TARJETA(IN  numT CHAR(50))
	BEGIN
		DELETE FROM tarjeta WHERE numTarjeta = numT;
	END$
DELIMITER ;


DROP PROCEDURE IF EXISTS ELIMINAR_UBI;
DELIMITER $
CREATE PROCEDURE ELIMINAR_UBI(IN  idU CHAR(50))
	BEGIN
		DELETE FROM ubicacion WHERE id_ubicacion = idU;
	END$
DELIMITER ;




call buscar_cuenta('rrau@hotmail.com',@contra,@tip,@existe,@usuario);
select @contra;
select @tip;
select @existe;
select @usuario;


