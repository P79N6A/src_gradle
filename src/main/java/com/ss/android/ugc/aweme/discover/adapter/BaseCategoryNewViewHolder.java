package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.Category;

public class BaseCategoryNewViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41543a;

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView f41544b;

    /* renamed from: c  reason: collision with root package name */
    private int f41545c;

    /* renamed from: d  reason: collision with root package name */
    private int f41546d = ((int) (((float) this.f41545c) * 1.4718101f));

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41543a, false, 35499, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41543a, false, 35499, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int spanIndex = ((GridLayoutManager) this.f41544b.getLayoutManager()).getSpanSizeLookup().getSpanIndex(i, 2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.itemView.getLayoutParams();
        marginLayoutParams.width = this.f41545c;
        marginLayoutParams.height = this.f41546d;
        marginLayoutParams.topMargin = (int) UIUtils.dip2Px(this.itemView.getContext(), 6.0f);
        if (spanIndex % 2 == 0) {
            marginLayoutParams.leftMargin = (int) UIUtils.dip2Px(this.itemView.getContext(), 16.0f);
            marginLayoutParams.rightMargin = (int) UIUtils.dip2Px(this.itemView.getContext(), 3.0f);
        } else {
            marginLayoutParams.leftMargin = (int) UIUtils.dip2Px(this.itemView.getContext(), 3.0f);
            marginLayoutParams.rightMargin = (int) UIUtils.dip2Px(this.itemView.getContext(), 16.0f);
        }
        this.itemView.setLayoutParams(marginLayoutParams);
    }

    public BaseCategoryNewViewHolder(View view, RecyclerView recyclerView) {
        super(view);
        this.f41544b = recyclerView;
        this.f41545c = (int) (((((float) UIUtils.getScreenWidth(view.getContext())) - (UIUtils.dip2Px(view.getContext(), 16.0f) * 2.0f)) - UIUtils.dip2Px(view.getContext(), 6.0f)) / 2.0f);
    }

    public void a(Category category, int i) {
        if (PatchProxy.isSupport(new Object[]{category, Integer.valueOf(i)}, this, f41543a, false, 35498, new Class[]{Category.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{category, Integer.valueOf(i)}, this, f41543a, false, 35498, new Class[]{Category.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i);
    }
}
