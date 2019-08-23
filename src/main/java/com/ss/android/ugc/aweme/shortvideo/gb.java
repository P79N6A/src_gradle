package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fz;
import com.ss.android.ugc.aweme.tools.au;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class gb implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67877a;

    /* renamed from: b  reason: collision with root package name */
    private final fz.AnonymousClass1 f67878b;

    /* renamed from: c  reason: collision with root package name */
    private final fh f67879c;

    /* renamed from: d  reason: collision with root package name */
    private final au f67880d;

    gb(fz.AnonymousClass1 r1, fh fhVar, au auVar) {
        this.f67878b = r1;
        this.f67879c = fhVar;
        this.f67880d = auVar;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67877a, false, 74720, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f67877a, false, 74720, new Class[]{Object.class}, Object.class);
        }
        fz.AnonymousClass1 r0 = this.f67878b;
        fz.this.f67830b.runOnUiThread(new gc(r0, (Integer) obj, this.f67879c, this.f67880d));
        return Unit.INSTANCE;
    }
}
