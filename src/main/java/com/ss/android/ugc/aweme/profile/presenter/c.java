package com.ss.android.ugc.aweme.profile.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public final /* synthetic */ class c implements ObservableOnSubscribe {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61601a;

    /* renamed from: b  reason: collision with root package name */
    private final b f61602b;

    /* renamed from: c  reason: collision with root package name */
    private final String f61603c;

    c(b bVar, String str) {
        this.f61602b = bVar;
        this.f61603c = str;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        if (PatchProxy.isSupport(new Object[]{observableEmitter}, this, f61601a, false, 67557, new Class[]{ObservableEmitter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observableEmitter}, this, f61601a, false, 67557, new Class[]{ObservableEmitter.class}, Void.TYPE);
            return;
        }
        FeedItemList b2 = this.f61602b.b(this.f61603c);
        if (b2 == null) {
            b2 = new FeedItemList();
        }
        b2.hasMore = 0;
        observableEmitter.onNext(b2);
    }
}
