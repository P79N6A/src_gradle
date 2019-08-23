package com.ss.android.ugc.aweme.forward.d;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.DragView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.b.f;
import com.ss.android.ugc.aweme.forward.f.b;
import com.ss.android.ugc.aweme.forward.f.c;
import com.ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.ss.android.ugc.aweme.newfollow.ui.AbsFollowFeedDetailActivity;
import com.ss.android.ugc.aweme.newfollow.util.d;
import com.ss.android.ugc.aweme.newfollow.util.l;

public class m extends b {
    public static ChangeQuickRedirect l;
    private View m;
    private boolean n;
    private Aweme o;

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45492, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45492, new Class[0], Void.TYPE);
        } else if (this.f3282c != null && this.f3282c.getForwardItem() != null) {
            d j = j();
            if (j != null) {
                j.f57413d.a(256);
            }
            String a2 = b.a(this.f3281b.b().e(), this.f3282c.getAid());
            c.a().a(a2, new b(a2, this.f3282c, null));
            OriginDetailActivity.a(this.f3281b.c(), this.f3282c, this.f3284e, a2, this.f3285f);
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45490, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45490, new Class[0], Void.TYPE);
            return;
        }
        d j = j();
        if (j != null) {
            j.f57413d.a(16777216);
            int[] iArr = new int[2];
            this.m.getLocationOnScreen(iArr);
            DragView.b bVar = new DragView.b(iArr[0], iArr[1], this.m.getHeight(), this.m.getWidth(), (float) this.f3281b.c().getResources().getDimensionPixelOffset(C0906R.dimen.gh));
            AbsFollowFeedDetailActivity.a(this.f3281b.c(), bVar, this.f3282c, this.f3284e, j.j);
        }
    }

    public final void l() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45489, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45489, new Class[0], Void.TYPE);
        } else if (this.f3282c != null) {
            this.n = true;
            d j = j();
            if (j != null) {
                j.f57413d.a(16777216);
                j.k = true;
                int[] iArr = new int[2];
                this.m.getLocationOnScreen(iArr);
                if (this.o == null || this.o.getVideo() == null) {
                    f2 = ((float) this.m.getHeight()) / ((float) this.m.getWidth());
                } else {
                    f2 = ((float) this.o.getVideo().getHeight()) / ((float) this.o.getVideo().getWidth());
                }
                DragView.b bVar = new DragView.b(iArr[0], iArr[1], this.m.getHeight(), this.m.getWidth(), (float) this.f3281b.c().getResources().getDimensionPixelOffset(C0906R.dimen.gh), f2);
                AbsFollowFeedDetailActivity.a(this.f3281b.c(), bVar, this.f3282c, 2, this.f3284e, j.j);
            }
        }
    }

    public m(f fVar, l lVar) {
        super(fVar, lVar);
        this.m = fVar.o();
    }

    public final void a(Aweme aweme, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{aweme, str, str2}, this, l, false, 45488, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str, str2}, this, l, false, 45488, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE);
            return;
        }
        super.a(aweme, str, str2);
        this.o = aweme.getForwardItem();
    }
}
