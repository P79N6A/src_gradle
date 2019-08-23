package com.ss.android.ugc.aweme.story.feed.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;

public class StoryFeedActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72671a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f72671a, false, 83839, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72671a, false, 83839, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.feed.view.StoryFeedActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.feed.view.StoryFeedActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72671a, false, 83840, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72671a, false, 83840, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.feed.view.StoryFeedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        StoryHomeFeedFragment storyHomeFeedFragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f72671a, false, 83838, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f72671a, false, 83838, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.feed.view.StoryFeedActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.e2);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (PatchProxy.isSupport(new Object[0], null, StoryHomeFeedFragment.f72690a, true, 83884, new Class[0], StoryHomeFeedFragment.class)) {
            storyHomeFeedFragment = (StoryHomeFeedFragment) PatchProxy.accessDispatch(new Object[0], null, StoryHomeFeedFragment.f72690a, true, 83884, new Class[0], StoryHomeFeedFragment.class);
        } else {
            storyHomeFeedFragment = new StoryHomeFeedFragment();
        }
        beginTransaction.add((int) C0906R.id.z1, (Fragment) storyHomeFeedFragment).commitAllowingStateLoss();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.feed.view.StoryFeedActivity", "onCreate", false);
    }
}
