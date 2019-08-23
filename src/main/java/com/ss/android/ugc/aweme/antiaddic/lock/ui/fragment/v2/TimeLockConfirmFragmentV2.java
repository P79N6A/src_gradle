package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.c;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.AbsTimeLockSettingFragment;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class TimeLockConfirmFragmentV2 extends AbsTimeLockSettingFragment {
    public static ChangeQuickRedirect i;
    ViewGroup j;
    ViewGroup k;
    DmtTextView l;
    private String m;

    public final int a() {
        return C0906R.string.ckc;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 22064, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 22064, new Class[0], Void.TYPE);
            return;
        }
        super.e();
        c.f33443d.a(getActivity(), b(), this.f33490f);
    }

    public final void b(String str) {
        boolean z;
        q qVar;
        TimeLockUserSetting timeLockUserSetting;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 22062, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 22062, new Class[]{String.class}, Void.TYPE);
        } else if (!this.m.equals(str2)) {
            a.b(getContext(), (int) C0906R.string.ckb).a();
        } else {
            a((View) this.f2607b);
            boolean z2 = this.f33490f;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), str2}, this, i, false, 22063, new Class[]{Boolean.TYPE, String.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), str2}, this, i, false, 22063, new Class[]{Boolean.TYPE, String.class}, Boolean.TYPE)).booleanValue();
            } else if (!c.f33443d.e() || this.g == null || getActivity() == null) {
                z = false;
            } else {
                c();
                this.g.b(c.f33443d.a(b(), true, str, z2, getActivity()));
                z = true;
            }
            if (!z) {
                String curUserId = d.a().getCurUserId();
                if (PatchProxy.isSupport(new Object[]{str2, curUserId}, null, UploadTimeLockPasswordApi.f33600a, true, 22090, new Class[]{String.class, String.class}, q.class)) {
                    qVar = (q) PatchProxy.accessDispatch(new Object[]{str2, curUserId}, null, UploadTimeLockPasswordApi.f33600a, true, 22090, new Class[]{String.class, String.class}, q.class);
                } else {
                    qVar = UploadTimeLockPasswordApi.f33601b.upload(str2, curUserId);
                }
                l.a(qVar, new k<BaseResponse>() {
                    public final void onFailure(Throwable th) {
                    }

                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    }
                });
                if (this.f33490f) {
                    timeLockUserSetting = TimeLockRuler.getUserSetting();
                } else {
                    timeLockUserSetting = new TimeLockUserSetting();
                }
                timeLockUserSetting.setUserId(d.a().getCurUserId());
                timeLockUserSetting.setLastSetTime(System.currentTimeMillis());
                timeLockUserSetting.setPassword(str2);
                if (this.f33490f) {
                    TimeLockRuler.applyUserSetting(timeLockUserSetting);
                    a.a((Context) getActivity(), (int) C0906R.string.ck_).a();
                    com.ss.android.ugc.aweme.antiaddic.lock.d.a(getActivity(), b());
                    return;
                }
                com.ss.android.ugc.aweme.antiaddic.lock.d.a(getActivity(), b(), timeLockUserSetting);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, i, false, 22060, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, i, false, 22060, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.m = getArguments().getString("password");
        this.j = (ViewGroup) view.findViewById(C0906R.id.chu);
        this.k = (ViewGroup) view.findViewById(C0906R.id.d3v);
        if (com.ss.android.g.a.b()) {
            this.j.setBackgroundColor(getResources().getColor(C0906R.color.a25));
            this.k.setBackgroundColor(getResources().getColor(C0906R.color.a17));
        }
        this.l = (DmtTextView) view.findViewById(C0906R.id.d1_);
        if (com.ss.android.g.a.a()) {
            this.l.setText(C0906R.string.a16);
        }
        this.h = (DmtStatusView) view.findViewById(C0906R.id.cvd);
        this.h.setBuilder(DmtStatusView.a.a((Context) getActivity()));
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, i, false, 22059, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.q9, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, i, false, 22059, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
