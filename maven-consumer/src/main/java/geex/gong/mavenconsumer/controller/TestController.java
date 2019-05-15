package geex.gong.mavenconsumer.controller;


import geex.gong.mavencommon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired(required = false)
    public UserService userService;

    @RequestMapping("/say")
    public Object say(){
        return userService.say();
    }
}

