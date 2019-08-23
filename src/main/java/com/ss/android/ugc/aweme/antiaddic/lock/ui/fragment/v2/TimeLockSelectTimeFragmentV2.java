package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockAboutFragmentV2;
import com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.setting.ui.o;
import java.util.Iterator;

public class TimeLockSelectTimeFragmentV2 extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33589a;
    @BindView(2131493733)
    ViewGroup mContainerLayout;
    @BindView(2131497590)
    TextView mTitle;

    @OnClick({2131493213})
    public void back() {
        if (PatchProxy.isSupport(new Object[0], this, f33589a, false, 22083, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33589a, false, 22083, new Class[0], Void.TYPE);
            return;
        }
        getActivity().onBackPressed();
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f33589a, false, 22081, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f33589a, false, 22081, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f33589a, false, 22082, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33589a, false, 22082, new Class[0], Void.TYPE);
            return;
        }
        final MutableLiveData<TimeLockAboutFragmentV2.a> mutableLiveData = ((TimeLockOptionViewModel) ViewModelProviders.of(getActivity()).get(TimeLockOptionViewModel.class)).f33618a;
        this.mTitle.setText(getString(C0906R.string.cjx));
        Iterator<TimeLockAboutFragmentV2.a> it2 = TimeLockAboutFragmentV2.a.f33583a.iterator();
        while (it2.hasNext()) {
            final TimeLockAboutFragmentV2.a next = it2.next();
            o oVar = new o(getContext());
            oVar.setStartText(next.f33584b + getString(C0906R.string.bbt));
            oVar.setOnSettingItemClickListener(new o.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33590a;

                public final boolean a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f33590a, false, 22084, new Class[]{View.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f33590a, false, 22084, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                    }
                    mutableLiveData.setValue(next);
                    return false;
                }
            });
            if (((TimeLockAboutFragmentV2.a) mutableLiveData.getValue()).f33584b == next.f33584b) {
                z = true;
            } else {
                z = false;
            }
            oVar.setChecked(z);
            oVar.setRippleColor(getResources().getColor(C0906R.color.ut));
            oVar.setRippleDelayClick(true);
            oVar.setRippleOverlay(true);
            oVar.setRippleHover(true);
            this.mContainerLayout.addView(oVar, this.mContainerLayout.getChildCount());
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f33589a, false, 22080, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.qy, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f33589a, false, 22080, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
