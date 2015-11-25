package cracking.TreesGraphs;
import java.util.*;


import java.util.LinkedList;

/**
 * Created by abhis_000 on 11/6/15.
 */
public class Graph {
    private HashMap<Integer,LinkedList<Integer>> graph ;
    private HashMap<Integer,Boolean> visited;

    Graph(){
        this.graph = new HashMap<Integer,LinkedList<Integer>>();
        this.visited = new HashMap<Integer, Boolean>();
    }

    public void addEdge(int u,int v){
        if(!graph.containsKey(u)){
            addNode(u);
        }
        if(!graph.containsKey(v)){
            addNode(v);
        }
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public void addNode(int u){
        graph.put(u,new LinkedList<Integer>());
    }

    public void addNodeAdjList(int n, LinkedList<Integer> adj){
        for(int i = 0;i<adj.size();i++){
            addEdge(n,adj.get(i));
        }
    }

    //From a given source
    public void bfs(int s){
        if(graph.size() == 0){
            return;
        }
        for(Integer i : graph.keySet()){
            visited.put(i,false);
        }
        Queue<Integer> q = new LinkedList<Integer>();

        visited.put(s,true);
        q.add(s);
        visit(s);

        while(!q.isEmpty()){
            int temp = q.remove();
            LinkedList<Integer> adjTemp = graph.get(temp);
            for(int i = 0;i< adjTemp.size();i++){
                int val = adjTemp.get(i);
                if(!visited.get(val)){
                    visit(val);
                    visited.put(val,true);
                    q.add(val);
                }
            }
        }
    }

    private void dfsUtil(int s,HashMap<Integer,Boolean> tempVisited){
        visit(s);
        tempVisited.put(s,true);
        LinkedList<Integer> temp = graph.get(s);
        for(int i = 0; i<temp.size();i++){
            if(!tempVisited.get(temp.get(i))){
                dfsUtil(temp.get(i),tempVisited);
            }
        }
    }
    public void dfs(int s){
        for(Integer i : graph.keySet()){
            visited.put(i,false);
        }

        dfsUtil(s, visited);
    }

    private void visit(int v){
        System.out.print("Node " + v + " has been visited \n");
    }


    public static void main(String [] args){
        Graph g = new Graph();

        g.addNodeAdjList(1, new LinkedList<Integer>(Arrays.asList(2,3,4)));
        g.addNodeAdjList(2, new LinkedList<Integer>(Arrays.asList(5, 6)));
        g.addNodeAdjList(3, new LinkedList<Integer>(Arrays.asList(7)));
        g.dfs(1);
    }
}
