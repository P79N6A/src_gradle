package com.ss.android.ugc.aweme.newfollow.userstate;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.FollowImageViewHolder;
import com.ss.android.ugc.aweme.utils.eo;

public class UserStateFlowItemImageViewHolder extends FollowImageViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57357a;

    public final void E_() {
        if (PatchProxy.isSupport(new Object[0], this, f57357a, false, 61816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57357a, false, 61816, new Class[0], Void.TYPE);
        } else if (a.c()) {
            this.mCreateTimeView.setText(eo.c(X(), this.j.getCreateTime() * 1000));
        } else {
            super.E_();
        }
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f57357a, false, 61815, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f57357a, false, 61815, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.j == null || this.j.getAuthor() == null || !TextUtils.equals(this.j.getAuthor().getUid(), d.a().getCurUserId())) {
            super.a(j);
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57357a, false, 61814, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57357a, false, 61814, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        viewStub.setLayoutResource(C0906R.layout.apq);
        a(viewStub.inflate(), 20.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        viewStub2.setLayoutResource(C0906R.layout.a4g);
        a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        viewStub3.setLayoutResource(C0906R.layout.a41);
        a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwz);
        viewStub4.setLayoutResource(C0906R.layout.a4a);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwk);
        viewStub5.setLayoutResource(C0906R.layout.a40);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(C0906R.id.cwg);
        viewStub6.setLayoutResource(C0906R.layout.a42);
        viewStub6.inflate();
    }

    public UserStateFlowItemImageViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, l lVar, com.ss.android.ugc.aweme.newfollow.b.a aVar2) {
        super(followFeedLayout, aVar, lVar, aVar2);
    }
}
