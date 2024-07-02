package chain.abs.inter; 

import chainMember.inter.int_chainMember;

public interface int_chain {
    public void addMember(int_chainMember member);
    public void deleteMember(int_chainMember member);
    public int_chainMember findMember(String memberName);
}