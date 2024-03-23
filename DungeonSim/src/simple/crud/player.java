public class player extends actions {
    public String name;
    public double hp;
    public double maxhp;
    public double ac;
    public double attackmodifier;
    public double healmodifier;

    public player(double tohit, double dmgdienr, double dmgdie, double heals, double healdienr, double healdie, String name, double hp, double maxhp, double ac, double attackmodifier, double healmodifier){
        super(tohit,dmgdienr,dmgdie,heals,healdienr,healdie);
        this.name= name;
        this.hp = hp;
        this.maxhp= hp;
        this.ac = ac;
        this.attackmodifier = attackmodifier;
        this.healmodifier = healmodifier;
    }
}
