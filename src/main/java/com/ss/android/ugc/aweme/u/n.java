package com.ss.android.ugc.aweme.u;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.e.a;
import com.ss.android.ugc.aweme.u.d;
import java.util.Map;

public class n extends a<n> {
    public static ChangeQuickRedirect s;
    private String A;
    private Aweme B;
    private String C;
    public String t;
    public String u;
    public String v;
    private String w;
    private String x;
    private String y;
    private String z;

    public n() {
        super("enter_music_detail");
        this.o = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 58866, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 58866, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("group_id", this.w, d.a.f75113b);
        a("music_id", this.y, d.a.f75113b);
        a("author_id", this.x, d.a.f75113b);
        a("request_id", this.z, d.a.f75113b);
        a((Map<String, String>) a.b(this.B, this.A));
        if (com.ss.android.ugc.aweme.ae.d.a().a(this.w)) {
            a("previous_page", "push", d.a.f75112a);
        }
        f();
        if (aa.d(this.g)) {
            d(this.z);
        }
        b(AwemeAppData.p().ap);
        if (!TextUtils.isEmpty(this.u)) {
            a(this.u, this.v, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.t)) {
            a("playlist_type", this.t, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.C)) {
            a("impr_type", this.C, d.a.f75112a);
        }
    }

    public final n b(String str) {
        this.g = str;
        return this;
    }

    public final n c(String str) {
        this.w = str;
        return this;
    }

    public final n e(String str) {
        this.x = str;
        return this;
    }

    public final n f(String str) {
        this.y = str;
        return this;
    }

    public final n g(String str) {
        this.z = str;
        return this;
    }

    /* renamed from: e */
    public final n f(Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, s, false, 58865, new Class[]{Aweme.class}, n.class)) {
            return (n) PatchProxy.accessDispatch(new Object[]{aweme}, this, s, false, 58865, new Class[]{Aweme.class}, n.class);
        }
        super.f(aweme);
        if (aweme != null) {
            this.B = aweme;
            this.z = aa.c(aweme);
            this.w = aweme.getAid();
            this.x = aweme.getAuthorUid();
            if (aweme.getMusic() == null) {
                str = "";
            } else {
                str = String.valueOf(aweme.getMusic().getId());
            }
            this.y = str;
            this.C = aa.s(aweme);
        }
        return this;
    }
}
