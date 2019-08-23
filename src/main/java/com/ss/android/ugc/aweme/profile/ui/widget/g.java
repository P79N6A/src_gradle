package com.ss.android.ugc.aweme.profile.ui.widget;

import android.text.SpannableString;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63147a;

    @TargetClass
    @Proxy
    static void a(SpannableString spannableString, Object obj, int i, int i2, int i3) {
        SpannableString spannableString2 = spannableString;
        Object obj2 = obj;
        int i4 = i;
        int i5 = i2;
        if (PatchProxy.isSupport(new Object[]{spannableString2, obj2, Integer.valueOf(i), Integer.valueOf(i2), 33}, null, f63147a, true, 69811, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {spannableString2, obj2, Integer.valueOf(i), Integer.valueOf(i2), 33};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f63147a, true, 69811, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i4 == i5) {
            try {
                a.a(Log.getStackTraceString(new Throwable("setSpan")));
            } catch (Exception unused) {
            }
        }
        spannableString2.setSpan(obj2, i4, i5, 33);
    }
}
