package com.ss.android.ugc.aweme.favorites.model;

import com.google.common.a.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.model.d;
import java.util.List;

public final /* synthetic */ class h implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44311a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f44312b;

    /* renamed from: c  reason: collision with root package name */
    private final List f44313c;

    h(boolean z, List list) {
        this.f44312b = z;
        this.f44313c = list;
    }

    public final boolean apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f44311a, false, 39516, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f44311a, false, 39516, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        return this.f44312b || !this.f44313c.contains((d) obj);
    }
}
