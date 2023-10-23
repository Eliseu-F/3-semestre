package com.sp.eliseu.grafo;

import java.util.ArrayList;

/**
 *
 * @author Eliseu
 */
public class Grafo<TIPO> {

    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;

    public Grafo() {
        this.vertices = new ArrayList<Vertice<TIPO>>();
        this.arestas = new ArrayList<Aresta<TIPO>>();
    }

    /*Passa um dado para o grafo e
    cria um NOVO VERTICE. 
    
    *É uma nova conexão ou nó.
    
    *Quando faz o new, chama o metodo construtor da classe vertice,
    e passa o valor do dado */
    public void adicionarVertice(TIPO dado) {
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.vertices.add(novoVertice);
    }

    
    public void adicionarAresta(Double peso, TIPO dadoInicio, TIPO dadoFim) {
        
            Vertice<TIPO> inicio = this.getVertice(dadoInicio);
            Vertice<TIPO> fim = this.getVertice(dadoFim);
            
            Aresta<TIPO> aresta = new Aresta<TIPO>(peso, inicio, fim);
            inicio.adicionarArestasSaida(aresta);
            fim.adicionarArestasEntrada(aresta);
            //guarda a aresta no grafo
            this.arestas.add(aresta);
    }
    
    //Metodo que retorna um VERTICE
    //Faz a busca de um DADO especifico
    public Vertice<TIPO> getVertice(TIPO dado){
        Vertice<TIPO> vertice = null; //retorna null se não encontrar vertice
                for(int i=0; i < this.vertices.size(); i++){
                    //verifica se o dado é igual ao dado informado
                    if(this.vertices.get(i).getDado().equals(dado)){
                        vertice = this.vertices.get(i);
                        break;
                    }
                }
                return vertice;
    }
            
}
