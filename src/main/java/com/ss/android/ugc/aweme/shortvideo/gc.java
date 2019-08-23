package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.filter.FilterViewModel;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.shortvideo.filter.e;
import com.ss.android.ugc.aweme.shortvideo.fz;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.bk;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.tools.au;
import com.ss.android.ugc.aweme.tools.ax;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.util.c;

public final /* synthetic */ class gc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67881a;

    /* renamed from: b  reason: collision with root package name */
    private final fz.AnonymousClass1 f67882b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f67883c;

    /* renamed from: d  reason: collision with root package name */
    private final fh f67884d;

    /* renamed from: e  reason: collision with root package name */
    private final au f67885e;

    gc(fz.AnonymousClass1 r1, Integer num, fh fhVar, au auVar) {
        this.f67882b = r1;
        this.f67883c = num;
        this.f67884d = fhVar;
        this.f67885e = auVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67881a, false, 74721, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67881a, false, 74721, new Class[0], Void.TYPE);
            return;
        }
        fz.AnonymousClass1 r0 = this.f67882b;
        Integer num = this.f67883c;
        fh fhVar = this.f67884d;
        au auVar = this.f67885e;
        if (num.intValue() == 0) {
            if (PatchProxy.isSupport(new Object[]{fhVar, auVar}, r0, fz.AnonymousClass1.f67832a, false, 74718, new Class[]{fh.class, au.class}, Void.TYPE)) {
                Object[] objArr = {fhVar, auVar};
                fz.AnonymousClass1 r9 = r0;
                PatchProxy.accessDispatch(objArr, r9, fz.AnonymousClass1.f67832a, false, 74718, new Class[]{fh.class, au.class}, Void.TYPE);
            } else {
                fhVar.m.begin(auVar.f74633b, fz.this.f67830b.k.g, fz.this.f67830b.k.x);
                c.a("set hasStopped to false, cur Speed: " + auVar.f74633b);
                ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) fz.this.f67830b).get(ShortVideoContextViewModel.class)).d(false);
                VideoRecordNewActivity videoRecordNewActivity = fz.this.f67830b;
                videoRecordNewActivity.getClass();
                new VideoRecordNewActivity.b().run();
                MutableLiveData<Boolean> c2 = ((FilterViewModel) ViewModelProviders.of((FragmentActivity) fz.this.f67830b).get(FilterViewModel.class)).c();
                h e2 = ((e) fz.this.f67830b.l.c()).e();
                String str = e2.f47600d;
                if (str != null) {
                    fhVar.O.add(str);
                }
                String valueOf = String.valueOf(e2.f47598b);
                if (c2.getValue() == null || !((Boolean) c2.getValue()).booleanValue()) {
                    fhVar.P.add(valueOf);
                } else {
                    fhVar.P.add("null");
                }
                VideoRecordNewActivity videoRecordNewActivity2 = fz.this.f67830b;
                if (PatchProxy.isSupport(new Object[0], videoRecordNewActivity2, VideoRecordNewActivity.f4033b, false, 80613, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], videoRecordNewActivity2, VideoRecordNewActivity.f4033b, false, 80613, new Class[0], Void.TYPE);
                } else {
                    videoRecordNewActivity2.runOnUiThread(new bk(videoRecordNewActivity2));
                }
            }
        } else {
            int intValue = num.intValue();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue)}, r0, fz.AnonymousClass1.f67832a, false, 74717, new Class[]{Integer.TYPE}, Void.TYPE)) {
                Object[] objArr2 = {Integer.valueOf(intValue)};
                Object[] objArr3 = objArr2;
                fz.AnonymousClass1 r92 = r0;
                PatchProxy.accessDispatch(objArr3, r92, fz.AnonymousClass1.f67832a, false, 74717, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            ai.b("start Record ret :" + intValue);
            a.b((Context) fz.this.f67830b, (int) C0906R.string.c04).a();
            fz.this.f67830b.k().a((Object) r0, (bc) new ax());
        }
    }
}
