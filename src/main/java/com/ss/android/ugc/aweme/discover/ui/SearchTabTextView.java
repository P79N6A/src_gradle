package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SearchTabTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43044a;

    public SearchTabTextView(Context context) {
        super(context);
    }

    public void setSelected(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43044a, false, 38081, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43044a, false, 38081, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setSelected(z);
        if (z) {
            getPaint().setFakeBoldText(true);
        } else {
            getPaint().setFakeBoldText(false);
        }
    }

    public SearchTabTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
