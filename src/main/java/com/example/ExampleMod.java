package com.example.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class RigMod implements ModInitializer {
    public static boolean isRigged = false;
    private static KeyBinding toggleKey;

    @Override
    public void onInitialize() {
        toggleKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            \"key.rigmod.toggle\", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_RIGHT_SHIFT, \"category.rigmod\"));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (toggleKey.wasPressed()) {
                isRigged = !isRigged;
            }
        });
    }
}
