package com.ss.android.ugc.aweme.friends.adapter;

import android.text.SpannableString;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48784a;

    @TargetClass
    @Proxy
    static void a(SpannableString spannableString, Object obj, int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{spannableString, obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f48784a, true, 46249, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{spannableString, obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f48784a, true, 46249, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        spannableString.setSpan(obj, i, i2, i3);
    }
}
