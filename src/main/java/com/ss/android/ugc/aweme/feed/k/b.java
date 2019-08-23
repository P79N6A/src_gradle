package com.ss.android.ugc.aweme.feed.k;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.lib.video.bitrate.regulator.a.c;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45566a;

    public static Aweme c(IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, null, f45566a, true, 43591, new Class[]{IFeedViewHolder.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, null, f45566a, true, 43591, new Class[]{IFeedViewHolder.class}, Aweme.class);
        } else if (iFeedViewHolder == null) {
            return null;
        } else {
            return iFeedViewHolder.d();
        }
    }

    public static String g(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45566a, true, 43604, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45566a, true, 43604, new Class[]{Aweme.class}, String.class);
        } else if (aweme != null) {
            return aweme.getAid();
        } else {
            return "";
        }
    }

    public static Integer a(VideoUrlModel videoUrlModel) {
        if (PatchProxy.isSupport(new Object[]{videoUrlModel}, null, f45566a, true, 43587, new Class[]{VideoUrlModel.class}, Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[]{videoUrlModel}, null, f45566a, true, 43587, new Class[]{VideoUrlModel.class}, Integer.class);
        } else if (videoUrlModel == null || videoUrlModel.getHitBitrate() == null) {
            return null;
        } else {
            return Integer.valueOf(videoUrlModel.getHitBitrate().getBitRate());
        }
    }

    public static int b(IFeedViewHolder iFeedViewHolder) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, null, f45566a, true, 43590, new Class[]{IFeedViewHolder.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, null, f45566a, true, 43590, new Class[]{IFeedViewHolder.class}, Integer.TYPE)).intValue();
        } else if (iFeedViewHolder == null || iFeedViewHolder.d() == null || iFeedViewHolder.d().getVideo() == null) {
            return 0;
        } else {
            try {
                int b2 = b(iFeedViewHolder.d().getVideo().getPlayAddr());
                if (b2 != -1) {
                    i = b2;
                }
            } catch (Exception unused) {
            }
            return i;
        }
    }

    public static boolean c(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45566a, true, 43595, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45566a, true, 43595, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getStatus() == null || aweme.getStatus().getPrivateStatus() != 1) {
            return false;
        } else {
            return true;
        }
    }

    public static Aweme d(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45566a, true, 43600, new Class[]{Aweme.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45566a, true, 43600, new Class[]{Aweme.class}, Aweme.class);
        } else if (aweme == null) {
            return null;
        } else {
            if (aweme.isForwardAweme()) {
                return aweme.getForwardItem();
            }
            return aweme;
        }
    }

    public static boolean e(IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, null, f45566a, true, 43593, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, null, f45566a, true, 43593, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)).booleanValue();
        } else if (iFeedViewHolder == null || iFeedViewHolder.d() == null || iFeedViewHolder.d().getAwemeType() != 31) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean f(@Nullable IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, null, f45566a, true, 43598, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, null, f45566a, true, 43598, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)).booleanValue();
        } else if (iFeedViewHolder == null || iFeedViewHolder.k() == null || iFeedViewHolder.k().q() != 1) {
            return false;
        } else {
            return true;
        }
    }

    public static int b(VideoUrlModel videoUrlModel) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{videoUrlModel}, null, f45566a, true, 43589, new Class[]{VideoUrlModel.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{videoUrlModel}, null, f45566a, true, 43589, new Class[]{VideoUrlModel.class}, Integer.TYPE)).intValue();
        } else if (videoUrlModel == null) {
            return -1;
        } else {
            c hitBitrate = videoUrlModel.getHitBitrate();
            if (hitBitrate == null) {
                num = null;
            } else {
                num = Integer.valueOf(hitBitrate.getQualityType());
            }
            if (num == null) {
                num = -1;
            }
            return num.intValue();
        }
    }

    public static boolean d(IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, null, f45566a, true, 43592, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, null, f45566a, true, 43592, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)).booleanValue();
        } else if (iFeedViewHolder == null || iFeedViewHolder.d() == null || !iFeedViewHolder.d().isAd()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean e(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45566a, true, 43602, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45566a, true, 43602, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAwemeType() != 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean f(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45566a, true, 43603, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45566a, true, 43603, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getStatus() == null) {
            return false;
        } else {
            return aweme.getStatus().isDelete();
        }
    }

    public static boolean b(@Nullable Aweme aweme) {
        User user;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45566a, true, 43594, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45566a, true, 43594, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        if (aweme == null) {
            user = null;
        } else {
            user = aweme.getAuthor();
        }
        if (user != null) {
            return TextUtils.equals(user.getUid(), d.a().getCurUser().getUid());
        }
        return false;
    }

    public static boolean a(@Nullable IFeedViewHolder iFeedViewHolder) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder}, null, f45566a, true, 43585, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, null, f45566a, true, 43585, new Class[]{IFeedViewHolder.class}, Boolean.TYPE)).booleanValue();
        } else if (iFeedViewHolder == null || iFeedViewHolder.d() == null || !iFeedViewHolder.d().isAd() || !a.a()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45566a, true, 43586, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45566a, true, 43586, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || !aweme.isAd() || !a.a()) {
            return false;
        } else {
            return true;
        }
    }

    public static String a(@Nullable Aweme aweme, int i) {
        Aweme aweme2 = aweme;
        if (!PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i)}, null, f45566a, true, 43597, new Class[]{Aweme.class, Integer.TYPE}, String.class)) {
            return com.ss.android.ugc.aweme.feed.a.a().c(aweme2, i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i)}, null, f45566a, true, 43597, new Class[]{Aweme.class, Integer.TYPE}, String.class);
    }

    public static JSONObject a(Aweme aweme, int i, @NonNull String str, String str2) {
        Aweme aweme2 = aweme;
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i), str3, str4}, null, f45566a, true, 43596, new Class[]{Aweme.class, Integer.TYPE, String.class, String.class}, JSONObject.class)) {
            return com.ss.android.ugc.aweme.feed.g.c.a(com.ss.android.ugc.aweme.feed.a.a().b(aweme2, i), str3, str4, aweme2);
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i), str3, str4}, null, f45566a, true, 43596, new Class[]{Aweme.class, Integer.TYPE, String.class, String.class}, JSONObject.class);
    }
}
