package com.ss.android.ugc.aweme.shortvideo.o;

import com.google.common.a.f;
import com.google.common.collect.az;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.shortvideo.c;
import java.util.ArrayList;
import java.util.List;

public final class a implements f<Challenge, c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68801a;

    public static ArrayList<c> a(List<Challenge> list) {
        List<Challenge> list2 = list;
        if (!PatchProxy.isSupport(new Object[]{list2}, null, f68801a, true, 80095, new Class[]{List.class}, ArrayList.class)) {
            return az.a((Iterable<? extends E>) az.a(list2, new a()));
        }
        return (ArrayList) PatchProxy.accessDispatch(new Object[]{list2}, null, f68801a, true, 80095, new Class[]{List.class}, ArrayList.class);
    }

    public static c b(Challenge challenge) {
        Challenge challenge2 = challenge;
        if (PatchProxy.isSupport(new Object[]{challenge2}, null, f68801a, true, 80096, new Class[]{Challenge.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{challenge2}, null, f68801a, true, 80096, new Class[]{Challenge.class}, c.class);
        } else if (challenge2 != null) {
            return new a().apply(challenge2);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final c apply(Challenge challenge) {
        if (PatchProxy.isSupport(new Object[]{challenge}, this, f68801a, false, 80094, new Class[]{Challenge.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{challenge}, this, f68801a, false, 80094, new Class[]{Challenge.class}, c.class);
        }
        c cVar = new c();
        cVar.cid = challenge.getCid();
        cVar.challengeName = challenge.getChallengeName();
        cVar.stickerId = challenge.getStickerId();
        cVar.type = challenge.getType();
        cVar.viewCount = challenge.getViewCount();
        cVar.userCount = challenge.getUserCount();
        return cVar;
    }
}
