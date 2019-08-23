package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ECHostOpenDetailTextButton extends AppCompatTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16259a;

    public ECHostOpenDetailTextButton(Context context) {
        super(context);
    }

    public void setEnabled(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f16259a, false, 10788, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f16259a, false, 10788, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setEnabled(z);
        if (a.a()) {
            if (isEnabled()) {
                setBackgroundResource(2130838630);
            } else {
                setBackgroundResource(2130838632);
            }
        } else if (isEnabled()) {
            setBackgroundResource(2130838629);
        } else {
            setBackgroundResource(2130838631);
        }
    }

    public ECHostOpenDetailTextButton(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ECHostOpenDetailTextButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
