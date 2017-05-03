import java.util.ArrayList;
import java.util.List;

public class Hero{
  private String mName;
  private int mHeroId;
  private String mResidence;
  private String mPower;
  private String mImage;
  private static List<Hero> instances = new ArrayList<Hero>();

  public Hero(String name ,String residence, String power,String image){
    mName = name;
    mResidence = residence;
    mPower = power;
    mImage = image;
    mHeroId = instances.size();
    instances.add(this);
  }

  public String getName(){
    return mName;
  }

  public String getResidence(){
    return mResidence;
  }

  public String getPower(){
    return mPower;
  }

  public String getImage(){
    return mImage;
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
