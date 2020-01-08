import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;

public class MonsterTest {

    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void monster_instantiatesCorrectly_true() {
        Monster testMonster = new Monster("Bubbles", 1);
        assertEquals(true, testMonster instanceof Monster);
    }

    @Test
    public void Monster_instantiatesWithName_String() {
        Monster testMonster = new Monster("Bubbles", 1);
        assertEquals("Bubbles", testMonster.getName());
    }

    @Test
    public void Monster_instantiatesWithPersonId_int() {
        Monster testMonster = new Monster("Bubbles", 1);
        assertEquals(1, testMonster.getPersonId());
    }

}