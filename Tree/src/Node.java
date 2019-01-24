public class Node {

  private int data;
  private Node leftNode, rightNode;

  Node(int item){
    data = item;
  }

  Node(int item, Node next){
    data = item;
    leftNode = next;
  }

  Node(int item, Node left, Node right){
    data = item;
    leftNode = left;
    rightNode = right;
  }

  Node() {
    data = 0;
    leftNode = rightNode = null;
  }

  public int getData(){ return data; }

  public Node getLeftNode() { return leftNode; }

  public Node getRightNode(){ return rightNode; }

  public void setData(int item){ data = item; }

  public void setLeftNode(Node left){ leftNode = left; }

  public void setRightNode(Node right){ rightNode = right; }
}
