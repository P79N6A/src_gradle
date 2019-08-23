package com.ss.android.ugc.aweme.poi.ui.comment;

import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.model.o;
import com.ss.android.ugc.aweme.poi.widget.ExpandableTextView;

public final /* synthetic */ class d implements ExpandableTextView.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60619a;

    /* renamed from: b  reason: collision with root package name */
    private final o f60620b;

    public d(o oVar) {
        this.f60620b = oVar;
    }

    public final void a(TextView textView, boolean z) {
        if (PatchProxy.isSupport(new Object[]{textView, Byte.valueOf(z ? (byte) 1 : 0)}, this, f60619a, false, 66288, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView, Byte.valueOf(z)}, this, f60619a, false, 66288, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f60620b.expand = z;
    }
}
