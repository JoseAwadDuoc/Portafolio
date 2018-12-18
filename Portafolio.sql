CREATE TABLE Cargo (
  idCargo NUMBER(10) CHECK (idCargo > 0) NOT NULL,
  Descripcion VARCHAR2(50) NULL,
  PRIMARY KEY(idCargo)
);

CREATE SEQUENCE idCargo
START WITH 1
INCREMENT BY 1;


CREATE TABLE Ciudad (
  idCiudad NUMBER(10) CHECK (idCiudad > 0) NOT NULL,
  Nombre_Ciudad VARCHAR2(50) NULL,
  PRIMARY KEY(idCiudad)
);

CREATE SEQUENCE idCiudad
START WITH 1
INCREMENT BY 1;


CREATE TABLE Aerolinea (
  idAerolinea NUMBER(10) CHECK (idAerolinea > 0) NOT NULL,
  Nombre_Aerolinea VARCHAR2(100) NULL,
  Direccion VARCHAR2(100) NULL,
  Telefono VARCHAR2(9) NULL,
  PRIMARY KEY(idAerolinea)
);

CREATE SEQUENCE idAerolinea
START WITH 1
INCREMENT BY 1;


CREATE TABLE Tipo_Seguro (
  idTipo_Seguro NUMBER(10) CHECK (idTipo_Seguro > 0) NOT NULL,
  Descripcion VARCHAR2(100) NULL,
  PRIMARY KEY(idTipo_Seguro)
);

CREATE SEQUENCE idTipo_Seguro
START WITH 1
INCREMENT BY 1;


CREATE TABLE Paquete (
  idPaquete NUMBER(10) CHECK (idPaquete > 0) NOT NULL,
  Descripcion VARCHAR2(100) NULL,
  Fecha_Ini DATE NULL,
  Fecha_Ter DATE NULL,
  Precio NUMBER(10) CHECK (Precio > 0) NULL,
  PRIMARY KEY(idPaquete)
);

CREATE SEQUENCE idPaquete
START WITH 1
INCREMENT BY 1;

CREATE TABLE Ida (
  idIda NUMBER(10) CHECK (idIda > 0) NOT NULL,
  idAerolinea NUMBER(10) CHECK (idAerolinea > 0) NOT NULL,
  Aeropuerto_Origen VARCHAR2(100) NULL,
  Aeropuerto_Destino VARCHAR2(100) NULL,
  Fecha_Salida TIMESTAMP(0) NULL,
  Fecha_Llegada TIMESTAMP(0) NULL,
  PRIMARY KEY(idIda)
 ,
  FOREIGN KEY(idAerolinea)
    REFERENCES Aerolinea(idAerolinea)
);

CREATE SEQUENCE idIda
START WITH 1
INCREMENT BY 1;

CREATE INDEX FK_Ida_Aero ON Ida(idAerolinea);


CREATE TABLE Destino (
  idDestino NUMBER(10) CHECK (idDestino > 0) NOT NULL,
  idPaquete NUMBER(10) CHECK (idPaquete > 0) NOT NULL,
  Nombre_Destino VARCHAR2(50) NULL,
  Pais VARCHAR2(50) NULL,
  PRIMARY KEY(idDestino)
 ,
  FOREIGN KEY(idPaquete)
    REFERENCES Paquete(idPaquete)
);

CREATE SEQUENCE idDestino
START WITH 1
INCREMENT BY 1;

CREATE INDEX FK_Destino ON Destino(idPaquete);


CREATE TABLE Regreso (
  idRegreso NUMBER(10) CHECK (idRegreso > 0) NOT NULL,
  idAerolinea NUMBER(10) CHECK (idAerolinea > 0) NOT NULL,
  Aeropuerto_Origen VARCHAR2(100) NULL,
  Aeropuerto_Destino VARCHAR2(100) NULL,
  Fecha_Salida TIMESTAMP(0) NULL,
  Fecha_Llegada TIMESTAMP(0) NULL,
  PRIMARY KEY(idRegreso)
 ,
  FOREIGN KEY(idAerolinea)
    REFERENCES Aerolinea(idAerolinea)
);

CREATE SEQUENCE idRegreso
START WITH 1
INCREMENT BY 1;

CREATE INDEX FK_Regreso_Aero ON Regreso(idAerolinea);


CREATE TABLE Comuna (
  idComuna NUMBER(10) CHECK (idComuna > 0) NOT NULL,
  idCiudad NUMBER(10) CHECK (idCiudad > 0) NOT NULL,
  Nombre_Comuna VARCHAR2(50) NULL,
  PRIMARY KEY(idComuna)
 ,
  FOREIGN KEY(idCiudad)
    REFERENCES Ciudad(idCiudad)
);

CREATE SEQUENCE idComuna
START WITH 1
INCREMENT BY 1;

CREATE INDEX FK_Comuna ON Comuna(idCiudad);


