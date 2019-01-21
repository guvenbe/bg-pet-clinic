package guru.springframework.bgpetclinic.Controllers;

import guru.springframework.bgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    public VetController(VetService vetService) {

        this.vetService = vetService;
    }


    private final VetService vetService;

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listOwners(Model model){
        model.addAttribute("vets", vetService.findAll());
        System.out.println(vetService.toString());
        return "vets/index";
    }
}
