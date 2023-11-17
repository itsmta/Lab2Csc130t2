public class BasicBinaryTree {
    private Node root;

    public BasicBinaryTree(){
    }

    public static void about(){
        System.out.println("Hello my name is Iman Abboud and I created this lab.\n I really like eating chicken but I hate preparing it.");
    }

    public String getInordertree(){
        return root.getInorder();
    }

    public String getPostoderdertree(){
        return root.getPostorder();
    }

    public String getPreordertree(){
    return root.getPreorder();
    }

    public String getTreettree(){
        return root.getTree(0);
    }


    void add(int key, String valueString){
        if(root == null){
        root = new Node(key, valueString);
        
    }else {
        root.add(key, valueString);
    }}


    String find(int key){
        String output = "";
        
        return output;
    }
}
