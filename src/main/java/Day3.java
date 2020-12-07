import java.util.ArrayList;
import java.util.List;

public class Day3 {

    private static final String input = ".............#...#....#.....##.\n" +
            ".#...##.........#.#.........#.#\n" +
            ".....##......#.......#.........\n" +
            ".......#...........#.#.........\n" +
            "#...........#...#..#.#......#..\n" +
            ".........##....#.#...#.........\n" +
            ".....#.........#.#...........#.\n" +
            "....#...............##....##...\n" +
            "#.#.............#..#.......#.#.\n" +
            "...#...........................\n" +
            "......#..#....#.............#..\n" +
            "........#......#.......#.......\n" +
            "....#.....#..#.#...#.........#.\n" +
            "..#.#.......#.##...#....#.....#\n" +
            "...........#.........#..#......\n" +
            "#...........#.#..#...#.#.#....#\n" +
            "........#......................\n" +
            "....#.#.....#....#.......#..#..\n" +
            ".............................#.\n" +
            "....##..........#.....##......#\n" +
            "......#.....................#..\n" +
            "..#.....##.......#.............\n" +
            "....#.#..............#.#.......\n" +
            "..#.#........#.....#..##.......\n" +
            ".....#...##.........##....#.#..\n" +
            ".#....#..#..#...........#......\n" +
            ".............#.....##........#.\n" +
            "..#....#............#.........#\n" +
            "###..........#........#.......#\n" +
            "#...#..#.#.#.........#..#......\n" +
            "..#....#......#.............#..\n" +
            "#...#........#..#...#.....#....\n" +
            ".#..........#.#........#.......\n" +
            "#.....#.........#..#......#....\n" +
            "....#....##........#......#....\n" +
            ".......#....#.....#..#..#.....#\n" +
            ".........#...#.#...#.##........\n" +
            ".##.##...........#..##..#......\n" +
            ".#.##....#........#...#........\n" +
            ".......##.........##.####.....#\n" +
            "....#..##....#.................\n" +
            ".#........#..........#.........\n" +
            "##....##..........##........#..\n" +
            "#......#...........#....#..#...\n" +
            ".......#..#....##..##.....#....\n" +
            ".........#.#.#...#.....#.......\n" +
            "......#...#...#....#......#....\n" +
            "##....#..........#....##....##.\n" +
            "###.........#...#...#..........\n" +
            "#.....##.#........#.......#....\n" +
            "#...............#...##.#......#\n" +
            "..#.....####.###......#......#.\n" +
            "....#.......#..........#.......\n" +
            "....##..............#.#.#......\n" +
            ".......##..#.......#...........\n" +
            "..#.......##....#.......###...#\n" +
            "........#...#.......#.#...#....\n" +
            ".........##....#..#....#.......\n" +
            "............#.#.......#.#......\n" +
            ".....#.....#...#....#.##.......\n" +
            ".......#.........#.......#.....\n" +
            ".#..#...#.....#............#.##\n" +
            ".......#.#......##.............\n" +
            "##.#......#.....#.#............\n" +
            ".#....#.....#............#...#.\n" +
            ".........#.......#.#...........\n" +
            "#............#.##...#..#...#.#.\n" +
            "......#....#.......#....#......\n" +
            "..........#........#..#.#......\n" +
            "#..##.......#.........#..#.....\n" +
            ".........#.....##........#.#..#\n" +
            "..#................#...........\n" +
            "....#..#........##.........#..#\n" +
            "###...#....##.#......##.......#\n" +
            ".......#......##..#.......#....\n" +
            ".......###...#...#..........##.\n" +
            "................#.......#......\n" +
            ".#......##.##........#.........\n" +
            "....##.#.....##.......#........\n" +
            "...........#...........#.....#.\n" +
            "..#........#..#.#...#.#........\n" +
            "#...............#...#.##.##.#.#\n" +
            "................#.......#......\n" +
            ".#..#......#........#.#........\n" +
            "...##..#.......#.......#..#....\n" +
            ".#.....#.#....##..#........#...\n" +
            "........##......#..........#...\n" +
            ".#.......#.......#...#..#......\n" +
            ".#..##.....#....#............#.\n" +
            "...#..........#....#........#..\n" +
            "..#.#..#.......#.#.##..........\n" +
            "#........###.....#.#.......#.##\n" +
            ".....#....##.............#.#..#\n" +
            "..##............#...##.........\n" +
            "...#.........#...........#.....\n" +
            "...#......#.#...#..###.........\n" +
            ".............#...##............\n" +
            ".....##..##.####.#..#......#.#.\n" +
            ".#...#.....#.....#.#.....#.....\n" +
            ".........#.......###.....#..##.\n" +
            ".##.#..#..........#.##.#.#.....\n" +
            ".#...#...#.#.##......#..#......\n" +
            ".............#......#......#...\n" +
            "#.....................#......#.\n" +
            "...#.....#.....#....#........#.\n" +
            "................##..#....#..#..\n" +
            "#.###...#.....................#\n" +
            "...#..#....#.......#.........#.\n" +
            "...........#..#..#...........#.\n" +
            ".......#..#......#....#.#......\n" +
            "..........#......#..#....#.....\n" +
            ".#.#.....#...#.#...#...#.#....#\n" +
            ".....#.......#............#...#\n" +
            "#.#....#......#......#........#\n" +
            ".#.#..#.........##...#.........\n" +
            "#..###..#......................\n" +
            "..#.#..#.......................\n" +
            ".##.....#...#......#..#........\n" +
            "...#...........#...#.......##..\n" +
            "..#...........#........#.......\n" +
            "........#....#.....#.#.........\n" +
            "..........#...........#.....#..\n" +
            "......#...#...##.#.............\n" +
            ".#...#...##....................\n" +
            "............###.........#......\n" +
            ".#.#...................#..#....\n" +
            "....#.#...#.#........#.#.......\n" +
            "....#...#...........#.......#.#\n" +
            "...........#............#...##.\n" +
            ".....####....#.#......#.#......\n" +
            ".##.............#............#.\n" +
            "......#.........#............##\n" +
            "#.#....#...##....#.......#....#\n" +
            ".....#.#....#..#..#...#..#.#..#\n" +
            ".........................#.....\n" +
            "......#.#....###.......#....#..\n" +
            ".....................##.#...#.#\n" +
            "..#.....#.#.#...#...#..........\n" +
            "........#..##........#...#...#.\n" +
            "..........#.#.##....#....##....\n" +
            ".............#..#..............\n" +
            "..#.##..#.......#...#..#..##..#\n" +
            "..#..#....#.#..........#..#....\n" +
            "..........#....#...#......#....\n" +
            ".##...#.......................#\n" +
            ".#.....#....#..........#.......\n" +
            "...........#..#......##.....#..\n" +
            "......###.#..##....#...#.##....\n" +
            ".......#..#.#....#.............\n" +
            "...#..#......##.........###.#..\n" +
            "...........#............##...#.\n" +
            "...#...#...........##.....#....\n" +
            "..................#............\n" +
            ".#.#.#...#..............#..##..\n" +
            "#.#....#........#.........#.##.\n" +
            "#.#.#.......#.....#..........#.\n" +
            "...##.....##.#.....#...........\n" +
            ".#....#..............##...##..#\n" +
            "........##.....................\n" +
            "#..#..#.....###.............#..\n" +
            ".......#...........#...........\n" +
            ".........#.....................\n" +
            ".......#...#...#.....##........\n" +
            "......#.........#........#.....\n" +
            "...#....##..#.####.#.......#.#.\n" +
            ".....#..#......#........#.##..#\n" +
            ".##....#......##......#...###..\n" +
            "..###.#........##.#...#.......#\n" +
            "............#......##....#.#...\n" +
            ".....#....##..##............##.\n" +
            "......##....#.#...#....#.#..#.#\n" +
            ".......#.........#.#.....#.#...\n" +
            ".......#.#....#................\n" +
            ".##...###..#.....#............#\n" +
            "#.#......#.#..#..#.#...#..#..#.\n" +
            "..#.#.#.....#............#...##\n" +
            ".##....###.........#..#........\n" +
            ".#..#.#..#.#....#.........##.#.\n" +
            "....#..#...##.##........#......\n" +
            "........#.#....##....#....#....\n" +
            ".......#..#..#.#..............#\n" +
            "#....#....#.....#....#.........\n" +
            ".#.###...#....#.......#........\n" +
            ".........#.#....##....#...#....\n" +
            "....#.............#.....##.##..\n" +
            ".....#.....#...##..#.#.##...##.\n" +
            ".........#..#................##\n" +
            "...##..##......#.....#........#\n" +
            ".#....#.....#.#......#..###....\n" +
            "#.....#..#.....................\n" +
            "....#.#...#.#.................#\n" +
            ".....##..................#.....\n" +
            "#....##...#.##..###...#........\n" +
            "##.#.........#.......#....#....\n" +
            ".#.#.............##..#.##......\n" +
            "...#.#..............#......#...\n" +
            ".............#.........#.....#.\n" +
            "#.......#........#......#.....#\n" +
            ".....#..............#.##.#.....\n" +
            "#......##...................#..\n" +
            "##.#.....#..........#........#.\n" +
            "#...........##...........#.....\n" +
            ".#...#.....#..#..##....#.......\n" +
            ".....#.........#....##.#.......\n" +
            "#........#......#.............#\n" +
            ".#..................####.#.....\n" +
            "#...#......#....##...#.#..#..#.\n" +
            "............#.#............#...\n" +
            "............#........#.#..###..\n" +
            ".#..#..#..#.#.#.....#.#........\n" +
            "#.....#..#.#...#..#..#........#\n" +
            "#................#....#..#.....\n" +
            "....#..#..#.#......#.#..#.....#\n" +
            ".#..#.......#...##.#.#.....#..#\n" +
            "#.....................#.......#\n" +
            ".............#.......#...#.....\n" +
            "....#......#.........###.##....\n" +
            "....#..#.......#.#........#....\n" +
            "....#...#....#.#....#..........\n" +
            "...#..#......#.............#...\n" +
            ".......###.#.........#....#.#..\n" +
            "..#.....##.....................\n" +
            ".#.#...........#..##....#......\n" +
            "..........##.#....#.#..........\n" +
            "...........#.#..#.#..#.#.......\n" +
            "..........#..#...#.....##......\n" +
            ".....#.........#...#.#..#......\n" +
            "#.#................#..........#\n" +
            "...#.....##.#..#...#.##.......#\n" +
            ".....##...........#............\n" +
            ".....#...#...#...#.#.....#.....\n" +
            "...........##..................\n" +
            ".........#................#....\n" +
            "......#.....#.#...#.......#....\n" +
            "...#...#........#...#...#.#.#..\n" +
            "...............##..#....##...#.\n" +
            "...#.#...........##.......##..#\n" +
            "...........#............#......\n" +
            ".#....#.#.......##.#.#.#.......\n" +
            ".....#.#..#.#.#................\n" +
            ".#............#...#.#..........\n" +
            ".....#.......#.#.......#.....#.\n" +
            "#....#...........#...#....##...\n" +
            "..#...#..##.....#....#..#......\n" +
            "#.#.........#..#.#..#.#......#.\n" +
            "................#......##......\n" +
            "#........#..............#....#.\n" +
            "........#..#.#........#..#..#..\n" +
            "#..........#......#............\n" +
            "..##.......#..#.......#....#...\n" +
            ".#........#..#..#.#.......##...\n" +
            "................#..............\n" +
            "#.................#...........#\n" +
            "##..#...................#....##\n" +
            "#..#....#.....#.#..#.#.#......#\n" +
            "#................#.#.#...#.....\n" +
            ".............#..#...#..##...#.#\n" +
            "#..................#...........\n" +
            "..............#..#.....##.....#\n" +
            "..#...............#.#..........\n" +
            ".....#......#....#..#...#......\n" +
            ".#......#...##.....###.....#...\n" +
            "...##...##.##....#.#.#..#......\n" +
            "....#.#.......#..##....#.##....\n" +
            "...#.........#.#.....#...#...##\n" +
            ".##.#.........##..#.##..#......\n" +
            ".#...#......#......#.........#.\n" +
            ".............#.................\n" +
            "..........#..............#.....\n" +
            "##...........#...#...###....#..\n" +
            "....#...............#..........\n" +
            ".......####.....#......#.......\n" +
            "........#..........#..#........\n" +
            "..#.......#..#.................\n" +
            "......#.#..##...##....#........\n" +
            ".##...#........#...#....#...#..\n" +
            ".......................#.......\n" +
            ".........##..#..#...#....##...#\n" +
            "..#..#...#.....#.........#..#..\n" +
            ".......#....#.........#...#..#.\n" +
            ".............#.................\n" +
            ".....##..#.....###....##.#.....\n" +
            "....#.#..#..#.#.....##....#..#.\n" +
            "......#..#..............#.##..#\n" +
            "..#..#......#.#.........#..#...\n" +
            "..........#.#..#....#.....#....\n" +
            ".....................#.........\n" +
            "...#.....#.......##..#.#.......\n" +
            ".....#...#..........###....#.#.\n" +
            "......#.....##............#...#\n" +
            ".......#..........#.#..#...#..#\n" +
            "#...#..#...........#..##..#....\n" +
            ".#......#.......##.....#..#....\n" +
            "...#..#....#.......##......#...\n" +
            "........#.......##...#.......#.\n" +
            ".....#........#................\n" +
            "......#........#....#..........\n" +
            "...#....#....###.........#.#...\n" +
            "##..............#......#..#.#..\n" +
            ".........##....#........#..#.#.\n" +
            ".......#.##.#........#........#\n" +
            ".....###..#..#...........#....#\n" +
            ".......#....##.......#.#...#...\n" +
            "#..............#.#....#..#...#.\n" +
            "#..#....#..#.#............#..#.\n" +
            ".#...##.#..................#...\n" +
            "...#...............##.........#\n" +
            "###..............#.#..#.#.#....\n" +
            ".#......#.#.....##.......#.....\n" +
            "...#.................#.#.......\n" +
            ".#...#....#...#..#......#...#..\n" +
            "...##....#........#.#.#..#.....\n" +
            "..#.....#........#....#.#......\n" +
            "...........#.#...#.............\n" +
            "......#.....#.....#.........#..\n" +
            ".#.##.###...#.##.......#.......\n" +
            ".............#....#.......#....\n" +
            "..............#...........#....\n" +
            ".............#..#.#.....#....#.\n" +
            ".......#........##...##..##....\n" +
            "..##...#............#..#......#\n" +
            ".............#...##.....#......\n" +
            ".#...##..##.#.........#.##...#.\n";
    public static void main(String[] args) {

    }

    private static List<List<String>> getRouteMap() {
     return new ArrayList<>();
    }

}
