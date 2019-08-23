package com.ss.android.ugc.aweme.share;

import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.ao;
import java.io.File;

public final /* synthetic */ class aq implements ao.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64667a;

    /* renamed from: b  reason: collision with root package name */
    private final ao f64668b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64669c;

    aq(ao aoVar, a aVar) {
        this.f64668b = aoVar;
        this.f64669c = aVar;
    }

    public final void a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f64667a, false, 73066, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, this, f64667a, false, 73066, new Class[]{File.class}, Void.TYPE);
            return;
        }
        ao aoVar = this.f64668b;
        a aVar = this.f64669c;
        if (file == null) {
            aoVar.f64656c = false;
            return;
        }
        aoVar.b(file);
        aoVar.a(aVar.d(), aVar.f());
    }
}
