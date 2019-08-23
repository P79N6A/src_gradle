package com.ss.android.ugc.aweme.newfollow.adapter;

import android.view.View;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.forward.d.f;
import com.ss.android.ugc.aweme.forward.vh.ForwardImageViewHolder;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.utils.eo;

public class FollowFlowItemImageForwardViewHolder extends ForwardImageViewHolder {
    public static ChangeQuickRedirect t;
    private boolean u;

    public boolean s() {
        return this.u;
    }

    public void w() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 61129, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 61129, new Class[0], Void.TYPE);
        } else if (a.c()) {
            this.mCreateTimeView.setText(eo.c(c(), this.f48319d.getCreateTime() * 1000));
        } else {
            super.w();
        }
    }

    public final f a(l lVar) {
        l lVar2 = lVar;
        if (!PatchProxy.isSupport(new Object[]{lVar2}, this, t, false, 61128, new Class[]{l.class}, f.class)) {
            return new b(this, lVar2);
        }
        return (f) PatchProxy.accessDispatch(new Object[]{lVar2}, this, t, false, 61128, new Class[]{l.class}, f.class);
    }

    public void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, t, false, 61127, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, t, false, 61127, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        viewStub.setLayoutResource(C0906R.layout.a4h);
        a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        viewStub2.setLayoutResource(C0906R.layout.a4g);
        a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        viewStub3.setLayoutResource(C0906R.layout.a4j);
        a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwk);
        viewStub4.setLayoutResource(C0906R.layout.a40);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwg);
        viewStub5.setLayoutResource(C0906R.layout.a42);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(C0906R.id.cwm);
        viewStub6.setLayoutResource(C0906R.layout.a4d);
        a(viewStub6.inflate(), 12.0f);
    }

    public FollowFlowItemImageForwardViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, l lVar, BaseFollowViewHolder.a aVar2, com.ss.android.ugc.aweme.newfollow.b.a aVar3, boolean z) {
        super(followFeedLayout, aVar, lVar, aVar2, aVar3);
        this.u = z;
    }
}
