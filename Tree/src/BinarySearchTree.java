public class BinarySearchTree {
  Node root;
  BinarySearchTree(int item){
    root = new Node(item);
  }
  Node search(Node root, int item){
    if(root == null || root.getData() == item)
      return root;
    if(item < root.getData())
      return search(root.leftNode, item);
    return search(root.rightNode, item);
  }
}
