package pl.tomskr.playground.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping({"","/","index"})
    public void indexPage(){

    }
}