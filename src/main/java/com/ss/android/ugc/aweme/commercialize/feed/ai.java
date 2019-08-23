package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.logs.u;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class ai implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38799a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate.AnonymousClass3 f38800b;

    ai(CommerceVideoDelegate.AnonymousClass3 r1) {
        this.f38800b = r1;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f38799a, false, 30721, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f38799a, false, 30721, new Class[]{Object.class}, Object.class);
        }
        CommerceVideoDelegate.AnonymousClass3 r2 = this.f38800b;
        h hVar = (h) obj;
        if (hVar == null) {
            return null;
        }
        new u().c(CommerceVideoDelegate.this.f38688e.getAuthorUid()).a(Long.valueOf(hVar.getCommodityType())).a(hVar.getPromotionId()).b(CommerceVideoDelegate.this.f38688e.getAid()).d("transform_card").b();
        return null;
    }
}
