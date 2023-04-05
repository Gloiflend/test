public class Programmer {


        String name;
        String company;

    public String getPosition() {
        return position;
    }
    String position;

    public Programmer(String name, String company, String position) {
        this.name = name;
        this.company = company;
        this.position="intern";
    }
    void work(){
        switch (position){
            case "intern":
                position= "junior";
                break;
            case "junior":
                position="middle";
                break;
            case "middle":
                position="senior";
                break;
            case "senior":
                position="lead";
                break;

        }
    }
}

