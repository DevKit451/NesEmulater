interface chainOperations{
  public boolean get(String registr);
  public chainReg setReg();
}
public class ChainOfOperations{
  public chainOperations[] h;
  public byte i=0;
  private byte j=0;
  public ChainOfOperations(int num){
    h = new chainOperations[num];
  }
  public void addToChain(chainOperations nextMember){
    h[i] = nextMember;
  i++;
  }
  public chainOperations getReg(String registr){

    while (h[j].get(registr)== false)
      {
        j++;
      }
    return h[j];
  }
}