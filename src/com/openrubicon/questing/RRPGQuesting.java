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

    @Override
    public void onLoad()
    {
        RRPGCore.modules.addModule(this);
    }
}
