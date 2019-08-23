package com.ss.android.ugc.aweme.u;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.d;

public class ap extends k<ap> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75059a;

    /* renamed from: b  reason: collision with root package name */
    public String f75060b;

    /* renamed from: c  reason: collision with root package name */
    private String f75061c;

    /* renamed from: d  reason: collision with root package name */
    private String f75062d;
    private Aweme s;

    public ap() {
        super("tab_stay_time");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75059a, false, 58956, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75059a, false, 58956, new Class[0], Void.TYPE);
            return;
        }
        a("duration", this.f75061c, d.a.f75112a);
        a("enter_from", this.g, d.a.f75112a);
        a("group_id", aa.m(this.s), d.a.f75112a);
        a("author_id", aa.a(this.s), d.a.f75112a);
        a("city_info", aa.a(), d.a.f75112a);
        a("enter_method", this.f75060b, d.a.f75112a);
        if (!TextUtils.isEmpty(this.f75062d)) {
            a("page_type", this.f75062d, d.a.f75112a);
        }
    }

    public final ap a(String str) {
        this.f75061c = str;
        return this;
    }

    public final ap b(String str) {
        this.g = str;
        return this;
    }

    public final ap c(String str) {
        this.f75062d = str;
        return this;
    }

    public final /* synthetic */ k f(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75059a, false, 58955, new Class[]{Aweme.class}, ap.class)) {
            return (ap) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75059a, false, 58955, new Class[]{Aweme.class}, ap.class);
        }
        super.f(aweme);
        this.s = aweme;
        return this;
    }
}
