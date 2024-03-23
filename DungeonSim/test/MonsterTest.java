import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {

    @Test
    public void testMonsterInitialization() {
        monster monster = new monster("Goblin", 20, 15);

        assertEquals("Goblin", monster.name);
        assertEquals(20, monster.hp);
        assertEquals(15, monster.ac);
    }

    @Test
    public void testMonsterSetName() {
        monster monster = new monster("Orc", 30, 18);
        monster.name = "Troll";

        assertEquals("Troll", monster.name);
        assertEquals(30, monster.hp);
        assertEquals(18, monster.ac);
    }

    @Test
    public void testMonsterSetHP() {
        monster monster = new monster("Dragon", 100, 25);
        monster.hp = 150;

        assertEquals("Dragon", monster.name);
        assertEquals(150, monster.hp);
        assertEquals(25, monster.ac);
    }

    @Test
    public void testMonsterSetAC() {
        monster monster = new monster("Skeleton", 10, 12);
        monster.ac = 14;

        assertEquals("Skeleton", monster.name);
        assertEquals(10, monster.hp);
        assertEquals(14, monster.ac);
    }
}
