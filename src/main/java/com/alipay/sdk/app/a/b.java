package com.alipay.sdk.app.a;

import android.content.Context;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f5417a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f5418b;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037 A[Catch:{ IOException -> 0x0040, Throwable -> 0x003f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            com.alipay.sdk.f.a.c r0 = new com.alipay.sdk.f.a.c
            r0.<init>()
            android.content.Context r1 = r4.f5417a     // Catch:{ Throwable -> 0x002f }
            java.lang.String r2 = "alipay_cashier_statistic_record"
            r3 = 0
            java.lang.String r1 = com.alipay.sdk.j.g.b(r1, r2, r3)     // Catch:{ Throwable -> 0x002f }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x002f }
            if (r2 != 0) goto L_0x002f
            android.content.Context r2 = r4.f5417a     // Catch:{ Throwable -> 0x002f }
            com.alipay.sdk.f.b r1 = r0.a((android.content.Context) r2, (java.lang.String) r1)     // Catch:{ Throwable -> 0x002f }
            if (r1 == 0) goto L_0x002f
            android.content.Context r1 = r4.f5417a     // Catch:{ Throwable -> 0x002f }
            java.lang.String r2 = "alipay_cashier_statistic_record"
            android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)     // Catch:{ Throwable -> 0x002f }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ Throwable -> 0x002f }
            android.content.SharedPreferences$Editor r1 = r1.remove(r2)     // Catch:{ Throwable -> 0x002f }
            r1.commit()     // Catch:{ Throwable -> 0x002f }
        L_0x002f:
            java.lang.String r1 = r4.f5418b     // Catch:{ IOException -> 0x0040, Throwable -> 0x003f }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException -> 0x0040, Throwable -> 0x003f }
            if (r1 != 0) goto L_0x003e
            android.content.Context r1 = r4.f5417a     // Catch:{ IOException -> 0x0040, Throwable -> 0x003f }
            java.lang.String r2 = r4.f5418b     // Catch:{ IOException -> 0x0040, Throwable -> 0x003f }
            r0.a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ IOException -> 0x0040, Throwable -> 0x003f }
        L_0x003e:
            return
        L_0x003f:
            return
        L_0x0040:
            android.content.Context r0 = r4.f5417a
            java.lang.String r1 = "alipay_cashier_statistic_record"
            java.lang.String r2 = r4.f5418b
            com.alipay.sdk.j.g.a(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.a.b.run():void");
    }

    b(Context context, String str) {
        this.f5417a = context;
        this.f5418b = str;
    }
}
