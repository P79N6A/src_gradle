package com.bytedance.ttnet.encrypt;

import android.util.Base64;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.frameworks.baselib.network.http.util.g;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.h;
import com.bytedance.retrofit2.http.AddCommonParam;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.encrypt.c;
import com.bytedance.ttnet.hostmonitor.HostMonitorBroadcastReceiver;
import com.bytedance.ttnet.hostmonitor.e;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.bytedance.ttnet.utils.b;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.shortvideo.ea;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class TtTokenConfig {

    /* renamed from: f  reason: collision with root package name */
    private static TtTokenConfig f22618f;

    /* renamed from: a  reason: collision with root package name */
    public Object f22619a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public a f22620b;

    /* renamed from: c  reason: collision with root package name */
    final HostMonitorBroadcastReceiver f22621c = new HostMonitorBroadcastReceiver() {
        public final void a(e eVar) {
            if (eVar != null) {
                try {
                    if (g.a(TTNetInit.getTTNetDepend().a())) {
                        super.a(eVar);
                        if (eVar.f22648d) {
                            Logger.debug();
                            TtTokenConfig.this.e();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public AtomicBoolean f22622d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public long f22623e = 0;
    private a g;
    private long h = 0;
    private int i = 0;

    interface ISessionTokenApi {
        @GET
        Call<String> getSeesionToken(@AddCommonParam boolean z, @MaxLength int i, @Url String str);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        long f22627a;

        /* renamed from: b  reason: collision with root package name */
        long f22628b;

        /* renamed from: c  reason: collision with root package name */
        String f22629c;

        /* renamed from: d  reason: collision with root package name */
        byte[] f22630d;

        /* renamed from: e  reason: collision with root package name */
        byte[] f22631e;

        public final String toString() {
            return "SessionToken{request_time=" + this.f22627a + ", expire_time=" + this.f22628b + ", token='" + this.f22629c + '\'' + ", key=" + Arrays.toString(this.f22630d) + ", hmac_key=" + Arrays.toString(this.f22631e) + '}';
        }
    }

    public static TtTokenConfig a() {
        if (f22618f == null) {
            synchronized (TtTokenConfig.class) {
                if (f22618f == null) {
                    f22618f = new TtTokenConfig();
                }
            }
        }
        return f22618f;
    }

    public final a b() {
        a aVar;
        if (!g.a(TTNetInit.getTTNetDepend().a())) {
            g();
        }
        synchronized (this.f22619a) {
            aVar = this.f22620b;
        }
        return aVar;
    }

    public final void d() {
        c.a d2 = c.d();
        if (d2 != null && d2.l()) {
            List<e.j> list = com.bytedance.frameworks.baselib.network.http.e.f19852a;
            if (list != null && list.size() > 0) {
                Map<String, ?> c2 = c();
                for (e.j a2 : list) {
                    try {
                        a2.a(c2);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    private TtTokenConfig() {
        if (g.a(TTNetInit.getTTNetDepend().a())) {
            this.f22621c.a(TTNetInit.getTTNetDepend().a());
        }
        this.g = new a();
        this.g.f22630d = b.a((int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, "AES");
        this.g.f22631e = b.a((int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, "HmacSHA256");
        g();
    }

    public final Map<String, ?> c() {
        if (this.f22620b == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.f22619a) {
            linkedHashMap.put("token", this.f22620b.f22629c);
            linkedHashMap.put("key", this.f22620b.f22630d);
            linkedHashMap.put("hmac_key", this.f22620b.f22631e);
            linkedHashMap.put("expire", Long.valueOf(this.f22620b.f22628b));
            linkedHashMap.put("request_time", Long.valueOf(this.f22620b.f22627a));
            linkedHashMap.put("version", 1);
            linkedHashMap.put("session_token", this.f22620b);
        }
        return linkedHashMap;
    }

    private void g() {
        try {
            long parseLong = Long.parseLong(TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "tt_token_rt", "-1"));
            if (this.f22623e <= 0 || this.f22623e != parseLong) {
                this.f22623e = parseLong;
                String a2 = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "tt_token_t", "");
                String a3 = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "tt_token_e", "");
                String a4 = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "tt_token_h", "");
                String a5 = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "tt_token_et", PushConstants.PUSH_TYPE_NOTIFY);
                if (!StringUtils.isEmpty(a2) && !StringUtils.isEmpty(a3)) {
                    if (!StringUtils.isEmpty(a4)) {
                        a aVar = new a();
                        aVar.f22629c = new String((byte[]) b.b(this.g, Base64.decode(a2, 2)).second);
                        aVar.f22630d = (byte[]) b.b(this.g, Base64.decode(a3, 2)).second;
                        aVar.f22631e = (byte[]) b.b(this.g, Base64.decode(a4, 2)).second;
                        aVar.f22627a = parseLong;
                        aVar.f22628b = Long.parseLong(a5);
                        Logger.debug();
                        synchronized (this.f22619a) {
                            this.f22620b = aVar;
                        }
                        d();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void e() {
        long j;
        long j2;
        if (g.a(TTNetInit.getTTNetDepend().a())) {
            c.a d2 = c.d();
            if (d2 == null || !d2.l()) {
                Logger.debug();
                return;
            }
            if (this.f22620b == null) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.h > 0) {
                    if (this.i == 1) {
                        if (currentTimeMillis - this.h < ea.f66827f) {
                            Logger.debug();
                            return;
                        }
                    } else if (this.i != 2) {
                        Logger.debug();
                        return;
                    } else if (currentTimeMillis - this.h < 30000) {
                        Logger.debug();
                        return;
                    }
                }
            } else {
                synchronized (this.f22619a) {
                    j = this.f22620b.f22628b;
                    j2 = this.f22620b.f22627a;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                if (j2 > currentTimeMillis2) {
                    j2 = currentTimeMillis2 - j;
                }
                if (j2 + j > currentTimeMillis2) {
                    Logger.debug();
                    return;
                } else if (this.h > 0) {
                    if (this.i == 1) {
                        if (currentTimeMillis2 - this.h < ea.f66827f) {
                            Logger.debug();
                            return;
                        }
                    } else if (this.i != 2) {
                        Logger.debug();
                        return;
                    } else if (currentTimeMillis2 - this.h < 30000) {
                        Logger.debug();
                        return;
                    }
                }
            }
            if (this.f22622d.get()) {
                Logger.debug();
                return;
            }
            this.f22622d.getAndSet(true);
            ISessionTokenApi iSessionTokenApi = (ISessionTokenApi) RetrofitUtils.createSsService(a.f22632a, ISessionTokenApi.class);
            if (iSessionTokenApi == null) {
                this.f22622d.getAndSet(false);
                Logger.debug();
                return;
            }
            Call<String> seesionToken = iSessionTokenApi.getSeesionToken(true, -1, "/session_token/");
            final long currentTimeMillis3 = System.currentTimeMillis();
            this.h = currentTimeMillis3;
            this.i++;
            seesionToken.enqueue(new h<String>() {
                public final void a(Call<String> call, SsResponse<String> ssResponse) {
                    TtTokenConfig.this.f22622d.getAndSet(false);
                }

                public final void a(Call<String> call, Throwable th) {
                    TtTokenConfig.this.f22622d.getAndSet(false);
                }

                public final void b(Call<String> call, SsResponse<String> ssResponse) {
                    if (ssResponse != null) {
                        String str = (String) ssResponse.body();
                        Logger.debug();
                        if (!StringUtils.isEmpty(str)) {
                            try {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.optInt("status", -1) == 0) {
                                    String optString = jSONObject.optString("key", "");
                                    String optString2 = jSONObject.optString("hmac_key", "");
                                    String optString3 = jSONObject.optString("token", "");
                                    long optLong = (((jSONObject.optLong("expire", 0) * 60) * 60) * 1000) / 2;
                                    if (!StringUtils.isEmpty(optString) && !StringUtils.isEmpty(optString2)) {
                                        if (!StringUtils.isEmpty(optString3)) {
                                            a aVar = new a();
                                            aVar.f22627a = currentTimeMillis3;
                                            aVar.f22628b = optLong;
                                            aVar.f22629c = optString3;
                                            aVar.f22630d = Base64.decode(optString, 2);
                                            aVar.f22631e = Base64.decode(optString2, 2);
                                            synchronized (TtTokenConfig.this.f22619a) {
                                                TtTokenConfig.this.f22620b = aVar;
                                                TtTokenConfig.this.f22623e = currentTimeMillis3;
                                            }
                                            TtTokenConfig.this.f();
                                            TtTokenConfig.this.d();
                                        }
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (com.bytedance.common.utility.StringUtils.isEmpty(r1) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r3 != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        com.bytedance.common.utility.Logger.debug();
        r0 = new java.util.LinkedHashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        r1 = android.util.Base64.encodeToString((byte[]) com.bytedance.ttnet.encrypt.b.a(r11.g, r1.getBytes()).second, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r0.put("tt_token_t", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r2 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r2.length > 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        r2 = android.util.Base64.encodeToString((byte[]) com.bytedance.ttnet.encrypt.b.a(r11.g, r2).second, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        r0.put("tt_token_e", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (r3 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r3.length > 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        r2 = android.util.Base64.encodeToString((byte[]) com.bytedance.ttnet.encrypt.b.a(r11.g, r3).second, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        r0.put("tt_token_h", r2);
        r0.put("tt_token_rt", java.lang.String.valueOf(r4));
        r0.put("tt_token_et", java.lang.String.valueOf(r6));
        com.bytedance.ttnet.TTNetInit.getTTNetDepend().a(com.bytedance.ttnet.TTNetInit.getTTNetDepend().a(), (java.util.Map<java.lang.String, ?>) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ad, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f22619a     // Catch:{ Throwable -> 0x00b1 }
            monitor-enter(r0)     // Catch:{ Throwable -> 0x00b1 }
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r1 = r11.f22620b     // Catch:{ all -> 0x00ae }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x0009:
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r1 = r11.f22620b     // Catch:{ all -> 0x00ae }
            java.lang.String r1 = r1.f22629c     // Catch:{ all -> 0x00ae }
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r2 = r11.f22620b     // Catch:{ all -> 0x00ae }
            byte[] r2 = r2.f22630d     // Catch:{ all -> 0x00ae }
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r3 = r11.f22620b     // Catch:{ all -> 0x00ae }
            byte[] r3 = r3.f22631e     // Catch:{ all -> 0x00ae }
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r4 = r11.f22620b     // Catch:{ all -> 0x00ae }
            long r4 = r4.f22627a     // Catch:{ all -> 0x00ae }
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r6 = r11.f22620b     // Catch:{ all -> 0x00ae }
            long r6 = r6.f22628b     // Catch:{ all -> 0x00ae }
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x00b1 }
            if (r0 != 0) goto L_0x00ad
            if (r2 == 0) goto L_0x00ad
            if (r3 != 0) goto L_0x002a
            goto L_0x00ad
        L_0x002a:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x00b1 }
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x00b1 }
            r0.<init>()     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r8 = "tt_token_t"
            boolean r9 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x00b1 }
            r10 = 2
            if (r9 == 0) goto L_0x003e
            java.lang.String r1 = ""
            goto L_0x0050
        L_0x003e:
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r9 = r11.g     // Catch:{ Throwable -> 0x00b1 }
            byte[] r1 = r1.getBytes()     // Catch:{ Throwable -> 0x00b1 }
            android.util.Pair r1 = com.bytedance.ttnet.encrypt.b.a((com.bytedance.ttnet.encrypt.TtTokenConfig.a) r9, (byte[]) r1)     // Catch:{ Throwable -> 0x00b1 }
            java.lang.Object r1 = r1.second     // Catch:{ Throwable -> 0x00b1 }
            byte[] r1 = (byte[]) r1     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r10)     // Catch:{ Throwable -> 0x00b1 }
        L_0x0050:
            r0.put(r8, r1)     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r1 = "tt_token_e"
            if (r2 == 0) goto L_0x006a
            int r8 = r2.length     // Catch:{ Throwable -> 0x00b1 }
            if (r8 > 0) goto L_0x005b
            goto L_0x006a
        L_0x005b:
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r8 = r11.g     // Catch:{ Throwable -> 0x00b1 }
            android.util.Pair r2 = com.bytedance.ttnet.encrypt.b.a((com.bytedance.ttnet.encrypt.TtTokenConfig.a) r8, (byte[]) r2)     // Catch:{ Throwable -> 0x00b1 }
            java.lang.Object r2 = r2.second     // Catch:{ Throwable -> 0x00b1 }
            byte[] r2 = (byte[]) r2     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r10)     // Catch:{ Throwable -> 0x00b1 }
            goto L_0x006c
        L_0x006a:
            java.lang.String r2 = ""
        L_0x006c:
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r1 = "tt_token_h"
            if (r3 == 0) goto L_0x0086
            int r2 = r3.length     // Catch:{ Throwable -> 0x00b1 }
            if (r2 > 0) goto L_0x0077
            goto L_0x0086
        L_0x0077:
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r2 = r11.g     // Catch:{ Throwable -> 0x00b1 }
            android.util.Pair r2 = com.bytedance.ttnet.encrypt.b.a((com.bytedance.ttnet.encrypt.TtTokenConfig.a) r2, (byte[]) r3)     // Catch:{ Throwable -> 0x00b1 }
            java.lang.Object r2 = r2.second     // Catch:{ Throwable -> 0x00b1 }
            byte[] r2 = (byte[]) r2     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r10)     // Catch:{ Throwable -> 0x00b1 }
            goto L_0x0088
        L_0x0086:
            java.lang.String r2 = ""
        L_0x0088:
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r1 = "tt_token_rt"
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x00b1 }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00b1 }
            java.lang.String r1 = "tt_token_et"
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x00b1 }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00b1 }
            com.bytedance.ttnet.c r1 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch:{ Throwable -> 0x00b1 }
            com.bytedance.ttnet.c r2 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch:{ Throwable -> 0x00b1 }
            android.content.Context r2 = r2.a()     // Catch:{ Throwable -> 0x00b1 }
            r1.a((android.content.Context) r2, (java.util.Map<java.lang.String, ?>) r0)     // Catch:{ Throwable -> 0x00b1 }
            return
        L_0x00ad:
            return
        L_0x00ae:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            throw r1     // Catch:{ Throwable -> 0x00b1 }
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.encrypt.TtTokenConfig.f():void");
    }
}
