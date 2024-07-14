package chainMember.operation.operations;

import chainMember.memory.Abs_memory;
import chainMember.operation.Abs_operation;
import chainMember.registr.Abs_registr;

public class LoadRegistr extends Abs_operation{
    public LoadRegistr(String operationType){
        super(operationType);
    }
    public  LoadRegistr() {super();};

    public void doStuff (Abs_registr registr, Abs_memory memory, int adr){
        registr.set(memory.get(adr));
    }


}