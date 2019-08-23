package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.b.a;
import com.ss.android.ugc.aweme.antiaddic.lock.c;
import com.ss.android.ugc.aweme.antiaddic.lock.d;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.AbsTimeLockSettingFragment;
import com.ss.android.ugc.aweme.base.ui.session.b;
import com.ss.android.ugc.aweme.base.utils.v;
import kotlin.jvm.internal.Intrinsics;

public class TimeLockEnterFragmentV2 extends AbsTimeLockSettingFragment implements a {
    public static ChangeQuickRedirect i;
    private com.ss.android.ugc.aweme.antiaddic.lock.a.a j;
    private int k;

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 22069, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 22069, new Class[0], Void.TYPE);
            return;
        }
        super.d();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 22070, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 22070, new Class[0], Void.TYPE);
            return;
        }
        super.e();
        f();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 22071, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 22071, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.j != null) {
            this.j.b();
        }
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 22073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 22073, new Class[0], Void.TYPE);
            return;
        }
        a((View) this.f2607b);
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
        com.ss.android.ugc.aweme.base.ui.session.a<Boolean> b2 = b.a().b("TimeLockEnterFragmentV2", Boolean.class);
        if (b2 != null) {
            b2.a(Boolean.TRUE);
        }
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 22068, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 22068, new Class[]{String.class}, Void.TYPE);
        } else if (c.f33443d.e()) {
            c cVar = c.f33443d;
            if (PatchProxy.isSupport(new Object[]{str2}, cVar, c.f33440a, false, 21763, new Class[]{String.class}, Void.TYPE)) {
                c cVar2 = cVar;
                PatchProxy.accessDispatch(new Object[]{str2}, cVar2, c.f33440a, false, 21763, new Class[]{String.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
                c.f33442c = str2;
            }
            if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 22072, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 22072, new Class[]{String.class}, Void.TYPE);
            } else if (!TextUtils.isEmpty(str) && this.j != null && getActivity() != null && this.h != null) {
                c();
                if (this.k == 2) {
                    this.j.a(str2);
                } else if (this.k == 1) {
                    this.j.b(c.f33443d.a(b(), false, str, false, getActivity()));
                } else {
                    if (this.k == 0) {
                        this.j.b(c.f33443d.a(b(), true, str, false, getActivity()));
                    }
                }
            }
        } else {
            TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
            if (str2 == null || userSetting == null || !str2.equals(userSetting.getPassword())) {
                com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.cla).a();
            } else {
                f();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, i, false, 22066, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, i, false, 22066, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(C0906R.id.d1_);
        TextView textView2 = (TextView) view.findViewById(C0906R.id.d19);
        this.h = (DmtStatusView) view.findViewById(C0906R.id.cvd);
        this.h.setBuilder(DmtStatusView.a.a((Context) getActivity()));
        if (b() == 0) {
            str = "time_lock";
        } else {
            str = "teen_mode";
        }
        d.a(view, str, false);
        this.k = getArguments().getInt("type_close", 0);
        if (this.k == 1) {
            if (com.ss.android.g.a.a()) {
                v.a(false, textView2);
                if (b() == 0) {
                    i3 = C0906R.string.a5u;
                } else {
                    i3 = C0906R.string.a5t;
                }
                textView.setText(getString(i3));
            } else {
                if (b() == 0) {
                    i2 = C0906R.string.ck7;
                } else {
                    i2 = C0906R.string.ci8;
                }
                textView.setText(getString(i2));
                textView2.setText(getString(C0906R.string.ck6));
            }
        } else if (this.k == 2) {
            textView.setText(getString(C0906R.string.ckg));
            textView2.setText(getString(C0906R.string.ckd));
        } else if (this.k == 0 && com.ss.android.g.a.a()) {
            textView.setText(getString(C0906R.string.b1p));
            textView2.setText(getString(C0906R.string.b1o));
        }
        if (PatchProxy.isSupport(new Object[0], this, i, false, 22067, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 22067, new Class[0], Void.TYPE);
            return;
        }
        this.j = new com.ss.android.ugc.aweme.antiaddic.lock.a.a();
        this.j.a((a) this);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, i, false, 22065, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.q5, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, i, false, 22065, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
