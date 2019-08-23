package com.bytedance.android.live.core.utils;

import android.app.Dialog;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.bugly.CrashModule;
import java.lang.reflect.Field;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8253a;

    public static void a(Dialog dialog) {
        Dialog dialog2 = dialog;
        if (PatchProxy.isSupport(new Object[]{dialog2}, null, f8253a, true, CrashModule.MODULE_ID, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialog2}, null, f8253a, true, CrashModule.MODULE_ID, new Class[]{Dialog.class}, Void.TYPE);
        } else if (dialog2 != null) {
            try {
                Field declaredField = dialog.getClass().getDeclaredField("mAlert");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(dialog2);
                Field declaredField2 = obj.getClass().getDeclaredField("mTitleView");
                declaredField2.setAccessible(true);
                ((TextView) declaredField2.get(obj)).setSingleLine(false);
            } catch (Exception unused) {
            }
        }
    }
}
