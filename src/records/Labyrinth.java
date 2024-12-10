package records;

public record Labyrinth(String name, int level) {
    double timePath(){
        if (level > 6){
            return Math.random()*6 +9;
        }
        else{
            return Math.random() * 4 + 1;
        }
    }
}
