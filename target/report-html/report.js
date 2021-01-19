$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/shoestock.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "shoestock",
  "description": "",
  "id": "shoestock",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Deve inserir uma conta com sucesso",
  "description": "",
  "id": "shoestock;deve-inserir-uma-conta-com-sucesso",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 5,
  "name": "que acesso o site da shoestock \u003curl\u003e",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "seleciono o modelo de sandalias",
  "keyword": "E "
});
formatter.step({
  "line": 7,
  "name": "seleciono a sandalia desejada",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "visualiso a sandalia no meu carrinho",
  "keyword": "Entao "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "shoestock;deve-inserir-uma-conta-com-sucesso;",
  "rows": [
    {
      "cells": [
        "url"
      ],
      "line": 12,
      "id": "shoestock;deve-inserir-uma-conta-com-sucesso;;1"
    },
    {
      "cells": [
        "https://www.shoestock.com.br/"
      ],
      "line": 13,
      "id": "shoestock;deve-inserir-uma-conta-com-sucesso;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 13,
  "name": "Deve inserir uma conta com sucesso",
  "description": "",
  "id": "shoestock;deve-inserir-uma-conta-com-sucesso;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 5,
  "name": "que acesso o site da shoestock https://www.shoestock.com.br/",
  "matchedColumns": [
    0
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "seleciono o modelo de sandalias",
  "keyword": "E "
});
formatter.step({
  "line": 7,
  "name": "seleciono a sandalia desejada",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "visualiso a sandalia no meu carrinho",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.shoestock.com.br/",
      "offset": 31
    }
  ],
  "location": "Steps.AcessoOSitedaSky(String)"
});
formatter.result({
  "duration": 8832352900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.selecionoOModeloDeSandalias()"
});
formatter.result({
  "duration": 2745173200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.selecionoASandaliaDesejada()"
});
formatter.result({
  "duration": 9686175400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.visualisoASandaliaNoMeuCarrinho()"
});
formatter.result({
  "duration": 3700902900,
  "status": "passed"
});
});