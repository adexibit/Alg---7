

public class Graph {

    final int MAX = 32;
    Vertex[] vertexList;
    int[][] adjmatr;
    int size;

    Stack stack;
    Queue queue;

    public Graph() {
        stack = new Stack(MAX);
        queue = new Queue(MAX);
        this.vertexList = new Vertex[MAX];
        this.adjmatr = new int[MAX][MAX];
        this.size = 0;
    }

    public void addV(char label) {
        vertexList[size++] = new Vertex(label);
    }

    public void addEdge(int a, int b) {
        adjmatr[a][b] = 1;
        adjmatr[b][a] = 1;
    }

    public void printG(int vertex) {
        System.out.println(vertexList[vertex].label);
    }

    public int getAdjVertexUnvisited(int ver) {
        for (int i = 0; i < size; i++) {
            if (adjmatr[ver][i] == 1 && !vertexList[i].wasVisited) {
                return i;
            }
        }
        return -1;
    }

    //    depht-first search
    public void dfs() {
        vertexList[0].wasVisited = true;
        printG(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            int v = getAdjVertexUnvisited(stack.peek());
            if (v == -1) {
                stack.pop();
            } else {
                vertexList[v].wasVisited = true;
                printG(v);
                stack.push(v);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    //breadth-first search
    public void bfs() {
        vertexList[0].wasVisited = true;
        printG(0);
        queue.insert(0);
        int var2;
        while (!queue.isEmpty()) {
            int var1 = queue.remove();
            while ((var2 = getAdjVertexUnvisited(var1)) != -1) {
                vertexList[var2].wasVisited = true;
                printG(var2);
                queue.insert(var2);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
    }
}
