package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/***
 * Board.
 */
class BoardTest {

    private Board board;

    /***
     * Board.
     */
    @Test
    void testBoardConstruction() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);

        assertThat(board.getWidth()).isEqualTo(1);
        assertThat(board.getHeight()).isEqualTo(1);
    }
}
