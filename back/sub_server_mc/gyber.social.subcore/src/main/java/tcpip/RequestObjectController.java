package tcpip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.AuthDataUser;
import dao.User;
import security.UserDataSecurity;

@Controller

@RequestMapping("/subservice")
@ResponseBody
public class RequestObjectController {


    @Autowired
    private UserDataSecurity security;


    @GetMapping("/auth")
    public ResponseEntity authUserAndReturnEntity(@RequestBody AuthDataUser authDataUser){
        if(authDataUser == null){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
            
        }else if(authDataUser.getEmail().isEmpty() | authDataUser.getEmail() == null 
                | authDataUser.getPassword().isEmpty() | authDataUser.getPassword() == null){
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok().build();
    }


    @PostMapping("/log")
    public ResponseEntity logInUser(@RequestBody User user){
        // ...
        return ResponseEntity.ok().build();
    }


    @PutMapping("/put")
    public ResponseEntity putUserData(@RequestBody User userDataForUpdate){
        // ...
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/del")
    public ResponseEntity deleteUser(@RequestParam Integer id){

        // ...
        return ResponseEntity.ok().build();
    }






}
