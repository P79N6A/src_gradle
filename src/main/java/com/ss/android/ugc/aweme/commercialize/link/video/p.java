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
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commercialize.model.j;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.eh;

public final class p extends LinearLayout implements View.OnClickListener, n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39028a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f39029b;

    /* renamed from: c  reason: collision with root package name */
    private DmtTextView f39030c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f39031d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f39032e;

    /* renamed from: f  reason: collision with root package name */
    private View f39033f;
    private o g;

    public final View c() {
        return this;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39028a, false, 30942, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39028a, false, 30942, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.a();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f39028a, false, 30943, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39028a, false, 30943, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.d();
        }
    }

    public final void setLinkTagCallBack(o oVar) {
        this.g = oVar;
    }

    p(Context context) {
        this(context, null);
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f39028a, false, 30944, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39028a, false, 30944, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (this.g != null) {
            this.g.b();
        }
    }

    private p(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a5i, this, true);
        setPadding(u.a(5.0d), getTopPaddingOffset(), u.a(4.0d), getBottomPaddingOffset());
        setBackgroundResource(2130838054);
        setGravity(16);
        this.f39029b = (RemoteImageView) findViewById(C0906R.id.bca);
        this.f39030c = (DmtTextView) findViewById(C0906R.id.bc_);
        this.f39031d = (ImageView) findViewById(C0906R.id.bcf);
        this.f39032e = (ImageView) findViewById(C0906R.id.b4i);
        this.f39033f = findViewById(C0906R.id.byf);
        setOnClickListener(this);
    }

    public final void a(j jVar, o oVar, CommerceTagLayout commerceTagLayout) {
        float f2;
        j jVar2 = jVar;
        o oVar2 = oVar;
        CommerceTagLayout commerceTagLayout2 = commerceTagLayout;
        if (PatchProxy.isSupport(new Object[]{jVar2, oVar2, commerceTagLayout2}, this, f39028a, false, 30941, new Class[]{j.class, o.class, CommerceTagLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2, oVar2, commerceTagLayout2}, this, f39028a, false, 30941, new Class[]{j.class, o.class, CommerceTagLayout.class}, Void.TYPE);
            return;
        }
        this.g = oVar2;
        if (jVar2 == null) {
            this.f39029b.setImageResource(17170445);
            this.f39030c.setText("");
            return;
        }
        ((GenericDraweeHierarchy) this.f39029b.getHierarchy()).setFailureImage((int) C0906R.color.a1d);
        UrlModel urlModel = jVar2.avatarIcon;
        if (urlModel == null || CollectionUtils.isEmpty(urlModel.getUrlList())) {
            this.f39029b.setImageResource(17170445);
        } else {
            c.b(this.f39029b, jVar2.avatarIcon);
        }
        if (jVar2.showCloseTips) {
            this.f39031d.setVisibility(0);
        } else {
            this.f39031d.setVisibility(8);
        }
        this.f39031d.setOnClickListener(new q(commerceTagLayout2, oVar2));
        if (!TextUtils.isEmpty(jVar2.label)) {
            DmtTextView dmtTextView = (DmtTextView) findViewById(C0906R.id.d1);
            dmtTextView.setVisibility(0);
            dmtTextView.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.g);
            dmtTextView.setText(jVar2.label);
        }
        boolean cl = AbTestManager.a().cl();
        if (!TextUtils.isEmpty(jVar2.label) || jVar2.showCloseTips) {
            findViewById(C0906R.id.d4).setVisibility(0);
            cl = false;
        }
        if (cl) {
            f2 = 200.0f;
        } else {
            f2 = 150.0f;
        }
        String a2 = eh.a(this.f39030c.getPaint(), f2, jVar2.title);
        this.f39030c.setText(a2);
        if (cl) {
            this.f39032e.setVisibility(0);
            this.f39033f.setVisibility(8);
            eh.a(this.f39032e, a2.endsWith("…"));
            return;
        }
        this.f39032e.setVisibility(8);
        this.f39033f.setVisibility(0);
    }
}
