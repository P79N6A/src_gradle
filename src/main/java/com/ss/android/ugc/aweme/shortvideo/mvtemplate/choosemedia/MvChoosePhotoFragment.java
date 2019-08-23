package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;

public class MvChoosePhotoFragment extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68541a;

    /* renamed from: b  reason: collision with root package name */
    MvImageChooseAdapter f68542b;

    /* renamed from: c  reason: collision with root package name */
    public MvImageChooseAdapter.c f68543c;

    /* renamed from: d  reason: collision with root package name */
    DmtTextView f68544d;

    /* renamed from: e  reason: collision with root package name */
    DmtLoadingLayout f68545e;

    /* renamed from: f  reason: collision with root package name */
    public String f68546f;
    public int g;
    public boolean h;
    private RecyclerView i;
    private View j;
    private DmtTextView k;

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f68541a, false, 77983, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68541a, false, 77983, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f68541a, false, 77984, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68541a, false, 77984, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f68541a, false, 77977, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f68541a, false, 77977, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f68541a, false, 77979, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f68541a, false, 77979, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f68541a, false, 77981, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68541a, false, 77981, new Class[0], Void.TYPE);
            return;
        }
        String string = getString(C0906R.string.bxa);
        this.i.setLayoutManager(new WrapGridLayoutManager(null, 4));
        this.i.addItemDecoration(new GridSpacingItemDecoration(4, (int) UIUtils.dip2Px(getContext(), 1.0f), false));
        MvImageChooseAdapter mvImageChooseAdapter = new MvImageChooseAdapter(getContext(), 4, 1.0d, 1.5f, 0, 2);
        this.f68542b = mvImageChooseAdapter;
        this.f68542b.g = this.f68543c;
        this.f68542b.a(this.h);
        this.f68542b.f68570f = new o(this);
        this.i.setAdapter(this.f68542b);
        if (this.f68542b != null) {
            this.f68542b.f68566b = this.g;
            this.f68542b.f68567c = String.format(string, new Object[]{Integer.valueOf(this.g)});
        }
        if (!TextUtils.isEmpty(this.f68546f)) {
            this.k.setVisibility(0);
            this.k.setText(this.f68546f);
        } else {
            this.k.setVisibility(8);
        }
        this.f68545e.setVisibility(0);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f68541a, false, 77978, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f68541a, false, 77978, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.j = layoutInflater.inflate(C0906R.layout.s0, viewGroup2, false);
        if (PatchProxy.isSupport(new Object[0], this, f68541a, false, 77980, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68541a, false, 77980, new Class[0], Void.TYPE);
        } else {
            this.i = (RecyclerView) this.j.findViewById(C0906R.id.arc);
            this.k = (DmtTextView) this.j.findViewById(C0906R.id.ao6);
            this.f68544d = (DmtTextView) this.j.findViewById(C0906R.id.bqx);
            this.f68545e = (DmtLoadingLayout) this.j.findViewById(C0906R.id.arf);
        }
        return this.j;
    }
}
