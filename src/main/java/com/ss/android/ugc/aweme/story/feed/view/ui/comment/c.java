package com.ss.android.ugc.aweme.story.feed.view.ui.comment;

import android.text.SpannableString;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72884a;

    @TargetClass
    @Proxy
    static void a(SpannableString spannableString, Object obj, int i, int i2, int i3) {
        SpannableString spannableString2 = spannableString;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{spannableString2, obj2, Integer.valueOf(i), Integer.valueOf(i2), 17}, null, f72884a, true, 84182, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {spannableString2, obj2, Integer.valueOf(i), Integer.valueOf(i2), 17};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f72884a, true, 84182, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        spannableString2.setSpan(obj2, i, i2, 17);
    }
}
