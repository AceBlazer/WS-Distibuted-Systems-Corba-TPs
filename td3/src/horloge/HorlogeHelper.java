package horloge;


/**
* HorlogeHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Horloge.idl
* Wednesday, November 16, 2016 1:55:02 PM WAT
*/

abstract public class HorlogeHelper
{
  private static String  _id = "IDL:Horloge:1.0";

  public static void insert (org.omg.CORBA.Any a, Horloge that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Horloge extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (HorlogeHelper.id (), "Horloge");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Horloge read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_HorlogeStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Horloge value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Horloge narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Horloge)
      return (Horloge)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _HorlogeStub stub = new _HorlogeStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Horloge unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Horloge)
      return (Horloge)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _HorlogeStub stub = new _HorlogeStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
