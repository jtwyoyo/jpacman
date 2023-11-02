package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Direction.
 */
public class DirectionTest {
    /**
     * Do we get the correct delta when moving north?
     */
    @Test
    void testNorth() {
        Direction north = Direction.valueOf("NORTH");
        assertThat(north.getDeltaY()).isEqualTo(-1);
    }
    /**
     * Direction.
     */
    @Test
    void testSouth() {
        Direction north = Direction.valueOf("SOUTH");
        assertThat(north.getDeltaY()).isEqualTo(1);
    }
    /**
     * Direction.
     */
    @Test
    void testEast() {
        Direction north = Direction.valueOf("EAST");
        assertThat(north.getDeltaX()).isEqualTo(1);
    }
    /**
     * Direction.
     */
    @Test
    void testWest() {
        Direction north = Direction.valueOf("WEST");
        assertThat(north.getDeltaX()).isEqualTo(-1);
    }
}
