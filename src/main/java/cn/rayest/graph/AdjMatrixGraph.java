package cn.rayest.graph;

/**
 * Created by Rayest on 2016/8/10 0010.
 */
public class AdjMatrixGraph {

    // ���������������ֱ��ʾ�ڽӾ���Ͷ�����
    private boolean[][] adjMatrix;
    private int vertexCount;

    // �������ڽӾ����ʾ��ͼ
    public AdjMatrixGraph(int vertexCount) {
        this.vertexCount = vertexCount;
        adjMatrix = new boolean[vertexCount][vertexCount];
    }

    // ����ͼ
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
