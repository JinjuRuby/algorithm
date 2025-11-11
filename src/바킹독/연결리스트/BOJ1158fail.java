package 바킹독.연결리스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1158fail {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int nodeCount = Integer.parseInt(st.nextToken());
        int removeNum = Integer.parseInt(st.nextToken());


    }


    private static class Node {
        private Node frontNode;
        private int num;
        private Node backNode;

        public Node(int num) {
            this.num = num;
        }

        private void inputFrontNode(int num) {
            Node node = new Node(num);
            frontNode = node;
        }

        private void inputBackNode(Node node) {
            backNode = node;
        }


    }
}
