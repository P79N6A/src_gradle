package com.ss.android.ugc.aweme.story.feed.view.profile.trans;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ProfileItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72791a;

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{canvas, recyclerView, state}, this, f72791a, false, 84083, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas, recyclerView, state}, this, f72791a, false, 84083, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas, recyclerView, state);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{rect, view, recyclerView, state}, this, f72791a, false, 84082, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            Object[] objArr = {rect, view, recyclerView, state};
            PatchProxy.accessDispatch(objArr, this, f72791a, false, 84082, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
    }
}
