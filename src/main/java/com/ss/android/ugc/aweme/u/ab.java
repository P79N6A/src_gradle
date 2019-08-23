package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.e.a;
import com.ss.android.ugc.aweme.u.d;
import java.util.Map;

public final class ab extends k<ab> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75007a;
    private Aweme A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;

    /* renamed from: b  reason: collision with root package name */
    private String f75008b;

    /* renamed from: c  reason: collision with root package name */
    private String f75009c;

    /* renamed from: d  reason: collision with root package name */
    private String f75010d;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private int y;
    private boolean z;

    public ab() {
        super("post_comment");
        this.o = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75007a, false, 58930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75007a, false, 58930, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("group_id", this.f75008b, d.a.f75113b);
        a("author_id", this.f75009c, d.a.f75113b);
        if (!TextUtils.isEmpty(this.s)) {
            a("comment_category", this.s, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.f75010d)) {
            a("reply_to_comment_id", this.f75010d, d.a.f75113b);
        }
        if (!TextUtils.isEmpty(this.u)) {
            a(PushConstants.CONTENT, this.u, d.a.f75112a);
        }
        if (aa.d(this.g)) {
            d(aa.c(this.A));
        }
        a((Map<String, String>) a.b(this.A, this.x));
        if (com.ss.android.ugc.aweme.ae.d.a().a(this.f75008b)) {
            a("previous_page", "push", d.a.f75112a);
        } else {
            a("previous_page", this.E, d.a.f75112a);
        }
        f();
        if (this.y == 1) {
            a("is_long_item", this.y, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.t)) {
            a("emoji_times", this.t, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.C)) {
            a(this.C, this.D, d.a.f75112a);
        }
        a("is_retry", String.valueOf(this.z ? 1 : 0), d.a.f75112a);
        if (!TextUtils.isEmpty(this.B)) {
            a("playlist_type", this.B, d.a.f75112a);
        }
        b(AwemeAppData.p().ap);
        if (!TextUtils.isEmpty(this.v)) {
            a("enter_method", this.v, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.F)) {
            a("impr_type", this.F, d.a.f75112a);
        }
    }

    public final ab a(int i) {
        this.y = i;
        return this;
    }

    public final ab b(String str) {
        this.E = str;
        return this;
    }

    public final ab c(@NonNull String str) {
        this.u = str;
        return this;
    }

    public final ab e(@NonNull String str) {
        this.s = str;
        return this;
    }

    public final ab f(@NonNull String str) {
        this.t = str;
        return this;
    }

    public final ab g(@NonNull String str) {
        this.f75010d = str;
        return this;
    }

    public final ab h(String str) {
        this.x = str;
        return this;
    }

    public final ab i(String str) {
        this.B = str;
        return this;
    }

    public final ab k(String str) {
        this.C = str;
        return this;
    }

    public final ab l(String str) {
        this.D = str;
        return this;
    }

    public final ab m(String str) {
        this.v = str;
        return this;
    }

    public final ab a(@NonNull String str) {
        this.g = str;
        return this;
    }

    public final ab a(boolean z2) {
        this.z = z2;
        return this;
    }

    /* renamed from: e */
    public final ab f(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75007a, false, 58929, new Class[]{Aweme.class}, ab.class)) {
            return (ab) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75007a, false, 58929, new Class[]{Aweme.class}, ab.class);
        }
        super.f(aweme);
        if (aweme != null) {
            this.A = aweme;
            this.w = aweme.getAid();
            this.f75008b = aweme.getAid();
            this.f75009c = aweme.getAuthorUid();
            this.F = aa.s(aweme);
        }
        return this;
    }
}
