package nested;
public class Out {//Outer Class
    public int a = 5;

    public class In{ //Inner Class
        public int a = 10;

        public void run(){
            System.out.println("In sınıfına ait run methodu çalıştı.");
            int a = 1;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Out.this.a);
        }
    }

    public void run(){
        In in = new In();
        in.run();
    }

}
