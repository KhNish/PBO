package PBO;

//ini parent class
class player {
    String name, club;
    int age;
    
    //ini construction
    public player(String name, String club, int age){
        this.name = name;
        this.club = club;
        this.age = age;       
    }
    
    //setter-getter untuk 3 properti dari parent class player
    public void setName (String name) {
        this.name = name;       
    }
    public String getName () {
        return name;
    }
    public void setClub (String club) {
        this.club = club;       
    }
    public String getClub () {
        return club;
    }
    public void setAge (int age) {
        this.age = age;       
    }
    public int getAge () {
        return age;
    }
    
    //ini destruction yang saya dapat dari AI
    public void close(){
        System.out.println("Cleaning up resources from player");
    }
}

//buat beberapa child clsss dari parent class player
class attacker extends player {
    private int goals; //properti khusu milik child class attacker
    
    //construction milik child class
    public attacker (String name, String club, int age, int goals) {
        super (name, club, age);
        this.goals = goals;
    }
    
    //setternya
    public void setGoals (int goals){
        this.goals = goals;
    }
    
    //getter
    public int getGoals(){
        return goals;
    }
}

class midfielder extends player {
    private int assists;
    
    public midfielder (String name, String club, int age, int assists){
        super (name, club, age);
        this.assists = assists;
    }
    public void setAssist (int assists) {
        this.assists = assists;
    }
    public int getAssists () {
        return assists;
    }
}

class defender extends player {
    private int tackles;
    
    public defender (String name, String club, int age, int tackles) {
        super (name, club, age);
        this.tackles = tackles;
    }
    public void setTackles (int tackles) {
        this.tackles = tackles;
    }
    public int getTackles () {
        return tackles;
    }
}

class keeper extends player {
    private int saves;
    
    public keeper (String name, String club, int age, int saves) {
        super (name, club, age);
        this.saves = saves;
    }
    public void setSaves (int saves) {
        this.saves = saves;
    }
    public int getSaves () {
        return saves;
    }
}

//main class
public class TugasMinggu03 {
    public static void main(String[] args) {
        //objek untuk masing masing child class
        attacker penyerang = new attacker("Lamine Yamal", "FC Barcelona", 17, 23);
        midfielder gelandang = new midfielder ("Pedri", "FC Barcelona", 22, 53);
        defender bek = new defender("Pau Cubarsi", "FC Barcelona", 17, 50); 
        keeper kiper = new keeper("Inaki Pena", "FC Barcelona", 23, 40); 
        
        //teks print untuk informasi
        System.out.println("Penyerang bernama " + penyerang.getName() + " memiliki total karir gol sebanyak " + penyerang.getGoals() + " goal.");
        System.out.println("Gelandang bernama " + gelandang.getName() + " memiliki total bantuan sebanyak " + gelandang.getAssists() + " bantuan.");
        System.out.println("Bek bernama " + bek.getName() + " memiliki total jegalan sebanyak " + bek.getTackles() + " jegalan.");
        System.out.println("Kiper bernama " + kiper.getName() + " memiliki total penyelamatan sebanyak " + kiper.getSaves() + " penyelamatan.");
    }
}
