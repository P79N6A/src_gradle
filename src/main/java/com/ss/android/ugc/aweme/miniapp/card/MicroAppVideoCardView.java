package com.ss.android.ugc.aweme.miniapp.card;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp.l.c;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.util.Map;

public class MicroAppVideoCardView extends ConstraintLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55626a;

    /* renamed from: b  reason: collision with root package name */
    boolean f55627b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f55628c;

    /* renamed from: d  reason: collision with root package name */
    View f55629d;

    /* renamed from: e  reason: collision with root package name */
    AnimatedImageView f55630e;

    /* renamed from: f  reason: collision with root package name */
    DmtTextView f55631f;
    DmtTextView g;
    DmtTextView h;
    ImageView i;
    Aweme j;
    String k;
    boolean l;
    a m;

    interface a {
        void a();
    }

    public void setOnClickCloseListener(a aVar) {
        this.m = aVar;
    }

    public MicroAppVideoCardView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: package-private */
    public void a(Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f55626a, false, 59187, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f55626a, false, 59187, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        b a2 = new b.a().a("in_video_tag").d(aweme.getAid()).b(this.k).c("023001").a();
        String c2 = c.c(aweme);
        IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
        iMiniAppService.openMiniApp(getContext(), c.c(aweme), a2);
        d a3 = d.a().a("mp_id", iMiniAppService.getAppId(c2)).a(" group_id", aweme.getAid()).a("position", "transform_card").a("enter_from", this.k);
        if (iMiniAppService.isMicroGameSchema(c2)) {
            str = "micro_game";
        } else {
            str = "micro_app";
        }
        r.a("mp_click", (Map) a3.a("_param_for_special", str).f34114b);
    }

    public MicroAppVideoCardView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(boolean z, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), aweme}, this, f55626a, false, 59192, new Class[]{Boolean.TYPE, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), aweme}, this, f55626a, false, 59192, new Class[]{Boolean.TYPE, Aweme.class}, Void.TYPE);
            return;
        }
        this.f55628c = z;
        if (!c.a(aweme)) {
            setVisibility(8);
        } else if (z || !this.f55627b) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    public MicroAppVideoCardView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f55629d = LayoutInflater.from(context).inflate(C0906R.layout.aab, this);
        this.f55630e = (AnimatedImageView) this.f55629d.findViewById(C0906R.id.bna);
        this.i = (ImageView) this.f55629d.findViewById(C0906R.id.bn9);
        this.g = (DmtTextView) this.f55629d.findViewById(C0906R.id.bn_);
        this.f55631f = (DmtTextView) this.f55629d.findViewById(C0906R.id.bnb);
        this.h = (DmtTextView) this.f55629d.findViewById(C0906R.id.bn8);
    }
}
