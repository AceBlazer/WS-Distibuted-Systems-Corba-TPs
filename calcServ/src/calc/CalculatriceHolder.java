package calc;


/**
* CalculatriceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculatrice.idl
* Wednesday, November 16, 2016 2:40:37 PM WAT
*/

public final class CalculatriceHolder implements org.omg.CORBA.portable.Streamable
{
  public Calculatrice value = null;

  public CalculatriceHolder ()
  {
  }

  public CalculatriceHolder (Calculatrice initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CalculatriceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CalculatriceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CalculatriceHelper.type ();
  }

}
