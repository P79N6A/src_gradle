package com.bytedance.router;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.router.RouteMapper;
import com.bytedance.router.dynamic.RouterConfig;
import com.bytedance.router.dynamic.ServerParam;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.interceptor.RewriteManager;
import com.bytedance.router.net.SmartRouterApi;
import com.bytedance.router.plugin.Plugin;
import com.bytedance.router.plugin.SupportPluginCallback;
import com.bytedance.router.route.BaseRoute;
import com.bytedance.router.route.IRoute;
import com.bytedance.router.route.RouteFactory;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RouteManager {
    public Context mContext;
    private InterceptManager mInterceptManager;
    private List<Plugin> mPluginsList;
    private RewriteManager mRewriteManager;
    public RouteMapper mRouteMapper;
    private RoutesConfig mRoutesConfig;
    private SupportPluginCallback mSupportPluginCallback;

    static class SingleBuilder {
        public static RouteManager sInstance = new RouteManager();

        private SingleBuilder() {
        }
    }

    public static final RouteManager getInstance() {
        return SingleBuilder.sInstance;
    }

    public Context getContext() {
        return this.mContext;
    }

    /* access modifiers changed from: package-private */
    public void requestRouteConfig() {
        this.mRouteMapper.requestRouteConfig();
    }

    private RouteManager() {
        this.mRoutesConfig = RoutesConfig.defaultConfig();
        this.mRouteMapper = new RouteMapper();
        this.mInterceptManager = new InterceptManager();
        this.mRewriteManager = new RewriteManager();
    }

    public void setConfig(RoutesConfig routesConfig) {
        this.mRoutesConfig = routesConfig;
    }

    public void setSupportPluginCallback(SupportPluginCallback supportPluginCallback) {
        this.mSupportPluginCallback = supportPluginCallback;
    }

    public void addInterceptor(IInterceptor iInterceptor) {
        this.mInterceptManager.addInterceptor(iInterceptor);
    }

    public void init(Context context) {
        init(context, null);
    }

    public void setRewriteMap(Map<String, String> map) {
        this.mRewriteManager.setRewriteMap(map);
    }

    private boolean checkLegality(RouteIntent routeIntent) {
        String url = routeIntent.getUrl();
        if (Util.isLegalUrl(url, this.mRoutesConfig)) {
            return true;
        }
        Logger.e("RouteManager#checkLegality originUrl is illegal: " + url + ". \n" + this.mRoutesConfig.toString());
        return false;
    }

    private synchronized boolean loadPluginsSchemas(String str) {
        boolean z = false;
        if (this.mSupportPluginCallback == null) {
            Logger.w("if you use urls in plugins, you must set SupportPluginCallback to support plugins.");
            return false;
        }
        if (this.mPluginsList == null) {
            this.mPluginsList = this.mSupportPluginCallback.initPlugins();
        }
        if (this.mPluginsList == null && this.mPluginsList.size() == 0) {
            return false;
        }
        Iterator<Plugin> it2 = this.mPluginsList.iterator();
        while (it2.hasNext()) {
            Plugin next = it2.next();
            if (next.containsUrl(str)) {
                this.mSupportPluginCallback.loadPlugin(next, str);
                if (this.mRouteMapper.loadModuleMapping(next.getName())) {
                    z = true;
                }
                it2.remove();
            }
        }
        return z;
    }

    private RouteIntent processRouteIntent(RouteIntent routeIntent) {
        String url = routeIntent.getUrl();
        if (!Util.isLegalUrl(url)) {
            Logger.e("RouteManager#RouteIntent-outputUrl is illegal and url is : " + url);
            return null;
        }
        routeIntent.setUrl(Util.completeUrl(this.mRoutesConfig.getScheme(), url));
        Logger.d("RouteManager#processRouteIntent originUlr: " + routeIntent.getOriginUrl());
        Logger.d("RouteManager#processRouteIntent outputUlr: " + routeIntent.getUrl());
        return routeIntent;
    }

    /* access modifiers changed from: package-private */
    public boolean canOpen(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.w("SmartRoute#url is null!!!");
            return false;
        } else if (!Util.isLegalUrl(str)) {
            Logger.w("SmartRoute#url is illegal and url is " + str);
            return false;
        } else {
            String realRouteUrl = Util.getRealRouteUrl(str);
            String rewriteUrl = this.mRewriteManager.getRewriteUrl(realRouteUrl);
            if (!TextUtils.isEmpty(rewriteUrl)) {
                realRouteUrl = rewriteUrl;
            }
            String targetClass = this.mRouteMapper.getTargetClass(realRouteUrl);
            if (TextUtils.isEmpty(targetClass)) {
                if (!loadPluginsSchemas(realRouteUrl)) {
                    return false;
                }
                targetClass = this.mRouteMapper.getTargetClass(realRouteUrl);
            }
            if (!TextUtils.isEmpty(targetClass)) {
                return true;
            }
            return false;
        }
    }

    private IRoute getRoute(RouteIntent routeIntent, String str) {
        BaseRoute createRoute = RouteFactory.createRoute(routeIntent.getUrl(), str, this.mRoutesConfig);
        if (createRoute != null) {
            createRoute.init(routeIntent, this.mRouteMapper);
        }
        return createRoute;
    }

    public void init(Context context, ServerParam serverParam) {
        this.mContext = context;
        this.mRouteMapper.init(context, serverParam, new RouteMapper.IConfigUpdateListener() {
            public void onConfigChanged(RouterConfig routerConfig) {
                if (routerConfig != null) {
                    RouteManager.this.mRouteMapper.updateMapping(routerConfig.getIncMapping());
                    RouteManager.this.setRewriteMap(routerConfig.getRewriteMapping());
                    SmartRouterApi.reportRouterConfig(RouteManager.this.mContext, RouteManager.this.mRouteMapper.getServerParam(), routerConfig);
                }
            }
        });
        this.mInterceptManager.addInterceptor(this.mRewriteManager);
    }

    public Intent buildIntent(Context context, RouteIntent routeIntent) {
        if (!checkLegality(routeIntent) || this.mInterceptManager.processRouteIntent(context, routeIntent)) {
            return null;
        }
        RouteIntent processRouteIntent = processRouteIntent(routeIntent);
        if (processRouteIntent == null) {
            return null;
        }
        String targetClass = this.mRouteMapper.getTargetClass(processRouteIntent.getUrl());
        if (TextUtils.isEmpty(targetClass)) {
            if (!loadPluginsSchemas(processRouteIntent.getUrl())) {
                Logger.w("RouteManager#buildIntent cannot find the routeUri with " + processRouteIntent.getUrl());
                return null;
            }
            targetClass = this.mRouteMapper.getTargetClass(processRouteIntent.getUrl());
        }
        processRouteIntent.getExtra().setComponent(new ComponentName(context.getPackageName(), targetClass));
        return processRouteIntent.getExtra();
    }

    public void open(Context context, RouteIntent routeIntent) {
        if (checkLegality(routeIntent) && !this.mInterceptManager.processRouteIntent(context, routeIntent)) {
            RouteIntent processRouteIntent = processRouteIntent(routeIntent);
            if (processRouteIntent != null) {
                String targetClass = this.mRouteMapper.getTargetClass(processRouteIntent.getUrl());
                if (TextUtils.isEmpty(targetClass)) {
                    if (!loadPluginsSchemas(processRouteIntent.getUrl())) {
                        Logger.w("RouteManager#open cannot find the routeUri with " + processRouteIntent.getUrl());
                        return;
                    }
                    targetClass = this.mRouteMapper.getTargetClass(processRouteIntent.getUrl());
                }
                IRoute route = getRoute(processRouteIntent, targetClass);
                if (route == null) {
                    Logger.e("RouteManager#Not support the route with url：" + processRouteIntent.getUrl());
                    return;
                }
                try {
                    route.open(context);
                } catch (Exception unused) {
                    Logger.e("Please check the scheme and its mapping class!!!");
                }
            }
        }
    }
}
