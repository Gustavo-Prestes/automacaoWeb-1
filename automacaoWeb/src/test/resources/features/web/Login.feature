#language: pt
#enconding: UTF-8
#author: marcos.barbosa
#date: 03/07/2020
#version: 1.0

@login @web
Funcionalidade: Validar Login da aplicação

  Cenario: Realizar login na aplicação com usuário cadastrado
    Dado que clico no botao "Log in"
    E preencho os dados de login com usuário "cadastrado"
    Quando clico no botao Log in
    Entao visualizo a tela inicial com meu usuario logado
