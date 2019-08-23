package com.bytedance.apm.trace.a;

import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, Integer> f19069a = new HashMap<>();

    static {
        a("com.ss.android.ugc.aweme.hotsearch.RankingListActivity", C0906R.id.bg4);
        a("com.ss.android.ugc.aweme.splash.SplashActivity", C0906R.id.yb);
        a("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", C0906R.id.a1a);
        a("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", C0906R.id.bsj);
        a("com.ss.android.ugc.aweme.hotsearch.RankingListVideoActivity", C0906R.id.ap8);
        a("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", C0906R.id.a1a);
        a("com.ss.android.ugc.aweme.main.MainActivity", C0906R.id.duj);
        a("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", C0906R.id.c0c);
        a("com.ss.android.ugc.aweme.friends.ui.AddFriendsActivity", C0906R.id.z1);
        a("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", C0906R.id.a1a);
        a("com.ss.android.ugc.aweme.discover.ui.DiscoverFragment", C0906R.id.ep);
        a("com.ss.android.ugc.aweme.profile.ui.UserProfileFragment", C0906R.id.dgc);
        a("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", C0906R.id.ayr);
        a("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", C0906R.id.a1a);
        a("com.ss.android.ugc.aweme.comment.ui.VideoCommentDialogFragment2", C0906R.id.yb);
        a("com.ss.android.ugc.aweme.detail.ui.DetailActivity", C0906R.id.a1a);
        a("com.ss.android.ugc.aweme.discover.activity.SearchResultActivity", C0906R.id.ayr);
        a("com.ss.android.ugc.aweme.discover.ui.DiscoverActivity", C0906R.id.kr);
    }

    public static Integer a(String str) {
        return f19069a.get(str);
    }

    private static void a(String str, int i) {
        f19069a.put(str, Integer.valueOf(i));
    }
}
