package com.ss.android.ugc.aweme.discover.ui.a;

import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43096a;

    @TargetClass
    @Proxy
    static void a(SpannableString spannableString, Object obj, int i, int i2, int i3) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{spannableString, obj2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f43096a, true, 38143, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{spannableString, obj2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f43096a, true, 38143, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i != i2 || !(obj2 instanceof ClickableSpan)) {
            int i4 = i3;
        } else if (i3 == 33) {
            try {
                a.a(Log.getStackTraceString(new Throwable("setSpan")));
            } catch (Exception unused) {
            }
        }
        spannableString.setSpan(obj, i, i2, i3);
    }
}