CREATE TABLE Vuelo (
  idVuelos NUMBER(10) CHECK (idVuelos > 0) NOT NULL,
  idAerolinea NUMBER(10) CHECK (idAerolinea > 0) NOT NULL,
  idPaquete NUMBER(10) CHECK (idPaquete > 0) NOT NULL,
  Descripcion VARCHAR2(100) NULL,
  PRIMARY KEY(idVuelos)
 ,
  FOREIGN KEY(idPaquete)
    REFERENCES Paquete(idPaquete)
     ,
  FOREIGN KEY(idAerolinea)
    REFERENCES Aerolinea(idAerolinea)
);

CREATE SEQUENCE idVuelos
START WITH 1
INCREMENT BY 1;

CREATE INDEX FK_Vuelo_Paquete ON Vuelo(idPaquete);
CREATE INDEX FK_Vuelo_Aero ON Vuelo(idAerolinea);


CREATE TABLE Hotel (
  idHotel NUMBER(10) CHECK (idHotel > 0) NOT NULL,
  idComuna NUMBER(10) CHECK (idComuna > 0) NOT NULL,
  idDestino NUMBER(10) CHECK (idDestino > 0) NOT NULL,
  Nombre_Hotel VARCHAR2(100) NULL,
  Direccion VARCHAR2(100) NULL,
  Telefono VARCHAR2(9) NULL,
  PRIMARY KEY(idHotel)
 ,
  FOREIGN KEY(idDestino)
    REFERENCES Destino(idDestino)
     ,
  FOREIGN KEY(idComuna)
    REFERENCES Comuna(idComuna)
);

CREATE SEQUENCE idHotel
START WITH 1
INCREMENT BY 1;

CREATE INDEX FK_Hotel ON Hotel(idDestino);
CREATE INDEX FK_Hotel_Comuna ON Hotel(idComuna);


CREATE TABLE Representante_Agencia (
  Rut_Representante NUMBER(10) CHECK (Rut_Representante > 0) NOT NULL,
  idComuna NUMBER(10) CHECK (idComuna > 0) NOT NULL,
  idCargo NUMBER(10) CHECK (idCargo > 0) NOT NULL,
  Nombres VARCHAR2(50) NULL,
  Apaterno VARCHAR2(50) NULL,
  Amaterno VARCHAR2(50) NULL,
  Fnacimiento DATE NULL,
  Direccion VARCHAR2(100) NULL,
  Telefono VARCHAR2(9) NULL,
  Pass_Representante VARCHAR2(255) NULL,
  PRIMARY KEY(Rut_Representante)
 ,
  FOREIGN KEY(idCargo)
    REFERENCES Cargo(idCargo)
     ,
  FOREIGN KEY(idComuna)
    REFERENCES Comuna(idComuna)
);


CREATE INDEX FK_Repres_Cargo ON Representante_Agencia(idCargo);
CREATE INDEX FK_Repres_Comuna ON Representante_Agencia(idComuna);


CREATE TABLE Tipo_Beneficio (
  idTipo_Beneficio NUMBER(10) CHECK (idTipo_Beneficio > 0) NOT NULL,
  idHotel NUMBER(10) CHECK (idHotel > 0) NOT NULL,
  Descripcion VARCHAR2(100) NULL,
  PRIMARY KEY(idTipo_Beneficio)
 ,
  FOREIGN KEY(idHotel)
    REFERENCES Hotel(idHotel)
);

CREATE SEQUENCE idTipo_Beneficio
START WITH 1
INCREMENT BY 1;

CREATE INDEX FK_Tipo_Beneficio ON Tipo_Beneficio(idHotel);


CREATE TABLE Colegio (
  idColegio NUMBER(10) CHECK (idColegio > 0) NOT NULL,
  idComuna NUMBER(10) CHECK (idComuna > 0) NOT NULL,
  Nombre_Colegio VARCHAR2(100) NULL,
  Direccion VARCHAR2(100) NULL,
  Telefono VARCHAR2(9) NULL,
  PRIMARY KEY(idColegio)
 ,
  FOREIGN KEY(idComuna)
    REFERENCES Comuna(idComuna)
);

CREATE SEQUENCE idColegio
START WITH 1
INCREMENT BY 1;

CREATE INDEX FK_Colegio_Comuna ON Colegio(idComuna);


CREATE TABLE Apoderado (
  Rut_Apoderado NUMBER(10) CHECK (Rut_Apoderado > 0) NOT NULL,
  Pass_Apoderado VARCHAR2(255) NULL,
  idComuna NUMBER(10) CHECK (idComuna > 0) NOT NULL,
  Nombres VARCHAR2(50) NULL,
  Apaterno VARCHAR2(50) NULL,
  Amaterno VARCHAR2(50) NULL,
  Fnacimiento DATE NULL,
  Telefono VARCHAR2(9) NULL,
  Perfil VARCHAR2(2) NULL,
  Direccion VARCHAR2(100) NULL,
  Correo VARCHAR2(100) NULL,
  Estado CHAR(1) DEFAULT 1 NOT NULL,
  PRIMARY KEY(Rut_Apoderado)
 ,
  FOREIGN KEY(idComuna)
    REFERENCES Comuna(idComuna)
);

