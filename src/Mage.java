public class Mage {
    String name;
    int level;
    int damage;
    String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }
    String getInfo(){
        return name+", "+ level+" ,"+type+ ", "+damage+".";
    }
    String mageFight(Mage mage){
        if (this.type.equals("Fire")&&mage.type.equals("Ice"))return mage.name;
        else if (this.type.equals("Ice")&&mage.type.equals(("Earth")))return mage.name;
        else if (this.type.equals("Earth")&&mage.type.equals("Fire"))return mage.name;
        else {
            if (this.level>mage.level)return this.name;
            else if (this.level<mage.level)return mage.name;
            else {
                if (this.damage>mage.damage)return this.name;
                else if (this.level<mage.level)return mage.name;
                else return "Draw";
            }
        }
    }
}
