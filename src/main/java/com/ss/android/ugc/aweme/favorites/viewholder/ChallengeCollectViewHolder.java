package com.ss.android.ugc.aweme.favorites.viewholder;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.utils.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.favorites.d.a;

public class ChallengeCollectViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, a.C0553a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44363a;

    /* renamed from: b  reason: collision with root package name */
    public Challenge f44364b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f44365c;
    @BindView(2131493526)
    LinearLayout challengeItemll;
    @BindView(2131496925)
    public RemoteImageView mCoverView;
    @BindView(2131493528)
    public TextView mNameView;
    @BindView(2131496795)
    RelativeLayout mRightView;
    @BindView(2131495606)
    LinearLayout mTopView;
    @BindView(2131498220)
    public TextView txtUserCount;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44363a, false, 39689, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44363a, false, 39689, new Class[0], Void.TYPE);
            return;
        }
        if (this.f44364b != null) {
            a.b(1, this.f44364b.getCid());
        }
    }

    public ChallengeCollectViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }

    @OnClick({2131495606})
    public void onClick(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f44363a, false, 39688, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f44363a, false, 39688, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.bid && this.f44364b != null) {
            h a2 = h.a();
            Activity activity = this.f44365c;
            j a3 = j.a("aweme://challenge/detail/" + this.f44364b.getCid());
            if (r.b(this.f44364b)) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            a2.a(activity, a3.a("is_commerce", str).a());
            a.b(2, this.f44364b.getCid());
        }
    }
}
