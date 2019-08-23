package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.BaseLockActivity;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.AbsTimeLockSettingFragment;

public class TimeLockSetFragmentV2 extends AbsTimeLockSettingFragment {
    public static ChangeQuickRedirect i;

    public final void b(String str) {
        TimeLockConfirmFragmentV2 timeLockConfirmFragmentV2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 22089, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 22089, new Class[]{String.class}, Void.TYPE);
            return;
        }
        boolean z = this.f33490f;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, TimeLockConfirmFragmentV2.i, true, 22061, new Class[]{String.class, Boolean.TYPE}, TimeLockConfirmFragmentV2.class)) {
            timeLockConfirmFragmentV2 = (TimeLockConfirmFragmentV2) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, null, TimeLockConfirmFragmentV2.i, true, 22061, new Class[]{String.class, Boolean.TYPE}, TimeLockConfirmFragmentV2.class);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("password", str2);
            bundle.putBoolean("from_change_pwd", z);
            timeLockConfirmFragmentV2 = new TimeLockConfirmFragmentV2();
            timeLockConfirmFragmentV2.setArguments(bundle);
        }
        ((BaseLockActivity) getActivity()).a(timeLockConfirmFragmentV2);
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, i, false, 22088, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, i, false, 22088, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(C0906R.id.d1_);
        TextView textView2 = (TextView) view.findViewById(C0906R.id.d19);
        if (this.f33490f) {
            textView.setText(getString(C0906R.string.ckw));
            textView2.setVisibility(4);
            return;
        }
        if (b() == 0) {
            i2 = C0906R.string.ckx;
        } else {
            i2 = C0906R.string.cky;
        }
        textView2.setText(getString(i2));
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, i, false, 22087, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.q7, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, i, false, 22087, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
