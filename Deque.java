
//
// Names:   Eugene Chew   ,   Bhavit Wadhwa
// IDs:     1351553       ,   1516846
//
import java.util.*;

// Double-ended queue implementation using LinkedList
public class Deque {
    public dNode head;
    public dNode tail;

    class dNode {
        public dNode next;
        public Integer stateNumber;

        public dNode(Integer stateNumber) {
            this.stateNumber = stateNumber;
        }
    }

    // Push the next item onto the head - push()
    public void addHead(Integer value) {
        dNode newNode = new dNode(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Put the next item into the tail of the linkedlist - put()
    public void addTail(Integer value) {
        dNode newNode = new dNode(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Pop the next item from the head and return it- get()
    public Integer getHead() {
        dNode currentHead = head;
        head = head.next;
        return currentHead.stateNumber;
    }

    public Boolean checkHead() {
        if (head == null) {
            return false;
        }
        return true;
    } 

    // Testing method to view current state of deque
    public void print() {
        dNode current = head;
        System.err.println();
        System.err.println("Current States in Deque:");
        System.err.println("----------------------------");
        while (current != null) {
            // Print out the head client's arrival and use time in terminal
            System.err.println("Head" + "\t" + "Tail" + "\t" + "State Number");
            System.err.println(head.stateNumber + "\t" + tail.stateNumber + "\t" + current.stateNumber);
            // Shift to the next client in the queue and return when no clients remain
            current = current.next;
        }
    }
}
