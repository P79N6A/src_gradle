package com.ss.android.ugc.aweme.shortvideo.sticker;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69486a;

    /* renamed from: b  reason: collision with root package name */
    private final a f69487b;

    /* renamed from: c  reason: collision with root package name */
    private final String f69488c;

    c(a aVar, String str) {
        this.f69487b = aVar;
        this.f69488c = str;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f69486a, false, 78543, new Class[]{i.class}, Object.class)) {
            return this.f69487b.a(this.f69488c, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f69486a, false, 78543, new Class[]{i.class}, Object.class);
    }
}
