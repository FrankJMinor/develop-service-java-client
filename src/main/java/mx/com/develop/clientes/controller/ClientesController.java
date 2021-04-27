package mx.com.develop.clientes.controller;

import mx.com.develop.clientes.dao.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    ClienteDAO clienteDAO;
    @RequestMapping("/informacion")
    public List<ClienteDAO> buscarTodos() {
        return clienteDAO.buscarTodos();
    }

    @GetMapping("/")
    public String index(){
        return "Primer api solo";
    }
}