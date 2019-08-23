package com.ss.android.ugc.aweme.crossplatform.platform.rn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.params.base.a;
import com.ss.android.ugc.aweme.crossplatform.platform.rn.e;
import java.io.File;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class g implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40861a;

    /* renamed from: b  reason: collision with root package name */
    private final e f40862b;

    /* renamed from: c  reason: collision with root package name */
    private final e.a f40863c;

    /* renamed from: d  reason: collision with root package name */
    private final String f40864d;

    /* renamed from: e  reason: collision with root package name */
    private final a f40865e;

    /* renamed from: f  reason: collision with root package name */
    private final e.b f40866f;
    private final boolean g;
    private final long h;

    g(e eVar, e.a aVar, String str, a aVar2, e.b bVar, boolean z, long j) {
        this.f40862b = eVar;
        this.f40863c = aVar;
        this.f40864d = str;
        this.f40865e = aVar2;
        this.f40866f = bVar;
        this.g = z;
        this.h = j;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f40861a, false, 34355, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f40861a, false, 34355, new Class[]{Object.class}, Object.class);
        }
        return this.f40862b.a(this.f40863c, this.f40864d, this.f40865e, this.f40866f, this.g, this.h, (File) obj);
    }
}
