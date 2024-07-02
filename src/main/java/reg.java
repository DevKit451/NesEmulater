enum OPER_TYPE{
  READ,WRIGHT
}

public abstract class reg implements regOperations{
  private Mediator mediator=new Mediator();
  private OPER_TYPE opType;
  private byte regVal;
  private regOperations operation;
  
  private byte getRegVal(){
    return regVal;
  }
  private void setRegVal(byte val){
    regVal = val;
  }
  public void setOperation(regOperations d){
    operation=d;
  }
  
  public void load(byte val){
    setRegVal(val);
  }
  public byte store(){
    return getRegVal();
  }

  public void add(byte val){
    setRegVal((byte) (getRegVal() + val));
  }
  public void sub(byte val){
    setRegVal((byte) (getRegVal() - val));
  }
  public void mul(byte val){
    setRegVal((byte) (getRegVal() * val));
  }
  public void div(byte val){
    setRegVal((byte) (getRegVal() / val));
  }

  public boolean get(char registr){
    return false;
  }
  public chainReg setReg(){
    return this;
  }
}
interface regOperations extends loadStoreOperations, arithmeticOperations,chainReg{}

interface loadStoreOperations{
  public void load(byte val);
  public byte store();
}
interface arithmeticOperations{
  public void add(byte val);
  public void sub(byte val);
  public void mul(byte val);
  public void div(byte val);
}