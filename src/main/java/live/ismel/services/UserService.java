package live.ismel.services;

import live.ismel.dto.UserDto;
import live.ismel.models.User;
import live.ismel.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public ResponseEntity<User> save(UserDto userDto){
    User user = null;
      user = new User(userDto.getName(), userDto.getEmail(), userDto.getMessage());
      userRepository.save(user);
    return ResponseEntity.ok(user);
  }
  public List<User> list(){
    return userRepository.findAll();
  }
}
