package messagingstompwebsocket.Service;

import messagingstompwebsocket.Models.User;
import messagingstompwebsocket.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }

    public User findById(Integer id){
        return userRepository.findById(id).get();
    }
}
