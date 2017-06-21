package com.quangnguyen;

import com.quangnguyen.dto.SinglyLinkedList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println("Singly Linked List\n");
        while (true) {
            System.out.println("1. Insert at begining");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete at position");
            System.out.println("5. Delete last node");
            System.out.println("6. Delete all node has value greater");
            System.out.println("0. EXIT");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to insert");
                    list.insertAtStart(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Enter integer element to insert");
                    list.insertAtEnd(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Enter integer element to insert");
                    int num = scan.nextInt();
                    System.out.println("Enter position");
                    int pos = scan.nextInt();
                    if (pos <= 1 || pos > list.getSize())
                        System.out.println("Invalid position\n");
                    else
                        list.insertAtPos(num, pos);
                    break;
                case 4:
                    System.out.println("Enter position");
                    int p = scan.nextInt();
                    if (p < 1 || p > list.getSize())
                        System.out.println("Invalid position\n");
                    else
                        list.deleteAtPos(p);
                    break;
                case 5:
                    list.deleteAtPos(list.getSize());
                    break;
                case 6:
                    System.out.println("Enter value");
                    int v = scan.nextInt();
                    list.deleteNodeHasValueLarger(v);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }

            list.display();
        }
    }
}
