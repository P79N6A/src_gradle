package com.ss.android.ugc.aweme.shortvideo.ui;

import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70915a;

    public static void a(TextView textView, int i, int i2, int i3, int i4) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(c.f69428f), Integer.valueOf(i4)}, null, f70915a, true, 80242, new Class[]{TextView.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(c.f69428f), Integer.valueOf(i4)}, null, f70915a, true, 80242, new Class[]{TextView.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        float f2 = ((float) i2) / ((float) i);
        textView2.setScaleX(f2);
        textView2.setScaleY(f2);
        textView2.setTextColor(i4);
    }
}
