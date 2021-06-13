package me.study.kakao;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Question3 {

    public static void main(String[] args) {
        Question3 question3 = new Question3();
        int n = 6;
        int[] passenger = {1, 1, 1, 1, 1, 1};
        int[][] train = {{1, 2}, {1, 3}, {1, 4}, {3, 5}, {3, 6}};
        int[] solution = question3.solution(n, passenger, train);
        System.out.println(Arrays.toString(solution));
    }

    public int[] solution(int n, int[] passenger, int[][] train) {
        int[] answer = {};

        Graph graph = new Graph(passenger.length + 1);

        for (int i = 0; i < train.length; i++) {
            for (int j = 0; j < train[i].length - 1; j++) {
                graph.addEdge(train[i][j], train[i][j + 1]);
            }
        }


        return answer;
    }

    class Graph {
        Node[] nodes;

        public Graph(int size) {
            nodes = new Node[size];
            for (int i = 0; i < size; i++) {
                nodes[i] = new Node(i);
            }
        }

        void addEdge(int i1, int i2) {
            Node n1 = nodes[i1];
            Node n2 = nodes[i2];

            if (!n1.adjacent.contains(n2))
                n1.adjacent.add(n2);

            if (!n2.adjacent.contains(n1))
                n2.adjacent.add(n1);
        }

        void dfs() {
            dfs(0);
        }

        void dfs(int index) {
            Node root = nodes[index];
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            root.marked = true;
            while (!stack.empty()) {
                Node r = stack.pop();
                for (Node n : r.adjacent) {
                    if (n.marked == false) {
                        n.marked = true;
                        stack.push(n);
                    }
                }
                visit(r);
            }
        }

        private void visit(Node r) {
            System.out.print(" " + r.data);
        }

        class Node {
            int data;
            LinkedList<Node> adjacent;
            boolean marked;

            public Node(int data) {
                this.data = data;
                this.marked = false;
                adjacent = new LinkedList<>();
            }
        }

    }
}
