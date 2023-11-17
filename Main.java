import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader;


        //Reader for halloween calories.txt
        try{
            reader = new BufferedReader(new FileReader("halloween calories.txt"));
            String line = reader.readLine();
            
            while(line != null){

                int key = Integer.parseInt(line);
                String valueString = reader.readLine();
                BasicBinaryTree.add(key,valueString);
                line = reader.readLine();
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        












































/*
         Node D = new Node("D", null, null);
        Node E = new Node("E", null, null);
        Node B = new Node("B", D, E);

        Node H = new Node("H", null, null);
        Node I = new Node("I", null, null);
        Node F = new Node("F", H, I);

        Node G = new Node("G", null, null);

        Node C = new Node("C", F, G);

        Node A = new Node("A", B, C);

        System.out.println("Get PreOrder: " + A.getPreorder());
        System.out.println("Get InOrder: " + A.getInorder());
        System.out.println("Get InPostorder: " + A.getPostorder());
        System.out.println("Get getTree:\n " + A.getTree(0));

        BasicBinaryTree tree = new BasicBinaryTree();
        tree.root = new Node("Cat",
                                    new Node ("Dog",
                                                new Node(1,"Hamster"),
                                                new Node(2, "Mouse")), 
                                    new Node(3,"Chicken"));
        System.out.println(tree.getTreettree());*/

        
    }
}
