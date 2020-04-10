CREATE TABLE stand (

stand_id INT PRIMARY KEY AUTO_INCREMENT,

stand_nome VARCHAR(45) NOT NULL,

stand_link_apresentacao VARCHAR(45),

stand_link_cha VARCHAR(45),

stand_status VARCHAR(45),

stand_link_logomarc VARCHAR(45),
FOREIGN KEY constraint  (empresa_id) REFERENCES  empresa(codigo)


)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO stand (stand_nome, stand_link_apresentacao, stand_link_chat, stand_status, stand_link_logomarca, empresa_id) VALUES ('TESTA1', 'TESTA2', 'TESTA3', 'TESTA4', 'TESTA5', 1);

