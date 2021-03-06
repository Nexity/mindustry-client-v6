package mindustry.client.antigrief;

import mindustry.gen.*;
import mindustry.world.*;

public class BreakTileLog extends TileLogItem {
    public Block block;
    /**
     * Creates a TileLogItem.  time is unix time.
     */
    public BreakTileLog(Unitc player, Tile tile, long time, String additionalInfo, Block block){
        super(player, tile, time, additionalInfo);
        this.block = block;
    }

    @Override
    protected String formatDate(String date, long minutes) {
        return String.format("%s broke %s at %s UTC (%d minutes ago).  %s", player, block.localizedName, date, minutes, additionalInfo);
    }

    @Override
    protected String formatConcise(String date, long minutes) {
        return String.format("%s broke %s (%dm)", player, block.localizedName, minutes);
    }
}
