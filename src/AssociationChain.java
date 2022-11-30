public class AssociationChain implements Chain {

    private Chain nextInChain;

    @Override
    public void setChainNext(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void createArrow(int response, Box b1, Box b2) {
        System.out.println("Generating Association Arrow");
        if (response != -1) {
            Arrow arrow = new AssociationDecoration(new JustLine());
            RightPanel.getRelationShips().add(
                    new RelationShip().setBox1(b1).setBox2(b2).setType("Association").setArrow(arrow));
        } else {
            System.out.println("No relation Ship Selected");
        }
    }
}
