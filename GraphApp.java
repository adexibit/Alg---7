

public class GraphApp {
    public static void main(String[] args) {
        Graph gr = new Graph();
        gr.addV('A');//0
        gr.addV('B');//1
        gr.addV('C');//2
        gr.addV('D');//3
        gr.addV('E');//4
        gr.addV('F');//5
        gr.addV('G');//6
        gr.addV('H');//7
        gr.addV('I');//8
        gr.addV('J');//9


        gr.addEdge(0,1); // A -> B
        gr.addEdge(1,2); // B -> C
        gr.addEdge(0,3); // A -> D
        gr.addEdge(3,4); // D -> E
        gr.addEdge(4,8); // E -> i
        gr.addEdge(7,5); // H -> F
        gr.addEdge(2,9); // C -> J
        gr.addEdge(3,1); // C -> B
        gr.addEdge(8,4); // I -> D
        gr.addEdge(6,1); // G -> B

        gr.bfs();

    }
}
