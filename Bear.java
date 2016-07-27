import java.util.*;
//util includes the functionality we need to work with collections/array lists

public class Bear {
  private String name;
  // private Salmon[] belly;
  private ArrayList<Edible> belly;
  // private ArrayList<Salmon> bellySalmon;
  // private ArrayList<Human> bellyHuman;
  //private int foodCounter;

  public Bear(String name){
    // this.belly = new Salmon[5];
    this.belly = new ArrayList<Edible>();
    this.name = name;
    //this.foodCounter = 0;
  }

  public ArrayList<String> getBellyContents() {
      ArrayList<String> contents = new ArrayList<String>();
    for (int i = 0; i < belly.size(); i++) {
      Object item = new Object();
      Object itemClass = new Object();
      String itemName = new String();
      item = belly.get(i);
      itemClass = item.getClass();
      itemName = itemClass.toString();
      contents.add(itemName);
    }
    return contents;
  }

  public String getName(){
    return name;
  }

  public int foodCount(){
    /*int count = 0;
    for(Salmon salmon : belly){
      if(salmon != null){
        count++;
      }
    }
    return count;*/
    return belly.size();
  }

  public void eat(Edible food){
    /*if(bellyFull()) return;
    belly[foodCounter] = salmon;
    foodCounter++;*/
    belly.add(food);
  }

  // public void eat(Human human) {
  //   belly.add(human);
  // }
  //
  // public void eat(Salmon salmon) {
  //   belly.add(salmon);
  // }

  /*public boolean bellyFull(){
    return foodCounter >= belly.length;
  }*/

  public void sleep(){
    /*for(int i = 0; i < belly.length; i++){
      belly[i] = null;
    }
    foodCounter = 0;*/
    belly.clear();
  }

  public Edible throwUp(){
    if (foodCount() > 0) {
      return belly.remove(0);
    }
    return null;
  }


}
