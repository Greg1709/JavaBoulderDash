package model;

/**
 * This class represents the dirt entity.
 *
 * @author DENEUVE GREGORY AND CANDAT ETIENNE
 */
class Dirt extends Entity {

    /**
     * Instantiates a new Dirt.
     *
     * @param model associate the model
     * @param x sets the X position
     * @param y sets the Y position
     */
    Dirt(final Model model, final int x, final int y)
    {
        super(model,x,y,EntityType.DIRT);
    }
}
