/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.0.5074.a43557235 modeling language!*/



// line 2 "model.ump"
// line 22 "model.ump"
public class Calculator
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Calculator State Machines
  public enum Sm { empty, storing, display }
  private Sm sm;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Calculator()
  {
    setSm(Sm.empty);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getSmFullName()
  {
    String answer = sm.toString();
    return answer;
  }

  public Sm getSm()
  {
    return sm;
  }

  public boolean input()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case empty:
        setSm(Sm.storing);
        wasEventProcessed = true;
        break;
      case display:
        setSm(Sm.storing);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean equals()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case storing:
        setSm(Sm.display);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean clear()
  {
    boolean wasEventProcessed = false;
    
    Sm aSm = sm;
    switch (aSm)
    {
      case storing:
        setSm(Sm.empty);
        wasEventProcessed = true;
        break;
      case display:
        setSm(Sm.empty);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setSm(Sm aSm)
  {
    sm = aSm;
  }

  public void delete()
  {}

}