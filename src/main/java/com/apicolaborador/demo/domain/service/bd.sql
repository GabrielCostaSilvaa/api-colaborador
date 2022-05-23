drop database Banco;

create database Banco;

GRANT ALL PRIVILEGES ON Banco.* TO 'root' @'localhost';

USE Banco;

CREATE TABLE colaborador(
    id int AUTO_INCREMENT,
    nome varchar(50) NOT NULL,
    cpf varchar(11) NOT NULL,
    setor varchar(50) NOT NULL,
    colaborador_addressID int,
    PRIMARY KEY (id),
    FOREIGN KEY (colaborador_addressID) REFERENCES endereco(id)
);