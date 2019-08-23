package com.tt.option.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.option.BaseAbstractHostDepend;

public class AbstractHostOptionRouterDepend extends BaseAbstractHostDepend<HostOptionRouterDepend> implements HostOptionRouterDepend {
    @AnyProcess
    public String getImplClassName() {
        return "HostOptionRouterDependImpl";
    }

    @AnyProcess
    public boolean interceptOpenWebUrl(@Nullable Context context, String str) {
        return false;
    }

    public boolean handleAppbrandDisablePage(@NonNull Context context, String str) {
        if (inject()) {
            return ((HostOptionRouterDepend) this.defaultOptionDepend).handleAppbrandDisablePage(context, str);
        }
        return false;
    }

    @AnyProcess
    public boolean openProfile(@NonNull Activity activity, @Nullable String str) {
        if (inject()) {
            return ((HostOptionRouterDepend) this.defaultOptionDepend).openProfile(activity, str);
        }
        return false;
    }

    @AnyProcess
    public boolean openSchema(@NonNull Context context, @NonNull String str) {
        if (inject()) {
            return ((HostOptionRouterDepend) this.defaultOptionDepend).openSchema(context, str);
        }
        return false;
    }

    @AnyProcess
    public boolean startMiniAppActivity(@NonNull Context context, @NonNull Intent intent) {
        if (inject()) {
            return ((HostOptionRouterDepend) this.defaultOptionDepend).startMiniAppActivity(context, intent);
        }
        context.startActivity(intent);
        return true;
    }

    @AnyProcess
    public boolean startMiniAppService(@NonNull Context context, @NonNull Intent intent) {
        if (inject()) {
            return ((HostOptionRouterDepend) this.defaultOptionDepend).startMiniAppService(context, intent);
        }
        context.startService(intent);
        return true;
    }

    @AnyProcess
    public boolean openWebBrowser(@NonNull Context context, String str, boolean z) {
        if (inject()) {
            return ((HostOptionRouterDepend) this.defaultOptionDepend).openWebBrowser(context, str, z);
        }
        return false;
    }

    @AnyProcess
    public void overridePendingTransition(@NonNull Activity activity, int i, int i2) {
        if (inject()) {
            ((HostOptionRouterDepend) this.defaultOptionDepend).overridePendingTransition(activity, i, i2);
        }
        activity.overridePendingTransition(i, i2);
    }

    @AnyProcess
    public void jumpToWebView(@NonNull Context context, String str, String str2, boolean z) {
        if (inject()) {
            ((HostOptionRouterDepend) this.defaultOptionDepend).jumpToWebView(context, str, str2, z);
        }
    }
}
