#language: pt
#enconding: UTF-8

  @web @apagaEndereco

  Funcionalidade: Apagar enderecos no site

    Cenario: Deve apagar endereco no site com sucesso
      Dado que acesso a pagina inicial do site com usuario logado
      E clico em meu email
      E vou em Addresses
      Quando clico em Delete
      Entao o endereco e excluido