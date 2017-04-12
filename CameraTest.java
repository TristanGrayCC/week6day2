import static org.junit.Assert.*;
import org.junit.*;

public class CameraTest{
  Photographer photographer;
  DigitalCamera digitalcamera;
  AnalogCamera analogcamera;

  @Before
  public void before() {
    photographer = new Photographer();
    digitalcamera = new DigitalCamera("Nikon 34T","Noise reduction filter","Hi-resolution");
    analogcamera = new AnalogCamera("Sony ILCE5100L","No noise reduciton","Lo-resolution");
  }

  @Test
  public void collectionStartsEmpty(){
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canbuydigitalcamera(){
    photographer.buy(digitalcamera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canbuyanalogcamera(){
    photographer.buy(analogcamera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canSellAll(){
    photographer.buy(digitalcamera);
    photographer.sellAll();
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canSellCamera(){
    photographer.buy(digitalcamera);
    photographer.removeLast();
    assertEquals(0,photographer.cameraCount());
  }

  @Test
  public void canPrintDetails(){
    photographer.buy(digitalcamera);
    photographer.buy(analogcamera);
    assertEquals("Nikon 34T, Noise reduction filter, Hi-resolution, Sony ILCE5100L, No noise reduciton, Lo-resolution, ",photographer.printFullDetails());
  }

  @Test
  public void canAddAndCountPhotos(){
    photographer.addPhoto("Landscape", 9);
    photographer.addPhoto("Portrait", 8);
    photographer.addPhoto("Cabbage", 2);
    photographer.addPhoto("Cat", 6);
    assertEquals(4,photographer.numberOfPhotos());
  }

}
