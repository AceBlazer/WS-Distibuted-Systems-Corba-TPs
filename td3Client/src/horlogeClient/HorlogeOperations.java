package horlogeClient;


/**
* HorlogeOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Horloge.idl
* Wednesday, November 16, 2016 2:00:17 PM WAT
*/

public interface HorlogeOperations 
{
  String get_time ();
  String get_time_string ();
  void get_time_int (org.omg.CORBA.ShortHolder heure, org.omg.CORBA.ShortHolder min);
} // interface HorlogeOperations