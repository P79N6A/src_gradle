package com.ss.android.ugc.aweme.main.story;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54913a;

    /* renamed from: b  reason: collision with root package name */
    private final HorizontalFeeder f54914b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54915c;

    /* renamed from: d  reason: collision with root package name */
    private final String f54916d;

    c(HorizontalFeeder horizontalFeeder, String str, String str2) {
        this.f54914b = horizontalFeeder;
        this.f54915c = str;
        this.f54916d = str2;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f54913a, false, 58194, new Class[]{i.class}, Object.class)) {
            return this.f54914b.a(this.f54915c, this.f54916d, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f54913a, false, 58194, new Class[]{i.class}, Object.class);
    }
}
