package com.example.rocketseatbootcamp.tarefa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private ITarefaRepository iTarefaRepository;

    @PostMapping("/")
    public TarefaModel create(@RequestBody TarefaModel tarefaModel) {
        var tarefa = this.iTarefaRepository.save(tarefaModel);
        return tarefa;
    }

}
