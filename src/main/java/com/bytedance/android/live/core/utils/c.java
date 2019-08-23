package com.bytedance.android.live.core.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8249a;

    /* renamed from: b  reason: collision with root package name */
    private static CharSequence f8250b;

    public static void a(CharSequence charSequence) throws Exception {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, null, f8249a, true, 959, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, null, f8249a, true, 959, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        f8250b = charSequence2;
        ((ClipboardManager) ac.e().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(charSequence2, charSequence2));
    }
}
