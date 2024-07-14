package chainMember.operation.operations;

import chainMember.memory.Abs_memory;
import chainMember.operation.Abs_operation;
import chainMember.registr.Abs_registr;

public class DivRegistr extends Abs_operation{
    public DivRegistr(String operationType){
      super(operationType);
  }
    public  DivRegistr() {super();};

    public void doStuff (Abs_registr registr, Abs_memory memory, int adr){
        registr.set(registr.get()/memory.get(adr));
    }
}
