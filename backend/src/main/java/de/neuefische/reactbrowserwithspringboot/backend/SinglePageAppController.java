package de.neuefische.reactbrowserwithspringboot.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SinglePageAppController {
    @RequestMapping(value = {
            "/",
            "/cat",
            // add every route you have in your react app here
    })
    public String index() {
        return "index.html";
    }
}
