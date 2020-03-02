public class BinarySearchTreeMain {
  public static void main(String[] args) {
    BinarySearchTreeWithLinkedList obj = new BinarySearchTreeWithLinkedList();
    obj.insert(31);
    obj.insert(16);
    obj.insert(22);
    obj.insert(7);
    obj.insert(61);
    obj.insert(45);
    obj.insert(75);
    obj.insert(17);
    obj.insert(27);
    obj.inordertraversal(obj.root);
  }


}
