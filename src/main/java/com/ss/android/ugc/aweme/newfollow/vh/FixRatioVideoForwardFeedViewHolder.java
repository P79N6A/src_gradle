package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.View;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.a.b;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFlowItemVideoForwardViewHolder;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.ArrayList;
import java.util.List;

public class FixRatioVideoForwardFeedViewHolder extends FollowFlowItemVideoForwardViewHolder {
    public static ChangeQuickRedirect w;

    public final void D() {
    }

    public final boolean s() {
        return true;
    }

    public final void O() {
        if (PatchProxy.isSupport(new Object[0], this, w, false, 62147, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 62147, new Class[0], Void.TYPE);
        } else if (AbTestManager.a().aD()) {
            P();
        } else {
            super.O();
        }
    }

    public final void T() {
        if (PatchProxy.isSupport(new Object[0], this, w, false, 62148, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 62148, new Class[0], Void.TYPE);
        } else if (AbTestManager.a().aD()) {
            P();
        } else {
            super.T();
        }
    }

    public final void x() {
        if (PatchProxy.isSupport(new Object[0], this, w, false, 62142, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 62142, new Class[0], Void.TYPE);
            return;
        }
        C();
        E();
        if (!s()) {
            F();
        }
        D();
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, w, false, 62146, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 62146, new Class[0], Void.TYPE);
            return;
        }
        this.mLineDivider.setVisibility(8);
    }

    public final void E() {
        if (PatchProxy.isSupport(new Object[0], this, w, false, 62143, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 62143, new Class[0], Void.TYPE);
            return;
        }
        if (this.mShareView != null) {
            if (b.c(this.f48319d)) {
                this.mShareView.setImageResource(2130839644);
            } else {
                this.mShareView.setImageResource(2130838974);
            }
        }
        if (this.mShareCountView != null) {
            this.mShareCountView.setVisibility(0);
            this.mShareCountView.setTextSize(1, 13.0f);
            if (b.c(this.f48319d)) {
                this.mShareCountView.setText(C0906R.string.bc_);
                return;
            }
            this.mShareCountView.setText(C0906R.string.drp);
        }
    }

    public final List<String> K() {
        if (PatchProxy.isSupport(new Object[0], this, w, false, 62145, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, w, false, 62145, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (!ex.a(this.f48319d) && ex.b(this.f48319d)) {
            arrayList.add(c().getString(C0906R.string.dpt));
        }
        return arrayList;
    }

    public final void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, w, false, 62144, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, w, false, 62144, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        viewStub.setLayoutResource(C0906R.layout.a4h);
        a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        viewStub2.setLayoutResource(C0906R.layout.a4g);
        a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        viewStub3.setLayoutResource(C0906R.layout.a4k);
        a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwk);
        viewStub4.setLayoutResource(C0906R.layout.a4f);
        a(viewStub4.inflate(), 16.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwg);
        viewStub5.setLayoutResource(C0906R.layout.a42);
        a(viewStub5.inflate(), 16.0f, 20.0f);
    }

    public FixRatioVideoForwardFeedViewHolder(FollowFeedLayout followFeedLayout, a aVar, d dVar, l lVar, BaseFollowViewHolder.a aVar2, com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        super(followFeedLayout, aVar, dVar, lVar, aVar2, aVar3, true);
        this.mCommentLayout.setDisplayType(AbTestManager.a().aB());
    }
}
