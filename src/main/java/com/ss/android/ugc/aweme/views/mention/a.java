package com.ss.android.ugc.aweme.views.mention;

import android.text.Editable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import java.util.Comparator;

public final /* synthetic */ class a implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76510a;

    /* renamed from: b  reason: collision with root package name */
    private final Editable f76511b;

    a(Editable editable) {
        this.f76511b = editable;
    }

    public final int compare(Object obj, Object obj2) {
        if (PatchProxy.isSupport(new Object[]{obj, obj2}, this, f76510a, false, 89733, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f76510a, false, 89733, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
        }
        Editable editable = this.f76511b;
        return editable.getSpanStart((MentionEditText.c) obj) - editable.getSpanStart((MentionEditText.c) obj2);
    }
}
