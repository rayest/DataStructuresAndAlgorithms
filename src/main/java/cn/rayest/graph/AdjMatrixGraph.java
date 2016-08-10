package cn.rayest.graph;

/**
 * Created by Rayest on 2016/8/10 0010.
 */
public class AdjMatrixGraph {

    // 定义两个变量，分别表示邻接矩阵和顶点数
    private boolean[][] adjMatrix;
    private int vertexCount;

    // 构造用邻接矩阵表示的图
    public AdjMatrixGraph(int vertexCount) {
        this.vertexCount = vertexCount;
        adjMatrix = new boolean[vertexCount][vertexCount];
    }

    // 无向图
    public void addEdge(int i, int j){
        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount){
            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true;
        }
    }

    public void removeEdge(int i, int j){
        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount){
            adjMatrix[i][j] = false;
            adjMatrix[j][i] = false;
        }
    }

    public boolean isEdge(int i, int j){
        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount){
            return adjMatrix[i][j];
        }
        else {
            return false;
        }
    }

}
