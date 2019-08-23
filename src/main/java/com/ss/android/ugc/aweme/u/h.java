package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.e.a;
import com.ss.android.ugc.aweme.u.d;
import java.util.Map;

public class h extends k<h> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75123a;
    private String A;
    private String B;

    /* renamed from: b  reason: collision with root package name */
    public String f75124b;

    /* renamed from: c  reason: collision with root package name */
    public int f75125c;

    /* renamed from: d  reason: collision with root package name */
    public String f75126d;
    private String s;
    private String t;
    private String u;
    private Aweme v;
    private int w;
    private String x;
    private String y;
    private String z;

    public h() {
        super("click_more_button");
        this.o = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75123a, false, 58850, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75123a, false, 58850, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("group_id", this.s, d.a.f75113b);
        a("author_id", this.t, d.a.f75113b);
        if (this.v != null) {
            a((Map<String, String>) a.b(this.v, this.u));
        }
        if (aa.d(this.g)) {
            d(aa.c(this.v));
        }
        if (this.w != 0) {
            a("is_long_item", this.w, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.y)) {
            a(this.y, this.z, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.x)) {
            a("playlist_type", this.x, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.f75126d)) {
            a("log_pb", this.f75126d, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.f75124b)) {
            a("prop_id", this.f75124b, d.a.f75112a);
        }
        if (this.f75125c != 0) {
            a("scene_id", this.f75125c, d.a.f75112a);
        }
        a("previous_page", this.A, d.a.f75112a);
        if (!TextUtils.isEmpty(this.B)) {
            a("impr_type", this.B, d.a.f75112a);
        }
    }

    public final h a(int i) {
        this.w = i;
        return this;
    }

    public final h b(String str) {
        this.y = str;
        return this;
    }

    public final h c(String str) {
        this.z = str;
        return this;
    }

    public final h e(@NonNull String str) {
        this.g = str;
        return this;
    }

    public final h f(String str) {
        this.A = str;
        return this;
    }

    public final h g(String str) {
        this.u = str;
        return this;
    }

    public final h h(@NonNull String str) {
        this.s = str;
        return this;
    }

    public final h i(@NonNull String str) {
        this.t = str;
        return this;
    }

    public final h a(String str) {
        this.x = str;
        return this;
    }

    /* renamed from: e */
    public final h f(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75123a, false, 58849, new Class[]{Aweme.class}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75123a, false, 58849, new Class[]{Aweme.class}, h.class);
        }
        super.f(aweme);
        if (aweme != null) {
            this.v = aweme;
            this.s = aweme.getAid();
            this.B = aa.s(aweme);
        }
        return this;
    }
}
