import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void itemTest() {
    new Item("Crates",21001,25).save();
    Item crates = Item.find("byName", "Crates").first();
    
    // Test 
    assertNotNull(crates);
    assertEquals("Crates", crates.name);
    }

}
