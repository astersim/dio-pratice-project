package com.digitalinnovation.ast.service;

import com.digitalinnovation.ast.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente bucarPorId(Long id);

    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
