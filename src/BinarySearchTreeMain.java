public class BinarySearchTreeMain {
  public static void main(String[] args) {
    BinarySearchTreeWithLinkedList obj = new BinarySearchTreeWithLinkedList();
    obj.insert(20);

//    obj.insert(60);
//    obj.insert(80);
//    obj.insert(10);
    obj.inordertraversal(obj.root);
    obj.successor(obj.root);
    obj.minimum();

  }


}
