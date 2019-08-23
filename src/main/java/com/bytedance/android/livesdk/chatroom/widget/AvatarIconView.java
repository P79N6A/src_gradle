package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.AttrRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.utility.R$styleable;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AvatarIconView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13350a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f13351b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f13352c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f13353d;

    /* renamed from: e  reason: collision with root package name */
    private int f13354e;

    /* renamed from: f  reason: collision with root package name */
    private int f13355f;
    private int g;

    public AvatarIconView(@NonNull Context context) {
        this(context, null);
    }

    public void setAvatar(ImageModel imageModel) {
        if (PatchProxy.isSupport(new Object[]{imageModel}, this, f13350a, false, 7790, new Class[]{ImageModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageModel}, this, f13350a, false, 7790, new Class[]{ImageModel.class}, Void.TYPE);
            return;
        }
        if (imageModel != null) {
            b.b(this.f13351b, imageModel, this.f13354e, this.f13354e, 2130841468);
        }
    }

    public void setAvatar(@DrawableRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f13350a, false, 7792, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f13350a, false, 7792, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        b.a(this.f13351b, i);
    }

    public void setAvatarBorder(ImageModel imageModel) {
        if (PatchProxy.isSupport(new Object[]{imageModel}, this, f13350a, false, 7791, new Class[]{ImageModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageModel}, this, f13350a, false, 7791, new Class[]{ImageModel.class}, Void.TYPE);
        } else if (imageModel != null) {
            this.f13352c.setVisibility(0);
            b.a(this.f13352c, imageModel, this.f13355f, this.f13355f);
        } else {
            this.f13352c.setVisibility(8);
        }
    }

    public void setIcon(ImageModel imageModel) {
        if (PatchProxy.isSupport(new Object[]{imageModel}, this, f13350a, false, 7793, new Class[]{ImageModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageModel}, this, f13350a, false, 7793, new Class[]{ImageModel.class}, Void.TYPE);
        } else if (imageModel != null) {
            this.f13353d.setVisibility(0);
            b.a(this.f13353d, imageModel, this.g, this.g, -1);
        } else {
            this.f13353d.setVisibility(4);
        }
    }

    public AvatarIconView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarIconView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        this.f13354e = (int) UIUtils.dip2Px(context, 100.0f);
        this.g = (int) UIUtils.dip2Px(context, 42.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AvatarIconView);
            this.f13354e = obtainStyledAttributes.getDimensionPixelSize(1, this.f13354e);
            this.f13355f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.g = obtainStyledAttributes.getDimensionPixelSize(2, this.g);
            obtainStyledAttributes.recycle();
        }
        this.f13351b = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f13354e, this.f13354e);
        layoutParams.gravity = 17;
        this.f13351b.setLayoutParams(layoutParams);
        addView(this.f13351b);
        this.f13352c = new ImageView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f13355f, this.f13355f);
        layoutParams2.gravity = 17;
        this.f13352c.setLayoutParams(layoutParams2);
        addView(this.f13352c);
        this.f13353d = new ImageView(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(this.g, this.g);
        layoutParams3.bottomMargin = (int) UIUtils.dip2Px(context, 3.0f);
        layoutParams3.rightMargin = (int) UIUtils.dip2Px(context, 2.0f);
        layoutParams3.gravity = 8388693;
        this.f13353d.setLayoutParams(layoutParams3);
        addView(this.f13353d);
        this.f13353d.setVisibility(4);
    }
}
