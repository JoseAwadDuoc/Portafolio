CREATE TABLE Cargo (
  idCargo NUMBER(10) CHECK (idCargo > 0) NOT NULL,
  Descripcion VARCHAR2(50) NULL,
  PRIMARY KEY(idCargo)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE Cargo_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Cargo_seq_tr
 BEFORE INSERT ON Cargo FOR EACH ROW
 WHEN (NEW.idCargo IS NULL)
BEGIN
 SELECT Cargo_seq.NEXTVAL INTO :NEW.idCargo FROM DUAL;
END;
/


CREATE TABLE Ciudad (
  idCiudad NUMBER(10) CHECK (idCiudad > 0) NOT NULL,
  Nombre_Ciudad VARCHAR2(50) NULL,
  PRIMARY KEY(idCiudad)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE Ciudad_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Ciudad_seq_tr
 BEFORE INSERT ON Ciudad FOR EACH ROW
 WHEN (NEW.idCiudad IS NULL)
BEGIN
 SELECT Ciudad_seq.NEXTVAL INTO :NEW.idCiudad FROM DUAL;
END;
/


CREATE TABLE Tipo_Paquete (
  idTipo_Paquete NUMBER(10) CHECK (idTipo_Paquete > 0) NOT NULL,
  Descripcion VARCHAR2(100) NULL,
  PRIMARY KEY(idTipo_Paquete)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE Tipo_Paquete_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Tipo_Paquete_seq_tr
 BEFORE INSERT ON Tipo_Paquete FOR EACH ROW
 WHEN (NEW.idTipo_Paquete IS NULL)
BEGIN
 SELECT Tipo_Paquete_seq.NEXTVAL INTO :NEW.idTipo_Paquete FROM DUAL;
END;
/


CREATE TABLE Aerolinea (
  idAerolinea NUMBER(10) CHECK (idAerolinea > 0) NOT NULL,
  Nombre_Aerolinea VARCHAR2(100) NULL,
  Direccion VARCHAR2(100) NULL,
  Telefono VARCHAR2(9) NULL,
  PRIMARY KEY(idAerolinea)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE Aerolinea_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Aerolinea_seq_tr
 BEFORE INSERT ON Aerolinea FOR EACH ROW
 WHEN (NEW.idAerolinea IS NULL)
BEGIN
 SELECT Aerolinea_seq.NEXTVAL INTO :NEW.idAerolinea FROM DUAL;
END;
/


CREATE TABLE Tipo_Seguro (
  idTipo_Seguro NUMBER(10) CHECK (idTipo_Seguro > 0) NOT NULL,
  Descripcion VARCHAR2(100) NULL,
  PRIMARY KEY(idTipo_Seguro)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE Tipo_Seguro_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Tipo_Seguro_seq_tr
 BEFORE INSERT ON Tipo_Seguro FOR EACH ROW
 WHEN (NEW.idTipo_Seguro IS NULL)
BEGIN
 SELECT Tipo_Seguro_seq.NEXTVAL INTO :NEW.idTipo_Seguro FROM DUAL;
END;
/


CREATE TABLE Paquete (
  idPaquete NUMBER(10) CHECK (idPaquete > 0) NOT NULL,
  idTipo_Paquete NUMBER(10) CHECK (idTipo_Paquete > 0) NOT NULL,
  Descripcion VARCHAR2(100) NULL,
  Fecha_Ini DATE NULL,
  Fecha_Ter DATE NULL,
  Precio NUMBER(10) CHECK (Precio > 0) NULL,
  PRIMARY KEY(idPaquete)
 ,
  FOREIGN KEY(idTipo_Paquete)
    REFERENCES Tipo_Paquete(idTipo_Paquete)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE Paquete_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Paquete_seq_tr
 BEFORE INSERT ON Paquete FOR EACH ROW
 WHEN (NEW.idPaquete IS NULL)
BEGIN
 SELECT Paquete_seq.NEXTVAL INTO :NEW.idPaquete FROM DUAL;
END;
/

CREATE INDEX FK_Paquete ON Paquete(idTipo_Paquete);


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

-- Generate ID using sequence and trigger
CREATE SEQUENCE Ida_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Ida_seq_tr
 BEFORE INSERT ON Ida FOR EACH ROW
 WHEN (NEW.idIda IS NULL)
BEGIN
 SELECT Ida_seq.NEXTVAL INTO :NEW.idIda FROM DUAL;
END;
/

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

-- Generate ID using sequence and trigger
CREATE SEQUENCE Destino_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Destino_seq_tr
 BEFORE INSERT ON Destino FOR EACH ROW
 WHEN (NEW.idDestino IS NULL)
BEGIN
 SELECT Destino_seq.NEXTVAL INTO :NEW.idDestino FROM DUAL;
END;
/

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

-- Generate ID using sequence and trigger
CREATE SEQUENCE Regreso_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Regreso_seq_tr
 BEFORE INSERT ON Regreso FOR EACH ROW
 WHEN (NEW.idRegreso IS NULL)
BEGIN
 SELECT Regreso_seq.NEXTVAL INTO :NEW.idRegreso FROM DUAL;
END;
/

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

-- Generate ID using sequence and trigger
CREATE SEQUENCE Comuna_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Comuna_seq_tr
 BEFORE INSERT ON Comuna FOR EACH ROW
 WHEN (NEW.idComuna IS NULL)
BEGIN
 SELECT Comuna_seq.NEXTVAL INTO :NEW.idComuna FROM DUAL;
END;
/

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

-- Generate ID using sequence and trigger
CREATE SEQUENCE Vuelo_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Vuelo_seq_tr
 BEFORE INSERT ON Vuelo FOR EACH ROW
 WHEN (NEW.idVuelos IS NULL)
BEGIN
 SELECT Vuelo_seq.NEXTVAL INTO :NEW.idVuelos FROM DUAL;
END;
/

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

-- Generate ID using sequence and trigger
CREATE SEQUENCE Hotel_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Hotel_seq_tr
 BEFORE INSERT ON Hotel FOR EACH ROW
 WHEN (NEW.idHotel IS NULL)
BEGIN
 SELECT Hotel_seq.NEXTVAL INTO :NEW.idHotel FROM DUAL;
END;
/

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
  Pass_Representante VARCHAR2(8) NULL,
  PRIMARY KEY(Rut_Representante)
 ,
  FOREIGN KEY(idCargo)
    REFERENCES Cargo(idCargo)
     ,
  FOREIGN KEY(idComuna)
    REFERENCES Comuna(idComuna)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE Representante_Agencia_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Representante_Agencia_seq_tr
 BEFORE INSERT ON Representante_Agencia FOR EACH ROW
 WHEN (NEW.Rut_Representante IS NULL)
BEGIN
 SELECT Representante_Agencia_seq.NEXTVAL INTO :NEW.Rut_Representante FROM DUAL;
END;
/

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

-- Generate ID using sequence and trigger
CREATE SEQUENCE Tipo_Beneficio_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Tipo_Beneficio_seq_tr
 BEFORE INSERT ON Tipo_Beneficio FOR EACH ROW
 WHEN (NEW.idTipo_Beneficio IS NULL)
BEGIN
 SELECT Tipo_Beneficio_seq.NEXTVAL INTO :NEW.idTipo_Beneficio FROM DUAL;
END;
/

CREATE INDEX FK_Tipo_Beneficio ON Tipo_Beneficio(idHotel);


CREATE TABLE Colegio (
  idColegio NUMBER(10) CHECK (idColegio > 0) NOT NULL,
  idComuna NUMBER(10) CHECK (idComuna > 0) NOT NULL,
  Nombre_Colegio VARCHAR2(100) NULL,
  Direccion VARCHAR2(100) NULL,
  Telefono VARCHAR2(9) NULL,
  Comuna VARCHAR2(50) NULL,
  PRIMARY KEY(idColegio)
 ,
  FOREIGN KEY(idComuna)
    REFERENCES Comuna(idComuna)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE Colegio_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Colegio_seq_tr
 BEFORE INSERT ON Colegio FOR EACH ROW
 WHEN (NEW.idColegio IS NULL)
BEGIN
 SELECT Colegio_seq.NEXTVAL INTO :NEW.idColegio FROM DUAL;
END;
/

CREATE INDEX FK_Colegio_Comuna ON Colegio(idComuna);


CREATE TABLE Apoderado (
  Rut_Apoderado NUMBER(10) CHECK (Rut_Apoderado > 0) NOT NULL,
  Pass_Apoderado VARCHAR2(8) NULL,
  idComuna NUMBER(10) CHECK (idComuna > 0) NOT NULL,
  Nombres VARCHAR2(50) NULL,
  Apaterno VARCHAR2(50) NULL,
  Amaterno VARCHAR2(50) NULL,
  Fnacimiento DATE NULL,
  Telefono VARCHAR2(9) NULL,
  Perfil VARCHAR2(2) NULL,
  Direccion VARCHAR2(100) NULL,
  PRIMARY KEY(Rut_Apoderado)
 ,
  FOREIGN KEY(idComuna)
    REFERENCES Comuna(idComuna)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE Apoderado_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Apoderado_seq_tr
 BEFORE INSERT ON Apoderado FOR EACH ROW
 WHEN (NEW.Rut_Apoderado IS NULL)
BEGIN
 SELECT Apoderado_seq.NEXTVAL INTO :NEW.Rut_Apoderado FROM DUAL;
END;
/

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

-- Generate ID using sequence and trigger
CREATE SEQUENCE Aseguradora_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Aseguradora_seq_tr
 BEFORE INSERT ON Aseguradora FOR EACH ROW
 WHEN (NEW.idAseguradora IS NULL)
BEGIN
 SELECT Aseguradora_seq.NEXTVAL INTO :NEW.idAseguradora FROM DUAL;
END;
/

CREATE INDEX FK_Asegu_Comuna ON Aseguradora(idComuna);


CREATE TABLE Curso (
  idCurso NUMBER(10) CHECK (idCurso > 0) NOT NULL,
  idColegio NUMBER(10) CHECK (idColegio > 0) NOT NULL,
  Monto_Curso NUMBER(10) CHECK (Monto_Curso > 0) NULL,
  Rut_Encargado CHAR(10) NULL,
  PRIMARY KEY(idCurso)
 ,
  FOREIGN KEY(idColegio)
    REFERENCES Colegio(idColegio)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE Curso_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Curso_seq_tr
 BEFORE INSERT ON Curso FOR EACH ROW
 WHEN (NEW.idCurso IS NULL)
BEGIN
 SELECT Curso_seq.NEXTVAL INTO :NEW.idCurso FROM DUAL;
END;
/

CREATE INDEX FK_Curso ON Curso(idColegio);


CREATE TABLE Actividad_Curso (
  idActividad_Curso NUMBER(10) CHECK (idActividad_Curso > 0) NOT NULL,
  idCurso NUMBER(10) CHECK (idCurso > 0) NOT NULL,
  Total_Recaudacion NUMBER(10) CHECK (Total_Recaudacion > 0) NULL,
  Fecha_Actividad DATE NULL,
  PRIMARY KEY(idActividad_Curso)
 ,
  FOREIGN KEY(idCurso)
    REFERENCES Curso(idCurso)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE Actividad_Curso_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Actividad_Curso_seq_tr
 BEFORE INSERT ON Actividad_Curso FOR EACH ROW
 WHEN (NEW.idActividad_Curso IS NULL)
BEGIN
 SELECT Actividad_Curso_seq.NEXTVAL INTO :NEW.idActividad_Curso FROM DUAL;
END;
/

CREATE INDEX FK_Actividad_Curso ON Actividad_Curso(idCurso);


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

-- Generate ID using sequence and trigger
CREATE SEQUENCE Seguro_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Seguro_seq_tr
 BEFORE INSERT ON Seguro FOR EACH ROW
 WHEN (NEW.idSeguro IS NULL)
BEGIN
 SELECT Seguro_seq.NEXTVAL INTO :NEW.idSeguro FROM DUAL;
END;
/

CREATE INDEX FK_Seg_Aseg ON Seguro(idAseguradora);
CREATE INDEX FK_Seg_Tipo ON Seguro(idTipo_Seguro);


CREATE TABLE Contrato (
  idContrato NUMBER(10) CHECK (idContrato > 0) NOT NULL,
  idPaquete NUMBER(10) CHECK (idPaquete > 0) NOT NULL,
  Rut_Repres NUMBER(10) CHECK (Rut_Repres > 0) NOT NULL,
  idCurso NUMBER(10) CHECK (idCurso > 0) NOT NULL,
  Fecha_Contrato DATE NULL,
  Monto_Meta NUMBER(10) CHECK (Monto_Meta > 0) NULL,
  Fecha_Evento DATE NULL,
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
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE Contrato_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Contrato_seq_tr
 BEFORE INSERT ON Contrato FOR EACH ROW
 WHEN (NEW.idContrato IS NULL)
BEGIN
 SELECT Contrato_seq.NEXTVAL INTO :NEW.idContrato FROM DUAL;
END;
/

CREATE INDEX FK_Contrato_Curso ON Contrato(idCurso);
CREATE INDEX FK_Contrato_Repres ON Contrato(Rut_Repres);
CREATE INDEX FK_Contrato_Paquete ON Contrato(idPaquete);


CREATE TABLE Alumno (
  Rut_Alumno CHAR(10) NOT NULL,
  idCurso NUMBER(10) CHECK (idCurso > 0) NOT NULL,
  idComuna NUMBER(10) CHECK (idComuna > 0) NOT NULL,
  Rut_Apod NUMBER(10) CHECK (Rut_Apod > 0) NOT NULL,
  Nombres VARCHAR2(50) NULL,
  Apaterno VARCHAR2(50) NULL,
  Amaterno VARCHAR2(50) NULL,
  Fnacimiento DATE NULL,
  Direccion VARCHAR2(100) NULL,
  Telefono VARCHAR2(9) NULL,
  Monto_Personal NUMBER(10) CHECK (Monto_Personal > 0) NULL,
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

-- Generate ID using sequence and trigger
CREATE SEQUENCE Alumno_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Alumno_seq_tr
 BEFORE INSERT ON Alumno FOR EACH ROW
 WHEN (NEW.Rut_Alumno IS NULL)
BEGIN
 SELECT Alumno_seq.NEXTVAL INTO :NEW.Rut_Alumno FROM DUAL;
END;
/

CREATE INDEX Alumno_FK_Apoderado ON Alumno(Rut_Apod);
CREATE INDEX Alumno_FK_Comuna ON Alumno(idComuna);
CREATE INDEX Alumno_FK_Curso ON Alumno(idCurso);


CREATE TABLE Tipo_Actividad (
  idTipo_Actividad NUMBER(10) CHECK (idTipo_Actividad > 0) NOT NULL,
  idActividad NUMBER(10) CHECK (idActividad > 0) NOT NULL,
  Descripcion VARCHAR2(100) NULL,
  PRIMARY KEY(idTipo_Actividad)
 ,
  FOREIGN KEY(idActividad)
    REFERENCES Actividad_Curso(idActividad_Curso)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE Tipo_Actividad_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER Tipo_Actividad_seq_tr
 BEFORE INSERT ON Tipo_Actividad FOR EACH ROW
 WHEN (NEW.idTipo_Actividad IS NULL)
BEGIN
 SELECT Tipo_Actividad_seq.NEXTVAL INTO :NEW.idTipo_Actividad FROM DUAL;
END;
/

CREATE INDEX FK_Tipo_Actividad ON Tipo_Actividad(idActividad);


CREATE TABLE Seguro_Cabecera_Contrato (
  idSeguro NUMBER(10) CHECK (idSeguro > 0) NOT NULL,
  idContrato NUMBER(10) CHECK (idContrato > 0) NOT NULL,
  PRIMARY KEY(idSeguro, idContrato)
 ,
  FOREIGN KEY(idSeguro)
    REFERENCES Seguro(idSeguro)
     ,
  FOREIGN KEY(idContrato)
    REFERENCES Contrato(idContrato)
);

CREATE INDEX Seguro_Contrato_Ind1 ON Seguro_Cabecera_Contrato(idSeguro);
CREATE INDEX Seguro_Contrato_Ind2 ON Seguro_Cabecera_Contrato(idContrato);


