package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.be;
import com.xiaomi.push.service.bf;
import java.util.HashMap;
import java.util.Map;

public class ii {

    /* renamed from: a  reason: collision with root package name */
    private static ii f82229a;

    /* renamed from: a  reason: collision with other field name */
    private final Context f530a;

    /* renamed from: a  reason: collision with other field name */
    private Map<String, ij> f531a = new HashMap();

    private ii(Context context) {
        this.f530a = context;
    }

    public static ii a(Context context) {
        if (context == null) {
            b.d("[TinyDataManager]:mContext is null, TinyDataManager.getInstance(Context) failed.");
            return null;
        }
        if (f82229a == null) {
            synchronized (ii.class) {
                try {
                    if (f82229a == null) {
                        f82229a = new ii(context);
                    }
                } catch (Throwable th) {
                    Class<ii> cls = ii.class;
                    throw th;
                }
            }
        }
        return f82229a;
    }

    private boolean a(String str, String str2, String str3, String str4, long j, String str5) {
        io ioVar = new io();
        ioVar.d(str3);
        ioVar.c(str4);
        ioVar.a(j);
        ioVar.b(str5);
        ioVar.a(true);
        ioVar.a("push_sdk_channel");
        ioVar.e(str2);
        b.a("TinyData TinyDataManager.upload item:" + ioVar.d() + "   ts:" + System.currentTimeMillis());
        return a(ioVar, str);
    }

    /* access modifiers changed from: package-private */
    public ij a() {
        ij ijVar = this.f531a.get("UPLOADER_PUSH_CHANNEL");
        if (ijVar != null) {
            return ijVar;
        }
        ij ijVar2 = this.f531a.get("UPLOADER_HTTP");
        if (ijVar2 == null) {
            return null;
        }
        return ijVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public Map<String, ij> m394a() {
        return this.f531a;
    }

    public void a(ij ijVar, String str) {
        if (ijVar == null) {
            b.d("[TinyDataManager]: please do not add null mUploader to TinyDataManager.");
        } else if (TextUtils.isEmpty(str)) {
            b.d("[TinyDataManager]: can not add a provider from unkown resource.");
        } else {
            a().put(str, ijVar);
        }
    }

    public boolean a(io ioVar, String str) {
        if (TextUtils.isEmpty(str)) {
            b.a("pkgName is null or empty, upload ClientUploadDataItem failed.");
            return false;
        } else if (be.a(ioVar, false)) {
            return false;
        } else {
            if (TextUtils.isEmpty(ioVar.d())) {
                ioVar.f(be.a());
            }
            ioVar.g(str);
            bf.a(this.f530a, ioVar);
            return true;
        }
    }

    public boolean a(String str, String str2, long j, String str3) {
        return a(this.f530a.getPackageName(), this.f530a.getPackageName(), str, str2, j, str3);
    }
}
