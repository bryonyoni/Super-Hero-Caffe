import java.util.List;
import java.util.ArrayList;


public class League{
  private String mName;
  private static List<League> instances = new ArrayList<League>();
  private int mId;
  private List<Hero> mHeroes;

  public League(String name){
    mName = name;
    mId = instances.size();
    mHeroes = new ArrayList<Hero>();
    instances.add(this);
  }

  public String getName() {
    return mName;
  }

  public static List<League> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static League find(int id) {
    return instances.get(id);
  }

  public List<Hero> getHeroes() {
   return mHeroes;
  }

  public void addHero(Hero hero) {
  mHeroes.add(hero);
}

}
