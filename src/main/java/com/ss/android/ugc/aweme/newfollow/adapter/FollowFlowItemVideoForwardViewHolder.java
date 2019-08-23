package com.ss.android.ugc.aweme.newfollow.adapter;

import android.view.View;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.forward.d.k;
import com.ss.android.ugc.aweme.forward.vh.ForwardVideoViewHolder;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.utils.eo;

public class FollowFlowItemVideoForwardViewHolder extends ForwardVideoViewHolder {
    public static ChangeQuickRedirect t;

    public void w() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 61134, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 61134, new Class[0], Void.TYPE);
        } else if (a.c()) {
            this.mCreateTimeView.setText(eo.c(c(), this.f48319d.getCreateTime() * 1000));
        } else {
            super.w();
        }
    }

    public void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, t, false, 61133, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, t, false, 61133, new Class[]{View.class}, Void.TYPE);
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
        viewStub4.setLayoutResource(C0906R.layout.a40);
        a(viewStub4.inflate(), 12.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwg);
        viewStub5.setLayoutResource(C0906R.layout.a42);
        a(viewStub5.inflate(), 12.0f);
        ViewStub viewStub6 = (ViewStub) view.findViewById(C0906R.id.cwm);
        viewStub6.setLayoutResource(C0906R.layout.a4d);
        a(viewStub6.inflate(), 12.0f);
    }

    public final k a(d dVar, l lVar) {
        d dVar2 = dVar;
        l lVar2 = lVar;
        if (PatchProxy.isSupport(new Object[]{dVar2, lVar2}, this, t, false, 61132, new Class[]{d.class, l.class}, k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[]{dVar2, lVar2}, this, t, false, 61132, new Class[]{d.class, l.class}, k.class);
        }
        return new c(this, dVar2, lVar2, R());
    }

    public FollowFlowItemVideoForwardViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, d dVar, l lVar, BaseFollowViewHolder.a aVar2, com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        this(followFeedLayout, aVar, dVar, lVar, aVar2, aVar3, false);
    }

    public FollowFlowItemVideoForwardViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, d dVar, l lVar, BaseFollowViewHolder.a aVar2, com.ss.android.ugc.aweme.newfollow.b.a aVar3, boolean z) {
        super(followFeedLayout, aVar, dVar, lVar, aVar2, aVar3, z);
    }
}
