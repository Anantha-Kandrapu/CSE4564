public class InheritanceChain implements Chain {

    private Chain nextInChain;

    @Override
    public void setChainNext(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void createArrow(int response, Box b1, Box b2) {
        if (response == 0) {
            System.out.println("Drawing inheritance");
            Arrow arrow = new InheritanceDecoration(new JustLine());
            RightPanel.getRelationShips().add(
                    new RelationShip().setBox1(b1).setBox2(b2).setType("Inheritance").setArrow(arrow));
        } else {
            nextInChain.createArrow(response, b1, b2);
        }
    }

}
