package factory;

import factory.abs.abs_factory;
import chainMember.memory.Memory;
import java.util.Map;

public class MemoryFabric extends abs_factory{
  public Memory create(Map<String,Integer> params){
    Hah
    return new Memory(params.getKey(),params.getValue());
  }
  public Memory create (int size, String memType){
    return new Memory(size,memType);
  }
  public chain memorys (memStr[] memStr){
    chain memChain= new chain(memStr.length);
    for (memStr s : memStr){
        memChain.addMember( this.memory(s));
    }
    return memChain;
  }
}