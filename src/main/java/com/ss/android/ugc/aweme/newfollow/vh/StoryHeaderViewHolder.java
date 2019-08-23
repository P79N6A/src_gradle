package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.widget.Widget;
import com.bytedance.widget.a;
import com.ss.android.ugc.aweme.story.api.b.c;

public class StoryHeaderViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    private c f57679a;

    public StoryHeaderViewHolder(LinearLayout linearLayout, @NonNull c cVar, Fragment fragment) {
        super(linearLayout);
        View g = cVar.g();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g.getLayoutParams();
        layoutParams.topMargin = (int) (((float) layoutParams.topMargin) + UIUtils.dip2Px(linearLayout.getContext(), 52.0f));
        g.setLayoutParams(layoutParams);
        linearLayout.addView(g);
        this.f57679a = cVar;
        a.f22910e.a(fragment, linearLayout).a((Widget) this.f57679a);
    }
}
