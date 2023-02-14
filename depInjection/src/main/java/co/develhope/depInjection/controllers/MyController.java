package co.develhope.depInjection.controllers;

import co.develhope.depInjection.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;


    public MyController(MyService myService) {
        System.out.println("MyController constructor has been called");
        this.myService = myService;
    }

    @GetMapping("/")
    public String welcomeMessage(){
        return "Hello User!";
    }


    @GetMapping("/getName")
    public String getControllerName(){
        System.out.println("MyController.getControllerName() has been called");
        return myService.getName();
    }


}
