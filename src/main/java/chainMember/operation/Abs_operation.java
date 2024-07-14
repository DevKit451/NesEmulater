package chainMember.operation;

import chainMember.inter.int_chainMember;
import chainMember.registr.Abs_registr;
import strategy.inter.int_strategy;

import chainMember.registr.Abs_registr;
import chainMember.memory.Abs_memory;

public abstract class Abs_operation implements int_strategy, int_chainMember{
    protected String operationType;
    protected Abs_operation() {};

    public  Abs_operation (String operationType){
        this.operationType=operationType;
    };

    public final String responce(){
        return operationType;
    }
    public void doStuff (int_strategy registr, int_strategy memory, int adr){
        this.doStuff (registr,memory,adr);
    }
    
    public abstract void doStuff (Abs_registr registr, Abs_memory memory, int adr);


}