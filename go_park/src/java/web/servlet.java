package web;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dominio.EntidadeDominio;
import model.app.implement.Resultado;

import web.command.ICommand;
import web.command.implement.CadastrarCommand;
import web.vh.IVh;
import web.vh.implement.ClientVh;


public class servlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    private static Map<String, ICommand> commands;
    private static Map<String, IVh> vhs;
    
    public servlet() {
        
        commands = new HashMap<>();
        
        commands.put("CADASTRAR", new CadastrarCommand());
        commands.put("ALTERAR", new CadastrarCommand());
        commands.put("CONSULTAR", new CadastrarCommand());
        commands.put("LISTAR", new CadastrarCommand());
        commands.put("INATIVAR", new CadastrarCommand());
        
        vhs = new HashMap<>();
        
        vhs.put("Client", new ClientVh()); 
        
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String uri = req.getRequestURI();
        
        if ("/go_park/CadastroPage".equals(uri)){
            req.getRequestDispatcher("cadastrar_cliente.jsp");
        }
        else{
            req.getRequestDispatcher("cadastrar_cliente.jsp");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String tipo = req.getParameter("tipo");
		
        IVh vh = vhs.get(tipo);

        EntidadeDominio entidade = vh.getEntidade(req);

        String opcao = req.getParameter("opcao");

        ICommand command = commands.get(opcao);

        Resultado resultado = command.execute(entidade);

        vh.setView(resultado, req, resp);
        
    }
    
}
