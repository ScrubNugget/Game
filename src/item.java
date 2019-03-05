public class item{
private int value;
private String name;
private double weight;
private int rarity;

public item(){
	name="dirt";
	value=0;
	weight=1;
	rarity=0;
}

public item(String n, int v, double w, int r ){
	name=n;
	value=v;
	weight=w;
	rarity=r;
}
public int getvalue(){
	return value;
}
public String getname(){
	return name;
}
public double getweight(){
	return weight;
}
public int getrarity(){
	return rarity;
}


}