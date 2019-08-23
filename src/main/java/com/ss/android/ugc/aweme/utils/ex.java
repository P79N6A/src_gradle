package com.ss.android.ugc.aweme.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import java.util.Collection;
import java.util.regex.Pattern;

public final class ex {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75854a;

    public static boolean a(int i) {
        return (i == 0 || i == 4) ? false : true;
    }

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f75854a, true, 88659, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75854a, true, 88659, new Class[0], Boolean.TYPE)).booleanValue();
        }
        User curUser = d.a().getCurUser();
        if (curUser == null) {
            return false;
        }
        if (e(curUser) && !a.a() && !TextUtils.isEmpty(com.ss.android.ugc.aweme.i.a.a())) {
            z = true;
        }
        return z;
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f75854a, true, 88667, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75854a, true, 88667, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!b()) {
            return false;
        }
        com.bytedance.ies.dmt.ui.d.a.c(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.sk).a();
        return true;
    }

    public static boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f75854a, true, 88666, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75854a, true, 88666, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a.b()) {
            return false;
        }
        User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        if (currentUser != null && currentUser.getUserMode() == 2) {
            z = true;
        }
        return z;
    }

    public static String h(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75854a, true, 88668, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user}, null, f75854a, true, 88668, new Class[]{User.class}, String.class);
        } else if (user == null) {
            return "";
        } else {
            return user.getUid();
        }
    }

    public static String i(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75854a, true, 88669, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user}, null, f75854a, true, 88669, new Class[]{User.class}, String.class);
        } else if (user == null) {
            return "";
        } else {
            return user.getNickname();
        }
    }

    public static String j(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75854a, true, 88670, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user}, null, f75854a, true, 88670, new Class[]{User.class}, String.class);
        } else if (user == null) {
            return "";
        } else {
            return user.getSignature();
        }
    }

    public static int a(@NonNull User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, null, f75854a, true, 88650, new Class[]{User.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{user2}, null, f75854a, true, 88650, new Class[]{User.class}, Integer.TYPE)).intValue();
        } else if (a(user2, TextUtils.equals(user.getUid(), d.a().getCurUserId()))) {
            return 0;
        } else {
            return user.getTabType();
        }
    }

    public static String b(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75854a, true, 88651, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user}, null, f75854a, true, 88651, new Class[]{User.class}, String.class);
        } else if (user == null) {
            return "";
        } else {
            if (!TextUtils.isEmpty(user.getUniqueId())) {
                return user.getUniqueId();
            }
            if (user.getShortId() == null) {
                return "";
            }
            return user.getShortId();
        }
    }

    public static UrlModel c(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75854a, true, 88652, new Class[]{User.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{user}, null, f75854a, true, 88652, new Class[]{User.class}, UrlModel.class);
        }
        UrlModel q = q(user);
        if (q != null) {
            return q;
        }
        return d(user);
    }

    @Nullable
    public static UrlModel d(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75854a, true, 88654, new Class[]{User.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{user}, null, f75854a, true, 88654, new Class[]{User.class}, UrlModel.class);
        } else if (user == null) {
            return null;
        } else {
            UrlModel avatarLarger = user.getAvatarLarger();
            if (avatarLarger == null) {
                avatarLarger = user.getAvatarMedium();
            }
            if (avatarLarger == null) {
                avatarLarger = user.getAvatarThumb();
            }
            return avatarLarger;
        }
    }

    public static boolean e(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75854a, true, 88658, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f75854a, true, 88658, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user != null && user.getCommerceUserLevel() > 0 && !TextUtils.isEmpty(user.getEnterpriseVerifyReason())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean f(@Nullable User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75854a, true, 88664, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f75854a, true, 88664, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null) {
            return false;
        } else {
            return a(user.getFollowStatus());
        }
    }

    public static boolean g(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75854a, true, 88665, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f75854a, true, 88665, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null) {
            return false;
        } else {
            return TextUtils.equals(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID(), user.getUid());
        }
    }

    public static boolean k(User user) {
        User user2;
        if (PatchProxy.isSupport(new Object[]{user}, null, f75854a, true, 88672, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f75854a, true, 88672, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (a.a()) {
            return false;
        } else {
            if (user == null || !user.isMe()) {
                user2 = user;
            } else {
                user2 = d.a().getCurUser();
            }
            AbTestModel d2 = AbTestManager.a().d();
            if (d2 == null || user2 == null || !d2.isShowToutiaoProfile || !user2.getIsSyncToutiao()) {
                return false;
            }
            return true;
        }
    }

    public static boolean l(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75854a, true, 88673, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f75854a, true, 88673, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null) {
            return false;
        } else {
            if (g(user)) {
                return user.isHasStory();
            }
            if (!user.isHasStory() || user.getStoryBlockInfo() == null || user.getStoryBlockInfo().isBlocked()) {
                return false;
            }
            return true;
        }
    }

    public static boolean m(User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, null, f75854a, true, 88674, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user2}, null, f75854a, true, 88674, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user2 == null || (!user2.isBlock && !user.isBlocked())) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean n(User user) {
        User user2;
        if (PatchProxy.isSupport(new Object[]{user}, null, f75854a, true, 88675, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f75854a, true, 88675, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (a.a()) {
            return false;
        } else {
            if (user == null || !user.isMe()) {
                user2 = user;
            } else {
                user2 = d.a().getCurUser();
            }
            if (user2 != null && user2.getrFansGroupInfo() != null && !TextUtils.isEmpty(user2.getrFansGroupInfo().getSchema()) && !TextUtils.isEmpty(user2.getrFansGroupInfo().getDownloadUrl())) {
                return true;
            }
            return false;
        }
    }

    public static boolean o(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75854a, true, 88676, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f75854a, true, 88676, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(user.getRecommendReasonRelation())) {
            return false;
        } else {
            return Pattern.compile("<b>").matcher(user.getRecommendReasonRelation()).find();
        }
    }

    public static boolean p(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75854a, true, 88681, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f75854a, true, 88681, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || !user.isLive() || !com.ss.android.ugc.aweme.story.a.a() || user.isBlock()) {
            return false;
        } else {
            return true;
        }
    }

    @Nullable
    private static UrlModel q(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75854a, true, 88653, new Class[]{User.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{user}, null, f75854a, true, 88653, new Class[]{User.class}, UrlModel.class);
        } else if (user == null) {
            return null;
        } else {
            if (!a.b()) {
                return user.getAvatarLarger();
            }
            UrlModel avatarVideoUri = user.getAvatarVideoUri();
            if (avatarVideoUri == null || !j.b(avatarVideoUri.getUrlList()) || TextUtils.isEmpty(avatarVideoUri.getUrlList().get(0))) {
                return null;
            }
            return avatarVideoUri;
        }
    }

    public static boolean a(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75854a, true, 88662, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75854a, true, 88662, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAuthor() == null) {
            return false;
        } else {
            return TextUtils.equals(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID(), aweme.getAuthor().getUid());
        }
    }

    public static boolean b(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75854a, true, 88663, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75854a, true, 88663, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAuthor() == null) {
            return false;
        } else {
            return a(aweme.getAuthor().getFollowStatus());
        }
    }

    @Nullable
    public static String[] a(@Nullable UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, null, f75854a, true, 88655, new Class[]{UrlModel.class}, String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[]{urlModel}, null, f75854a, true, 88655, new Class[]{UrlModel.class}, String[].class);
        } else if (urlModel == null || j.a((Collection<T>) urlModel.getUrlList())) {
            return null;
        } else {
            return (String[]) urlModel.getUrlList().toArray(new String[urlModel.getUrlList().size()]);
        }
    }

    public static String b(User user, boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{user, (byte) 1}, null, f75854a, true, 88680, new Class[]{User.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user, (byte) 1}, null, f75854a, true, 88680, new Class[]{User.class, Boolean.TYPE}, String.class);
        } else if (user == null) {
            return "";
        } else {
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                str = user.getRemarkName();
            } else {
                str = user.getNickname();
            }
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            return "@" + str;
        }
    }

    public static boolean a(User user, boolean z) {
        if (PatchProxy.isSupport(new Object[]{user, Byte.valueOf(z ? (byte) 1 : 0)}, null, f75854a, true, 88649, new Class[]{User.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user, Byte.valueOf(z)}, null, f75854a, true, 88649, new Class[]{User.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (user == null || z || user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || !user.isSecret()) {
            return false;
        } else {
            return true;
        }
    }
}
