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
import org.jetbrains.annotations.Nullable;

public final class j extends LinearLayout implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39014a;

    /* renamed from: b  reason: collision with root package name */
    o f39015b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteImageView f39016c;

    /* renamed from: d  reason: collision with root package name */
    private DmtTextView f39017d;

    /* renamed from: e  reason: collision with root package name */
    private DmtTextView f39018e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f39019f;
    private com.ss.android.ugc.aweme.commercialize.model.j g;

    public final View c() {
        return this;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39014a, false, 30936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39014a, false, 30936, new Class[0], Void.TYPE);
            return;
        }
        if (this.f39015b != null) {
            this.f39015b.a();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f39014a, false, 30937, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39014a, false, 30937, new Class[0], Void.TYPE);
            return;
        }
        if (this.f39015b != null) {
            this.f39015b.d();
        }
    }

    public final void setLinkTagCallBack(o oVar) {
        this.f39015b = oVar;
    }

    public j(Context context) {
        this(context, null, 0);
    }

    @SuppressLint({"DrawAllocation", "CI_DrawAllocation"})
    public final void onMeasure(int i, int i2) {
        StaticLayout staticLayout;
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f39014a, false, 30935, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f39014a, false, 30935, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        measureChildren(i, i2);
        int maxWidth = this.f39017d.getMaxWidth();
        this.f39017d.setTextSize(13.0f);
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.g.title == null) {
                str = "";
            } else {
                str = this.g.title;
            }
            staticLayout = StaticLayout.Builder.obtain(str, 0, str.length(), this.f39017d.getPaint(), maxWidth).build();
        } else {
            staticLayout = new StaticLayout(this.g.title, this.f39017d.getPaint(), maxWidth, Layout.Alignment.ALIGN_NORMAL, this.f39017d.getLineSpacingMultiplier(), this.f39017d.getLineSpacingExtra(), this.f39017d.getIncludeFontPadding());
        }
        if (staticLayout.getLineCount() > 1 && !TextUtils.isEmpty(this.g.label)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f39016c.getLayoutParams();
            layoutParams.height = u.a(48.0d);
            layoutParams.width = u.a(48.0d);
            this.f39016c.setLayoutParams(layoutParams);
        }
    }

    private j(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(C0906R.layout.a4u, this, true);
        setPadding(u.a(5.0d), u.a(5.0d), u.a(5.0d), u.a(5.0d));
        this.f39016c = (RemoteImageView) findViewById(C0906R.id.bcg);
        this.f39017d = (DmtTextView) findViewById(C0906R.id.bcd);
        this.f39018e = (DmtTextView) findViewById(C0906R.id.bcc);
        this.f39019f = (ImageView) findViewById(C0906R.id.bcf);
        if (PatchProxy.isSupport(new Object[0], this, f39014a, false, 30933, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39014a, false, 30933, new Class[0], Void.TYPE);
        } else {
            setBackgroundResource(2130838054);
            setOrientation(0);
            setPadding(u.a(5.0d), u.a(5.0d), u.a(5.0d), u.a(5.0d));
        }
        if (PatchProxy.isSupport(new Object[0], this, f39014a, false, 30932, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39014a, false, 30932, new Class[0], Void.TYPE);
            return;
        }
        setOnClickListener(new k(this));
    }

    public final void a(com.ss.android.ugc.aweme.commercialize.model.j jVar, o oVar, CommerceTagLayout commerceTagLayout) {
        com.ss.android.ugc.aweme.commercialize.model.j jVar2 = jVar;
        o oVar2 = oVar;
        CommerceTagLayout commerceTagLayout2 = commerceTagLayout;
        if (PatchProxy.isSupport(new Object[]{jVar2, oVar2, commerceTagLayout2}, this, f39014a, false, 30934, new Class[]{com.ss.android.ugc.aweme.commercialize.model.j.class, o.class, CommerceTagLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2, oVar2, commerceTagLayout2}, this, f39014a, false, 30934, new Class[]{com.ss.android.ugc.aweme.commercialize.model.j.class, o.class, CommerceTagLayout.class}, Void.TYPE);
            return;
        }
        this.f39015b = oVar2;
        if (jVar2 == null) {
            this.f39017d.setText("");
            return;
        }
        this.g = jVar2;
        ((GenericDraweeHierarchy) this.f39016c.getHierarchy()).setFailureImage((int) C0906R.color.a1d);
        UrlModel urlModel = jVar2.avatarIcon;
        if (urlModel != null && !CollectionUtils.isEmpty(urlModel.getUrlList())) {
            c.b(this.f39016c, jVar2.avatarIcon);
        }
        if (!TextUtils.isEmpty(this.g.label)) {
            this.f39018e.setVisibility(0);
            this.f39018e.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.g);
            this.f39018e.setText(this.g.label);
        }
        this.f39017d.setText(this.g.title);
        if (jVar2.showCloseTips) {
            this.f39019f.setVisibility(0);
            this.f39019f.setOnClickListener(new l(commerceTagLayout2, oVar2));
        } else {
            this.f39019f.setVisibility(8);
        }
        this.f39017d.setText(jVar2.title);
    }
}
