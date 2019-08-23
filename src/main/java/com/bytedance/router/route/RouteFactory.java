package com.bytedance.router.route;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.router.RoutesConfig;
import com.bytedance.router.util.Logger;

public class RouteFactory {
    private static boolean isSchemeLegal(String str, RoutesConfig routesConfig) {
        if (str.equals(routesConfig.getScheme())) {
            return true;
        }
        String[] otherSchemes = routesConfig.getOtherSchemes();
        if (otherSchemes != null && otherSchemes.length > 0) {
            for (String equals : otherSchemes) {
                if (str.equals(equals)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static BaseRoute createRoute(String str, String str2, RoutesConfig routesConfig) {
        Class<?> cls;
        if (TextUtils.isEmpty(str)) {
            Logger.e("RouteFactory#createRoute url is null!!!");
            return null;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            Logger.e("RouteFactory#createRoute url is not illegal!!!");
            return null;
        }
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            Logger.e("RouteFactory#createRoute scheme is null!!!");
            return null;
        }
        String host = parse.getHost();
        if (TextUtils.isEmpty(host)) {
            Logger.e("RouteFactory#createRoute host is null!!!");
            return null;
        } else if (!isSchemeLegal(scheme, routesConfig)) {
            Logger.e(String.format("RouteFactory#createRoute router cannot support this scheme protocol: %s\nRouteConfig:\n%s", new Object[]{str, routesConfig.toString()}));
            return null;
        } else if (host.startsWith("bt.")) {
            Class<? extends BaseRoute> routeClass = routesConfig.getRouteClass(host);
            if (routeClass == null) {
                Logger.e("RouteFactory#createRoute there is no route for this host: " + host);
                return null;
            }
            try {
                return (BaseRoute) routeClass.newInstance();
            } catch (Exception unused) {
                Logger.e("RouteFactory#createRoute routeClass new instance exception!!!");
                return null;
            }
        } else {
            try {
                cls = Class.forName(str2);
            } catch (Throwable unused2) {
                cls = null;
            }
            if (cls != null) {
                if (Service.class.isAssignableFrom(cls)) {
                    return new ServiceRoute();
                }
                if (BroadcastReceiver.class.isAssignableFrom(cls)) {
                    return new BroadcastRoute();
                }
            }
            return new ActivityRoute();
        }
    }
}
