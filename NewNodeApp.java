// NewNodeApp.java
// Driver Application for the NewNode class
// Includes two examples--list of Doubles (using wrapper class) and
//                      --list of Data Records (see Record.java)

public class NewNodeApp {

    public static void main(String[] args) {

        NewNode start = new NewNode(new Double(0.0), null);

        for (int i = 1; i <= 5; i++) {
            NewNode.addInOrder2(new NewNode(new Double((double) i), null),
                                start);
        }

        System.out.println("\nUsing static print:"); 
        NewNode.printList(start);

        System.out.println("\nUsing non-static print:");
        start.printFrom();

        // re-set and try with a data record

        start = new NewNode(new Record(), null);
        
        NewNode.addInOrder2(new NewNode(500, null),
                            start);
        NewNode.addInOrder2(new NewNode(new Record("John", "C", "Doe"), null),
                            start);
        NewNode.addInOrder2(new NewNode(new Record("John", "B", "Doe"), null),
                            start);
        NewNode.addInOrder2(new NewNode(new Record("Mary", "A", "Doe"), null),
                            start);
        NewNode.addInOrder2(new NewNode(new Record("Ann", "A", "Apple"), null),
                            start);

        System.out.println("\nUsing static print:");
        NewNode.printList(start); 

        System.out.println("\nUsing non-static print:"); 
        start.printFrom();
    }
}  // NewNodeApp
