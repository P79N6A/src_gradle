package com.ss.android.ugc.aweme.imported;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.i18n.c;

public class FakeBoldTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52908a;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52908a, false, 54454, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52908a, false, 54454, new Class[0], Void.TYPE);
            return;
        }
        if (getPaint() != null && c.a()) {
            getPaint().setFakeBoldText(true);
        }
    }

    public FakeBoldTextView(Context context) {
        super(context);
        a();
    }

    public FakeBoldTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public FakeBoldTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
