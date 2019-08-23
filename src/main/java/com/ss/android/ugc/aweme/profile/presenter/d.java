package com.ss.android.ugc.aweme.profile.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public final /* synthetic */ class d implements ObservableOnSubscribe {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61604a;

    /* renamed from: b  reason: collision with root package name */
    private final b f61605b;

    /* renamed from: c  reason: collision with root package name */
    private final String f61606c;

    /* renamed from: d  reason: collision with root package name */
    private final Aweme f61607d;

    public d(b bVar, String str, Aweme aweme) {
        this.f61605b = bVar;
        this.f61606c = str;
        this.f61607d = aweme;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        if (PatchProxy.isSupport(new Object[]{observableEmitter}, this, f61604a, false, 67558, new Class[]{ObservableEmitter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observableEmitter}, this, f61604a, false, 67558, new Class[]{ObservableEmitter.class}, Void.TYPE);
            return;
        }
        b bVar = this.f61605b;
        String str = this.f61606c;
        Aweme aweme = this.f61607d;
        FeedItemList b2 = bVar.b(str);
        if (!(b2 == null || b2.items == null)) {
            b2.items.remove(aweme);
            bVar.a(b2, str);
        }
    }
}
