package com.ss.android.ugc.aweme.feed.ui;

import android.arch.lifecycle.Observer;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.legoImp.inflate.q;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.utils.eo;

public final class bw extends e implements Observer<a> {
    public static ChangeQuickRedirect l;
    private DmtTextView m;

    public final void a(DataCenter dataCenter) {
    }

    public final void b() {
    }

    public final /* bridge */ /* synthetic */ void onChanged(@Nullable Object obj) {
    }

    public bw(View view) {
        super(view);
    }

    public final void b(VideoItemParams videoItemParams) {
        if (PatchProxy.isSupport(new Object[]{videoItemParams}, this, l, false, 43302, new Class[]{VideoItemParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoItemParams}, this, l, false, 43302, new Class[]{VideoItemParams.class}, Void.TYPE);
            return;
        }
        super.b(videoItemParams);
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, l, false, 43301, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, l, false, 43301, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View a2 = ((q) com.ss.android.ugc.aweme.lego.a.i.b(q.class)).a(this.h, (int) C0906R.layout.layout_video_post_time);
        if (view instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = u.a(4.0d);
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(u.a(4.0d));
            }
            ((FrameLayout) view).addView(a2, layoutParams);
        }
        this.m = (DmtTextView) a2.findViewById(C0906R.id.dgg);
    }

    public final void a(VideoItemParams videoItemParams) {
        if (PatchProxy.isSupport(new Object[]{videoItemParams}, this, l, false, 43303, new Class[]{VideoItemParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoItemParams}, this, l, false, 43303, new Class[]{VideoItemParams.class}, Void.TYPE);
            return;
        }
        super.a(videoItemParams);
        if ((!MainPageExperimentHelper.d() || !TextUtils.equals(this.f3211c, "homepage_follow")) && !FeedParamProvider.a(this.h).isHotSpot() && (!TextUtils.equals(this.f3211c, "homepage_hot") || !this.f3210b.isHotSearchAweme())) {
            v.a((View) this.m, 8);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, l, false, 43304, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, l, false, 43304, new Class[0], Void.TYPE);
            } else {
                if (this.f3210b == null || this.f3210b.getCreateTime() <= 0) {
                    v.a((View) this.m, 8);
                } else {
                    String d2 = eo.d(this.h, this.f3210b.getCreateTime() * 1000);
                    if (!TextUtils.isEmpty(d2)) {
                        DmtTextView dmtTextView = this.m;
                        dmtTextView.setText("· " + d2);
                        v.a((View) this.m, 0);
                    } else {
                        v.a((View) this.m, 8);
                    }
                }
            }
        }
    }
}
