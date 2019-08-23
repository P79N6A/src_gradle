package com.ss.android.ugc.aweme.commercialize.link.video;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commercialize.model.j;
import org.jetbrains.annotations.Nullable;

public final class w extends LinearLayout implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39054a;

    /* renamed from: b  reason: collision with root package name */
    o f39055b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteImageView f39056c;

    /* renamed from: d  reason: collision with root package name */
    private DmtTextView f39057d;

    /* renamed from: e  reason: collision with root package name */
    private DmtTextView f39058e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f39059f;
    private View g;
    private j h;

    public final View c() {
        return this;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39054a, false, 30957, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39054a, false, 30957, new Class[0], Void.TYPE);
            return;
        }
        if (this.f39055b != null) {
            this.f39055b.a();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f39054a, false, 30958, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39054a, false, 30958, new Class[0], Void.TYPE);
            return;
        }
        if (this.f39055b != null) {
            this.f39055b.d();
        }
    }

    public final void setLinkTagCallBack(o oVar) {
        this.f39055b = oVar;
    }

    public w(Context context) {
        this(context, null, 0);
    }

    @SuppressLint({"DrawAllocation", "CI_DrawAllocation"})
    public final void onMeasure(int i, int i2) {
        StaticLayout staticLayout;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f39054a, false, 30956, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f39054a, false, 30956, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f39057d.getLayoutParams();
        int maxWidth = this.f39057d.getMaxWidth();
        this.f39057d.setTextSize(12.0f);
        if (Build.VERSION.SDK_INT >= 23) {
            staticLayout = StaticLayout.Builder.obtain(this.h.title, 0, this.h.title.length(), this.f39057d.getPaint(), maxWidth).build();
        } else {
            staticLayout = new StaticLayout(this.h.title, this.f39057d.getPaint(), maxWidth, Layout.Alignment.ALIGN_NORMAL, this.f39057d.getLineSpacingMultiplier(), this.f39057d.getLineSpacingExtra(), this.f39057d.getIncludeFontPadding());
        }
        if (staticLayout.getLineCount() > 1) {
            this.f39057d.setTextSize(12.0f);
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginEnd(u.a(8.0d));
            }
            layoutParams.rightMargin = u.a(8.0d);
        } else {
            this.f39057d.setTextSize(13.0f);
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginEnd(u.a(5.0d));
            }
            layoutParams.rightMargin = u.a(5.0d);
        }
        this.f39057d.setLayoutParams(layoutParams);
    }

    private w(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(C0906R.layout.a5h, this, true);
        this.f39056c = (RemoteImageView) findViewById(C0906R.id.bcg);
        this.f39057d = (DmtTextView) findViewById(C0906R.id.bcd);
        this.f39058e = (DmtTextView) findViewById(C0906R.id.bcc);
        this.f39059f = (ImageView) findViewById(C0906R.id.bcf);
        this.g = findViewById(C0906R.id.bch);
        if (PatchProxy.isSupport(new Object[0], this, f39054a, false, 30954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39054a, false, 30954, new Class[0], Void.TYPE);
        } else {
            setBackgroundResource(2130838054);
            setOrientation(0);
            setGravity(16);
            setPadding(u.a(5.0d), 0, u.a(5.0d), 0);
        }
        if (PatchProxy.isSupport(new Object[0], this, f39054a, false, 30953, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39054a, false, 30953, new Class[0], Void.TYPE);
            return;
        }
        setOnClickListener(new x(this));
    }

    public final void a(j jVar, o oVar, CommerceTagLayout commerceTagLayout) {
        j jVar2 = jVar;
        o oVar2 = oVar;
        CommerceTagLayout commerceTagLayout2 = commerceTagLayout;
        if (PatchProxy.isSupport(new Object[]{jVar2, oVar2, commerceTagLayout2}, this, f39054a, false, 30955, new Class[]{j.class, o.class, CommerceTagLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2, oVar2, commerceTagLayout2}, this, f39054a, false, 30955, new Class[]{j.class, o.class, CommerceTagLayout.class}, Void.TYPE);
            return;
        }
        this.f39055b = oVar2;
        if (jVar2 == null) {
            this.f39057d.setText("");
            return;
        }
        this.h = jVar2;
        ((GenericDraweeHierarchy) this.f39056c.getHierarchy()).setFailureImage((int) C0906R.color.a1d);
        UrlModel urlModel = jVar2.avatarIcon;
        if (urlModel != null && !CollectionUtils.isEmpty(urlModel.getUrlList())) {
            c.b(this.f39056c, jVar2.avatarIcon);
        }
        if (!TextUtils.isEmpty(this.h.label)) {
            this.f39058e.setVisibility(0);
            this.f39058e.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.g);
            this.f39058e.setText(this.h.label);
        }
        this.f39057d.setText(this.h.title);
        if (TextUtils.isEmpty(this.h.label) && !jVar2.showCloseTips) {
            this.g.setVisibility(8);
        }
        if (jVar2.showCloseTips) {
            this.f39059f.setVisibility(0);
            this.f39059f.setOnClickListener(new y(commerceTagLayout2, oVar2));
        } else {
            this.f39059f.setVisibility(8);
        }
        this.f39057d.setText(jVar2.title);
    }
}
