package com.ss.android.ugc.aweme.im.sdk.utils;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

class AccessibilityUtils$2 extends AccessibilityDelegateCompat {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52451a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ IMUser f52452b;

    AccessibilityUtils$2(IMUser iMUser) {
        this.f52452b = iMUser;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        View view2 = view;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
        if (PatchProxy.isSupport(new Object[]{view2, accessibilityNodeInfoCompat2}, this, f52451a, false, 53313, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, accessibilityNodeInfoCompat2}, this, f52451a, false, 53313, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
            return;
        }
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        view2.setContentDescription(this.f52452b.getDisplayName());
        accessibilityNodeInfoCompat2.setClassName(DmtTextView.class.getName());
    }
}
