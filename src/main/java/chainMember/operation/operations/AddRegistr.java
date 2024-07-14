package chainMember.operation.operations;

import chainMember.memory.Abs_memory;
import chainMember.operation.Abs_operation;
import chainMember.registr.Abs_registr;

public class AddRegistr extends Abs_operation {
    public AddRegistr(String operationType){
      super(operationType);
  }
    public  AddRegistr() {super();};

    public void doStuff (Abs_registr registr, Abs_memory memory, int adr){
        registr.set(registr.get()+memory.get(adr));
    }
}
