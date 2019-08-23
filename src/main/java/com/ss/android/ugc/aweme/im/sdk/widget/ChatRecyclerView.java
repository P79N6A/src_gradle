package com.ss.android.ugc.aweme.im.sdk.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ChatRecyclerView extends RecyclerView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52717a;

    /* renamed from: b  reason: collision with root package name */
    int f52718b;

    /* renamed from: c  reason: collision with root package name */
    LinearLayoutManager f52719c;

    public ChatRecyclerView(Context context) {
        this(context, null);
    }

    public ChatRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChatRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f52717a, false, 54031, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f52717a, false, 54031, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.f52719c == null) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                this.f52719c = (LinearLayoutManager) layoutManager;
            }
        }
        if (this.f52719c != null && !this.f52719c.getStackFromEnd()) {
            int findLastVisibleItemPosition = this.f52719c.findLastVisibleItemPosition();
            if (findLastVisibleItemPosition >= 0) {
                View findViewByPosition = this.f52719c.findViewByPosition(findLastVisibleItemPosition);
                if (findViewByPosition != null) {
                    int i5 = ((RecyclerView.LayoutParams) findViewByPosition.getLayoutParams()).topMargin;
                    int top = findViewByPosition.getTop();
                    if (top > i5 && this.f52718b == 0) {
                        this.f52718b = i5 - top;
                        this.f52719c.offsetChildrenVertical(this.f52718b);
                        this.f52719c.setStackFromEnd(true);
                    }
                }
            }
        }
    }
}
