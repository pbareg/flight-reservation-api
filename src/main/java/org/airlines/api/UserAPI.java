package org.airlines.api;

import org.airlines.bean.UserBean;
import org.airlines.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by pbaregal on 5/14/2019.
 */
@RestController
public class UserAPI {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/users")
    public ResponseEntity<List<UserBean>> getUsers(){
      List<UserBean> users= (List<UserBean>) userRepo.findAll();
    return new ResponseEntity<List<UserBean>>(users,HttpStatus.OK);
    }

    @PostMapping(value = "/user",consumes = "application/json", produces = "application/json")
    public ResponseEntity<UserBean> postUser(@RequestBody UserBean bean){
        UserBean user=userRepo.save(bean);
        return new ResponseEntity<UserBean>(user,HttpStatus.OK);
    }
    @GetMapping("/user/{username}")
    public ResponseEntity<UserBean> getUser(@PathVariable(name = "username") String username){
        UserBean user=  userRepo.findOne(username);
        return new ResponseEntity<UserBean>(user,HttpStatus.OK);
    }
}
