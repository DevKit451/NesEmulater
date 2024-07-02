interface mediatorAbs{
  public void notify1();
}
public class Mediator implements mediatorAbs{
  public void notify1(){
    System.out.println("Mediator: Notifying clients about e1.");
  }
  public byte readMem (byte val)
  {
    return 0;
  }
}