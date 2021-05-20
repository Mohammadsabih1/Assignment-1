public class TestEntry {
    public static void main(String[] args) {
        Binary entry = new Binary();
        entry.insert(new KarachiTelephoneDirectory("Salman","0300000"));



        KarachiTelephoneDirectory[] t = new KarachiTelephoneDirectory[5];
        System.out.println("----------------------------------");
        t[0] = new KarachiTelephoneDirectory("A", "0300");
        t[1] = new KarachiTelephoneDirectory("B", "0300");
        t[2] = new KarachiTelephoneDirectory("C", "0300");
        t[3] = new KarachiTelephoneDirectory("D", "0300");
        t[4] = new KarachiTelephoneDirectory("E", "0300");

        entry.insertAll(t);

        System.out.println("Inorder Traversel");
        entry.Inorder();
        System.out.println("------------------");
        System.out.println("Preorder Traversel");
        entry.Preorder();
        System.out.println("------------------");
        System.out.println("Postorder Traversel");
        entry.Postorder();
        System.out.println("------------------");
        System.out.println("Updating the number");
        entry.Update("Miss Aman Farooq","03001288219");
        System.out.println("Inorder Traversel");
        entry.Inorder();
        System.out.println("------------------");
        System.out.println("Preorder Traversel");
        entry.Preorder();
        System.out.println("------------------");
        System.out.println("Postorder Traversel");
        entry.Postorder();
        System.out.println("------------------");
        System.out.println("Clearing the entries");
        entry.clear();




    }
}
