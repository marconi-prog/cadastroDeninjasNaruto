-- V2: Migrations para adc a coluna rank na tabela de cadastros

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(100);