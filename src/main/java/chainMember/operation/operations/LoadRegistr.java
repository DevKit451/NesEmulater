package chainMember.operation.operations;

import chainMember.memory.abs_memory;
import chainMember.operation.abs_operation;
import chainMember.registr.abs_registr;

public class LoadRegistr extends abs_operation{
    public LoadRegistr(String operationType){
        super(operationType);
    }

    public void doStuff (abs_registr registr, abs_memory memory, int adr){
        registr.set(memory.get(adr));
    }


}