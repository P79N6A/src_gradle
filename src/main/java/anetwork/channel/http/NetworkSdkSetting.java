package anetwork.channel.http;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.SessionCenter;
import anet.channel.entity.ENV;
import anet.channel.util.ALog;
import anet.channel.util.Utils;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.cookie.CookieManager;
import anetwork.channel.monitor.Monitor;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class NetworkSdkSetting implements Serializable {
    public static ENV CURRENT_ENV = ENV.ONLINE;
    private static Context context;
    private static HashMap<String, Object> initParams = null;
    private static AtomicBoolean isInit = new AtomicBoolean(false);

    public static Context getContext() {
        return context;
    }

    private static void initTaobaoAdapter() {
        try {
            Utils.invokeStaticMethodThrowException("anet.channel.TaobaoNetworkAdapter", "init", new Class[]{Context.class, HashMap.class}, context, initParams);
            ALog.i("anet.NetworkSdkSetting", "init taobao adapter success", null, new Object[0]);
        } catch (Exception e2) {
            ALog.i("anet.NetworkSdkSetting", "initTaobaoAdapter failed. maybe not taobao app", null, e2);
        }
    }

    public static void setTtid(String str) {
        GlobalAppRuntimeInfo.setTtid(str);
    }

    public static void init(Context context2) {
        if (context2 != null) {
            try {
                if (isInit.compareAndSet(false, true)) {
                    ALog.e("anet.NetworkSdkSetting", "NetworkSdkSetting init", null, new Object[0]);
                    context = context2;
                    GlobalAppRuntimeInfo.setContext(context2);
                    initTaobaoAdapter();
                    Monitor.init();
                    NetworkConfigCenter.init();
                    CookieManager.setup(context2);
                    SessionCenter.init(context2);
                }
            } catch (Throwable th) {
                ALog.e("anet.NetworkSdkSetting", "Network SDK initial failed!", null, th, new Object[0]);
            }
        }
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        try {
            GlobalAppRuntimeInfo.setTtid((String) hashMap.get("ttid"));
            GlobalAppRuntimeInfo.setUtdid((String) hashMap.get("deviceId"));
            String str = (String) hashMap.get("process");
            if (!TextUtils.isEmpty(str)) {
                GlobalAppRuntimeInfo.setCurrentProcess(str);
            }
            initParams = new HashMap<>(hashMap);
            init(application.getApplicationContext());
            initParams = null;
        } catch (Exception e2) {
            ALog.e("anet.NetworkSdkSetting", "Network SDK initial failed!", null, e2, new Object[0]);
        }
    }
}
