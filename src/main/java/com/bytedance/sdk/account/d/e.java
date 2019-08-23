package com.bytedance.sdk.account.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakContainer;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.d;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class e implements WeakHandler.IHandler, com.bytedance.sdk.account.api.c {
    private static final com.ss.android.account.b.a[] A = {f22334a, f22335b, f22336c, f22337d, f22338e, f22339f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x};
    private static volatile com.bytedance.sdk.account.api.c I;
    private static List<a> J = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    static final com.ss.android.account.b.a f22334a = new com.ss.android.account.b.a("sina_weibo", C0906R.string.ca2);

    /* renamed from: b  reason: collision with root package name */
    static final com.ss.android.account.b.a f22335b = new com.ss.android.account.b.a("qq_weibo", C0906R.string.c_y);

    /* renamed from: c  reason: collision with root package name */
    static final com.ss.android.account.b.a f22336c = new com.ss.android.account.b.a("renren_sns", C0906R.string.c_w);

    /* renamed from: d  reason: collision with root package name */
    static final com.ss.android.account.b.a f22337d = new com.ss.android.account.b.a("kaixin_sns", C0906R.string.c_r);

    /* renamed from: e  reason: collision with root package name */
    static final com.ss.android.account.b.a f22338e = new com.ss.android.account.b.a("qzone_sns", C0906R.string.c_v);

    /* renamed from: f  reason: collision with root package name */
    static final com.ss.android.account.b.a f22339f = new com.ss.android.account.b.a("mobile", C0906R.string.c_u);
    static final com.ss.android.account.b.a g = new com.ss.android.account.b.a("weixin", C0906R.string.ca3);
    static final com.ss.android.account.b.a h = new com.ss.android.account.b.a("flyme", C0906R.string.c_m);
    static final com.ss.android.account.b.a i = new com.ss.android.account.b.a("huawei", C0906R.string.c_o);
    static final com.ss.android.account.b.a j = new com.ss.android.account.b.a("telecom", C0906R.string.c_x);
    static final com.ss.android.account.b.a k = new com.ss.android.account.b.a("xiaomi", C0906R.string.ca4);
    static final com.ss.android.account.b.a l = new com.ss.android.account.b.a("email", C0906R.string.c_j);
    static final com.ss.android.account.b.a m = new com.ss.android.account.b.a("live_stream", C0906R.string.c_p);
    static final com.ss.android.account.b.a n = new com.ss.android.account.b.a("aweme", C0906R.string.c_i);
    static final com.ss.android.account.b.a o = new com.ss.android.account.b.a("google", C0906R.string.c_n);
    static final com.ss.android.account.b.a p = new com.ss.android.account.b.a("facebook", C0906R.string.c_k);
    static final com.ss.android.account.b.a q = new com.ss.android.account.b.a("twitter", C0906R.string.ca0);
    static final com.ss.android.account.b.a r = new com.ss.android.account.b.a("instagram", C0906R.string.c_q);
    static final com.ss.android.account.b.a s = new com.ss.android.account.b.a("line", C0906R.string.c_t);
    static final com.ss.android.account.b.a t = new com.ss.android.account.b.a("kakaotalk", C0906R.string.c_s);
    static final com.ss.android.account.b.a u = new com.ss.android.account.b.a("vk", C0906R.string.ca1);
    static final com.ss.android.account.b.a v = new com.ss.android.account.b.a("toutiao", C0906R.string.c_z);
    static final com.ss.android.account.b.a w = new com.ss.android.account.b.a("toutiao_v2", C0906R.string.c_z);
    static final com.ss.android.account.b.a x = new com.ss.android.account.b.a("flipchat", C0906R.string.c_l);
    private boolean B;
    private long C;
    private String D = "";
    private final com.ss.android.account.b.a[] E;
    private boolean F;
    private WeakContainer<Object> G = new WeakContainer<>();
    private long H = 0;
    final Context y;
    public final WeakHandler z = new WeakHandler(Looper.getMainLooper(), this);

    interface a {
        void a(BaseApiResponse baseApiResponse);
    }

    static class b implements a {
        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final void a(BaseApiResponse baseApiResponse) {
            if (baseApiResponse.api == 10001 && baseApiResponse.success) {
                com.bytedance.sdk.account.api.c a2 = d.a();
                a2.a(true);
                a2.a(new com.bytedance.sdk.account.api.a(1));
            }
        }
    }

    static class c implements a {
        private c() {
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        public final void a(BaseApiResponse baseApiResponse) {
            if (baseApiResponse instanceof d) {
                com.bytedance.sdk.account.k.b bVar = ((d) baseApiResponse).f22252a;
                if (bVar != null && (bVar instanceof com.bytedance.sdk.account.k.b)) {
                    d.a().a(bVar);
                }
            } else if (baseApiResponse instanceof com.bytedance.sdk.account.api.call.c) {
                T t = ((com.bytedance.sdk.account.api.call.c) baseApiResponse).f22251a;
                if (t instanceof com.bytedance.sdk.account.f.a.d) {
                    d.a().a(((com.bytedance.sdk.account.f.a.d) t).a());
                }
            } else {
                if (baseApiResponse instanceof com.bytedance.sdk.account.api.c.e) {
                    com.bytedance.sdk.account.k.b bVar2 = ((com.bytedance.sdk.account.api.c.e) baseApiResponse).f22248c;
                    if (bVar2 != null && (bVar2 instanceof com.bytedance.sdk.account.k.b)) {
                        d.a().a(bVar2);
                    }
                }
            }
        }
    }

    static com.bytedance.sdk.account.api.c a() {
        if (I == null) {
            synchronized (e.class) {
                if (I == null) {
                    I = new e(com.ss.android.account.c.a().b());
                }
            }
        }
        return I;
    }

    public final void a(com.bytedance.sdk.account.api.a aVar) {
        Iterator it2 = this.G.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    private void a(Context context) {
        SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(context, "com.bytedance.sdk.account_setting", 0).edit();
        a(edit);
        edit.remove("session");
        edit.putBoolean("is_login", this.B);
        edit.putLong("user_id", this.C);
        edit.putString("session_key", this.D);
        SharedPrefsEditorCompat.apply(edit);
    }

    public void handleMsg(Message message) {
        if (message.what == 100 && (message.obj instanceof i)) {
            i iVar = (i) message.obj;
            if (iVar.f22349b != null) {
                T t2 = iVar.f22349b;
                for (a a2 : J) {
                    a2.a(t2);
                }
                if (iVar.f22348a != null) {
                    Object obj = iVar.f22348a.get();
                    if (obj != null && (obj instanceof com.bytedance.sdk.account.api.call.a)) {
                        com.bytedance.sdk.account.api.call.a aVar = (com.bytedance.sdk.account.api.call.a) obj;
                        T t3 = iVar.f22349b;
                        if (!aVar.f22249a) {
                            aVar.a(t3);
                        }
                        com.bytedance.sdk.account.api.b.a aVar2 = aVar.f22331b;
                        if (aVar2 != null) {
                            aVar2.a();
                        }
                    }
                }
            }
        }
    }

    private void a(SharedPreferences.Editor editor) {
        for (com.ss.android.account.b.a aVar : this.E) {
            if (aVar.f2418d) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("mName", aVar.f2416b);
                    jSONObject.put("mNickname", aVar.f2419e);
                    jSONObject.put("mAvatar", aVar.f2420f);
                    jSONObject.put("mPlatformUid", aVar.g);
                    jSONObject.put("mExpire", aVar.i);
                    jSONObject.put("mExpireIn", aVar.j);
                    jSONObject.put("isLogin", aVar.f2418d);
                    editor.putString("_platform_" + aVar.f2416b, jSONObject.toString());
                } catch (Exception unused) {
                }
            }
        }
        editor.apply();
    }

    private e(Context context) {
        J.add(new c((byte) 0));
        J.add(new b((byte) 0));
        this.y = context.getApplicationContext();
        this.F = false;
        this.E = new com.ss.android.account.b.a[]{f22339f, f22338e, f22334a, f22335b, f22336c, f22337d, g, h, i, j, k, l, m, n, s, t, u, v, w, x};
        if (!this.F) {
            this.F = true;
            SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(this.y, "com.bytedance.sdk.account_setting", 0);
            this.B = a2.getBoolean("is_login", false);
            this.C = a2.getLong("user_id", 0);
            this.D = a2.getString("session_key", "");
            if (this.B && this.C <= 0) {
                this.B = false;
                this.C = 0;
            } else if (!this.B && this.C > 0) {
                this.C = 0;
            }
            a(a2);
            if (this.C > 0) {
                AppLog.setUserId(this.C);
                AppLog.setSessionKey(this.D);
            }
        }
    }

    private void a(SharedPreferences sharedPreferences) {
        for (int i2 = 0; i2 < this.E.length; i2++) {
            this.E[i2].f2418d = false;
            com.ss.android.account.b.a aVar = this.E[i2];
            try {
                if (!TextUtils.isEmpty(aVar.f2416b)) {
                    String string = sharedPreferences.getString("_platform_" + aVar.f2416b, null);
                    if (string != null) {
                        JSONObject jSONObject = new JSONObject(string);
                        if (jSONObject.optString("mName", "").equals(aVar.f2416b)) {
                            if (jSONObject.has("mNickname")) {
                                aVar.f2419e = jSONObject.optString("mNickname", null);
                            }
                            if (jSONObject.has("mAvatar")) {
                                aVar.f2420f = jSONObject.optString("mAvatar", null);
                            }
                            if (jSONObject.has("mPlatformUid")) {
                                aVar.g = jSONObject.optString("mPlatformUid", null);
                            }
                            if (jSONObject.has("mExpire")) {
                                aVar.i = jSONObject.optLong("mExpire", aVar.i);
                            }
                            if (jSONObject.has("mExpireIn")) {
                                aVar.j = jSONObject.optLong("mExpireIn", aVar.j);
                            }
                            if (jSONObject.has("isLogin")) {
                                aVar.f2418d = jSONObject.optBoolean("isLogin", false);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(com.bytedance.sdk.account.k.b bVar) {
        boolean z2;
        if (bVar != null) {
            this.H = System.currentTimeMillis();
            long j2 = bVar.f22516a;
            if (j2 > 0) {
                if (!this.B) {
                    this.B = true;
                    try {
                        CookieSyncManager.getInstance().sync();
                    } catch (Throwable unused) {
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(bVar.f22521f.optString("new_platform"));
                if (this.C != j2) {
                    this.C = j2;
                    AppLog.setUserId(this.C);
                    z2 = true;
                }
                if (!StringUtils.equal(this.D, bVar.f22519d)) {
                    this.D = bVar.f22519d;
                    AppLog.setSessionKey(this.D);
                    z2 = true;
                }
                boolean z3 = false;
                for (com.ss.android.account.b.a aVar : this.E) {
                    aVar.f2418d = false;
                    com.ss.android.account.b.a aVar2 = bVar.b().get(aVar.f2416b);
                    if (aVar2 == null) {
                        aVar.a();
                    } else {
                        if (!aVar.f2418d) {
                            aVar.f2418d = true;
                            z3 = true;
                        }
                        aVar.i = aVar2.i;
                        aVar.j = aVar2.j;
                        aVar.f2419e = aVar2.f2419e;
                        aVar.f2420f = aVar2.f2420f;
                        aVar.g = aVar2.g;
                    }
                }
                if (z3) {
                    z2 = true;
                }
                this.B = true;
            } else if (this.B) {
                this.B = false;
                this.C = 0;
                this.D = "";
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                a(this.y);
                new com.bytedance.sdk.account.api.a(0);
                Iterator it2 = this.G.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }
    }

    public final void a(boolean z2) {
        this.B = false;
        this.C = 0;
        this.D = "";
        AppLog.setUserId(this.C);
        AppLog.setSessionKey(this.D);
        for (com.ss.android.account.b.a a2 : this.E) {
            a2.a();
        }
        a(this.y);
        this.z.sendMessage(this.z.obtainMessage(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, new com.ss.android.account.c.a()));
    }
}
