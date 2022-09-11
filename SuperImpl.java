public class SuperImpl{
    public static void main(String[] args){
        Object ob=new Flash("Thunder","flash","run faster","barry","kind");
        System.out.println(ob);
        Flash f=new Flash("Thunder","flash","run faster","barry","kind");
        f.ability();
    }
}
class SuperHero{
    String name;
    String power;
    String c_name;
    String nature;
    SuperHero(String n,String p,String c,String nat){
        this.name=n;
        this.power=p;
        this.c_name=c;
        this.nature=nat;
    }
}
class Flash extends SuperHero{
    String sup;
    Flash(String su,String n,String p, String c,String na){
        super(n,p,c,na);
        sup=su;
    }
    void ability(){
        System.out.println("common name:"+c_name);
        System.out.println("power:"+power);
        System.out.println("super power:"+sup);
        System.out.println("Name:"+name);
        System.out.println("nature:"+nature);
    }
}
