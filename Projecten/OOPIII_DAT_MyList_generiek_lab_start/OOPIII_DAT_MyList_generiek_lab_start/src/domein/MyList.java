package domein;

import exceptions.EmptyListException;

public class MyList {

    private Node firstNode;
    private Node lastNode;
    private String nameList;

    public MyList() {
        this("List");
    }

    public MyList(String name) {
        nameList = name;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return nameList + " is empty";
        }

        StringBuilder buffer = new StringBuilder();
        buffer.append("The ").append(nameList).append(" is: ");
        Node current = firstNode;
        while (current != null) {
            buffer.append(current.getData()).append("    ");
            current = current.getNext();
        } // end while

        return buffer.toString();
    } // end method toString

    public void insertAtFront(String data) {
        Node aNode = new Node(data);
        if (isEmpty()) {
            firstNode = lastNode = aNode;
        } else {
            aNode.setNext(firstNode);
            firstNode = aNode;
        }
    }

    public void insertAtBack(String data) {
        Node aNode = new Node(data);
        if (isEmpty()) {
            firstNode = lastNode = aNode;
        } else {
            lastNode.setNext(aNode);
            lastNode = aNode;
        }
    }

    public String removeFromFront() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException(nameList);
        }

        String removedItem = firstNode.getData();
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.getNext();
        }

        return removedItem;
    }

    
}