package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class HotSearchClipLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76366a;

    /* renamed from: b  reason: collision with root package name */
    Path f76367b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private int f76368c;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76366a, false, 89533, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76366a, false, 89533, new Class[0], Void.TYPE);
            return;
        }
        this.f76368c = (int) UIUtils.dip2Px(getContext(), 12.0f);
    }

    public HotSearchClipLinearLayout(Context context) {
        super(context);
        a();
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f76366a, false, 89534, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f76366a, false, 89534, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        this.f76367b.reset();
        this.f76367b.addRoundRect(new RectF(0.0f, (float) ((getMeasuredHeight() / 2) - this.f76368c), (float) getMeasuredWidth(), (float) ((getMeasuredHeight() / 2) + this.f76368c)), (float) this.f76368c, (float) this.f76368c, Path.Direction.CW);
        canvas.clipPath(this.f76367b);
    }

    public HotSearchClipLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public HotSearchClipLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
