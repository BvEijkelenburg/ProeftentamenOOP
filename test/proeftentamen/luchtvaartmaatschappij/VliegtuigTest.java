package proeftentamen.luchtvaartmaatschappij;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VliegtuigTest {
    private Vliegtuig v1, v2, v3;

    @BeforeEach
    public void init() {
        v1 = new Vliegtuig("737 Max", 4, "PH18761");
        v2 = new Vliegtuig("737 Max", 4, "PH18761");
        v3 = new Vliegtuig("747", 3, "PH18761");
    }

    @Test
    public void testEqualsGelijkeObjecten() {
        assertEquals(v1, v2);
    }

    @Test
    public void testEqualsOnGelijkeObjecten() {
        assertFalse(v1.equals(v3));
    }
}