CREATE INDEX FK_Apoderado_Comuna ON Apoderado(idComuna);




CREATE TABLE Aseguradora (
  idAseguradora NUMBER(10) CHECK (idAseguradora > 0) NOT NULL,
  idComuna NUMBER(10) CHECK (idComuna > 0) NOT NULL,
  Nombre_Aseguradora VARCHAR2(100) NULL,
  Direccion VARCHAR2(100) NULL,
  Telefono VARCHAR2(9) NULL,
  PRIMARY KEY(idAseguradora)
 ,
  FOREIGN KEY(idComuna)
    REFERENCES Comuna(idComuna)
);

CREATE SEQUENCE idAseguradora
START WITH 1
INCREMENT BY 1;

CREATE INDEX FK_Asegu_Comuna ON Aseguradora(idComuna);


CREATE TABLE Curso (
  idCurso NUMBER(10) CHECK (idCurso > 0) NOT NULL,
  idColegio NUMBER(10) CHECK (idColegio > 0) NOT NULL,
  Descripcion VARCHAR2(50) NULL,
  Rut_Encargado NUMBER(10) CHECK (Rut_Encargado > 0) NOT NULL,
  PRIMARY KEY(idCurso)
 ,
  FOREIGN KEY(idColegio)
    REFERENCES Colegio(idColegio)
);

CREATE SEQUENCE idCurso
START WITH 1
INCREMENT BY 1;

CREATE INDEX FK_Curso ON Curso(idColegio);


CREATE TABLE Seguro (
  idSeguro NUMBER(10) CHECK (idSeguro > 0) NOT NULL,
  idTipo_Seguro NUMBER(10) CHECK (idTipo_Seguro > 0) NOT NULL,
  idAseguradora NUMBER(10) CHECK (idAseguradora > 0) NOT NULL,
  Cant_Personas NUMBER(10) CHECK (Cant_Personas > 0) NULL,
  Fecha_Ini DATE NULL,
  Fecha_Ter DATE NULL,
  PRIMARY KEY(idSeguro)
 ,
  FOREIGN KEY(idAseguradora)
    REFERENCES Aseguradora(idAseguradora)
     ,
  FOREIGN KEY(idTipo_Seguro)
    REFERENCES Tipo_Seguro(idTipo_Seguro)
);

CREATE SEQUENCE idSeguro
START WITH 1
INCREMENT BY 1;

CREATE INDEX FK_Seg_Aseg ON Seguro(idAseguradora);
CREATE INDEX FK_Seg_Tipo ON Seguro(idTipo_Seguro);

CREATE TABLE Contrato (
  idContrato NUMBER(10) CHECK (idContrato > 0) NOT NULL,
  idPaquete NUMBER(10) CHECK (idPaquete > 0) NOT NULL,
  Rut_Repres NUMBER(10) CHECK (Rut_Repres > 0) NOT NULL,
  idCurso NUMBER(10) CHECK (idCurso > 0) NOT NULL,
  idSeguro NUMBER(10) CHECK (idSeguro > 0) NOT NULL,
  Fecha_Contrato DATE NULL,
  Monto_Meta NUMBER(10) CHECK (Monto_Meta > 0) NULL,
  Fecha_Evento DATE NULL,
  Estado CHAR(1) DEFAULT 1 NOT NULL,
  PRIMARY KEY(idContrato)
 ,
  FOREIGN KEY(idCurso)
    REFERENCES Curso(idCurso)
     ,
  FOREIGN KEY(Rut_Repres)
    REFERENCES Representante_Agencia(Rut_Representante)
     ,
  FOREIGN KEY(idPaquete)
    REFERENCES Paquete(idPaquete)
	,
  FOREIGN KEY(idSeguro)
    REFERENCES SEGURO(idSeguro)
);

CREATE SEQUENCE idContrato
START WITH 1
INCREMENT BY 1;

CREATE INDEX FK_Contrato_Curso ON Contrato(idCurso);
CREATE INDEX FK_Contrato_Repres ON Contrato(Rut_Repres);
CREATE INDEX FK_Contrato_Paquete ON Contrato(idPaquete);


CREATE TABLE Alumno (
  Rut_Alumno NUMBER(10) CHECK (Rut_Alumno > 0) NOT NULL,
  idCurso NUMBER(10) CHECK (idCurso > 0) NOT NULL,
  idComuna NUMBER(10) CHECK (idComuna > 0) NOT NULL,
  Rut_Apod NUMBER(10) CHECK (Rut_Apod > 0) NOT NULL,
  Nombres VARCHAR2(50) NULL,
  Apaterno VARCHAR2(50) NULL,
  Amaterno VARCHAR2(50) NULL,
  Fnacimiento DATE NULL,
  Direccion VARCHAR2(100) NULL,
  Telefono VARCHAR2(9) NULL,
  Monto_Personal NUMBER(10) DEFAULT 0 NOT NULL,
  PRIMARY KEY(Rut_Alumno)
 ,
  FOREIGN KEY(Rut_Apod)
    REFERENCES Apoderado(Rut_Apoderado)
     ,
  FOREIGN KEY(idComuna)
    REFERENCES Comuna(idComuna)
     ,
  FOREIGN KEY(idCurso)
    REFERENCES Curso(idCurso)
);



