

public class Node{

    //Initialize left, right and value for each node created. 
    Node leftNode;
    Node rightNode;
    String valueString;
    int key;
    
    public Node(int key,String value){
        this.valueString = value;
        this.key = key;
    }
    
    //Node constructor to assign values of node when created
    public Node (String value, Node left, Node right, int key){
        this.leftNode = left;
        this.rightNode = right;
        this.valueString = value;
        this.key = key;
    }

    //When called, will recursively call itself to print the preorder of the tree. 
    public String getPreorder(){
        String output = "";
        output = output + " " + valueString;
        if(leftNode != null){
            output = output + leftNode.getPreorder();
        }
        if(rightNode != null){
            output = output + rightNode.getPreorder();
        }
        return output;
    }

    //When called will recursively call itself to print the Inorder of the tree. 
    public String getInorder(){
        String output = "";
        if(leftNode != null){
            output = output + leftNode.getInorder();
        }
        output = output + " " + valueString;
        if(rightNode != null){
            output = output + rightNode.getInorder();
        }
        return output;
    }

    //When called will recursively call itself to print the postorder of the tree. 
    public String getPostorder(){
        String output = "";

        if(leftNode != null){
        output = output + leftNode.getPostorder();
        }
        if(rightNode != null){
            output = output + rightNode.getPostorder();
        }
        output = output + " " + valueString;
        return output;
    }

    //When called will print the structure of the tree
    public String getTree(int indent){
        String output = "-".repeat(indent);
        output = output + valueString + "\n";

        if(leftNode != null){
            output = output + leftNode.getTree(indent + 4);
        }
        if(rightNode != null){
            output = output + rightNode.getTree(indent + 4);
        }
        return output;
    }
    void add(int key,String valueString){
        //Adds the key to the correct position in the binary search tree. If the key already exists do nothing.
        if(this.key == key){
            System.out.println("this key already exists");
        }
        if (key < this.key && leftNode == null){
            leftNode.valueString = valueString;
        }
        if (key < this.key && leftNode != null){
            leftNode.add(key, valueString);
        }
        if (key > this.key && rightNode == null){
            rightNode.valueString = valueString;
        }
        if (key > this.key && rightNode != null){
            rightNode.add(key, valueString);
        }
        else{
            System.out.println("error");
        }

    }
    public String getValue(int key){
        //Finds a node with the key and returns its value. If the node is not found, you can return an empty string.
        String output = "";
        if (this.key == key){
        output = String.valueOf(key);
        }
        return output;
    }
}
