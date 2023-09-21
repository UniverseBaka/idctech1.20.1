package net.kaden.idctech.util;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.kaden.idctech.command.utilcommands.ReturnHomeCommand;
import net.kaden.idctech.command.utilcommands.SetHomeCommand;

public class ModRegistries {
    public static void registerModStuffs() {
        /*registerFuels();
        registerModCompostable();*/
        registerCommands();
    }



    private static void registerCommands() {
        //CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);

    }
}