CREATE INDEX Alumno_FK_Apoderado ON Alumno(Rut_Apod);
CREATE INDEX Alumno_FK_Comuna ON Alumno(idComuna);
CREATE INDEX Alumno_FK_Curso ON Alumno(idCurso);


CREATE TABLE Deposito (
    idDeposito NUMBER(10) CHECK (idDeposito > 0) NOT NULL,
    montoDeposito NUMBER(10) CHECK (montoDeposito > 0) NOT NULL,
    rut_Apoderado NUMBER(10) CHECK (rut_Apoderado > 0) NOT NULL,
	Rut_Alumno NUMBER(10) CHECK (Rut_Alumno > 0) NOT NULL,
    fechaDeposito DATE NOT NULL,
	estado NUMBER(10) DEFAULT 0 NOT NULL,
    PRIMARY KEY(idDeposito)
,
    FOREIGN KEY(rut_Apoderado)
        REFERENCES Apoderado(Rut_Apoderado),
	FOREIGN KEY(Rut_Alumno)
        REFERENCES Alumno(Rut_Alumno)
		
);

CREATE SEQUENCE idDeposito
START WITH 1
INCREMENT BY 1;
  

CREATE INDEX FK_Deposito_Apod ON Deposito(Rut_Apoderado);
CREATE INDEX FK_Rut_Alumno ON Deposito(Rut_Alumno);

CREATE TABLE Tipo_Actividad (
  idTipo_Actividad NUMBER(10) CHECK (idTipo_Actividad > 0) NOT NULL,
  Nombre VARCHAR2(100) NULL,
  PRIMARY KEY(idTipo_Actividad)
);

CREATE SEQUENCE idTipo_Actividad
START WITH 1
INCREMENT BY 1;

CREATE TABLE Actividad_Curso (
  idActividad_Curso NUMBER(10) CHECK (idActividad_Curso > 0) NOT NULL,
  idCurso NUMBER(10) CHECK (idCurso > 0) NOT NULL,
  id_TActiv NUMBER(10) CHECK (id_TActiv > 0) NOT NULL,
  Total_Recaudacion NUMBER(10) CHECK (Total_Recaudacion > 0) NULL,
  Fecha_Actividad DATE NULL,
  Descripcion VARCHAR2(50) NULL,
  PRIMARY KEY(idActividad_Curso)
 ,
  FOREIGN KEY(idCurso)
    REFERENCES Curso(idCurso)
,
  FOREIGN KEY(id_TActiv)
    REFERENCES Tipo_Actividad (IDTIPO_ACTIVIDAD )
);

CREATE TABLE archivo
( IdArchivo number(10) NOT NULL,
  NombreArchivo varchar2(50) NOT NULL,
  RutaArchivo varchar2(50),
  idcontrato number(10) NOT NULL,
  CONSTRAINT ARCHIVO_pk PRIMARY KEY (IdArchivo),
  CONSTRAINT fk_ContratoArchivo
    FOREIGN KEY (IDCONTRATO)
    REFERENCES CONTRATO(IDCONTRATO)
);

CREATE SEQUENCE idActividad_Curso
START WITH 1
INCREMENT BY 1;

CREATE SEQUENCE idArchivo
START WITH 1
INCREMENT BY 1;

CREATE INDEX FK_Actividad_Curso ON Actividad_Curso(idCurso);
CREATE INDEX FK_Tipo_Activ ON Actividad_Curso(id_TActiv);

ALTER TABLE SEGURO
ADD CONSTRAINT seguro_idtiposeguro_idasegurad unique (idTipo_Seguro,idAseguradora);

ALTER TABLE TIPO_SEGURO 
ADD CONSTRAINT tiposeguro_descripcion unique (descripcion);

---------------------------------------------------------------
--PRIMERO TIENEN QUE EJCUTAR LOS DISPARADORES O NO FUNCIONARA--
---------------------------------------------------------------

