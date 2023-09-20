CREATE SCHEMA IF NOT EXISTS backend;
SET SCHEMA backend;

CREATE TABLE IF NOT EXISTS backend.temporada
(
    ID     VARCHAR(50)  NOT NULL,
    NOMBRE VARCHAR(255) NOT NULL,
    PRIMARY KEY (ID)
    );

insert into backend.temporada (ID, NOMBRE) values ('1', 'Verano');
insert into backend.temporada (ID, NOMBRE) values ('2', 'Invierno');
insert into backend.temporada (ID, NOMBRE) values ('3', 'Otoño');
insert into backend.temporada (ID, NOMBRE) values ('4', 'Primavera');

CREATE TABLE IF NOT EXISTS backend.categoria
(
    ID     VARCHAR(50)  NOT NULL,
    NOMBRE VARCHAR(255) NOT NULL,
    PRIMARY KEY (ID)
    );

insert into backend.categoria (ID, NOMBRE) values ('1', 'Pantalones');
insert into backend.categoria (ID, NOMBRE) values ('2', 'Camisas');
insert into backend.categoria (ID, NOMBRE) values ('3', 'Zapatos');
insert into backend.categoria (ID, NOMBRE) values ('4', 'Accesorios');
insert into backend.categoria (ID, NOMBRE) values ('5', 'vestidos');

CREATE TABLE IF NOT EXISTS backend.producto
(
    ID          VARCHAR(50)  NOT NULL,
    NOMBRE      VARCHAR(255) NOT NULL,
    MARCA VARCHAR(255) NOT NULL,
    COLOR VARCHAR(255) NOT NULL,
    TALLA VARCHAR(255) NOT NULL,
    PRECIO      DECIMAL(10, 2) NOT NULL,
    CANTIDAD    INT           NOT NULL,
    CATEGORIA_ID VARCHAR(50)  NOT NULL,
    TEMPORADA_ID VARCHAR(50)  NOT NULL,
    DESCRIPCION VARCHAR(255) NOT NULL,
    PRIMARY KEY (ID),
    FOREIGN KEY (TEMPORADA_ID) REFERENCES backend.temporada (ID),
    FOREIGN KEY (CATEGORIA_ID) REFERENCES backend.categoria (ID)
    );

insert into backend.producto (ID, NOMBRE, MARCA, COLOR, TALLA, PRECIO, CANTIDAD, CATEGORIA_ID, TEMPORADA_ID, DESCRIPCION) values ('1', 'Pantalon', 'Levis', 'Azul', 'M', 11000, 10, '1', '1', 'Pantalon de mezclilla');
insert into backend.producto (ID, NOMBRE, MARCA, COLOR, TALLA, PRECIO, CANTIDAD, CATEGORIA_ID, TEMPORADA_ID, DESCRIPCION) values ('2', 'Camisa', 'Levis', 'Azul', 'G', 10000, 10, '2', '2', 'camisa');
insert into backend.producto (ID, NOMBRE, MARCA, COLOR, TALLA, PRECIO, CANTIDAD, CATEGORIA_ID, TEMPORADA_ID, DESCRIPCION) values ('3', 'Zapatos', 'Levis', 'Azul', 'G', 10000, 10, '3', '3', 'zapatos');
insert into backend.producto (ID, NOMBRE, MARCA, COLOR, TALLA, PRECIO, CANTIDAD, CATEGORIA_ID, TEMPORADA_ID, DESCRIPCION) values ('4', 'Cinto', 'Levis', 'Azul', 'G', 10000, 10, '4', '4', 'accesorios');
insert into backend.producto (ID, NOMBRE, MARCA, COLOR, TALLA, PRECIO, CANTIDAD, CATEGORIA_ID, TEMPORADA_ID, DESCRIPCION) values ('5', 'Vestido', 'Levis', 'Azul', 'G', 10000, 10, '5', '1', 'vestido');
insert into backend.producto (ID, NOMBRE, MARCA, COLOR, TALLA, PRECIO, CANTIDAD, CATEGORIA_ID, TEMPORADA_ID, DESCRIPCION) values ('6', 'Pantalon', 'Levis', 'Azul', 'M', 11000, 10, '1', '2', 'Pantalon de mezclilla');
insert into backend.producto (ID, NOMBRE, MARCA, COLOR, TALLA, PRECIO, CANTIDAD, CATEGORIA_ID, TEMPORADA_ID, DESCRIPCION) values ('7', 'Camisa', 'Levis', 'Azul', 'G', 10000, 10, '2', '3', 'camisa');
insert into backend.producto (ID, NOMBRE, MARCA, COLOR, TALLA, PRECIO, CANTIDAD, CATEGORIA_ID, TEMPORADA_ID, DESCRIPCION) values ('8', 'Zapatos', 'Levis', 'Azul', 'G', 10000, 10, '3', '4', 'zapatos');
insert into backend.producto (ID, NOMBRE, MARCA, COLOR, TALLA, PRECIO, CANTIDAD, CATEGORIA_ID, TEMPORADA_ID, DESCRIPCION) values ('9', 'Arito', 'Levis', 'Azul', 'G', 10000, 10, '4', '1', 'accesorios');

