package mx.com.develop.clientes.dao;

import mx.com.develop.clientes.dto.ClienteDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
@Transactional(readOnly = true, rollbackFor = Exception.class)
public interface IClienteDAO {

}