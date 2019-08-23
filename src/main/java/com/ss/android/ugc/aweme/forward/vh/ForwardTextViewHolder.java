package com.ss.android.ugc.aweme.forward.vh;

import android.os.Build;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import butterknife.BindView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.forward.d.j;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.utils.dp;

public class ForwardTextViewHolder extends BaseForwardViewHolder {
    public static ChangeQuickRedirect s;
    @BindView(2131497858)
    TextView mContentView;
    @BindView(2131497369)
    ViewStub mDynamicStub;

    public final void e() {
    }

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45636, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45636, new Class[0], Void.TYPE);
            return;
        }
        super.u();
    }

    public final void I() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45638, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45638, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.mContentView.setOutlineProvider(new dp(this.mContentView.getResources().getDimensionPixelOffset(C0906R.dimen.gh)));
            this.mContentView.setClipToOutline(true);
        }
    }

    public void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, s, false, 45635, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, s, false, 45635, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        viewStub.setLayoutResource(C0906R.layout.a4h);
        a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        viewStub2.setLayoutResource(C0906R.layout.a4g);
        a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        viewStub3.setLayoutResource(C0906R.layout.a67);
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

    public ForwardTextViewHolder(FollowFeedLayout followFeedLayout, a aVar, l lVar, BaseFollowViewHolder.a aVar2, com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        super(followFeedLayout, aVar, aVar2, aVar3);
        this.n = new j(this, lVar);
    }
}
