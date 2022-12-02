package org.soulcodeacademy.empresa.controller;

import org.soulcodeacademy.empresa.domain.Empregado;
import org.soulcodeacademy.empresa.services.EmpregadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpregadoController {

    @Autowired
    private EmpregadoService empregadoService;

    //listar todos os empregados
    @GetMapping("/empregados")
    public List<Empregado> listarEmpregados(){
        return this.empregadoService.listarEmpregados();
    }

    //listar empregado por id
    @GetMapping("/empregados/{idEmpregado}")
    public Empregado getEmpregadoById(@PathVariable Integer idEmpregado){
        return this.empregadoService.getEmpregadoById(idEmpregado);
    }

    //Adicionar novo usuário

}
