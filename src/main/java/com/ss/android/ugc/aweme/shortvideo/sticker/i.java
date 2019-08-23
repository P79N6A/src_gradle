package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FavoriteStickerViewModel;
import com.ss.android.ugc.aweme.sticker.model.d;
import com.ss.android.ugc.aweme.themechange.base.b;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.effectmanager.effect.b.n;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.c;

public interface i {

    public static class a implements View.OnClickListener, i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69530a;

        /* renamed from: b  reason: collision with root package name */
        public String f69531b;

        /* renamed from: c  reason: collision with root package name */
        public AppCompatActivity f69532c;

        /* renamed from: d  reason: collision with root package name */
        public EffectStickerManager f69533d;

        /* renamed from: e  reason: collision with root package name */
        public fh f69534e;
        @Nullable

        /* renamed from: f  reason: collision with root package name */
        List<Effect> f69535f;
        private FrameLayout g;
        private CheckableImageView h;
        private Drawable i;
        private Drawable j;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f69530a, false, 78646, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69530a, false, 78646, new Class[0], Void.TYPE);
                return;
            }
            ((FavoriteStickerViewModel) ViewModelProviders.of((FragmentActivity) this.f69532c).get(FavoriteStickerViewModel.class)).a(this.f69533d.g, this.f69531b).observe(this.f69532c, new j(this));
        }

        public final void a(@Nullable Effect effect) {
            if (PatchProxy.isSupport(new Object[]{effect}, this, f69530a, false, 78640, new Class[]{Effect.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effect}, this, f69530a, false, 78640, new Class[]{Effect.class}, Void.TYPE);
                return;
            }
            b(b(effect));
        }

        public final void b(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69530a, false, 78641, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69530a, false, 78641, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (z) {
                this.h.setImageDrawable(this.i);
            } else {
                this.h.setImageDrawable(this.j);
            }
        }

        public final void c(Effect effect) {
            Effect effect2 = effect;
            if (PatchProxy.isSupport(new Object[]{effect2}, this, f69530a, false, 78645, new Class[]{Effect.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effect2}, this, f69530a, false, 78645, new Class[]{Effect.class}, Void.TYPE);
            } else if (effect2 != null) {
                d dVar = new d();
                dVar.id = effect2.id;
                c.a().d(new com.ss.android.ugc.aweme.favorites.b.a(dVar));
            }
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69530a, false, 78639, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69530a, false, 78639, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            g.a().f69525b = z;
            if (z) {
                if (this.f69532c != null && !this.f69532c.isFinishing()) {
                    g.a().a(this.g.findViewById(C0906R.id.b_z), this.f69532c);
                }
                this.g.setVisibility(0);
                return;
            }
            this.g.setVisibility(8);
        }

        public final boolean b(@Nullable Effect effect) {
            if (PatchProxy.isSupport(new Object[]{effect}, this, f69530a, false, 78642, new Class[]{Effect.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, this, f69530a, false, 78642, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
            } else if (this.f69535f == null || !this.f69535f.contains(effect)) {
                return false;
            } else {
                return true;
            }
        }

        public final void onClick(View view) {
            Bundle bundle;
            if (PatchProxy.isSupport(new Object[]{view}, this, f69530a, false, 78643, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f69530a, false, 78643, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            String string = this.f69532c.getString(C0906R.string.adx);
            if (!com.ss.android.ugc.aweme.port.in.a.x.c()) {
                f fVar = com.ss.android.ugc.aweme.port.in.a.x;
                AppCompatActivity appCompatActivity = this.f69532c;
                if (com.ss.android.ugc.aweme.i18n.c.a()) {
                    bundle = null;
                } else {
                    bundle = ad.a().a("login_title", string).f75487b;
                }
                fVar.a((Activity) appCompatActivity, "favorite_sticker", "click_favorite_prop", bundle, (f.a) new f.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f69544a;

                    public final void b() {
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f69544a, false, 78652, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f69544a, false, 78652, new Class[0], Void.TYPE);
                            return;
                        }
                        a.this.a();
                    }
                });
                return;
            }
            if (PatchProxy.isSupport(new Object[0], this, f69530a, false, 78644, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69530a, false, 78644, new Class[0], Void.TYPE);
                return;
            }
            this.h.b();
        }

        public a(@NonNull EffectStickerManager effectStickerManager, @NonNull String str, @NonNull AppCompatActivity appCompatActivity, @NonNull FrameLayout frameLayout, @NonNull CheckableImageView checkableImageView, @NonNull fh fhVar) {
            this.f69533d = effectStickerManager;
            this.f69532c = appCompatActivity;
            this.g = frameLayout;
            this.h = checkableImageView;
            this.g.setOnClickListener(this);
            this.f69531b = str;
            this.f69534e = fhVar;
            int a2 = b.f74589e.a(false);
            int b2 = b.f74589e.b(false);
            if (com.ss.android.g.a.a() && TextUtils.equals(this.f69531b, "livestreaming")) {
                a2 = this.f69532c.getResources().getColor(C0906R.color.a1w);
                b2 = this.f69532c.getResources().getColor(C0906R.color.ao4);
            }
            this.i = DrawableCompat.wrap(com.ss.android.ugc.bytex.a.a.a.a(this.f69532c.getResources(), 2130839329));
            b.f74589e.a(this.i, a2);
            this.j = DrawableCompat.wrap(com.ss.android.ugc.bytex.a.a.a.a(this.f69532c.getResources(), 2130839329));
            b.f74589e.a(this.j, b2);
            a();
            this.h.setOnStateChangeListener(new CheckableImageView.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69536a;

                /* renamed from: b  reason: collision with root package name */
                public Effect f69537b;

                /* renamed from: d  reason: collision with root package name */
                private Effect f69539d;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f69536a, false, 78649, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f69536a, false, 78649, new Class[0], Void.TYPE);
                    } else if (this.f69537b != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f69537b.effect_id);
                        a.this.c(this.f69537b);
                        if (a.this.b(this.f69537b)) {
                            ((FavoriteStickerViewModel) ViewModelProviders.of((FragmentActivity) a.this.f69532c).get(FavoriteStickerViewModel.class)).b(this.f69537b);
                            a.this.f69533d.g.a(a.this.f69531b, (List<String>) arrayList, Boolean.FALSE, (n) new n() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f69540a;

                                public final void a(List<String> list) {
                                }

                                public final void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
                                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f69540a, false, 78650, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f69540a, false, 78650, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                                        return;
                                    }
                                    ((FavoriteStickerViewModel) ViewModelProviders.of((FragmentActivity) a.this.f69532c).get(FavoriteStickerViewModel.class)).a(AnonymousClass1.this.f69537b);
                                }
                            });
                            return;
                        }
                        if (a.this.f69534e != null) {
                            com.ss.android.ugc.aweme.utils.a.f75468b.a("prop_save", com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "video_shoot_page").a("enter_method", "click_main_panel").a("creation_id", a.this.f69534e.q).a("shoot_way", a.this.f69534e.r).a("draft_id", a.this.f69534e.v).a("prop_id", this.f69537b.effect_id).f34114b);
                            if (this.f69539d != null) {
                                com.ss.android.ugc.aweme.utils.a.f75468b.a("prop_save", com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "video_shoot_page").a("enter_method", "click_banner").a("creation_id", a.this.f69534e.q).a("shoot_way", a.this.f69534e.r).a("draft_id", a.this.f69534e.v).a("parent_pop_id", this.f69539d.parent).a("prop_id", this.f69539d.effect_id).f34114b);
                            }
                        }
                        ((FavoriteStickerViewModel) ViewModelProviders.of((FragmentActivity) a.this.f69532c).get(FavoriteStickerViewModel.class)).a(this.f69537b);
                        a.this.f69533d.g.a(a.this.f69531b, (List<String>) arrayList, Boolean.TRUE, (n) new n() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f69542a;

                            public final void a(List<String> list) {
                            }

                            public final void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
                                if (PatchProxy.isSupport(new Object[]{cVar}, this, f69542a, false, 78651, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f69542a, false, 78651, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                                    return;
                                }
                                ((FavoriteStickerViewModel) ViewModelProviders.of((FragmentActivity) a.this.f69532c).get(FavoriteStickerViewModel.class)).b(AnonymousClass1.this.f69537b);
                            }
                        });
                    }
                }

                public final void a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69536a, false, 78648, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69536a, false, 78648, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i == 0) {
                        this.f69539d = a.this.f69533d.k;
                        this.f69537b = a.this.f69533d.f3971b;
                    }
                    if (i == 1) {
                        a.this.b(!a.this.b(a.this.f69533d.f3971b));
                    }
                }
            });
        }
    }

    void a();

    void a(@Nullable Effect effect);

    void a(boolean z);
}
