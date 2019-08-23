package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class h implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40062a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceCardAction f40063b;

    /* renamed from: c  reason: collision with root package name */
    private final User f40064c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f40065d;

    h(CommerceCardAction commerceCardAction, User user, Long l) {
        this.f40063b = commerceCardAction;
        this.f40064c = user;
        this.f40065d = l;
    }

    public final Object invoke(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f40062a, false, 33080, new Class[]{Object.class}, Object.class)) {
            return this.f40063b.a(this.f40064c, this.f40065d, (List) obj);
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f40062a, false, 33080, new Class[]{Object.class}, Object.class);
    }
}
