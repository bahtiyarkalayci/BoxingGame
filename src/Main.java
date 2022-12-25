public class Main {
    public static void main(String[] args) {
    fighter ahmet=new fighter("ahmet",15,80,95,0);
    fighter mehmet=new fighter("mehmet",10,95,100,0);
    Match r=new Match(ahmet,mehmet,95,100);
    r.run();





    }
}