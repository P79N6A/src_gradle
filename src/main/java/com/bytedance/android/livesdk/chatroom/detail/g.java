package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.model.a.p;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.c;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.j.h;
import com.bytedance.android.livesdk.utils.n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.disposables.Disposable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {
    private static boolean H;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9939a;
    public String A;
    public DataCenter B;
    public Disposable C;
    public boolean D;
    public Disposable E;
    public long F = -1;
    public String G;
    private final Bundle I;
    private boolean J = false;
    private boolean K = false;
    private boolean L = false;
    private boolean M;
    private long N;
    private String O;
    private long P;
    private long Q;
    private String R;
    private int S;
    private long T;
    private boolean U = false;
    private boolean V = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9940b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9941c = true;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f9942d = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9945a;

        public final void run() {
            long j;
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f9945a, false, 4099, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f9945a, false, 4099, new Class[0], Void.TYPE);
                return;
            }
            if (g.this.f9940b) {
                j = 60000 - (((SystemClock.elapsedRealtime() - g.this.o) - g.this.s) % 60000);
                g.this.f9940b = false;
            } else {
                j = 60000;
            }
            g.this.f9943e.postDelayed(this, j);
            if (g.this.f9941c || j != 60000) {
                g.this.f9941c = false;
                return;
            }
            HashMap hashMap = new HashMap();
            if (g.this.z) {
                str = "thirdparty";
            } else {
                str = "general";
            }
            hashMap.put("streaming_type", str);
            hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            a.a().a("watch_onemin", hashMap, new j().b("live_view").a("live_detail").g(g.this.t), Room.class);
        }
    };

    /* renamed from: e  reason: collision with root package name */
    public final Handler f9943e;

    /* renamed from: f  reason: collision with root package name */
    public final WeakReference<Context> f9944f;
    public final String g;
    public final String h;
    public final long i;
    public final String j;
    public final String k;
    public long l = 0;
    public boolean m = false;
    public boolean n = false;
    public long o = -1;
    public com.bytedance.android.livesdk.live.b.a p = null;
    public long q = -1;
    public long r = -1;
    public long s = 0;
    public String t = "click";
    public String u = "other";
    public String v;
    public String w;
    public String x;
    public String y;
    public boolean z;

    public final void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f9939a, false, 4087, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f9939a, false, 4087, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            this.U = z2;
        }
        if (z3) {
            this.V = z3;
        }
        if (this.V && this.U) {
            if (PatchProxy.isSupport(new Object[0], this, f9939a, false, 4088, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f9939a, false, 4088, new Class[0], Void.TYPE);
            } else if (!this.K) {
                this.K = true;
                HashMap hashMap = new HashMap();
                hashMap.put("streaming_type", this.z ? "thirdparty" : "general");
                if (this.I != null) {
                    Bundle bundle = (Bundle) this.I.get("live.intent.extra.ENTER_LIVE_EXTRA_V1");
                    if (bundle != null && bundle.containsKey("subtab")) {
                        hashMap.put("subtab", (String) bundle.get("subtab"));
                    }
                }
                if (!StringUtils.isEmpty(this.G) && "draw".equals(this.t)) {
                    hashMap.put("scene_id", this.G);
                }
                hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                a.a().a("live_play", hashMap, new j().b("live_view").f("core").a("live_detail").c("live"), Room.class, LinkCrossRoomDataHolder.a().b());
            }
        }
    }

    public final long b() {
        if (!PatchProxy.isSupport(new Object[0], this, f9939a, false, 4080, new Class[0], Long.TYPE)) {
            return (SystemClock.elapsedRealtime() - this.o) - this.s;
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f9939a, false, 4080, new Class[0], Long.TYPE)).longValue();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f9939a, false, 4093, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9939a, false, 4093, new Class[0], Void.TYPE);
            return;
        }
        this.T = SystemClock.elapsedRealtime();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9939a, false, 4074, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9939a, false, 4074, new Class[0], Void.TYPE);
            return;
        }
        this.m = false;
        this.n = false;
        this.J = false;
        this.L = false;
        this.M = false;
        this.o = -1;
        this.M = false;
        this.p = null;
        this.q = -1;
        this.r = -1;
        this.s = 0;
        this.t = null;
        this.u = null;
        this.v = null;
        this.y = null;
        this.O = null;
        this.P = 0;
        this.Q = 0;
        this.R = null;
        this.S = 0;
        this.V = false;
        this.U = false;
        this.K = false;
        this.B = null;
        this.f9943e.removeCallbacksAndMessages(null);
    }

    public final void d() {
        String str;
        long j2;
        if (PatchProxy.isSupport(new Object[0], this, f9939a, false, 4083, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9939a, false, 4083, new Class[0], Void.TYPE);
        } else if (!this.L) {
            this.L = true;
            if (this.p == null) {
                str = "other";
            } else {
                str = this.p.f15799b;
            }
            if (this.m) {
                j2 = this.q;
            } else if (this.p != null) {
                j2 = this.p.a();
            } else {
                j2 = SystemClock.elapsedRealtime() - this.o;
            }
            h hVar = new h();
            if (j2 <= 0) {
                j2 = 0;
            }
            hVar.a("wait_duration", (Object) Long.valueOf(j2)).a("enter_room_type", (Object) str).a("hotsoon_live_enter_wait_patience", true ^ this.m ? 1 : 0);
        }
    }

    public final void e() {
        Context context;
        if (PatchProxy.isSupport(new Object[0], this, f9939a, false, 4085, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9939a, false, 4085, new Class[0], Void.TYPE);
            return;
        }
        if (!com.bytedance.android.livesdkapi.a.a.f18616d) {
            if (this.f9944f == null || this.f9944f.get() == null) {
                context = null;
            } else {
                context = (Context) this.f9944f.get();
            }
            f.a(context).a("live_play", "exit", this.l, 0);
        }
        a(this.B);
    }

    public final void f() {
        Context context;
        if (PatchProxy.isSupport(new Object[0], this, f9939a, false, 4089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9939a, false, 4089, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9944f == null || this.f9944f.get() == null) {
            context = null;
        } else {
            context = (Context) this.f9944f.get();
        }
        f.a(context).a("audience_close_live", "live", this.l, this.i, a("request_id", this.g, "log_pb", this.h, "log_pb", this.h));
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f9939a, false, 4090, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9939a, false, 4090, new Class[0], Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        a.a().a("follow", hashMap, new c("live_exit_popup", this.N), new j().b("live_interact").a("live_detail"), Room.class);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f9939a, false, 4098, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9939a, false, 4098, new Class[0], Void.TYPE);
            return;
        }
        if (com.bytedance.android.live.uikit.a.a.f() && this.B != null) {
            Room room = (Room) this.B.get("data_room");
            if (room != null && room.hasCommerceGoods) {
                String str = "";
                if (!StringUtils.isEmpty(this.w)) {
                    int indexOf = this.w.indexOf("_WITHIN_");
                    if (indexOf >= 0) {
                        str = this.w.substring(indexOf);
                    }
                }
                a.a().a("livesdk_video_play_live_sale", "enter_from", this.v, "category_name", str, "cell_type", this.x, "group_id", String.valueOf(this.B.get("data_room_id", 0L)), "orientation", String.valueOf(room.getOrientation()));
            }
        }
    }

    public final void c() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f9939a, false, 4081, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9939a, false, 4081, new Class[0], Void.TYPE);
        } else if (this.o != -1 && !this.M) {
            long elapsedRealtime = (SystemClock.elapsedRealtime() - this.o) - this.s;
            if (this.I != null) {
                this.I.getString("source");
            }
            HashMap hashMap = new HashMap();
            if (this.z) {
                str = "thirdparty";
            } else {
                str = "general";
            }
            hashMap.put("streaming_type", str);
            a.a().a("live_duration", hashMap, new j().b("live_view").a("live_detail").d(""), new com.bytedance.android.livesdk.j.c.h(elapsedRealtime), Room.class);
            if (com.bytedance.android.live.uikit.a.a.d() && this.f9944f != null) {
                Context context = (Context) this.f9944f.get();
                long j2 = this.l;
                if (PatchProxy.isSupport(new Object[]{context, new Long(j2), new Long(elapsedRealtime)}, null, com.bytedance.android.livesdk.r.a.f16870a, true, 12848, new Class[]{Context.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, new Long(j2), new Long(elapsedRealtime)}, null, com.bytedance.android.livesdk.r.a.f16870a, true, 12848, new Class[]{Context.class, Long.TYPE, Long.TYPE}, Void.TYPE);
                } else if (context != null && elapsedRealtime > 0) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("stay_time", elapsedRealtime);
                    } catch (Exception unused) {
                    }
                    com.bytedance.android.livesdk.r.a.a(context, j2, "exit", jSONObject);
                }
            }
            this.M = true;
            if (this.F != -1) {
                Map<String, String> c2 = c(this.B);
                if (c2 != null) {
                    if (this.E != null && !this.E.isDisposed()) {
                        this.E.dispose();
                    }
                    c2.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.F));
                    c2.put("trigger", "close");
                    a.a().a("livesdk_video_over", c2, new j().g(this.t), Room.class);
                    this.F = -1;
                }
            }
        }
    }

    private static JSONObject a(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, null, f9939a, true, 4086, new Class[]{Object[].class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{objArr}, null, f9939a, true, 4086, new Class[]{Object[].class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        int i2 = 0;
        while (i2 < 6) {
            try {
                if (objArr[i2] instanceof String) {
                    int i3 = i2 + 1;
                    if (i3 < 6) {
                        jSONObject.put(objArr[i2], objArr[i3]);
                    } else if (H) {
                        throw new IllegalArgumentException(n.a(Locale.ENGLISH, "no value found for key at %d", Integer.valueOf(i2)));
                    }
                } else if (H) {
                    throw new IllegalArgumentException(n.a(Locale.ENGLISH, "key at %d is not a string", Integer.valueOf(i2)));
                }
                i2 += 2;
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final void b(DataCenter dataCenter) {
        String str;
        if (PatchProxy.isSupport(new Object[]{dataCenter}, this, f9939a, false, 4095, new Class[]{DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter}, this, f9939a, false, 4095, new Class[]{DataCenter.class}, Void.TYPE);
        } else if (com.bytedance.android.live.uikit.a.a.f() && dataCenter != null && dataCenter.get("data_room") != null && !this.D) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.o;
            Map<String, String> c2 = c(dataCenter);
            if (c2 != null) {
                if (elapsedRealtime <= 30000) {
                    str = String.valueOf(elapsedRealtime);
                } else {
                    str = "30000";
                }
                c2.put("duration", str);
                a.a().a("livesdk_video_play_auto_live", c2, new j().g(this.t), Room.class);
                if (this.C != null && !this.C.isDisposed()) {
                    this.C.dispose();
                }
            }
        }
    }

    public final Map<String, String> c(DataCenter dataCenter) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{dataCenter}, this, f9939a, false, 4097, new Class[]{DataCenter.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{dataCenter}, this, f9939a, false, 4097, new Class[]{DataCenter.class}, Map.class);
        }
        HashMap hashMap = new HashMap();
        if (this.I != null) {
            hashMap.put("starlight_rank", this.I.getString("starlight_rank", ""));
        }
        String str3 = "";
        if (a.a().a(j.class).a().containsKey("video_id")) {
            str3 = a.a().a(j.class).a().get("video_id");
        }
        hashMap.put("video_id", str3);
        if (dataCenter != null) {
            if (StringUtils.isEmpty((String) dataCenter.get("data_xt_media_replay", ""))) {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            } else {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            }
            hashMap.put("is_live_recall", str);
            Room room = (Room) dataCenter.get("data_room");
            if (room != null) {
                if (room.hasCommerceGoods) {
                    str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str2 = PushConstants.PUSH_TYPE_NOTIFY;
                }
                hashMap.put("is_sale", str2);
                hashMap.put("orientation", String.valueOf(room.getOrientation()));
            }
        }
        return hashMap;
    }

    public final void a(DataCenter dataCenter) {
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{dataCenter2}, this, f9939a, false, 4094, new Class[]{DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter2}, this, f9939a, false, 4094, new Class[]{DataCenter.class}, Void.TYPE);
        } else if (!com.bytedance.android.live.uikit.a.a.f() || dataCenter2 == null || dataCenter2.get("data_room") == null) {
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.T;
            Map<String, String> c2 = c(dataCenter);
            if (c2 != null) {
                c2.put("duration", String.valueOf(elapsedRealtime));
                a.a().a("livesdk_stay_page", c2, new j(), Room.class);
            }
        }
    }

    public final void a(boolean z2, int i2, String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2), str3}, this, f9939a, false, 4079, new Class[]{Boolean.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i2), str3}, this, f9939a, false, 4079, new Class[]{Boolean.TYPE, Integer.TYPE, String.class}, Void.TYPE);
        } else if (!this.J) {
            this.J = true;
            if (this.p == null) {
                str2 = "other";
            } else {
                str2 = this.p.f15799b;
            }
            long j2 = 0;
            if (z2 && this.q > 0) {
                j2 = this.q;
            }
            new h().a("error_code", (Object) Integer.valueOf(i2)).a("error_desc", (Object) str3).a("duration", (Object) Long.valueOf(j2)).a("enter_room_type", (Object) str2).a("hotsoon_live_audience_enter_room", z2 ^ true ? 1 : 0);
        }
    }

    public final void a(long j2, boolean z2, boolean z3, long j3, String str) {
        String str2;
        long j4 = j2;
        long j5 = j3;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), new Long(j5), str3}, this, f9939a, false, 4072, new Class[]{Long.TYPE, Boolean.TYPE, Boolean.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), Byte.valueOf(z2), Byte.valueOf(z3), new Long(j5), str3}, this, f9939a, false, 4072, new Class[]{Long.TYPE, Boolean.TYPE, Boolean.TYPE, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.l = j4;
        if (z2) {
            str2 = "voice_live";
        } else {
            str2 = "video_live";
        }
        this.y = str2;
        this.z = z3;
        this.N = j5;
        this.O = str3;
        if (!StringUtils.isEmpty(str)) {
            p pVar = (p) com.bytedance.android.live.a.a().fromJson(str3, p.class);
            if (pVar != null) {
                this.P = pVar.f11070a;
                if (!(pVar.f11072c == null || pVar.f11072c.f11029b == 0)) {
                    this.Q = pVar.f11072c.f11032e;
                    this.R = pVar.f11072c.f11030c;
                    this.S = pVar.f11072c.f11029b;
                }
            }
        }
    }

    public g(Context context, String str, String str2, long j2, String str3, String str4, Bundle bundle, String str5, String str6, String str7) {
        H = TextUtils.equals(TTLiveSDKContext.getHostService().a().c(), "local_test");
        this.f9943e = new Handler(Looper.getMainLooper());
        Context context2 = context;
        this.f9944f = new WeakReference<>(context);
        this.g = str;
        this.h = str2;
        this.i = j2;
        this.j = str3;
        this.v = str4;
        this.I = bundle;
        this.k = str5;
        this.w = str6;
        this.x = str7;
    }
}
