import com.projectkorra.projectkorra.BendingPlayer;
import com.projectkorra.projectkorra.ability.CoreAbility;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.entity.Player;

public class LightPunchListener implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() != Action.LEFT_CLICK_AIR && event.getAction() != Action.LEFT_CLICK_BLOCK) return;


        Player player = event.getPlayer();
        BendingPlayer bPlayer = BendingPlayer.getBendingPlayer(player);
        if (bPlayer == null) return;

        if (bPlayer.canBend(CoreAbility.getAbility(String.valueOf(LightPunch.class)))) {
            new LightPunch(player);
        }
    }
}