package com.ss.android.ugc.aweme.story.shootvideo.publish.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.e.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.story.shootvideo.a;

public class PublishBottomLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73772a;

    /* renamed from: b  reason: collision with root package name */
    public View f73773b;

    /* renamed from: c  reason: collision with root package name */
    public View f73774c;

    /* renamed from: d  reason: collision with root package name */
    public RemoteImageView f73775d;

    /* renamed from: e  reason: collision with root package name */
    public LinearLayout f73776e;

    /* renamed from: f  reason: collision with root package name */
    public PublishSelectFriendImgView f73777f;
    public boolean g;
    public boolean h;
    String i;
    cb j;
    private Context k;
    private View l;
    private View m;
    private ImageView n;

    public View getSelectFriendView() {
        return this.f73773b;
    }

    public View getStartPublishView() {
        return this.f73774c;
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f73772a, false, 85516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73772a, false, 85516, new Class[0], Void.TYPE);
            return;
        }
        a.a(this);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f73772a, false, 85518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73772a, false, 85518, new Class[0], Void.TYPE);
        } else if (this.g) {
            this.n.setImageResource(2130839532);
        } else {
            this.n.setImageResource(2130839531);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f73772a, false, 85519, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73772a, false, 85519, new Class[0], Void.TYPE);
            return;
        }
        c();
        this.h = false;
    }

    public void setCreationId(String str) {
        this.i = str;
    }

    public void setEditModel(cb cbVar) {
        this.j = cbVar;
    }

    public PublishBottomLayout(@NonNull Context context) {
        this(context, null);
    }

    public PublishBottomLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z;
        this.g = true;
        this.h = true;
        this.k = context;
        if (PatchProxy.isSupport(new Object[0], this, f73772a, false, 85513, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73772a, false, 85513, new Class[0], Void.TYPE);
            return;
        }
        this.l = LayoutInflater.from(this.k).inflate(C0906R.layout.a94, null);
        if (fc.a()) {
            RelativeLayout relativeLayout = (RelativeLayout) this.l.findViewById(C0906R.id.cfi);
            relativeLayout.setPadding(relativeLayout.getPaddingLeft(), relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), 0);
            RelativeLayout relativeLayout2 = (RelativeLayout) this.l.findViewById(C0906R.id.b82);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout2.getLayoutParams();
            layoutParams.height = (int) UIUtils.dip2Px(this.k, 58.0f);
            relativeLayout2.setLayoutParams(layoutParams);
        }
        this.f73773b = this.l.findViewById(C0906R.id.b8t);
        this.f73777f = (PublishSelectFriendImgView) this.l.findViewById(C0906R.id.cn3);
        this.m = this.l.findViewById(C0906R.id.b_d);
        this.n = (ImageView) this.l.findViewById(C0906R.id.bne);
        this.f73774c = this.l.findViewById(C0906R.id.cuo);
        this.f73776e = (LinearLayout) this.l.findViewById(C0906R.id.b_s);
        this.f73775d = (RemoteImageView) this.l.findViewById(C0906R.id.b50);
        b.a.g().a(this.f73776e);
        if (PatchProxy.isSupport(new Object[0], null, f.f63287a, true, 70243, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f.f63287a, true, 70243, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            z = f.d();
        }
        if (!z) {
            this.m.setVisibility(8);
        } else {
            this.g = ((Boolean) com.ss.android.ugc.aweme.port.in.a.o.w().a()).booleanValue();
            a();
            this.m.setOnClickListener(new a(this));
        }
        if (((Integer) com.ss.android.ugc.aweme.port.in.a.o.x().a()).intValue() == 0) {
            this.f73773b.setVisibility(8);
        } else {
            this.f73773b.setVisibility(0);
        }
        addView(this.l);
    }
}
