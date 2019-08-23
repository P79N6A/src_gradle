package com.ss.android.ugc.aweme.newfollow.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;

public class RecommendFollowFeedActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57279a;
    @BindView(2131497604)
    TextTitleBar mTitleBar;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f57279a, false, 61677, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57279a, false, 61677, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.RecommendFollowFeedActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.RecommendFollowFeedActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57279a, false, 61678, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57279a, false, 61678, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.RecommendFollowFeedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f57279a, true, 61674, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f57279a, true, 61674, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        context2.startActivity(new Intent(context2, RecommendFollowFeedActivity.class));
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f57279a, false, 61675, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f57279a, false, 61675, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.RecommendFollowFeedActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.di);
        ButterKnife.bind((Activity) this);
        if (PatchProxy.isSupport(new Object[0], this, f57279a, false, 61676, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57279a, false, 61676, new Class[0], Void.TYPE);
        } else {
            this.mTitleBar.setOnTitleBarClickListener(new a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57280a;

                public final void b(View view) {
                }

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f57280a, false, 61679, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f57280a, false, 61679, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    RecommendFollowFeedActivity.this.onBackPressed();
                }
            });
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("RecommendFollowFeed");
            if (findFragmentByTag == null) {
                findFragmentByTag = new FollowFeedFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "rec_follow");
                bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 14);
                findFragmentByTag.setArguments(bundle2);
            }
            beginTransaction.replace(C0906R.id.y9, findFragmentByTag, "RecommendFollowFeed");
            beginTransaction.commit();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.RecommendFollowFeedActivity", "onCreate", false);
    }
}
