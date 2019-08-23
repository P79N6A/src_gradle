package com.ss.android.ugc.aweme.poi.ui.comment;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class CommentImageDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60547a;

    /* renamed from: b  reason: collision with root package name */
    private int f60548b = 5;

    /* renamed from: c  reason: collision with root package name */
    private int f60549c;

    /* renamed from: d  reason: collision with root package name */
    private int f60550d = 3;

    public CommentImageDecoration(int i, int i2) {
        this.f60548b = i2;
        if (this.f60550d <= 0) {
            throw new IllegalArgumentException("span should be set a positive value");
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        float f2;
        float f3;
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f60547a, false, 66239, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f60547a, false, 66239, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
        int i = this.f60550d;
        int itemCount = recyclerView.getAdapter().getItemCount();
        if (PatchProxy.isSupport(new Object[]{1, Integer.valueOf(i), rect2, Integer.valueOf(childAdapterPosition), Integer.valueOf(itemCount)}, this, f60547a, false, 66240, new Class[]{Integer.TYPE, Integer.TYPE, Rect.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{1, Integer.valueOf(i), rect2, Integer.valueOf(childAdapterPosition), Integer.valueOf(itemCount)}, this, f60547a, false, 66240, new Class[]{Integer.TYPE, Integer.TYPE, Rect.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int i2 = i - 1;
        float f4 = ((float) ((this.f60548b * i2) + (this.f60549c * 2))) / ((float) i);
        int i3 = childAdapterPosition % i;
        int i4 = childAdapterPosition / i;
        float f5 = (float) this.f60548b;
        float f6 = 0.0f;
        if (this.f60549c == 0) {
            f2 = (((float) i3) * f4) / ((float) i2);
            f3 = f4 - f2;
            if (itemCount / i == i4) {
                f5 = 0.0f;
            }
        } else {
            if (childAdapterPosition < i) {
                f6 = (float) this.f60549c;
            } else if (itemCount / i == i4) {
                f5 = (float) this.f60549c;
            }
            f2 = ((((float) i3) * ((f4 - ((float) this.f60549c)) - ((float) this.f60549c))) / ((float) i2)) + ((float) this.f60549c);
            f3 = f4 - f2;
        }
        rect2.set((int) f2, (int) f6, (int) f3, (int) f5);
    }
}
