package com.ss.android.ugc.aweme.commercialize.views;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.activity.IESBrowserFragment;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commercialize.c.d;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction;
import com.ss.android.ugc.aweme.commercialize.views.cards.j;
import com.ss.android.ugc.aweme.commercialize.views.cards.k;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.c;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import org.jetbrains.annotations.NotNull;

public class AdHalfWebPageFragment extends IESBrowserFragment implements View.OnClickListener, j {
    private static final String ah = "AdHalfWebPageFragment";
    public static ChangeQuickRedirect ai;
    protected ImageView aj;
    public d ak;
    public boolean al;
    private CornersWebView am;
    private k an;
    @IdRes
    private int ao = 2130839475;

    public final int a() {
        return C0906R.layout.mt;
    }

    @NotNull
    public final Fragment f() {
        return this;
    }

    @NotNull
    public final WebView b() {
        return this.am;
    }

    public final boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 32777, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, ai, false, 32777, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.an instanceof AbsAdCardAction) {
            return ((AbsAdCardAction) this.an).c();
        } else {
            return g();
        }
    }

    public final boolean g() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, ai, false, 32776, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, ai, false, 32776, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.ak != null) {
            d dVar = this.ak;
            if (!dVar.f38532b || dVar.f38533c) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void a(@NotNull k kVar) {
        this.an = kVar;
    }

    public final void b(@IdRes int i) {
        if (i != 0) {
            this.ao = i;
        }
    }

    public final void a(@NotNull f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, ai, false, 32775, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, ai, false, 32775, new Class[]{f.class}, Void.TYPE);
            return;
        }
        this.ak = new d(fVar2, true);
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, ai, false, 32773, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, ai, false, 32773, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.am.setBackgroundColor(0);
        a(false);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, ai, false, 32774, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, ai, false, 32774, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f2548b = this.ak;
    }

    public static AdHalfWebPageFragment b(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, null, ai, true, 32770, new Class[]{Bundle.class}, AdHalfWebPageFragment.class)) {
            return (AdHalfWebPageFragment) PatchProxy.accessDispatch(new Object[]{bundle2}, null, ai, true, 32770, new Class[]{Bundle.class}, AdHalfWebPageFragment.class);
        }
        AdHalfWebPageFragment adHalfWebPageFragment = new AdHalfWebPageFragment();
        adHalfWebPageFragment.setArguments(bundle2);
        adHalfWebPageFragment.al = bundle2.getBoolean("need_use_software_layer_type", false);
        return adHalfWebPageFragment;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, ai, false, 32780, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, ai, false, 32780, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.am.loadUrl(str2);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 32769, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 32769, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.ts) {
            this.an.b();
            return;
        }
        if (id == C0906R.id.c1) {
            this.an.a();
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, ai, false, 32778, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, ai, false, 32778, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.am.setCanTouch(z);
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, ai, false, 32779, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, ai, false, 32779, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.am.setCanScrollVertically(z);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, ai, false, 32771, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, ai, false, 32771, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.am = (CornersWebView) view.findViewById(C0906R.id.cu3);
        if (this.al) {
            this.am.setLayerType(1, null);
        }
        view.setOnClickListener(this);
        if (PatchProxy.isSupport(new Object[]{view}, this, ai, false, 32772, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, ai, false, 32772, new Class[]{View.class}, Void.TYPE);
        } else {
            this.aj = (ImageView) view.findViewById(C0906R.id.ts);
            this.aj.setOnClickListener(this);
            this.aj.setImageResource(this.ao);
            if (this.ao == 2130839477) {
                this.aj.setPadding(u.a(12.0d), u.a(4.0d), u.a(4.0d), u.a(7.0d));
            }
        }
        c.a(this.aj);
        DmtStatusView dmtStatusView = (DmtStatusView) view.findViewById(C0906R.id.cvd);
        dmtStatusView.setBuilder(dmtStatusView.a().a((int) C0906R.string.dmm, (View.OnClickListener) new j(this)));
        if (AbTestManager.a().bg() != 0) {
            RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) view.findViewById(C0906R.id.dx7);
            if (roundedFrameLayout != null) {
                roundedFrameLayout.setRadius(0);
            }
        }
        this.am.getSettings().setTextZoom(100);
    }
}
