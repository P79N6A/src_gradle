package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.commerce.a.a;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.commerce.service.models.k;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Unit;

public class CommerceCardAction extends AbsAdCardAction {
    public static ChangeQuickRedirect j;
    private String k;
    private h l;

    public final void a() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33079, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33079, new Class[0], Void.TYPE);
            return;
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        User author = this.g.getAuthor();
        if (c.u(this.g)) {
            g.b(i.a().getContext(), this.g, "draw_ad");
        }
        if (author != null && this.g.hasPromotion()) {
            a.a(this.g);
            if (this.l == null) {
                com.ss.android.ugc.aweme.commerce.promotion.a.f37668b.a(this.g.getAid(), this.g.getAuthorUid(), new h(this, author, valueOf), i.f40067b);
                return;
            }
            Context context = this.f2957f;
            if (author.isMe()) {
                author = d.a().getCurUser();
            }
            CommerceUser a2 = com.ss.android.ugc.aweme.commerce.service.l.d.a(author);
            String aid = this.g.getAid();
            if (this.l.getPromotionId() != null) {
                str = this.l.getPromotionId();
            } else {
                str = "";
            }
            String str3 = str;
            String originUserId = this.l.getOriginUserId();
            String originMediaId = this.l.getOriginMediaId();
            String detailUrl = this.l.getDetailUrl();
            String str4 = this.k;
            String aid2 = this.g.getAid();
            long commodityType = this.l.getCommodityType();
            if (this.l.getPromotionId() != null) {
                str2 = this.l.getPromotionId();
            } else {
                str2 = "";
            }
            com.ss.android.ugc.aweme.commercialize.g.a(n.a(context, a2, aid, str3, originUserId, originMediaId, detailUrl, str4, "click_transform_card", aid2, null, "transform_card", new k(commodityType, str2, this.l.isSelf()), valueOf.longValue(), this.l.getPromotionSource(), null, 0, this.g.getAid(), null));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit a(User user, Long l2, List list) {
        User user2;
        List list2 = list;
        if (list2 == null || list.isEmpty()) {
            return null;
        }
        h hVar = (h) list2.get(0);
        if (hVar == null || hVar.getPromotionId() == null) {
            return null;
        }
        Context context = this.f2957f;
        if (user.isMe()) {
            user2 = d.a().getCurUser();
        } else {
            user2 = user;
        }
        CommerceUser a2 = com.ss.android.ugc.aweme.commerce.service.l.d.a(user2);
        String aid = this.g.getAid();
        String promotionId = hVar.getPromotionId();
        String originUserId = hVar.getOriginUserId();
        String originMediaId = hVar.getOriginMediaId();
        String detailUrl = hVar.getDetailUrl();
        String str = this.k;
        String aid2 = this.g.getAid();
        k kVar = r4;
        k kVar2 = new k(hVar.getCommodityType(), hVar.getPromotionId(), hVar.isSelf());
        com.ss.android.ugc.aweme.commercialize.g.a(n.a(context, a2, aid, promotionId, originUserId, originMediaId, detailUrl, str, "click_transform_card", aid2, null, "transform_card", kVar, l2.longValue(), hVar.getPromotionSource(), null, 0, this.g.getAid(), null));
        return null;
    }

    CommerceCardAction(Context context, Aweme aweme, LifecycleOwner lifecycleOwner, f fVar, String str) {
        super(context, aweme, lifecycleOwner, fVar);
        this.k = str;
    }

    public CommerceCardAction(Context context, Aweme aweme, LifecycleOwner lifecycleOwner, f fVar, String str, h hVar) {
        super(context, aweme, null, null);
        this.k = str;
        this.l = hVar;
    }
}
