package banque;


/**
* ComptePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Compte.idl
* Tuesday, November 22, 2016 9:51:49 AM WAT
*/

public abstract class ComptePOA extends org.omg.PortableServer.Servant
 implements CompteOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("deposer", new java.lang.Integer (0));
    _methods.put ("retirer", new java.lang.Integer (1));
    _methods.put ("afficher", new java.lang.Integer (2));
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
       case 0:  // Compte/deposer
       {
         double montant = in.read_double ();
         boolean $result = false;
         $result = this.deposer (montant);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Compte/retirer
       {
         double montant = in.read_double ();
         boolean $result = false;
         $result = this.retirer (montant);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Compte/afficher
       {
         double $result = (double)0;
         $result = this.afficher ();
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Compte:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Compte _this() 
  {
    return CompteHelper.narrow(
    super._this_object());
  }

  public Compte _this(org.omg.CORBA.ORB orb) 
  {
    return CompteHelper.narrow(
    super._this_object(orb));
  }


} // class ComptePOA
