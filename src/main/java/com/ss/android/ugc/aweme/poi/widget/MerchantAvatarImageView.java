package com.ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;

public class MerchantAvatarImageView extends CircleImageView {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f61009f;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61009f, false, 67001, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61009f, false, 67001, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        ((GenericDraweeHierarchy) getHierarchy()).setPlaceholderImage(2130838840, ScalingUtils.ScaleType.CENTER_CROP);
    }

    public MerchantAvatarImageView(Context context) {
        super(context);
    }

    public MerchantAvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MerchantAvatarImageView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
    }

    public MerchantAvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MerchantAvatarImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
