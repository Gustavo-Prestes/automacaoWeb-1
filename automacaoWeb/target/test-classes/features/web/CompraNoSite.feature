#language: pt
#enconding: UTF-8

@web @compra
Funcionalidade: Realizar compra no site

    Cenario: Compra no cartao de credito
      Dado que acesso a pagina inicial do site com usuario logado
      E seleciono o produto
      E escolho as especificacoes desejadas
      Quando preencho os dados de envio e pagamento
      Entao visualizo a mensagem "Thank You"