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

public final class g extends r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65698a;
    private FaceBeautyInvoker.OnARTextBitmapCallback o = h.f65702b;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f65698a, false, 75151, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65698a, false, 75151, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f65698a, false, 75152, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65698a, false, 75152, new Class[0], Void.TYPE);
            return;
        }
        if (!(TextUtils.isEmpty(this.m) || this.f65742e == null || this.f65743f == null)) {
            this.f65742e.f(true);
            this.f65742e.a(this.m, this.f65743f.f65736b, this.f65743f.f65737c, this.f65743f.f65738d);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65698a, false, 75148, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65698a, false, 75148, new Class[0], Void.TYPE);
            return;
        }
        MediaRecordPresenter mediaRecordPresenter = this.f65742e;
        FaceBeautyInvoker.OnARTextBitmapCallback onARTextBitmapCallback = this.o;
        if (PatchProxy.isSupport(new Object[]{onARTextBitmapCallback}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17677, new Class[]{FaceBeautyInvoker.OnARTextBitmapCallback.class}, Integer.TYPE)) {
            Object[] objArr = {onARTextBitmapCallback};
            MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
            ((Integer) PatchProxy.accessDispatch(objArr, mediaRecordPresenter2, MediaRecordPresenter.f29728a, false, 17677, new Class[]{FaceBeautyInvoker.OnARTextBitmapCallback.class}, Integer.TYPE)).intValue();
        } else {
            mediaRecordPresenter.j.slamGetTextBitmap(onARTextBitmapCallback);
        }
    }

    public final void a(n nVar) {
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f65698a, false, 75150, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, f65698a, false, 75150, new Class[]{n.class}, Void.TYPE);
            return;
        }
        nVar2.setEffectTextChangeListener(new n.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65699a;

            public final void a(String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f65699a, false, 75156, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f65699a, false, 75156, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                if (g.this.j) {
                    g.this.a(str);
                }
            }

            public final void b(String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f65699a, false, 75157, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f65699a, false, 75157, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                g.this.m = str;
                g.this.f65742e.f(true);
                g.this.f65742e.a(str, g.this.f65743f.f65736b, g.this.f65743f.f65737c, g.this.f65743f.f65738d);
            }
        });
        super.a(nVar);
    }

    public final int a(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f65698a, false, 75149, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f65698a, false, 75149, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
        }
        this.f65742e.a((FaceBeautyInvoker.OnARTextCountCallback) new i(this, this.h.getActivity(), i, str));
        return this.l;
    }

    public g(FragmentActivity fragmentActivity, MediaRecordPresenter mediaRecordPresenter, ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        super(fragmentActivity, mediaRecordPresenter, shortVideoRecordingOperationPanelFragment);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i, int i2, Activity activity, String str) {
        this.l = i;
        if (this.l > 0 || i2 != 1) {
            if (!TextUtils.isEmpty(str)) {
                this.l += str.length();
            }
            this.f65740c.setMaxTextCount(this.l);
            return;
        }
        a.c((Context) activity, activity.getResources().getString(C0906R.string.bwo)).a();
    }
}
