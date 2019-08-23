package com.tt.miniapphost;

import com.tt.miniapphost.process.annotation.AnyProcess;
import java.util.HashMap;
import java.util.Map;

public class ModeManager {
    Map<String, NativeModule> modules;

    static class Holder {
        static ModeManager holder = new ModeManager();

        Holder() {
        }
    }

    public static ModeManager getInst() {
        return Holder.holder;
    }

    @AnyProcess
    public Map<String, NativeModule> getModules() {
        return this.modules;
    }

    private ModeManager() {
        this.modules = new HashMap();
    }

    @AnyProcess
    public NativeModule get(String str) {
        return this.modules.get(str);
    }

    @AnyProcess
    public void register(String str, NativeModule nativeModule) {
        this.modules.put(str, nativeModule);
    }
}
