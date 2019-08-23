package com.ss.android.ugc.aweme.crossplatform.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.crossplatform.params.base.a;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.c;

public class CrossPlatformFragment extends AbsFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40672a;

    /* renamed from: b  reason: collision with root package name */
    public MixActivityContainer f40673b;

    /* renamed from: c  reason: collision with root package name */
    private a f40674c;

    /* renamed from: d  reason: collision with root package name */
    private c f40675d;

    /* renamed from: e  reason: collision with root package name */
    private e f40676e;

    public final void a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f40672a, false, 34116, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f40672a, false, 34116, new Class[]{e.class}, Void.TYPE);
            return;
        }
        this.f40676e = eVar;
        if (this.f40673b != null) {
            this.f40673b.a(eVar);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f40672a, false, 34117, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f40672a, false, 34117, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f40674c = a.C0525a.a(getArguments());
        a aVar = this.f40674c;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f40672a, false, 34120, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f40672a, false, 34120, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f40673b = new MixActivityContainer(getActivity(), aVar);
        this.f40673b.a(this.f40676e);
        this.f40673b.f2986f = this.f40675d;
        getLifecycle().addObserver(this.f40673b);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f40672a, false, 34119, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f40672a, false, 34119, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        this.f40673b.k();
        super.onViewCreated(view, bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f40672a, false, 34118, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f40672a, false, 34118, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        if (PatchProxy.isSupport(new Object[0], this, f40672a, false, 34121, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40672a, false, 34121, new Class[0], Integer.TYPE)).intValue();
        } else {
            i = C0906R.layout.aw;
        }
        return layoutInflater2.inflate(i, viewGroup2, false);
    }
}
