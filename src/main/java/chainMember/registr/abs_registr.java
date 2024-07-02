package    chainMember.registr;

import    chainMember.inter.int_chainMember;
import    chainMember.registr.inter.int_registr;

public abstract class abs_registr implements int_chainMember, int_registr{
    private String regType;
    private int RegVal;

    public abs_registr (String regType){
        this.regType=regType;
    }

    public String responce(){
        return regType;
    }

    public byte get (){
        return (byte) RegVal;
    }
    public void set(int data){
        RegVal=data;
    }

}