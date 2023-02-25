package me.Pixelbetyar.Sorsjegy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;

public class Main extends org.bukkit.plugin.java.JavaPlugin implements org.bukkit.event.Listener
{
  public Main() {}
  
  public final Logger logger = Logger.getLogger("Minectaft");
  public static Main plugin;
  
  public static Economy economy = null;
  
  private boolean setupEconomy() {
    RegisteredServiceProvider<Economy> economyProvider = getServer()
      .getServicesManager().getRegistration(
      Economy.class);
    if (economyProvider != null) {
      economy = (Economy)economyProvider.getProvider();
    }
    
    return economy != null;
  }
  
  public void onDisable()
  {
    PluginDescriptionFile pdfFile = getDescription();
    logger.info(pdfFile.getName() + " Has Been Disabled");
  }
  
  public void onEnable()
  {
    PluginDescriptionFile pdfFile = getDescription();
    logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + 
      " Has Been Enabled");
    
    if (!setupEconomy()) {
      getLogger().severe(
        "PLUGIN REQUIRES VAULT, ERROR SETTING UP ECONOMY!");
      Bukkit.getPluginManager().disablePlugin(this);
    }
    
    Bukkit.getServer().getPluginManager().registerEvents(this, this);
  }
  
  private ItemStack setName(ItemStack is, String name) {
    ItemMeta im = is.getItemMeta();
    if (name != null)
      im.setDisplayName(name);
    is.setItemMeta(im);
    return is;
  }
  
  private ItemStack setNameAndLore(ItemStack is, String name, List<String> lore)
  {
    ItemMeta im = is.getItemMeta();
    if (name != null)
      im.setDisplayName(name);
    if (lore != null)
      im.setLore(lore);
    is.setItemMeta(im);
    return is;
  }
  
  public int koSorsjegyAr = 250;
  public int vasSorsjegyAr = 500;
  public int aranySorsjegyAr = 800;
  
  public int koSorsjegyEladAr = 100;
  public int vasSorsjegyEladAr = 200;
  public int aranySorsjegyEladAr = 310;
  
  public ItemStack addKSJ = new ItemStack(Material.STONE_PLATE, 1);
  public ItemStack addVSJ = new ItemStack(Material.IRON_PLATE, 1);
  public ItemStack addASJ = new ItemStack(Material.GOLD_PLATE, 1);
  

  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    Player player = (Player)sender;
    
    if (commandLabel.equalsIgnoreCase("sorsol"))
    {
      ItemStack itemInHand = player.getInventory().getItemInHand();
      int itemAmount = player.getInventory().getItemInHand().getAmount();
      
      ItemStack add2GoldenApple = new ItemStack(Material.GOLDEN_APPLE, 2);
      ItemStack add10GoldenApple = new ItemStack(Material.GOLDEN_APPLE, 
        10);
      ItemStack add64GoldenApple = new ItemStack(Material.GOLDEN_APPLE, 
        64);
      ItemStack add32GoldenApple = new ItemStack(Material.GOLDEN_APPLE, 
        32);
      ItemStack add16GoldenApple = new ItemStack(Material.GOLDEN_APPLE, 
        16);
      ItemStack add2SuperGoldenApple = new ItemStack(
        Material.GOLDEN_APPLE, 2, (short)1);
      ItemStack add10SuperGoldenApple = new ItemStack(
        Material.GOLDEN_APPLE, 10, (short)1);
      ItemStack add5SuperGoldenApple = new ItemStack(
        Material.GOLDEN_APPLE, 5, (short)1);
      ItemStack add20SuperGoldenApple = new ItemStack(
        Material.GOLDEN_APPLE, 10, (short)1);
      ItemStack add10GoldenCarrot = new ItemStack(Material.GOLDEN_CARROT, 
        10);
      ItemStack addDCP = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
      ItemStack addICP = new ItemStack(Material.IRON_CHESTPLATE, 1);
      ItemStack addILG = new ItemStack(Material.IRON_LEGGINGS, 1);
      ItemStack addIS = new ItemStack(Material.IRON_SWORD, 1);
      ItemStack addIB = new ItemStack(Material.IRON_BOOTS, 1);
      ItemStack addIH = new ItemStack(Material.IRON_HELMET, 1);
      ItemStack addDLG = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
      ItemStack addDB = new ItemStack(Material.DIAMOND_BOOTS, 1);
      ItemStack addDH = new ItemStack(Material.DIAMOND_HELMET, 1);
      ItemStack addDS = new ItemStack(Material.DIAMOND_SWORD, 1);
      ItemStack add2VSJ = new ItemStack(Material.IRON_PLATE, 2);
      ItemStack add2KSJ = new ItemStack(Material.STONE_PLATE, 2);
      ItemStack add3KSJ = new ItemStack(Material.STONE_PLATE, 3);
      ItemStack add10Gold = new ItemStack(Material.GOLD_INGOT, 10);
      ItemStack add2Gold = new ItemStack(Material.GOLD_INGOT, 2);
      ItemStack add5Gold = new ItemStack(Material.GOLD_INGOT, 5);
      
      ItemStack air = new ItemStack(Material.AIR);
      
      Random object = new Random();
      

      for (int counter = 1; counter <= 1; counter++) {
        int random = 1 + object.nextInt(40);
        
        if (itemInHand.getType().equals(Material.STONE_PLATE)) {
          if ((random == 1) || (random == 2) || (random == 3) || 
            (random == 4) || (random == 5) || (random == 6) || 
            (random == 7) || (random == 8) || (random == 9) || 
            (random == 10) || (random == 11) || (random == 12) || 
            (random == 13) || (random == 14) || (random == 15) || 
            (random == 16) || (random == 17) || (random == 18) || 
            (random == 19) || (random == 35) || (random == 27) || 
            (random == 26) || (random == 25)) {
            player.sendMessage(ChatColor.RED + 
              "Sajnos most nem nyertél semmit! :(");
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if ((random == 22) || (random == 23) || (random == 24)) {
            player.sendMessage(ChatColor.GREEN + 
              "Gratulálunk! Visszanyerted a sorsjegyedet! :)");
          } else if ((random == 28) || (random == 29)) {
            player.sendMessage(ChatColor.GREEN + 
              "Gratulálunk! Nyertél 2db ARANYALMÁT! :)");
            player.getInventory().addItem(new ItemStack[] { add2GoldenApple });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if ((random == 30) || (random == 31)) {
            player.sendMessage(ChatColor.GREEN + 
              "Gratulálunk! Nyertél 2db SZUPER ARANYALMÁT! :)");
            player.getInventory().addItem(new ItemStack[] { add2SuperGoldenApple });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if ((random == 32) || (random == 33)) {
            player.sendMessage(ChatColor.GREEN + 
              "Gratulálunk! Nyertél 10db Aranyrépát! :)");
            player.getInventory().addItem(new ItemStack[] { add10GoldenCarrot });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 34) {
            player.sendMessage(ChatColor.GOLD + 
              "Gratulálunk! Nyertél 10db SZUPER ARANYALMÁT! :)");
            player.getInventory().addItem(new ItemStack[] { add10SuperGoldenApple });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 36) {
            player.sendMessage(ChatColor.GRAY + 
              "Gratulálunk! Nyertél egy VASLÁBSZÁRVÉDŐT! :)");
            player.getInventory().addItem(new ItemStack[] { addILG });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 37) {
            player.sendMessage(ChatColor.GRAY + 
              "Gratulálunk! Nyertél egy VASMELLVÉRTET! :)");
            player.getInventory().addItem(new ItemStack[] { addICP });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 38) {
            player.sendMessage(ChatColor.GOLD + 
              "Gratulálunk! Nyertél egy ENCSANTOLT VASKARDOT! :)");
            addIS.addEnchantment(Enchantment.DAMAGE_ALL, 3);
            player.getInventory().addItem(new ItemStack[] { addIS });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 39) {
            player.sendMessage(ChatColor.DARK_AQUA + 
              "Gratulálunk! Nyertél egy GYÉMÁNTKARDOT! :)");
            player.getInventory().addItem(new ItemStack[] { addDS });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 40) {
            player.sendMessage(ChatColor.GOLD + 
              "Gratulálunk! Nyertél egy SZUPER VASFELSZERELÉST! :)");
            player.getInventory().addItem(new ItemStack[] { add2SuperGoldenApple });
            player.getInventory().addItem(new ItemStack[] { addICP });
            player.getInventory().addItem(new ItemStack[] { addILG });
            addIS.addEnchantment(Enchantment.DAMAGE_ALL, 3);
            player.getInventory().addItem(new ItemStack[] { addIS });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 21) {
            player.sendMessage(ChatColor.GREEN + "Gratulálunk!" + 
              ChatColor.GOLD + 
              " MEGNYERTED A LEGENDÁS VASKARDOT! :)");
            addIS.addEnchantment(Enchantment.DAMAGE_ALL, 3);
            addIS.addEnchantment(Enchantment.KNOCKBACK, 2);
            addIS.addEnchantment(Enchantment.FIRE_ASPECT, 1);
            addIS.addEnchantment(Enchantment.DAMAGE_UNDEAD, 1);
            player.getInventory().addItem(new ItemStack[] { addIS });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 20) {
            player.sendMessage(ChatColor.GREEN + "Gratulálunk!" + 
              ChatColor.GOLD + 
              " MEGNYERTED A LEGENDÁS VASMELVÉRTETT! :)");
            addICP.addEnchantment(Enchantment.THORNS, 1);
            addICP.addEnchantment(
              Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            addICP.addUnsafeEnchantment(
              Enchantment.PROTECTION_PROJECTILE, 3);
            player.getInventory().addItem(new ItemStack[] { addICP });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          }
        } else if (itemInHand.getType().equals(Material.IRON_PLATE)) {
          if ((random == 1) || (random == 2) || (random == 3) || 
            (random == 4) || (random == 5) || (random == 6) || 
            (random == 7) || (random == 8) || (random == 9) || 
            (random == 10) || (random == 11) || (random == 12) || 
            (random == 13) || (random == 14)) {
            player.sendMessage(ChatColor.RED + 
              "Sajnos most nem nyertél semmit! :(");
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if ((random == 17) || (random == 18) || (random == 19) || 
            (random == 20) || (random == 21) || (random == 22) || 
            (random == 23)) {
            player.sendMessage(ChatColor.GREEN + 
              "Gratulálunk! Visszanyerted a sorsjegyedet! :)");
          } else if ((random == 24) || (random == 25) || (random == 26) || 
            (random == 27) || (random == 28)) {
            player.sendMessage(ChatColor.GREEN + 
              "Gratulálunk! Nyertél 16db ARANYALMÁT! :)");
            player.getInventory().addItem(new ItemStack[] { add16GoldenApple });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if ((random == 30) || (random == 31) || (random == 32) || 
            (random == 33) || (random == 34) || (random == 29)) {
            player.sendMessage(ChatColor.GREEN + 
              "Gratulálunk! Nyertél 10db SZUPER ARANYALMÁT! :)");
            player.getInventory().addItem(new ItemStack[] { add10SuperGoldenApple });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if ((random == 35) || (random == 36)) {
            player.sendMessage(ChatColor.AQUA + 
              "Gratulálunk! Nyertél egy GYÉMÁNT LÁBSZÁRVÉDŐT és egy CIPŐT :)");
            player.getInventory().addItem(new ItemStack[] { addDLG });
            player.getInventory().addItem(new ItemStack[] { addDB });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if ((random == 37) || (random == 38)) {
            player.sendMessage(ChatColor.AQUA + 
              "Gratulálunk! Nyertél egy GYÉMÁNTMELLVÉRTET! :)");
            player.getInventory().addItem(new ItemStack[] { addDCP });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 39) {
            player.sendMessage(ChatColor.DARK_AQUA + 
              "Gratulálunk! Nyertél egy ENCSANTOLT GYÉMÁNTKARDOT! :)");
            addDS.addEnchantment(Enchantment.DAMAGE_ALL, 2);
            addDS.addEnchantment(Enchantment.KNOCKBACK, 1);
            addDS.addEnchantment(Enchantment.DAMAGE_UNDEAD, 1);
            player.getInventory().addItem(new ItemStack[] { addDS });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 40) {
            player.sendMessage(ChatColor.GREEN + "Gratulálunk!" + 
              ChatColor.DARK_BLUE + 
              "MEGNYERTED A LEGENDÁS GYÉMÁNTCSOMAGOT ! :)");
            addDS.addEnchantment(Enchantment.DAMAGE_ALL, 3);
            addDS.addEnchantment(Enchantment.KNOCKBACK, 2);
            addDS.addEnchantment(Enchantment.DAMAGE_UNDEAD, 1);
            player.getInventory().addItem(new ItemStack[] { addDS });
            
            addDCP.addEnchantment(
              Enchantment.PROTECTION_ENVIRONMENTAL, 3);
            addDCP.addEnchantment(Enchantment.THORNS, 1);
            player.getInventory().addItem(new ItemStack[] { addDCP });
            player.getInventory().addItem(new ItemStack[] { addDB });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 16) {
            player.sendMessage(ChatColor.DARK_AQUA + 
              "Gratulálunk! Nyertél egy SZUPER ARMORT! :)");
            player.getInventory().addItem(new ItemStack[] { addDCP });
            player.getInventory().addItem(new ItemStack[] { addDB });
            player.getInventory().addItem(new ItemStack[] { addDH });
            player.getInventory().addItem(new ItemStack[] { addILG });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 15) {
            player.sendMessage(ChatColor.GOLD + 
              "Gratulálunk! Nyertél egy SZUPER GYÉMÁNTFELSZERELÉST! :)");
            player.getInventory().addItem(new ItemStack[] { add5SuperGoldenApple });
            addDCP.addEnchantment(
              Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            player.getInventory().addItem(new ItemStack[] { addDCP });
            player.getInventory().addItem(new ItemStack[] { addDLG });
            addDS.addEnchantment(Enchantment.DAMAGE_ALL, 1);
            addDS.addEnchantment(Enchantment.KNOCKBACK, 1);
            player.getInventory().addItem(new ItemStack[] { addDS });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          }
        } else if (itemInHand.getType().equals(Material.GOLD_PLATE)) {
          if ((random == 1) || (random == 2) || (random == 3) || 
            (random == 4) || (random == 5) || (random == 6))
          {
            player.sendMessage(ChatColor.RED + 
              "Sajnos most nem nyertél semmit! :(");
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if ((random == 8) || (random == 9) || (random == 10) || 
            (random == 11)) {
            player.sendMessage(ChatColor.GREEN + 
              "Gratulálunk! Visszanyerted a sorsjegyedet! :)");
          } else if ((random == 12) || (random == 13)) {
            player.sendMessage(ChatColor.GOLD + 
              "Gratulálunk! Nyertél 3db KŐ SORSJEGYET! :)");
            
            player.getInventory().addItem(new ItemStack[] {
              setName(add3KSJ, "Sorsjegy") });
          }
          else if (random == 14) {
            player.sendMessage(ChatColor.GRAY + 
              "Gratulálunk! Nyertél 32db aranyalmát! :)");
            player.getInventory().addItem(new ItemStack[] { add32GoldenApple });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if ((random == 15) || (random == 16) || (random == 7)) {
            player.sendMessage(ChatColor.GRAY + 
              "Gratulálunk! Nyertél 32db aranyalmát! :)");
            player.getInventory().addItem(new ItemStack[] { add32GoldenApple });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 17) {
            player.sendMessage(ChatColor.GOLD + 
              "Gratulálunk! Nyertél 2db VAS SORSJEGYET! :)");
            player.getInventory().addItem(new ItemStack[] {
              setName(add2VSJ, "Sorsjegy") });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if ((random == 18) || (random == 19)) {
            player.sendMessage(ChatColor.GREEN + 
              "Gratulálunk! Nyertél 64db ARANYALMÁT! :)");
            player.getInventory().addItem(new ItemStack[] { add64GoldenApple });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if ((random == 20) || (random == 21) || (random == 22)) {
            player.sendMessage(ChatColor.GREEN + 
              "Gratulálunk! Nyertél 32db ARANYALMÁT! :)");
            player.getInventory().addItem(new ItemStack[] { add32GoldenApple });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 23) {
            player.sendMessage(ChatColor.GOLD + 
              "Gratulálunk! Nyertél 20db SZUPER ARANYALMÁT! :)");
            player.getInventory().addItem(new ItemStack[] { add20SuperGoldenApple });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 24) {
            player.sendMessage(ChatColor.GOLD + 
              "Gratulálunk! Nyertél 20db SZUPER ARANYALMÁT és 10db ARANYALMÁT! :)");
            player.getInventory().addItem(new ItemStack[] { add20SuperGoldenApple });
            player.getInventory().addItem(new ItemStack[] { add10GoldenApple });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 25) {
            player.sendMessage(ChatColor.AQUA + 
              "Gratulálunk! Nyertél egy GYÉMÁNTARMORT! :)");
            player.getInventory().addItem(new ItemStack[] { addDCP });
            player.getInventory().addItem(new ItemStack[] { addDLG });
            player.getInventory().addItem(new ItemStack[] { addDB });
            player.getInventory().addItem(new ItemStack[] { addDH });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if ((random == 27) || (random == 26)) {
            player.sendMessage(ChatColor.DARK_AQUA + 
              "Gratulálunk! Nyertél egy GYÉMÁNTFELSZERELÉST! :)");
            player.getInventory().addItem(new ItemStack[] { addDCP });
            player.getInventory().addItem(new ItemStack[] { addDLG });
            addDS.addEnchantment(Enchantment.KNOCKBACK, 1);
            player.getInventory().addItem(new ItemStack[] { addDS });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 28) {
            player.sendMessage(ChatColor.GREEN + "Gratulálunk!" + 
              ChatColor.GOLD + 
              " MEGYNYERTED A LEGENDÁS GYÉMÁNTKARDOT! :)");
            
            addDS.addEnchantment(Enchantment.DAMAGE_ALL, 3);
            addDS.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 2);
            addDS.addUnsafeEnchantment(
              Enchantment.DAMAGE_ARTHROPODS, 2);
            addDS.addEnchantment(Enchantment.KNOCKBACK, 2);
            addDS.addEnchantment(Enchantment.FIRE_ASPECT, 1);
            player.getInventory().addItem(new ItemStack[] {
              setName(addDS, "A legendás gyémántkard") });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 29) {
            player.sendMessage(ChatColor.GREEN + 
              "Gratulálunk!" + 
              ChatColor.GOLD + 
              " MEGYNYERTED A LEGENDÁS GYÉMÁNMELLVÉRTETT! :)");
            
            addDCP.addEnchantment(
              Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            addDCP.addEnchantment(Enchantment.THORNS, 2);
            addDCP.addUnsafeEnchantment(Enchantment.OXYGEN, 1);
            player.getInventory().addItem(new ItemStack[] {
              setName(addDCP, "A legendás gyémántmellvért") });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 30) {
            player.sendMessage(ChatColor.GREEN + 
              "Gratulálunk!" + 
              ChatColor.GOLD + 
              " MEGYNYERTED A LEGENDÁS GYÉMÁNTLÁBSZÁRVÉDŐT! :)");
            
            addDLG.addEnchantment(
              Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            addDLG.addEnchantment(Enchantment.THORNS, 2);
            addDLG.addUnsafeEnchantment(Enchantment.OXYGEN, 1);
            player.getInventory()
              .addItem(new ItemStack[] {
              setName(addDLG, 
              "A legendás gyémántlábszárvédő") });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 31) {
            player.sendMessage(ChatColor.GRAY + 
              "Gratulálunk! Nyertél egy ENCSANTOLT VASSZETTET! :)");
            
            addIH.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 
              2);
            player.getInventory().addItem(new ItemStack[] { addIH });
            addICP.addEnchantment(Enchantment.THORNS, 1);
            addICP.addEnchantment(Enchantment.PROTECTION_FIRE, 2);
            player.getInventory().addItem(new ItemStack[] { addICP });
            addILG.addEnchantment(
              Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            player.getInventory().addItem(new ItemStack[] { addILG });
            addIB.addEnchantment(Enchantment.PROTECTION_FALL, 1);
            addIB.addEnchantment(Enchantment.WATER_WORKER, 1);
            player.getInventory().addItem(new ItemStack[] { addIB });
            addIS.addEnchantment(Enchantment.DAMAGE_ALL, 1);
            player.getInventory().addItem(new ItemStack[] { addIS });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if ((random == 33) || (random == 32)) {
            player.sendMessage(ChatColor.GOLD + 
              "Gratulálunk! Nyertél egy Ajándékcsomagot! :)");
            player.getInventory().addItem(new ItemStack[] { addDS });
            player.getInventory().addItem(new ItemStack[] { addDCP });
            player.getInventory().addItem(new ItemStack[] { addDH });
            player.getInventory().addItem(new ItemStack[] { add10GoldenApple });
            player.getInventory().addItem(new ItemStack[] { setName(addKSJ, "Sorsjegy") });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if ((random == 35) || (random == 34)) {
            player.sendMessage(ChatColor.GOLD + 
              "Gratulálunk! Nyertél 5db aranyrudat! :)");
            player.getInventory().addItem(new ItemStack[] { add5Gold });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 36) {
            player.sendMessage(ChatColor.GOLD + 
              "Gratulálunk! Nyertél 10db aranyrudat! :)");
            player.getInventory().addItem(new ItemStack[] { add10Gold });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 37) {
            player.sendMessage(ChatColor.GOLD + 
              "Gratulálunk! Nyertél egy ajándékcsomagot! :)");
            player.getInventory().addItem(new ItemStack[] { add2Gold });
            
            player.getInventory().addItem(new ItemStack[] {
              setName(addKSJ, "Sorsjegy") });
            player.getInventory().addItem(new ItemStack[] { add10GoldenApple });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 38) {
            player.sendMessage(ChatColor.GOLD + 
              "Gratulálunk! Nyertél egy ajándékcsomagot! :)");
            player.getInventory().addItem(new ItemStack[] { add2Gold });
            player.getInventory().addItem(new ItemStack[] { add5SuperGoldenApple });
            player.getInventory().addItem(new ItemStack[] { add10GoldenApple });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 39) {
            player.sendMessage(ChatColor.GOLD + 
              "Gratulálunk! Nyertél egy sorsjegyekből álló ajándékcsomagot! :)");
            
            player.getInventory().addItem(new ItemStack[] {
              setName(add2VSJ, "Sorsjegy") });
            player.getInventory().addItem(new ItemStack[] {
              setName(add2KSJ, "Sorsjegy") });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          } else if (random == 40) {
            player.sendMessage(ChatColor.GOLD + 
              "Gratulálunk! Megnyerted a főnyereményt! Egy SZUPER AJÁNDÉKCSOMAGOT! :)");
            player.getInventory().addItem(new ItemStack[] { add10GoldenApple });
            player.getInventory().addItem(new ItemStack[] { addDCP });
            player.getInventory().addItem(new ItemStack[] { addDLG });
            addDS.addEnchantment(Enchantment.DAMAGE_ALL, 3);
            player.getInventory().addItem(new ItemStack[] { addDS });
            player.getInventory().addItem(new ItemStack[] { add5Gold });
            
            player.getInventory().addItem(new ItemStack[] {
              setName(addVSJ, "Sorsjegy") });
            player.getInventory().addItem(new ItemStack[] {
              setName(addKSJ, "Sorsjegy") });
            
            if (itemAmount > 1) {
              itemInHand.setAmount(itemAmount - 1);
            } else if (itemAmount == 1) {
              player.getInventory().setItemInHand(air);
            }
          }
        } else {
          player.sendMessage(ChatColor.RED + 
            "Csak akkor tudsz sorsolni, ha egy sorsjegy van a kezedben!");
        }
      }
    }
    
    if ((commandLabel.equalsIgnoreCase("sorsjegykereskedes")) || 
      (commandLabel.equalsIgnoreCase("sjkereskedes")))
    {
      List<String> kilep = new ArrayList();
      kilep.add("Itt tudsz kilépni!");
      List<String> koelad = new ArrayList();
      koelad.add("+" + koSorsjegyEladAr + "$");
      List<String> vaselad = new ArrayList();
      vaselad.add("+" + vasSorsjegyEladAr + "$");
      List<String> aranyelad = new ArrayList();
      aranyelad.add("+" + aranySorsjegyEladAr + "$");
      List<String> kovasar = new ArrayList();
      kovasar.add("-" + koSorsjegyAr + "$");
      List<String> vasvasar = new ArrayList();
      vasvasar.add("-" + vasSorsjegyAr + "$");
      List<String> aranyvasar = new ArrayList();
      aranyvasar.add("-" + aranySorsjegyAr + "$");
      
      ItemStack air = new ItemStack(Material.AIR);
      
      Inventory inv = Bukkit.createInventory(null, 9, 
        "Sorsjegy kereskedő");
      inv.setItem(0, setNameAndLore(new ItemStack(Material.STONE_PLATE), 
        "Kő sorsjegy vásárlás", kovasar));
      inv.setItem(1, setNameAndLore(new ItemStack(Material.IRON_PLATE), 
        "Vas sorsjegy vásárlás", vasvasar));
      inv.setItem(2, setNameAndLore(new ItemStack(Material.GOLD_PLATE), 
        "Arany sorsjegy vásárlás", aranyvasar));
      inv.setItem(3, air);
      inv.setItem(4, setNameAndLore(new ItemStack(Material.STONE), 
        "Kő sorsjegy eladás", koelad));
      inv.setItem(5, setNameAndLore(new ItemStack(Material.IRON_INGOT), 
        "Vas sorsjegy eladás", vaselad));
      inv.setItem(6, setNameAndLore(new ItemStack(Material.GOLD_INGOT), 
        "Arany sorsjegy eladás", aranyelad));
      inv.setItem(7, air);
      inv.setItem(8, setNameAndLore(new ItemStack(Material.FIRE), 
        ChatColor.RED + "Kilépés", kilep));
      
      player.openInventory(inv);
    }
    
    return false;
  }
  
  @org.bukkit.event.EventHandler
  public void onInventoryClick(InventoryClickEvent event)
  {
    if (!(event.getWhoClicked() instanceof Player)) {
      return;
    }
    if (!event.getInventory().getName().equalsIgnoreCase("Sorsjegy kereskedő")) {
      return;
    }
    event.setCancelled(true);
    Player player = (Player)event.getWhoClicked();
    
    ItemStack is = event.getCurrentItem();
    
    ItemStack itemInHand = player.getInventory().getItemInHand();
    ItemStack air = new ItemStack(Material.AIR);
    int itemAmount = itemInHand.getAmount();
    
    if (is == null)
      return;
    if ((is.getType() == null) || (is.getType().equals(Material.AIR)) || 
      (!is.hasItemMeta()) || (is.getType().equals(Material.DIAMOND))) {
      return;
    }
    String sj = "Sorsjegy";
    
    switch (event.getCurrentItem().getType()) {
    case DIAMOND_CHESTPLATE: 
      if (economy.getBalance(player) >= koSorsjegyAr) {
        EconomyResponse er = economy.withdrawPlayer(player, 
          koSorsjegyAr);
        if (er.transactionSuccess()) {
          player.getInventory().addItem(new ItemStack[] { setName(addKSJ, sj) });
          player.sendMessage(ChatColor.GREEN + 
            "Sikeresen vettél egy kő sorsjegyet " + 
            ChatColor.GOLD + koSorsjegyAr + "$" + 
            ChatColor.GREEN + "-ért!");
        }
      } else {
        player.closeInventory();
        player.sendMessage(ChatColor.RED + 
          "Nincs elég pénzed hogy vegyél egy kő sorsjegyet!");
      }
      player.closeInventory();
      break;
    case HUGE_MUSHROOM_2: 
      if (economy.getBalance(player) >= vasSorsjegyAr) {
        EconomyResponse er = economy.withdrawPlayer(player, 
          koSorsjegyAr);
        if (er.transactionSuccess()) {
          player.getInventory().addItem(new ItemStack[] { setName(addVSJ, sj) });
          player.sendMessage(ChatColor.GREEN + 
            "Sikeresen vettél egy vas sorsjegyet " + 
            ChatColor.GOLD + vasSorsjegyAr + "$" + 
            ChatColor.GREEN + "-ért!");
        }
      } else {
        player.closeInventory();
        player.sendMessage(ChatColor.RED + 
          "Nincs elég pénzed hogy vegyél egy vas sorsjegyet!");
      }
      player.closeInventory();
      break;
    case HUGE_MUSHROOM_1: 
      if (economy.getBalance(player) >= aranySorsjegyAr) {
        EconomyResponse er = economy.withdrawPlayer(player, 
          aranySorsjegyAr);
        if (er.transactionSuccess()) {
          player.getInventory().addItem(new ItemStack[] { setName(addASJ, sj) });
          player.sendMessage(ChatColor.GREEN + 
            "Sikeresen vettél egy arany sorsjegyet " + 
            ChatColor.GOLD + aranySorsjegyAr + "$" + 
            ChatColor.GREEN + "-ért!");
        }
      } else {
        player.sendMessage(ChatColor.RED + 
          "Nincs elég pénzed hogy vegyél egy arany sorsjegyet!");
      }
      player.closeInventory();
      break;
    case ACTIVATOR_RAIL: 
      if (itemInHand.getType().equals(Material.STONE_PLATE))
      {
        getServer().dispatchCommand(
          getServer().getConsoleSender(), 
          "eco give " + player.getName() + " " + 
          koSorsjegyEladAr);
        if (itemAmount > 1)
        {


























































































































































































































































































































































































































































































































































































































































































































































          itemInHand.setAmount(itemAmount - 1);
        } else if (itemAmount == 1) {
          player.getInventory().setItemInHand(air);
        }
      } else {
        player.sendMessage(ChatColor.RED + 
          "Csak akkor tudsz eladni egy kő sorsjegyet, ha az van a kezedben!");
      }
      player.closeInventory();
      break;
    case LEATHER_CHESTPLATE: 
      if (itemInHand.getType().equals(Material.IRON_PLATE)) {
        getServer().dispatchCommand(
          getServer().getConsoleSender(), 
          "eco give " + player.getName() + " " + 
          vasSorsjegyEladAr);
        
        if (itemAmount > 1) {
          itemInHand.setAmount(itemAmount - 1);
        } else if (itemAmount == 1) {
          player.getInventory().setItemInHand(air);
        }
      } else {
        player.sendMessage(ChatColor.RED + 
          "Csak akkor tudsz eladni egy vas sorsjegyet, ha az van a kezedben!");
      }
      player.closeInventory();
      break;
    case LEATHER_HELMET: 
      if (itemInHand.getType().equals(Material.GOLD_PLATE)) {
        getServer().dispatchCommand(
          getServer().getConsoleSender(), 
          "eco give " + player.getName() + " " + 
          aranySorsjegyEladAr);
        
        if (itemAmount > 1) {
          itemInHand.setAmount(itemAmount - 1);
        } else if (itemAmount == 1) {
          player.getInventory().setItemInHand(air);
        }
      } else {
        player.sendMessage(ChatColor.RED + 
          "Csak akkor tudsz eladni egy arany sorsjegyet, ha az van a kezedben!");
      }
      player.closeInventory();
      break;
    default: 
      player.closeInventory();
    }
  }
}
