package com.ss.android.ugc.aweme.choosemusic.adapter;

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
    public static ChangeQuickRedirect f35794a;

    @TargetClass
    @Proxy
    static void a(SpannableString spannableString, Object obj, int i, int i2, int i3) {
        SpannableString spannableString2 = spannableString;
        Object obj2 = obj;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{spannableString2, obj2, 9, Integer.valueOf(i2), 33}, null, f35794a, true, 26484, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {spannableString2, obj2, 9, Integer.valueOf(i2), 33};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f35794a, true, 26484, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (9 == i4 && (obj2 instanceof ClickableSpan)) {
            try {
                a.a(Log.getStackTraceString(new Throwable("setSpan")));
            } catch (Exception unused) {
            }
        }
        spannableString2.setSpan(obj2, 9, i4, 33);
    }
}
