package com.ss.android.ugc.aweme.newfollow.vh;

import android.os.Build;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import butterknife.BindView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.forward.d.j;
import com.ss.android.ugc.aweme.forward.vh.BaseForwardViewHolder;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.dp;

public class MomentForwardDeletedViewHolder extends BaseForwardViewHolder {
    public static ChangeQuickRedirect s;
    @BindView(2131497858)
    DmtTextView mContentView;
    @BindView(2131497369)
    ViewStub mDynamicStub;

    public final void e() {
    }

    public final boolean s() {
        return true;
    }

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 62618, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 62618, new Class[0], Void.TYPE);
            return;
        }
        super.u();
    }

    public final void D() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 62620, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 62620, new Class[0], Void.TYPE);
        } else if (!this.f48319d.isShowForwardEntrance() || !AbTestManager.a().M()) {
            v.a((View) this.mForwardLayout, 8);
        } else {
            v.a((View) this.mForwardLayout, 0);
        }
    }

    public final void I() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 62617, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 62617, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.mContentView.setOutlineProvider(new dp((int) UIUtils.dip2Px(c(), 2.0f)));
            this.mContentView.setClipToOutline(true);
        }
    }

    public final void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, s, false, 62615, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, s, false, 62615, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View findViewById = view2.findViewById(C0906R.id.bg5);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = (int) (((float) layoutParams.leftMargin) + UIUtils.dip2Px(c(), 50.0f));
        layoutParams.topMargin = -((int) UIUtils.dip2Px(c(), 20.0f));
        findViewById.setLayoutParams(layoutParams);
    }

    public final void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, s, false, 62616, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, s, false, 62616, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        viewStub.setLayoutResource(C0906R.layout.a6_);
        a(viewStub.inflate(), 4.0f, 3.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        viewStub2.setLayoutResource(C0906R.layout.a4g);
        a(viewStub2.inflate(), 0.0f, 8.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        viewStub3.setLayoutResource(C0906R.layout.a67);
        a(viewStub3.inflate(), 4.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwk);
        viewStub4.setLayoutResource(C0906R.layout.a4e);
        a(viewStub4.inflate(), 16.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwg);
        viewStub5.setLayoutResource(C0906R.layout.a42);
        a(viewStub5.inflate(), 16.0f);
    }

    public MomentForwardDeletedViewHolder(FollowFeedLayout followFeedLayout, a aVar, l lVar, BaseFollowViewHolder.a aVar2, com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        super(followFeedLayout, aVar, aVar2, aVar3);
        this.n = new j(this, lVar) {
        };
        ((LinearLayout) this.mForwardHeaderLayout).setGravity(48);
        this.mCommentLayout.setDisplayType(AbTestManager.a().aB());
    }
}
