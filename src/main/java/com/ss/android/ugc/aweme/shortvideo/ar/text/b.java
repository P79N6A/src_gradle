package com.ss.android.ugc.aweme.shortvideo.ar.text;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FaceBeautyInvoker;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment;
import com.ss.android.ugc.aweme.shortvideo.ar.text.n;

public final class b extends r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65678a;

    public final void a(n nVar) {
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f65678a, false, 75130, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, f65678a, false, 75130, new Class[]{n.class}, Void.TYPE);
            return;
        }
        super.a(nVar);
        nVar2.setEffectTextChangeListener(new n.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65679a;

            public final void b(String str) {
            }

            public final void a(String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f65679a, false, 75133, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f65679a, false, 75133, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                if (b.this.j) {
                    b.this.a(str);
                }
            }
        });
    }

    public final int a(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f65678a, false, 75129, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f65678a, false, 75129, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
        }
        this.f65742e.a((FaceBeautyInvoker.OnARTextCountCallback) new c(this, this.h.getActivity(), i, str));
        return this.l;
    }

    public b(FragmentActivity fragmentActivity, MediaRecordPresenter mediaRecordPresenter, ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        super(fragmentActivity, mediaRecordPresenter, shortVideoRecordingOperationPanelFragment);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i, int i2, Activity activity, String str) {
        this.l = i;
        if (this.l > 0 || i2 != 1) {
            if (!TextUtils.isEmpty(str)) {
                this.l += str.length();
            }
            return;
        }
        a.c((Context) activity, activity.getResources().getString(C0906R.string.bwo)).a();
    }
}
