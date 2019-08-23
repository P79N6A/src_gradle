package com.ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commercialize.model.j;

public final class f extends RelativeLayout implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39002a;

    /* renamed from: b  reason: collision with root package name */
    o f39003b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteImageView f39004c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f39005d;

    public final View c() {
        return this;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39002a, false, 30927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39002a, false, 30927, new Class[0], Void.TYPE);
            return;
        }
        if (this.f39003b != null) {
            this.f39003b.a();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f39002a, false, 30928, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39002a, false, 30928, new Class[0], Void.TYPE);
            return;
        }
        if (this.f39003b != null) {
            this.f39003b.d();
        }
    }

    public final void setLinkTagCallBack(o oVar) {
        this.f39003b = oVar;
    }

    public f(Context context) {
        this(context, null, 0);
    }

    private f(Context context, AttributeSet attributeSet, int i) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(C0906R.layout.a4t, this, true);
        this.f39004c = (RemoteImageView) findViewById(C0906R.id.bce);
        this.f39005d = (ImageView) findViewById(C0906R.id.bcf);
        setBackgroundResource(2130838055);
        this.f39004c.setOnClickListener(new g(this));
    }

    public final void a(j jVar, o oVar, CommerceTagLayout commerceTagLayout) {
        j jVar2 = jVar;
        o oVar2 = oVar;
        CommerceTagLayout commerceTagLayout2 = commerceTagLayout;
        if (PatchProxy.isSupport(new Object[]{jVar2, oVar2, commerceTagLayout2}, this, f39002a, false, 30926, new Class[]{j.class, o.class, CommerceTagLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2, oVar2, commerceTagLayout2}, this, f39002a, false, 30926, new Class[]{j.class, o.class, CommerceTagLayout.class}, Void.TYPE);
            return;
        }
        this.f39003b = oVar2;
        ((GenericDraweeHierarchy) this.f39004c.getHierarchy()).setFailureImage((int) C0906R.color.a1d);
        if (jVar.getImageList() == null || jVar.getImageList().size() <= 0) {
            commerceTagLayout2.setVisibility(8);
            return;
        }
        UrlModel urlModel = jVar.getImageList().get(0);
        c.b(this.f39004c, urlModel);
        setLayoutParams(new RelativeLayout.LayoutParams(u.a((double) (urlModel.getWidth() / 2)), u.a((double) (urlModel.getHeight() / 2))));
        if (jVar2.showCloseTips) {
            this.f39005d.setVisibility(0);
            this.f39005d.setOnClickListener(new h(commerceTagLayout2, oVar2));
            return;
        }
        this.f39005d.setVisibility(8);
    }
}
