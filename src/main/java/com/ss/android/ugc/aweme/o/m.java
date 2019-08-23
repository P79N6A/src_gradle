package com.ss.android.ugc.aweme.o;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.b.a.b;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.shortvideo.o.a;

public final /* synthetic */ class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58297a;

    /* renamed from: b  reason: collision with root package name */
    private final b f58298b;

    m(b bVar) {
        this.f58298b = bVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f58297a, false, 54609, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f58297a, false, 54609, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f58298b;
        ChallengeDetail challengeDetail = (ChallengeDetail) obj;
        if (!(challengeDetail == null || challengeDetail.challenge == null)) {
            bVar.accept(new a().apply(challengeDetail.challenge));
        }
    }
}
