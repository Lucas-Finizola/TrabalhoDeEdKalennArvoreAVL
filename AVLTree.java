/**
 * Função: Implementação de Árvore AVL com inserção e exibição in-order
 * Autor: Lucas Leite Finizola costa
 * Data: 30/11/2025
 * Observações: Testada com os valores 10, 5, 15, 3, 8, 12, 18.
 */
class AVLNode {
    int key, height;
    AVLNode left, right;
    AVLNode(int key) {
        this.key = key;
        this.height = 1;
    }
}

public class AVLTree {
    private AVLNode root;

    private int height(AVLNode node) {
        return node == null ? 0 : node.height;
    }

    private int balanceFactor(AVLNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    private AVLNode rotateRight(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }

    private AVLNode rotateLeft(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }

    public void insert(int key) {
        root = insert(root, key);
        System.out.print("In-order após inserir " + key + ": ");
        inOrder(root);
        System.out.println();
    }

    private AVLNode insert(AVLNode node, int key) {
        if (node == null) return new AVLNode(key);
        if (key < node.key) node.left = insert(node.left, key);
        else if (key > node.key) node.right = insert(node.right, key);
        else return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = balanceFactor(node);

        // Casos de rotação
        if (balance > 1 && key < node.left.key) return rotateRight(node);
        if (balance < -1 && key > node.right.key) return rotateLeft(node);
        if (balance > 1 && key > node.left.key) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if (balance < -1 && key < node.right.key) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }

    private void inOrder(AVLNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        int[] values = {10, 5, 15, 3, 8, 12, 18};
        for (int val : values) tree.insert(val);
    }
}