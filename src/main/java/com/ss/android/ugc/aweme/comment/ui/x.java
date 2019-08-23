package com.ss.android.ugc.aweme.comment.ui;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.commerce.service.models.k;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class x implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36627a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoCommentDialogFragment2 f36628b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f36629c;

    /* renamed from: d  reason: collision with root package name */
    private final User f36630d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f36631e;

    x(VideoCommentDialogFragment2 videoCommentDialogFragment2, Context context, User user, Long l) {
        this.f36628b = videoCommentDialogFragment2;
        this.f36629c = context;
        this.f36630d = user;
        this.f36631e = l;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f36627a, false, 27733, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f36627a, false, 27733, new Class[]{Object.class}, Object.class);
        }
        VideoCommentDialogFragment2 videoCommentDialogFragment2 = this.f36628b;
        Context context = this.f36629c;
        User user = this.f36630d;
        Long l = this.f36631e;
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return null;
        }
        h hVar = (h) list.get(0);
        if (hVar == null || hVar.getPromotionId() == null) {
            return null;
        }
        if (user.isMe()) {
            user = d.a().getCurUser();
        }
        CommerceUser a2 = com.ss.android.ugc.aweme.commerce.service.l.d.a(user);
        String aid = videoCommentDialogFragment2.r.getAid();
        String promotionId = hVar.getPromotionId();
        String originUserId = hVar.getOriginUserId();
        String originMediaId = hVar.getOriginMediaId();
        String detailUrl = hVar.getDetailUrl();
        String o = videoCommentDialogFragment2.o();
        String aid2 = videoCommentDialogFragment2.r.getAid();
        k kVar = r1;
        k kVar2 = new k(hVar.getCommodityType(), hVar.getPromotionId(), hVar.isSelf());
        g.a(n.a(context, a2, aid, promotionId, originUserId, originMediaId, detailUrl, o, "click_comment_tag", aid2, null, "comment_cart_tag", kVar, l.longValue(), hVar.getPromotionSource(), null, 0, videoCommentDialogFragment2.r.getAid(), null));
        return null;
    }
}
