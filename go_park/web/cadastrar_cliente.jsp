<%-- 
    Document   : cadastrare
    Created on : Mar 10, 2019, 8:57:05 PM
    Author     : matheus96
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <div>
          <form action="CadastrarClient" method="POST" id="form_cadastro">
              <div>
                <input type="hidden" name="tipo" value="Client" />
                <input type="hidden" name="opcao" value="CADASTRAR" />
              </div>
              <div>
                <label for="nome">Name:</label>
                <input type="text" name="name"><br>
              </div>
              <div>
                <label for="nome">CPF:</label>
                <input type="text" name="cpf">
              </div>
              <div>
                <label for="nome">E-mail:</label>
                <input type="text" name="sexo">
              </div>
              <div>
                <label for="nome">Sexo:</label>
                <input type="text" name="email">
              </div>
              <div>
                <label for="nome">Telefone:</label>
                <input type="text" name="tel">
              </div>
              <div>
                <label for="nome">Celular:</label>
                <input type="text" name="tel">
              </div>
           </form> 
           <button type="submit" form="form_cadastro" value="Submit">Cadastrar</button>
        </div>
    </body>
</html>
