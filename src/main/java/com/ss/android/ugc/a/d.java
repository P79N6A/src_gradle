package com.ss.android.ugc.a;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.io.File;
import okhttp3.OkHttpClient;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static Context f31521a;

    /* renamed from: b  reason: collision with root package name */
    public OkHttpClient f31522b;

    /* renamed from: c  reason: collision with root package name */
    public f f31523c;

    /* renamed from: d  reason: collision with root package name */
    private e f31524d;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f31525a = new d((byte) 0);
    }

    private d() {
    }

    public static d a() {
        d dVar = a.f31525a;
        if (f31521a == null) {
            f31521a = b.a().f31516a;
        }
        return dVar;
    }

    public static long b() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    public static long c() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return -1;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    public static boolean a(String str) {
        return URLUtil.isNetworkUrl(str);
    }

    private boolean a(com.ss.android.ugc.a.b.d dVar) {
        String str = this.f31524d.f31527b;
        String str2 = this.f31524d.f31528c;
        if (a(str, str2) && a(str)) {
            return true;
        }
        dVar.onError(c.a().a(2).a(str, str2));
        return false;
    }

    private static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return true;
    }

    private void a(com.ss.android.ugc.a.b.d dVar, com.ss.android.ugc.a.a.a aVar) {
        if (!TextUtils.isEmpty(this.f31524d.f31528c)) {
            File file = new File(this.f31524d.f31528c);
            if (file.exists() && file.length() > 0) {
                file.delete();
            }
            a(this.f31524d, dVar, aVar);
            return;
        }
        a(this.f31524d, dVar, aVar);
    }

    public final void a(e eVar, com.ss.android.ugc.a.b.d dVar) {
        if (eVar.k != null) {
            this.f31522b = eVar.k;
        }
        if (eVar != null && dVar != null) {
            com.ss.android.ugc.a.a.a a2 = com.ss.android.ugc.a.a.a.a(f31521a);
            this.f31524d = eVar;
            if (a(dVar)) {
                a(dVar, a2);
            }
        }
    }

    private void a(e eVar, com.ss.android.ugc.a.b.d dVar, com.ss.android.ugc.a.a.a aVar) {
        if (!a(eVar.f31527b)) {
            dVar.onError(c.a().a(2));
            return;
        }
        if (this.f31523c == null) {
            this.f31523c = new f(f31521a, this.f31522b, aVar);
        }
        this.f31523c.a(eVar, dVar);
    }
}
