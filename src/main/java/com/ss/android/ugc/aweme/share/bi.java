package com.ss.android.ugc.aweme.share;

import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.bh;
import java.io.File;

public final /* synthetic */ class bi implements bh.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64789a;

    /* renamed from: b  reason: collision with root package name */
    private final bh f64790b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64791c;

    bi(bh bhVar, a aVar) {
        this.f64790b = bhVar;
        this.f64791c = aVar;
    }

    public final void a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f64789a, false, 73156, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, this, f64789a, false, 73156, new Class[]{File.class}, Void.TYPE);
            return;
        }
        bh bhVar = this.f64790b;
        a aVar = this.f64791c;
        if (file == null) {
            bhVar.f64781c = false;
            return;
        }
        bhVar.b(file);
        bhVar.a(aVar.d(), aVar.f());
    }
}
