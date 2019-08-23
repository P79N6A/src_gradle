package com.ss.android.ugc.aweme.friends.ui;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/ui/ButtonAccessibilityDelegate;", "Landroid/view/View$AccessibilityDelegate;", "()V", "onInitializeAccessibilityNodeInfo", "", "host", "Landroid/view/View;", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49387a;

    public final void onInitializeAccessibilityNodeInfo(@Nullable View view, @Nullable AccessibilityNodeInfo accessibilityNodeInfo) {
        AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
        if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfo2}, this, f49387a, false, 47057, new Class[]{View.class, AccessibilityNodeInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfo2}, this, f49387a, false, 47057, new Class[]{View.class, AccessibilityNodeInfo.class}, Void.TYPE);
            return;
        }
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (accessibilityNodeInfo2 != null) {
            accessibilityNodeInfo2.setClassName(Button.class.getName());
        }
    }
}
