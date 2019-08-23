package com.ss.android.ugc.aweme.poi.ui.comment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.model.o;

public class PoiCommentDetailActivity extends AmeSlideSSActivity {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f60551b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f60551b, false, 66244, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60551b, false, 66244, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60551b, false, 66245, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60551b, false, 66245, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onCreate(Bundle bundle) {
        PoiCommentDetailFragment poiCommentDetailFragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60551b, false, 66242, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60551b, false, 66242, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.b1);
        findViewById(C0906R.id.y9).setBackgroundColor(getResources().getColor(C0906R.color.a25));
        if (PatchProxy.isSupport(new Object[0], this, f60551b, false, 66243, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60551b, false, 66243, new Class[0], Void.TYPE);
        } else {
            o oVar = (o) getIntent().getSerializableExtra("EXTRA_COMMENT_ITEM");
            c cVar = (c) getIntent().getSerializableExtra("EXTRA_POI_BUNDLE");
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            if (PatchProxy.isSupport(new Object[]{oVar, cVar}, null, PoiCommentDetailFragment.f60552d, true, 66246, new Class[]{o.class, c.class}, PoiCommentDetailFragment.class)) {
                poiCommentDetailFragment = (PoiCommentDetailFragment) PatchProxy.accessDispatch(new Object[]{oVar, cVar}, null, PoiCommentDetailFragment.f60552d, true, 66246, new Class[]{o.class, c.class}, PoiCommentDetailFragment.class);
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("EXTRA_COMMENT_ITEM", oVar);
                bundle2.putSerializable("EXTRA_POI_BUNDLE", cVar);
                poiCommentDetailFragment = new PoiCommentDetailFragment();
                poiCommentDetailFragment.setArguments(bundle2);
            }
            poiCommentDetailFragment.setUserVisibleHint(true);
            beginTransaction.replace(C0906R.id.y9, poiCommentDetailFragment, "POI_COMMENT_FRAGMENT_TAG");
            beginTransaction.commit();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentDetailActivity", "onCreate", false);
    }

    public static void a(Context context, o oVar, c cVar) {
        Context context2 = context;
        o oVar2 = oVar;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{context2, oVar2, cVar2}, null, f60551b, true, 66241, new Class[]{Context.class, o.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, oVar2, cVar2}, null, f60551b, true, 66241, new Class[]{Context.class, o.class, c.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, PoiCommentDetailActivity.class);
        intent.putExtra("EXTRA_COMMENT_ITEM", oVar2);
        intent.putExtra("EXTRA_POI_BUNDLE", cVar2);
        context2.startActivity(intent);
    }
}
