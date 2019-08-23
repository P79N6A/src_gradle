package com.ss.android.ugc.aweme.newfollow.ui;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import java.util.List;

public class ImageFollowFeedDetailActivity extends AbsFollowFeedDetailActivity<RemoteImageView> implements View.OnClickListener {
    public static ChangeQuickRedirect m;

    public final int f() {
        return C0906R.layout.bf;
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, m, false, 61660, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, m, false, 61660, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, m, false, 61661, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, m, false, 61661, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61662, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61662, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, m, false, 61663, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, m, false, 61663, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61658, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61658, new Class[0], Void.TYPE);
            return;
        }
        this.mDragView.a();
    }

    public final /* synthetic */ View j() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61657, new Class[0], RemoteImageView.class)) {
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, m, false, 61657, new Class[0], RemoteImageView.class);
        }
        this.f57174b = new RemoteImageView(this);
        ((RemoteImageView) this.f57174b).setOnClickListener(this);
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61659, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61659, new Class[0], Void.TYPE);
        } else {
            Aweme n = n();
            if (n != null) {
                List<ImageInfo> imageInfos = n.getImageInfos();
                if (imageInfos != null && !imageInfos.isEmpty()) {
                    ImageInfo imageInfo = imageInfos.get(0);
                    if (imageInfo != null) {
                        c.b((RemoteImageView) this.f57174b, imageInfo.getLabelLarge());
                    }
                }
            }
        }
        return (RemoteImageView) this.f57174b;
    }
}
