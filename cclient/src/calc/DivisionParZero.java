package calc;

/**
* DivisionParZero.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculatrice.idl
* Tuesday, November 22, 2016 9:09:11 AM WAT
*/

public final class DivisionParZero extends org.omg.CORBA.UserException
{

  public DivisionParZero ()
  {
    super(DivisionParZeroHelper.id());
  } // ctor


  public DivisionParZero (String $reason)
  {
    super(DivisionParZeroHelper.id() + "  " + $reason);
  } // ctor

} // class DivisionParZero