--------------------------------------------------------
-- Archivo creado  - jueves-noviembre-29-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDCOLEGIO
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDCOLEGIO" 
BEFORE INSERT ON COLEGIO FOR EACH ROW BEGIN 
SELECT IDCOLEGIO.nextval INTO :new.IDCOLEGIO
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDCOLEGIO" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDSEGURO
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDSEGURO" 
BEFORE INSERT ON SEGURO FOR EACH ROW BEGIN 
SELECT IDSEGURO.nextval INTO :new.IDSEGURO
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDSEGURO" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDDEPOSITO
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDDEPOSITO" 
BEFORE INSERT ON DEPOSITO FOR EACH ROW BEGIN 
SELECT IDDEPOSITO.nextval INTO :new.IDDEPOSITO
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDDEPOSITO" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDHOTEL
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDHOTEL" 
BEFORE INSERT ON HOTEL FOR EACH ROW BEGIN 
SELECT IDHOTEL.nextval INTO :new.IDHOTEL
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDHOTEL" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDCONTRATO
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDCONTRATO" 
BEFORE INSERT ON CONTRATO FOR EACH ROW BEGIN 
SELECT idcontrato.nextval INTO :new.IDCONTRATO
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDCONTRATO" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDCOMUNA
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDCOMUNA" 
BEFORE INSERT ON COMUNA FOR EACH ROW BEGIN 
SELECT IDCOMUNA.nextval INTO :new.IDCOMUNA
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDCOMUNA" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDPAQUETE
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDPAQUETE" 
BEFORE INSERT ON PAQUETE FOR EACH ROW BEGIN 
SELECT IDPAQUETE.nextval INTO :new.IDPAQUETE
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDPAQUETE" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDTIPOACT
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDTIPOACT" 
BEFORE INSERT ON TIPO_ACTIVIDAD FOR EACH ROW BEGIN 
SELECT IDTIPO_ACTIVIDAD.nextval INTO :new.IDTIPO_ACTIVIDAD
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDTIPOACT" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDVUELOS
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDVUELOS" 
BEFORE INSERT ON VUELO FOR EACH ROW BEGIN 
SELECT IDVUELOS.nextval INTO :new.IDVUELOS
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDVUELOS" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDREGRESO
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDREGRESO" 
BEFORE INSERT ON REGRESO FOR EACH ROW BEGIN 
SELECT IDREGRESO.nextval INTO :new.IDREGRESO
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDREGRESO" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDACTCURSO
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDACTCURSO" 
BEFORE INSERT ON ACTIVIDAD_CURSO FOR EACH ROW BEGIN 
SELECT IDACTIVIDAD_CURSO.nextval INTO :new.IDACTIVIDAD_CURSO
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDACTCURSO" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDASEGURADORA
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDASEGURADORA" 
BEFORE INSERT ON ASEGURADORA FOR EACH ROW BEGIN 
SELECT IDASEGURADORA.nextval INTO :new.IDASEGURADORA
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDASEGURADORA" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDTIPOBEN
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDTIPOBEN" 
BEFORE INSERT ON TIPO_BENEFICIO FOR EACH ROW BEGIN 
SELECT IDTIPO_BENEFICIO.nextval INTO :new.IDTIPO_BENEFICIO
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDTIPOBEN" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDAEROLINEA
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDAEROLINEA" 
BEFORE INSERT ON AEROLINEA FOR EACH ROW BEGIN 
SELECT IDAEROLINEA.nextval INTO :new.IDAEROLINEA
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDAEROLINEA" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDDESTINO
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDDESTINO" 
BEFORE INSERT ON DESTINO FOR EACH ROW BEGIN 
SELECT IDDESTINO.nextval INTO :new.IDDESTINO
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDDESTINO" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDARCHIVO
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDARCHIVO" 
BEFORE INSERT ON ARCHIVO FOR EACH ROW BEGIN 
SELECT IDARCHIVO.nextval INTO :new.idarchivo
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDARCHIVO" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDCURSO
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDCURSO" 
BEFORE INSERT ON CURSO FOR EACH ROW BEGIN 
SELECT IDCURSO.nextval INTO :new.IDCURSO
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDCURSO" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDTIPOSEG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDTIPOSEG" 
BEFORE INSERT ON TIPO_SEGURO FOR EACH ROW BEGIN 
SELECT IDTIPO_SEGURO.nextval INTO :new.IDTIPO_SEGURO
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDTIPOSEG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDIDA
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDIDA" 
BEFORE INSERT ON IDA FOR EACH ROW BEGIN 
SELECT IDIDA.nextval INTO :new.IDIDA
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDIDA" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDCARGO
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDCARGO" 
BEFORE INSERT ON CARGO FOR EACH ROW BEGIN 
SELECT IDCARGO.nextval INTO :new.IDCARGO
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDCARGO" ENABLE;
--------------------------------------------------------
--  DDL for Trigger SECUENCIA_TABLA_IDCIUDAD
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDCIUDAD" 
BEFORE INSERT ON CIUDAD FOR EACH ROW BEGIN 
SELECT IDCIUDAD.nextval INTO :new.IDCIUDAD
FROM dual;
END;

/
ALTER TRIGGER "PORTAFOLIO"."SECUENCIA_TABLA_IDCIUDAD" ENABLE;

create or replace trigger Actualizar_Monto
after update on deposito
for each row
begin
    if :new.Estado = 1 then
        update alumno
        set monto_personal = monto_personal + :new.montodeposito
        WHERE rut_alumno = :new.rut_alumno;
    end if;
