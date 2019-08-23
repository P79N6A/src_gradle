package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class AvatarWithBorderView extends AvatarImageView {
    public static ChangeQuickRedirect g;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 24982, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 24982, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        if (((GenericDraweeHierarchy) getHierarchy()).getRoundingParams() != null) {
            ((GenericDraweeHierarchy) getHierarchy()).getRoundingParams().setBorderWidth(UIUtils.dip2Px(getContext(), 1.0f));
            ((GenericDraweeHierarchy) getHierarchy()).getRoundingParams().setBorderColor(getResources().getColor(C0906R.color.bc));
            ((GenericDraweeHierarchy) getHierarchy()).getRoundingParams().setPadding(UIUtils.dip2Px(getContext(), 1.0f));
        }
    }

    public AvatarWithBorderView(Context context) {
        super(context);
    }

    public void setBorderColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, g, false, 24983, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, g, false, 24983, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (((GenericDraweeHierarchy) getHierarchy()).getRoundingParams() != null) {
            ((GenericDraweeHierarchy) getHierarchy()).getRoundingParams().setBorderColor(ContextCompat.getColor(getContext(), i));
        }
    }

    public void setBorderWidth(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, g, false, 24984, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, g, false, 24984, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (((GenericDraweeHierarchy) getHierarchy()).getRoundingParams() != null) {
            ((GenericDraweeHierarchy) getHierarchy()).getRoundingParams().setBorderWidth(UIUtils.dip2Px(getContext(), (float) i));
        }
    }

    public void setBorderWidthPx(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, g, false, 24985, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, g, false, 24985, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (((GenericDraweeHierarchy) getHierarchy()).getRoundingParams() != null) {
            ((GenericDraweeHierarchy) getHierarchy()).getRoundingParams().setBorderWidth((float) i);
        }
    }

    public AvatarWithBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarWithBorderView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
    }

    public AvatarWithBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AvatarWithBorderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
