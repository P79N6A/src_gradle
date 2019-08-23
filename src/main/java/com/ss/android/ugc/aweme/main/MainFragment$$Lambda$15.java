package com.ss.android.ugc.aweme.main;

import android.support.v4.app.AccessibilityUtil;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.widget.Button;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class MainFragment$$Lambda$15 implements AccessibilityUtil.AccessibilityDelegateCallBack {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54184a;

    /* renamed from: b  reason: collision with root package name */
    static final AccessibilityUtil.AccessibilityDelegateCallBack f54185b = new MainFragment$$Lambda$15();

    private MainFragment$$Lambda$15() {
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
        if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfoCompat2}, this, f54184a, false, 57331, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfoCompat2}, this, f54184a, false, 57331, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
            return;
        }
        accessibilityNodeInfoCompat2.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat2.setSelected(false);
        accessibilityNodeInfoCompat2.setContentDescription("live");
    }
}
