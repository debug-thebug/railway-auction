package railway.sim.utils;

import java.io.Serializable;

public class BidInfo implements Serializable {
    // The id of the link.
    public int id;

    // The first town of the link.
    public String town1;

    // The second town of the link.
    public String town2;

    // The amount that the link was bid for.
    public double amount;

    // Indicates the player that owns this link.
    public String owner;
}
