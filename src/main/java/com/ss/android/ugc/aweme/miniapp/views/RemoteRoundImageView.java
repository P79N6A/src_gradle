package com.ss.android.ugc.aweme.miniapp.views;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;

public class RemoteRoundImageView extends AnimatedImageView {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f55943f;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f55943f, false, 59628, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55943f, false, 59628, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.setCornersRadius(UIUtils.dip2Px(getContext(), 2.0f));
        ((GenericDraweeHierarchy) getHierarchy()).setRoundingParams(roundingParams);
        ((GenericDraweeHierarchy) getHierarchy()).setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP);
    }

    public RemoteRoundImageView(Context context) {
        super(context);
    }

    public RemoteRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RemoteRoundImageView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
    }

    public RemoteRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RemoteRoundImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
