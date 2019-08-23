package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.a.q;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import java.io.File;
import java.util.concurrent.TimeUnit;

public final class gt implements k<SynthetiseResult> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67958a;

    /* renamed from: b  reason: collision with root package name */
    File f67959b;

    /* renamed from: c  reason: collision with root package name */
    long f67960c;

    /* renamed from: d  reason: collision with root package name */
    q f67961d = q.b();

    public final void onFailure(Throwable th) {
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
        if (PatchProxy.isSupport(new Object[]{synthetiseResult}, this, f67958a, false, 74759, new Class[]{SynthetiseResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{synthetiseResult}, this, f67958a, false, 74759, new Class[]{SynthetiseResult.class}, Void.TYPE);
            return;
        }
        long a2 = this.f67961d.a(TimeUnit.MILLISECONDS);
        if (this.f67959b.exists()) {
            float f2 = (float) a2;
            n.a("aweme_movie_publish", "process_time", f2);
            n.a("aweme_movie_publish", "process_speed", ((float) this.f67960c) / f2);
        }
    }

    public gt(String str, long j) {
        this.f67959b = new File(str);
        this.f67960c = j;
    }
}
