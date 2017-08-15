package io.EmeraldDevelopment.Emerald.internal.plugin;

import io.EmeraldDevelopment.Emerald.commandmanager.Command;
import io.EmeraldDevelopment.Emerald.events.Listener;

import java.util.ArrayList;
import java.util.List;

/**
 * Class implementation of plugin object.
 */
public final class Plugin {

    private String pluginName;
    private String[] authors;
    private String version;
    private String permissionIdentifier;
    private boolean requireDatabase;
    private List<Command> commands = new ArrayList<>();
    private List<Listener> listeners = new ArrayList<>();

    public Plugin(String pluginName, String[] authors, String version, String permissionIdentifier, boolean requireDatabase) {
        this.pluginName = pluginName;
        this.authors = authors;
        this.version = version;
        this.permissionIdentifier = permissionIdentifier;
        this.requireDatabase = requireDatabase;
    }

    // The name of the plugin.
    public String getPluginName() {
        return pluginName;
    }

    // The authors of the plugin.
    public String[] getAuthors() {
        return authors;
    }

    // The version of the plugin.
    public String getVersion() {
        return version;
    }

    // The plugin's ID. (this should be handled automatically somehow)
    public String getPluginID() {
        return null;
    }

    // The base level permission identifier this plugin will use. (ie. for the permission "test.hello.world" the identifier is "test")
    public String getPermissionIdentifier() {
        return permissionIdentifier;
    }

    // Determines if this plugin requires a connected database to function.
    public boolean requireDatabase() {
        return requireDatabase;
    }

    // List of all commands this plugin contains.
    public List<Command> getCommands() {
        return commands;
    }

    // List of all listeners this plugin contains.
    public List<Listener> getListeners() {
        return listeners;
    }
}