package com.feiliao.oauth.sdk.flipchat.open.debug;

import java.util.HashMap;

public class FlipChatDebug {
    private static HashMap<String, Boolean> keys = new HashMap<>();

    public static boolean checkDebugChoose() {
        return true;
    }

    public static boolean checkNotifyToDo() {
        return true;
    }

    public static boolean checkToDoDebugMode() {
        return true;
    }

    public static boolean checkKey(String str) {
        Boolean bool = keys.get(str);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static void setKey(String str, boolean z) {
        keys.put(str, Boolean.valueOf(z));
    }
}
