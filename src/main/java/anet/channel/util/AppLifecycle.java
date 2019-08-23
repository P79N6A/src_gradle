package anet.channel.util;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.thread.ThreadPoolExecutorFactory;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class AppLifecycle {
    public static volatile long lastEnterBackgroundTime = 0;
    public static CopyOnWriteArraySet<AppLifecycleListener> listeners = new CopyOnWriteArraySet<>();
    private static Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() {
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
            AppLifecycle.onForeground();
        }
    };
    private static ComponentCallbacks2 mComponentCallbacks2 = new ComponentCallbacks2() {
        public final void onConfigurationChanged(Configuration configuration) {
        }

        public final void onLowMemory() {
        }

        public final void onTrimMemory(int i) {
            ALog.i("awcn.ComponentCallbacks2", "onTrimMemory", null, "level", Integer.valueOf(i));
            if (i == 20) {
                AppLifecycle.onBackground();
            }
        }
    };

    public interface AppLifecycleListener {
        void background();

        void forground();
    }

    private AppLifecycle() {
    }

    public static void onForeground() {
        if (GlobalAppRuntimeInfo.isAppBackground()) {
            GlobalAppRuntimeInfo.setBackground(false);
            notifyListener(true);
        }
    }

    public static void onBackground() {
        if (!GlobalAppRuntimeInfo.isAppBackground()) {
            GlobalAppRuntimeInfo.setBackground(true);
            lastEnterBackgroundTime = System.currentTimeMillis();
            notifyListener(false);
        }
    }

    public static void initialize() {
        if (Build.VERSION.SDK_INT >= 14 && AwcnConfig.isAppLifeCycleListenerEnable()) {
            ((Application) GlobalAppRuntimeInfo.getContext().getApplicationContext()).registerActivityLifecycleCallbacks(mActivityLifecycleCallbacks);
            GlobalAppRuntimeInfo.getContext().registerComponentCallbacks(mComponentCallbacks2);
        }
    }

    public static void registerLifecycleListener(AppLifecycleListener appLifecycleListener) {
        if (appLifecycleListener != null) {
            listeners.add(appLifecycleListener);
        }
    }

    public static void unregisterLifecycleListener(AppLifecycleListener appLifecycleListener) {
        listeners.remove(appLifecycleListener);
    }

    private static void notifyListener(final boolean z) {
        ALog.i("awcn.AppLifeCycle", "notifyListener", null, "foreground", Boolean.valueOf(z));
        ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() {
            public final void run() {
                Iterator<AppLifecycleListener> it2 = AppLifecycle.listeners.iterator();
                while (it2.hasNext()) {
                    AppLifecycleListener next = it2.next();
                    if (z) {
                        next.forground();
                    } else {
                        next.background();
                    }
                }
            }
        });
    }
}
