import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader;
        BasicBinaryTree wowBasicBinaryTree = new BasicBinaryTree();
        

        //Reader for halloween calories.txt
        try{
            reader = new BufferedReader(new FileReader("halloween calories.txt"));
            String line = reader.readLine();
            
            while(line != null){

                int key = Integer.parseInt(line);
                String valueString = reader.readLine();
                wowBasicBinaryTree.add(key,valueString);
                line = reader.readLine();
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(wowBasicBinaryTree.getTreettree());   
    }
}
