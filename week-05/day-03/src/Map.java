import java.util.ArrayList;

public class Map {

  public ArrayList<ArrayList<Tiles>> getMap() {
    return map;
  }

  private ArrayList<ArrayList<Tiles>> map = new ArrayList<ArrayList<Tiles>>();
  int[][] intMap = new int[][]{
    {1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
    {1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
    {1, 0, 0, 0, 1, 0, 1, 0, 0, 1},
    {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
    {0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
    {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
    {1, 0, 1, 0, 1, 0, 0, 1, 0, 1},
    {1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
    {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
    {1, 1, 1, 0, 1, 0, 0, 1, 1, 1},
    /*{1, 0, 1, 0, 1, 0, 1, 1, 1, 1},*/
  };


  public void addMap() {
    for (int i = 0; i < intMap.length; i++) {
      ArrayList<Tiles> lines = new ArrayList<>();
      for (int j = 0; j < intMap[i].length; j++) {
        if (intMap[i][j] == 1) {
          Tiles floor = new Tiles(j, i, "img/floor.png");
          lines.add(floor);
        } else {
          Tiles wall = new Tiles(j, i, "img/wall.png");
          lines.add(wall);
        }
      }
      map.add(lines);
    }
  }
}

