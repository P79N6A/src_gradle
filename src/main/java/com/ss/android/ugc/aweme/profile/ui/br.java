package com.ss.android.ugc.aweme.profile.ui;

import android.text.SpannableString;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class br {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62546a;

    @TargetClass
    @Proxy
    static void a(SpannableString spannableString, Object obj, int i, int i2, int i3) {
        SpannableString spannableString2 = spannableString;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{spannableString2, obj2, 0, Integer.valueOf(i2), 18}, null, f62546a, true, 68585, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {spannableString2, obj2, 0, Integer.valueOf(i2), 18};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f62546a, true, 68585, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        spannableString2.setSpan(obj2, 0, i2, 18);
    }
}
