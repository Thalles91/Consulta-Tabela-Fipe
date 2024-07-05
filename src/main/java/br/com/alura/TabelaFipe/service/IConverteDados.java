package br.com.alura.TabelaFipe.service;

import java.util.List;

public interface IConverteDados {

    //adicionaremos aquela estrutura genérica que irá converter dados de uma classe para a classe que escolhermos.
    <T> T obterdados(String json, Class<T> classe);

    <T> List<T> obterLista(String json, Class<T> classe);


}
