package mx.com.develop.clientes.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true, rollbackFor = Exception.class)
public interface IClienteDAO {

}