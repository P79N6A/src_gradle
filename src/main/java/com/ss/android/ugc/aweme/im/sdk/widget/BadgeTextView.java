package com.ss.android.ugc.aweme.im.sdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class BadgeTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52716a;

    public BadgeTextView(Context context) {
        super(context);
    }

    public void setBadgeCount(int i) {
        String valueOf;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52716a, false, 54028, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52716a, false, 54028, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f52716a, true, 54029, new Class[]{Integer.TYPE}, String.class)) {
            valueOf = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f52716a, true, 54029, new Class[]{Integer.TYPE}, String.class);
        } else {
            if (i2 >= 0) {
                if (i2 > 99) {
                    valueOf = "99+";
                } else if (i2 > 0 && i2 <= 99) {
                    valueOf = String.valueOf(i);
                }
            }
            valueOf = null;
        }
        setText(valueOf);
    }

    public BadgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (PatchProxy.isSupport(new Object[]{charSequence, bufferType}, this, f52716a, false, 54030, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence, bufferType}, this, f52716a, false, 54030, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE);
            return;
        }
        if (charSequence == null || charSequence.toString().equalsIgnoreCase(PushConstants.PUSH_TYPE_NOTIFY)) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        super.setText(charSequence, bufferType);
    }

    public BadgeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
