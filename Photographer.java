import java.util.*;

public class Photographer{

  public ArrayList<Printable> collection;
  public HashMap<String, Integer> journal;

  public Photographer(){
    this.collection = new ArrayList<Printable>();
    this.journal = new HashMap<String, Integer>();
  }

  public int cameraCount(){
    return collection.size();
  }

  public String printFullDetails(){
    String details = "";
    for(Printable printable : collection){
      details += printable.printDetails();
    }
    return details;
  }

  public void buy(DigitalCamera digitalcamera){
   collection.add(digitalcamera);
  }

  public void buy(AnalogCamera analogcamera){
   collection.add(analogcamera);
  }

  public void sellAll(){
    collection.clear();
  }

  public Printable removeLast(){
    if(cameraCount() > 0){
      return collection.remove(0);
    }
    return null;
  }

  public void addPhoto(String string, Integer integer){
    journal.put(string, integer);
  }

  public int numberOfPhotos(){
    return journal.size();
  }

}
