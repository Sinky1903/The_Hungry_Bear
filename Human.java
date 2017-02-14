public class Human implements Edible, Swimmable {

  public String speak(){
    return "Help I'm being eaten by a bear!";
  }

  public int getNutritionValue(){
    return 10000;
  }

}