package chainMember.memory;

import chainMember.memory.inter.int_memory;
import chainMember.inter.int_chainMember;

public abstract class abs_memory implements int_chainMember, int_memory{
    private String memType;
    private byte[] memory;

    protected abs_memory(int size, String memType){
        memory= new byte[size];
        this.memType=memType;
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