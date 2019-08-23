package com.ss.android.ugc.aweme.share;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.ax;
import java.io.File;

public final /* synthetic */ class ba implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64709a;

    /* renamed from: b  reason: collision with root package name */
    private final ax f64710b;

    /* renamed from: c  reason: collision with root package name */
    private final ax.a f64711c;

    ba(ax axVar, ax.a aVar) {
        this.f64710b = axVar;
        this.f64711c = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f64709a, false, 73092, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f64709a, false, 73092, new Class[]{i.class}, Object.class);
        }
        ax axVar = this.f64710b;
        this.f64711c.a((File) iVar.e());
        axVar.f64685c = false;
        return null;
    }
}
