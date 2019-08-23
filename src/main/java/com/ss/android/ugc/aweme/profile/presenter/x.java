package com.ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.feed.model.StoryUnreadUtils;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.y;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.utils.t;

public abstract class x extends b<a<UserResponse>, n> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f61664c;

    public final void a(User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, f61664c, false, 67604, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, f61664c, false, 67604, new Class[]{User.class}, Void.TYPE);
            return;
        }
        a(user2, true);
    }

    private int b(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f61664c, false, 67607, new Class[]{User.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{user}, this, f61664c, false, 67607, new Class[]{User.class}, Integer.TYPE)).intValue();
        } else if (y.a(user)) {
            return user.getFansCount();
        } else {
            return user.getFollowerCount();
        }
    }

    public void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f61664c, false, 67606, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f61664c, false, 67606, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((n) this.f2979f).b(exc);
        }
    }

    public final void a(User user, boolean z) {
        int i;
        int i2;
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{user, Byte.valueOf(z ? (byte) 1 : 0)}, this, f61664c, false, 67605, new Class[]{User.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Byte.valueOf(z)}, this, f61664c, false, 67605, new Class[]{User.class, Boolean.TYPE}, Void.TYPE);
        } else if (this.f2979f != null && ((n) this.f2979f).e()) {
            ((n) this.f2979f).setUser(user);
            if (z) {
                ((n) this.f2979f).b(user.getFollowingCount());
                ((n) this.f2979f).a(b(user));
                ((n) this.f2979f).c(user.getTotalFavorited());
            }
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                ((n) this.f2979f).a(user.getRemarkName(), user.getStarBillboardRank(), user.getBrandInfo(), user);
            } else {
                ((n) this.f2979f).a(user.getNickname(), user.getStarBillboardRank(), user.getBrandInfo(), user);
            }
            ((n) this.f2979f).a(user.getFollowStatus(), user.getSignature());
            ((n) this.f2979f).b(user.isLive(), ex.l(user), StoryUnreadUtils.hasUnreadStory(user));
            ((n) this.f2979f).c(user);
            ((n) this.f2979f).a(t.b(user));
            ((n) this.f2979f).g(user);
            ((n) this.f2979f).d(user.getAwemeCount());
            ((n) this.f2979f).a(user.isWithFusionShopEntry(), user.isWithNewGoods(), user.isWithCommerceEntry());
            ((n) this.f2979f).e(user.getFavoritingCount());
            if (!AbTestManager.a().aV() || !ex.g(user)) {
                ((n) this.f2979f).g(user.getDongtaiCount());
            } else {
                ((n) this.f2979f).g(user.getCollectCount());
            }
            ((n) this.f2979f).f(user.getStoryCount());
            n nVar = (n) this.f2979f;
            if (user.getOriginalMusician() != null) {
                i = user.getOriginalMusician().getMusicCount();
            } else {
                i = 0;
            }
            nVar.h(i);
            n nVar2 = (n) this.f2979f;
            if (user.getEffectArtistDetail() != null) {
                i2 = user.getEffectArtistDetail().getTotal();
            } else {
                i2 = 0;
            }
            nVar2.i(i2);
            ((n) this.f2979f).b(user);
            n nVar3 = (n) this.f2979f;
            if (TextUtils.isEmpty(user.getCustomVerify())) {
                str = user.getWeiboVerify();
            } else {
                str = user.getCustomVerify();
            }
            nVar3.b(str);
            ((n) this.f2979f).a();
            ((n) this.f2979f).d(user.getEnterpriseVerifyReason());
            n nVar4 = (n) this.f2979f;
            if (TextUtils.isEmpty(user.getUniqueId())) {
                str2 = user.getShortId();
            } else {
                str2 = user.getUniqueId();
            }
            nVar4.c(str2);
            ((n) this.f2979f).c(user.isBindedWeibo());
            ((n) this.f2979f).d(ex.n(user));
            ((n) this.f2979f).d(user);
            ((n) this.f2979f).f(user);
            if (TextUtils.equals(user.getUid(), d.a().getCurUserId())) {
                ((n) this.f2979f).a(3, user.getFollowerStatus());
                ((n) this.f2979f).b(false);
            } else {
                ((n) this.f2979f).a(user.getFollowStatus(), user.getFollowerStatus());
                ((n) this.f2979f).b(true);
            }
            ((n) this.f2979f).e(user.hasMedal());
            ((n) this.f2979f).e(user);
            user.getCustomVerify();
            ((n) this.f2979f).b();
        }
    }
}
