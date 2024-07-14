package centralProcessor;

import BaseList.BaseList;
import ChainOff.ChainOfMemory;
import ChainOff.ChainOfOperations;
import ChainOff.ChainOfReg;
import chainMember.memory.Memory;
import chainMember.operation.Abs_operation;
import chainMember.registr.Registr;

import java.util.ArrayList;

public class CentralProcessor {
    private final ChainOfReg SysReg;
    private final ChainOfMemory SysMemory;
    private final ChainOfOperations SysOperators;

    public CentralProcessor(ArrayList<String> regList, ArrayList<BaseList<String, Integer>> memList, ArrayList<Abs_operation> OperationsList) {
        SysMemory = new ChainOfMemory(memList.size());
        SysReg = new ChainOfReg(regList.size());
        SysOperators = new ChainOfOperations(OperationsList.size());
        for (BaseList<String, Integer> memory : memList) {
            SysMemory.addMember(new Memory(memory.getk(), memory.getv()));
        }
        for (String registr : regList) {
            SysReg.addMember(new Registr(registr));
        }
        for (Abs_operation operation : OperationsList) {
            SysOperators.addMember(operation);
        }


    }
}