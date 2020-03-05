public class BinarySearchTreeWithLinkedList {
  Node root;
  public BinarySearchTreeWithLinkedList() {
    root = null;
  }

  // print the nodes value by using the inorder traversal (LDR)
  public void inordertraversal(Node troot) {
    if (troot != null) {
      inordertraversal(troot.left);
      System.out.print(" " + troot.data);
      inordertraversal(troot.right);
    }
  }

  public Node search(int val) {
    Node current = root;
    while (current.data != val) {
      if (val < current.data) {
        current = current.left;
      } else {
        current = current.right;
      }
      if (current == null) {
        return null;
      }
    }
    return current;
  } // end of the method

  public boolean delete(int value) {

    // first search the value which you want to delete and write delete cases
    Node current = root;
    Node parent = root;
    boolean isLeftChild = false;
    while (current.data != value) {
      parent = current;
      if (value < current.data) {

        current = current.left;
        isLeftChild = true;
      } else {

        current = current.right;
        isLeftChild = false;
      }
      if (current == null) {
        return false;
      }
    }
    // search complet
    // Leaf node deletion case
    if (current.left == null && current.right == null) {
      System.out.println("Leaf node deletion case");
      if (current == root) {
        root = null;
      } else if (isLeftChild == true) {
        parent.left = null;
      } else {
        parent.right = null;
      }
    }
    // Node to be deleted has one child case
    // Node to be deleted has right child
    else if (current.left == null) {
      if (current == root) {
        root = current.right;
      } else if (isLeftChild) {
        parent.left = current.right;
      } else {
        parent.right = current.right;
      }
    }
    // Node to be deleted has left child
    else if (current.right == null) {
      System.out.println("One left child deletion case");
      if (current == root) {
        root = current.left;
      }
      // if deleted node is left child
      else if (isLeftChild) {
        parent.left = current.left;
      }
      // if deleted node is right child
      else {
        parent.right = current.left;
      }
    }
    // Node to be deleted has two children case
    else {
      // find in-order successor of the node to be deleted
      Node successor = successor(current);
      if (current == root) {
        root = successor;
      } else if (isLeftChild) {
        parent.left = successor;
      } else {
        parent.right = successor;
      }
      successor.left = current.left;
    }
    return true;
  }

  public Node successor(Node node) {
    Node successor = node;
    Node successorParent = node;
    Node current = node.right;
    while (current != null) {
      successorParent = successor;
      successor = current;
      current = current.left;
    }
    if (successor != node.right) {
      successorParent.left = successor.right;

      successor.right = node.right;
    }
    return successor;
  }

  public void minimum() {
    Node current = root;
    Node parent = null;
    while (current != null) {
      parent = current;
      current = current.left;
    }
    System.out.println("Minimumm value is " + parent.data);
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

