package com.ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commercialize.model.j;

public final class c extends LinearLayout implements View.OnClickListener, n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38991a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f38992b;

    /* renamed from: c  reason: collision with root package name */
    private DmtTextView f38993c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f38994d;

    /* renamed from: e  reason: collision with root package name */
    private o f38995e;

    public final View c() {
        return this;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38991a, false, 30921, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38991a, false, 30921, new Class[0], Void.TYPE);
            return;
        }
        if (this.f38995e != null) {
            this.f38995e.a();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f38991a, false, 30922, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38991a, false, 30922, new Class[0], Void.TYPE);
            return;
        }
        if (this.f38995e != null) {
            this.f38995e.d();
        }
    }

    public final void setLinkTagCallBack(o oVar) {
        this.f38995e = oVar;
    }

    c(Context context) {
        this(context, null);
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38991a, false, 30923, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38991a, false, 30923, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (this.f38995e != null) {
            this.f38995e.b();
        }
    }

    private c(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a4v, this, true);
        setPadding(u.a(5.0d), u.a(5.0d), u.a(5.0d), u.a(5.0d));
        setBackgroundResource(2130838054);
        this.f38992b = (RemoteImageView) findViewById(C0906R.id.bca);
        this.f38993c = (DmtTextView) findViewById(C0906R.id.bc_);
        this.f38994d = (ImageView) findViewById(C0906R.id.bcf);
        setOnClickListener(this);
    }

    public final void a(j jVar, o oVar, CommerceTagLayout commerceTagLayout) {
        j jVar2 = jVar;
        o oVar2 = oVar;
        CommerceTagLayout commerceTagLayout2 = commerceTagLayout;
        if (PatchProxy.isSupport(new Object[]{jVar2, oVar2, commerceTagLayout2}, this, f38991a, false, 30920, new Class[]{j.class, o.class, CommerceTagLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2, oVar2, commerceTagLayout2}, this, f38991a, false, 30920, new Class[]{j.class, o.class, CommerceTagLayout.class}, Void.TYPE);
            return;
        }
        this.f38995e = oVar2;
        if (jVar2 == null) {
            this.f38992b.setImageResource(17170445);
            this.f38993c.setText("");
            return;
        }
        ((GenericDraweeHierarchy) this.f38992b.getHierarchy()).setFailureImage((int) C0906R.color.a1d);
        UrlModel urlModel = jVar2.avatarIcon;
        if (urlModel == null || CollectionUtils.isEmpty(urlModel.getUrlList())) {
            this.f38992b.setImageResource(17170445);
        } else {
            com.ss.android.ugc.aweme.base.c.b(this.f38992b, jVar2.avatarIcon);
        }
        if (jVar2.showCloseTips) {
            this.f38994d.setVisibility(0);
        } else {
            this.f38994d.setVisibility(8);
        }
        this.f38994d.setOnClickListener(new d(commerceTagLayout2, oVar2));
        this.f38993c.setText(jVar2.title);
        if (!TextUtils.isEmpty(jVar2.label)) {
            DmtTextView dmtTextView = (DmtTextView) findViewById(C0906R.id.d1);
            dmtTextView.setVisibility(0);
            dmtTextView.setText(jVar2.label);
        }
    }
}
