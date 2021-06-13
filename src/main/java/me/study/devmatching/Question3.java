package me.study.devmatching;

import java.util.*;

public class Question3 {

    public static void main(String[] args) {
        Question3 question3 = new Question3();
//        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
//        String[] referral ={"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] referral ={"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};

//        String[] seller = {"young", "john", "tod", "emily", "mary"};
        String[] seller = {"sam", "emily", "jaimie", "edward"};
//        int[] amount = {12, 4, 2, 5, 10};
        int[] amount = {2, 3, 5, 4};
        int[] solution = question3.solution(enroll, referral, seller, amount);
        System.out.println(Arrays.toString(solution));
    }

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];

        Map<String, Node> nodeMap = new HashMap<>();
        Node center = new Node("center");
        nodeMap.put("center", center);

        Node n = null;
        for (int i = 0; i <enroll.length; i++) {
                if(referral[i].equals("-")) {
                    n = new Node(enroll[i]);
                    n.up = center;
                    nodeMap.put(enroll[i], n);
                    n = null;
                    continue;
                }

                n = new Node(enroll[i]);
                Node ref = new Node(referral[i]);

                if(nodeMap.get(referral[i]) != null) {
                    ref = nodeMap.get(referral[i]);
                }

                n.up = ref;
                nodeMap.put(enroll[i],n);
                n = null;
        }

        System.out.println(nodeMap);


        int realAmount = 0;
        for (int i = 0; i < seller.length; i++) {
            realAmount =  amount[i] * 100;
            Node node = nodeMap.get(seller[i]);
            distribute(nodeMap, node, realAmount);
        }


        for(int i = 0; i < enroll.length; i++) {
            Node node = nodeMap.get(enroll[i]);
            answer[i] = node.amount;
        }

        return answer;
    }

    private void distribute(Map<String, Node> nodeMap, Node node, int realAmount) {
        if(node == null)
            return;

        if(realAmount < 10) {
            node.amount += realAmount;
            realAmount = 0;
        } else {
            node.amount += realAmount - (realAmount / 10);
            realAmount = realAmount - (realAmount - (realAmount / 10));
        }
        distribute(nodeMap, node.up, realAmount);
    }


    static class Node {

        private String name;

        private int amount;

        private Node up;

        public Node(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return name.equals(node.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "name='" + name + '\'' +
                    ", amount=" + amount +
                    ", up=" + up +
                    '}';
        }
    }

}
