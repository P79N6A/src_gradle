package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.alipay.sdk.c.c;
import com.alipay.sdk.h.b;
import com.alipay.sdk.j.d;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.IOException;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final Object f5413a = d.class;

    /* renamed from: b  reason: collision with root package name */
    private Activity f5414b;

    /* renamed from: c  reason: collision with root package name */
    private com.alipay.sdk.k.a f5415c;

    private void b() {
        if (this.f5415c != null) {
            this.f5415c.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f5415c != null) {
            this.f5415c.b();
        }
    }

    public a(Activity activity) {
        this.f5414b = activity;
        b a2 = b.a();
        Activity activity2 = this.f5414b;
        c.a();
        a2.a((Context) activity2);
        com.alipay.sdk.app.a.a.a(activity);
        this.f5415c = new com.alipay.sdk.k.a(activity, "去支付宝授权");
    }

    private static boolean a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", SearchJediMixFeedAdapter.f42517f);
            if (packageInfo != null && packageInfo.versionCode >= 73) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = com.alipay.sdk.app.j.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        r4 = com.alipay.sdk.app.j.f5444a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        if (android.text.TextUtils.isEmpty(r4) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        r4 = com.alipay.sdk.app.j.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(com.alipay.sdk.g.b r4) {
        /*
            r3 = this;
            java.lang.String[] r4 = r4.f5505c
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1 = 0
            r4 = r4[r1]
            java.lang.String r1 = "url"
            r0.putString(r1, r4)
            android.content.Intent r4 = new android.content.Intent
            android.app.Activity r1 = r3.f5414b
            java.lang.Class<com.alipay.sdk.app.H5AuthActivity> r2 = com.alipay.sdk.app.H5AuthActivity.class
            r4.<init>(r1, r2)
            r4.putExtras(r0)
            android.app.Activity r0 = r3.f5414b
            r0.startActivity(r4)
            java.lang.Object r4 = f5413a
            monitor-enter(r4)
            java.lang.Object r0 = f5413a     // Catch:{ InterruptedException -> 0x0038 }
            r0.wait()     // Catch:{ InterruptedException -> 0x0038 }
            monitor-exit(r4)
            java.lang.String r4 = com.alipay.sdk.app.j.f5444a
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0035
            java.lang.String r4 = com.alipay.sdk.app.j.a()
        L_0x0035:
            return r4
        L_0x0036:
            r0 = move-exception
            goto L_0x003e
        L_0x0038:
            java.lang.String r0 = com.alipay.sdk.app.j.a()     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            return r0
        L_0x003e:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.a.a(com.alipay.sdk.g.b):java.lang.String");
    }

    private String a(Activity activity, String str) {
        k kVar;
        b();
        try {
            List a2 = com.alipay.sdk.g.b.a(new com.alipay.sdk.f.a.a().a((Context) activity, str).a().optJSONObject("form").optJSONObject("onload"));
            a();
            for (int i = 0; i < a2.size(); i++) {
                if (((com.alipay.sdk.g.b) a2.get(i)).f5503a == com.alipay.sdk.g.a.WapPay) {
                    String a3 = a((com.alipay.sdk.g.b) a2.get(i));
                    a();
                    return a3;
                }
            }
        } catch (IOException e2) {
            k a4 = k.a(k.NETWORK_ERROR.h);
            com.alipay.sdk.app.a.a.a("net", (Throwable) e2);
            a();
            kVar = a4;
        } catch (Throwable th) {
            a();
            throw th;
        }
        a();
        kVar = null;
        if (kVar == null) {
            kVar = k.a(k.FAILED.h);
        }
        return j.a(kVar.h, kVar.i, "");
    }

    public final synchronized String a(String str, boolean z) {
        String a2;
        Activity activity;
        String str2;
        b();
        b a3 = b.a();
        Activity activity2 = this.f5414b;
        c.a();
        a3.a((Context) activity2);
        a2 = j.a();
        try {
            Activity activity3 = this.f5414b;
            String a4 = new com.alipay.sdk.h.a(this.f5414b).a(str);
            if (a((Context) activity3)) {
                String a5 = new d(activity3, new c(this)).a(a4);
                if (!TextUtils.equals(a5, "failed")) {
                    if (TextUtils.isEmpty(a5)) {
                        str2 = j.a();
                        a2 = str2;
                        com.alipay.sdk.c.a.b().a(this.f5414b);
                        a();
                        activity = this.f5414b;
                        com.alipay.sdk.app.a.a.a((Context) activity, str);
                    } else {
                        a2 = a5;
                        com.alipay.sdk.c.a.b().a(this.f5414b);
                        a();
                        activity = this.f5414b;
                        com.alipay.sdk.app.a.a.a((Context) activity, str);
                    }
                }
            }
            str2 = a(activity3, a4);
            a2 = str2;
            com.alipay.sdk.c.a.b().a(this.f5414b);
            a();
            activity = this.f5414b;
        } catch (Exception unused) {
            com.alipay.sdk.c.a.b().a(this.f5414b);
            a();
            activity = this.f5414b;
        } catch (Throwable th) {
            com.alipay.sdk.c.a.b().a(this.f5414b);
            a();
            com.alipay.sdk.app.a.a.a((Context) this.f5414b, str);
            throw th;
        }
        com.alipay.sdk.app.a.a.a((Context) activity, str);
        return a2;
    }
}
