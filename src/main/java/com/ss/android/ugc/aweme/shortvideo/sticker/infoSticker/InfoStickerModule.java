package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.activity.a;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public class InfoStickerModule implements LifecycleObserver, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4000a;

    /* renamed from: b  reason: collision with root package name */
    public b.a f4001b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4002c;

    /* renamed from: d  reason: collision with root package name */
    private FragmentActivity f4003d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f4004e;

    /* renamed from: f  reason: collision with root package name */
    private cb f4005f;
    private c g;
    private final e h;
    private a i = new k(this);

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f4000a, false, 79302, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4000a, false, 79302, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.b();
        }
        this.h.b(this.i);
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f4000a, false, 79303, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4000a, false, 79303, new Class[0], Void.TYPE);
            return;
        }
        o.a(this.f4003d.getApplication());
        o.f70097b = null;
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f4000a, false, 79301, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4000a, false, 79301, new Class[0], Void.TYPE);
            return;
        }
        if (this.g == null) {
            a(this.f4003d).f69785d = this.f4005f;
            this.g = new InfoStickerViewImpl(this.f4003d, this.f4004e, this.f4005f, new c.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69723a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f69723a, false, 79306, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f69723a, false, 79306, new Class[0], Void.TYPE);
                        return;
                    }
                    if (InfoStickerModule.this.f4001b != null) {
                        InfoStickerModule.this.f4001b.b();
                    }
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f69723a, false, 79307, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f69723a, false, 79307, new Class[0], Void.TYPE);
                        return;
                    }
                    if (InfoStickerModule.this.f4001b != null) {
                        InfoStickerModule.this.f4001b.a();
                    }
                }

                public final void a(@NonNull Effect effect, String str) {
                    if (PatchProxy.isSupport(new Object[]{effect, str}, this, f69723a, false, 79308, new Class[]{Effect.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effect, str}, this, f69723a, false, 79308, new Class[]{Effect.class, String.class}, Void.TYPE);
                        return;
                    }
                    if (InfoStickerModule.this.f4001b != null) {
                        InfoStickerModule.this.f4001b.a(effect, str);
                    }
                    if (!n.a(effect)) {
                        InfoStickerModule.this.b();
                    }
                }
            });
            ((InfoStickerViewImpl) this.g).f4011f = this.f4002c;
        }
        com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
        d a2 = d.a().a("scene_id", (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR).a("creation_id", this.f4005f.creationId).a("shoot_way", this.f4005f.mShootWay).a("draft_id", this.f4005f.draftId);
        if (this.f4002c) {
            str = "edit_post_page";
        } else {
            str = "video_edit_page";
        }
        aVar.a("click_prop_entrance", a2.a("enter_from", str).a("content_type", this.f4005f.getAvetParameter().getContentType()).a("content_source", this.f4005f.getAvetParameter().getContentSource()).f34114b);
        this.g.a();
        this.h.a(this.i);
    }

    public final void a(b.a aVar) {
        this.f4001b = aVar;
    }

    @NonNull
    public static InfoStickerViewModel a(FragmentActivity fragmentActivity) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity2}, null, f4000a, true, 79304, new Class[]{FragmentActivity.class}, InfoStickerViewModel.class)) {
            return (InfoStickerViewModel) ViewModelProviders.of(fragmentActivity2, (ViewModelProvider.Factory) o.a(fragmentActivity.getApplication())).get(InfoStickerViewModel.class);
        }
        return (InfoStickerViewModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, null, f4000a, true, 79304, new Class[]{FragmentActivity.class}, InfoStickerViewModel.class);
    }

    public InfoStickerModule(FragmentActivity fragmentActivity, e eVar, FrameLayout frameLayout, @NonNull cb cbVar) {
        this.f4003d = fragmentActivity;
        this.h = eVar;
        this.f4004e = frameLayout;
        this.f4005f = cbVar;
        a(fragmentActivity).a("infostickerv2");
        this.f4003d.getLifecycle().addObserver(this);
    }
}
