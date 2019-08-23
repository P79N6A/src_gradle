package com.bytedance.frameworks.plugin.hook;

import android.app.servertransaction.ActivityLifecycleItem;
import android.app.servertransaction.ClientTransaction;
import android.app.servertransaction.ClientTransactionItem;
import android.app.servertransaction.LaunchActivityItem;
import android.app.servertransaction.ResumeActivityItem;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.ViewRootImpl;
import com.bytedance.frameworks.plugin.Mira;
import com.bytedance.frameworks.plugin.compat.o.ActivityConfigCallbackProxy;
import com.bytedance.frameworks.plugin.component.broadcast.DefaultBroadcast;
import com.bytedance.frameworks.plugin.component.service.b;
import com.bytedance.frameworks.plugin.e.a;
import com.bytedance.frameworks.plugin.f.g;
import com.bytedance.frameworks.plugin.pm.c;
import com.bytedance.frameworks.plugin.stub.ShortcutProxyActivity;
import java.lang.reflect.Field;
import java.util.List;

public class ActivityThreadHandlerHook extends Hook implements Handler.Callback {
    private static ActivityThreadHandlerHook sCurrentActivityThreadHandlerHook;

    public static ActivityThreadHandlerHook currentActivityThreadHandlerHook() {
        return sCurrentActivityThreadHandlerHook;
    }

    public ActivityThreadHandlerHook() {
        sCurrentActivityThreadHandlerHook = this;
    }

    public void onHook() {
        try {
            Handler handler = (Handler) a.a(com.bytedance.frameworks.plugin.b.a.a(), "mH");
            setRawObject(a.a((Object) handler, "mCallback"));
            a.a((Object) handler, "mCallback", (Object) this);
        } catch (Exception e2) {
            g.a("Hook Method ActivityThreadHandler#mH Failed!!!", (Throwable) e2);
        }
    }

    private boolean handleLaunchPluginActivity(Message message) {
        boolean z;
        try {
            Object obj = message.obj;
            Intent intent = (Intent) a.a(obj, "intent");
            intent.setExtrasClassLoader(getClass().getClassLoader());
            Intent intent2 = (Intent) intent.getParcelableExtra("target_intent");
            ActivityInfo activityInfo = (ActivityInfo) intent.getParcelableExtra("target_activityinfo");
            if (!(intent2 == null || activityInfo == null || isShortcutProxyActivity(intent2, activityInfo))) {
                com.bytedance.frameworks.plugin.b.a.a(activityInfo.applicationInfo, (ComponentInfo) activityInfo);
                intent2.setClassName(c.h(activityInfo.packageName), activityInfo.name);
                a.a(obj, "intent", (Object) intent2);
                a.a(obj, "activityInfo", (Object) activityInfo);
            }
            if (26 == Build.VERSION.SDK_INT || 27 == Build.VERSION.SDK_INT) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    a.a(obj, "configCallback", (Object) new ActivityConfigCallbackProxy((ViewRootImpl.ActivityConfigCallback) a.a(obj, "configCallback")));
                } catch (Exception unused) {
                }
            }
        } catch (Exception e2) {
            g.a("handleLaunchPluginActivity error.", (Throwable) e2);
        }
        return false;
    }

    private boolean handleLaunchActivityForP(Object obj) throws Exception {
        if (!(obj instanceof ClientTransaction)) {
            return false;
        }
        ActivityLifecycleItem activityLifecycleItem = (ActivityLifecycleItem) com.bytedance.frameworks.plugin.compat.a.a.a(ClientTransaction.class, "getLifecycleStateRequest", new Class[0]).invoke(obj, new Object[0]);
        if (activityLifecycleItem != null && (activityLifecycleItem instanceof ResumeActivityItem)) {
            try {
                ClientTransactionItem clientTransactionItem = (ClientTransactionItem) ((List) com.bytedance.frameworks.plugin.compat.a.a.a(ClientTransaction.class, "getCallbacks", new Class[0]).invoke(obj, new Object[0])).get(0);
                Field a2 = com.bytedance.frameworks.plugin.compat.a.a.a(LaunchActivityItem.class, "mIntent");
                Field a3 = com.bytedance.frameworks.plugin.compat.a.a.a(LaunchActivityItem.class, "mInfo");
                a2.setAccessible(true);
                a3.setAccessible(true);
                Intent intent = (Intent) a2.get(clientTransactionItem);
                intent.setExtrasClassLoader(getClass().getClassLoader());
                Intent intent2 = (Intent) intent.getParcelableExtra("target_intent");
                ActivityInfo activityInfo = (ActivityInfo) intent.getParcelableExtra("target_activityinfo");
                if (!(intent2 == null || activityInfo == null || isShortcutProxyActivity(intent2, activityInfo))) {
                    com.bytedance.frameworks.plugin.b.a.a(activityInfo.applicationInfo, (ComponentInfo) activityInfo);
                    intent2.setClassName(c.h(activityInfo.packageName), activityInfo.name);
                    a2.set(clientTransactionItem, intent2);
                    a3.set(clientTransactionItem, activityInfo);
                }
            } catch (Exception e2) {
                g.a("handleLaunchActivityForP error.", (Throwable) e2);
            }
        }
        return false;
    }

    public boolean handleMessage(Message message) {
        if (Mira.e() != null && Mira.e().a()) {
            return true;
        }
        com.bytedance.frameworks.plugin.a aVar = com.bytedance.c.a.a.a().f2108b;
        if (aVar != null && aVar.a()) {
            return true;
        }
        if (message.what == 100) {
            return handleLaunchPluginActivity(message);
        }
        if (message.what == 114) {
            b.a().a(message.obj);
        } else if (message.what == 116) {
            b.a().b(message.obj);
        } else if (message.what == 113) {
            Object obj = message.obj;
            if (obj != null) {
                try {
                    ActivityInfo activityInfo = (ActivityInfo) a.a(obj, "info");
                    if (activityInfo != null && !TextUtils.isEmpty(activityInfo.name) && !com.bytedance.frameworks.plugin.f.a.a(activityInfo.name)) {
                        activityInfo.name = DefaultBroadcast.class.getName();
                        Intent intent = (Intent) a.a(obj, "intent");
                        intent.setComponent(new ComponentName(intent.getComponent().getPackageName(), activityInfo.name));
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        } else if (message.what == 134 || message.what == 131) {
            return true;
        } else {
            if (message.what == 159) {
                try {
                    handleLaunchActivityForP(message.obj);
                } catch (Throwable th) {
                    g.a("TRANSACTION message handleLaunchActivityForP.", th);
                }
            }
        }
        if (this.mRawObject == null || !(this.mRawObject instanceof Handler.Callback)) {
            return false;
        }
        return ((Handler.Callback) this.mRawObject).handleMessage(message);
    }

    private boolean isShortcutProxyActivity(Intent intent, ActivityInfo activityInfo) {
        if ("com.bytedance.frameworks.plugin.ACTION_SHORTCUT_PROXY".equalsIgnoreCase(intent.getAction())) {
            return true;
        }
        return ShortcutProxyActivity.class.getName().equals(activityInfo.name);
    }
}
