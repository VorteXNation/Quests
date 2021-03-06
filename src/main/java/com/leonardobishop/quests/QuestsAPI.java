package com.leonardobishop.quests;

import com.leonardobishop.quests.player.QPlayerManager;
import com.leonardobishop.quests.quests.QuestManager;
import com.leonardobishop.quests.quests.tasktypes.TaskTypeManager;

/**
 * This contains some methods from the main Quests class which
 * will be useful in task type development. This is no different than
 * simply getting an instance of the main class, however this is the
 * preferred method of obtaining an instance of Quest classes outside
 * of the core plugin itself.
 *
 * It is recommended to use this over {@code Quests.get()}, unless there
 * are methods there that you absolutely need.
 */
public class QuestsAPI {

    private static Quests plugin;

    protected static void initialise(Quests plugin) {
        QuestsAPI.plugin = plugin;
    }

    public static QuestManager getQuestManager() {
        return plugin.getQuestManager();
    }

    public static QPlayerManager getPlayerManager() {
        return plugin.getPlayerManager();
    }

    public static TaskTypeManager getTaskTypeManager() {
        return plugin.getTaskTypeManager();
    }

}
