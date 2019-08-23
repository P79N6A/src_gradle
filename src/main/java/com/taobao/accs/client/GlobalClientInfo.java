package com.taobao.accs.client;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.accs.IAgooAppReceiver;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GlobalClientInfo {

    /* renamed from: a  reason: collision with root package name */
    public static Context f78903a;

    /* renamed from: b  reason: collision with root package name */
    public static IAgooAppReceiver f78904b;

    /* renamed from: c  reason: collision with root package name */
    public static String f78905c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f78906d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile GlobalClientInfo f78907e;
    private static Map<String, String> k;

    /* renamed from: f  reason: collision with root package name */
    private ConcurrentHashMap<String, ILoginInfo> f78908f;
    private ConcurrentHashMap<String, IAppReceiver> g;
    private ActivityManager h;
    private ConnectivityManager i;
    private PackageInfo j;
    private Map<String, AccsAbstractDataListener> l = new ConcurrentHashMap();

    public void clearLoginInfoImpl() {
        this.f78908f = null;
    }

    public static Context getContext() {
        return f78903a;
    }

    public Map<String, IAppReceiver> getAppReceiver() {
        return this.g;
    }

    public ActivityManager getActivityManager() {
        if (this.h == null) {
            this.h = (ActivityManager) f78903a.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        }
        return this.h;
    }

    public ConnectivityManager getConnectivityManager() {
        if (this.i == null) {
            this.i = (ConnectivityManager) f78903a.getSystemService("connectivity");
        }
        return this.i;
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        k = concurrentHashMap;
        concurrentHashMap.put("agooSend", "org.android.agoo.accs.AgooService");
        k.put("agooAck", "org.android.agoo.accs.AgooService");
        k.put("agooTokenReport", "org.android.agoo.accs.AgooService");
    }

    public PackageInfo getPackageInfo() {
        try {
            if (this.j == null) {
                this.j = f78903a.getPackageManager().getPackageInfo(f78903a.getPackageName(), 0);
            }
        } catch (Throwable th) {
            ALog.e("GlobalClientInfo", "getPackageInfo", th, new Object[0]);
        }
        return this.j;
    }

    public void unregisterListener(String str) {
        this.l.remove(str);
    }

    public AccsAbstractDataListener getListener(String str) {
        return this.l.get(str);
    }

    public String getService(String str) {
        return k.get(str);
    }

    public void unRegisterService(String str) {
        if (!TextUtils.isEmpty(str)) {
            k.remove(str);
        }
    }

    public static GlobalClientInfo getInstance(Context context) {
        if (f78907e == null) {
            synchronized (GlobalClientInfo.class) {
                if (f78907e == null) {
                    f78907e = new GlobalClientInfo(context);
                }
            }
        }
        return f78907e;
    }

    public String getNick(String str) {
        if (this.f78908f == null) {
            return null;
        }
        ILoginInfo iLoginInfo = this.f78908f.get(str);
        if (iLoginInfo == null) {
            return null;
        }
        return iLoginInfo.getNick();
    }

    public String getSid(String str) {
        if (this.f78908f == null) {
            return null;
        }
        ILoginInfo iLoginInfo = this.f78908f.get(str);
        if (iLoginInfo == null) {
            return null;
        }
        return iLoginInfo.getSid();
    }

    public String getUserId(String str) {
        if (this.f78908f == null) {
            return null;
        }
        ILoginInfo iLoginInfo = this.f78908f.get(str);
        if (iLoginInfo == null) {
            return null;
        }
        return iLoginInfo.getUserId();
    }

    private GlobalClientInfo(Context context) {
        if (context != null) {
            if (f78903a == null) {
                f78903a = context.getApplicationContext();
            }
            ThreadPoolExecutorFactory.execute(new c(this));
            return;
        }
        throw new RuntimeException("Context is null!!");
    }

    public void registerListener(String str, AccsAbstractDataListener accsAbstractDataListener) {
        if (!TextUtils.isEmpty(str) && accsAbstractDataListener != null) {
            this.l.put(str, accsAbstractDataListener);
        }
    }

    public void registerService(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            k.put(str, str2);
        }
    }

    public void setAppReceiver(String str, IAppReceiver iAppReceiver) {
        if (iAppReceiver != null) {
            if (iAppReceiver instanceof IAgooAppReceiver) {
                f78904b = (IAgooAppReceiver) iAppReceiver;
                return;
            }
            if (this.g == null) {
                this.g = new ConcurrentHashMap<>(2);
            }
            this.g.put(str, iAppReceiver);
        }
    }

    public void setLoginInfoImpl(String str, ILoginInfo iLoginInfo) {
        if (this.f78908f == null) {
            this.f78908f = new ConcurrentHashMap<>(1);
        }
        if (iLoginInfo != null) {
            this.f78908f.put(str, iLoginInfo);
        }
    }
}
