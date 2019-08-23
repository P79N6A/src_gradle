package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public class TimeLockOptionsFragment extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33500a;

    /* renamed from: b  reason: collision with root package name */
    SettingItemSwitch f33501b;

    /* renamed from: c  reason: collision with root package name */
    SettingItemSwitch f33502c;

    /* renamed from: d  reason: collision with root package name */
    TimeLockUserSetting f33503d;

    /* renamed from: e  reason: collision with root package name */
    private Button f33504e;

    /* renamed from: f  reason: collision with root package name */
    private Button f33505f;
    private View g;
    private TextView h;
    private TextView i;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f33500a, false, 21978, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33500a, false, 21978, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.f33501b.setChecked(this.f33503d.isTimeLockOn());
        this.f33502c.setChecked(this.f33503d.isContentFilterOn());
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f33500a, false, 21979, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f33500a, false, 21979, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f33504e = (Button) view.findViewById(C0906R.id.oe);
        this.f33501b = (SettingItemSwitch) view.findViewById(C0906R.id.ay0);
        this.f33502c = (SettingItemSwitch) view.findViewById(C0906R.id.aw2);
        this.i = (TextView) view.findViewById(C0906R.id.aik);
        TextView textView = this.i;
        if (AbTestManager.a().aI() == 0 || a.c() || a.b()) {
            i2 = C0906R.string.a1o;
        } else {
            i2 = C0906R.string.a1r;
        }
        textView.setText(i2);
        this.g = view.findViewById(C0906R.id.ix);
        this.g.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33506a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f33506a, false, 21985, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f33506a, false, 21985, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                TimeLockOptionsFragment.this.getActivity().onBackPressed();
            }
        });
        this.h = (TextView) view.findViewById(C0906R.id.title);
        this.h.setText(getResources().getText(C0906R.string.cl2));
        this.f33503d = TimeLockRuler.getUserSetting();
        this.f33505f = (Button) view.findViewById(C0906R.id.od);
        if (this.f33503d != null) {
            this.f33505f.setOnClickListener(new c(this));
            this.f33501b.setOnSettingItemClickListener(new d(this));
            this.f33502c.setOnSettingItemClickListener(new e(this));
            this.f33504e.setOnClickListener(new f(this));
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f33500a, false, 21977, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.qw, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f33500a, false, 21977, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
