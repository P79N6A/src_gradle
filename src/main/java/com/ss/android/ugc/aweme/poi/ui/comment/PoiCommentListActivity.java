package com.ss.android.ugc.aweme.poi.ui.comment;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.poi.c;

public class PoiCommentListActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60567a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f60567a, false, 66265, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60567a, false, 66265, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60567a, false, 66266, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60567a, false, 66266, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onCreate(Bundle bundle) {
        PoiCommentListFragment poiCommentListFragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60567a, false, 66263, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60567a, false, 66263, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.b1);
        findViewById(C0906R.id.y9).setBackgroundColor(getResources().getColor(C0906R.color.a25));
        if (PatchProxy.isSupport(new Object[0], this, f60567a, false, 66264, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60567a, false, 66264, new Class[0], Void.TYPE);
        } else {
            c cVar = (c) getIntent().getSerializableExtra("EXTRA_POI_BUNDLE");
            int intExtra = getIntent().getIntExtra("EXTRA_COMMENT_POSITION", 0);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(intExtra)}, null, PoiCommentListFragment.f60568d, true, 66267, new Class[]{c.class, Integer.TYPE}, PoiCommentListFragment.class)) {
                poiCommentListFragment = (PoiCommentListFragment) PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(intExtra)}, null, PoiCommentListFragment.f60568d, true, 66267, new Class[]{c.class, Integer.TYPE}, PoiCommentListFragment.class);
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("EXTRA_POI_BUNDLE", cVar);
                bundle2.putInt("EXTRA_COMMENT_POSITION", intExtra);
                poiCommentListFragment = new PoiCommentListFragment();
                poiCommentListFragment.setArguments(bundle2);
            }
            poiCommentListFragment.setUserVisibleHint(true);
            beginTransaction.replace(C0906R.id.y9, poiCommentListFragment, "POI_COMMENT_LIST_FRAGMENT_TAG");
            beginTransaction.commit();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentListActivity", "onCreate", false);
    }
}
