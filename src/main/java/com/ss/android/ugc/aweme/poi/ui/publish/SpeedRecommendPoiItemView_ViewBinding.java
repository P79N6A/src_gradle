package com.ss.android.ugc.aweme.poi.ui.publish;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class SpeedRecommendPoiItemView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60843a;

    /* renamed from: b  reason: collision with root package name */
    private SpeedRecommendPoiItemView f60844b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60843a, false, 66696, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60843a, false, 66696, new Class[0], Void.TYPE);
            return;
        }
        SpeedRecommendPoiItemView speedRecommendPoiItemView = this.f60844b;
        if (speedRecommendPoiItemView != null) {
            this.f60844b = null;
            speedRecommendPoiItemView.mTvPoiName = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SpeedRecommendPoiItemView_ViewBinding(SpeedRecommendPoiItemView speedRecommendPoiItemView, View view) {
        this.f60844b = speedRecommendPoiItemView;
        speedRecommendPoiItemView.mTvPoiName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.cbb, "field 'mTvPoiName'", TextView.class);
    }
}
