class Factory {
    public reg registr(String Type){
        return new reg(Type);
    }
    public chain registrs(String[ ] args){
        chain regChain = new chain(args.length);
        for (String s : args){
        regChain.addMember( new reg(s) );
        }

        return regChain;
    }
    public chain registrs6502(){
        chain regChain1 = new chain(3);
        chain regChain2 = new chain(3);
        regChain1 = this.registrs(new String[]{"A", "X","Y"});
        regChain2 = this.registrs(new String[]{"PC", "S", "P"});
        return regChain1;
    }
    class memStr {
  public int size; 
  public String memType;
  public memStr(int size, String memType){
      this.size=size;
      this.memType=memType;
  }
}