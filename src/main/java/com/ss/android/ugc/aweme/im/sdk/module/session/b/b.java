package com.ss.android.ugc.aweme.im.sdk.module.session.b;

import android.support.annotation.NonNull;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.d.i;
import com.ss.android.ugc.aweme.im.sdk.d.k;
import com.ss.android.ugc.aweme.im.sdk.model.d;
import com.ss.android.ugc.aweme.im.sdk.module.session.SessionListAdapter;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.f;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.g;
import com.ss.android.ugc.aweme.im.sdk.module.stranger.b;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.service.session.a;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.c;

public final class b implements a<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3391a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3392b;

    /* renamed from: c  reason: collision with root package name */
    private List<a> f3393c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final SessionListAdapter f3394d;

    /* renamed from: e  reason: collision with root package name */
    private DmtStatusView f3395e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3396f;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3391a, false, 52511, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3391a, false, 52511, new Class[0], Void.TYPE);
        } else if (this.f3394d.b()) {
            this.f3395e.e();
            this.f3394d.setShowFooter(false);
        } else {
            this.f3395e.b();
            this.f3395e.setVisibility(8);
            if (m.c()) {
                this.f3394d.setShowFooter(false);
            } else {
                this.f3394d.setShowFooter(com.ss.android.ugc.aweme.im.sdk.d.a.b().needSessionListShowMore());
            }
        }
    }

    private void b(List<a> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f3391a, false, 52504, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f3391a, false, 52504, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.f3392b) {
            this.f3393c.clear();
            this.f3394d.setData(list);
        } else {
            this.f3393c.clear();
            this.f3393c.addAll(list);
        }
        a();
    }

    @Subscribe
    public final void onEvent(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f3391a, false, 52510, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f3391a, false, 52510, new Class[]{d.class}, Void.TYPE);
            return;
        }
        k a2 = k.a();
        if (PatchProxy.isSupport(new Object[0], a2, k.f51273a, false, 51801, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, k.f51273a, false, 51801, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.im.sdk.module.stranger.b.a().a(new b.C0605b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f51283a;

            public final void onFetch(g gVar) {
                if (PatchProxy.isSupport(new Object[]{gVar}, this, f51283a, false, 51814, new Class[]{g.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{gVar}, this, f51283a, false, 51814, new Class[]{g.class}, Void.TYPE);
                } else if (gVar != null) {
                    k.a().a((com.ss.android.ugc.aweme.im.service.session.a) f.a(gVar));
                } else {
                    k.a().a("stranger_1");
                }
            }
        });
    }

    public final void a(k.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3391a, false, 52508, new Class[]{k.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3391a, false, 52508, new Class[]{k.a.class}, Void.TYPE);
            return;
        }
        this.f3394d.setData(aVar.f51300b);
        a();
        if (this.f3396f && bc.b()) {
            this.f3396f = false;
            com.ss.android.ugc.aweme.im.sdk.story.d.a(aVar.f51300b);
            i.a(aVar.f51300b);
        }
    }

    public final void a(@NonNull List<a> list) {
        int i;
        if (PatchProxy.isSupport(new Object[]{list}, this, f3391a, false, 52502, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f3391a, false, 52502, new Class[]{List.class}, Void.TYPE);
            return;
        }
        StringBuilder sb = new StringBuilder("onQuerySessionList() called with: list = [");
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        sb.append(i);
        sb.append("]");
        this.f3394d.setShowFooter(com.ss.android.ugc.aweme.im.sdk.d.a.b().needSessionListShowMore());
        this.f3394d.setData(list);
        a();
        if (this.f3396f) {
            this.f3396f = false;
            i.a(list);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3391a, false, 52499, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3391a, false, 52499, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f3392b = z;
        if (this.f3392b && !this.f3393c.isEmpty()) {
            b(new ArrayList(this.f3393c));
        }
    }

    public b(SessionListAdapter sessionListAdapter, DmtStatusView dmtStatusView) {
        this.f3395e = dmtStatusView;
        this.f3394d = sessionListAdapter;
        if (!c.a().b((Object) this)) {
            c.a().a((Object) this);
        }
        this.f3395e.d();
        this.f3396f = true;
    }
}
