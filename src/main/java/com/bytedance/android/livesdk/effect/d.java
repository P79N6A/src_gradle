package com.bytedance.android.livesdk.effect;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LiveDialogFragment;
import com.bytedance.android.livesdk.effect.beauty.smallitem.LiveSmallItemBeautyDialogFragment;
import com.bytedance.android.livesdk.sticker.c.b;
import com.bytedance.android.livesdk.v.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13760a;

    /* renamed from: b  reason: collision with root package name */
    private LiveSmallItemBeautyDialogFragment f13761b;

    /* renamed from: c  reason: collision with root package name */
    private b f13762c;

    /* renamed from: d  reason: collision with root package name */
    private k f13763d;

    public static final class a implements h.b<b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13764a;

        @NonNull
        public final h.b.a<b> a(h.b.a<b> aVar) {
            h.b.a<b> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f13764a, false, 8143, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new d()).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f13764a, false, 8143, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    public final b a() {
        if (PatchProxy.isSupport(new Object[0], this, f13760a, false, 8140, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f13760a, false, 8140, new Class[0], b.class);
        }
        if (this.f13762c == null) {
            this.f13762c = new b();
        }
        return this.f13762c;
    }

    public final k b() {
        if (PatchProxy.isSupport(new Object[0], this, f13760a, false, 8141, new Class[0], k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[0], this, f13760a, false, 8141, new Class[0], k.class);
        }
        if (this.f13763d == null) {
            this.f13763d = new k();
        }
        return this.f13763d;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f13760a, false, 8142, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13760a, false, 8142, new Class[0], Void.TYPE);
            return;
        }
        if (this.f13761b != null) {
            if (this.f13761b.isShowing()) {
                try {
                    this.f13761b.dismissAllowingStateLoss();
                } catch (Exception e2) {
                    com.bytedance.android.live.core.c.a.a("LiveEffectService", (Throwable) e2);
                }
            }
            this.f13761b = null;
        }
        if (this.f13762c != null) {
            this.f13762c.a();
        }
        if (this.f13763d != null) {
            k kVar = this.f13763d;
            if (PatchProxy.isSupport(new Object[0], kVar, k.f13798a, false, 8210, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], kVar, k.f13798a, false, 8210, new Class[0], Void.TYPE);
            } else {
                kVar.f13800b.clear();
            }
            this.f13763d = null;
        }
    }

    public final LiveDialogFragment a(@NonNull FragmentActivity fragmentActivity, Boolean bool) {
        LiveSmallItemBeautyDialogFragment liveSmallItemBeautyDialogFragment;
        Object accessDispatch;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, bool}, this, f13760a, false, 8139, new Class[]{FragmentActivity.class, Boolean.class}, LiveDialogFragment.class)) {
            return (LiveDialogFragment) PatchProxy.accessDispatch(new Object[]{fragmentActivity, bool}, this, f13760a, false, 8139, new Class[]{FragmentActivity.class, Boolean.class}, LiveDialogFragment.class);
        }
        Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag("LiveSmallItemBeautyDialogFragment");
        if (findFragmentByTag != null && findFragmentByTag.isAdded() && (findFragmentByTag instanceof LiveDialogFragment)) {
            return (LiveDialogFragment) findFragmentByTag;
        }
        if (this.f13761b == null) {
            boolean booleanValue = bool.booleanValue();
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0)}, null, LiveSmallItemBeautyDialogFragment.f13742a, true, 8258, new Class[]{Boolean.TYPE}, LiveSmallItemBeautyDialogFragment.class)) {
                accessDispatch = PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue)}, null, LiveSmallItemBeautyDialogFragment.f13742a, true, 8258, new Class[]{Boolean.TYPE}, LiveSmallItemBeautyDialogFragment.class);
            } else {
                LiveSmallItemBeautyDialogFragment.a aVar = LiveSmallItemBeautyDialogFragment.f13744f;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue)}, aVar, LiveSmallItemBeautyDialogFragment.a.f13748a, false, 8259, new Class[]{Boolean.TYPE}, LiveSmallItemBeautyDialogFragment.class)) {
                    Object[] objArr = {Byte.valueOf(booleanValue)};
                    ChangeQuickRedirect changeQuickRedirect = LiveSmallItemBeautyDialogFragment.a.f13748a;
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    accessDispatch = PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect2, false, 8259, new Class[]{Boolean.TYPE}, LiveSmallItemBeautyDialogFragment.class);
                } else {
                    LiveSmallItemBeautyDialogFragment liveSmallItemBeautyDialogFragment2 = new LiveSmallItemBeautyDialogFragment();
                    liveSmallItemBeautyDialogFragment2.f13746d = booleanValue;
                    liveSmallItemBeautyDialogFragment = liveSmallItemBeautyDialogFragment2;
                    this.f13761b = liveSmallItemBeautyDialogFragment;
                }
            }
            liveSmallItemBeautyDialogFragment = (LiveSmallItemBeautyDialogFragment) accessDispatch;
            this.f13761b = liveSmallItemBeautyDialogFragment;
        }
        if (!this.f13761b.isShowing()) {
            this.f13761b.show(fragmentActivity.getSupportFragmentManager(), "LiveSmallItemBeautyDialogFragment");
        }
        return this.f13761b;
    }
}
