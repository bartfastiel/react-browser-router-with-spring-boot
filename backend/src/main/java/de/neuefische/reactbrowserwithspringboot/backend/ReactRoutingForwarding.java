package de.neuefische.reactbrowserwithspringboot.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReactRoutingForwarding {

    @RequestMapping(value={"{path:^(?!index\\.html|favicon\\.ico|api|static).*$}/**"})
    public String forwardToRootUrl() {
        return "forward:/";
    }
}