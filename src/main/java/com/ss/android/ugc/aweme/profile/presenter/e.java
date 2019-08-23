package com.ss.android.ugc.aweme.profile.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.util.ArrayList;

public final /* synthetic */ class e implements ObservableOnSubscribe {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61608a;

    /* renamed from: b  reason: collision with root package name */
    private final b f61609b;

    /* renamed from: c  reason: collision with root package name */
    private final String f61610c;

    /* renamed from: d  reason: collision with root package name */
    private final Aweme f61611d;

    public e(b bVar, String str, Aweme aweme) {
        this.f61609b = bVar;
        this.f61610c = str;
        this.f61611d = aweme;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        if (PatchProxy.isSupport(new Object[]{observableEmitter}, this, f61608a, false, 67559, new Class[]{ObservableEmitter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observableEmitter}, this, f61608a, false, 67559, new Class[]{ObservableEmitter.class}, Void.TYPE);
            return;
        }
        b bVar = this.f61609b;
        String str = this.f61610c;
        Aweme aweme = this.f61611d;
        FeedItemList b2 = bVar.b(str);
        if (b2 == null) {
            b2 = new FeedItemList();
        }
        if (b2.items == null) {
            b2.items = new ArrayList(1);
        }
        b2.items.add(0, aweme);
        bVar.a(b2, str);
    }
}
