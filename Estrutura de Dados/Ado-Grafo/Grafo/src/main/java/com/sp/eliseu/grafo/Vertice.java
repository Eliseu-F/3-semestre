package com.sp.eliseu.grafo;

import java.util.ArrayList;

/**
 *
 * @author Eliseu
 */
public class Vertice<TIPO> {

    //O vertice ou Nó possui um dado, uma informação dentro dele
    private TIPO dado;
    private ArrayList<Aresta<TIPO>> arestasEntrada;
    private ArrayList<Aresta<TIPO>> arestasSaida;

    /*Quando eu criar o vertice, eu passo um valor pra ele
    que pode ser uma String com o nome, por exemplo*/
    public Vertice(TIPO valor) {
        this.dado = valor;
        this.arestasEntrada = new ArrayList<Aresta<TIPO>>();
        this.arestasSaida = new ArrayList<Aresta<TIPO>>();
    }

    public TIPO getDado() {
        return dado;
    }

    public void setDado(TIPO dado) {
        this.dado = dado;
    }

    /*Sempre que um vértice se conectar a outro,
      terá aresta de entrada e aresta de saida*/

 /*da um set para o valor de entrada, ou seja, onde começa a aresta*/
    public void adicionarArestasEntrada(Aresta<TIPO> aresta) {
        this.arestasEntrada.add(aresta);
    }

    //da um set para o valor de saida, onde termina a aresta
    public void adicionarArestasSaida(Aresta<TIPO> aresta) {
        this.arestasSaida.add(aresta);
    }

}
