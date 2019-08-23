package com.vivo.push;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Bundle f81477a;

    /* renamed from: b  reason: collision with root package name */
    private String f81478b;

    /* renamed from: c  reason: collision with root package name */
    private String f81479c;

    public final String a() {
        return this.f81478b;
    }

    public final Bundle b() {
        return this.f81477a;
    }

    public final String a(String str) {
        if (this.f81477a == null) {
            return null;
        }
        return this.f81477a.getString(str);
    }

    public final Serializable c(String str) {
        if (this.f81477a == null) {
            return null;
        }
        return this.f81477a.getSerializable(str);
    }

    public final boolean d(String str) {
        if (this.f81477a == null) {
            return false;
        }
        return this.f81477a.getBoolean(str, false);
    }

    public final ArrayList<String> b(String str) {
        if (this.f81477a == null) {
            return null;
        }
        return this.f81477a.getStringArrayList(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.vivo.push.a a(android.content.Intent r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x000b
            java.lang.String r5 = "BundleWapper"
            java.lang.String r1 = "create error : intent is null"
            com.vivo.push.util.o.a((java.lang.String) r5, (java.lang.String) r1)
            return r0
        L_0x000b:
            android.os.Bundle r1 = r5.getExtras()
            if (r1 == 0) goto L_0x001e
            java.lang.String r2 = "client_pkgname"
            java.lang.String r2 = r1.getString(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r2 = r0
        L_0x001f:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x002c
            java.lang.String r3 = "BundleWapper"
            java.lang.String r4 = "create warning: pkgName is null"
            com.vivo.push.util.o.b((java.lang.String) r3, (java.lang.String) r4)
        L_0x002c:
            java.lang.String r3 = r5.getPackage()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0054
            android.content.ComponentName r3 = r5.getComponent()
            if (r3 != 0) goto L_0x003e
        L_0x003c:
            r3 = r0
            goto L_0x0047
        L_0x003e:
            android.content.ComponentName r5 = r5.getComponent()
            java.lang.String r0 = r5.getPackageName()
            goto L_0x003c
        L_0x0047:
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x0054
            java.lang.String r5 = "BundleWapper"
            java.lang.String r0 = "create warning: targetPkgName is null"
            com.vivo.push.util.o.b((java.lang.String) r5, (java.lang.String) r0)
        L_0x0054:
            com.vivo.push.a r5 = new com.vivo.push.a
            r5.<init>(r2, r3, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.a.a(android.content.Intent):com.vivo.push.a");
    }

    public final int b(String str, int i) {
        if (this.f81477a == null) {
            return i;
        }
        return this.f81477a.getInt(str, i);
    }

    public final void a(String str, int i) {
        if (this.f81477a == null) {
            this.f81477a = new Bundle();
        }
        this.f81477a.putInt(str, i);
    }

    public final long b(String str, long j) {
        if (this.f81477a == null) {
            return j;
        }
        return this.f81477a.getLong(str, j);
    }

    public final void a(String str, long j) {
        if (this.f81477a == null) {
            this.f81477a = new Bundle();
        }
        this.f81477a.putLong(str, j);
    }

    public final void a(String str, Serializable serializable) {
        if (this.f81477a == null) {
            this.f81477a = new Bundle();
        }
        this.f81477a.putSerializable(str, serializable);
    }

    public final void a(String str, String str2) {
        if (this.f81477a == null) {
            this.f81477a = new Bundle();
        }
        this.f81477a.putString(str, str2);
    }

    public final void a(String str, ArrayList<String> arrayList) {
        if (this.f81477a == null) {
            this.f81477a = new Bundle();
        }
        this.f81477a.putStringArrayList(str, arrayList);
    }

    public final void a(String str, boolean z) {
        if (this.f81477a == null) {
            this.f81477a = new Bundle();
        }
        this.f81477a.putBoolean(str, z);
    }

    public a(String str, String str2, Bundle bundle) {
        this.f81478b = str;
        this.f81479c = str2;
        this.f81477a = bundle;
    }
}
