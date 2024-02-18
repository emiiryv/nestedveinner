package nested;

public class Main {
    public static void main(String[] args) {
    /*Out o = new Out();
    o.run();
    Out.In inNesnesi = o.new In();
    inNesnesi.run();
    */
    /*
    inner class ve çalıştırma methodu static olursa
    Out.In.run();
    şeklinde nesne oluşturmadan çalıştırabiliriz
     */

     Local l = new Local();
     Anonim a = new Anonim(){
         @Override
         public void run(){
             System.out.println("Anonim olarak yazılmış run methodu.");
         }
     };
     a.run();
    }
}