package br.com.diogo.misc.controller;

import br.com.diogo.misc.model.Cliente;
import br.com.diogo.misc.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/cliente")
    public String mostrarFormularioCliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        model.addAttribute("clientes", clienteRepository.findAll());
        return "cadastro-cliente";
    }

    @PostMapping("/cliente/save")
    public String salvarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
        return "redirect:/cliente";
    }

}
