package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;

public class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74330a;

    /* renamed from: b  reason: collision with root package name */
    public View f74331b;

    /* renamed from: c  reason: collision with root package name */
    public View f74332c;

    /* renamed from: d  reason: collision with root package name */
    private int f74333d;

    /* renamed from: e  reason: collision with root package name */
    private int f74334e;

    public a(Context context) {
        this(context, null);
    }

    private a(Context context, AttributeSet attributeSet) {
        super(context, null);
        this.f74333d = 4;
        this.f74334e = -16717825;
        this.f74333d = (int) UIUtils.dip2Px(context, 1.5f);
        this.f74331b = new View(context);
        this.f74331b.setBackgroundColor(this.f74334e);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f74333d);
        layoutParams.gravity = 16;
        this.f74331b.setLayoutParams(layoutParams);
        this.f74332c = new View(context);
        this.f74332c.setBackgroundColor(this.f74334e);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f74333d, -1);
        layoutParams2.gravity = 1;
        this.f74332c.setLayoutParams(layoutParams2);
        addView(this.f74331b);
        addView(this.f74332c);
        this.f74331b.setVisibility(8);
        this.f74332c.setVisibility(8);
    }
}
