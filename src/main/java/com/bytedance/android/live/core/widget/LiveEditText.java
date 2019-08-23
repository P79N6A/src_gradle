package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import com.bytedance.android.live.core.utils.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LiveEditText extends AppCompatEditText {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8348a;

    /* renamed from: b  reason: collision with root package name */
    protected static j f8349b;

    /* renamed from: c  reason: collision with root package name */
    protected static boolean f8350c;

    public static void setEnableHostTypeface(boolean z) {
        f8350c = z;
    }

    public static void setFontManager(j jVar) {
        f8349b = jVar;
    }

    public LiveEditText(Context context) {
        this(context, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{attributeSet2}, this, f8348a, false, 1507, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet2}, this, f8348a, false, 1507, new Class[]{AttributeSet.class}, Void.TYPE);
            return;
        }
        if (f8350c && attributeSet2 != null) {
            int attributeIntValue = attributeSet2.getAttributeIntValue("http://schemas.android.com/apk/res/android", "textStyle", 0);
            if (f8349b != null) {
                Typeface a2 = f8349b.a(attributeIntValue);
                if (a2 != null) {
                    setTypeface(a2);
                }
            }
        }
    }

    public LiveEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
