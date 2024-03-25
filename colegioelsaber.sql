-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS colegio_el_saber CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Seleccionar la base de datos
USE colegio_el_saber;

-- Crear un usuario para la base de datos llamado "usuario_prueba" y tiene la contraseña "Usuario_Clave."
CREATE USER 'usuario_administrador'@'%' IDENTIFIED BY 'Usuario_Clave.';

-- Asignar privilegios sobre la base de datos Colegio_el_saber al usuario creado
GRANT ALL PRIVILEGES ON colegio_el_saber.* TO 'usuario_administrador'@'%';
FLUSH PRIVILEGES;

-- Tabla para estudiantes
CREATE TABLE estudiantes (
    id_estudiante INT NOT NULL AUTO_INCREMENT,
	seccion VARCHAR (10),
    Subir_foto VARCHAR(100) NOT NULL,
    nombre_completo VARCHAR(100) NOT NULL,
    no_de_carnet DATE,
    no_de_identificacion  VARCHAR(255),
    fecha_de_nacimiento VARCHAR(15),
    pais_de_origen VARCHAR(15),
    correo_institucional VARCHAR(25),
    direccion VARCHAR(30),
    canton VARCHAR(15),
    provincia VARCHAR(15),
    telefono_habitacion VARCHAR(20),
	telefono_adicional VARCHAR(20),
    correo_personal VARCHAR(25),
    titulo_academico VARCHAR(25),
    nombre_completo_encargado VARCHAR(100) NOT NULL,
	no_de_identificacion_encargado  VARCHAR(255),
    telefono_movil_encargado VARCHAR(20),
	correo_electronico_encargado VARCHAR(25),
    trabaja_actualmente_encargado VARCHAR(25),
    lugar_de_trabajo_encargado VARCHAR(25),
    telefono_trabajo_encargado VARCHAR(25),
	agregar_otro_encargado VARCHAR(15),
PRIMARY KEY (id_estudiante)
) ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

-- Tabla para administradores
CREATE TABLE administrador (
    id_administrador INT NOT NULL AUTO_INCREMENT,
    Subir_foto VARCHAR(100) NOT NULL,
    nombre_completo VARCHAR(100) NOT NULL,
    no_de_carnet DATE,
    no_de_identificacion  VARCHAR(255),
    fecha_de_nacimiento VARCHAR(15),
    pais_de_origen VARCHAR(15),
    correo_institucional VARCHAR(25),
    area VARCHAR(25),
    correo_personal VARCHAR(25),
    titulo_academico VARCHAR(25),
    direccion VARCHAR(30),
    canton VARCHAR(15),
    provincia VARCHAR(15),
    telefono_habitacion VARCHAR(20),
    telefono_adicional VARCHAR(20),
    PRIMARY KEY (id_administrador)
) ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- Tabla para profesores
CREATE TABLE profesores (
    id_profesor INT NOT NULL AUTO_INCREMENT,
    seccion VARCHAR (10),
    Subir_foto VARCHAR(100) NOT NULL,
    nombre_completo VARCHAR(100) NOT NULL,
    no_de_carnet DATE,
    no_de_identificacion  VARCHAR(255),
    fecha_de_nacimiento VARCHAR(15),
    pais_de_origen VARCHAR(15),
    correo_institucional VARCHAR(25),
    materia_impartida VARCHAR(25),
    correo_personal VARCHAR(25),
    titulo_academico VARCHAR(25),
    direccion VARCHAR(30),
    canton VARCHAR(15),
    provincia VARCHAR(15),
    telefono_habitacion VARCHAR(20),
    telefono_adicional VARCHAR(20),
    PRIMARY KEY (id_profesor)
) ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

-- Tabla para cursos
CREATE TABLE cursos (
    id_curso INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    PRIMARY KEY (id_curso)
) ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

-- Tabla para asignaturas
CREATE TABLE asignaturas (
    id_asignatura INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    PRIMARY KEY (id_asignatura)
) ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

-- Tabla para relaciones entre estudiantes y cursos
CREATE TABLE estudiantes_cursos (
    id_relacion INT NOT NULL AUTO_INCREMENT,
    id_estudiante INT NOT NULL,
    id_curso INT NOT NULL,
    PRIMARY KEY (id_relacion),
    FOREIGN KEY (id_estudiante) REFERENCES estudiantes(id_estudiante),
    FOREIGN KEY (id_curso) REFERENCES cursos(id_curso)
) ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

-- Tabla para relaciones entre profesores y asignaturas
CREATE TABLE profesores_asignaturas (
    id_relacion INT NOT NULL AUTO_INCREMENT,
    id_profesor INT NOT NULL,
    id_asignatura INT NOT NULL,
    PRIMARY KEY (id_relacion),
    FOREIGN KEY (id_profesor) REFERENCES profesores(id_profesor),
    FOREIGN KEY (id_asignatura) REFERENCES asignaturas(id_asignatura)
) ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

-- Tabla para calificaciones
CREATE TABLE calificaciones (
    id_calificacion INT NOT NULL AUTO_INCREMENT,
    id_estudiante INT NOT NULL,
    id_asignatura INT NOT NULL,
    calificacion DECIMAL(5, 2),
    PRIMARY KEY (id_calificacion),
    FOREIGN KEY (id_estudiante) REFERENCES estudiantes(id_estudiante),
    FOREIGN KEY (id_asignatura) REFERENCES asignaturas(id_asignatura)
) ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;
-- tabla para mensajes
CREATE TABLE mensajes (
    id_mensaje INT NOT NULL AUTO_INCREMENT,
    contenido TEXT NOT NULL,
    fecha_envio TIMESTAMP NOT NULL,
    remitente_id INT NOT NULL,
    destinatario_id INT NOT NULL,
    PRIMARY KEY (id_mensaje),
    FOREIGN KEY (remitente_id) REFERENCES estudiantes(id_estudiante),
    FOREIGN KEY (destinatario_id) REFERENCES estudiantes(id_estudiante)
) ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;
