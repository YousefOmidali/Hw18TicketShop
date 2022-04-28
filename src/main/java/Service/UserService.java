package Service;

import Entity.Users;
import Repository.UserRepository;


public class UserService {
    UserRepository userRepository = new UserRepository();

    public void save(Users user) {
        userRepository.save(user);
    }

    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    public void update(Users user) {
        userRepository.update(user);
    }

    public Users Login(String username, String password) {
        return userRepository.login(username, password);
    }

    public Users findById(Integer id) {
        return userRepository.findById(id);
    }
}
