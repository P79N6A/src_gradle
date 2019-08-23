package com.ss.android.ugc.aweme.challenge.c;

import android.text.TextUtils;
import com.google.common.a.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.model.SearchChallenge;
import com.ss.android.ugc.aweme.challenge.model.SearchChallengeList;

public final /* synthetic */ class f implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35378a;

    /* renamed from: b  reason: collision with root package name */
    private final e f35379b;

    f(e eVar) {
        this.f35379b = eVar;
    }

    public final boolean apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f35378a, false, 25882, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f35378a, false, 25882, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        SearchChallenge searchChallenge = (SearchChallenge) obj;
        return TextUtils.equals(searchChallenge.challenge == null ? null : searchChallenge.challenge.getChallengeName(), ((SearchChallengeList) this.f35379b.mData).keyword);
    }
}
