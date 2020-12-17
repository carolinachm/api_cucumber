#language: pt
#encoding: UTF-8

Funcionalida: Teste de api

Cenario: Buscar usuarios
    Dado Eu execute o metodo GET
    Entao Eu devo ver os nome dos usuarios


Cenario: Criar usuario
    Dado Eu realizo a metodo POST

Cenario: Atualizar usuario
    Dado Eu realize o metodo Put
    E Eu realizo atualizo "/users/{userid}"


Cenario: Deletar usuario
    Dado Eu realize um POST para "/users"
    E Eu realizo um delete para "/users/{userid}"
        |userid| 
        |1     |
    E Eu realizo um GET com o paramentro "/users/{userid}"
        |userid| 
        |1     |
    Entao Eu "não deveria" ver o nome "George"
