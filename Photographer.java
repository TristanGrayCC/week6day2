import java.util.*;

public class Photographer{

  public ArrayList<Printable> collection;
  public static void main(String[] args){
    HashMap<String, Integer> journal = new HashMap<String, Integer>();
  }

  public int cameraCount(){
    return collection.size();
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

  public int addPhoto(String string>, Integer integer){
    journal.put(string, integer);
  }

  public int numberOfPhotos(){
    return journal.length();
  }

}
