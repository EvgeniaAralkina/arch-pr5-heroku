package messagingstompwebsocket.Repositorys;

import messagingstompwebsocket.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
