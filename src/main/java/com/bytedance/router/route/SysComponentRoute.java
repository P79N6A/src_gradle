package com.bytedance.router.route;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.util.Logger;

public abstract class SysComponentRoute extends BaseRoute {
    public abstract void openComponent(Context context, Intent intent);

    public void open(Context context) {
        ComponentName componentName;
        RouteIntent routeIntent = getRouteIntent();
        if (routeIntent == null) {
            Logger.e("SysComponentRoute open routeIntent but the routeIntent is null!!!");
            return;
        }
        String targetClass = getTargetClass();
        if (TextUtils.isEmpty(targetClass)) {
            Logger.e("SysComponentRoute open routeIntent but the classPath is null!!!");
            return;
        }
        Intent extra = routeIntent.getExtra();
        if (extra == null) {
            Logger.e("SysComponentRoute open routeIntent but the intent is null!!!");
            return;
        }
        Class<?> cls = null;
        try {
            cls = Class.forName(targetClass);
        } catch (ClassNotFoundException unused) {
        }
        if (cls != null) {
            componentName = new ComponentName(context, cls);
        } else {
            componentName = new ComponentName(context.getPackageName(), targetClass);
        }
        extra.setComponent(componentName);
        extra.setPackage(context.getPackageName());
        openComponent(context, extra);
    }
}
