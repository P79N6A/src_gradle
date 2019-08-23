package com.bytedance.android.livesdk.browser;

import android.support.v4.view.accessibility.AccessibilityManagerCompat;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Method;

class WebViewTweaker$1 extends AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9276a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AccessibilityManager f9277b;

    public final void onAccessibilityStateChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f9276a, false, 3389, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f9276a, false, 3389, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Logger.debug();
        if (z) {
            AccessibilityManager accessibilityManager = this.f9277b;
            if (PatchProxy.isSupport(new Object[]{accessibilityManager, (byte) 0}, null, b.f9296a, true, 3388, new Class[]{AccessibilityManager.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{accessibilityManager, (byte) 0}, null, b.f9296a, true, 3388, new Class[]{AccessibilityManager.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Class<AccessibilityManager> cls = AccessibilityManager.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setAccessibilityState", new Class[]{Boolean.TYPE});
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(accessibilityManager, new Object[]{Boolean.FALSE});
                }
            } catch (Throwable unused) {
            }
        }
    }
}
