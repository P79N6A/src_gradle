package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.view.c;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74243a;

    /* renamed from: b  reason: collision with root package name */
    private final c f74244b;

    /* renamed from: c  reason: collision with root package name */
    private final c f74245c;

    /* renamed from: d  reason: collision with root package name */
    private final String f74246d;

    e(c cVar, c cVar2, String str) {
        this.f74244b = cVar;
        this.f74245c = cVar2;
        this.f74246d = str;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f74243a, false, 86201, new Class[]{i.class}, Object.class)) {
            return this.f74244b.a(this.f74245c, this.f74246d, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f74243a, false, 86201, new Class[]{i.class}, Object.class);
    }
}
