import java.util.ArrayList;
import java.util.List;

public class Hero{
  private String mName;
  private int mHeroId;
  private static List<Hero> instances = new ArrayList<Hero>();

  public Hero(String name){
    mName = name;
    mHeroId = instances.size();
    instances.add(this);
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

  public static Hero find(int id){
    return instances.get(id-1);
  }

}
