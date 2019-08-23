package com.ss.android.ugc.aweme.freeflowcard;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.utils.s;
import com.ss.android.ugc.aweme.freeflowcard.a.d;
import com.ss.android.ugc.aweme.freeflowcard.a.g;
import com.ss.android.ugc.aweme.music.util.f;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48576a = null;
    private static final String o = "b";
    private static b p;

    /* renamed from: b  reason: collision with root package name */
    public String f48577b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f48578c = "https://aweme.snssdk.com/falcon/douyin_falcon/douyinCard/enter/?hide_nav_bar=1";

    /* renamed from: d  reason: collision with root package name */
    public String f48579d;

    /* renamed from: e  reason: collision with root package name */
    public String f48580e;

    /* renamed from: f  reason: collision with root package name */
    public String f48581f;
    public String g;
    public int h = -1;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n = true;

    private static String e() {
        return "B";
    }

    public final String c() {
        if (this.l) {
            return this.f48577b;
        }
        return "https://aweme.snssdk.com/falcon/douyin_falcon/douyinCard/enter/?media_source=2&ct=0&cmpid=jt-dycard-2&shopid=lmk.cps.jtdycard2";
    }

    private b() {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f48576a, false, 46018, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48576a, false, 46018, new Class[0], Void.TYPE);
            return;
        }
        g.a().d();
        d.a().d();
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f48576a, true, 46016, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f48576a, true, 46016, new Class[0], b.class);
        }
        if (p == null) {
            synchronized (b.class) {
                if (p == null) {
                    p = new b();
                }
            }
        }
        return p;
    }

    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f48576a, false, 46021, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f48576a, false, 46021, new Class[0], String.class);
        }
        String str = s.b(k.a());
        this.f48578c = (String) SharePrefCache.inst().getDouyinCardScheme().c();
        return f.a(this.f48578c).a("oid", str).a().toString();
    }

    private String a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f48576a, false, 46029, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, this, f48576a, false, 46029, new Class[]{Context.class}, String.class);
        }
        switch (s.b(context)) {
            case 0:
                return "NONE";
            case 1:
                return "telecom";
            case 2:
                return "unicom";
            case 3:
                return "mobile";
            default:
                return "NONE";
        }
    }

    public final com.ss.android.ugc.aweme.app.d.d a(com.ss.android.ugc.aweme.app.d.d dVar, Context context) {
        com.ss.android.ugc.aweme.app.d.d dVar2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{dVar, context2}, this, f48576a, false, 46027, new Class[]{com.ss.android.ugc.aweme.app.d.d.class, Context.class}, com.ss.android.ugc.aweme.app.d.d.class)) {
            return (com.ss.android.ugc.aweme.app.d.d) PatchProxy.accessDispatch(new Object[]{dVar, context2}, this, f48576a, false, 46027, new Class[]{com.ss.android.ugc.aweme.app.d.d.class, Context.class}, com.ss.android.ugc.aweme.app.d.d.class);
        }
        if (dVar == null) {
            dVar2 = new com.ss.android.ugc.aweme.app.d.d();
        } else {
            dVar2 = dVar;
        }
        dVar2.a("page_style", e()).a(PushConstants.WEB_URL, c()).a("telecom_carrier", a(context2));
        return dVar2;
    }
}