end;

/
--INSERT TABLA CARGO
INSERT INTO PORTAFOLIO.CARGO (DESCRIPCION) VALUES ('VENDEDOR');
INSERT INTO PORTAFOLIO.CARGO (DESCRIPCION) VALUES ('DUEÑO');
--INSERT TABLA CIUDAD
INSERT INTO PORTAFOLIO.Ciudad (Nombre_Ciudad) VALUES ( 'SANTIAGO');
--INSERT TABLA AEROLINEA
INSERT INTO PORTAFOLIO.Aerolinea (Nombre_Aerolinea,Direccion,Telefono) VALUES ('LATAM','AV. CALLE 1',222123232);
INSERT INTO PORTAFOLIO.Aerolinea (Nombre_Aerolinea,Direccion,Telefono) VALUES ('SKY','AV. CALLE 2',22212632);

--INSERT TABLA PAQUETE
INSERT INTO PORTAFOLIO.PAQUETE (Descripcion,Fecha_Ini,Fecha_Ter,Precio) VALUES ('PAQUETE PRO 1','02/10/2018','02/11/2018',250000);
INSERT INTO PORTAFOLIO.PAQUETE (Descripcion,Fecha_Ini,Fecha_Ter,Precio) VALUES ('PAQUETE PRO 2','03/10/2018','03/11/2018',300000);
INSERT INTO PORTAFOLIO.PAQUETE (Descripcion,Fecha_Ini,Fecha_Ter,Precio) VALUES ('PAQUETE PRO 3','04/10/2018','04/11/2018',150000);
--INSERT TABLA IDA
INSERT INTO PORTAFOLIO.IDA (idAerolinea,Aeropuerto_Origen,Aeropuerto_Destino,Fecha_Salida,Fecha_Llegada) VALUES (1,'SANTIAGO - PUDAHUEL','BRANOL','10/10/2018','10/11/2018');
INSERT INTO PORTAFOLIO.IDA (idAerolinea,Aeropuerto_Origen,Aeropuerto_Destino,Fecha_Salida,Fecha_Llegada) VALUES (2,'SANTIAGO - PUDAHUEL','ARGENTINA','10/10/2018','10/11/2018');
--INSERT TABLA DESTINO
INSERT INTO PORTAFOLIO.DESTINO (idPaquete,Nombre_Destino,Pais) VALUES (3,'CAMBORIÚ','BRASIL');
INSERT INTO PORTAFOLIO.DESTINO (idPaquete,Nombre_Destino,Pais) VALUES (2,'BUENOS AIRES','ARGENTINA');
--INSERT TABLA REGRESO
INSERT INTO PORTAFOLIO.REGRESO (idAerolinea,Aeropuerto_Origen,Aeropuerto_Destino,Fecha_Salida,Fecha_Llegada) VALUES (2,'BRASIL','SANTIAGO - PUDAHUEL','10/11/2018','12/11/2018');
INSERT INTO PORTAFOLIO.REGRESO (idAerolinea,Aeropuerto_Origen,Aeropuerto_Destino,Fecha_Salida,Fecha_Llegada) VALUES (2,'ARGENTINA','SANTIAGO - PUDAHUEL','10/10/2018','13/11/2018');
--INSERT TABLA COMUNA
INSERT INTO PORTAFOLIO.COMUNA (idCiudad,Nombre_Comuna) VALUES (1,'PUENTE ALTO');
INSERT INTO PORTAFOLIO.COMUNA (idCiudad,Nombre_Comuna) VALUES (1,'LA FLORIDA');
INSERT INTO PORTAFOLIO.COMUNA (idCiudad,Nombre_Comuna) VALUES (1,'SAN JOAQUIN');
--INSERT TABLA VUELO
INSERT INTO PORTAFOLIO.VUELO (idAerolinea,idPaquete,Descripcion) VALUES (1,1,'VUELO 1');
INSERT INTO PORTAFOLIO.VUELO (idAerolinea,idPaquete,Descripcion) VALUES (2,3,'VUELO 2');
INSERT INTO PORTAFOLIO.VUELO (idAerolinea,idPaquete,Descripcion) VALUES (1,2,'VUELO 3');
--INSERT TABLA HOTEL
INSERT INTO PORTAFOLIO.HOTEL (idComuna,idDestino,Nombre_Hotel,Direccion,Telefono) VALUES (2,1,'HOTEL 1','AV. CALLE 4',2234332);
INSERT INTO PORTAFOLIO.HOTEL (idComuna,idDestino,Nombre_Hotel,Direccion,Telefono) VALUES (3,2,'HOTEL 2','AV. CALLE 5',2674332);
--INSERT TABLA REPRESENTANTE_AGENCIA
INSERT INTO PORTAFOLIO.REPRESENTANTE_AGENCIA (Rut_Representante, idComuna,idCargo,Nombres,Apaterno,Amaterno,Fnacimiento,Direccion,Telefono,Pass_Representante) VALUES (111111112,1,1,'Juan','Berrios','Arteaga','02/07/1990','Calle 5',934674523,'827ccb0eea8a706c4c34a16891f84e7b');
INSERT INTO PORTAFOLIO.REPRESENTANTE_AGENCIA (Rut_Representante, idComuna,idCargo,Nombres,Apaterno,Amaterno,Fnacimiento,Direccion,Telefono,Pass_Representante) VALUES (222222221,2,2,'Javier','Contreras','Valenzuela','07/04/1991','Calle 6',934984523,'827ccb0eea8a706c4c34a16891f84e7b');
--INSERT TABLA TIPO_BENEFICIO
INSERT INTO PORTAFOLIO.TIPO_BENEFICIO (idHotel,Descripcion) VALUES (1,'BENEFICIO 1');
INSERT INTO PORTAFOLIO.TIPO_BENEFICIO (idHotel,Descripcion) VALUES (2,'BENEFICIO 2');
INSERT INTO PORTAFOLIO.TIPO_BENEFICIO (idHotel,Descripcion) VALUES (1,'BENEFICIO 3');

