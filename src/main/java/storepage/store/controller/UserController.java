package storepage.store.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import storepage.store.model.User;
import storepage.store.service.AjaxResponseBody;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class UserController {


    @RequestMapping(value = {"/","/login"}, method = RequestMethod.GET)
    public ModelAndView login() {
        User user = new User();
        user.setEmailUser("aaaaaaaa");
        return new ModelAndView("login", "user", user);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(@Valid @ModelAttribute("user") User user, BindingResult bindingResult){

        //employeeService.insertEmployee(emp);
        //List<Employee> employees = employeeService.getAllEmployees();
        ModelAndView model;



        if("aaa".equals(user.getEmailUser())) {

             model = new ModelAndView("redirect:/welcome");
        }else{
             model = new ModelAndView("login");
        }
        if(bindingResult.hasErrors()){
            model.addObject("bindingResult",bindingResult);

        }else{
            model.addObject("bindingResult",bindingResult);

        }

        // model.addObject("employees", employees);
        return model;

    }


    @PostMapping("/searchUser")
    public ResponseEntity<?> searchUser(
            @Valid @RequestBody User user, Errors errors) {

        AjaxResponseBody result = new AjaxResponseBody();

        if (errors.hasErrors()) {

            result.setMsg(errors.getAllErrors()
                    .stream().map(x -> x.getDefaultMessage())
                    .collect(Collectors.joining(",")));

            return ResponseEntity.badRequest().body(result);

        }


        result.setMsg("success");
        return ResponseEntity.ok(result);

    }


}
