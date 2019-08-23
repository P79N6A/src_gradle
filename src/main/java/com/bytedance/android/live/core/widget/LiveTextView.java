package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.bytedance.android.live.core.utils.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LiveTextView extends AppCompatTextView {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f8351b;

    /* renamed from: c  reason: collision with root package name */
    protected static j f8352c;

    /* renamed from: d  reason: collision with root package name */
    protected static boolean f8353d;

    public static void setEnableHostTypeface(boolean z) {
        f8353d = z;
    }

    public static void setFontManager(j jVar) {
        f8352c = jVar;
    }

    public LiveTextView(Context context) {
        this(context, null);
    }

    private void a(AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{attributeSet2}, this, f8351b, false, 1508, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet2}, this, f8351b, false, 1508, new Class[]{AttributeSet.class}, Void.TYPE);
        } else if (f8353d && attributeSet2 != null) {
            int attributeIntValue = attributeSet2.getAttributeIntValue("http://schemas.android.com/apk/res/android", "textStyle", 0);
            if (f8352c != null) {
                Typeface a2 = f8352c.a(attributeIntValue);
                if (a2 != null) {
                    setTypeface(a2);
                }
            }
        }
    }

    public LiveTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public LiveTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }
}