--INSERT TABLA ASEGURADORA
INSERT INTO PORTAFOLIO.Aseguradora (idComuna,Nombre_Aseguradora,Direccion,Telefono) VALUES (2,'ASEGURADORA 1','CALLE 19',234564738);
INSERT INTO PORTAFOLIO.Aseguradora (idComuna,Nombre_Aseguradora,Direccion,Telefono) VALUES (3,'ASEGURADORA 2','CALLE 43',234564658);
INSERT INTO PORTAFOLIO.Aseguradora (idComuna,Nombre_Aseguradora,Direccion,Telefono) VALUES (1,'ASEGURADORA 3','CALLE 29',238764738);
--INSERT TABLA TIPO_ACTIVIDAD
INSERT INTO PORTAFOLIO.TIPO_ACTIVIDAD (Nombre) VALUES ('COMPLETADA');
INSERT INTO PORTAFOLIO.TIPO_ACTIVIDAD (Nombre) VALUES ('PIZZATON');

--------------------------------------------------------
-- Archivo creado  - lunes-diciembre-10-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Procedure SP_ALUMNO_INSERTAR
--------------------------------------------------------
set define off;

  CREATE OR REPLACE PROCEDURE "PORTAFOLIO"."SP_ALUMNO_INSERTAR" (
pRut_Alumno alumno.rut_alumno%TYPE,
pIdcurso alumno.idcurso%TYPE,
pIdcomuna alumno.idcomuna%TYPE,
pRut_Apoderado alumno.rut_apod%TYPE,
pNombres alumno.nombres%TYPE,
pApaterno alumno.apaterno%TYPE,
pAmaterno alumno.amaterno%TYPE,
pFnacimiento alumno.fnacimiento%TYPE,
pDireccion apoderado.direccion%TYPE,
pTelefono alumno.telefono%TYPE,
pMonto_Personal alumno.monto_personal%TYPE
)
AS
BEGIN
INSERT INTO ALUMNO (rut_alumno,idcurso,idcomuna,rut_apod,nombres,apaterno,amaterno,fnacimiento,direccion,telefono,monto_personal)
VALUES (pRut_Alumno,pIdcurso,pIdcomuna,pRut_Apoderado,pNombres,pApaterno,pAmaterno,TO_DATE(pFnacimiento,'DD-MM-YYYY'),pDireccion,pTelefono,0);
END;

/
--------------------------------------------------------
--  DDL for Procedure SP_ALUMNO_MODIFICAR
--------------------------------------------------------
set define off;

  CREATE OR REPLACE PROCEDURE "PORTAFOLIO"."SP_ALUMNO_MODIFICAR" (
pRut alumno.rut_alumno%TYPE,
pIdcurso alumno.idcurso%TYPE,
pIdcomuna alumno.idcomuna%TYPE,
pRut_Apoderado alumno.rut_apod%TYPE,
pNombres alumno.nombres%TYPE,
pApaterno alumno.apaterno%TYPE,
pAmaterno alumno.amaterno%TYPE,
pFnacimiento alumno.fnacimiento%TYPE,
pDireccion alumno.direccion%TYPE,
pTelefono alumno.telefono%TYPE,
pMonto alumno.monto_personal%TYPE

)
AS
BEGIN
UPDATE alumno SET 
nombres= pNombres,
amaterno=pAmaterno,
apaterno=pApaterno,
rut_apod=pRut_Apoderado,
idcomuna=pIdcomuna,
telefono=pTelefono,
fnacimiento= pFnacimiento,
direccion=pDireccion,
MONTO_PERSONAL = pMonto
where Rut_ALUMNO=pRut;
END;

