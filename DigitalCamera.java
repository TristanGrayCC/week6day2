public class DigitalCamera implements Printable {

  public String name;
  public String addOns;
  public String resolution;

  public DigitalCamera(String name, String addOns, String resolution){
    this.name = name;
    this.addOns = addOns;
    this.resolution = resolution;
  }

  public String printDetails(){
    return name + ", " + addOns + ", " + resolution;
  };
}
