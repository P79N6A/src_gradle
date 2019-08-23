package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.bytex.a.a.a;

public class AvatarImageWithLive extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46072a;

    /* renamed from: b  reason: collision with root package name */
    AvatarWithBorderView f46073b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f46074c;

    public AvatarWithBorderView getAvatarImageView() {
        return this.f46073b;
    }

    @NonNull
    private RelativeLayout.LayoutParams getAvatarLayoutParams() {
        if (!PatchProxy.isSupport(new Object[0], this, f46072a, false, 42412, new Class[0], RelativeLayout.LayoutParams.class)) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        return (RelativeLayout.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f46072a, false, 42412, new Class[0], RelativeLayout.LayoutParams.class);
    }

    @NonNull
    private RelativeLayout.LayoutParams getLiveLayoutParams() {
        if (PatchProxy.isSupport(new Object[0], this, f46072a, false, 42413, new Class[0], RelativeLayout.LayoutParams.class)) {
            return (RelativeLayout.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f46072a, false, 42413, new Class[0], RelativeLayout.LayoutParams.class);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a(32), a(13));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        layoutParams.topMargin = a(1);
        return layoutParams;
    }

    public AvatarImageWithLive(Context context) {
        this(context, null);
    }

    private int a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46072a, false, 42414, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return (int) UIUtils.dip2Px(getContext(), (float) i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46072a, false, 42414, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public void setBorderColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46072a, false, 42415, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46072a, false, 42415, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f46073b != null) {
            this.f46073b.setBorderColor(i);
        }
    }

    public final void a(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f46072a, false, 42411, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f46072a, false, 42411, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z) {
            this.f46074c.setVisibility(8);
        } else {
            this.f46074c.setVisibility(0);
            try {
                AbTestManager a2 = AbTestManager.a();
                if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 72010, new Class[0], Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 72010, new Class[0], Integer.TYPE)).intValue();
                } else {
                    AbTestModel d2 = a2.d();
                    if (d2 != null) {
                        i = d2.feedAvatarStyle;
                    }
                }
                if (i == 0) {
                    this.f46074c.setImageDrawable(a.a(getResources(), 2130838795));
                } else {
                    this.f46074c.setImageDrawable(a.a(getResources(), 2130838796));
                }
            } catch (Resources.NotFoundException unused) {
            }
        }
    }

    public AvatarImageWithLive(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarImageWithLive(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[0], this, f46072a, false, 42410, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46072a, false, 42410, new Class[0], Void.TYPE);
            return;
        }
        this.f46073b = new AvatarWithBorderView(getContext());
        if (com.ss.android.g.a.b()) {
            ((GenericDraweeHierarchy) this.f46073b.getHierarchy()).setPlaceholderImage((int) C0906R.color.a0k, ScalingUtils.ScaleType.CENTER_CROP);
        }
        addView(this.f46073b, getAvatarLayoutParams());
        this.f46074c = new ImageView(getContext());
        this.f46074c.setVisibility(8);
        addView(this.f46074c, getLiveLayoutParams());
    }
}