/
--------------------------------------------------------
--  DDL for Procedure SP_APODERADO_INSERTAR
--------------------------------------------------------
set define off;

  CREATE OR REPLACE PROCEDURE "PORTAFOLIO"."SP_APODERADO_INSERTAR" (
pRut_Apoderado apoderado.rut_apoderado%TYPE,
pPass_Apoderado apoderado.pass_apoderado%TYPE,
pIdcomuna apoderado.idcomuna%TYPE,
pNombres apoderado.nombres%TYPE,
pApaterno apoderado.apaterno%TYPE,
pAmaterno apoderado.amaterno%TYPE,
pFnacimiento apoderado.fnacimiento%TYPE,
pTelefono apoderado.telefono%TYPE,
pPerfil apoderado.perfil%TYPE,
pDireccion apoderado.direccion%TYPE,
pCorreo apoderado.correo%TYPE,
pEstado apoderado.estado%TYPE
)
AS
BEGIN
INSERT INTO APODERADO (Rut_Apoderado,Pass_Apoderado,idComuna,Nombres,Apaterno,Amaterno,Fnacimiento,Telefono,Perfil,Direccion,Correo,estado)
                VALUES(pRut_Apoderado,pPass_Apoderado,pIdcomuna,pNombres,pApaterno,pAmaterno,TO_DATE(pFnacimiento,'DD-MM-YYYY'),pTelefono,pPerfil,pDireccion,pCorreo,pEstado);
END;


/
--------------------------------------------------------
--  DDL for Procedure SP_APODERADO_MODIFICAR
--------------------------------------------------------
set define off;

  CREATE OR REPLACE PROCEDURE "PORTAFOLIO"."SP_APODERADO_MODIFICAR" (
pRut_Apoderado apoderado.rut_apoderado%TYPE,
pPass_Apoderado apoderado.pass_apoderado%TYPE,
pIdcomuna apoderado.idcomuna%TYPE,
pNombres apoderado.nombres%TYPE,
pApaterno apoderado.apaterno%TYPE,
pAmaterno apoderado.amaterno%TYPE,
pFnacimiento apoderado.fnacimiento%TYPE,
pTelefono apoderado.telefono%TYPE,
pPerfil apoderado.perfil%TYPE,
pDireccion apoderado.direccion%TYPE,
pCorreo apoderado.correo%TYPE
)
AS
BEGIN
UPDATE apoderado SET 
nombres= pNombres,
amaterno=pAmaterno,
apaterno=pApaterno,
pass_apoderado=pPass_Apoderado,
idcomuna=pIdcomuna,
Perfil=pPerfil,
telefono=pTelefono,
correo=pCorreo,
fnacimiento= pFnacimiento
where rut_apoderado=pRut_Apoderado;
END;


/
--------------------------------------------------------
--  DDL for Procedure SP_CONTRATO_DISABLE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE PROCEDURE "PORTAFOLIO"."SP_CONTRATO_DISABLE" (
pIdContrato contrato.idcontrato%TYPE
)
AS
BEGIN
UPDATE contrato SET estado = 0 where idcontrato = pIdContrato;
END;             


/
--------------------------------------------------------
--  DDL for Procedure SP_CONTRATO_INSERTAR
--------------------------------------------------------
set define off;

  CREATE OR REPLACE PROCEDURE "PORTAFOLIO"."SP_CONTRATO_INSERTAR" 
(
pIDPAQUETE contrato.idpaquete%TYPE,
pRut_Repres contrato.rut_repres%TYPE,
pIdcurso contrato.idcurso%TYPE,
pIdseguro contrato.idseguro%TYPE,
pFecha_Contrato contrato.fecha_contrato%TYPE,
pMonto_Meta contrato.monto_meta%TYPE,
pFecha_Evento contrato.fecha_evento%TYPE,
pEstado contrato.estado%TYPE
)
as
BEGIN

INSERT INTO CONTRATO (IDPAQUETE, RUT_REPRES, IDCURSO, IDSEGURO, FECHA_CONTRATO, MONTO_META, FECHA_EVENTO) 
VALUES (pIDPAQUETE,pRut_Repres,pIdcurso,pIdseguro,TO_DATE(pFecha_Contrato,'DD-MM-YYYY'),pMonto_Meta,TO_DATE(pFecha_Evento,'DD-MM-YYYY'));

END;


/
--------------------------------------------------------
--  DDL for Procedure SP_DEPOSITO_ENABLE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE PROCEDURE "PORTAFOLIO"."SP_DEPOSITO_ENABLE" (
pIdDeposito deposito.iddeposito%TYPE
)
AS
BEGIN
UPDATE deposito SET estado = 1 where iddeposito = piddeposito;
END;  


/
COMMIT;

--INSERT TABLA CURSO (Se debe ejecutar los insert cuando se agreguen colegios desde la aplicación de escritorio)
--INSERT INTO PORTAFOLIO.CURSO (idColegio,Descripcion,Rut_Encargado) VALUES (1,'1 MEDIO A',111111111);
--INSERT INTO PORTAFOLIO.CURSO (idColegio,Descripcion,Rut_Encargado) VALUES (1,'1 MEDIO B',222222222);
--COMMIT;