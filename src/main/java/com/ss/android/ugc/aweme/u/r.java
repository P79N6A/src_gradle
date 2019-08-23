package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.e.a;
import com.ss.android.ugc.aweme.u.d;
import java.util.Map;

public class r extends a<r> {
    public static ChangeQuickRedirect s;
    private String A;
    private String B;
    private Aweme C;
    private String D;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    private String y;
    private String z;

    public r() {
        super("enter_tag_detail");
        this.o = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 58875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 58875, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("group_id", this.t, d.a.f75113b);
        a("author_id", this.u, d.a.f75113b);
        a("tag_id", this.y, d.a.f75113b);
        a("request_id", this.z, d.a.f75112a);
        if (!StringUtils.isEmpty(this.A)) {
            a("content_type", this.A, d.a.f75112a);
        }
        a((Map<String, String>) a.b(this.C, this.B));
        if (com.ss.android.ugc.aweme.ae.d.a().a(this.t)) {
            a("previous_page", "push", d.a.f75112a);
        }
        f();
        if (aa.d(this.g)) {
            d(this.z);
        }
        b(AwemeAppData.p().ap);
        if (!TextUtils.isEmpty(this.w)) {
            a(this.w, this.x, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.v)) {
            a("playlist_type", this.v, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.D)) {
            a("impr_type", this.D, d.a.f75112a);
        }
    }

    public final r b(@NonNull String str) {
        this.g = str;
        return this;
    }

    public final r c(String str) {
        this.B = str;
        return this;
    }

    public final r e(String str) {
        this.y = str;
        return this;
    }

    public final r f(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, s, false, 58873, new Class[]{String.class}, r.class)) {
            return (r) PatchProxy.accessDispatch(new Object[]{str}, this, s, false, 58873, new Class[]{String.class}, r.class);
        }
        if (!StringUtils.isEmpty(str)) {
            this.z = str;
        }
        return this;
    }

    /* renamed from: e */
    public final r f(Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, s, false, 58874, new Class[]{Aweme.class}, r.class)) {
            return (r) PatchProxy.accessDispatch(new Object[]{aweme}, this, s, false, 58874, new Class[]{Aweme.class}, r.class);
        }
        super.f(aweme);
        if (aweme != null) {
            this.C = aweme;
            this.t = aweme.getAid();
            if (TextUtils.isEmpty(this.z)) {
                this.z = aweme.getRequestId();
            }
            if (aweme.getAuthor() != null) {
                str = aweme.getAuthor().getUid();
            } else {
                str = "";
            }
            this.u = str;
            this.A = aa.o(aweme);
            this.D = aa.s(aweme);
        }
        return this;
    }
}
