package com.ss.android.ugc.aweme.poi.ui;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.OnClick;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.poi.e.e;
import com.ss.android.ugc.aweme.poi.map.MapLayout;
import com.ss.android.ugc.aweme.poi.map.h;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.ag;
import com.ss.android.ugc.aweme.utils.cf;
import com.ss.android.ugc.aweme.utils.q;

public class PoiRouteFragment extends AmeBaseFragment implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60479a;

    /* renamed from: b  reason: collision with root package name */
    PoiStruct f60480b;

    /* renamed from: c  reason: collision with root package name */
    String f60481c;

    /* renamed from: d  reason: collision with root package name */
    String f60482d;

    /* renamed from: e  reason: collision with root package name */
    String f60483e;

    /* renamed from: f  reason: collision with root package name */
    String f60484f;
    private MapLayout g;
    private ag h;
    private View i;
    private boolean j;
    private long k = -1;
    private PoiRoutePresenter l;

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f60479a, false, 66145, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60479a, false, 66145, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.g.e();
    }

    public void onLowMemory() {
        if (PatchProxy.isSupport(new Object[0], this, f60479a, false, 66146, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60479a, false, 66146, new Class[0], Void.TYPE);
            return;
        }
        super.onLowMemory();
        this.g.f();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f60479a, false, 66140, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60479a, false, 66140, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.g.b();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f60479a, false, 66143, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60479a, false, 66143, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        this.g.d();
    }

    public final void V_() {
        if (PatchProxy.isSupport(new Object[0], this, f60479a, false, 66152, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60479a, false, 66152, new Class[0], Void.TYPE);
        } else if (this.f60480b != null) {
            this.l.a(this.f60480b);
            if (this.l instanceof PoiOptimizedRoutePresenter) {
                ((PoiOptimizedRoutePresenter) this.l).e();
            }
            this.f60483e = this.f60480b.poiId;
            this.f60484f = this.f60480b.typeCode;
        } else {
            if (this.h != null) {
                this.l.a(this.h);
            }
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f60479a, false, 66144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60479a, false, 66144, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        PoiRoutePresenter poiRoutePresenter = this.l;
        if (PatchProxy.isSupport(new Object[0], poiRoutePresenter, PoiRoutePresenter.f60491b, false, 66157, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], poiRoutePresenter, PoiRoutePresenter.f60491b, false, 66157, new Class[0], Void.TYPE);
            return;
        }
        if (poiRoutePresenter.k != null) {
            poiRoutePresenter.k.unbind();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f60479a, false, 66142, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60479a, false, 66142, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.g.c();
        if (PatchProxy.isSupport(new Object[0], this, f60479a, false, 66150, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60479a, false, 66150, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && this.k != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.k;
            if (currentTimeMillis > 0 && !TextUtils.isEmpty(this.f60482d)) {
                a.a(new x(this, currentTimeMillis));
            }
            this.k = -1;
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f60479a, false, 66141, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60479a, false, 66141, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        this.g.a();
        if (PatchProxy.isSupport(new Object[0], this, f60479a, false, 66149, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60479a, false, 66149, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && this.k == -1) {
            this.k = System.currentTimeMillis();
        }
    }

    @OnClick({2131496325})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60479a, false, 66148, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60479a, false, 66148, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.c2u) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f60479a, false, 66147, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f60479a, false, 66147, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        this.g.a(bundle2);
    }

    public void onViewCreated(View view, Bundle bundle) {
        PoiRoutePresenter poiRoutePresenter;
        boolean z;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f60479a, false, 66139, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f60479a, false, 66139, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 19) {
            this.i.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(getActivity());
        }
        if (this.j) {
            poiRoutePresenter = new PoiOptimizedRoutePresenter();
        } else {
            poiRoutePresenter = new PoiRoutePresenter();
        }
        this.l = poiRoutePresenter;
        this.l.a(this, view, this.g, true);
        if (com.ss.android.g.a.c() || e.j()) {
            z = true;
        } else {
            z = false;
        }
        this.g.a(bundle, z, q.b(), cf.b(), (h) this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f60479a, false, 66138, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f60479a, false, 66138, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Bundle arguments = getArguments();
        if (PatchProxy.isSupport(new Object[]{arguments}, this, f60479a, false, 66137, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arguments}, this, f60479a, false, 66137, new Class[]{Bundle.class}, Void.TYPE);
        } else if (arguments != null) {
            this.f60480b = (PoiStruct) arguments.getSerializable("poi_detail");
            this.h = (ag) arguments.getSerializable("poi_latlng");
            this.j = arguments.getBoolean("poi_route_from_poi");
            this.f60482d = arguments.getString("enter_from");
            this.f60481c = arguments.getString("aweme_id");
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.pk, viewGroup2, false);
        this.i = inflate.findViewById(C0906R.id.c33);
        this.g = (MapLayout) inflate.findViewById(C0906R.id.c31);
        ImageView imageView = (ImageView) inflate.findViewById(C0906R.id.c2u);
        int dip2Px = (int) UIUtils.dip2Px(getContext(), 32.0f);
        imageView.setBackgroundResource(2130838253);
        imageView.setImageResource(2130839863);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = dip2Px;
        layoutParams.height = dip2Px;
        layoutParams.leftMargin = (int) UIUtils.dip2Px(getContext(), 12.0f);
        int dip2Px2 = (int) UIUtils.dip2Px(getContext(), 6.0f);
        imageView.setPadding(dip2Px2, dip2Px2, dip2Px2, dip2Px2);
        return inflate;
    }
}
