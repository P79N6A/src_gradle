package com.bytedance.ies.dmt.ui.common.rebranding;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.dmt.ui.common.rebranding.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;

public class NiceWidthTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public b f20317a;

    public NiceWidthTextView(Context context) {
        super(context);
    }

    public final NiceWidthTextView a(b bVar) {
        this.f20317a = bVar;
        return this;
    }

    public NiceWidthTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f20317a != null) {
            a.C0186a a2 = a.a(this.f20317a.getClass());
            if (a2 == null || !a2.f20321a) {
                i3 = this.f20317a.a(this);
                a.a(this.f20317a.getClass(), new a.C0186a(i3));
            } else {
                i3 = a2.f20322b;
            }
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public NiceWidthTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
