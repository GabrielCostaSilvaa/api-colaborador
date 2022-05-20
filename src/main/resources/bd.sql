drop database Banco;

create database Banco;

GRANT ALL PREVILEGES ON Banco.* TO 'root' @'localhost';

USE Banco;

CREATE TABLE endereco(
    id int AUTO_INCREMENT,
    cep varchar(8) NOT NULL,
    rua varchar(20) NOT NULL,
    numero int NOT NULL,
    cidade varchar(2) NOT NULL,
    uf varchar(2) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE cliente(
    id int AUTO_INCREMENT,
    nome varchar(50) NOT NULL,
    cpf varchar(11) NOT NULL,
    sexo varchar(1) NOT NULL,
    dataNascimento DATE NOT NULL DEFAULT CURRENT_TIME,
    cliente_addressID int,
    PRIMARY KEY (id),
    FOREIGN KEY (cliente_addressID) REFERENCES endereco(id)
);