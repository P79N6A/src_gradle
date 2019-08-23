package com.ss.android.ugc.aweme.forward.d;

import android.content.Context;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.DragView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.b.e;
import com.ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.newfollow.ui.AbsFollowFeedDetailActivity;
import com.ss.android.ugc.aweme.newfollow.ui.FollowEnterDetailViewModel;
import com.ss.android.ugc.aweme.newfollow.util.d;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.shortvideo.ea;

public class f extends b {
    public static ChangeQuickRedirect l;

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45428, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45428, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        a(false);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45432, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45432, new Class[0], Void.TYPE);
            return;
        }
        super.e();
        this.f3283d.e();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45431, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45431, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        k();
    }

    public final void a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45427, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45427, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45430, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 45430, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3281b.c() instanceof MainActivity) {
            z = FollowEnterDetailViewModel.a(this.f3284e, (MainActivity) this.f3281b.c()).f57208b;
        }
        if (!z) {
            super.a();
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45426, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45426, new Class[0], Void.TYPE);
            return;
        }
        a((long) ea.f66827f);
        d j = j();
        if (j != null) {
            j.f57413d.a(16777216);
            int[] iArr = new int[2];
            ImageView a2 = ((e) this.f3281b).a();
            a2.getLocationOnScreen(iArr);
            DragView.b bVar = new DragView.b(iArr[0], iArr[1], a2.getHeight(), a2.getWidth(), (float) this.f3281b.c().getResources().getDimensionPixelOffset(C0906R.dimen.gh));
            AbsFollowFeedDetailActivity.a(this.f3281b.c(), bVar, this.f3282c, this.f3284e, j.j);
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45434, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45434, new Class[0], Void.TYPE);
        } else if (this.f3282c != null && this.f3282c.getForwardItem() != null) {
            d j = j();
            if (j != null) {
                j.f57413d.a(256);
            }
            Context c2 = this.f3281b.c();
            Aweme aweme = this.f3282c;
            String str = this.f3284e;
            String a2 = d.a(this.f3281b.b().e(), this.f3282c.getAid());
            if (PatchProxy.isSupport(new Object[]{c2, aweme, str, a2}, null, OriginDetailActivity.f48444e, true, 45795, new Class[]{Context.class, Aweme.class, String.class, String.class}, Void.TYPE)) {
                Object[] objArr = {c2, aweme, str, a2};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, null, OriginDetailActivity.f48444e, true, 45795, new Class[]{Context.class, Aweme.class, String.class, String.class}, Void.TYPE);
                return;
            }
            OriginDetailActivity.a(c2, aweme, str, a2, "");
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, l, false, 45433, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, l, false, 45433, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(i);
        a((long) ea.f66827f);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, l, false, 45429, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, l, false, 45429, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3281b.c() instanceof MainActivity) {
            FollowEnterDetailViewModel.a(this.f3284e, (MainActivity) this.f3281b.c()).f57208b = z;
        }
    }

    public f(e eVar, l lVar) {
        super(eVar, lVar);
    }
}
