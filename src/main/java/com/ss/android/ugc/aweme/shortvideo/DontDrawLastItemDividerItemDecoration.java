package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class DontDrawLastItemDividerItemDecoration extends DividerItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65335a;

    public DontDrawLastItemDividerItemDecoration(Context context, int i) {
        super(context, 1);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{rect, view, recyclerView, state}, this, f65335a, false, 74083, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            Object[] objArr = {rect, view, recyclerView, state};
            PatchProxy.accessDispatch(objArr, this, f65335a, false, 74083, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
    }
}
