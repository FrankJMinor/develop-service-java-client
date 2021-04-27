package mx.com.develop.clientes.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteDAO implements Client {


    public ClienteDAO(String id, String lenguaje, String nombre) {

    }

    public List<ClienteDAO> buscarTodos() {
        List<ClienteDAO> lista= new ArrayList<ClienteDAO>();
        lista.add(new ClienteDAO ("1","java","pedro"));
        lista.add(new ClienteDAO ("2","python","gema"));

        return lista;
    }
}
