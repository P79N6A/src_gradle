package com.ss.android.ugc.aweme.shortvideo.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.MentionTextView;

public final class f implements MentionTextView.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71301a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f71302b;

    public f(boolean z) {
        this.f71302b = z;
    }

    public final boolean a(TextExtraStruct textExtraStruct) {
        if (PatchProxy.isSupport(new Object[]{textExtraStruct}, this, f71301a, false, 81224, new Class[]{TextExtraStruct.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{textExtraStruct}, this, f71301a, false, 81224, new Class[]{TextExtraStruct.class}, Boolean.TYPE)).booleanValue();
        }
        if (!a.a()) {
            if (this.f71302b || textExtraStruct.getType() != 1) {
                return false;
            }
            return true;
        }
        return false;
    }
}
