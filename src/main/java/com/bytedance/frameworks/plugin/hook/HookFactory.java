package com.bytedance.frameworks.plugin.hook;

import java.util.ArrayList;

public final class HookFactory {
    private static HookFactory sInstance;
    private ArrayList<Hook> mHookList = new ArrayList<>(2);

    private HookFactory() {
    }

    public final void hookClassLoader() throws Throwable {
        installHook(new ClassLoaderHook());
    }

    public static HookFactory getInstance() {
        if (sInstance == null) {
            synchronized (HookFactory.class) {
                if (sInstance == null) {
                    sInstance = new HookFactory();
                }
            }
        }
        return sInstance;
    }

    public final void installHook() throws Throwable {
        installHook(new ActivityThreadHandlerHook());
        installHook(new InstrumentationHook());
    }

    private void installHook(Hook hook) throws Throwable {
        hook.onHook();
        synchronized (this.mHookList) {
            this.mHookList.add(hook);
        }
    }
}
