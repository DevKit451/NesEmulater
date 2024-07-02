interface chainReg{
  public boolean get(char registr);
  public chainReg setReg();

}
public class ChainOfReg {
  public chainReg[] h;
  public byte i=0;
  private byte j=0;
  public ChainOfReg(int num){
    h = new chainReg[num];
  }
  public void addToChain(chainReg nextMember){
    h[i] = nextMember;
  i++;
  }
  public chainReg getReg(char command){
    
    while (h[j].get(command)== false)
      {
        j++;
      }
    return h[j];
  }
}