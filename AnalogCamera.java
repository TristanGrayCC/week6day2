public class AnalogCamera implements Printable {

  public String name;
  public String addOns;
  public String resolution;

  public AnalogCamera(){
    this.name = "Sony ILCE5100L";
    this.addOns = "No noise reduciton";
    this.resolution = "Lo-resolution";
  }

  public String printDetails(){
    return name + ", " + addOns + ", " + resolution;
  };
}
