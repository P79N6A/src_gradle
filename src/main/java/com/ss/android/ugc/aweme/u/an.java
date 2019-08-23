package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.d;

public final class an extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75045a;

    /* renamed from: b  reason: collision with root package name */
    private String f75046b;

    /* renamed from: c  reason: collision with root package name */
    private String f75047c;

    /* renamed from: d  reason: collision with root package name */
    private Long f75048d;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;

    public an() {
        super("client_show");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75045a, false, 58949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75045a, false, 58949, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("enter_from", this.g, d.a.f75112a);
        a("group_id", this.f75046b, d.a.f75113b);
        a("author_id", this.f75047c, d.a.f75113b);
        a("request_id", this.t, d.a.f75113b);
        a(PushConstants.CONTENT, this.r, d.a.f75112a);
        if ("prop_page".equals(this.g)) {
            a("prop_id", this.p, d.a.f75113b);
            a("log_pb", ai.a().a(this.t), d.a.f75113b);
        } else {
            a("music_id", String.valueOf(this.f75048d), d.a.f75113b);
            if ("homepage_fresh".equals(this.g) || "categorized_city_poi".equalsIgnoreCase(this.g)) {
                d(this.t);
            }
        }
        a("display", this.s, d.a.f75112a);
        if (!TextUtils.isEmpty(this.u)) {
            a("distance_km", this.u, d.a.f75112a);
        }
    }

    public final an a(@NonNull String str) {
        this.g = str;
        return this;
    }

    public final an b(@NonNull String str) {
        this.p = str;
        return this;
    }

    public final an c(@NonNull String str) {
        this.s = str;
        return this;
    }

    public final an b(@Nullable Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f75045a, false, 58948, new Class[]{Aweme.class, Integer.TYPE}, an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f75045a, false, 58948, new Class[]{Aweme.class, Integer.TYPE}, an.class);
        }
        a(aweme);
        if (aweme != null) {
            this.f75046b = aweme.getAid();
            this.f75047c = b(aweme);
            this.t = a(aweme, i);
            this.r = c(aweme);
            this.f75048d = d(aweme);
            this.q = aweme.getAid();
            this.u = aa.a(aweme.getDistance());
        }
        return this;
    }
}
