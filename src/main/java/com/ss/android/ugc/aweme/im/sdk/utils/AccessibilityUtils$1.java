package com.ss.android.ugc.aweme.im.sdk.utils;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class AccessibilityUtils$1 extends AccessibilityDelegateCompat {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52449a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f52450b;

    AccessibilityUtils$1(String str) {
        this.f52450b = str;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfoCompat}, this, f52449a, false, 53312, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfoCompat}, this, f52449a, false, 53312, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
            return;
        }
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (!TextUtils.isEmpty(this.f52450b)) {
            view.setContentDescription(this.f52450b);
        }
        accessibilityNodeInfoCompat.setClassName(DmtTextView.class.getName());
    }
}
