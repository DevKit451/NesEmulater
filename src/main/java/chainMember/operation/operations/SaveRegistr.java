package chainMember.operation.operations;

import chainMember.memory.Abs_memory;
import chainMember.operation.Abs_operation;
import chainMember.registr.Abs_registr;

public class SaveRegistr extends Abs_operation{
    public  SaveRegistr() {super();};

    public SaveRegistr(String operationType){
          super(operationType);
      }

    public void doStuff (Abs_registr registr, Abs_memory memory, int adr){
        memory.set(registr.get(),adr);
        registr.set(memory.get(adr));
    }
}