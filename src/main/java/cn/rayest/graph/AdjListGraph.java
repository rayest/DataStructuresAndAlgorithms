package cn.rayest.graph;

import cn.rayest.list.ListNode;

import java.util.ArrayList;

/**
 * Created by Rayest on 2016/8/11 0011.
 */

// 用邻接表 表示 图
public class AdjListGraph {

    private ArrayList<Integer> vertices;
    private ListNode[] edges;
    private int vertexCount = 0;

    public AdjListGraph(int vertexCount) {
        this.vertexCount = vertexCount;
        vertices = new ArrayList<>();
        edges = new ListNode[vertexCount];
        for (int i = 0; i < vertexCount; i++) {
            vertices.add(i);
            edges[i] = new ListNode();
        }
    }

    public void addEdge(){}
}
