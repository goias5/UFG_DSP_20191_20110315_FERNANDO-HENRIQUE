CREATE TABLE Funcionario (
	id	INT PRIMARY KEY,
	nome	VARCHAR NOT NULL,
	matricula	INT
);

CREATE TABLE Departamento (
	id	INT PRIMARY KEY,
	nome	VARCHAR
);

CREATE TABLE Cargo (
	id	INT PRIMARY KEY,
	nome	VARCHAR,
	salario	DOUBLE
);

CREATE TABLE Lotacao (
	id	INT PRIMARY KEY,
	dataInicial	DATE,
	dataFinal	DATE,
	cargoID	INT,
	departamentoID	INT,
	funcionarioID	INT
);