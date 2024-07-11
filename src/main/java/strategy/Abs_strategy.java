abstract class abs_strategy{
    private int_strategy currentStrategy;

    public void setStrategy (int_strategy inpStrategy){
    currentStrategy=inpStrategy;
    }

    public void doOperation(int_strategy registr, int_strategy memory, int adr){
        currentStrategy.doStuff(registr, memory,adr);
    }


}