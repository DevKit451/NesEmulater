package chainMember.operation.operations;

import chainMember.memory.abs_memory;
import chainMember.operation.abs_operation;
import chainMember.registr.abs_registr;

public class AddRegistr extends abs_operation{
    public AddRegistr(String operationType){
      super(operationType);
  }

    public void doStuff (abs_registr registr, abs_memory memory, int adr){
        registr.set(registr.get()+memory.get(adr));
    }
}
