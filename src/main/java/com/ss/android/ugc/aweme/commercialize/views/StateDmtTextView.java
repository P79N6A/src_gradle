package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class StateDmtTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40004a;

    /* renamed from: b  reason: collision with root package name */
    private a f40005b;

    public interface a {
        void a();
    }

    public void drawableStateChanged() {
        if (PatchProxy.isSupport(new Object[0], this, f40004a, false, 32995, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40004a, false, 32995, new Class[0], Void.TYPE);
            return;
        }
        super.drawableStateChanged();
        a aVar = this.f40005b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public StateDmtTextView(Context context) {
        super(context);
    }

    public void setOnStateChangedListener(a aVar) {
        this.f40005b = aVar;
    }

    public StateDmtTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StateDmtTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
