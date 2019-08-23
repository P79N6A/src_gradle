package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.e.a;
import com.ss.android.ugc.aweme.u.d;
import java.util.Map;

public final class i extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75127a;

    /* renamed from: b  reason: collision with root package name */
    public String f75128b;

    /* renamed from: c  reason: collision with root package name */
    private String f75129c;

    /* renamed from: d  reason: collision with root package name */
    private String f75130d;
    private String p;
    private String q;
    private String r;
    private String s;
    private Aweme t;

    public i() {
        super("poi_click");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75127a, false, 58852, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75127a, false, 58852, new Class[0], Void.TYPE);
            return;
        }
        a("enter_from", this.f75129c, d.a.f75112a);
        a("group_id", this.r, d.a.f75112a);
        a("content_type", this.p, d.a.f75112a);
        a("poi_id", this.q, d.a.f75112a);
        a("poi_type", this.s, d.a.f75112a);
        a("request_id", this.f75130d, d.a.f75112a);
        a((Map<String, String>) a.b(this.t, this.f75128b));
    }

    public final i a(@NonNull String str) {
        this.f75129c = str;
        return this;
    }

    public final i b(String str) {
        this.f75130d = str;
        return this;
    }

    public final i c(String str) {
        this.q = str;
        return this;
    }

    public final i e(String str) {
        this.s = str;
        return this;
    }

    public final i e(@Nullable Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75127a, false, 58851, new Class[]{Aweme.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75127a, false, 58851, new Class[]{Aweme.class}, i.class);
        }
        if (aweme != null) {
            this.t = aweme;
            this.r = aweme.getAid();
            if (aweme.isImage()) {
                str = "photo";
            } else {
                str = "video";
            }
            this.p = str;
        }
        return this;
    }
}
