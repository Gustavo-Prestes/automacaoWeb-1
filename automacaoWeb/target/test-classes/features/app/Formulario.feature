#language: pt
#encoding: UTF-8


Funcionalidade: Teste execucao App

  @mobile @formulario
  Cenario: Execucao App
    Dado que toco na opção "Formulario"
    E preencho os campos do formulario
    Quando clico em salvar
    Entao valido as opcoes validas na tela
