package com.ss.android.ugc.aweme.forward.vh;

import com.facebook.drawee.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements a.C0260a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48403a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseForwardViewHolder f48404b;

    b(BaseForwardViewHolder baseForwardViewHolder) {
        this.f48404b = baseForwardViewHolder;
    }

    public final boolean onClick() {
        if (PatchProxy.isSupport(new Object[0], this, f48403a, false, 45598, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48403a, false, 45598, new Class[0], Boolean.TYPE)).booleanValue();
        }
        BaseForwardViewHolder baseForwardViewHolder = this.f48404b;
        baseForwardViewHolder.f48318c.b(baseForwardViewHolder.mAuthorNameView, baseForwardViewHolder.itemView, baseForwardViewHolder.f48319d, baseForwardViewHolder.f48319d.getAuthor());
        return false;
    }
}
