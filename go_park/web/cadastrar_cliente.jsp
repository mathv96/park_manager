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
                 <fieldset>
                    <legend>Cliente</legend>
                    <div>
                      <input type="hidden" name="tipo" value="Client" />
                      <input type="hidden" name="opcao" value="CADASTRAR" />
                    </div>
                    <div>
                      <label for="nome">Nome:</label>
                      <input type="text" name="nome"><br>
                    </div>
                    <div>
                      <label for="cpf">CPF:</label>
                      <input type="text" name="cpf">
                    </div>
                    <div>
                      <label for="email">E-mail:</label>
                      <input type="text" name="email">
                    </div>
                    <div>
                      <label for="sexo">Sexo:</label>
                      <input type="text" name="sexo">
                    </div>
                    <div>
                      <label for="data_nasc">Data de nascimento:</label>
                      <input type="text" name="data_nasc">
                    </div>
                    <div>
                      <label for="tel">Telefone:</label>
                      <input type="text" name="tel">
                    </div>
                    <div>
                      <label for="cel">Celular:</label>
                      <input type="text" name="cel">
                    </div>
                </fieldset>
                <fieldset>
                    <legend>Endereço</legend>
                    <div>
                      <label for="nome_endereco">Nome: (ex: casa)</label>
                      <input type="text" name="nome_endereco">
                    </div>
                    <div>
                        <div>
                            <label for="rua">Rua:</label>
                            <input type="text" name="Rua">
                        </div>
                        <div>
                            <label for="numero_casa">Número casa:</label>
                            <input type="text" name="numero_casa">
                        </div>
                    </div>
                    <div>
                        <label for="bairro">Bairro:</label>
                        <input type="text" name="bairro">
                    </div>
                    <div>
                        <label for="bairro">Cidade</label>
                        <select>
                            <option value="mogi">Mogi das Cruzes</option>
                            <option value="suzano">Suzano</option>
                            <option value="biritiba">Biritiba Mirim</option>
                            <option value="guararema">Guararema</option>
                        </select> 
                    </div>
                    <div>
                        <label for="cep">CEP:</label>
                        <input type="text" name="cep">
                    </div>
                    <div>
                        <label for="complemento">Complemento:</label>
                        <input type="text" name="complemento">
                    </div>
                    <div>
                        <label for="referencia">Referência:</label>
                        <input type="text" name="referencia">
                    </div>
                    
                </fieldset>
                <fieldset>
                    <legend>Veículo</legend>
                    <div>
                        <label for="placa">Placa:</label>
                        <input type="text" name="placa">
                    </div>
                    <div>
                        <label for="marca">Marca:</label>
                        <input type="text" name="marca">
                    </div>
                    <div>
                        <label for="modelo">Modelo:</label>
                        <input type="text" name="modelo">
                    </div>
                </fieldset>
            </form> 
            <button type="submit" form="form_cadastro" value="Submit">Cadastrar</button>
        </div>
    </body>
</html>
