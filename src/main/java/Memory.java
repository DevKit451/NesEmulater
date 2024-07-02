public abstract class Memory implements memoryOperations{
  private byte[] memoryField;
  public Memory(int size){
    memoryField= new byte[size];};

  public byte getMemVal(int i){
    return memoryField[i];
  }
  public void setMemVal(int i, byte val){
    memoryField[i]=val;
  }
}

interface memoryOperations{
  public void load(byte val);
  public byte store();
}

