public class DigitalCamera implements Printable {

  public String name;
  public String addOns;
  public String resolution;

  public DigitalCamera(){
    this.name = "Nikon 34T";
    this.addOns = "Noise reduction filter";
    this.resolution = "Hi-resolution";
  }

  public String printDetails(){
    return name + ", " + addOns + ", " + resolution;
  };
}
