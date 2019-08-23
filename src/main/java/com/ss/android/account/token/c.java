package com.ss.android.account.token;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.account.token.b;
import com.ss.android.ugc.aweme.net.ah;
import java.security.PrivateKey;
import java.util.Iterator;
import java.util.List;

public final class c implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    static c f22682a;

    /* renamed from: b  reason: collision with root package name */
    public volatile long f22683b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f22684c;

    /* renamed from: d  reason: collision with root package name */
    public volatile String f22685d;

    /* renamed from: e  reason: collision with root package name */
    public b f22686e;

    /* renamed from: f  reason: collision with root package name */
    public Handler f22687f;
    public volatile int g;
    volatile boolean h;
    public volatile boolean i;
    private SharedPreferences j;
    private volatile boolean k;
    private volatile boolean l;
    private IGetTokenApi m;
    private String n;
    private PrivateKey o;
    private Context p;
    private final int q = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
    private volatile int r;
    private final long s = 10000;
    private volatile boolean t = true;
    private volatile boolean u;

    private static String d() {
        return PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
    }

    protected static c a() {
        return f22682a;
    }

    public final f c() {
        return this.f22686e.f22678c;
    }

    private boolean e() {
        if (this.l || !this.k || (!"change.token".equals(this.f22685d) && !TextUtils.isEmpty(this.f22685d))) {
            return false;
        }
        this.l = true;
        return true;
    }

    private void f() {
        this.f22685d = "";
        this.j.edit().putString("X-Tt-Token", "").apply();
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (!this.f22684c && this.t) {
            this.f22684c = true;
            String str = this.f22686e.f22676a;
            if (this.m == null || !str.equals(this.n)) {
                this.m = (IGetTokenApi) RetrofitUtils.createSsService(str, IGetTokenApi.class);
            }
            if (!TextUtils.isEmpty(this.f22685d) || !this.u) {
                if (!NetworkUtils.isNetworkAvailable(this.p)) {
                    this.r++;
                    this.f22687f.sendEmptyMessageDelayed(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, Math.min(((long) this.r) * 10000, this.f22686e.f22681f));
                    this.f22684c = false;
                    return;
                }
                this.r = 0;
                this.m.requestToken("").enqueue(new com.bytedance.retrofit2.c<String>() {
                    public final void a(Call<String> call, SsResponse<String> ssResponse) {
                        try {
                            c.this.f22684c = false;
                            c.this.f22683b = SystemClock.elapsedRealtime();
                            c.this.f22687f.sendEmptyMessageDelayed(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, c.this.f22686e.f22681f);
                            if (!(ssResponse == null || ssResponse.code() == 200)) {
                                d.a("tt_token_beat", (List) ssResponse.headers(), ssResponse.code(), (String) ssResponse.body());
                            }
                        } catch (Exception unused) {
                        }
                    }

                    public final void a(Call<String> call, Throwable th) {
                        try {
                            c.this.f22684c = false;
                            c.this.f22683b = SystemClock.elapsedRealtime();
                            c.this.f22687f.sendEmptyMessageDelayed(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, c.this.f22686e.f22681f);
                            d.a("tt_token_beat", (List) null, -1, th.getMessage());
                        } catch (Exception unused) {
                        }
                    }
                });
            } else if (!this.i) {
                this.m.requestChangeToken("").enqueue(new com.bytedance.retrofit2.c<String>() {
                    public final void a(Call<String> call, Throwable th) {
                        try {
                            c.this.f22684c = false;
                            c.this.f22683b = SystemClock.elapsedRealtime();
                            c.this.g++;
                            if (c.this.g < 5) {
                                c.this.f22687f.sendEmptyMessageDelayed(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, c.this.f22686e.g * ((long) c.this.g));
                            }
                            d.a("tt_token_change", (List) null, -1, th.getMessage());
                        } catch (Exception unused) {
                        }
                    }

                    public final void a(Call<String> call, SsResponse<String> ssResponse) {
                        try {
                            c.this.f22684c = false;
                            c.this.f22683b = SystemClock.elapsedRealtime();
                            c.this.f22687f.sendEmptyMessageDelayed(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, c.this.f22686e.f22681f);
                            if (ssResponse == null || ssResponse.code() == 200) {
                                c.this.i = true;
                            } else {
                                d.a("tt_token_change", (List) ssResponse.headers(), ssResponse.code(), (String) ssResponse.body());
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
    }

    public final void a(boolean z) {
        this.t = z;
        if (!z) {
            f();
        }
    }

    private boolean b(String str) {
        if (str != null) {
            b.a aVar = this.f22686e.h;
            if (aVar != null) {
                return aVar.a();
            }
        }
        return false;
    }

    public final void handleMsg(Message message) {
        if (message.what == 1000) {
            this.f22687f.removeMessages(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            b();
        }
    }

    private boolean a(String str) {
        if (!this.t || !this.f22686e.f22677b.contains(e.a(str))) {
            return false;
        }
        return true;
    }

    public final void a(final com.bytedance.retrofit2.c<String> cVar) {
        String str = this.f22686e.f22676a;
        if (this.m == null || !str.equals(this.n)) {
            this.m = (IGetTokenApi) RetrofitUtils.createSsService(str, IGetTokenApi.class);
        }
        try {
            this.m.logout("sdk_expired_logout").enqueue(new com.bytedance.retrofit2.c<String>() {
                public final void a(Call<String> call, SsResponse<String> ssResponse) {
                    if (cVar != null) {
                        cVar.a(call, ssResponse);
                    }
                }

                public final void a(Call<String> call, Throwable th) {
                    if (cVar != null) {
                        cVar.a(call, th);
                    }
                }
            });
        } catch (Exception unused) {
            Logger.debug();
        }
    }

    c(Context context, b bVar) {
        this.f22686e = bVar;
        this.p = context.getApplicationContext();
        RetrofitUtils.addInterceptor(new AuthTokenInterceptor());
        this.j = com.ss.android.ugc.aweme.q.c.a(context, TextUtils.isEmpty(bVar.f22679d) ? "token_shared_preference" : bVar.f22679d, 0);
        this.f22685d = this.j.getString("X-Tt-Token", "");
        this.u = this.j.getBoolean("first-launch", true);
        this.j.edit().putBoolean("first-launch", false).apply();
        this.f22687f = new WeakHandler(Looper.getMainLooper(), this);
        this.k = !TextUtils.isEmpty(this.f22685d);
    }

    public static void a(String str, List<Header> list) {
        if (f22682a != null && f22682a.a(str) && !f22682a.b(str)) {
            if (!TextUtils.isEmpty(f22682a.f22685d) && !f22682a.h) {
                list.add(new Header("X-Tt-Token", f22682a.f22685d));
            }
            list.add(new Header("sdk-version", d()));
            if (f22682a.e()) {
                d.a(str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.ss.android.account.token.b r0 = r10.f22686e     // Catch:{ all -> 0x00f5 }
            boolean r0 = r0.f22680e     // Catch:{ all -> 0x00f5 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = ""
            java.security.PrivateKey r3 = r10.o     // Catch:{ all -> 0x00f5 }
            if (r3 != 0) goto L_0x001d
            java.lang.String r3 = com.ss.android.account.token.g.f22696a     // Catch:{ Exception -> 0x0018 }
            java.security.PrivateKey r3 = com.ss.android.account.token.g.a(r3)     // Catch:{ Exception -> 0x0018 }
            r10.o = r3     // Catch:{ Exception -> 0x0018 }
            goto L_0x001d
        L_0x0018:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00f5 }
        L_0x001d:
            java.security.PrivateKey r3 = r10.o     // Catch:{ all -> 0x00f5 }
            if (r3 == 0) goto L_0x00b6
            int r3 = r11.length()     // Catch:{ all -> 0x00f5 }
            int r4 = r3 / 2
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x00f5 }
            r5 = 0
        L_0x002a:
            if (r5 >= r3) goto L_0x004b
            int r6 = r5 / 2
            char r7 = r11.charAt(r5)     // Catch:{ all -> 0x00f5 }
            r8 = 16
            int r7 = java.lang.Character.digit(r7, r8)     // Catch:{ all -> 0x00f5 }
            int r7 = r7 << 4
            int r9 = r5 + 1
            char r9 = r11.charAt(r9)     // Catch:{ all -> 0x00f5 }
            int r8 = java.lang.Character.digit(r9, r8)     // Catch:{ all -> 0x00f5 }
            int r7 = r7 + r8
            byte r7 = (byte) r7     // Catch:{ all -> 0x00f5 }
            r4[r6] = r7     // Catch:{ all -> 0x00f5 }
            int r5 = r5 + 2
            goto L_0x002a
        L_0x004b:
            java.security.PrivateKey r3 = r10.o     // Catch:{ all -> 0x00f5 }
            byte[] r3 = com.ss.android.account.token.g.a(r4, r3)     // Catch:{ all -> 0x00f5 }
            r4 = 0
            if (r3 == 0) goto L_0x0059
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00f5 }
            r4.<init>(r3)     // Catch:{ all -> 0x00f5 }
        L_0x0059:
            r3 = 100
            if (r4 == 0) goto L_0x0067
            int r5 = r4.length()     // Catch:{ all -> 0x00f5 }
            if (r5 <= r3) goto L_0x0067
            java.lang.String r4 = r4.substring(r2, r3)     // Catch:{ all -> 0x00f5 }
        L_0x0067:
            if (r12 == 0) goto L_0x0074
            int r5 = r12.length()     // Catch:{ all -> 0x00f5 }
            if (r5 <= r3) goto L_0x0074
            java.lang.String r3 = r12.substring(r2, r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x0075
        L_0x0074:
            r3 = r12
        L_0x0075:
            if (r4 == 0) goto L_0x00ad
            if (r12 == 0) goto L_0x00ad
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x00f5 }
            if (r3 == 0) goto L_0x00ad
            boolean r11 = r10.h     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x0085
            r10.h = r2     // Catch:{ all -> 0x00f5 }
        L_0x0085:
            r10.f22685d = r12     // Catch:{ all -> 0x00f5 }
            android.content.SharedPreferences r11 = r10.j     // Catch:{ all -> 0x00f5 }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "X-Tt-Token"
            android.content.SharedPreferences$Editor r11 = r11.putString(r0, r12)     // Catch:{ all -> 0x00f5 }
            r11.apply()     // Catch:{ all -> 0x00f5 }
            java.lang.String r11 = "change.token"
            java.lang.String r12 = r10.f22685d     // Catch:{ all -> 0x00f5 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x00f5 }
            if (r11 != 0) goto L_0x00a9
            java.lang.String r11 = r10.f22685d     // Catch:{ all -> 0x00f5 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x00f5 }
            if (r11 != 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r1 = 0
        L_0x00aa:
            r10.k = r1     // Catch:{ all -> 0x00f5 }
            goto L_0x00be
        L_0x00ad:
            java.lang.String r1 = "compare"
            com.ss.android.account.token.d.a((java.lang.String) r1, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r0)     // Catch:{ all -> 0x00f5 }
            r10.f()     // Catch:{ all -> 0x00f5 }
            goto L_0x00f3
        L_0x00b6:
            java.lang.String r1 = "privateKey"
            com.ss.android.account.token.d.a((java.lang.String) r1, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r0)     // Catch:{ all -> 0x00f5 }
            r10.f()     // Catch:{ all -> 0x00f5 }
        L_0x00be:
            monitor-exit(r10)
            return
        L_0x00c0:
            boolean r11 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x00f5 }
            if (r11 != 0) goto L_0x00f3
            boolean r11 = r10.h     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00cc
            r10.h = r2     // Catch:{ all -> 0x00f5 }
        L_0x00cc:
            r10.f22685d = r12     // Catch:{ all -> 0x00f5 }
            android.content.SharedPreferences r11 = r10.j     // Catch:{ all -> 0x00f5 }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "X-Tt-Token"
            android.content.SharedPreferences$Editor r11 = r11.putString(r0, r12)     // Catch:{ all -> 0x00f5 }
            r11.apply()     // Catch:{ all -> 0x00f5 }
            java.lang.String r11 = "change.token"
            java.lang.String r12 = r10.f22685d     // Catch:{ all -> 0x00f5 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x00f5 }
            if (r11 != 0) goto L_0x00f0
            java.lang.String r11 = r10.f22685d     // Catch:{ all -> 0x00f5 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x00f5 }
            if (r11 != 0) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r1 = 0
        L_0x00f1:
            r10.k = r1     // Catch:{ all -> 0x00f5 }
        L_0x00f3:
            monitor-exit(r10)
            return
        L_0x00f5:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.account.token.c.a(java.lang.String, java.lang.String):void");
    }

    public static void b(String str, List list) {
        ah a2 = ah.a();
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str, list}, a2, ah.f56909a, false, 60825, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, list}, a2, ah.f56909a, false, 60825, new Class[]{String.class, List.class}, Void.TYPE);
        } else {
            a2.f56911c.put(str, list);
        }
        if (f22682a != null && f22682a.a(str) && !f22682a.b(str)) {
            Iterator it2 = list.iterator();
            String str2 = null;
            String str3 = null;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Header header = (Header) it2.next();
                if ("X-Tt-Token-Sign".equalsIgnoreCase(header.getName())) {
                    str3 = header.getValue();
                } else if ("X-Tt-Token".equalsIgnoreCase(header.getName())) {
                    str2 = header.getValue();
                }
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    c cVar = f22682a;
                    if (str == null || !str.contains("/passport/token/beat/") || TextUtils.isEmpty(cVar.f22685d) || cVar.f22685d.length() < 34) {
                        z = true;
                    } else if (str2.length() >= 34) {
                        z = str2.substring(2, 34).equals(cVar.f22685d.substring(2, 34));
                    }
                    if (z) {
                        f22682a.a(str3, str2);
                        return;
                    }
                }
            }
        }
    }
}
