package com.ss.android.ugc.aweme.u;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.d;
import com.ss.android.ugc.aweme.util.a;

public final class ak extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75037a;

    /* renamed from: b  reason: collision with root package name */
    public String f75038b;

    /* renamed from: c  reason: collision with root package name */
    public String f75039c;

    /* renamed from: d  reason: collision with root package name */
    public String f75040d;
    public String p;
    public String q;
    public boolean r;
    private String s;
    private String t;
    private String u;
    private int v;
    private String w;

    public ak() {
        super("shoot");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75037a, false, 58944, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75037a, false, 58944, new Class[0], Void.TYPE);
            return;
        }
        a("shoot_way", this.s, d.a.f75112a);
        a("music_id", this.f75038b, d.a.f75113b);
        a("group_id", this.f75040d, d.a.f75113b);
        a("poi_id", this.f75039c, d.a.f75113b);
        a("tag_id", this.t, d.a.f75113b);
        a("sticker_id", this.w, d.a.f75113b);
        a("content_type", this.u, d.a.f75112a);
        a("content_cnt", String.valueOf(this.v), d.a.f75112a);
        a("creation_id", this.p, d.a.f75112a);
        if (this.r) {
            a("log_pb", this.q, d.a.f75112a);
        }
        if (com.ss.android.ugc.aweme.ae.d.a().a(this.f75040d)) {
            a("previous_page", "push", d.a.f75112a);
        }
        f();
        if (PatchProxy.isSupport(new Object[]{"shoot", ""}, null, a.f75416a, true, 87768, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{"shoot", ""}, null, a.f75416a, true, 87768, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        switch ("shoot".hashCode()) {
            case -2090153577:
                if ("shoot".equals("mus_af_follow")) {
                    return;
                }
                break;
            case -985906430:
                if ("shoot".equals("mus_af_post_video")) {
                    return;
                }
                break;
            case 1263148345:
                if ("shoot".equals("mus_af_comment")) {
                    return;
                }
                break;
            case 2026292779:
                if ("shoot".equals("mus_af_like_video_1")) {
                    return;
                }
                break;
            case 2026292783:
                "shoot".equals("mus_af_like_video_5");
                break;
        }
    }

    public final ak a(int i) {
        this.v = i;
        return this;
    }

    public final ak b(String str) {
        this.u = str;
        return this;
    }

    public final ak a(String str) {
        this.s = str;
        return this;
    }
}
