/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8_AllQ;

/**
 *
 * @author adina
 */
public class TestUndirectedGraph {
    public static void main(String[] args) {
        
        Graph<String,Integer>graph=new Graph<>();
        String[]cities={"Alor Setar","Kuching","Langkawi","Melaka","Penang","Tawau"};
        for(String i:cities)
            graph.addVertex(i);
        //display the number of vertices in the graph
        System.out.println("The number of vertices in graph: "+graph.getSize());
        
        //display the cities
        System.out.println("Cities and their vertices ");
        for(int i=0;i<=graph.getSize()-1;i++)
            System.out.print(i+": "+graph.getVertex(i)+"\t");
        System.out.println();
        
        //test to see if some cities are vertices of the graph
        System.out.println("\n-Check if some vertices is in the graph-");
        System.out.println("Is Melaka in the Graph? "+graph.hasVertex("Melaka"));
        System.out.println("Is Ipoh in the Graph? "+graph.hasVertex("Ipoh"));
        
        //Check the index of vertices/cities
        System.out.println("\n-Check the index of vertices/cities-");
        System.out.println("Kuching at index: "+graph.getVertexIndex("Kuching"));
        System.out.println("Ipoh at index: "+graph.getVertexIndex("Ipoh"));
        
        
        //Add undirected edges to the graph
        System.out.println("\n-Add undirected edges to graph-");
        System.out.println("Add edge Kuching - Melaka "+graph.addUndirectedEdge("Kuching", "Melaka", 800));
        System.out.println("Add edge Langkawi - Penang "+graph.addUndirectedEdge("Langkawi", "Penang", 100));
        System.out.println("Add edge Penang - Melaka "+graph.addUndirectedEdge("Melaka", "Penang", 400));
        System.out.println("Add edge Alor Setar - Kuching "+graph.addUndirectedEdge("Alor Setar", "Kuching", 1200));
        System.out.println("Add edge Tawau - Alor Setar "+graph.addUndirectedEdge("Tawau", "Alor Setar", 1900));
        System.out.println("Add edge Kuching - Tawau "+graph.addUndirectedEdge("Kuching", "Tawau", 900));
        System.out.println("Add edge Langkawi - Ipoh "+graph.addUndirectedEdge("Langkawi", "Ipoh", 200));
        
        //Check if there are edges between vertices/cities
        System.out.println("\n-Check if there are edges between vertices/cities-");
        System.out.println("Has edge from Kuching to Melaka? "+graph.hasEdge("Kuching", "Melaka"));
        System.out.println("Has edge from Melaka to Kuching? "+graph.hasEdge("Melaka", "Kuching"));
        System.out.println("Has edge from Ipoh to Langkawi? "+graph.hasEdge("Ipoh", "Langkawi"));
        
        //Get the weight of some edges in the graph
        System.out.println("\n-Get the weight of some edges in the graph-");
        System.out.println("Weight of edge from Kuching to Melaka? "+graph.getEdgeWeight("Kuching", "Melaka"));
        System.out.println("Weight of edge from Tawau to Alor Setar? "+graph.getEdgeWeight("Tawau", "Alor Setar"));
        System.out.println("Weight of edge from Semporna to Ipoh? "+graph.getEdgeWeight("Semporna", "Ipoh"));
        
        //Get the in and out degree of some vertices/cities
        System.out.println("\n-Get the in and out degree of some vertices/cities-");
        System.out.println("In and out degree for Kuching is "+graph.getIndeg("Kuching")+" and "+graph.getOutdeg("Kuching"));
        System.out.println("In and out degree for Penang is "+graph.getIndeg("Penang")+" and "+graph.getOutdeg("Penang"));
        System.out.println("In and out degree for Ipoh is "+graph.getIndeg("Ipoh")+" and "+graph.getOutdeg("Ipoh"));
    
        //Get the neighbours of Kuching
        System.out.println("\n-Get the neighbours of Kuching-");
        System.out.println("Neighbours of Kuching is "+graph.getNeighbours("Kuching"));
        
        //Print all edges
        System.out.println("\nPrint Edges: ");
        graph.printEdges();
        
        //Remove some undirected edges
        System.out.println();
        graph.removeUndirectedEdge("Kuching", "Melaka");
        graph.removeUndirectedEdge("Langkawi", "Penang");
        
        //Print all edges
        System.out.println("\nPrint Edges: ");
        graph.printEdges();
    }
}
