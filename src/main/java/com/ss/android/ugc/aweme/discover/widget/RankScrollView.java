package com.ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class RankScrollView extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43309a;

    /* renamed from: b  reason: collision with root package name */
    private a f43310b;

    public interface a {
        void a(int i);
    }

    public RankScrollView(Context context) {
        super(context);
    }

    public void setOnScrollListener(a aVar) {
        this.f43310b = aVar;
    }

    public RankScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RankScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f43309a, false, 38264, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f43309a, false, 38264, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f43310b != null) {
            int i5 = i;
            this.f43310b.a(i);
        }
    }
}
