package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class d {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f75108e;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f75109a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f75110b = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    protected final String f75111f;
    protected String g;
    protected String h;
    protected String i;
    protected String j;
    protected String k;
    protected String l;
    protected String m;
    protected String n;
    public boolean o = false;

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75112a = new a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f75114c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f75114c, false, 58839, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f75114c, false, 58839, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public static final a f75113b = new a() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f75115c;

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f75115c, false, 58840, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f75115c, false, 58840, new Class[]{String.class}, String.class);
                } else if (TextUtils.isEmpty(str) || "null".equals(str2) || PushConstants.PUSH_TYPE_NOTIFY.equals(str2)) {
                    return "";
                } else {
                    return str2;
                }
            }
        };

        String a(String str);
    }

    public abstract void a();

    public void b() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        try {
            if (this.o) {
                AppLogNewUtils.onEventV3(this.f75111f, aa.a(this.f75109a));
                return;
            }
            q.a(this.f75111f, this.f75109a);
        } catch (Throwable unused) {
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f75108e, false, 58831, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75108e, false, 58831, new Class[0], Void.TYPE);
            return;
        }
        b();
        a();
        this.f75109a.putAll(this.f75110b);
        com.ss.android.b.a.a.a.a(new e(this));
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f75108e, false, 58835, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75108e, false, 58835, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.b()) {
            this.f75109a.put("_staging_flag", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        }
    }

    public final void c() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f75108e, false, 58824, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75108e, false, 58824, new Class[0], Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.i)) {
            a("poi_id", this.i, a.f75113b);
            a("poi_backend_type", this.m, a.f75112a);
            if (!TextUtils.isEmpty(this.n)) {
                a("poi_city", this.n, a.f75112a);
                if (this.n.equalsIgnoreCase(c.d())) {
                    str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str = PushConstants.PUSH_TYPE_NOTIFY;
                }
                a("poi_device_samecity", str, a.f75112a);
            }
        }
        if (aa.c(this.g)) {
            d();
        }
    }

    public final void d() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f75108e, false, 58825, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75108e, false, 58825, new Class[0], Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.h)) {
            a("city_info", this.h, a.f75112a);
        }
        if (!TextUtils.isEmpty(this.l)) {
            a("distance_info", this.l, a.f75112a);
        }
        if (!TextUtils.isEmpty(this.n)) {
            a("poi_city", this.n, a.f75112a);
            if (this.n.equalsIgnoreCase(c.d())) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            a("poi_device_samecity", str, a.f75112a);
        }
        a("poi_type", this.j, a.f75112a);
        a("poi_channel", this.k, a.f75112a);
    }

    public d(String str) {
        this.f75111f = str;
    }

    public final d a(Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, f75108e, false, 58833, new Class[]{Map.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{map}, this, f75108e, false, 58833, new Class[]{Map.class}, d.class);
        }
        this.f75110b.putAll(map);
        return this;
    }

    static String b(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75108e, true, 58826, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75108e, true, 58826, new Class[]{Aweme.class}, String.class);
        } else if (aweme.getAuthor() != null) {
            return aweme.getAuthor().getUid();
        } else {
            return "";
        }
    }

    static String c(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75108e, true, 58829, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75108e, true, 58829, new Class[]{Aweme.class}, String.class);
        }
        int awemeType = aweme.getAwemeType();
        if (awemeType == 2) {
            return "photo";
        }
        if (awemeType != 101) {
            return "video";
        }
        return "live";
    }

    static Long d(Aweme aweme) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75108e, true, 58830, new Class[]{Aweme.class}, Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75108e, true, 58830, new Class[]{Aweme.class}, Long.class);
        }
        if (aweme.getMusic() == null) {
            j2 = 0;
        } else {
            j2 = aweme.getMusic().getId();
        }
        return Long.valueOf(j2);
    }

    public final void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75108e, false, 58823, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f75108e, false, 58823, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme != null) {
            this.l = aa.b(aweme.getDistance());
            this.h = aa.a();
            if (aweme.getPoiStruct() != null) {
                this.i = aweme.getPoiStruct().poiId;
                this.j = aa.h(aweme);
                this.k = aa.b();
                this.m = aa.f(aweme);
                this.n = aweme.getPoiStruct().getCityCode();
            }
        }
    }

    public final void b(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f75108e, false, 58837, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f75108e, false, 58837, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            str = "auto";
        } else {
            str = "normal";
        }
        a("play_mode", str, a.f75112a);
    }

    public final void d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f75108e, false, 58836, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f75108e, false, 58836, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a("log_pb", ai.a().a(str2), a.f75112a);
    }

    static String a(Aweme aweme, int i2) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i2)}, null, f75108e, true, 58827, new Class[]{Aweme.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i2)}, null, f75108e, true, 58827, new Class[]{Aweme.class, Integer.TYPE}, String.class);
        }
        JSONObject b2 = com.ss.android.ugc.aweme.feed.a.a().b(aweme2, i2);
        if (b2 != null) {
            return b2.optString("request_id");
        }
        return "";
    }

    public final void a(String str, String str2, a aVar) {
        String str3 = str;
        String str4 = str2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, aVar2}, this, f75108e, false, 58832, new Class[]{String.class, String.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, aVar2}, this, f75108e, false, 58832, new Class[]{String.class, String.class, a.class}, Void.TYPE);
            return;
        }
        this.f75109a.put(str3, aVar2.a(str4));
    }
}
