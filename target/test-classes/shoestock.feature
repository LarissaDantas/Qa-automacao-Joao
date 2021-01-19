#language: pt
Funcionalidade: shoestock

  Esquema do Cenario: Deve inserir uma conta com sucesso
    Dado que acesso o site da shoestock <url>
    E seleciono o modelo de sandalias
    Quando seleciono a sandalia desejada
    Entao visualiso a sandalia no meu carrinho


  Exemplos:
    | url                           |
    | https://www.shoestock.com.br/ |