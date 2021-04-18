public class Animal {
    //  Create an Animal class
    //  Every animal has a hunger value, which is a whole number
    //          Every animal has a thirst value, which is a whole number
    //          When creating a new animal instance these values must be set to the default 50 value
    //  Every animal can eat() which decreases its hunger by one
    //  Every animal can drink() which decreases its thirst by one
    //  Every animal can play() which increases both its hunger and thirst by one

  int thirst = 50;
  int hunger = 50;

  public void eat(){
    hunger--;
  }

  public void drink(){
    thirst--;
  }

  public void Play(){
    hunger++;
    thirst++;
  }

}
