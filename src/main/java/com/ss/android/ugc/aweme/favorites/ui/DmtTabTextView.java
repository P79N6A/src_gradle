package com.ss.android.ugc.aweme.favorites.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;

public class DmtTabTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44320a;

    public DmtTabTextView(Context context) {
        super(context);
    }

    public final void a(AttributeSet attributeSet) {
        if (PatchProxy.isSupport(new Object[]{attributeSet}, this, f44320a, false, 39558, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet}, this, f44320a, false, 39558, new Class[]{AttributeSet.class}, Void.TYPE);
            return;
        }
        super.a(attributeSet);
    }

    public void setSelected(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f44320a, false, 39559, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f44320a, false, 39559, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setSelected(z);
        if (z) {
            str = c.g;
        } else {
            str = c.f20594a;
        }
        setFontType(str);
        if (!a.a()) {
            if (z) {
                getPaint().setFakeBoldText(true);
                setTextColor(getResources().getColor(C0906R.color.a6i));
                return;
            }
            getPaint().setFakeBoldText(false);
            setTextColor(getResources().getColor(C0906R.color.p2));
        }
    }
}
