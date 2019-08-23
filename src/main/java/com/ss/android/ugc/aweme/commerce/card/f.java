package com.ss.android.ugc.aweme.commerce.card;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.promotion.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public final /* synthetic */ class f implements ObservableOnSubscribe {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36832a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceGoodHalfCardContainer f36833b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f36834c;

    public f(CommerceGoodHalfCardContainer commerceGoodHalfCardContainer, Aweme aweme) {
        this.f36833b = commerceGoodHalfCardContainer;
        this.f36834c = aweme;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        if (PatchProxy.isSupport(new Object[]{observableEmitter}, this, f36832a, false, 28034, new Class[]{ObservableEmitter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observableEmitter}, this, f36832a, false, 28034, new Class[]{ObservableEmitter.class}, Void.TYPE);
            return;
        }
        CommerceGoodHalfCardContainer commerceGoodHalfCardContainer = this.f36833b;
        Aweme aweme = this.f36834c;
        a.f37668b.a(aweme.getAid(), aweme.getAuthorUid(), new g(observableEmitter), new h(commerceGoodHalfCardContainer, observableEmitter));
    }
}
