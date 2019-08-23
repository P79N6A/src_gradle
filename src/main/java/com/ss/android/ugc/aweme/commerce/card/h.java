package com.ss.android.ugc.aweme.commerce.card;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.ObservableEmitter;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

public final /* synthetic */ class h implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36837a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceGoodHalfCardContainer f36838b;

    /* renamed from: c  reason: collision with root package name */
    private final ObservableEmitter f36839c;

    h(CommerceGoodHalfCardContainer commerceGoodHalfCardContainer, ObservableEmitter observableEmitter) {
        this.f36838b = commerceGoodHalfCardContainer;
        this.f36839c = observableEmitter;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f36837a, false, 28036, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f36837a, false, 28036, new Class[]{Object.class}, Object.class);
        }
        CommerceGoodHalfCardContainer commerceGoodHalfCardContainer = this.f36838b;
        ObservableEmitter observableEmitter = this.f36839c;
        commerceGoodHalfCardContainer.i = (JSONObject) obj;
        observableEmitter.onNext(null);
        return null;
    }
}
