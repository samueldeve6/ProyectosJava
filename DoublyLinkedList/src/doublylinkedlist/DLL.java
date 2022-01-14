/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;
import java.util.*;

class DoublyLinkedList {
    class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    Node head;
    Node tail;

    void addHead(int data) {
        Node newNode = new Node(data);
        newNode.prev = null;
        newNode.next = head;
        if (head != null)
            head.prev = newNode;
        head = newNode;
        if (tail == null)
            tail = newNode;
        System.out.println("Value " + data + " added to Head.");
    }

    void addTail(int data) {
        Node newNode = new Node(data);
        newNode.prev = tail;
        newNode.next = null;
        if (head != null)
            tail.next = newNode;
        tail = newNode;
        if (head == null)
            head = newNode;
        System.out.println("Value " + data + " added to Tail.");
    }

    void addAtKey(int key, int data) {
        Node newNode = new Node(data);
        Node curr = head;
        while (curr != null && curr.data != key) {
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("Value doesn't exist; insert cancelled.");
            newNode = null;
        } else {
            newNode.next = curr.next;
            curr.next = newNode;
            newNode.prev = curr;
        }
    }

    void deleteHead() {
        if (head == null) {  // empty list
            System.out.println("List is already empty; delete cancelled.");
        } else if (head.next == null) {  // only 1 node in the list
            head = null;
        } else {  // more than 1 nodes in the list
            head = head.next;
            head.prev = null;
        }
    }

    void deleteTail() {
        if (head == null) {  // empty list
            System.out.println("List is already empty; delete cancelled.");
        } else if (head.next == null) {  // only 1 node in the list
            head = null;
            System.out.println("Last Node deleted.");
        } else {  // more than 1 nodes in the list
            tail = tail.prev;
            tail.next = null;
            System.out.println("Tail Node deleted.");
        }
    }

    void deleteAfter(int key) {
        if (head == null) {
            System.out.println("The list is already empty, delete cancelled.");
            return;
        }
        Node here = head;
        while (here != null) {
            if (here.data == key) {
                // This does not work correctly...
                Node a = here.next;
                here.next = a.next;
                a.next.prev = here;
                System.out.println("Node after key " + key + " deleted successfully.");
                return;
            }
            here = here.next;
        }
        System.out.println("Key not found; no action taken.");
    }

    void findValue(int key) {
        // to be defined later... :)
        return;
    }

    void showValues() {
        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            System.out.print("The list contains:  ");
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }
}

public class DLL {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int data;
        int key;
        do {
            System.out.println("\n*********Main Menu*********\n\n" +
                "Choose one option from the following list ...\n" +
                "===============================================\n" +
                "1. Insert at beginning\n" +
                "2. Insert at the end\n" +
                "3. Insert after specified key\n" +
                "4. Delete from beginning\n" +
                "5. Delete from the end\n" +
                "6. Delete the node after specified key\n" +
                "7. Search for key\n" +
                "8. Show values\n" +
                "9. Exit\n");
            try {
                choice = input.nextInt();
            }
            catch(InputMismatchException e) {
                System.out.println("Enter a number, please!");
            }
            switch(choice) {
                case 1:
                    System.out.println("Enter value to add at beginning:");
                    data = input.nextInt();
                    dll.addHead(data);
                    break;
                case 2:
                    System.out.println("Enter value to add at the end:");
                    data = input.nextInt();
                    dll.addTail(data);
                    break;
                case 3:
                    System.out.print("Enter value to add: ");
                    data = input.nextInt();
                    System.out.print("Which position: ");
                    key = input.nextInt();
                    dll.addAtKey(key, data);
                    break;
                case 4:
                    dll.deleteHead();
                    break;
                case 5:
                    dll.deleteTail();
                    break;
                case 6:
                    System.out.print("Delete after which value: ");
                    key = input.nextInt();
                    dll.deleteAfter(key);
                    break;
                case 7:
                    System.out.print("Enter the value to search: ");
                    key = input.nextInt();
                    dll.findValue(key);
                    break;
                case 8:
                    dll.showValues();
                    break;
                default:
                    choice = 9;
                }
        } while (choice != 9);
    }
}