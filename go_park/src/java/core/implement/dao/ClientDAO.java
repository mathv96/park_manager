package core.implement.dao;

import core.IDao;
import core.util.ConnectionFactory;
import model.dominio.implement.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClientDAO implements IDao{

    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Client> lists = new ArrayList<>();
    
    public ClientDAO() {
        conn = new ConnectionFactory().getConnection();
    }
    
    public void insert(Client client){
        String sql = "INSERT INTO Client (NAME, CPF, EMAIL, DATA_NASC, SEXO, TEL, CEL) VALUES (?,?,?,?,?,?,?)";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, client.getName());
            stmt.setString(2, client.getCpf());
            stmt.setString(3, client.getEmail());
            stmt.setString(4, client.getDast_nasc());
            stmt.setString(5, client.getSexo());
            stmt.setString(6, client.getTel());
            stmt.setString(7, client.getCel());
            stmt.execute();
            stmt.close();;
        }catch(Exception error){
            throw new RuntimeException("Erro 2: "+error);
        }
    }
    
    public void update(Client client){
        String sql = "UPDATE Client SET NAME = ?, CPF = ?, EMAIL = ?, DATA_NASC = ?, SEXO = ?, TEL = ?, CEL = ? WHERE ID = ?";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, client.getName());
            stmt.setString(2, client.getCpf());
            stmt.setString(3, client.getEmail());
            stmt.setString(4, client.getDast_nasc());
            stmt.setString(5, client.getSexo());
            stmt.setString(6, client.getTel());
            stmt.setString(7, client.getCel());
            stmt.setInt(8, client.getId());
            stmt.execute();
            stmt.close();;
        }catch(Exception error){
            throw new RuntimeException("Erro 3: "+error);
        }
    }

    public void delete(Client client){
        String id = Integer.toString(client.getId());
        String sql = "DELETE FROM Client WHERE ID = " + id;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        }catch(Exception error){
            throw new RuntimeException("Erro 4: "+error);

        }
    }
    
    public ArrayList<Client> search_list_all(Client client) {
        String sql = "SELECT * FROM Clients";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Client item = new Client();
                item.setId(rs.getInt("ID"));
                item.setName(rs.getString("NAME"));
                item.setCpf(rs.getString("CPF"));
                item.setEmail(rs.getString("EMAIL"));
                item.setDast_nasc(rs.getString("DATA_NASC"));
                item.setSexo(rs.getString("SEXO"));
                item.setTel(rs.getString("TEL"));
                item.setCel(rs.getString("CEL"));
                lists.add(item);
            }
        } catch (Exception error) {
            throw new RuntimeException("Erro 5: " + error);

        }
        return lists;
    }
    
    public ArrayList<Client> search_one(Client client) {
        String id = Integer.toString(client.getId());
        String sql = "SELECT * FROM Clients WHERE ID = "+ id;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Client item = new Client();
                item.setId(rs.getInt("ID"));
                item.setName(rs.getString("NAME"));
                item.setCpf(rs.getString("CPF"));
                item.setEmail(rs.getString("EMAIL"));
                item.setDast_nasc(rs.getString("DATA_NASC"));
                item.setSexo(rs.getString("SEXO"));
                item.setTel(rs.getString("TEL"));
                item.setCel(rs.getString("CEL"));
                lists.add(item);
            }
        } catch (Exception error) {
            throw new RuntimeException("Erro 6: " + error);

        }
        return lists;
    }
    
    
}