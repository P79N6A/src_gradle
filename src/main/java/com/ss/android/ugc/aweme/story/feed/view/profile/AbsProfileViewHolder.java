package com.ss.android.ugc.aweme.story.feed.view.profile;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.drawable.ScaleTypeDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.bytex.a.a.a;

public abstract class AbsProfileViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72759a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f72760b;

    /* renamed from: c  reason: collision with root package name */
    protected AvatarImageView f72761c;

    /* renamed from: d  reason: collision with root package name */
    protected ViewGroup f72762d;

    /* renamed from: e  reason: collision with root package name */
    protected TextView f72763e;

    /* renamed from: f  reason: collision with root package name */
    protected int f72764f = 1;
    private ProfileEntity g;

    public void a(int i) {
        this.f72764f = i;
    }

    public AbsProfileViewHolder(View view) {
        super(view);
        this.f72762d = (ViewGroup) view.findViewById(C0906R.id.af6);
        this.f72761c = (AvatarImageView) view.findViewById(C0906R.id.ayr);
        this.f72760b = this.f72761c.getContext();
        this.f72763e = (TextView) view.findViewById(C0906R.id.dgo);
    }

    public void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72759a, false, 84037, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72759a, false, 84037, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i == 1) {
            this.f72763e.setVisibility(0);
        } else {
            this.f72763e.setVisibility(8);
        }
    }

    public void a(ProfileEntity profileEntity) {
        if (PatchProxy.isSupport(new Object[]{profileEntity}, this, f72759a, false, 84035, new Class[]{ProfileEntity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{profileEntity}, this, f72759a, false, 84035, new Class[]{ProfileEntity.class}, Void.TYPE);
        } else if (profileEntity.getUser() != null) {
            this.g = profileEntity;
            this.itemView.setAlpha(1.0f);
            if (this.f72761c instanceof AvatarWithBorderView) {
                ((GenericDraweeHierarchy) this.f72761c.getHierarchy()).getRoundingParams().setPadding(UIUtils.dip2Px(this.f72760b, 3.0f));
            }
            c.b(this.f72761c, profileEntity.getUser().getAvatarThumb());
            b(this.f72764f);
            this.f72763e.setText(profileEntity.getUser().getNickname());
            if (profileEntity.isMeetUser()) {
                Drawable a2 = a.a(this.f72760b.getResources(), 2130837761);
                if (PatchProxy.isSupport(new Object[]{a2}, this, f72759a, false, 84036, new Class[]{Drawable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{a2}, this, f72759a, false, 84036, new Class[]{Drawable.class}, Void.TYPE);
                    return;
                }
                ((GenericDraweeHierarchy) this.f72761c.getHierarchy()).setOverlayImage(new ScaleTypeDrawable(a2, ScalingUtils.ScaleType.FIT_END));
            }
        }
    }
}
