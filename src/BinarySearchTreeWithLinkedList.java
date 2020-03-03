public class BinarySearchTreeWithLinkedList {

  Node root;

  public BinarySearchTreeWithLinkedList() {
    root = null;
  }

  // print the nodes value by using the inorder traversal (LDR)
  public void inordertraversal(Node troot) {
    if (troot != null) {
      inordertraversal(troot.left);
      System.out.println(troot.data);
      inordertraversal(troot.right);
    }
  }

  public void successor(Node troot) {
    if (troot == null) {
      System.out.println("No node available");
      return;
    }
    if (troot.left == null && troot.right == null) {
      return;
    }
    Node temp = troot.right;
    while (temp.left != null) {
      temp = temp.left;
    }
    System.out.println(temp.data);
  }

  public void minimum() {
    Node current = root;
    Node last;

    while (current != null) {
      last = current;
      current = current.left;
    }
    System.out.println("Minimumm value is " + current.data);
  }


  public void insert(int value) {
    Node newnode = new Node();
    newnode.data = value;
    if (root == null) {
      root = newnode;
    } else {
      Node current = root;
      Node parent = null;
      while (true) {
        parent = current;
        if (value < current.data) {
          current = current.left;
          if (current == null) {
            parent.left = newnode;
            return;
          }
        } else {
          current = current.right;
          if (current == null) {

            parent.right = newnode;
            return;
          }
        }

      }

    }

  }
}

