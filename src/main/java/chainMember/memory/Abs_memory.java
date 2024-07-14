package chainMember.memory;

import chainMember.memory.inter.*;
import chainMember.inter.int_chainMember;

public abstract class Abs_memory implements int_chainMember, int_memory{
    private String memType;
    private byte[] memory;

    protected <String, Integer> Abs_memory( String memType, Integer size){
        memory= new byte[(int) size];
        this.memType= java.lang.String.valueOf(memType);
    }

    public String responce(){
        return memType;
    }

    public byte get (int adr){
        return memory[adr];
    }
    public void set(byte data, int adr){
        memory[adr]=data;
    }
}