package calc;


/**
* CalculatriceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculatrice.idl
* Wednesday, November 16, 2016 2:40:37 PM WAT
*/

abstract public class CalculatriceHelper
{
  private static String  _id = "IDL:Calculatrice:1.0";

  public static void insert (org.omg.CORBA.Any a, Calculatrice that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Calculatrice extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CalculatriceHelper.id (), "Calculatrice");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Calculatrice read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_CalculatriceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Calculatrice value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Calculatrice narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Calculatrice)
      return (Calculatrice)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _CalculatriceStub stub = new _CalculatriceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Calculatrice unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Calculatrice)
      return (Calculatrice)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _CalculatriceStub stub = new _CalculatriceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
