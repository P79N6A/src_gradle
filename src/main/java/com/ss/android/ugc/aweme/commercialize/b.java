package com.ss.android.ugc.aweme.commercialize;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.commerce.a.a;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.commerce.service.models.k;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class b implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38503a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f38504b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f38505c;

    /* renamed from: d  reason: collision with root package name */
    private final User f38506d;

    /* renamed from: e  reason: collision with root package name */
    private final String f38507e;

    /* renamed from: f  reason: collision with root package name */
    private final String f38508f;
    private final String g;
    private final Long h;

    b(Aweme aweme, Context context, User user, String str, String str2, String str3, Long l) {
        this.f38504b = aweme;
        this.f38505c = context;
        this.f38506d = user;
        this.f38507e = str;
        this.f38508f = str2;
        this.g = str3;
        this.h = l;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f38503a, false, 30249, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f38503a, false, 30249, new Class[]{Object.class}, Object.class);
        }
        Aweme aweme = this.f38504b;
        Context context = this.f38505c;
        User user = this.f38506d;
        String str = this.f38507e;
        String str2 = this.f38508f;
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
        a.a(aweme);
        if (user.isMe()) {
            user = d.a().getCurUser();
        }
        CommerceUser a2 = com.ss.android.ugc.aweme.commerce.service.l.d.a(user);
        String aid = aweme.getAid();
        String promotionId = hVar.getPromotionId();
        String originUserId = hVar.getOriginUserId();
        String originMediaId = hVar.getOriginMediaId();
        String detailUrl = hVar.getDetailUrl();
        String aid2 = aweme.getAid();
        k kVar = r1;
        k kVar2 = new k(hVar.getCommodityType(), hVar.getPromotionId(), hVar.isSelf());
        g.a(n.a(context, a2, aid, promotionId, originUserId, originMediaId, detailUrl, str, str2, aid2, null, str3, kVar, l.longValue(), hVar.getPromotionSource(), null, 0, aweme.getAid(), null));
        return null;
    }
}
