package com.ss.android.ugc.aweme.challenge.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.a.b;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.utils.bg;

public class ChallengeViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35322a;

    /* renamed from: b  reason: collision with root package name */
    public Challenge f35323b;
    @BindView(2131493907)
    TextView mDescView;
    @BindView(2131495198)
    TextView mJoinCountView;
    @BindView(2131497590)
    TextView mTitleView;
    @BindDimen(2131230879)
    int margin;

    public ChallengeViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35324a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f35324a, false, 25776, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f35324a, false, 25776, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (ChallengeViewHolder.this.f35323b != null) {
                    bg.a(new b(ChallengeViewHolder.this.f35323b));
                }
            }
        });
    }
}
