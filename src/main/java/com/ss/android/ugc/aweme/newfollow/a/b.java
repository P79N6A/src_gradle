package com.ss.android.ugc.aweme.newfollow.a;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.am;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.story.a;
import com.ss.android.ugc.aweme.utils.cf;
import java.util.List;
import javax.annotation.Nonnull;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57062a;

    public static boolean a(@Nonnull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f57062a, true, 61156, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f57062a, true, 61156, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive() || !a.a() || aweme.getAuthor().isBlock()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean b(@Nonnull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f57062a, true, 61158, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f57062a, true, 61158, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.ugc.aweme.newfollow.util.b.a(aweme) || !am.b(aweme)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean c(@Nonnull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f57062a, true, 61159, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f57062a, true, 61159, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        User author = aweme.getAuthor();
        if (author == null || !TextUtils.equals(author.getUid(), d.a().getCurUser().getUid())) {
            return false;
        }
        return true;
    }

    public static String d(@Nonnull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f57062a, true, 61161, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f57062a, true, 61161, new Class[]{Aweme.class}, String.class);
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && aweme.getAuthor() != null && statistics.getCommentCount() > 0) {
            return com.ss.android.ugc.aweme.i18n.b.a((long) statistics.getCommentCount());
        }
        if (!cf.a()) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
        return com.ss.android.ugc.aweme.base.utils.d.a().getString(C0906R.string.uy);
    }

    public static String e(@Nonnull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f57062a, true, 61163, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f57062a, true, 61163, new Class[]{Aweme.class}, String.class);
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && aweme.getAuthor() != null && statistics.getShareCount() > 0) {
            return com.ss.android.ugc.aweme.i18n.b.a((long) statistics.getShareCount());
        }
        if (!cf.a()) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
        return com.ss.android.ugc.aweme.base.utils.d.a().getString(C0906R.string.c63);
    }

    public static String f(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f57062a, true, 61164, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f57062a, true, 61164, new Class[]{Aweme.class}, String.class);
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && aweme.getAuthor() != null && statistics.getForwardCount() > 0) {
            return com.ss.android.ugc.aweme.i18n.b.a((long) statistics.getForwardCount());
        }
        if (!cf.a()) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
        return com.ss.android.ugc.aweme.base.utils.d.a().getString(C0906R.string.ahe);
    }

    public static int g(@Nonnull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f57062a, true, 61165, new Class[]{Aweme.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aweme}, null, f57062a, true, 61165, new Class[]{Aweme.class}, Integer.TYPE)).intValue();
        }
        if (!(aweme.getStatistics() == null || aweme.getAuthor() == null || c(aweme))) {
            AbTestModel d2 = AbTestManager.a().d();
            if (d2 != null) {
                return d2.shareButtonStyle;
            }
        }
        return 1;
    }

    public static boolean i(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f57062a, true, 61167, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f57062a, true, 61167, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null) {
            return false;
        } else {
            if (aweme.getAwemeType() == 13 || aweme.getAwemeType() == 0 || aweme.getAwemeType() == 2 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53) {
                return true;
            }
            return false;
        }
    }

    public static boolean j(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f57062a, true, 61168, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f57062a, true, 61168, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null) {
            return false;
        } else {
            if (aweme.getAwemeType() == 13 || aweme.getAwemeType() == 0 || aweme.getAwemeType() == 2 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53) {
                return true;
            }
            return false;
        }
    }

    public static boolean a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f57062a, true, 61157, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f57062a, true, 61157, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || !user.isLive() || !a.a() || user.isBlock()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean b(@Nonnull User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f57062a, true, 61160, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f57062a, true, 61160, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || !TextUtils.equals(user.getUid(), d.a().getCurUser().getUid())) {
            return false;
        } else {
            return true;
        }
    }

    public static void h(Aweme aweme) {
        String str;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f57062a, true, 61166, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, null, f57062a, true, 61166, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        List<Challenge> challengeList = aweme.getChallengeList();
        if (challengeList != null && !challengeList.isEmpty()) {
            Challenge challenge = challengeList.get(0);
            if (challenge != null && !TextUtils.isEmpty(challenge.getChallengeName())) {
                StringBuilder sb = new StringBuilder("#");
                sb.append(challenge.getChallengeName());
                sb.append(" ");
                TextExtraStruct textExtraStruct = new TextExtraStruct();
                textExtraStruct.setType(1);
                textExtraStruct.setHashTagName(challenge.getChallengeName());
                textExtraStruct.setStart(0);
                textExtraStruct.setCid(challenge.getCid());
                textExtraStruct.setEnd(sb.length());
                if (aweme.getDesc() == null) {
                    str = "";
                } else {
                    str = aweme.getDesc();
                }
                if (!str.contains("#" + challenge.getChallengeName())) {
                    sb.append(aweme.getDesc());
                    aweme2.setDesc(sb.toString());
                    int end = textExtraStruct.getEnd() - textExtraStruct.getStart();
                    for (TextExtraStruct next : aweme.getTextExtra()) {
                        next.setStart(next.getStart() + end);
                        next.setEnd(next.getEnd() + end);
                    }
                    aweme.getTextExtra().add(textExtraStruct);
                }
            }
        }
    }
}
