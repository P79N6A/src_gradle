package com.ss.android.ugc.aweme.main.base.tab;

import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class BadgeTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54462a;

    public void setBadgeCount(int i) {
        String str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54462a, false, 57889, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54462a, false, 57889, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f54462a, true, 57890, new Class[]{Integer.TYPE}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f54462a, true, 57890, new Class[]{Integer.TYPE}, String.class);
        } else if (i2 < 0) {
            str = "New";
        } else if (i2 > 99) {
            str = "99+";
        } else if (i2 <= 0 || i2 > 99) {
            str = null;
        } else {
            str = String.valueOf(i);
        }
        setText(str);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (PatchProxy.isSupport(new Object[]{charSequence, bufferType}, this, f54462a, false, 57891, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence, bufferType}, this, f54462a, false, 57891, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE);
            return;
        }
        if (charSequence == null || charSequence.toString().equalsIgnoreCase(PushConstants.PUSH_TYPE_NOTIFY)) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        super.setText(charSequence, bufferType);
    }
}
