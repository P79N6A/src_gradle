package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.C0906R;

public class FollowFeedEmptyRecommendViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    LinearLayout f57563a;

    /* renamed from: b  reason: collision with root package name */
    DmtTextView f57564b = ((DmtTextView) this.f57563a.findViewById(C0906R.id.dfi));

    /* renamed from: c  reason: collision with root package name */
    DmtTextView f57565c;

    public FollowFeedEmptyRecommendViewHolder(View view) {
        super(view);
        this.f57563a = (LinearLayout) view.findViewById(C0906R.id.a9t);
        this.f57564b.setVisibility(0);
        this.f57565c = (DmtTextView) this.f57563a.findViewById(C0906R.id.dfj);
        this.f57565c.setVisibility(0);
    }
}
