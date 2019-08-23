package com.ss.android.ugc.aweme.miniapp.card;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.feed.a.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.e.b;
import com.ss.android.ugc.aweme.miniapp.l.c;

public final class j implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55651a;

    /* renamed from: b  reason: collision with root package name */
    MicroAppVideoCardView f55652b;

    /* renamed from: c  reason: collision with root package name */
    View f55653c;

    /* renamed from: d  reason: collision with root package name */
    boolean f55654d;

    /* renamed from: e  reason: collision with root package name */
    private Aweme f55655e;

    /* renamed from: f  reason: collision with root package name */
    private Context f55656f;
    private String g;

    public final void a() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f55651a, false, 59202, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55651a, false, 59202, new Class[0], Void.TYPE);
        } else if (this.f55652b != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f55652b.getLayoutParams();
            if (com.ss.android.ugc.aweme.profile.a.a().l) {
                i = com.ss.android.ugc.aweme.profile.a.a().b();
            }
            int a2 = b.a(this.f55656f, 58.0f) - i;
            if (com.ss.android.ugc.aweme.profile.a.d()) {
                a2 += com.ss.android.ugc.aweme.profile.a.f61216b;
            }
            marginLayoutParams.bottomMargin = a2;
            this.f55652b.setLayoutParams(marginLayoutParams);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f55651a, false, 59205, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55651a, false, 59205, new Class[0], Void.TYPE);
            return;
        }
        this.f55653c.setVisibility(0);
        MicroAppVideoCardView microAppVideoCardView = this.f55652b;
        if (PatchProxy.isSupport(new Object[0], microAppVideoCardView, MicroAppVideoCardView.f55626a, false, 59188, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], microAppVideoCardView, MicroAppVideoCardView.f55626a, false, 59188, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], microAppVideoCardView, MicroAppVideoCardView.f55626a, false, 59193, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], microAppVideoCardView, MicroAppVideoCardView.f55626a, false, 59193, new Class[0], Void.TYPE);
            return;
        }
        microAppVideoCardView.setAlpha(0.0f);
        microAppVideoCardView.setVisibility(8);
        microAppVideoCardView.setTranslationX(0.0f);
        microAppVideoCardView.setTranslationY(0.0f);
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f55651a, false, 59203, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f55651a, false, 59203, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (!this.f55654d && c.a(this.f55655e)) {
            this.f55652b.postDelayed(new l(this), j);
        }
    }

    public final void a(@NonNull Aweme aweme) {
        String str;
        String str2;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f55651a, false, 59201, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, f55651a, false, 59201, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.f55655e = aweme2;
        if (!c.a(aweme)) {
            this.f55652b.setVisibility(8);
            return;
        }
        MicroAppVideoCardView microAppVideoCardView = this.f55652b;
        String str3 = this.g;
        if (PatchProxy.isSupport(new Object[]{aweme2, str3}, microAppVideoCardView, MicroAppVideoCardView.f55626a, false, 59186, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            MicroAppVideoCardView microAppVideoCardView2 = microAppVideoCardView;
            PatchProxy.accessDispatch(new Object[]{aweme2, str3}, microAppVideoCardView2, MicroAppVideoCardView.f55626a, false, 59186, new Class[]{Aweme.class, String.class}, Void.TYPE);
        } else {
            microAppVideoCardView.f55627b = false;
            microAppVideoCardView.j = aweme2;
            microAppVideoCardView.k = str3;
            if (!TextUtils.isEmpty(c.b(aweme))) {
                com.ss.android.ugc.aweme.base.c.a((RemoteImageView) microAppVideoCardView.f55630e, c.b(aweme));
            }
            DmtTextView dmtTextView = microAppVideoCardView.f55631f;
            if (PatchProxy.isSupport(new Object[]{aweme2}, null, c.f55818a, true, 59538, new Class[]{Aweme.class}, String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[]{aweme2}, null, c.f55818a, true, 59538, new Class[]{Aweme.class}, String.class);
            } else if (aweme2 == null) {
                str = "";
            } else if (aweme.getMicroAppInfo() == null) {
                str = "";
            } else {
                str = aweme.getMicroAppInfo().getTitle();
            }
            dmtTextView.setText(str);
            DmtTextView dmtTextView2 = microAppVideoCardView.h;
            if (PatchProxy.isSupport(new Object[]{aweme2}, null, c.f55818a, true, 59537, new Class[]{Aweme.class}, String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[]{aweme2}, null, c.f55818a, true, 59537, new Class[]{Aweme.class}, String.class);
            } else if (c.a(aweme)) {
                str2 = aweme.getMicroAppInfo().getMiniAppCard().getText();
            } else {
                str2 = "";
            }
            dmtTextView2.setText(str2);
            microAppVideoCardView.g.setOnClickListener(new c(microAppVideoCardView, aweme2));
            microAppVideoCardView.f55629d.setOnClickListener(new d(microAppVideoCardView, aweme2));
            microAppVideoCardView.i.setOnClickListener(new e(microAppVideoCardView));
        }
        this.f55654d = false;
        this.f55652b.setOnClickCloseListener(new k(this));
    }

    public j(View view, String str) {
        this.f55656f = view.getContext();
        this.f55653c = view.findViewById(C0906R.id.im);
        this.f55652b = (MicroAppVideoCardView) view.findViewById(C0906R.id.bn0);
        this.g = str;
    }
}
