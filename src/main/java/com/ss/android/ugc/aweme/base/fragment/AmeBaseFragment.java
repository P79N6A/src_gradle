package com.ss.android.ugc.aweme.base.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.analysis.c;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.common.component.fragment.ComponentFragment;
import com.ss.android.ugc.common.component.fragment.b;

public abstract class AmeBaseFragment extends ComponentFragment implements c {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isCommerce;
    private Unbinder mUnBinder;

    public Analysis getAnalysis() {
        return null;
    }

    public boolean isRegisterEventBus() {
        return false;
    }

    public int subscriberPriority() {
        return 0;
    }

    @NonNull
    public SparseArray<b> registerComponents() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24608, new Class[0], SparseArray.class)) {
            return new SparseArray<>();
        }
        return (SparseArray) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24608, new Class[0], SparseArray.class);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24611, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24611, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.mUnBinder != null) {
            this.mUnBinder.unbind();
        }
        org.greenrobot.eventbus.c a2 = org.greenrobot.eventbus.c.a();
        if (isRegisterEventBus() && a2.b((Object) this)) {
            a2.c(this);
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 24610, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 24610, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 24612, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 24612, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        a.a("当前页面：" + getClass().getSimpleName());
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, changeQuickRedirect, false, 24609, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, changeQuickRedirect, false, 24609, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        this.mUnBinder = ButterKnife.bind((Object) this, view);
        super.onViewCreated(view, bundle);
        org.greenrobot.eventbus.c a2 = org.greenrobot.eventbus.c.a();
        if (!a2.b((Object) this) && isRegisterEventBus()) {
            a2.a((Object) this);
        }
    }
}
