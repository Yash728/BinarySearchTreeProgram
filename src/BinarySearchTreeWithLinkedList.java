public class BinarySearchTreeWithLinkedList {

  Node root;

  public BinarySearchTreeWithLinkedList() {
    root = null;
  }
public void inordertraversal(Node troot)
{
  if(troot != null)
  {
    inordertraversal(troot.left);
    System.out.println(troot.data);
    inordertraversal(troot.right);
  }
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

