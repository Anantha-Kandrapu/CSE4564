/*
 * This is part of the Chain of Responsibility Pattern.
 */

public interface Chain {

    public void setChainNext(Chain nextChain);
    public void createArrow(int response, Box b1, Box b2);

}
