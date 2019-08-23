package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Handler;
import android.support.annotation.NonNull;
import com.ss.android.ugc.effectmanager.a.a;
import com.ss.android.ugc.effectmanager.common.e.d;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.g;

public final class f extends d {

    /* renamed from: e  reason: collision with root package name */
    private ProviderEffect f77444e;

    /* renamed from: f  reason: collision with root package name */
    private int f77445f;
    private a g;
    private String h;
    private g i;
    private String j;
    private String k;

    /* JADX WARNING: Can't wrap try/catch for region: R(9:6|7|(1:9)|10|11|12|13|14|(2:16|(3:32|18|19)(2:34|27))(3:33|20|21)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0065 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007e A[Catch:{ Exception -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r13 = this;
            int r0 = r13.f77445f
            r1 = 0
        L_0x0003:
            if (r1 >= r0) goto L_0x00cc
            boolean r2 = r13.f77323c
            r3 = 19
            if (r2 == 0) goto L_0x001d
            com.ss.android.ugc.effectmanager.effect.e.a.a r0 = new com.ss.android.ugc.effectmanager.effect.e.a.a
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r1 = r13.f77444e
            com.ss.android.ugc.effectmanager.common.e.c r2 = new com.ss.android.ugc.effectmanager.common.e.c
            r4 = 10001(0x2711, float:1.4014E-41)
            r2.<init>((int) r4)
            r0.<init>(r1, r2)
            r13.a(r3, r0)
            return
        L_0x001d:
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r2 = r13.f77444e     // Catch:{ Exception -> 0x00aa }
            java.lang.String r2 = r2.path     // Catch:{ Exception -> 0x00aa }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x00aa }
            if (r2 == 0) goto L_0x004c
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r2 = r13.f77444e     // Catch:{ Exception -> 0x00aa }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00aa }
            r4.<init>()     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.effectmanager.g r5 = r13.i     // Catch:{ Exception -> 0x00aa }
            java.io.File r5 = r5.i     // Catch:{ Exception -> 0x00aa }
            r4.append(r5)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r5 = java.io.File.separator     // Catch:{ Exception -> 0x00aa }
            r4.append(r5)     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r5 = r13.f77444e     // Catch:{ Exception -> 0x00aa }
            java.lang.String r5 = r5.id     // Catch:{ Exception -> 0x00aa }
            r4.append(r5)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r5 = ".gif"
            r4.append(r5)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00aa }
            r2.path = r4     // Catch:{ Exception -> 0x00aa }
        L_0x004c:
            java.lang.String r2 = r13.h     // Catch:{ Exception -> 0x00aa }
            r13.j = r2     // Catch:{ Exception -> 0x00aa }
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException | UnknownHostException -> 0x0065 }
            java.lang.String r4 = r13.j     // Catch:{ MalformedURLException | UnknownHostException -> 0x0065 }
            r2.<init>(r4)     // Catch:{ MalformedURLException | UnknownHostException -> 0x0065 }
            java.lang.String r2 = r2.getHost()     // Catch:{ MalformedURLException | UnknownHostException -> 0x0065 }
            java.net.InetAddress r2 = java.net.InetAddress.getByName(r2)     // Catch:{ MalformedURLException | UnknownHostException -> 0x0065 }
            java.lang.String r2 = r2.getHostAddress()     // Catch:{ MalformedURLException | UnknownHostException -> 0x0065 }
            r13.k = r2     // Catch:{ MalformedURLException | UnknownHostException -> 0x0065 }
        L_0x0065:
            java.lang.String r2 = r13.h     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r4 = r13.f77444e     // Catch:{ Exception -> 0x00aa }
            java.lang.String r4 = r4.path     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.effectmanager.common.a r5 = new com.ss.android.ugc.effectmanager.common.a     // Catch:{ Exception -> 0x00aa }
            java.lang.String r6 = "GET"
            r5.<init>(r6, r2)     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.effectmanager.a.a r2 = r13.g     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.effectmanager.g r2 = r2.f77204a     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.effectmanager.d.a r2 = r2.w     // Catch:{ Exception -> 0x00aa }
            java.io.InputStream r2 = r2.a(r5)     // Catch:{ Exception -> 0x00aa }
            if (r2 == 0) goto L_0x00a2
            com.ss.android.ugc.effectmanager.effect.e.a.a r12 = new com.ss.android.ugc.effectmanager.effect.e.a.a     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r7 = r13.f77444e     // Catch:{ Exception -> 0x00aa }
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r12
            r6.<init>(r7, r8, r9, r10)     // Catch:{ Exception -> 0x00aa }
            long r5 = r5.f77267c     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.effectmanager.effect.e.b.f$1 r7 = new com.ss.android.ugc.effectmanager.effect.e.b.f$1     // Catch:{ Exception -> 0x00aa }
            r7.<init>(r12)     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.effectmanager.common.f.b.a(r2, r4, r5, r7)     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r2 = r13.f77444e     // Catch:{ Exception -> 0x00aa }
            if (r2 == 0) goto L_0x00c8
            com.ss.android.ugc.effectmanager.effect.e.a.a r4 = new com.ss.android.ugc.effectmanager.effect.e.a.a     // Catch:{ Exception -> 0x00aa }
            r5 = 0
            r4.<init>(r2, r5)     // Catch:{ Exception -> 0x00aa }
            r13.a(r3, r4)     // Catch:{ Exception -> 0x00aa }
            return
        L_0x00a2:
            android.accounts.NetworkErrorException r2 = new android.accounts.NetworkErrorException     // Catch:{ Exception -> 0x00aa }
            java.lang.String r4 = "Download error"
            r2.<init>(r4)     // Catch:{ Exception -> 0x00aa }
            throw r2     // Catch:{ Exception -> 0x00aa }
        L_0x00aa:
            r2 = move-exception
            int r4 = r0 + -1
            if (r1 != r4) goto L_0x00c8
            com.ss.android.ugc.effectmanager.common.e.c r0 = new com.ss.android.ugc.effectmanager.common.e.c
            r0.<init>((java.lang.Exception) r2)
            java.lang.String r1 = r13.j
            java.lang.String r2 = ""
            java.lang.String r4 = r13.k
            r0.a(r1, r2, r4)
            com.ss.android.ugc.effectmanager.effect.e.a.a r1 = new com.ss.android.ugc.effectmanager.effect.e.a.a
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r2 = r13.f77444e
            r1.<init>(r2, r0)
            r13.a(r3, r1)
            return
        L_0x00c8:
            int r1 = r1 + 1
            goto L_0x0003
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.e.b.f.a():void");
    }

    public f(a aVar, String str, @NonNull ProviderEffect providerEffect, Handler handler) {
        super(handler, str, "NETWORK");
        String str2;
        this.f77444e = providerEffect;
        this.g = aVar;
        this.i = aVar.f77204a;
        this.f77445f = aVar.f77204a.s;
        if (providerEffect.sticker == null || providerEffect.sticker.url == null) {
            str2 = "";
        } else {
            str2 = providerEffect.sticker.url;
        }
        this.h = str2;
    }
}
