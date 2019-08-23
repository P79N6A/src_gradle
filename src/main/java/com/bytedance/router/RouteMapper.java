package com.bytedance.router;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.bytedance.router.dynamic.RouterConfig;
import com.bytedance.router.dynamic.ServerParam;
import com.bytedance.router.mapping.SmartRouter$$Mapping;
import com.bytedance.router.net.SmartRouterApi;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import com.ss.android.ugc.aweme.q.c;
import java.util.HashMap;
import java.util.Map;

public class RouteMapper {
    private IConfigUpdateListener mConfigUpdateListener;
    private Context mContext;
    private Map<String, String> mOriginMap;
    private Map<String, String> mRouteMap = new HashMap();
    private Object mRouteMapLock = new Object();
    private ServerParam mServerParam;

    public interface IConfigUpdateListener {
        void onConfigChanged(RouterConfig routerConfig);
    }

    public ServerParam getServerParam() {
        return this.mServerParam;
    }

    /* access modifiers changed from: package-private */
    public void requestRouteConfig() {
        if (this.mServerParam == null || !this.mServerParam.isAvailable()) {
            Logger.e("RouteMapper#requestRouteConfig serverParam is null or unavailable,You must use SmartRouter#init(Context, ServerParam) before !!!");
        } else {
            AsyncTask.execute(new Runnable() {
                public void run() {
                    RouteMapper.this.updateNetRouteConfig();
                }
            });
        }
    }

    public void loadLocalRouteConfig() {
        String string = c.a(this.mContext, "smartrouter_conf", 0).getString("smartrouter_config", "");
        if (!TextUtils.isEmpty(string)) {
            RouterConfig load = RouterConfig.load(string);
            if (this.mConfigUpdateListener != null && load != null && !RouterConfig.isExpired(this.mContext, load)) {
                this.mConfigUpdateListener.onConfigChanged(load);
                if (Logger.isDebug()) {
                    Logger.d("Load local routerConfig: " + string);
                }
            }
        }
    }

    public void updateNetRouteConfig() {
        SmartRouterApi.ApiResult requestConfig = SmartRouterApi.requestConfig(this.mContext, this.mServerParam);
        if (requestConfig.errorCode != 0) {
            Logger.e("RouteMapper#requestServer error: " + requestConfig.errorCode);
        } else if (!(requestConfig.result == null || this.mConfigUpdateListener == null)) {
            this.mConfigUpdateListener.onConfigChanged((RouterConfig) requestConfig.result);
            c.a(this.mContext, "smartrouter_conf", 0).edit().putString("smartrouter_config", ((RouterConfig) requestConfig.result).toString()).commit();
        }
    }

    public void init(Context context) {
        init(context, null, null);
    }

    private void initDynamicRoutes(ServerParam serverParam) {
        this.mServerParam = serverParam;
        if (serverParam == null || !serverParam.isAvailable()) {
            Logger.e("RouteMapper#initDynamicRoutes serverParam is null or unavailable!!!");
        } else {
            AsyncTask.execute(new Runnable() {
                public void run() {
                    RouteMapper.this.loadLocalRouteConfig();
                    RouteMapper.this.updateNetRouteConfig();
                }
            });
        }
    }

    public boolean loadModuleMapping(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Object newInstance = Class.forName(String.format("com.bytedance.router.generator.mapping.SmartrouterMapping$$%s", new Object[]{str})).newInstance();
            if (newInstance instanceof IMappingInitializer) {
                synchronized (this.mRouteMapLock) {
                    ((IMappingInitializer) newInstance).init(this.mRouteMap);
                }
                return true;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        return false;
    }

    public void updateMapping(Map<String, String> map) {
        synchronized (this.mRouteMapLock) {
            if (this.mOriginMap == null) {
                this.mOriginMap = new HashMap();
                this.mOriginMap.putAll(this.mRouteMap);
                this.mRouteMap.putAll(map);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.putAll(this.mOriginMap);
                hashMap.putAll(map);
                this.mRouteMap = hashMap;
            }
        }
    }

    public String getTargetClass(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = this.mRouteMap.get(Util.getRealRouteUrl(str));
        if (TextUtils.isEmpty(str2)) {
            str2 = this.mRouteMap.get(Util.getRouteUrl(str));
        }
        Logger.d("RouteMapper#getTargetClass url: " + str + "  |  targetClass: " + str2);
        return str2;
    }

    public void init(Context context, ServerParam serverParam, IConfigUpdateListener iConfigUpdateListener) {
        Logger.d("RouteMapper#init RouteMapper");
        this.mContext = context;
        this.mConfigUpdateListener = iConfigUpdateListener;
        synchronized (this.mRouteMapLock) {
            new SmartRouter$$Mapping().init(this.mRouteMap);
        }
        Logger.d(String.format("RouteMapper#loadMappingByRouter routes: %d .", new Object[]{Integer.valueOf(this.mRouteMap.size())}));
        if (serverParam != null) {
            initDynamicRoutes(serverParam);
        }
    }
}
