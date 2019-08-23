package com.ss.android.ttplatformsdk.c;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.PrintStream;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f31133a = "c";

    /* renamed from: b  reason: collision with root package name */
    private Context f31134b;

    c(Context context) {
        this.f31134b = context;
    }

    private boolean a(String str) {
        boolean z = false;
        if (this.f31134b == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                PackageInfo packageInfo = this.f31134b.getPackageManager().getPackageInfo(str, 16777216);
                if (packageInfo != null) {
                    z = true;
                }
                PrintStream printStream = System.out;
                printStream.println("liananse appVersionCode " + packageInfo.versionCode);
            } catch (Exception unused) {
            }
        }
        return z;
    }

    private int b(String str) {
        if (this.f31134b == null || TextUtils.isEmpty(str) || !a(str)) {
            return -1;
        }
        try {
            ApplicationInfo applicationInfo = this.f31134b.getPackageManager().getApplicationInfo(str, SearchJediMixFeedAdapter.f42517f);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData.getInt("TTOPEN_SDK_VERSION", 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return -1;
    }

    public final void a(String str, String str2, boolean z) {
        if (this.f31134b != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("is_login", Boolean.valueOf(z));
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                contentValues.put("user_name", str);
                if (TextUtils.isEmpty(str2)) {
                    str2 = "";
                }
                contentValues.put("user_avatar", str2);
                this.f31134b.getContentResolver().insert(Uri.parse("content://" + this.f31134b.getPackageName() + ".ttplatformapi.AccountProvider/account"), contentValues);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r5, long r6, java.lang.String r8, android.os.Bundle r9) {
        /*
            r4 = this;
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            if (r9 != 0) goto L_0x0094
            r9 = 2
            int r0 = r4.b(r5)
            r1 = 1
            if (r0 < r9) goto L_0x0040
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r3 = ".ttopenapi.TtEntryActivity"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r5, r2)
            r9.setComponent(r0)
            android.content.Context r0 = r4.f31134b
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r2 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ActivityInfo r9 = r9.resolveActivityInfo(r0, r2)
            if (r9 == 0) goto L_0x0040
            boolean r9 = r9.exported
            if (r9 == 0) goto L_0x0040
            r9 = 1
            goto L_0x0041
        L_0x0040:
            r9 = 0
        L_0x0041:
            if (r9 == 0) goto L_0x0094
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r0 = "_tt_params_intent_type"
            r9.putInt(r0, r1)
            java.lang.String r0 = "_tt_params_extra"
            r1 = 0
            r9.putBundle(r0, r1)
            java.lang.String r0 = "_tt_params_sessionid"
            r9.putString(r0, r8)
            java.lang.String r8 = "_tt_params_userid"
            r9.putLong(r8, r6)
            java.lang.String r6 = "_tt_params_package_name"
            android.content.Context r7 = r4.f31134b
            java.lang.String r7 = r7.getPackageName()
            r9.putString(r6, r7)
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.ComponentName r7 = new android.content.ComponentName
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r0 = ".ttopenapi.TtEntryActivity"
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r5, r8)
            r6.setComponent(r7)
            r6.putExtras(r9)
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r6.addFlags(r5)
            android.content.Context r5 = r4.f31134b
            r5.startActivity(r6)
            return
        L_0x0094:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "target package: "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = " not supported"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttplatformsdk.c.c.a(java.lang.String, long, java.lang.String, android.os.Bundle):void");
    }
}
