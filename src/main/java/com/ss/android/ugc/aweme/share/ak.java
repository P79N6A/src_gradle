package com.ss.android.ugc.aweme.share;

import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.ah;
import java.io.File;

public final /* synthetic */ class ak implements ah.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64639a;

    /* renamed from: b  reason: collision with root package name */
    private final ah f64640b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64641c;

    ak(ah ahVar, a aVar) {
        this.f64640b = ahVar;
        this.f64641c = aVar;
    }

    public final void a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f64639a, false, 73046, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, this, f64639a, false, 73046, new Class[]{File.class}, Void.TYPE);
            return;
        }
        ah ahVar = this.f64640b;
        a aVar = this.f64641c;
        if (file == null) {
            ahVar.f64626c = false;
            return;
        }
        ahVar.b(file);
        ahVar.a(aVar.d(), aVar.f());
    }
}
