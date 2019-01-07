package guru.springframework.bgpetclinic.Controllers;

import guru.springframework.bgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerControl {

    private final OwnerService ownerService;

    public OwnerControl(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/",  "/index", "/index.html"})
    public String listOwners(Model model){
        model.addAttribute("owners", ownerService.findAll());
        System.out.println(ownerService.toString());
        return "owners/index";
    }

}
