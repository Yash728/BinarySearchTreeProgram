public class BinarySearchTreeMain {
  public static void main(String[] args) {
    BinarySearchTreeWithLinkedList obj = new BinarySearchTreeWithLinkedList();
    obj.insert(20);
    obj.insert(10);
    obj.insert(5);
//    obj.insert(20);
//    obj.insert(5);
//    obj.insert(10);
//    obj.insert(4);
//    obj.insert(17);
//    obj.insert(43);
//    obj.insert(49);
//    obj.insert(30);
    obj.inordertraversal(obj.root);
    obj.delete(10);
    obj.inordertraversal(obj.root);


  }


}
