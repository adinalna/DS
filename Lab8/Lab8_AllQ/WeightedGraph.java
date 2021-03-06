/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8_AllQ;

import java.util.ArrayList;

/**
 *
 * @author adina
 * @param <V>
 * @param <E>
 */
public class WeightedGraph <V extends Comparable <V>, E extends Comparable<E>>{
    Vertex<V,E>head;
    Vertex<V,E>tail;
    int size;
    
    public WeightedGraph(){
        head=null;
        size=0;        
    }
    
    //get the size of the graph
    public int getSize(){
        return this.size;
    }
    
    //Check if a vertex is in the graph
    public boolean hasVertex(V v){
        if(head==null)
            return false;
        Vertex<V,E>temp=head;
        while(temp!=null){
            if(temp.vertexInfo.compareTo(v)==0)
                return true;
            temp=temp.nextVertex;
        }
        return false;
    }
    
    //get the inDeg of a vertex
    public int getIndeg(V v){
        if(hasVertex(v)==true){
            Vertex<V,E>temp=head;
            while(temp!=null){
                if(temp.vertexInfo.compareTo(v)==0)
                    return temp.indeg;
                temp=temp.nextVertex;
            }
        }
        return -1;
    }
    
    //get the outDeg of a vertex
    public int getOutdeg(V v){
        if(hasVertex(v)==true){
            Vertex<V,E>temp=head;
            while(temp!=null){
                if(temp.vertexInfo.compareTo(v)==0)
                    return temp.outdeg;
                temp=temp.nextVertex;
            }
        }
        return -1;
    }
    
    //Add vertex 
    public boolean addVertex(V v){
        if(hasVertex(v)==false){
            Vertex<V,E>temp=head;
            Vertex<V,E>newVertex=new Vertex<>(v,null);
            if(head==null)
                head=tail=newVertex;
            else{
                tail.nextVertex=newVertex;
                tail=newVertex;
            }
            size++;
            return true;
        }else
            return false;
    }
    
    //get index of a vertex
    public int getVertexIndex(V v){
        Vertex<V,E>temp=head;
        int index=0;
        if(hasVertex(v)==true){
            while(temp!=null){
                if(temp.vertexInfo.compareTo(v)==0)
                    return index;
                temp=temp.nextVertex;
                index++;
            }
        }
        return -1;
    }
    
    //return all vertex info to an ArrayList
    public ArrayList<V> getAllVertex(){
        ArrayList<V>list=new ArrayList<>();
        Vertex<V,E>temp=head;
        while(temp!=null){
            list.add(temp.vertexInfo);
            temp=temp.nextVertex;
        }
        return list;
    }
    
    //get vertex info at a specific index
    public V getVertex(int index){
        if(index<0||index>size-1)
            return null;
        Vertex<V,E>temp=head;
        for(int i=0;i<index;i++){
            temp=temp.nextVertex;
        }
        return temp.vertexInfo;
    }
    
