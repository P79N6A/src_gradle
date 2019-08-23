package com.tencent.connect.b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.widget.Toast;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.tencent.connect.a.a;
import com.tencent.open.a.f;
import com.tencent.open.d.c;
import com.tencent.tauth.b;
import java.io.File;
import java.util.Iterator;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public d f79623a;

    /* renamed from: b  reason: collision with root package name */
    private a f79624b = new a(this.f79623a);

    public static h a(String str, Context context) {
        c.a(context.getApplicationContext());
        f.c("openSDK_LOG.QQAuth", "QQAuth -- createInstance() --start");
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.tauth.AuthActivity"), 0);
            packageManager.getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.connect.common.AssistActivity"), 0);
            h hVar = new h(str, context);
            f.c("openSDK_LOG.QQAuth", "QQAuth -- createInstance()  --end");
            return hVar;
        } catch (PackageManager.NameNotFoundException e2) {
            f.b("openSDK_LOG.QQAuth", "createInstance() error --end", e2);
            i.a(Toast.makeText(context.getApplicationContext(), "请参照文档在Androidmanifest.xml加上AuthActivity和AssitActivity的定义 ", 1));
            return null;
        }
    }

    private h(String str, Context context) {
        f.c("openSDK_LOG.QQAuth", "new QQAuth() --start");
        this.f79623a = new d(str);
        d dVar = this.f79623a;
        String str2 = dVar.f79590a;
        String str3 = "Aqc" + str2;
        try {
            a.f79556a = Class.forName("com.tencent.stat.StatConfig");
            Class<?> cls = Class.forName("com.tencent.stat.StatService");
            a.f79557b = cls;
            a.f79558c = cls.getMethod("reportQQ", new Class[]{Context.class, String.class});
            a.f79559d = a.f79557b.getMethod("trackCustomEvent", new Class[]{Context.class, String.class, String[].class});
            a.f79560e = a.f79557b.getMethod("commitEvents", new Class[]{Context.class, Integer.TYPE});
            a.f79561f = a.f79556a.getMethod("setEnableStatService", new Class[]{Boolean.TYPE});
            a.a(context, dVar);
            a.f79556a.getMethod("setAutoExceptionCaught", new Class[]{Boolean.TYPE}).invoke(a.f79556a, new Object[]{Boolean.FALSE});
            a.f79556a.getMethod("setEnableSmartReporting", new Class[]{Boolean.TYPE}).invoke(a.f79556a, new Object[]{Boolean.TRUE});
            a.f79556a.getMethod("setSendPeriodMinutes", new Class[]{Integer.TYPE}).invoke(a.f79556a, new Object[]{1440});
            Class<?> cls2 = Class.forName("com.tencent.stat.StatReportStrategy");
            a.f79556a.getMethod("setStatSendStrategy", new Class[]{cls2}).invoke(a.f79556a, new Object[]{cls2.getField("PERIOD").get(null)});
            a.f79557b.getMethod("startStatService", new Class[]{Context.class, String.class, String.class}).invoke(a.f79557b, new Object[]{context, str3, Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null)});
            a.g = true;
        } catch (Exception unused) {
        }
        f.c("openSDK_LOG.QQAuth", "new QQAuth() --end");
    }

    public int a(Activity activity, Fragment fragment, String str, b bVar) {
        String str2;
        String packageName = activity.getApplicationContext().getPackageName();
        String str3 = null;
        try {
            Iterator<ApplicationInfo> it2 = activity.getPackageManager().getInstalledApplications(SearchJediMixFeedAdapter.f42517f).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ApplicationInfo next = it2.next();
                if (packageName.equals(next.packageName)) {
                    str3 = next.sourceDir;
                    break;
                }
            }
            if (str3 != null) {
                String a2 = com.tencent.open.d.b.a(new File(str3), "channelNo");
                if (!TextUtils.isEmpty(a2)) {
                    f.a("openSDK_LOG.QQAuth", "-->login channelId: " + a2);
                    String str4 = "";
                    f.c("openSDK_LOG.QQAuth", "loginWithOEM");
                    com.tencent.connect.common.a.i = true;
                    if (a2.equals("")) {
                        str2 = "null";
                    } else {
                        str2 = a2;
                    }
                    if (a2.equals("")) {
                        a2 = "null";
                    }
                    if (str4.equals("")) {
                        str4 = "null";
                    }
                    com.tencent.connect.common.a.g = a2;
                    com.tencent.connect.common.a.f79630f = str2;
                    com.tencent.connect.common.a.h = str4;
                    return this.f79624b.a(activity, str, bVar);
                }
            }
        } catch (Throwable th) {
            f.b("openSDK_LOG.QQAuth", "-->login get channel id exception.", th);
        }
        f.b("openSDK_LOG.QQAuth", "-->login channelId is null ");
        com.tencent.connect.common.a.i = false;
        return this.f79624b.a(activity, str, bVar, false, null);
    }
}
