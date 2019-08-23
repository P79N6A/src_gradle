package com.ss.android.ugc.aweme.account.login.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.telephony.PhoneNumberUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.mobilelib.b.a;
import com.ss.android.ugc.aweme.account.login.e.a;
import com.ss.android.ugc.aweme.main.h.s;
import com.ss.android.ugc.aweme.w;
import java.util.Locale;

public abstract class BasePhoneNumberFragment<T extends a> extends BaseFragment<T> {
    public static ChangeQuickRedirect p;
    public a.C0407a q = new a.C0407a();

    private a.C0407a d() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 20467, new Class[0], a.C0407a.class)) {
            return (a.C0407a) PatchProxy.accessDispatch(new Object[0], this, p, false, 20467, new Class[0], a.C0407a.class);
        } else if (getActivity() == null || !(getActivity() instanceof LoginOrRegisterActivity)) {
            return null;
        } else {
            return ((LoginOrRegisterActivity) getActivity()).x;
        }
    }

    public final String o() {
        if (!PatchProxy.isSupport(new Object[0], this, p, false, 20472, new Class[0], String.class)) {
            return this.q.getRawInput();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, p, false, 20472, new Class[0], String.class);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 20465, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 20465, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        e();
    }

    public final String p() {
        if (!PatchProxy.isSupport(new Object[0], this, p, false, 20474, new Class[0], String.class)) {
            return this.q.getCountryIso();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, p, false, 20474, new Class[0], String.class);
    }

    public final int q() {
        if (!PatchProxy.isSupport(new Object[0], this, p, false, 20476, new Class[0], Integer.TYPE)) {
            return this.q.getCountryCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, p, false, 20476, new Class[0], Integer.TYPE)).intValue();
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 20468, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 20468, new Class[0], Void.TYPE);
            return;
        }
        if (d() != null) {
            this.q.setCountryCode(d().getCountryCode());
            this.q.setNationalNumber(d().getNationalNumber());
            this.q.setRawInput(d().getRawInput());
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 20469, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 20469, new Class[0], Void.TYPE);
            return;
        }
        a.C0407a aVar = this.q;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, p, false, 20470, new Class[]{a.C0407a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, p, false, 20470, new Class[]{a.C0407a.class}, Void.TYPE);
        } else if (aVar != null && d() != null) {
            d().setCountryCode(aVar.getCountryCode());
            d().setNationalNumber(aVar.getNationalNumber());
            d().setRawInput(aVar.getRawInput());
        }
    }

    public boolean m() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, p, false, 20466, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, p, false, 20466, new Class[0], Boolean.TYPE)).booleanValue();
        }
        a.C0407a aVar = this.q;
        if (PatchProxy.isSupport(new Object[]{aVar}, null, com.ss.android.ugc.aweme.account.login.e.a.f32216a, true, 20811, new Class[]{a.C0407a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, null, com.ss.android.ugc.aweme.account.login.e.a.f32216a, true, 20811, new Class[]{a.C0407a.class}, Boolean.TYPE)).booleanValue();
        }
        if (aVar.getCountryCode() == 86) {
            if (String.valueOf(aVar.getNationalNumber()).length() != 11) {
                return false;
            }
            z = true;
        } else if (aVar.getCountryCode() == 0 || aVar.getNationalNumber() < 10) {
            return z;
        } else {
            return true;
        }
        return z;
    }

    public String r() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 20478, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, p, false, 20478, new Class[0], String.class);
        }
        a.C0407a aVar = this.q;
        if (PatchProxy.isSupport(new Object[]{aVar}, null, com.ss.android.ugc.aweme.account.login.e.a.f32216a, true, 20810, new Class[]{a.C0407a.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aVar}, null, com.ss.android.ugc.aweme.account.login.e.a.f32216a, true, 20810, new Class[]{a.C0407a.class}, String.class);
        } else if (Build.VERSION.SDK_INT >= 21) {
            return PhoneNumberUtils.formatNumber("+" + aVar.getCountryCode() + ' ' + aVar.getNationalNumber(), aVar.getCountryIso());
        } else {
            return "+" + aVar.getCountryCode() + ' ' + aVar.getNationalNumber();
        }
    }

    public final String s() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 20479, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, p, false, 20479, new Class[0], String.class);
        } else if (Build.VERSION.SDK_INT >= 21) {
            return PhoneNumberUtils.formatNumber("+" + this.q.getCountryCode() + ' ' + com.ss.android.ugc.aweme.account.login.e.a.a(this.q.getNationalNumber()), this.q.getCountryIso());
        } else {
            return "+" + this.q.getCountryCode() + ' ' + com.ss.android.ugc.aweme.account.login.e.a.a(this.q.getNationalNumber());
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, p, false, 20475, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, p, false, 20475, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.q.setCountryCode(i);
    }

    public void onAttach(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, p, false, 20464, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, p, false, 20464, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        super.onAttach(activity);
        e();
        if (q() == 0) {
            a(com.ss.android.ugc.aweme.account.login.e.a.a((Context) activity).a(((s) w.a(s.class)).a(), Locale.getDefault().getCountry()));
        }
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, p, false, 20477, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, p, false, 20477, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.q.setNationalNumber(j2);
    }
}
