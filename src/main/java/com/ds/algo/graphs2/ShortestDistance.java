package com.ds.algo.graphs2;

import java.util.*;

public class ShortestDistance {

    public static void main(String[] args) {
        int[][] edges1 = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {3, 6}};
        int size1 = 7;
        int src1 = 0;
        int dest1 = 6;
        Map<Integer, ArrayList<Integer>> adjList1 = adjList(edges1);
        int distance1 = shortestDistance(size1, src1, dest1, adjList1);
        System.out.println("distance1:"+ distance1);

        int[][] edges2 = {{0, 1}, {0, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        int size2 = 8;
        int src2 = 0;
        int dest2 = 7;
        Map<Integer, ArrayList<Integer>> adjList2 = adjList(edges2);
        int distance2 = shortestDistance(size2, src2, dest2, adjList2);
        System.out.println("distance2:"+ distance2);

        int[][] edges3 = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {5, 6}, {6, 4}};
        int size3 = 7;
        int src3 = 0;
        int dest3 = 6;
        Map<Integer, ArrayList<Integer>> adjList3 = adjList(edges3);
        int distance3 = shortestDistance(size3, src3, dest3, adjList3);
        System.out.println("distance3:"+ distance3);

        int[][] edges4 = {{0, 1}, {1, 2}, {1, 3}, {3, 4}, {4, 2}, {0, 5}, {5, 6}, {6, 7}};
        int size4 = 8;
        int src4 = 0;
        int dest4 = 7;
        Map<Integer, ArrayList<Integer>> adjList4 = adjList(edges4);
        int distance4 = shortestDistance(size4, src4, dest4, adjList4);
        System.out.println("distance4:"+ distance4);

        int[][] edges5 = {{0, 1}, {0, 2}, {0, 3}, {1, 4}, {2, 4}, {3, 4}, {4, 5}, {5, 6}, {4, 6}};
        int size5 = 7;
        int src5 = 0;
        int dest5 = 6;
        Map<Integer, ArrayList<Integer>> adjList5 = adjList(edges5);
        int distance5 = shortestDistance(size5, src5, dest5, adjList5);
        System.out.println("distance5:"+ distance5);
    }


	public static int shortestDistance(int size, int src, int dest, Map<Integer, ArrayList<Integer>> adjList) {

		// add src to queue and mark it as visited
		int[] visited = new int[size];
		LinkedList<Node> q = new LinkedList<>();
		
		q.add(new Node(src, 0));
		visited[src] = 1;

		while(!q.isEmpty()) {
		// Iterate over the queue
			Node node = q.poll();
			ArrayList<Integer> neighbours = adjList.get(node.data);
			if(neighbours == null) {
				continue;
			}
			for(int neighbour : neighbours) {
				if(neighbour == dest) {
					return node.level + 1;
				}
				if(visited[neighbour] == 0) {
					Node child = new Node(neighbour, node.level+1);
                    q.add(child);
					visited[neighbour] = 1;
				}
			}
		}
		return -1;
	}



	private static Map<Integer, ArrayList<Integer>> adjList(int[][] edges) {
		Map<Integer, ArrayList<Integer>> adjList = new HashMap<>();
		for(int[] edge : edges) {
			adjList.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
			adjList.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
		}
		return adjList;
	}

	static class Node {
		public int data;
		public int level;

		public Node(int data, int level) {
			this.data = data;
			this.level = level;
		}
	}
}
