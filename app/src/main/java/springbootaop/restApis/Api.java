package springbootaop.restApis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootaop.service.UserService;

@RestController
public class Api
{
    @Autowired
    private UserService userService;
   @GetMapping("/")
    public String userLogin()
   {
       //call the method in MainService, which in turn calls the UserService
       userService.login();
       return "User login endpoint called successfully!";
   }
}
