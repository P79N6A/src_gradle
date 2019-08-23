package com.ss.android.ugc.aweme.story.base.utils;

import android.graphics.Typeface;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71948a;

    /* renamed from: b  reason: collision with root package name */
    static Typeface f71949b;

    public static void a(TextView textView) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2}, null, f71948a, true, 82303, new Class[]{TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2}, null, f71948a, true, 82303, new Class[]{TextView.class}, Void.TYPE);
            return;
        }
        if (f71949b == null) {
            try {
                f71949b = Typeface.createFromAsset(textView.getContext().getAssets(), "DIN-BoldItalic.otf");
            } catch (Exception unused) {
            }
        }
        if (f71949b != null) {
            textView2.setTypeface(f71949b);
        }
    }
}
