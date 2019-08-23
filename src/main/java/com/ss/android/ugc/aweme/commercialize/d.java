package com.ss.android.ugc.aweme.commercialize;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.commerce.service.models.k;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class d implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38644a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f38645b;

    /* renamed from: c  reason: collision with root package name */
    private final User f38646c;

    /* renamed from: d  reason: collision with root package name */
    private final Aweme f38647d;

    /* renamed from: e  reason: collision with root package name */
    private final String f38648e;

    /* renamed from: f  reason: collision with root package name */
    private final String f38649f;
    private final String g;
    private final Long h;

    d(Context context, User user, Aweme aweme, String str, String str2, String str3, Long l) {
        this.f38645b = context;
        this.f38646c = user;
        this.f38647d = aweme;
        this.f38648e = str;
        this.f38649f = str2;
        this.g = str3;
        this.h = l;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f38644a, false, 30251, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f38644a, false, 30251, new Class[]{Object.class}, Object.class);
        }
        Context context = this.f38645b;
        User user = this.f38646c;
        Aweme aweme = this.f38647d;
        String str = this.f38648e;
        String str2 = this.f38649f;
        String str3 = this.g;
        Long l = this.h;
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return null;
        }
        h hVar = (h) list.get(0);
        if (hVar == null || hVar.getPromotionId() == null) {
            return null;
        }
        if (user.isMe()) {
            user = com.ss.android.ugc.aweme.account.d.a().getCurUser();
        }
        CommerceUser a2 = com.ss.android.ugc.aweme.commerce.service.l.d.a(user);
        String aid = aweme.getAid();
        String promotionId = hVar.getPromotionId();
        String originUserId = hVar.getOriginUserId();
        String originMediaId = hVar.getOriginMediaId();
        String detailUrl = hVar.getDetailUrl();
        String aid2 = aweme.getAid();
        k kVar = r0;
        k kVar2 = new k(hVar.getCommodityType(), hVar.getPromotionId(), hVar.isSelf());
        g.a(n.a(context, a2, aid, promotionId, originUserId, originMediaId, detailUrl, str, str2, aid2, null, str3, kVar, l.longValue(), hVar.getPromotionSource(), null, 0, aweme.getAid(), null));
        return null;
    }
}
