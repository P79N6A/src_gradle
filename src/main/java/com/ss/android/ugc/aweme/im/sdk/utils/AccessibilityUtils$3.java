package com.ss.android.ugc.aweme.im.sdk.utils;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class AccessibilityUtils$3 extends AccessibilityDelegateCompat {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52453a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f52454b;

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfoCompat}, this, f52453a, false, 53314, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfoCompat}, this, f52453a, false, 53314, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
            return;
        }
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (!TextUtils.isEmpty(this.f52454b)) {
            view.setContentDescription(this.f52454b);
        }
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }
}
