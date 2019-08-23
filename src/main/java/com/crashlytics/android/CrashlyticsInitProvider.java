package com.crashlytics.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.services.b.i;
import io.fabric.sdk.android.services.b.r;

public class CrashlyticsInitProvider extends ContentProvider {

    interface EnabledCheckStrategy {
        boolean isCrashlyticsEnabled(Context context);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (shouldInitializeFabric(context, new r(), new ManifestEnabledCheckStrategy())) {
            try {
                c.a(context, createCrashlyticsKits(context.getApplicationContext()));
            } catch (IllegalStateException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private io.fabric.sdk.android.i[] createCrashlyticsKits(android.content.Context r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x001e }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = r2.getApplicationInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.os.Bundle r5 = r5.metaData     // Catch:{ NameNotFoundException -> 0x001e }
            if (r5 == 0) goto L_0x001e
            java.lang.String r2 = "firebase_crashlytics_ndk_enabled"
            boolean r5 = r5.getBoolean(r2, r1)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r5 == 0) goto L_0x001e
            r5 = 1
            goto L_0x001f
        L_0x001e:
            r5 = 0
        L_0x001f:
            com.crashlytics.android.Crashlytics r2 = new com.crashlytics.android.Crashlytics
            r2.<init>()
            if (r5 == 0) goto L_0x0033
            r5 = 2
            io.fabric.sdk.android.i[] r5 = new io.fabric.sdk.android.i[r5]     // Catch:{ Throwable -> 0x0033 }
            r5[r1] = r2     // Catch:{ Throwable -> 0x0033 }
            com.crashlytics.android.ndk.CrashlyticsNdk r3 = new com.crashlytics.android.ndk.CrashlyticsNdk     // Catch:{ Throwable -> 0x0033 }
            r3.<init>()     // Catch:{ Throwable -> 0x0033 }
            r5[r0] = r3     // Catch:{ Throwable -> 0x0033 }
            return r5
        L_0x0033:
            io.fabric.sdk.android.i[] r5 = new io.fabric.sdk.android.i[r0]
            r5[r1] = r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.CrashlyticsInitProvider.createCrashlyticsKits(android.content.Context):io.fabric.sdk.android.i[]");
    }

    /* access modifiers changed from: package-private */
    public boolean shouldInitializeFabric(Context context, r rVar, EnabledCheckStrategy enabledCheckStrategy) {
        if (rVar.a(context)) {
            return enabledCheckStrategy.isCrashlyticsEnabled(context);
        }
        int a2 = i.a(context, "io.fabric.auto_initialize", "bool");
        if (a2 == 0) {
            return false;
        }
        return context.getResources().getBoolean(a2);
    }
}
