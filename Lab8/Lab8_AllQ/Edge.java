/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8_AllQ;

/**
 *
 * @author adina
 * @param <V>
 * @param <E>
 */
public class Edge <V extends Comparable <V>, E extends Comparable<E>>{
    Vertex<V,E>toVertex;
    E weight;
    Edge<V,E>nextEdge;

    public Edge() {
        toVertex=null;
        weight=null;
        nextEdge=null;
    }

    public Edge(Vertex<V, E> toVertex, E weight, Edge<V, E> nextEdge) {
        this.toVertex = toVertex;
        this.weight = weight;
        this.nextEdge = nextEdge;
    }
}




