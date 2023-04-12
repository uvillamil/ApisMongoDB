package Proyecto.global.seguridad.Repositorios;

import Proyecto.global.seguridad.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioRol extends MongoRepository<Rol,String> {
}
