package net.avicus.leap.api.trails;

import net.avicus.api.player.Gamer;
import net.avicus.api.player.ToggleType;
import net.avicus.leap.api.ParticleEffect;
import net.avicus.leap.api.Trail;

import org.bukkit.Location;

public class Critical extends Trail {

	public Critical() {
		super("critical");
	}

	@Override
	public void play(Location l) {
		for (Gamer g : Gamer.getList()) {
			if (ToggleType.TRAILS.getValue(g) == 0)
				ParticleEffect.CRIT.animateToPlayer(g.getPlayer(), l, getParticleAmount(), 1F);
		}
	}
	
	@Override
	public int getParticleAmount() {
		return 5;
	}

}
