package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.BaseLockActivity;

public class TimeLockSetFragment extends AbsTimeLockSettingFragment {
    public static ChangeQuickRedirect i;
    ViewGroup j;
    ViewGroup k;

    public final void b(String str) {
        TimeLockConfirmFragment timeLockConfirmFragment;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 21988, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 21988, new Class[]{String.class}, Void.TYPE);
            return;
        }
        boolean z = this.f33490f;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, TimeLockConfirmFragment.i, true, 21973, new Class[]{String.class, Boolean.TYPE}, TimeLockConfirmFragment.class)) {
            timeLockConfirmFragment = (TimeLockConfirmFragment) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, null, TimeLockConfirmFragment.i, true, 21973, new Class[]{String.class, Boolean.TYPE}, TimeLockConfirmFragment.class);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("password", str2);
            bundle.putBoolean("from_change_pwd", z);
            timeLockConfirmFragment = new TimeLockConfirmFragment();
            timeLockConfirmFragment.setArguments(bundle);
        }
        ((BaseLockActivity) getActivity()).a(timeLockConfirmFragment);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, i, false, 21987, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, i, false, 21987, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.j = (ViewGroup) view.findViewById(C0906R.id.chu);
        this.k = (ViewGroup) view.findViewById(C0906R.id.d3v);
        if (a.b()) {
            this.j.setBackgroundColor(getResources().getColor(C0906R.color.a25));
            this.k.setBackgroundColor(getResources().getColor(C0906R.color.a17));
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, i, false, 21986, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.q6, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, i, false, 21986, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
