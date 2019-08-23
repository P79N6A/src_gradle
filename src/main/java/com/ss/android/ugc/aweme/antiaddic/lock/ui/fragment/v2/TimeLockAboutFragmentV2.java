package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItem;
import com.bytedance.ies.dmt.ui.widget.setting.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.BaseLockActivity;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.widget.TimeLockDesc;
import com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.ArrayList;
import java.util.Map;

public class TimeLockAboutFragmentV2 extends AbsAboutFragmentV2 {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f33578f;
    public SettingItem g;
    private TimeLockDesc h;
    private TimeLockDesc i;
    private TimeLockDesc j;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ArrayList<a> f33583a;

        /* renamed from: b  reason: collision with root package name */
        public int f33584b;

        static {
            ArrayList<a> arrayList = new ArrayList<>();
            f33583a = arrayList;
            arrayList.add(new a(40));
            f33583a.add(new a(60));
            f33583a.add(new a(90));
            f33583a.add(new a(120));
        }

        public a(int i) {
            this.f33584b = i;
        }
    }

    @LayoutRes
    public final int a() {
        return C0906R.layout.qv;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f33578f, false, 22056, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33578f, false, 22056, new Class[0], Void.TYPE);
            return;
        }
        r.a("open_time_lock", (Map) d.a().f34114b);
        super.c();
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f33578f, false, 22054, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f33578f, false, 22054, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.h = (TimeLockDesc) view.findViewById(C0906R.id.d2v);
        this.i = (TimeLockDesc) view.findViewById(C0906R.id.d2w);
        this.j = (TimeLockDesc) view.findViewById(C0906R.id.d2x);
        this.g = (SettingItem) view.findViewById(C0906R.id.axz);
        this.g.setOnSettingItemClickListener(new b.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33579a;

            public final void OnSettingItemClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f33579a, false, 22057, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f33579a, false, 22057, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ((BaseLockActivity) TimeLockAboutFragmentV2.this.getActivity()).a(com.ss.android.ugc.aweme.mobile.a.a.a(TimeLockSelectTimeFragmentV2.class).a());
            }
        });
        TimeLockOptionViewModel timeLockOptionViewModel = (TimeLockOptionViewModel) ViewModelProviders.of(getActivity()).get(TimeLockOptionViewModel.class);
        timeLockOptionViewModel.f33618a.observe(this, new Observer<a>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33581a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                a aVar = (a) obj;
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f33581a, false, 22058, new Class[]{a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f33581a, false, 22058, new Class[]{a.class}, Void.TYPE);
                    return;
                }
                SettingItem settingItem = TimeLockAboutFragmentV2.this.g;
                settingItem.setRightTxt(aVar.f33584b + TimeLockAboutFragmentV2.this.getString(C0906R.string.bbt));
            }
        });
        if (timeLockOptionViewModel.f33618a.getValue() == null) {
            timeLockOptionViewModel.f33618a.setValue(new a(60));
        }
        if (com.ss.android.g.a.a()) {
            this.j.setText(getString(C0906R.string.ble));
        }
        if (f()) {
            if (PatchProxy.isSupport(new Object[0], this, f33578f, false, 22055, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f33578f, false, 22055, new Class[0], Void.TYPE);
                return;
            }
            this.f33536b.setText(getString(C0906R.string.bl_));
            this.h.setText(getString(C0906R.string.bla));
            this.i.setText(getString(C0906R.string.blb));
            this.j.setText(getString(C0906R.string.bl7));
        }
    }
}
