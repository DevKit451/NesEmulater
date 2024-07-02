package chainMember.operation.operations;

import chainMember.memory.abs_memory;
import chainMember.operation.abs_operation;
import chainMember.registr.abs_registr;

public class SaveRegistr extends abs_operation{
    public SaveRegistr(String operationType){
          super(operationType);
      }

    public void doStuff (abs_registr registr, abs_memory memory, int adr){
        memory.set(registr.get(),adr);
        registr.set(memory.get(adr));
    }
}