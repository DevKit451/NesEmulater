class memory{
  
  private byte[] memoryZero = new byte[255];
  private byte[] memoryStack = new byte[255];
  private byte[] memoryGeneral = new byte[255];

}
private class regAccChain implements chainReg{
  private boolean regAccChain = false;
  private regAccChain nextMember;
  public boolean get(){
    return regAccChain;
  }
  public chainReg setReg(){
    regAccChain = true;
    return nextMember;
  }
}

class controller{
  private regAccamulator acc;
  private regAccChain accChain;
  private byte Xreg;
  private byte Yreg;
  private byte SPreg;
  private byte Preg;
  private int PCreg;

  private MemoryZero memoryZero = new MemoryZero(255);
  
  private ChainOfReg RegChain = new ChainOfReg(6);{
    this.RegChain.addToChain(accChain);
  };
  
  
  

  

  private class strat{
  private regOperations reg;
  private memoryOperations memList;
    public void setReg(regOperations reg){
      this.reg = reg;}
    public void setMem(memoryOperations memList){
      this.memList = memList;
    }
  }
  public void instr(char com[], char reg,int memAdr){
    final String command =  new String (com);
    
    this.regRegChain.getReg(reg);
    (ActiveReg.setOperation(reg.get(command));
    if (reg.getReturnType() ==void.class)
    {
      ActiveReg.doWork(memoryZero.getMemVal)}
    else{
      memoryZero.setMemVal(ActiveReg.doWork())
    }
    
  };
  
  
  
}

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}