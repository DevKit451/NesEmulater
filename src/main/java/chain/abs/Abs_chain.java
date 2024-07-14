package chain.abs;

import chain.abs.inter.int_chain;
import chainMember.inter.int_chainMember;

import java.util.ArrayList;

interface ChainMem{
    public boolean get(char registr);
    public ChainMem setReg();
}

public abstract class Abs_chain implements int_chain{
    private ArrayList<int_chainMember> ChainMember;
    private int i=0;

    protected Abs_chain(int ArrayOf){ChainMember = new ArrayList<int_chainMember>(ArrayOf);}

    public void addMember(int_chainMember member){ChainMember.add(member);}
    public void deleteMember(int_chainMember member) {ChainMember.remove(member);}
    public int_chainMember findMember(String memberName)
    {
        int m=0;

        while (m<i & !memberName.equals(ChainMember.get(m).responce()))
            m++;

        if (!(m<ChainMember.size()))
            return null;
        else
            return ChainMember.get(m);
    }
}