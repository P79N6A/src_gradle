package com.ss.android.ugc.aweme.commercialize;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

public final class a extends com.ss.android.ugc.aweme.feed.c.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38455a;

    public a(String str, int i) {
        super(str, i);
    }

    public final void a(ar arVar, String str, String str2, String str3) {
        User user;
        ar arVar2 = arVar;
        if (PatchProxy.isSupport(new Object[]{arVar2, str, str2, str3}, this, f38455a, false, 30247, new Class[]{ar.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {arVar2, str, str2, str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f38455a, false, 30247, new Class[]{ar.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        Aweme aweme = (Aweme) arVar2.f45293c;
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            User author = aweme.getAuthor();
            if (aweme.hasPromotion()) {
                Context d2 = d();
                if (d2 != null && aweme.hasPromotion()) {
                    if (author.isMe()) {
                        user = d.a().getCurUser();
                    } else {
                        user = author;
                    }
                    if (com.ss.android.ugc.aweme.commerce.service.l.d.a(user) != null) {
                        com.ss.android.ugc.aweme.commerce.promotion.a aVar = com.ss.android.ugc.aweme.commerce.promotion.a.f37668b;
                        String aid = aweme.getAid();
                        String authorUid = aweme.getAuthorUid();
                        b bVar = new b(aweme, d2, author, str3, str, str2, valueOf);
                        aVar.a(aid, authorUid, bVar, c.f38521b);
                    }
                }
            }
        }
    }

    public final void b(ar arVar, String str, String str2, String str3) {
        ar arVar2 = arVar;
        if (PatchProxy.isSupport(new Object[]{arVar2, str, str2, str3}, this, f38455a, false, 30248, new Class[]{ar.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {arVar2, str, str2, str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f38455a, false, 30248, new Class[]{ar.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        Aweme aweme = (Aweme) arVar2.f45293c;
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            User author = aweme.getAuthor();
            Context d2 = d();
            if (d2 != null && author != null) {
                com.ss.android.ugc.aweme.commerce.a.a.a(aweme);
                com.ss.android.ugc.aweme.commerce.promotion.a aVar = com.ss.android.ugc.aweme.commerce.promotion.a.f37668b;
                String aid = aweme.getAid();
                String authorUid = aweme.getAuthorUid();
                d dVar = new d(d2, author, aweme, str3, str, str2, valueOf);
                aVar.a(aid, authorUid, dVar, e.f38675b);
            }
        }
    }
}
