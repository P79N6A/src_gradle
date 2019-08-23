package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract /* synthetic */ class am {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12979a;

    public static String a(al alVar) {
        if (!PatchProxy.isSupport(new Object[]{alVar}, null, f12979a, true, 6925, new Class[]{al.class}, String.class)) {
            return alVar.getClass().getName();
        }
        return (String) PatchProxy.accessDispatch(new Object[]{alVar}, null, f12979a, true, 6925, new Class[]{al.class}, String.class);
    }

    @SuppressLint({"InflateParams", "SetTextI18n"})
    public static void a(@NonNull al alVar, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{alVar, th}, null, f12979a, true, 6926, new Class[]{al.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{alVar, th}, null, f12979a, true, 6926, new Class[]{al.class, Throwable.class}, Void.TYPE);
            return;
        }
        a.a(6, alVar.a(), th.getStackTrace());
    }
}
