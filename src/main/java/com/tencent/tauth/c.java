package com.tencent.tauth;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.connect.b.h;
import com.tencent.open.a.f;
import com.tencent.open.d.d;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f79774b;

    /* renamed from: a  reason: collision with root package name */
    public final h f79775a;

    private c(String str, Context context) {
        this.f79775a = h.a(str, context);
    }

    public static synchronized c a(String str, Context context) {
        synchronized (c.class) {
            com.tencent.open.d.c.a(context.getApplicationContext());
            f.c("openSDK_LOG.Tencent", "createInstance()  -- start, appId = " + str);
            if (f79774b == null) {
                f79774b = new c(str, context);
            } else if (!str.equals(f79774b.f79775a.f79623a.f79590a)) {
                c cVar = f79774b;
                f.c("openSDK_LOG.Tencent", "logout()");
                cVar.f79775a.f79623a.a(null, PushConstants.PUSH_TYPE_NOTIFY);
                cVar.f79775a.f79623a.f79592c = null;
                f79774b = new c(str, context);
            }
            if (!a(context, str)) {
                return null;
            }
            d.a(context, str);
            f.c("openSDK_LOG.Tencent", "createInstance()  -- end");
            c cVar2 = f79774b;
            return cVar2;
        }
    }

    private static boolean a(Context context, String str) {
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.tauth.AuthActivity"), 0);
            try {
                context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.connect.common.AssistActivity"), 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                String str2 = "没有在AndroidManifest.xml中检测到com.tencent.connect.common.AssistActivity,请加上com.tencent.connect.common.AssistActivity,详细信息请查看官网文档." + "\n配置示例如下: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"behind\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>";
                f.e("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.connect.common.AssistActivity\n" + str2);
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            String str3 = "没有在AndroidManifest.xml中检测到com.tencent.tauth.AuthActivity,请加上com.tencent.tauth.AuthActivity,并配置<data android:scheme=\"tencent" + str + "\" />,详细信息请查看官网文档.";
            String str4 = str3 + "\n配置示例如下: \n<activity\n     android:name=\"com.tencent.tauth.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n    <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent" + str + "\" />\n</intent-filter>\n" + "</activity>";
            f.e("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.tauth.AuthActivity" + str4);
            return false;
        }
    }
}
