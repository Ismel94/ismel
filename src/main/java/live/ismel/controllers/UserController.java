package live.ismel.controllers;

import live.ismel.dto.UserDto;
import live.ismel.models.User;
import live.ismel.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ismel/messages")
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping("/save")
  public ResponseEntity<User> save(@RequestBody UserDto userDto){
    return userService.save(userDto);
  }
  @GetMapping("/list")
  public List<User> list(){
    return userService.list();
  }
}
