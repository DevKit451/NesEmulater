package chain.abs;

import chain.abs.inter.int_chain;
import chainMember.inter.int_chainMember;

abstract class abs_chain implements int_chain{
    private int_chainMember[] chain;
    private int i=0;

    protected abs_chain(int ArrayOf){
        chain = new int_chainMember[ArrayOf];
    }

    public void addMember(int_chainMember member){
        if (i >chain.length){
            int_chainMember[] newChain = new int_chainMember[chain.length+1];
            for (int m=0; m<chain.length; m++) chain[m]=newChain[m];
        }
            chain[i]=member;
            i++;
    }

    public void deleteMember(int_chainMember member)
    {
        int m=0;

        while (m<i & member.responce()!=chain[m].responce())m++;
        if (m<i) {
            chain[m]= null;
            for (int n=m; n+1<i; n++)chain[n]=chain[n+1];
        }
    }

    public int_chainMember findMember(String memberName)
    {
        int m=0;

        while (m<i & memberName != chain[m].responce()) m++;
        
        if (!(m<i)) return null;
        else return chain[m];
    }
}