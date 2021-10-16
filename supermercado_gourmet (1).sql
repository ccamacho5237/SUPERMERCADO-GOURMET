create database esquema_g75_e31;
use esquema_g75_e31;

create table usuarios (
cedula_usuario bigint(20) primary key not null,
usuario varchar(255),
password varchar(255),
email_usuario varchar(255),
nombre_usuario varchar(255)
);

create table clientes (
cedula_cliente bigint(20) primary key not null,
nombre_cliente varchar(255),
telefono_cliente varchar(255),
direccion_cliente varchar(255),
email_cliente varchar(255)
);

create table ventas (
codigo_venta bigint(20) primary key not null,
cedula_cliente bigint(20),
cedula_usuario bigint(20),
iva_venta double,
total_venta double,
valor_venta double
);

create table detalle_ventas (
codigo_detalle_venta bigint(20) primary key not null,
cantidad_producto int(11),
codigo_producto bigint(20),
codigo_venta bigint(20),
valor_total double,
valor_venta double,
valor_iva double
);

create table productos (
codigo_producto bigint(20) primary key not null,
iva_compra double,
nit_proveedor bigint(20),
nombre_producto varchar(255),
precio_compra double,
precio_venta double
);

create table proveedores (
nit_proveedor bigint(20) primary key not null,
nombre_proveedor varchar(255),
telefono_proveedor varchar(255),
direccion_proveedor varchar(255),
ciudad_proveedor varchar(255)
);



