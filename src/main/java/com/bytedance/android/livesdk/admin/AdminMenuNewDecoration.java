package com.bytedance.android.livesdk.admin;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.android.livesdk.admin.b.d;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class AdminMenuNewDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8936a;

    /* renamed from: b  reason: collision with root package name */
    protected Drawable f8937b;

    /* renamed from: c  reason: collision with root package name */
    private Context f8938c;

    /* renamed from: d  reason: collision with root package name */
    private List<d> f8939d;

    /* renamed from: e  reason: collision with root package name */
    private int f8940e;

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, state}, this, f8936a, false, 3069, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, state}, this, f8936a, false, 3069, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        if (this.f8940e == 1) {
            if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2}, this, f8936a, false, 3070, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2}, this, f8936a, false, 3070, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
                return;
            }
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount() - 1;
            if (childCount > 0 && this.f8939d.get(this.f8939d.size() - 1).f8960a == 3) {
                childCount--;
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView2.getChildAt(i);
                int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                this.f8937b.setBounds(paddingLeft, bottom, width, (this.f8937b.getIntrinsicHeight() + bottom) - 1);
                this.f8937b.draw(canvas);
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f8936a, false, 3071, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f8936a, false, 3071, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
        } else if (recyclerView2.getChildAdapterPosition(view2) == this.f8939d.size() - 2) {
            rect2.set(0, 0, 0, (int) UIUtils.dip2Px(this.f8938c, 8.0f));
        } else {
            rect2.set(0, 0, 0, this.f8937b.getIntrinsicHeight());
        }
    }
}
