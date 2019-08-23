package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.h.b;

public class ScaleOnTouchTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65399a;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65399a, false, 74527, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65399a, false, 74527, new Class[0], Void.TYPE);
            return;
        }
        setOnTouchListener(new b(1.2f, 200, null));
    }

    public ScaleOnTouchTextView(Context context) {
        super(context);
        a();
    }

    public ScaleOnTouchTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ScaleOnTouchTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
