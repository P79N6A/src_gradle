package com.ss.android.ugc.aweme.d;

import android.text.SpannableString;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41086a;

    @TargetClass
    @Proxy
    static void a(SpannableString spannableString, Object obj, int i, int i2, int i3) {
        SpannableString spannableString2 = spannableString;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{spannableString2, obj2, 1, 16, 33}, null, f41086a, true, 25645, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {spannableString2, obj2, 1, 16, 33};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f41086a, true, 25645, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        spannableString2.setSpan(obj2, 1, 16, 33);
    }
}