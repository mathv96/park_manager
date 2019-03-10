package dao;

import model.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClientDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Client> list_clients = new ArrayList<>();
    
    public ClientDAO() {
        conn = new ConnectionFactory().getConnection();
    }
    
    public void insert(Client client){
        String sql = "INSERT INTO Client (NAME_CLIENT, CPF_CLIENT, EMAIL_CLIENT, DATA_NASC_CLIENT, SEXO_CLIENT, TEL_CLIENT, CEL_CLIENT) VALUES (?,?,?,?,?,?,?)";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, client.getName_client());
            stmt.setString(2, client.getCpf_client());
            stmt.setString(3, client.getEmail_client());
            stmt.setString(4, client.getData_nasc_client());
            stmt.setString(5, client.getSexo_client());
            stmt.setString(6, client.getTel_client());
            stmt.setString(7, client.getCel_client());
            stmt.execute();
            stmt.close();;
        }catch(Exception error){
            throw new RuntimeException("Erro 2: "+error);
        }
    }
    
    public void update(Client client){
        String sql = "UPDATE Client SET NAME_CLIENT = ?, CPF_CLIENT = ?, EMAIL_CLIENT = ?, DATA_NASC_CLIENT = ?, SEXO_CLIENT = ?, TEL_CLIENT = ?, CEL_CLIENT = ? WHERE ID_CLIENT = ?";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, client.getName_client());
            stmt.setString(2, client.getCpf_client());
            stmt.setString(3, client.getEmail_client());
            stmt.setString(4, client.getData_nasc_client());
            stmt.setString(5, client.getSexo_client());
            stmt.setString(6, client.getTel_client());
            stmt.setString(7, client.getCel_client());
            stmt.setInt(8, client.getId_client());
            stmt.execute();
            stmt.close();;
        }catch(Exception error){
            throw new RuntimeException("Erro 3: "+error);
        }
    }

    public void delete(Client client){
        String id_client = Integer.toString(client.getId_client());
        String sql = "DELETE FROM Client WHERE ID_CLIENT = " + id_client;
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
                Client item_client = new Client();
                item_client.setId_client(rs.getInt("ID_CLIENT"));
                item_client.setName_client(rs.getString("NAME_CLIENT"));
                item_client.setCpf_client(rs.getString("CPF_CLIENT"));
                item_client.setEmail_client(rs.getString("EMAIL_CLIENT"));
                item_client.setData_nasc_client(rs.getString("DATA_NASC_CLIENT"));
                item_client.setSexo_client(rs.getString("SEXO_CLIENT"));
                item_client.setTel_client(rs.getString("TEL_CLIENT"));
                item_client.setCel_client(rs.getString("CEL_CLIENT"));
                list_clients.add(item_client);
            }
        } catch (Exception error) {
            throw new RuntimeException("Erro 5: " + error);

        }
        return list_clients;
    }
    
    public ArrayList<Client> search_one(Client client) {
        String id_client = Integer.toString(client.getId_client());
        String sql = "SELECT * FROM Clients WHERE ID_CLIENT = "+ id_client;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Client item_client = new Client();
                item_client.setId_client(rs.getInt("ID_CLIENT"));
                item_client.setName_client(rs.getString("NAME_CLIENT"));
                item_client.setCpf_client(rs.getString("CPF_CLIENT"));
                item_client.setEmail_client(rs.getString("EMAIL_CLIENT"));
                item_client.setData_nasc_client(rs.getString("DATA_NASC_CLIENT"));
                item_client.setSexo_client(rs.getString("SEXO_CLIENT"));
                item_client.setTel_client(rs.getString("TEL_CLIENT"));
                item_client.setCel_client(rs.getString("CEL_CLIENT"));
                list_clients.add(item_client);
            }
        } catch (Exception error) {
            throw new RuntimeException("Erro 6: " + error);

        }
        return list_clients;
    }
    
    
}