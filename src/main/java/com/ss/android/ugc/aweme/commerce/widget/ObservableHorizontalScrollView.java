package com.ss.android.ugc.aweme.commerce.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ObservableHorizontalScrollView extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38341a;

    /* renamed from: b  reason: collision with root package name */
    private a f38342b;

    public interface a {
        void a(ObservableHorizontalScrollView observableHorizontalScrollView, int i, int i2, int i3, int i4);
    }

    public ObservableHorizontalScrollView(Context context) {
        super(context);
    }

    public void setScrollViewListener(a aVar) {
        this.f38342b = aVar;
    }

    public ObservableHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservableHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f38341a, false, 30148, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f38341a, false, 30148, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f38342b != null) {
            this.f38342b.a(this, i, i2, i3, i4);
        }
    }
}
