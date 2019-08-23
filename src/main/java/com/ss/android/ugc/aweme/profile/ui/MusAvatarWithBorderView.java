package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;

public class MusAvatarWithBorderView extends AvatarImageView {
    public static ChangeQuickRedirect g;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 68250, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 68250, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        if (((GenericDraweeHierarchy) getHierarchy()).getRoundingParams() != null) {
            ((GenericDraweeHierarchy) getHierarchy()).getRoundingParams().setBorderWidth(UIUtils.dip2Px(getContext(), 1.0f));
            ((GenericDraweeHierarchy) getHierarchy()).getRoundingParams().setBorderColor(getResources().getColor(C0906R.color.a0k));
            ((GenericDraweeHierarchy) getHierarchy()).getRoundingParams().setPadding(UIUtils.dip2Px(getContext(), 1.0f));
        }
    }

    public MusAvatarWithBorderView(Context context) {
        super(context);
    }

    public void setBorderColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, g, false, 68251, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, g, false, 68251, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (((GenericDraweeHierarchy) getHierarchy()).getRoundingParams() != null) {
            ((GenericDraweeHierarchy) getHierarchy()).getRoundingParams().setBorderColor(ContextCompat.getColor(getContext(), i));
        }
    }

    public void setBorderWidth(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, g, false, 68252, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, g, false, 68252, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (((GenericDraweeHierarchy) getHierarchy()).getRoundingParams() != null) {
            ((GenericDraweeHierarchy) getHierarchy()).getRoundingParams().setBorderWidth(UIUtils.dip2Px(getContext(), (float) i));
        }
    }

    public MusAvatarWithBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusAvatarWithBorderView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
    }

    public MusAvatarWithBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MusAvatarWithBorderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
