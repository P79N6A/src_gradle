package com.ss.android.ugc.aweme.newfollow.f;

import android.content.Context;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.c.a;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.h.aa;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newfollow.c.b;
import com.ss.android.ugc.aweme.newfollow.ui.j;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONObject;

public class f extends a<aa, j> implements com.ss.android.ugc.aweme.newfollow.b.a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f3646b;

    /* renamed from: c  reason: collision with root package name */
    public String f3647c;
    private String g;
    private int h;
    private Aweme i;
    private Map<String, Aweme> j;

    public final int c() {
        if (this.f2978e == null) {
            return 0;
        }
        return ((aa) this.f2978e).f45461b;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3646b, false, 61297, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3646b, false, 61297, new Class[0], Void.TYPE);
            return;
        }
        bg.c(this);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3646b, false, 61298, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3646b, false, 61298, new Class[0], Void.TYPE);
            return;
        }
        bg.d(this);
    }

    public final void b() {
        Pair pair;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3646b, false, 61296, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3646b, false, 61296, new Class[0], Void.TYPE);
        } else if (this.f2979f != null && ((j) this.f2979f).isViewValid()) {
            if (this.f2978e == null) {
                pair = null;
            } else {
                pair = (Pair) ((aa) this.f2978e).getData();
            }
            if (pair != null) {
                if (this.j.containsKey(pair.first)) {
                    Aweme aweme = this.j.get(pair.first);
                    if (!(aweme == null || aweme.getForwardItem() == null)) {
                        a(aweme.getForwardItem().getAid(), ((Integer) pair.second).intValue());
                        this.j.remove(pair.first);
                    }
                }
                a((String) pair.first, ((Integer) pair.second).intValue());
                if (TextUtils.equals(this.f3647c, "general_search") && c.t(this.i)) {
                    d.b a2 = d.a().b(this.i).a("result_ad");
                    if (((Integer) pair.second).intValue() == 0) {
                        str = "like_cancel";
                    } else {
                        str = "like";
                    }
                    a2.b(str).b();
                }
            }
        }
    }

    public final void a(j jVar) {
        j jVar2 = jVar;
        if (PatchProxy.isSupport(new Object[]{jVar2}, this, f3646b, false, 61293, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2}, this, f3646b, false, 61293, new Class[]{j.class}, Void.TYPE);
            return;
        }
        super.a(jVar);
        jVar2.a(this);
    }

    @Subscribe
    public void onFollowFeedDetailEvent(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f3646b, false, 61301, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f3646b, false, 61301, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null && ((j) this.f2979f).isViewValid() && bVar.f57082a == 0) {
            ((j) this.f2979f).a(bVar.f57083b);
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3646b, false, 61294, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3646b, false, 61294, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.f2979f != null && ((j) this.f2979f).isViewValid()) {
            ((j) this.f2979f).a(exc, this.i);
        }
    }

    public f(String str, int i2) {
        this(str, null, i2);
    }

    private void a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f3646b, false, 61295, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f3646b, false, 61295, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.feed.a.a().c(str, i2);
        ar arVar = new ar(13, str);
        arVar.f45295e = this.f3647c;
        arVar.f45296f = this.f3647c;
        bg.a(arVar);
    }

    public final void a(Aweme aweme, int i2) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i2)}, this, f3646b, false, 61299, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i2)}, this, f3646b, false, 61299, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
        } else if (this.f2979f != null && ((j) this.f2979f).isViewValid()) {
            if (!m.a().c()) {
                if (((j) this.f2979f).getContext() != null) {
                    com.bytedance.ies.dmt.ui.d.a.b(((j) this.f2979f).getContext(), (int) C0906R.string.bgf).a();
                }
                return;
            }
            this.i = aweme2;
            JSONObject b2 = com.ss.android.ugc.aweme.feed.a.a().b(this.i, this.h);
            if (i2 == 1) {
                com.ss.android.ugc.aweme.newfollow.g.a.a(this.i, this.f3647c, this.g, this.h);
            } else {
                r.a((Context) com.ss.android.ugc.aweme.framework.core.a.b().f3307e, "like_cancel", this.f3647c, this.i.getAid(), 0, b2);
                Aweme aweme3 = this.i;
                String str = this.f3647c;
                int i3 = this.h;
                if (PatchProxy.isSupport(new Object[]{aweme3, str, Integer.valueOf(i3)}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61369, new Class[]{Aweme.class, String.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme3, str, Integer.valueOf(i3)}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61369, new Class[]{Aweme.class, String.class, Integer.TYPE}, Void.TYPE);
                } else if (aweme3 != null) {
                    r.a("like_cancel", com.ss.android.ugc.aweme.u.aa.a(com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", str).a("group_id", aweme3.getAid()).a("author_id", aweme3.getAuthorUid()).a("log_pb", ai.a().a(com.ss.android.ugc.aweme.u.aa.c(aweme3))).f34114b));
                }
            }
            a(this.i.getAid(), Integer.valueOf(i2), this.f3647c);
        }
    }

    public final void b(Aweme aweme, int i2) {
        if (PatchProxy.isSupport(new Object[]{aweme, 1}, this, f3646b, false, 61300, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, 1}, this, f3646b, false, 61300, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
        } else if (this.f2979f != null && ((j) this.f2979f).isViewValid()) {
            if (!m.a().c()) {
                if (((j) this.f2979f).getContext() != null) {
                    com.bytedance.ies.dmt.ui.d.a.b(((j) this.f2979f).getContext(), (int) C0906R.string.bgf).a();
                }
            } else if (aweme.getForwardItem() != null) {
                this.i = aweme;
                com.ss.android.ugc.aweme.newfollow.g.a.a(this.i, this.f3647c, this.g, this.h);
                com.ss.android.ugc.aweme.newfollow.g.a.a(this.i.getForwardItem(), this.f3647c, this.g, this.h);
                a(this.i.getAid(), this.i.getForwardItem().getAid(), 1, this.f3647c);
                this.j.put(this.i.getAid(), this.i);
            }
        }
    }

    public f(String str, String str2, int i2) {
        this.f3647c = str;
        this.g = str2;
        this.h = i2;
        this.j = new HashMap();
    }
}
