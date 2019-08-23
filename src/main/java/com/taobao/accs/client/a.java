package com.taobao.accs.client;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.accs.IProcessName;
import com.taobao.accs.utl.ALog;
import java.util.concurrent.atomic.AtomicInteger;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f78909a;

    /* renamed from: b  reason: collision with root package name */
    public static String f78910b;

    /* renamed from: c  reason: collision with root package name */
    public static String f78911c;

    /* renamed from: d  reason: collision with root package name */
    public static String f78912d;

    /* renamed from: e  reason: collision with root package name */
    public static String f78913e;

    /* renamed from: f  reason: collision with root package name */
    public static IProcessName f78914f;
    public static AtomicInteger g = new AtomicInteger(-1);
    private static volatile a h;
    private static Context i;
    private ActivityManager j;
    private ConnectivityManager k;

    public static boolean c() {
        if (g.intValue() == 0) {
            return true;
        }
        return false;
    }

    public ConnectivityManager b() {
        if (this.k == null) {
            this.k = (ConnectivityManager) i.getSystemService("connectivity");
        }
        return this.k;
    }

    public ActivityManager a() {
        if (this.j == null) {
            this.j = (ActivityManager) i.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        }
        return this.j;
    }

    private a(Context context) {
        if (context == null) {
            throw new RuntimeException("Context is null!!");
        } else if (i == null) {
            i = context.getApplicationContext();
        }
    }

    public static a a(Context context) {
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = new a(context);
                }
            }
        }
        return h;
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(f78910b)) {
            str2 = str + ".TaobaoIntentService";
        } else {
            str2 = f78910b;
        }
        ALog.d("AdapterGlobalClientInfo", "getAgooCustomServiceName", "serviceName", str2);
        return str2;
    }
}
