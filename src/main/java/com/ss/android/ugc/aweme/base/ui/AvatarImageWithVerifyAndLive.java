package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.bytex.a.a.a;

public class AvatarImageWithVerifyAndLive extends AvatarImageWithVerify {
    public static ChangeQuickRedirect g;
    private ImageView h;

    @NonNull
    private FrameLayout.LayoutParams getLiveLayoutParams() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 24979, new Class[0], FrameLayout.LayoutParams.class)) {
            return (FrameLayout.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, g, false, 24979, new Class[0], FrameLayout.LayoutParams.class);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a(41), a(17));
        layoutParams.gravity = 49;
        return layoutParams;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 24978, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 24978, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        FrameLayout.LayoutParams liveLayoutParams = getLiveLayoutParams();
        this.h = new ImageView(getContext());
        try {
            this.h.setImageDrawable(a.a(getResources(), 2130838796));
        } catch (Resources.NotFoundException unused) {
        }
        this.h.setVisibility(8);
        addView(this.h, liveLayoutParams);
    }

    public AvatarImageWithVerifyAndLive(Context context) {
        this(context, null);
    }

    private int a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, g, false, 24980, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return (int) UIUtils.dip2Px(getContext(), (float) i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, g, false, 24980, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, g, false, 24981, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, g, false, 24981, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
    }

    public AvatarImageWithVerifyAndLive(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarImageWithVerifyAndLive(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
