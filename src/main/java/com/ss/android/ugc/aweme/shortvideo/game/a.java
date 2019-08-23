package com.ss.android.ugc.aweme.shortvideo.game;

import android.arch.lifecycle.ViewModelProviders;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.game.a.b;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.am;
import com.ss.android.ugc.aweme.tools.au;
import com.ss.android.ugc.aweme.tools.ax;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.m;
import com.ss.android.ugc.aweme.tools.n;
import java.util.HashMap;
import java.util.Map;

public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67852a;

    /* renamed from: b  reason: collision with root package name */
    dmt.av.video.b.a f67853b;

    /* renamed from: c  reason: collision with root package name */
    h f67854c;

    /* renamed from: d  reason: collision with root package name */
    VideoRecordNewActivity f67855d;

    /* renamed from: e  reason: collision with root package name */
    public FaceStickerBean f67856e = FaceStickerBean.NONE;

    /* renamed from: f  reason: collision with root package name */
    public boolean f67857f;
    long g;
    public boolean h;
    boolean i;
    MediaRecordPresenter j;
    private com.ss.android.ugc.aweme.shortvideo.game.a.a k;
    private int l;

    public final boolean b() {
        return this.h;
    }

    public final fh d() {
        if (!PatchProxy.isSupport(new Object[0], this, f67852a, false, 77353, new Class[0], fh.class)) {
            return ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) this.f67855d).get(ShortVideoContextViewModel.class)).f65401b;
        }
        return (fh) PatchProxy.accessDispatch(new Object[0], this, f67852a, false, 77353, new Class[0], fh.class);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f67852a, false, 77352, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67852a, false, 77352, new Class[0], Void.TYPE);
        } else if (!this.i) {
            this.j.a(4102, 0, 0, "");
            this.f67857f = false;
            this.f67855d.k().a((Object) this, (bc) new ax());
            d().f67720c = this.g;
            d().ab = 0;
            this.f67854c.b();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67852a, false, 77351, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67852a, false, 77351, new Class[0], Void.TYPE);
        } else if (!this.i) {
            this.f67855d.k().a((Object) this, (bc) new m());
            this.f67854c.d();
            this.f67854c.c();
            this.h = false;
            ((GameResultViewModel) ViewModelProviders.of((FragmentActivity) this.f67855d).get(GameResultViewModel.class)).f67849b = false;
            this.f67856e = FaceStickerBean.NONE;
            this.f67855d.k.a((FaceStickerBean) null);
            if (d().l.e() != null) {
                this.f67853b.c().a(true);
                this.j.h(false);
                this.f67853b.c().a(d().l.e().getPath());
            } else {
                this.f67853b.c().a(false);
                this.j.h(true);
            }
            if (d().ad != null) {
                this.f67855d.k().a((Object) this, (bc) new n());
                return;
            }
            this.k.b();
            if (this.l != this.f67855d.m.h()) {
                this.f67855d.m.i();
            }
        }
    }

    public final void a(FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f67852a, false, 77348, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f67852a, false, 77348, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        this.f67856e = faceStickerBean;
        this.k.a();
        this.l = this.f67855d.m.h();
        if (this.l != 1) {
            this.f67855d.m.i();
        }
        this.h = true;
        this.i = false;
        ((GameResultViewModel) ViewModelProviders.of((FragmentActivity) this.f67855d).get(GameResultViewModel.class)).f67849b = true;
        this.f67854c.a();
        this.f67853b.c().a(false);
        this.j.h(true);
        if (!this.f67857f) {
            HashMap hashMap = new HashMap();
            hashMap.put("prop_id", String.valueOf(faceStickerBean.getStickerId()));
            hashMap.put("shoot_way", d().r);
            hashMap.put("creation_id", d().q);
            r.a("enter_prop_game_page", (Map) hashMap);
        }
    }

    public a(@NonNull VideoRecordNewActivity videoRecordNewActivity, @NonNull dmt.av.video.b.a aVar, @NonNull FrameLayout frameLayout, com.ss.android.ugc.aweme.shortvideo.game.a.a aVar2) {
        this.f67853b = aVar;
        this.j = aVar.f();
        this.k = aVar2;
        this.f67855d = videoRecordNewActivity;
        videoRecordNewActivity.a((com.ss.android.ugc.aweme.base.activity.a) new com.ss.android.ugc.aweme.base.activity.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67858a;

            public final boolean a(int i, KeyEvent keyEvent) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f67858a, false, 77358, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f67858a, false, 77358, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                } else if (!a.this.h || i != 4) {
                    return false;
                } else {
                    if (a.this.f67857f) {
                        a.this.c();
                    } else {
                        a.this.a();
                    }
                    return true;
                }
            }
        });
        this.f67854c = new d(frameLayout, new b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67860a;

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f67860a, false, 77360, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f67860a, false, 77360, new Class[0], Void.TYPE);
                } else if (a.this.f67857f) {
                    a.this.c();
                } else {
                    a.this.a();
                }
            }

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f67860a, false, 77359, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f67860a, false, 77359, new Class[0], Void.TYPE);
                    return;
                }
                a aVar = a.this;
                if (PatchProxy.isSupport(new Object[0], aVar, a.f67852a, false, 77349, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f67852a, false, 77349, new Class[0], Void.TYPE);
                } else if (!aVar.f67853b.b().a()) {
                    aVar.f67855d.k().a((Object) aVar, (bc) new m());
                    aVar.f67857f = true;
                    aVar.g = aVar.d().f67720c;
                    aVar.j.a(4097, 0, 0, "");
                    fh d2 = aVar.d();
                    d2.f67720c = 30000;
                    d2.ab = 1;
                    if (d2.ad != null) {
                        aVar.j.a(4103, (long) d2.ad.gameScore, 0, "");
                    }
                    aVar.f67854c.c();
                    if (PatchProxy.isSupport(new Object[]{1}, null, com.ss.android.ugc.aweme.shortvideo.d.a.f66731a, true, 75264, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{1}, null, com.ss.android.ugc.aweme.shortvideo.d.a.f66731a, true, 75264, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else {
                        SharedPreferences.Editor edit = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "publish", 0).edit();
                        edit.putInt("record_mode", 1);
                        SharedPrefsEditorCompat.apply(edit);
                    }
                    aVar.f67855d.k().a((Object) aVar.f67855d, (bc) new au(am.NORMAL));
                }
                HashMap hashMap = new HashMap();
                hashMap.put("prop_id", String.valueOf(a.this.f67856e.getStickerId()));
                hashMap.put("shoot_way", a.this.d().r);
                hashMap.put("creation_id", a.this.d().q);
                r.a("click_game_play_button", (Map) hashMap);
            }
        });
        ((GameResultViewModel) ViewModelProviders.of((FragmentActivity) videoRecordNewActivity).get(GameResultViewModel.class)).a().observe(videoRecordNewActivity, new b(this, videoRecordNewActivity));
        ((GameResultViewModel) ViewModelProviders.of((FragmentActivity) videoRecordNewActivity).get(GameResultViewModel.class)).b().observe(videoRecordNewActivity, new c(this));
    }
}
