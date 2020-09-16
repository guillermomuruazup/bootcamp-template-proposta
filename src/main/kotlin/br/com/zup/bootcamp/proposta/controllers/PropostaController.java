package br.com.zup.bootcamp.proposta.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/proposta")
public class PropostaController {

    @PostMapping("/")
    @ResponseBody
    public PropostaResponse createNewProposta(@RequestBody final CreateNewPropostaRequest createNewPropostaRequest) {

        return "controller manda pro service que manda pro repository. porem estamos trabalhando sem service pois nao havera logica la";
    }

    @GetMapping("/")
    @ResponseBody
    public PropostaListResponse getAllProposta() {

        return "controller manda pro service que manda pro repository. porem estamos trabalhando sem service pois nao havera logica la";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public PropostaListResponse getProposta(@PathVariable String id) {

        return "controller manda pro service que manda pro repository. porem estamos trabalhando sem service pois nao havera logica la";
    }

}