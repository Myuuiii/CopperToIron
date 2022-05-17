package moe.myuuiii.coppertoiron;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

public class CopperToIronRecipe extends ShapedRecipe {
	public CopperToIronRecipe(Plugin plugin) {
		super(new NamespacedKey(plugin, "leathercrafting.craft"), new ItemStack(Material.IRON_INGOT, 1));
		this.shape(
				"   ",
				"cdc",
				"   ");
		setIngredient('d', Material.LIGHT_GRAY_DYE);
		setIngredient('c', Material.COPPER_INGOT);
	}
}
