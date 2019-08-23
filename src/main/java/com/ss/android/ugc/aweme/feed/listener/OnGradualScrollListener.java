package com.ss.android.ugc.aweme.feed.listener;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder;

public class OnGradualScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45603a;

    /* renamed from: b  reason: collision with root package name */
    private int f45604b;

    /* renamed from: c  reason: collision with root package name */
    private int f45605c;

    public OnGradualScrollListener() {
        k a2 = k.a();
        this.f45604b = UIUtils.getStatusBarHeight(a2) + ((int) UIUtils.dip2Px(a2, 80.0f));
        this.f45605c = UIUtils.getStatusBarHeight(a2) + ((int) UIUtils.dip2Px(a2, 141.0f));
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f45603a, false, 41362, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f45603a, false, 41362, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f45603a, false, 41361, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f45603a, false, 41361, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        int childCount = recyclerView.getChildCount();
        if (childCount > 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
                if (childViewHolder != null && childViewHolder.getItemViewType() == 0) {
                    ((AbsCellViewHolder) childViewHolder).a((((float) childAt.getBottom()) - ((float) this.f45604b)) / ((float) (this.f45605c - this.f45604b)));
                }
            }
        }
    }
}
