package com.ss.android.ugc.aweme.main;

import android.support.v4.app.AccessibilityUtil;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.widget.Button;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class MainFragment$$Lambda$14 implements AccessibilityUtil.AccessibilityDelegateCallBack {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54182a;

    /* renamed from: b  reason: collision with root package name */
    private final MainFragment f54183b;

    MainFragment$$Lambda$14(MainFragment mainFragment) {
        this.f54183b = mainFragment;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
        if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfoCompat2}, this, f54182a, false, 57330, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfoCompat2}, this, f54182a, false, 57330, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
            return;
        }
        MainFragment mainFragment = this.f54183b;
        accessibilityNodeInfoCompat2.setClassName(Button.class.getName());
        if (mainFragment.getActivity() != null) {
            accessibilityNodeInfoCompat2.setContentDescription(mainFragment.getActivity().getString(C0906R.string.c1z));
        }
    }
}
