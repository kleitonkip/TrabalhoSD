/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.contatos.msg;

import br.upf.contatos.msg.Request;
import br.upf.contatos.msg.model.ContatoBean;
import br.upf.contatos.msg.model.Operacao;

/**
 *
 * @author Mauricley
 */
public class RequestImpl implements Request {
    private Operacao operacao;
    private Integer idContato;
    private String cidade = null;
    private ContatoBean contato;
    
    @Override
    public Request getAll() {
        operacao = Operacao.GETALL;
        return this;
    }

    @Override
    public Request getById(Integer id) {
        operacao = Operacao.GETBYID;
        idContato = id;
        return this;
    }

    @Override
    public Request getByCidade(String cidade) {
        operacao = Operacao.GETBYCIDADE;
        this.cidade = cidade;
        return this;
    }

    @Override
    public Request insert(ContatoBean cb) {
        operacao = Operacao.INSERT;
        contato = cb;
        return this;
    }

    @Override
    public Request update(ContatoBean cb) {
        operacao = Operacao.UPDATE;
        contato = cb;
        return this;
    }

    @Override
    public Request delete(Integer id) {
        operacao = Operacao.DELETE;
        idContato = id;
        return this;
    }

    @Override
    public Request disconnect() {
        operacao = Operacao.DISCONNECT;
        return this;
    }
    
    @Override
    public Operacao getOperacao() {
        return operacao;
    }

    @Override
    public Integer getId() {
        return this.idContato;
    }

    @Override
    public ContatoBean getContato() {
        return this.contato;
    }

    @Override
    public String getCidade() {
        return this.cidade;
    }
}


