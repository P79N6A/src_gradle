package com.ss.android.ugc.aweme.im.sdk.widget;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.text.TextUtilsCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Locale;

public class HorizontalSpaceItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52761a;

    /* renamed from: b  reason: collision with root package name */
    private int f52762b;

    public HorizontalSpaceItemDecoration(int i) {
        this.f52762b = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f52761a, false, 54091, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f52761a, false, 54091, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT < 17 || TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
            if (recyclerView2.getChildAdapterPosition(view2) == 0 || recyclerView.getAdapter().getItemCount() <= 1) {
                rect2.left = 0;
            } else {
                rect2.left = this.f52762b;
            }
        } else if (recyclerView2.getChildAdapterPosition(view2) == 0 || recyclerView.getAdapter().getItemCount() <= 1) {
            rect2.right = 0;
        } else {
            rect2.right = this.f52762b;
        }
    }
}
