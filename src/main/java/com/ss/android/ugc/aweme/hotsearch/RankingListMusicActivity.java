package com.ss.android.ugc.aweme.hotsearch;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.hotsearch.fragment.BaseSingleRankingListFragment;
import com.ss.android.ugc.aweme.hotsearch.fragment.SingleRankingListMusicFragment;

public class RankingListMusicActivity extends RankingListIndependenceActivity {
    public static ChangeQuickRedirect i;

    public final int a() {
        return 2;
    }

    public final int c() {
        return 1803;
    }

    public final String g() {
        return "music";
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, i, false, 49574, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, i, false, 49574, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListMusicActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListMusicActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 49575, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 49575, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListMusicActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListMusicActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 49576, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 49576, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final BaseSingleRankingListFragment a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 49573, new Class[]{String.class}, BaseSingleRankingListFragment.class)) {
            return (BaseSingleRankingListFragment) PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 49573, new Class[]{String.class}, BaseSingleRankingListFragment.class);
        }
        if (PatchProxy.isSupport(new Object[]{str2}, null, SingleRankingListMusicFragment.p, true, 49692, new Class[]{String.class}, SingleRankingListMusicFragment.class)) {
            return (SingleRankingListMusicFragment) PatchProxy.accessDispatch(new Object[]{str2}, null, SingleRankingListMusicFragment.p, true, 49692, new Class[]{String.class}, SingleRankingListMusicFragment.class);
        }
        Bundle bundle = new Bundle();
        bundle.putString("edition_uid", str2);
        SingleRankingListMusicFragment singleRankingListMusicFragment = new SingleRankingListMusicFragment();
        singleRankingListMusicFragment.setArguments(bundle);
        return singleRankingListMusicFragment;
    }

    public static void a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, i, true, 49572, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, i, true, 49572, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(context2, RankingListMusicActivity.class);
        intent.putExtra("edition_uid", str2);
        context2.startActivity(intent);
    }
}
