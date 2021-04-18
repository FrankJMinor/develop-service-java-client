package mx.com.develop.clientes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ClientesController {

    @GetMapping("/")
    public String index(){
        return "Primer api solo";
    }
}