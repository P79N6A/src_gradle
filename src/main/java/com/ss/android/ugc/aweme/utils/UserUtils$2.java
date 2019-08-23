package com.ss.android.ugc.aweme.utils;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class UserUtils$2 extends AccessibilityDelegateCompat {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75465a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f75466b;

    public UserUtils$2(String str) {
        this.f75466b = str;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfoCompat}, this, f75465a, false, 88683, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfoCompat}, this, f75465a, false, 88683, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
            return;
        }
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(DmtTextView.class.getName());
        if (!TextUtils.isEmpty(this.f75466b)) {
            view.setContentDescription(this.f75466b);
        }
    }
}
