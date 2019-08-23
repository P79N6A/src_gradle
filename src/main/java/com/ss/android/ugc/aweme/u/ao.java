package com.ss.android.ugc.aweme.u;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.u.d;

public class ao extends k<ao> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75049a;

    /* renamed from: b  reason: collision with root package name */
    private String f75050b;

    /* renamed from: c  reason: collision with root package name */
    private String f75051c;

    /* renamed from: d  reason: collision with root package name */
    private Aweme f75052d;
    private String s;
    private String t;
    private String u;
    private String v;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f75053a;

        /* renamed from: b  reason: collision with root package name */
        public String f75054b;

        /* renamed from: c  reason: collision with root package name */
        public String f75055c;

        /* renamed from: d  reason: collision with root package name */
        public String f75056d;

        /* renamed from: e  reason: collision with root package name */
        public String f75057e;

        /* renamed from: f  reason: collision with root package name */
        public String f75058f;

        public a(String str, String str2, String str3, String str4) {
            this.f75053a = str;
            this.f75054b = str2;
            this.f75055c = str3;
            this.f75056d = str4;
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f75053a = str;
            this.f75054b = str2;
            this.f75055c = str3;
            this.f75056d = str4;
            this.f75057e = str6;
            this.f75058f = str5;
        }
    }

    public ao() {
        super("stay_time");
        this.o = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75049a, false, 58954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75049a, false, 58954, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("duration", this.f75050b, d.a.f75112a);
        a("enter_from", this.g, d.a.f75112a);
        a("group_id", this.s, d.a.f75112a);
        a("author_id", aa.a(this.f75052d), d.a.f75112a);
        a("city_info", aa.a(), d.a.f75112a);
        a("page_uid", this.v, d.a.f75112a);
        if (!TextUtils.isEmpty(this.u)) {
            a("previous_page", this.u, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.f75051c)) {
            a("page_type", this.f75051c, d.a.f75112a);
        }
        if (TextUtils.equals(this.u, "homepage_hot") || TextUtils.equals(this.u, "homepage_follow")) {
            a("feeds_group_id", this.t, d.a.f75112a);
            a("log_pb", ai.a().a(aa.a(this.t, TextUtils.equals(this.u, "homepage_hot") ^ true ? 1 : 0)), d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.i)) {
            a("poi_id", this.i, d.a.f75112a);
            if (!TextUtils.isEmpty(this.j)) {
                a("poi_type", this.j, d.a.f75112a);
            }
        }
    }

    public ao(String str) {
        super(str);
    }

    public final ao a(String str) {
        this.f75050b = str;
        return this;
    }

    public final ao b(String str) {
        this.g = str;
        return this;
    }

    public final ao c(String str) {
        this.u = str;
        return this;
    }

    public final ao e(String str) {
        this.f75051c = str;
        return this;
    }

    public final ao f(String str) {
        this.i = str;
        return this;
    }

    public final ao g(String str) {
        this.j = str;
        return this;
    }

    public final ao h(String str) {
        this.s = str;
        return this;
    }

    public final ao i(String str) {
        this.t = str;
        return this;
    }

    public final ao k(String str) {
        this.v = str;
        return this;
    }

    public final ao a(a aVar) {
        this.i = aVar.f75053a;
        this.j = aVar.f75054b;
        this.f75051c = aVar.f75055c;
        this.s = aVar.f75056d;
        this.m = aVar.f75058f;
        this.n = aVar.f75057e;
        return this;
    }

    public final ao a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f75049a, false, 58953, new Class[]{c.class}, ao.class)) {
            return (ao) PatchProxy.accessDispatch(new Object[]{cVar}, this, f75049a, false, 58953, new Class[]{c.class}, ao.class);
        }
        if (cVar != null) {
            this.i = cVar.getPoiId();
            this.j = cVar.getPoiType();
            this.m = cVar.getBackendType();
            this.n = cVar.getPoiCity();
        }
        return this;
    }

    /* renamed from: e */
    public final ao f(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75049a, false, 58951, new Class[]{Aweme.class}, ao.class)) {
            return (ao) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75049a, false, 58951, new Class[]{Aweme.class}, ao.class);
        }
        super.f(aweme);
        this.f75052d = aweme;
        this.s = aa.m(aweme);
        return this;
    }

    public final ao a(PoiStruct poiStruct) {
        if (PatchProxy.isSupport(new Object[]{poiStruct}, this, f75049a, false, 58952, new Class[]{PoiStruct.class}, ao.class)) {
            return (ao) PatchProxy.accessDispatch(new Object[]{poiStruct}, this, f75049a, false, 58952, new Class[]{PoiStruct.class}, ao.class);
        }
        if (poiStruct != null) {
            this.i = poiStruct.getPoiId();
            this.j = poiStruct.getTypeCode();
            this.m = poiStruct.getBackendTypeCode();
            this.n = poiStruct.getCityCode();
            this.k = aa.b();
        }
        return this;
    }
}
