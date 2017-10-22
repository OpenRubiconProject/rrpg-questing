import Classes.QuestManager;
import Classes.Questing;
import com.openrubicon.core.api.command.Command;
import com.openrubicon.core.api.configuration.ConfigurationProperty;
import com.openrubicon.core.api.database.interfaces.DatabaseModel;
import com.openrubicon.core.api.database.interfaces.PostDatabaseLoad;
import com.openrubicon.core.api.recipes.interfaces.Recipe;
import com.openrubicon.core.api.server.players.interfaces.PlayerData;
import com.openrubicon.core.interfaces.Module;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Quinn on 10/22/2017.
 */
public class RRPGQuesting extends JavaPlugin implements Module {

    public static QuestManager questmanager;
    public static Questing questing;

    @Override
    public ArrayList<DatabaseModel> getDatabaseModels() {
        return null;
    }

    @Override
    public ArrayList<Command> getCommands() {
        return null;
    }

    @Override
    public ArrayList<PostDatabaseLoad> getPostDatabaseLoads() {
        return null;
    }

    @Override
    public String getKey() {
        return null;
    }

    @Override
    public String getOverview() {
        return null;
    }

    @Override
    public String getConfiguration() {
        return null;
    }
}
