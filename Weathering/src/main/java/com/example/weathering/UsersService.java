package com.example.weathering;

//import com.example.weathering.User;
//import com.example.weathering.repository.UsersRepository;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UsersService {
//
//
//    private final UsersRepository usersRepository;
//
//    public UsersService(UsersRepository usersRepository) {
//        this.usersRepository = usersRepository;
//    }
//
//    public User registerUser(String username, String password){
//        if (username == null || password == null) {
//            return null;
//        } else {
//            User user = new User();
//            user.setUsername(username);
//            user.setPassword(password);
//            return usersRepository.save(user);
//        }
//    }
//    public User authenticate(String username, String password){
//        return usersRepository.findByLoginAndPassword(username, password).orElse(null);
//
//    }
//}
