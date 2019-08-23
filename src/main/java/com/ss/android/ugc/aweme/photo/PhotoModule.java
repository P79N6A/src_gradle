package com.ss.android.ugc.aweme.photo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.common.a;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.shortvideo.view.d;

public class PhotoModule implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3717a;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f3718b = {720, 1280};

    /* renamed from: c  reason: collision with root package name */
    public final AbsActivity f3719c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaRecordPresenter f3720d;

    /* renamed from: e  reason: collision with root package name */
    public a f3721e;

    /* renamed from: f  reason: collision with root package name */
    public final t f3722f = new c();
    public d g;

    public interface a {
        void a(String str);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void dismissDialog() {
        if (PatchProxy.isSupport(new Object[0], this, f3717a, false, 63594, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3717a, false, 63594, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null && this.g.isShowing()) {
            this.g.dismiss();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3717a, false, 63593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3717a, false, 63593, new Class[0], Void.TYPE);
            return;
        }
        ((c) this.f3722f).f58483b = Bitmap.CompressFormat.JPEG;
        String a2 = this.f3722f.a();
        this.f3720d.a(a2, f3718b, true, Bitmap.CompressFormat.JPEG, (a.b) new q(this, a2));
    }

    public static boolean a(@Nullable String str) {
        boolean z;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f3717a, true, 63591, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f3717a, true, 63591, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{str2}, null, j.f58550a, true, 63563, new Class[]{String.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, j.f58550a, true, 63563, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!j.a() || (!"direct_shoot".equals(str2) && !"prop_reuse".equals(str2) && !"challenge".equals(str2))) {
            z = false;
        } else {
            z = true;
        }
        if (!z || com.ss.android.g.a.a()) {
            return false;
        }
        return true;
    }

    public PhotoModule(AbsActivity absActivity, MediaRecordPresenter mediaRecordPresenter, a aVar) {
        this.f3719c = absActivity;
        this.f3720d = mediaRecordPresenter;
        this.f3721e = aVar;
        absActivity.getLifecycle().addObserver(this);
    }
}
