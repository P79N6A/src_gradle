package com.ss.android.ugc.aweme.commerce.card;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.ObservableEmitter;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class g implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36835a;

    /* renamed from: b  reason: collision with root package name */
    private final ObservableEmitter f36836b;

    g(ObservableEmitter observableEmitter) {
        this.f36836b = observableEmitter;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f36835a, false, 28035, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f36835a, false, 28035, new Class[]{Object.class}, Object.class);
        }
        this.f36836b.onNext((List) obj);
        return null;
    }
}
