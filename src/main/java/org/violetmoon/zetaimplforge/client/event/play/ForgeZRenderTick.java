package org.violetmoon.zetaimplforge.client.event.play;

import org.violetmoon.zeta.client.event.play.ZRenderTick;

public record ForgeZRenderTick(RenderFrameEvent e) implements ZRenderTick {
	@Override
	public float getRenderTickTime() {
		return e.renderTickTime;
	}

	@Override
	public boolean isEndPhase() {
		return e.phase == TickEvent.Phase.END;
	}
}
