package com.ss.android.ugc.aweme.face2face.ui;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class Face2FaceFriendsItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44050a;

    /* renamed from: b  reason: collision with root package name */
    private int f44051b;

    public Face2FaceFriendsItemDecoration(int i) {
        this.f44051b = i;
    }

    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f44050a, false, 39248, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            Object[] objArr = {rect2, view2, recyclerView2, state};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f44050a, false, 39248, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
        } else if (recyclerView2.getChildAdapterPosition(view2) == 0) {
            rect2.set(0, 0, 0, 0);
        } else {
            rect2.set(0, this.f44051b, 0, 0);
        }
    }
}
