import java.util.LinkedList;
import java.util.Queue;

public class SimpleBinaryTree {
  Node root;
  SimpleBinaryTree(int item){
    root = new Node(item);
  }

  SimpleBinaryTree(){
    root = null;
  }

  Node getTree(){
    return root;
  }
  void inOrderPrint(Node node){
    if(node != null)
    {
      inOrderPrint(node.getLeftNode());
      System.out.println(node.getData());
      inOrderPrint(node.getRightNode());
    }
  }
  void addToTree(int item){

    if(root == null){
      root = new Node(item);
    } else {
      Queue<Node> nodeList = new LinkedList<>();
      nodeList.add(root);
      while(!nodeList.isEmpty())
      {
        Node temp = nodeList.peek();
        nodeList.remove();

        if(temp.getLeftNode() == null){
          temp.setLeftNode(new Node(item));
          break;
        } else nodeList.add(temp.getLeftNode());

        if(temp.getRightNode() == null){
          temp.setRightNode(temp);
          break;
        } else nodeList.add(temp.getRightNode());
      }
    }
  }
}