CREATE TABLE IF NOT EXISTS backend.producto_temporada
(
    PRODUCTO_ID VARCHAR(50)  NOT NULL,
    TEMPORADA_ID VARCHAR(50)  NOT NULL,
    CONSTRAINT PK_PRODUCTO_TEMPORADA PRIMARY KEY (PRODUCTO_ID, TEMPORADA_ID)
    );

INSERT INTO backend.producto_temporada (PRODUCTO_ID, TEMPORADA_ID) VALUES ('1', '1');
INSERT INTO backend.producto_temporada (PRODUCTO_ID, TEMPORADA_ID) VALUES ('2', '2');
INSERT INTO backend.producto_temporada (PRODUCTO_ID, TEMPORADA_ID) VALUES ('3', '3');
INSERT INTO backend.producto_temporada (PRODUCTO_ID, TEMPORADA_ID) VALUES ('4', '4');
INSERT INTO backend.producto_temporada (PRODUCTO_ID, TEMPORADA_ID) VALUES ('5', '1');
INSERT INTO backend.producto_temporada (PRODUCTO_ID, TEMPORADA_ID) VALUES ('6', '2');
INSERT INTO backend.producto_temporada (PRODUCTO_ID, TEMPORADA_ID) VALUES ('7', '3');
INSERT INTO backend.producto_temporada (PRODUCTO_ID, TEMPORADA_ID) VALUES ('8', '4');
INSERT INTO backend.producto_temporada (PRODUCTO_ID, TEMPORADA_ID) VALUES ('9', '1');

CREATE TABLE IF NOT EXISTS backend.producto_categoria
(
    PRODUCTO_ID VARCHAR(50)  NOT NULL,
    CATEGORIA_ID VARCHAR(50)  NOT NULL,
    CONSTRAINT PK_PRODUCTO_CATEGORIA PRIMARY KEY (PRODUCTO_ID, CATEGORIA_ID)
    );

INSERT INTO backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) VALUES ('1', '1');
INSERT INTO backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) VALUES ('2', '2');
INSERT INTO backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) VALUES ('3', '3');
INSERT INTO backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) VALUES ('4', '4');
INSERT INTO backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) VALUES ('5', '5');
INSERT INTO backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) VALUES ('6', '1');
INSERT INTO backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) VALUES ('7', '2');
INSERT INTO backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) VALUES ('8', '3');
INSERT INTO backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) VALUES ('9', '4');
insert into backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) values ('1', '3');
insert into backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) values ('2', '4');
insert into backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) values ('3', '5');
insert into backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) values ('4', '1');
insert into backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) values ('5', '2');
insert into backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) values ('6', '3');
insert into backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) values ('7', '4');
insert into backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) values ('8', '5');
insert into backend.producto_categoria (PRODUCTO_ID, CATEGORIA_ID) values ('9', '1');



