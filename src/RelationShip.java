public class RelationShip {
    String type;

    Box box1;
    Box box2;
    Arrow arrow;

    public String getType() {
        return type;
    }

    public RelationShip setType(String type) {
        this.type = type;
        return this;
    }

    public Box getBox1() {
        return box1;
    }

    public RelationShip setBox1(Box box1) {
        this.box1 = box1;
        return this;
    }

    public Box getBox2() {
        return box2;
    }

    public RelationShip setBox2(Box box2) {
        this.box2 = box2;

        return this;
    }

    public Arrow getArrow() {
        return arrow;
    }

    public RelationShip setArrow(Arrow arrow) {
        this.arrow = arrow;
        return this;
    }

    RelationShip() {
    }

}
