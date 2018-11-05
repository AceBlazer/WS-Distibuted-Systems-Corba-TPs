package calc;

/**
* CalculatricePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculatrice.idl
* Tuesday, November 22, 2016 9:08:57 AM WAT
*/

public abstract class CalculatricePOA extends org.omg.PortableServer.Servant
 implements CalculatriceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("ajout", new java.lang.Integer (0));
    _methods.put ("soustrait", new java.lang.Integer (1));
    _methods.put ("mult", new java.lang.Integer (2));
    _methods.put ("divis", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Calculatrice/ajout
       {
         float x = in.read_float ();
         float y = in.read_float ();
         float $result = (float)0;
         $result = this.ajout (x, y);
         out = $rh.createReply();
         out.write_float ($result);
         break;
       }

       case 1:  // Calculatrice/soustrait
       {
         float x = in.read_float ();
         float y = in.read_float ();
         float $result = (float)0;
         $result = this.soustrait (x, y);
         out = $rh.createReply();
         out.write_float ($result);
         break;
       }

       case 2:  // Calculatrice/mult
       {
         float x = in.read_float ();
         float y = in.read_float ();
         float $result = (float)0;
         $result = this.mult (x, y);
         out = $rh.createReply();
         out.write_float ($result);
         break;
       }

       case 3:  // Calculatrice/divis
       {
         try {
           float x = in.read_float ();
           float y = in.read_float ();
           float $result = (float)0;
           $result = this.divis (x, y);
           out = $rh.createReply();
           out.write_float ($result);
         } catch (DivisionParZero $ex) {
           out = $rh.createExceptionReply ();
           DivisionParZeroHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Calculatrice:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Calculatrice _this() 
  {
    return CalculatriceHelper.narrow(
    super._this_object());
  }

  public Calculatrice _this(org.omg.CORBA.ORB orb) 
  {
    return CalculatriceHelper.narrow(
    super._this_object(orb));
  }


} // class CalculatricePOA
