package lk.ouath2.fb.controller;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
public class SignInController {

    @GetMapping("/")
    public String signIn(Principal principal) {
        Map<String, Object> details = (Map<String, Object>)
                ((OAuth2Authentication) principal).getUserAuthentication().getDetails();
        String userName = (String) details.get("name");
        return "Hi " + userName + " Welcome to my application !!";
    }

}
