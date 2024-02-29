package fsb.ucar.SaProject.controller;


import fsb.ucar.SaProject.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hello")
public class Sa_Controller {

    @GetMapping
    public Test getAll(){
        Test test = new Test("Hello", "Tous");
        return test ;
    }


}
