package com.bytedance.android.livesdk.gift;

import android.content.res.Resources;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.gift.assets.f;
import com.bytedance.android.livesdk.gift.effect.b.a;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.j.c.n;
import com.bytedance.android.livesdk.message.c;
import com.bytedance.android.livesdk.message.model.ab;
import com.bytedance.android.livesdkapi.h.e;
import com.bytedance.android.livesdkapi.h.g;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Iterator;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15092a;

    public static n a(i iVar) {
        i iVar2 = iVar;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{iVar2}, null, f15092a, true, 9274, new Class[]{i.class}, n.class)) {
            return (n) PatchProxy.accessDispatch(new Object[]{iVar2}, null, f15092a, true, 9274, new Class[]{i.class}, n.class);
        }
        b findGiftById = GiftManager.inst().findGiftById(iVar2.f15133e);
        if (findGiftById != null) {
            i = findGiftById.f15107f;
        }
        n nVar = new n(iVar2.f15133e, findGiftById, iVar2.l, iVar2.q, iVar2.r, iVar2.j, iVar2.h, iVar2.f15134f, (long) i);
        return nVar;
    }

    public static a a(ab abVar, User user) {
        String str;
        Object[] objArr;
        int i;
        Resources resources;
        String str2;
        String str3;
        ab abVar2 = abVar;
        char c2 = 0;
        if (PatchProxy.isSupport(new Object[]{abVar2, user}, null, f15092a, true, 9276, new Class[]{ab.class, User.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{abVar2, user}, null, f15092a, true, 9276, new Class[]{ab.class, User.class}, a.class);
        } else if (abVar2 == null || abVar.getMessageId() == 0 || abVar2.f16430b == null) {
            return null;
        } else {
            b findGiftById = GiftManager.inst().findGiftById(abVar2.f16432d);
            if (findGiftById == null) {
                return null;
            }
            String b2 = f.a("effects").b(findGiftById.r);
            if (com.bytedance.android.live.uikit.a.a.f()) {
                if (abVar2.f16430b != null) {
                    str3 = abVar2.f16430b.getNickName();
                } else {
                    str3 = "";
                }
                if (str3 == null) {
                    str3 = "";
                }
                if (findGiftById != null) {
                    str2 = findGiftById.f15102a;
                } else {
                    str2 = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                int i2 = abVar2.f16433e;
                if (i2 <= 0) {
                    i2 = 1;
                }
                String valueOf = String.valueOf(i2);
                resources = ac.a();
                i = C0906R.string.cyj;
                objArr = new Object[3];
                objArr[0] = str3;
                objArr[1] = valueOf;
                c2 = 2;
            } else if (abVar2.f16431c == null || abVar2.f16431c.getId() <= 0 || (user != null && abVar2.f16431c.getId() == user.getId())) {
                str = findGiftById.f15104c;
                return new a().a(abVar.getMessageId()).b(findGiftById.r).a(findGiftById.f15107f).a(b2).a(abVar2.n).a(abVar2.f16431c).b(abVar2.f16430b).b(str).a(abVar2.l).c(findGiftById.f15105d).b(abVar2.f16433e);
            } else {
                resources = ac.a();
                i = C0906R.string.cyi;
                objArr = new Object[1];
                if (c.a(abVar2.f16431c) == null) {
                    str2 = "";
                } else {
                    str2 = c.a(abVar2.f16431c);
                }
            }
            objArr[c2] = str2;
            str = resources.getString(i, objArr);
            return new a().a(abVar.getMessageId()).b(findGiftById.r).a(findGiftById.f15107f).a(b2).a(abVar2.n).a(abVar2.f16431c).b(abVar2.f16430b).b(str).a(abVar2.l).c(findGiftById.f15105d).b(abVar2.f16433e);
        }
    }

    public static boolean a(User user, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{user, new Long(j2)}, null, f15092a, true, 9272, new Class[]{User.class, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user, new Long(j2)}, null, f15092a, true, 9272, new Class[]{User.class, Long.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (user.getId() == j2) {
            return true;
        } else {
            return false;
        }
    }

    public static ab a(long j, i iVar, User user) {
        long j2 = j;
        i iVar2 = iVar;
        User user2 = user;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2), iVar2, user2}, null, f15092a, true, 9270, new Class[]{Long.TYPE, i.class, User.class}, ab.class)) {
            return a(j2, iVar2, null, user2);
        }
        return (ab) PatchProxy.accessDispatch(new Object[]{new Long(j2), iVar2, user2}, null, f15092a, true, 9270, new Class[]{Long.TYPE, i.class, User.class}, ab.class);
    }

    public static ab a(long j, i iVar, User user, User user2) {
        long j2 = j;
        i iVar2 = iVar;
        User user3 = user;
        User user4 = user2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), iVar2, user3, user4}, null, f15092a, true, 9271, new Class[]{Long.TYPE, i.class, User.class, User.class}, ab.class)) {
            Object[] objArr = {new Long(j2), iVar2, user3, user4};
            return (ab) PatchProxy.accessDispatch(objArr, null, f15092a, true, 9271, new Class[]{Long.TYPE, i.class, User.class, User.class}, ab.class);
        }
        ab abVar = new ab();
        com.bytedance.android.livesdkapi.h.b bVar = new com.bytedance.android.livesdkapi.h.b();
        bVar.f18776c = j2;
        bVar.f18777d = iVar2.k;
        bVar.g = true;
        bVar.f18779f = iVar2.f15132d;
        bVar.j = iVar2.f15129a;
        abVar.baseMessage = bVar;
        e eVar = iVar2.f15129a;
        User user5 = null;
        if (eVar != null && !CollectionUtils.isEmpty(eVar.f18785d)) {
            Iterator<g> it2 = eVar.f18785d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                g next = it2.next();
                if (next.f18792d != null && next.f18792d.f18800a != null && a(next.f18792d.f18800a, ((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().b())) {
                    user5 = next.f18792d.f18800a;
                    break;
                }
            }
        }
        if (user5 != null) {
            abVar.f16430b = user5;
        } else if (user4 != null) {
            abVar.f16430b = user4;
        } else {
            abVar.f16430b = User.from(((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a());
        }
        abVar.f16433e = iVar2.h;
        abVar.f16434f = iVar2.f15130b;
        abVar.f16432d = iVar2.f15133e;
        abVar.f16431c = user3;
        abVar.i = iVar2.j;
        abVar.j = iVar2.f15134f;
        abVar.k = iVar2.g;
        abVar.o = true;
        return abVar;
    }
}
