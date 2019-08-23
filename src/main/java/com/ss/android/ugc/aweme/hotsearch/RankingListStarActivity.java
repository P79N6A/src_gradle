package com.ss.android.ugc.aweme.hotsearch;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.hotsearch.fragment.BaseSingleRankingListFragment;
import com.ss.android.ugc.aweme.hotsearch.fragment.SingleRankingListStarFragment;

public class RankingListStarActivity extends RankingListIndependenceActivity {
    public static ChangeQuickRedirect i;

    public final int a() {
        return 4;
    }

    public final int c() {
        return 2401;
    }

    public final String g() {
        return "star";
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, i, false, 49580, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, i, false, 49580, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListStarActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListStarActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 49581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 49581, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListStarActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListStarActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 49582, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 49582, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListStarActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final BaseSingleRankingListFragment a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 49579, new Class[]{String.class}, BaseSingleRankingListFragment.class)) {
            return (BaseSingleRankingListFragment) PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 49579, new Class[]{String.class}, BaseSingleRankingListFragment.class);
        }
        if (PatchProxy.isSupport(new Object[]{str2}, null, SingleRankingListStarFragment.p, true, 49703, new Class[]{String.class}, SingleRankingListStarFragment.class)) {
            return (SingleRankingListStarFragment) PatchProxy.accessDispatch(new Object[]{str2}, null, SingleRankingListStarFragment.p, true, 49703, new Class[]{String.class}, SingleRankingListStarFragment.class);
        }
        Bundle bundle = new Bundle();
        bundle.putString("edition_uid", str2);
        SingleRankingListStarFragment singleRankingListStarFragment = new SingleRankingListStarFragment();
        singleRankingListStarFragment.setArguments(bundle);
        return singleRankingListStarFragment;
    }
}
