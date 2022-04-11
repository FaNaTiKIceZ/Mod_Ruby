package net.mcreator.rubin.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.rubin.init.RubyModItems;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class MotyghaProcedure {
	@SubscribeEvent
	public static void onItemDestroyed(PlayerDestroyItemEvent event) {
		execute(event, event.getPlayer(), event.getOriginal());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == RubyModItems.RUBIN_ARMOR_HOE && entity instanceof Player) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ruby:dostizhieniie_4"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
	}
}
