package com.bytedance.router.route;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.util.Logger;

public class ActivityRoute extends SysComponentRoute {
    public void openComponent(Context context, Intent intent) {
        RouteIntent routeIntent = getRouteIntent();
        if (context instanceof Activity) {
            if (routeIntent.hasRequestCode()) {
                ((Activity) context).startActivityForResult(intent, routeIntent.getRequestCode());
            } else {
                context.startActivity(intent);
            }
            if (!(routeIntent.getEnterAnim() == -1 && routeIntent.getExitAnim() == -1)) {
                ((Activity) context).overridePendingTransition(getRouteIntent().getEnterAnim(), getRouteIntent().getExitAnim());
            }
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
            if (routeIntent.hasRequestCode()) {
                Logger.e("SmartRoute.open(int requestCode):the context must be Activity !!!");
            }
            if (!(routeIntent.getEnterAnim() == -1 && routeIntent.getExitAnim() == -1)) {
                Logger.e("SmartRoute.withAnimation(int enterAnim, int exitAnim):the context must be Activity !!!");
            }
        }
    }
}
