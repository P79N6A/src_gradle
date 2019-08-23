package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AvatarImageView extends CircleImageView {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f34915f;

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34915f, false, 24951, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34915f, false, 24951, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        ((GenericDraweeHierarchy) getHierarchy()).setPlaceholderImage(2130839027, ScalingUtils.ScaleType.CENTER_CROP);
    }

    public AvatarImageView(Context context) {
        super(context);
    }

    public AvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarImageView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
    }

    public AvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AvatarImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
