package com.bytedance.router.interceptor;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.util.Collections;
import java.util.Map;

public class RewriteManager implements IInterceptor {
    private Object mLockObject = new Object();
    private Map<String, String> mRewriteMap;

    public String getRewriteUrl(String str) {
        if (this.mRewriteMap == null) {
            return null;
        }
        return this.mRewriteMap.get(str);
    }

    public void setRewriteMap(Map<String, String> map) {
        synchronized (this.mLockObject) {
            if (map == null) {
                try {
                    this.mRewriteMap = Collections.EMPTY_MAP;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                this.mRewriteMap = map;
            }
        }
    }

    public boolean matchInterceptRules(RouteIntent routeIntent) {
        String originUrl = routeIntent.getOriginUrl();
        if (TextUtils.isEmpty(originUrl)) {
            return false;
        }
        String routeUrl = Util.getRouteUrl(originUrl);
        if (TextUtils.isEmpty(routeUrl) || this.mRewriteMap == null || this.mRewriteMap.size() == 0) {
            return false;
        }
        String str = this.mRewriteMap.get(routeUrl);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        routeIntent.setUrl(str);
        return true;
    }

    public boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Logger.d("RewriteManager#RouteIntent-originUrl: " + routeIntent.getOriginUrl());
        Logger.d("RewriteManager#RouteIntent-outputUrl: " + routeIntent.getUrl());
        new RouteIntent.Builder(routeIntent.getUrl()).build();
        return false;
    }
}
