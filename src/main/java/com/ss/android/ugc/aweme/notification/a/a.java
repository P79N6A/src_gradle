package com.ss.android.ugc.aweme.notification.a;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.u.d;
import com.ss.android.ugc.aweme.u.k;

public class a extends k<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57844a;
    private LogPbBean A;
    private String B;
    private String C;

    /* renamed from: b  reason: collision with root package name */
    private String f57845b;

    /* renamed from: c  reason: collision with root package name */
    private String f57846c;

    /* renamed from: d  reason: collision with root package name */
    private int f57847d;
    private String s;
    private String t;
    private String u;
    private long v;
    private String w;
    private String x;
    private String y;
    private int z;

    public a() {
        super("notification_message_inner_message");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57844a, false, 63100, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57844a, false, 63100, new Class[0], Void.TYPE);
            return;
        }
        a("action_type", this.f57845b, d.a.f75112a);
        a("account_type", this.f57846c, d.a.f75112a);
        a("client_order", String.valueOf(this.f57847d), d.a.f75112a);
        a("notice_type", this.s, d.a.f75112a);
        a("notification_type", this.t, d.a.f75112a);
        a("message_time", String.valueOf(this.v), d.a.f75112a);
        a("from_user_id", this.w, d.a.f75113b);
        a("from_item", this.x, d.a.f75112a);
        a("from_item_id", this.y, d.a.f75113b);
        a("is_together", String.valueOf(this.z), d.a.f75112a);
        a("enter_from", this.g, d.a.f75112a);
        if (!TextUtils.isEmpty(this.C)) {
            a("scene_id", this.C, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.r)) {
            a("tab_name", this.r, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.B)) {
            a("timeline", this.B, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.u)) {
            a("follow_button", this.u, d.a.f75112a);
        }
        if (this.A != null) {
            a("log_pb", new Gson().toJson((Object) this.A), d.a.f75112a);
        }
    }

    public final a a(int i) {
        this.f57847d = i;
        return this;
    }

    public final a b(int i) {
        this.z = i;
        return this;
    }

    public final a c(String str) {
        this.t = str;
        return this;
    }

    public final a e(String str) {
        this.u = str;
        return this;
    }

    public final a f(String str) {
        this.w = str;
        return this;
    }

    public final a g(String str) {
        this.x = str;
        return this;
    }

    public final a h(String str) {
        this.y = str;
        return this;
    }

    public final a i(String str) {
        this.g = str;
        return this;
    }

    public final a a(long j) {
        this.v = j;
        return this;
    }

    public final a b(String str) {
        this.f57846c = str;
        return this;
    }

    public final a a(LogPbBean logPbBean) {
        this.A = logPbBean;
        return this;
    }

    public final a a(String str) {
        this.f57845b = str;
        return this;
    }

    public final a a(boolean z2) {
        String str;
        if (z2) {
            str = "yellow_dot";
        } else {
            str = "";
        }
        this.s = str;
        return this;
    }
}
