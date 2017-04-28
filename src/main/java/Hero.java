import java.util.ArrayList;
import java.util.List;

public class Hero{
  private String mName;
  private static List<Hero> instances = new ArrayList<Hero>();
  private int mHeroId;

  public Hero(String name){
    mName = name;
    instances.add(this);
    mHeroId = instances.size();
  }

  public String getName(){
    return mName;
  }

  public static List<Hero> all(){
    return instances;
  }

  public static void clear(){
    instances.clear();
  }

  public int getHeroId() {
  return mHeroId;
}

}
