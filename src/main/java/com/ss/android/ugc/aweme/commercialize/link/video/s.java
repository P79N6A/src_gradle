package com.ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.model.j;

public final class s extends RelativeLayout implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39040a;

    /* renamed from: b  reason: collision with root package name */
    o f39041b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteImageView f39042c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f39043d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f39044e;

    /* renamed from: f  reason: collision with root package name */
    private View f39045f;

    public final View c() {
        return this;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39040a, false, 30948, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39040a, false, 30948, new Class[0], Void.TYPE);
            return;
        }
        if (this.f39041b != null) {
            this.f39041b.a();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f39040a, false, 30949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39040a, false, 30949, new Class[0], Void.TYPE);
            return;
        }
        if (this.f39041b != null) {
            this.f39041b.d();
        }
    }

    public final void setLinkTagCallBack(o oVar) {
        this.f39041b = oVar;
    }

    public s(Context context) {
        this(context, null, 0);
    }

    private s(Context context, AttributeSet attributeSet, int i) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(C0906R.layout.a5g, this, true);
        this.f39042c = (RemoteImageView) findViewById(C0906R.id.bce);
        this.f39043d = (TextView) findViewById(C0906R.id.bcd);
        this.f39044e = (ImageView) findViewById(C0906R.id.bcf);
        this.f39045f = findViewById(C0906R.id.bch);
        setBackgroundResource(2130838055);
        this.f39042c.setOnClickListener(new t(this));
    }

    public final void a(j jVar, o oVar, CommerceTagLayout commerceTagLayout) {
        j jVar2 = jVar;
        o oVar2 = oVar;
        CommerceTagLayout commerceTagLayout2 = commerceTagLayout;
        if (PatchProxy.isSupport(new Object[]{jVar2, oVar2, commerceTagLayout2}, this, f39040a, false, 30947, new Class[]{j.class, o.class, CommerceTagLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2, oVar2, commerceTagLayout2}, this, f39040a, false, 30947, new Class[]{j.class, o.class, CommerceTagLayout.class}, Void.TYPE);
            return;
        }
        this.f39041b = oVar2;
        ((GenericDraweeHierarchy) this.f39042c.getHierarchy()).setFailureImage((int) C0906R.color.a1d);
        if (jVar.getImageList() == null || jVar.getImageList().size() <= 0) {
            commerceTagLayout2.setVisibility(8);
            return;
        }
        UrlModel urlModel = jVar.getImageList().get(0);
        c.b(this.f39042c, urlModel);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0906R.dimen.lq);
        setLayoutParams(new RelativeLayout.LayoutParams((int) ((((float) dimensionPixelOffset) / ((float) urlModel.getHeight())) * ((float) urlModel.getWidth())), dimensionPixelOffset));
        if (!TextUtils.isEmpty(jVar2.label)) {
            this.f39043d.setVisibility(0);
            this.f39043d.setText(jVar2.label);
        }
        if (jVar2.showCloseTips) {
            this.f39044e.setVisibility(0);
            this.f39044e.setOnClickListener(new u(commerceTagLayout2, oVar2));
            return;
        }
        this.f39044e.setVisibility(8);
        this.f39045f.setVisibility(8);
    }
}
