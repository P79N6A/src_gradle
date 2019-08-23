package com.ss.android.ugc.aweme.feed.ui;

import android.support.v4.app.AccessibilityUtil;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.widget.Button;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

class VideoMusicCoverView$2 implements AccessibilityUtil.AccessibilityDelegateCallBack {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46344a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ bt f46345b;

    VideoMusicCoverView$2(bt btVar) {
        this.f46345b = btVar;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
        if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfoCompat2}, this, f46344a, false, 43282, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfoCompat2}, this, f46344a, false, 43282, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
            return;
        }
        accessibilityNodeInfoCompat2.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat2.setContentDescription(this.f46345b.h.getString(C0906R.string.bef));
    }
}
