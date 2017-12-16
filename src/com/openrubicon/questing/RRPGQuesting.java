package com.openrubicon.questing;

import com.openrubicon.core.RRPGCore;
import com.openrubicon.core.api.command.Command;
import com.openrubicon.core.api.database.interfaces.DatabaseModel;
import com.openrubicon.core.api.database.interfaces.PostDatabaseLoad;
import com.openrubicon.core.interfaces.Module;
import com.openrubicon.questing.classes.QuestManager;
import com.openrubicon.questing.classes.Questing;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

/**
 * Created by Quinn on 10/22/2017.
 */
public class RRPGQuesting extends JavaPlugin implements Module {

    public static QuestManager questmanager;
    public static Questing questing;

    @Override
    public ArrayList<DatabaseModel> getDatabaseModels() {
        return new ArrayList<DatabaseModel>();
    }

    @Override
    public ArrayList<Command> getCommands() {
        return new ArrayList<Command>();
    }

    @Override
    public ArrayList<PostDatabaseLoad> getPostDatabaseLoads() {
        return new ArrayList<PostDatabaseLoad>();
    }

    @Override
    public String getKey() {
        return "rrpg-questing";
    }

    @Override
    public String getOverview() {
        return "Create, manage, and log quests and quest progress";
    }

    @Override
    public String getConfiguration() {
        return this.getDataFolder().getAbsolutePath();
    }

    @Override
    public void onLoad()
    {
        RRPGCore.modules.addModule(this);
    }
}
