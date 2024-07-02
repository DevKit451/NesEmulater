package chainMember.operation;

import chainMember.inter.int_chainMember;
import strategy.inter.int_strategy;

import chainMember.registr.abs_registr;
import chainMember.memory.abs_memory;

public abstract class abs_operation implements int_strategy, int_chainMember{
    protected String operationType;

    protected  abs_operation (String operationType){
        this.operationType=operationType;
    };

    public final String responce(){
        return operationType;
    }
    public void doStuff (int_strategy registr, int_strategy memory, int adr){
        this.doStuff (registr,memory,adr);
    }
    
    public abstract void doStuff (abs_registr registr, abs_memory memory, int adr);


}