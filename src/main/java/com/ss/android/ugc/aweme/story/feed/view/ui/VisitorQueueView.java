package com.ss.android.ugc.aweme.story.feed.view.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public class VisitorQueueView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72824a;

    /* renamed from: b  reason: collision with root package name */
    private int f72825b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f72826c;

    /* renamed from: d  reason: collision with root package name */
    private DmtTextView f72827d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f72828e;

    /* renamed from: f  reason: collision with root package name */
    private List<User> f72829f;
    private int g;

    public VisitorQueueView(Context context) {
        this(context, null);
    }

    private void a(int i) {
        AvatarWithBorderView avatarWithBorderView;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72824a, false, 84146, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72824a, false, 84146, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int min = Math.min(this.f72829f.size(), i);
        this.f72826c.removeAllViews();
        for (int i2 = 0; i2 < min; i2++) {
            User user = this.f72829f.get(i2);
            if (PatchProxy.isSupport(new Object[]{user}, this, f72824a, false, 84147, new Class[]{User.class}, AvatarWithBorderView.class)) {
                avatarWithBorderView = (AvatarWithBorderView) PatchProxy.accessDispatch(new Object[]{user}, this, f72824a, false, 84147, new Class[]{User.class}, AvatarWithBorderView.class);
            } else {
                avatarWithBorderView = new AvatarWithBorderView(getContext());
                avatarWithBorderView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                avatarWithBorderView.setBorderColor(C0906R.color.ao4);
                avatarWithBorderView.setBorderWidthPx(2);
                c.b(avatarWithBorderView, user.getAvatarMedium());
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f72825b, this.f72825b);
            if (i2 != 0) {
                layoutParams.leftMargin = (this.f72825b * -1) / 3;
            }
            this.f72826c.addView(avatarWithBorderView, layoutParams);
        }
        if (min == 0) {
            this.f72826c.addView(this.f72828e, new LinearLayout.LayoutParams((int) UIUtils.dip2Px(getContext(), 20.0f), (int) UIUtils.dip2Px(getContext(), 20.0f)));
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = (int) UIUtils.dip2Px(getContext(), 6.0f);
        this.f72826c.addView(this.f72827d, layoutParams2);
        this.f72827d.setText(String.format(getResources().getString(C0906R.string.cg8), new Object[]{Integer.valueOf(this.g)}));
    }

    public VisitorQueueView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisitorQueueView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[0], this, f72824a, false, 84144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72824a, false, 84144, new Class[0], Void.TYPE);
        } else {
            this.f72826c = new LinearLayout(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            addView(this.f72826c, layoutParams);
            this.f72826c.setGravity(16);
            this.f72827d = new DmtTextView(getContext());
            this.f72827d.setTextSize(14.0f);
            this.f72827d.setTypeface(Typeface.defaultFromStyle(1));
            this.f72827d.setTextColor(-1);
            this.f72828e = new ImageView(getContext());
            this.f72828e.setImageResource(2130837751);
        }
        this.f72825b = (int) UIUtils.dip2Px(getContext(), 24.0f);
    }

    public final void a(List<User> list, int i, int i2) {
        List<User> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, 3, Integer.valueOf(i2)}, this, f72824a, false, 84145, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, 3, Integer.valueOf(i2)}, this, f72824a, false, 84145, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f72829f == null) {
            this.f72829f = new ArrayList();
        }
        this.f72829f.clear();
        if (!CollectionUtils.isEmpty(list)) {
            this.f72829f.addAll(list);
        }
        this.g = i2;
        a(3);
    }
}