    //check whether there is an edge
    public boolean hasEdge(V source,V destination){
        if(head==null)
            return false;
        if(!hasVertex(source)||!hasVertex(destination))
            return false;
        Vertex<V,E>sourceVertex=head;
        while(sourceVertex!=null){
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                Edge<V,E>currentEdge=sourceVertex.firstEdge;
                while(currentEdge!=null){
                    if(currentEdge.toVertex.vertexInfo.compareTo(destination)==0)
                        return true;
                    currentEdge=currentEdge.nextEdge;
                }
            }
            sourceVertex=sourceVertex.nextVertex;
        }
        return false;
    }
        
    //add new edge
    public boolean addEdge(V source, V destination, E weight){
        if(head==null)
            return false;
        if(!hasVertex(source)||!hasVertex(destination))
            return false;
        Vertex<V,E>sourceVertex=head;
        while(sourceVertex!=null){
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                Vertex<V,E>destinationVertex=head;
                while(destinationVertex!=null){
                    if(destinationVertex.vertexInfo.compareTo(destination)==0){
                        Edge<V,E>currentEdge=sourceVertex.firstEdge;
                        Edge<V,E>newEdge=new Edge<>(destinationVertex,weight,currentEdge);
                        sourceVertex.firstEdge=newEdge;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        return true;
                    }
                destinationVertex=destinationVertex.nextVertex;
                }
            }
            sourceVertex=sourceVertex.nextVertex;
        }
        return false;
    }
    
    //1. Create an addUndirectedEdge method that creates undirected edges.
    //This method receives two vertices and a weight and return a boolean. 
    public boolean addUndirectedEdge(V v1, V v2, E weight){
        if(head==null)
            return false;
        if(!hasVertex(v1)||!hasVertex(v2))
            return false;
        V source,destination;
        for(int i=0;i<2;i++){
            if(i==0){
                source=v1;
                destination=v2;
            }else{
                source=v2;
                destination=v1;
            }
            Vertex<V,E>sourceVertex=head;
            while(sourceVertex!=null){
                if(sourceVertex.vertexInfo.compareTo(source)==0){
                    Vertex<V,E>destinationVertex=head;
                    while(destinationVertex!=null){
                        if(destinationVertex.vertexInfo.compareTo(destination)==0){
                            Edge<V,E>currentEdge=sourceVertex.firstEdge;
                            Edge<V,E>newEdge=new Edge<>(destinationVertex,weight,currentEdge);
                            sourceVertex.firstEdge=newEdge;
                            sourceVertex.outdeg++;
                            destinationVertex.indeg++;
                            //return true if edges for both vertices are added
                            //for undirected edges
                            if(i==1)
                                return true;
                        }
                    destinationVertex=destinationVertex.nextVertex;
                    }   
                }
                sourceVertex=sourceVertex.nextVertex;
            }
        }
        return false;
    }
    
    //get edge index(for Q2 removeEdge method)
    public int getEdgeIndex(V source,V destination){
        if(head==null)
            return -1;
        if(!hasVertex(source)||!hasVertex(destination))
            return -1;
        Vertex<V,E>sourceVertex=head;
        while(sourceVertex!=null){
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                int index=0;//index for edge
                Edge<V,E>currentEdge=sourceVertex.firstEdge;
                while(currentEdge!=null){
                    if(currentEdge.toVertex.vertexInfo.compareTo(destination)==0)
                        return index;
                    currentEdge=currentEdge.nextEdge;
                    index++;
                }
            }
            sourceVertex=sourceVertex.nextVertex;
        }
        return -1;
    }
   
   //remove first edge of a vertex
   public void removeFirstEdge(V source){
        Vertex<V,E>sourceVertex=head;
        while(sourceVertex!=null){
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                Edge<V,E>removedEdge=sourceVertex.firstEdge;
                sourceVertex.firstEdge=removedEdge.nextEdge;
                sourceVertex.outdeg--;
                removedEdge.toVertex.indeg--;
                System.out.println("Removed: ["+source+","+removedEdge.toVertex.vertexInfo+"]");
                removedEdge=null;
            }
            sourceVertex=sourceVertex.nextVertex;
        }  
    }
    
    //2. Create a method removeEdge that removes an edge if 
    //the source and destination of the edge is given
    public void removeEdge(V source,V destination){
        int index=getEdgeIndex(source,destination);
        if(index<0||index>size-1)
            System.out.println("Invalid index");
        else if(index==0)
            removeFirstEdge(source);
        else{
            Vertex<V,E>sourceVertex=head;
            while(sourceVertex!=null){
                if(sourceVertex.vertexInfo.compareTo(source)==0){
                    Edge<V,E>prevEdge=sourceVertex.firstEdge;
                    for(int i=0;i<index-1;i++){
                        prevEdge=prevEdge.nextEdge; 
                    }
                    Edge<V,E>removedEdge=prevEdge;
                    prevEdge.nextEdge=removedEdge.nextEdge;
                    sourceVertex.outdeg--;
                    removedEdge.toVertex.indeg--;
                    removedEdge=null;
                    System.out.println("Removed: ["+source+","+destination+"]");
                }
                sourceVertex=sourceVertex.nextVertex;
            }
        }                   
    }
    
    
    //retrieve the weight of an edge
    public E getEdgeWeight(V source,V destination){
        if(head==null)
            return null;
        if(!hasVertex(source)||!hasVertex(source))
            return null;
        Vertex<V,E>sourceVertex=head;
        while(sourceVertex!=null){
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                Edge<V,E>currentEdge=sourceVertex.firstEdge;
                while(currentEdge!=null){
                    if(currentEdge.toVertex.vertexInfo.compareTo(destination)==0){
                        return currentEdge.weight;
                    }
                    currentEdge=currentEdge.nextEdge;
                }
            }
            sourceVertex=sourceVertex.nextVertex;
        }
        return null;
    }
    
    //return all neighbours(adjacent vertices) to an ArrayList
    public ArrayList<V> getNeighbours(V v){
        if(!hasVertex(v))
            return null;
        ArrayList<V>list=new ArrayList<>();
        Vertex<V,E>sourceVertex=head;
        while(sourceVertex!=null){
            if(sourceVertex.vertexInfo.compareTo(v)==0){
                Edge<V,E>currentEdge=sourceVertex.firstEdge;
                while(currentEdge!=null){
                    list.add(currentEdge.toVertex.vertexInfo);
                    currentEdge=currentEdge.nextEdge;
                }
            }
            sourceVertex=sourceVertex.nextVertex;
        }
        return list;
    }
    
    //print graph
    public void printEdges(){
        Vertex<V,E>temp=head;
        while(temp!=null){
            System.out.print("# "+temp.vertexInfo+" : ");
            Edge<V,E>currentEdge=temp.firstEdge;
            while(currentEdge!=null){
                System.out.print("["+temp.vertexInfo+","
                        +currentEdge.toVertex.vertexInfo+"]");
                currentEdge=currentEdge.nextEdge;
            }
            System.out.println();
            temp=temp.nextVertex;
        }
    }
}
