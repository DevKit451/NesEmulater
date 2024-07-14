import java.util.ArrayList;
import java.util.List;

import BaseList.*;
import centralProcessor.CentralProcessor;
import chainMember.operation.Abs_operation;
import chainMember.operation.operations.*;


public class Main {
   static void init(){
     ArrayList <String>  RegList = new ArrayList<>();
     RegList.add("A");
     RegList.add("X");
     RegList.add("Y");
     RegList.add("PC");
     RegList.add( "S");
     RegList.add( "P");

     ArrayList <BaseList<String,Integer>> memList = new ArrayList<>();
     memList.add(new BaseList("ZeroPage", 0xFF));
     memList.add(new BaseList("Stack", 0x1FF-0xFF));
     memList.add(new BaseList("General", 0xFFFF-0x200));

     ArrayList<Abs_operation> CommandList = new ArrayList<>();
     CommandList.add (new LoadRegistr("LD"));
     CommandList.add (new SaveRegistr( "ST"));
     CommandList.add (new AddRegistr(  "AD"));
     CommandList.add(new SubRegistr("SB"));


     CentralProcessor CP = new CentralProcessor(RegList, memList,CommandList );


   }
  public static void main(String[] args) {
    init();


    System.out.println("Hello world!");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}