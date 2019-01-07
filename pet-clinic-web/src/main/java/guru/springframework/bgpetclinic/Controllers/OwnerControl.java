package guru.springframework.bgpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerControl {

    @RequestMapping({"", "/",  "/index", "/index.html"})
    public String listOwners(){
        return "owners/index";
    }

}
