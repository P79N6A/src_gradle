package com.ss.android.ugc.aweme.newfollow.vh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

class FollowFeedViewHolder$3 extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57577a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n f57578b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f57579c = ContextCompat.getDrawable(this.f57578b.getContext(), C0906R.color.zf);

    FollowFeedViewHolder$3(n nVar) {
        this.f57578b = nVar;
    }

    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, state}, this, f57577a, false, 62295, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, state}, this, f57577a, false, 62295, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView2.getChildAt(i);
            int childAdapterPosition = recyclerView2.getChildAdapterPosition(childAt);
            if (childAdapterPosition > 0 && childAdapterPosition < recyclerView.getAdapter().getItemCount() && (childAdapterPosition >= recyclerView.getAdapter().getItemCount() - 1 || recyclerView.getAdapter().getItemViewType(childAdapterPosition + 1) != 37)) {
                int itemViewType = recyclerView.getAdapter().getItemViewType(childAdapterPosition);
                if (!(itemViewType == 37 || itemViewType == 51 || itemViewType == 50 || itemViewType == 48)) {
                    int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                    int i2 = n.s + bottom;
                    if (y.b()) {
                        this.f57579c.setBounds(childAt.getLeft(), bottom, childAt.getRight(), i2);
                    } else {
                        this.f57579c.setBounds(childAt.getLeft() + n.q, bottom, childAt.getRight() - n.r, i2);
                    }
                    this.f57579c.draw(canvas);
                }
            }
        }
    }

    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        rect.bottom = n.s;
    }
}
