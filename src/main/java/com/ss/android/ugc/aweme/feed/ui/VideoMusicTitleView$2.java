package com.ss.android.ugc.aweme.feed.ui;

import android.support.v4.app.AccessibilityUtil;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.widget.Button;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class VideoMusicTitleView$2 implements AccessibilityUtil.AccessibilityDelegateCallBack {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46346a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ bu f46347b;

    VideoMusicTitleView$2(bu buVar) {
        this.f46347b = buVar;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
        if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfoCompat2}, this, f46346a, false, 43298, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfoCompat2}, this, f46346a, false, 43298, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
            return;
        }
        accessibilityNodeInfoCompat2.setClassName(Button.class.getName());
    }
}
