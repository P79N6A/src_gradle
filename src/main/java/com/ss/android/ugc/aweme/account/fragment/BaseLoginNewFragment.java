package com.ss.android.ugc.aweme.account.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.mobilelib.b.a;
import com.ss.android.ugc.aweme.account.login.ui.BaseFragment;

public class BaseLoginNewFragment extends BaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31895a;

    /* renamed from: c  reason: collision with root package name */
    public static int f31896c;

    /* renamed from: d  reason: collision with root package name */
    protected static int f31897d;

    /* renamed from: b  reason: collision with root package name */
    Handler f31898b;

    /* renamed from: e  reason: collision with root package name */
    protected int f31899e = 1;

    public final a c() {
        return null;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f31895a, false, 19900, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f31895a, false, 19900, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f31898b = new Handler();
        f31896c = (int) UIUtils.dip2Px(getContext(), 150.0f);
        f31897d = (int) UIUtils.dip2Px(getContext(), 20.0f);
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f31895a, false, 19901, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f31895a, false, 19901, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        view2.setOnClickListener(new b(view2));
        view.getViewTreeObserver().addOnGlobalLayoutListener(new c(this, view2));
    }
}
