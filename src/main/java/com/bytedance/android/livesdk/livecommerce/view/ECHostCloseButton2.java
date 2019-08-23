package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ECHostCloseButton2 extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16246a;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f16246a, false, 10778, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16246a, false, 10778, new Class[0], Void.TYPE);
        } else if (a.a()) {
            setImageResource(2130838616);
        } else {
            setImageResource(2130838615);
        }
    }

    public ECHostCloseButton2(Context context) {
        super(context);
    }

    public ECHostCloseButton2(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ECHostCloseButton2(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
