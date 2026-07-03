public class Methods {
  public static void main(String[] args) {
    Computer com = new Computer();
    com.playmusic();
    System.out.println(com.getMeAPen(5));
  }

}

class Computer {
  public void playmusic(){
    System.out.println("Playing music");
  }

  public String getMeAPen(int cost){
    if(cost<=10)
      return "Pencil";
    else
    return "Pen";
  }
}
