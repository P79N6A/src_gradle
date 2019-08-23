package com.ss.android.ugc.aweme.hotsearch;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.monitor.annotation.AddPageTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.hotsearch.fragment.BaseSingleRankingListFragment;
import com.ss.android.ugc.aweme.hotsearch.fragment.SingleRankingListVideoFragment;

@AddPageTrace
public class RankingListVideoActivity extends RankingListIndependenceActivity {
    public static ChangeQuickRedirect i;

    public final int a() {
        return 1;
    }

    public final int c() {
        return 1802;
    }

    public final String g() {
        return "hot_search_video_board";
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, i, false, 49586, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, i, false, 49586, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListVideoActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListVideoActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 49587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 49587, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListVideoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListVideoActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 49588, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 49588, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.hotsearch.RankingListVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, i, true, 49583, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, i, true, 49583, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a(context2, null);
    }

    public final BaseSingleRankingListFragment a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 49585, new Class[]{String.class}, BaseSingleRankingListFragment.class)) {
            return (BaseSingleRankingListFragment) PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 49585, new Class[]{String.class}, BaseSingleRankingListFragment.class);
        }
        if (PatchProxy.isSupport(new Object[]{str2}, null, SingleRankingListVideoFragment.p, true, 49709, new Class[]{String.class}, SingleRankingListVideoFragment.class)) {
            return (SingleRankingListVideoFragment) PatchProxy.accessDispatch(new Object[]{str2}, null, SingleRankingListVideoFragment.p, true, 49709, new Class[]{String.class}, SingleRankingListVideoFragment.class);
        }
        Bundle bundle = new Bundle();
        bundle.putString("edition_uid", str2);
        SingleRankingListVideoFragment singleRankingListVideoFragment = new SingleRankingListVideoFragment();
        singleRankingListVideoFragment.setArguments(bundle);
        return singleRankingListVideoFragment;
    }

    public static void a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, i, true, 49584, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, i, true, 49584, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(context2, RankingListVideoActivity.class);
        intent.putExtra("edition_uid", str2);
        context2.startActivity(intent);
    }
}
