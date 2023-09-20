package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


/**
 * Test suite for the {@link Board} class.
 */
class BoardTest {

    private Board board;

    @Test
    void testBoardConstruction() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);

        assertThat(board.getWidth()).isEqualTo(1);
        assertThat(board.getHeight()).isEqualTo(1);
    }

    @Test
    void testSquareAtWithNullSquare() {
        Square[][] gridWithNull = new Square[1][1];
        gridWithNull[0][0] = null;
        board = new Board(gridWithNull);

        assertThat(board.squareAt(0, 0)).isNull();
    }
}
