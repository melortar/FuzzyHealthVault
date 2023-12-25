/*-------------------------------------------------------------------------*/
/*------------------- fuzzyTECH 5.54 Professional Edition -----------------*/
/*-------------------------------------------------------------------------*/
/*-------------------- Code Generator: Java Source Code -------------------*/
/*------------- Code Generation Date: Wed Nov 29 14:40:07 2023 ------------*/
/*------------------------ Fuzzy Logic System: CRANE ----------------------*/
/*-------------------------------------------------------------------------*/
/*-------- (c) 1991-2003 INFORM GmbH, Pascalstr. 23, D-52076 Aachen -------*/
/*------ Inform Software Corp., 2001 Midwest Rd., Oak Brook, IL 60523 -----*/
/*-------------------------------------------------------------------------*/

import com.fuzzytech.ftrun.Ftrun;
import com.fuzzytech.ftrun.FtrunInstantiationException;
import com.fuzzytech.ftrun.FtrunIndexOutOfBoundsException;
import com.fuzzytech.ftrun.FtrunIllegalDataTypeException;


public class CRANE extends Ftrun {
  private static char ftr16[] = {
    0x0442, 0x0000, 0x0000, 0x00B8, 0x0388, 0x0000, 0x0458, 0x0094, 0x046D, 0x0040, 
    0x0088, 0x0108, 0x0392, 0x002E, 0x039C, 0x03C2, 0x0457, 0x042C, 0x0440, 0x03D2, 
    0x0000, 0x009A, 0x0000, 
    0x8513, 0x0002, 0x0064, 0x046D, 0x046D, 0x0000, 0x0000, 0x03FC, 0x0001, 
    0x0000, 0xFFFF, 
    0x0000, 0xFFFF, 
    0x0000, 0xFFFF, 
    0x8000, 0xCCCC, 0x8000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x2AAB, 0x71C7, 
    0x2AAB, 0x71C7, 0x71C7, 0x8000, 
    0x71C7, 0x8000, 0x8000, 0x8E38, 
    0x8000, 0x8E38, 0x8E38, 0xD555, 
    0x8E38, 0xD555, 0xFFFF, 0xFFFF, 
    0x0000, 0x0000, 0x2000, 0x4000, 
    0x2000, 0x4000, 0x4000, 0x6000, 
    0x4000, 0x6000, 0x6000, 0x8000, 
    0x6000, 0x8000, 0x8000, 0xCCCC, 
    0x8000, 0xCCCC, 0xFFFF, 0xFFFF, 
    0x0000, 0xFFFF, 0x2AAB, 0xFFFF, 0x71C7, 0x0000, 0xFFFF, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 
    0x0000, 0x0000, 0x2AAB, 0x0000, 0x71C7, 0xFFFF, 0x8000, 0x0000, 0xFFFF, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 
    0x0000, 0x0000, 0x71C7, 0x0000, 0x8000, 0xFFFF, 0x8E38, 0x0000, 0xFFFF, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 
    0x0000, 0x0000, 0x8000, 0x0000, 0x8E38, 0xFFFF, 0xD555, 0x0000, 0xFFFF, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 
    0x0000, 0x0000, 0x8E38, 0x0000, 0xD555, 0xFFFF, 0xFFFF, 0xFFFF, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 
    0x0000, 0xFFFF, 0x2000, 0xFFFF, 0x4000, 0x0000, 0xFFFF, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 
    0x0000, 0x0000, 0x2000, 0x0000, 0x4000, 0xFFFF, 0x6000, 0x0000, 0xFFFF, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 
    0x0000, 0x0000, 0x4000, 0x0000, 0x6000, 0xFFFF, 0x8000, 0x0000, 0xFFFF, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 
    0x0000, 0x0000, 0x6000, 0x0000, 0x8000, 0xFFFF, 0xCCCC, 0x0000, 0xFFFF, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 
    0x0000, 0x0000, 0x8000, 0x0000, 0xCCCC, 0xFFFF, 0xFFFF, 0xFFFF, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 
    0x0000, 0x0000, 
    0x199A, 0x6333, 0x8000, 0xAAAA, 0xE443, 
    0xFFFF, 0xFFFF, 0xFFFF, 0xFFFF, 0xFFFF, 
    0x0000, 
    0x0002, 
    0x0005, 0x0000, 0xFFFF, 
    0x0005, 0x0000, 0xFFFF, 
    0x0001, 
    0x0000, 0x0000, 0x0000, 0x0004, 
    0x0001, 
    0x000A, 
    0x0005, 0x8000, 
    0x0000, 
    0x0003, 
    0x0005, 0x0000, 0x000F, 0x0001, 0x000F, 0x0002, 0x000A, 0x0003, 
    0x0001, 0x0001, 0x0008, 0x0080, 0x000D, 
    0x0001, 0x0001, 0x0007, 0x0080, 0x000D, 
    0x0001, 0x0001, 0x0008, 0x0080, 0x000E, 
    0x0001, 0x0001, 0x0009, 0x0080, 0x000E, 
    0x0001, 0x0001, 0x0006, 0x0080, 0x000C, 
    0x0001, 0x0001, 0x0007, 0x0080, 0x000C, 
    0x0001, 0x0001, 0x0009, 0x0080, 0x000D, 
    0x0001, 0x0001, 0x0006, 0x0080, 0x000B, 
    0x0001, 0x0001, 0x0007, 0x0080, 0x000B};
  private static byte ftr8[] = {
    (byte)0x34, (byte)0x00, (byte)0x34, (byte)0x00, (byte)0x34, (byte)0x00, (byte)0x34, 
    (byte)0x00, (byte)0x34, (byte)0x00, 
    (byte)0x34, (byte)0x00, (byte)0x34, (byte)0x00, (byte)0x34, (byte)0x00, (byte)0x34, 
    (byte)0x00, (byte)0x34, (byte)0x00, 
    (byte)0x00, (byte)0xC8, 
    (byte)0xC7, (byte)0x41, (byte)0x68, (byte)0x3A, 
    (byte)0x43, (byte)0x52, (byte)0x41, (byte)0x4E, (byte)0x45, (byte)0x00, (byte)0x00, 
    (byte)0x00, (byte)0x00, 
    (byte)0xBC, (byte)0x69, (byte)0x27, (byte)0x28, (byte)0x6A, (byte)0xA9, (byte)0x28, 
    (byte)0x77, 
    (byte)0x63, 
    (byte)0x41, (byte)0x6E, (byte)0x67, (byte)0x6C, (byte)0x65, (byte)0x00, (byte)0x44, 
    (byte)0x69, (byte)0x73, (byte)0x74, (byte)0x61, (byte)0x6E, (byte)0x63, (byte)0x65, 
    (byte)0x00, (byte)0x50, (byte)0x6F, (byte)0x77, (byte)0x65, (byte)0x72, (byte)0x00};
  private static double ftr64[] = {
    -90, 90, 0.005, 
    -10, 30, 0.001, 
    -30, 30, 0.001};

  //Constructor
  public CRANE() throws FtrunInstantiationException {
    super(ftr64, ftr16, ftr8);
  }

  //Public Methods: Attribute Access
  public void setValue(int ioIndex, double newValue) throws FtrunIndexOutOfBoundsException {
    try{
      setShellValue(ioIndex, newValue);
    }
    catch (FtrunIllegalDataTypeException e) {}
  }
  public double getValue(int ioIndex) throws FtrunIndexOutOfBoundsException {
    try{
      return getShellValue(ioIndex);
    }
    catch (FtrunIllegalDataTypeException e) {return 0;}
  }

  //Input 'Angle': Value Range: -90 .. 90
  public void setAngle(double newValue){
    setShellVal(0, newValue);
  }
  public double getAngle(){
    return getShellVal(0);
  }

  //Input 'Distance': Value Range: -10 .. 30
  public void setDistance(double newValue){
    setShellVal(1, newValue);
  }
  public double getDistance(){
    return getShellVal(1);
  }

  //Output 'Power': Value Range: -30 .. 30
  public double getPower(){
    return getShellVal(2);
  }

}