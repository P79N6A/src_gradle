package com.ss.android.ugc.aweme.photomovie.edit.music;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.LifecycleObserver;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a.d;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.photomovie.edit.b;
import com.ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicAdapter;
import com.ss.android.ugc.aweme.photomovie.transition.d;
import com.ss.android.ugc.aweme.photomovie.transition.e;
import com.ss.android.ugc.aweme.photomovie.transition.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

public class PhotoMovieMusicModule implements LifecycleObserver, View.OnClickListener, PhotoMovieMusicAdapter.a, e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58957a;

    /* renamed from: b  reason: collision with root package name */
    public AmeActivity f58958b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.photomovie.edit.player.a f58959c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f58960d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.e f58961e;

    /* renamed from: f  reason: collision with root package name */
    public String f58962f;
    private d g;
    private b h;
    private final a i;
    private PhotoMovieMusicAdapter j;
    private String k;
    private String l;

    public interface a {
        void a(String str);
    }

    @NonNull
    public final d a() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit a(com.ss.android.ugc.aweme.ao.a.e eVar) {
        com.ss.android.ugc.aweme.ao.a.e eVar2 = eVar;
        if (this.i != null) {
            this.i.a(eVar2.f33634c);
        }
        com.ss.android.ugc.aweme.shortvideo.e eVar3 = eVar2.f33635d;
        String str = eVar2.f33636e;
        if (PatchProxy.isSupport(new Object[]{eVar3, str}, this, f58957a, false, 64128, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar3, str}, this, f58957a, false, 64128, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class, String.class}, Void.TYPE);
        } else {
            b(eVar3, str);
            if (this.j != null) {
                PhotoMovieMusicAdapter photoMovieMusicAdapter = this.j;
                if (PatchProxy.isSupport(new Object[]{0, eVar3}, photoMovieMusicAdapter, PhotoMovieMusicAdapter.f58935a, false, 64098, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.shortvideo.e.class}, Void.TYPE)) {
                    PhotoMovieMusicAdapter photoMovieMusicAdapter2 = photoMovieMusicAdapter;
                    PatchProxy.accessDispatch(new Object[]{0, eVar3}, photoMovieMusicAdapter2, PhotoMovieMusicAdapter.f58935a, false, 64098, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.shortvideo.e.class}, Void.TYPE);
                } else if (!CollectionUtils.isEmpty(photoMovieMusicAdapter.f58937c) && photoMovieMusicAdapter.f58937c.size() > 0) {
                    photoMovieMusicAdapter.f58937c.set(0, new MusicWrapper(eVar3));
                    photoMovieMusicAdapter.a(0);
                }
            }
        }
        return null;
    }

    public void onClick(View view) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{view}, this, f58957a, false, 64123, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58957a, false, 64123, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.asy) {
            com.ss.android.ugc.aweme.shortvideo.e eVar = this.f58959c.a().mMusic;
            if (eVar != null && (eVar.getMid() == null || !eVar.getMid().equals(this.f58961e.getMid()))) {
                b(this.f58961e, this.f58962f);
                com.ss.android.ugc.aweme.shortvideo.e eVar2 = this.f58961e;
                if (PatchProxy.isSupport(new Object[]{eVar2}, this, f58957a, false, 64127, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar2}, this, f58957a, false, 64127, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class}, Void.TYPE);
                } else if (this.j != null && eVar2 != null) {
                    PhotoMovieMusicAdapter photoMovieMusicAdapter = this.j;
                    if (PatchProxy.isSupport(new Object[]{eVar2}, photoMovieMusicAdapter, PhotoMovieMusicAdapter.f58935a, false, 64099, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class}, Void.TYPE)) {
                        PhotoMovieMusicAdapter photoMovieMusicAdapter2 = photoMovieMusicAdapter;
                        PatchProxy.accessDispatch(new Object[]{eVar2}, photoMovieMusicAdapter2, PhotoMovieMusicAdapter.f58935a, false, 64099, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class}, Void.TYPE);
                    } else {
                        while (true) {
                            if (i2 >= photoMovieMusicAdapter.f58937c.size()) {
                                break;
                            } else if (photoMovieMusicAdapter.f58937c.get(i2).f58932d.getMid().equals(eVar2.getMid())) {
                                photoMovieMusicAdapter.a(i2);
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
            this.h.b(this);
            return;
        }
        if (id == C0906R.id.at3) {
            this.h.b(this);
        }
    }

    private void b(@NonNull final com.ss.android.ugc.aweme.shortvideo.e eVar, @NonNull String str) {
        if (PatchProxy.isSupport(new Object[]{eVar, str}, this, f58957a, false, 64126, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, str}, this, f58957a, false, 64126, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class, String.class}, Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f58960d, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(100);
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58965a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f58965a, false, 64131, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f58965a, false, 64131, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                PhotoMovieMusicModule.this.f58960d.setText(PhotoMovieMusicModule.this.f58958b.getString(C0906R.string.cnu, new Object[]{eVar.getMusicName()}));
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f58960d, "alpha", new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(200);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat2).after(ofFloat);
        animatorSet.start();
        this.f58959c.a(eVar, str);
    }

    public final void a(@NonNull com.ss.android.ugc.aweme.shortvideo.e eVar, @NonNull String str) {
        com.ss.android.ugc.aweme.ao.a.d dVar;
        if (PatchProxy.isSupport(new Object[]{eVar, str}, this, f58957a, false, 64125, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, str}, this, f58957a, false, 64125, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class, String.class}, Void.TYPE);
            return;
        }
        if (eVar == null && str == null) {
            if (PatchProxy.isSupport(new Object[0], this, f58957a, false, 64124, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58957a, false, 64124, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.ao.a aVar = com.ss.android.ugc.aweme.port.in.a.i;
                AmeActivity ameActivity = this.f58958b;
                d.a aVar2 = com.ss.android.ugc.aweme.ao.a.d.h;
                String string = this.f58958b.getString(C0906R.string.rw);
                String str2 = this.k;
                String str3 = this.l;
                if (PatchProxy.isSupport(new Object[]{string, (byte) 0, null, str2, str3}, aVar2, d.a.f33630a, false, 87274, new Class[]{String.class, Boolean.TYPE, Bundle.class, String.class, String.class}, com.ss.android.ugc.aweme.ao.a.d.class)) {
                    d.a aVar3 = aVar2;
                    dVar = (com.ss.android.ugc.aweme.ao.a.d) PatchProxy.accessDispatch(new Object[]{string, (byte) 0, null, str2, str3}, aVar3, d.a.f33630a, false, 87274, new Class[]{String.class, Boolean.TYPE, Bundle.class, String.class, String.class}, com.ss.android.ugc.aweme.ao.a.d.class);
                } else {
                    dVar = new com.ss.android.ugc.aweme.ao.a.d(string, 0, false, null, str2, str3);
                }
                aVar.a((Activity) ameActivity, 1, dVar, (Function1<? super com.ss.android.ugc.aweme.ao.a.e, Unit>) new e<Object,Unit>(this), (Function0<Unit>) null);
            }
        } else {
            b(eVar, str);
        }
    }

    public PhotoMovieMusicModule(@NonNull AmeActivity ameActivity, @NonNull FrameLayout frameLayout, @NonNull com.ss.android.ugc.aweme.photomovie.edit.player.a aVar, @NonNull b bVar, @NotNull a aVar2, @NonNull String str, @NonNull String str2) {
        ameActivity.getLifecycle().addObserver(this);
        this.f58958b = ameActivity;
        this.k = str;
        this.l = str2;
        this.f58959c = aVar;
        this.h = bVar;
        this.i = aVar2;
        View inflate = LayoutInflater.from(this.f58958b).inflate(C0906R.layout.aej, frameLayout, false);
        this.g = new com.ss.android.ugc.aweme.photomovie.transition.b(frameLayout, inflate);
        this.g.a((f) new f.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58963a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f58963a, false, 64130, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f58963a, false, 64130, new Class[0], Void.TYPE);
                    return;
                }
                super.a();
                PhotoMovieMusicModule.this.f58961e = PhotoMovieMusicModule.this.f58959c.a().mMusic;
                PhotoMovieMusicModule.this.f58962f = PhotoMovieMusicModule.this.f58959c.a().mMusicPath;
            }
        });
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f58957a, false, 64122, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f58957a, false, 64122, new Class[]{View.class}, Void.TYPE);
            return;
        }
        inflate.findViewById(C0906R.id.asy).setOnClickListener(this);
        inflate.findViewById(C0906R.id.at3).setOnClickListener(this);
        ((TextView) inflate.findViewById(C0906R.id.dg_)).setText(C0906R.string.cnq);
        this.f58960d = (TextView) inflate.findViewById(C0906R.id.dg9);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0906R.id.cce);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f58958b, 0, false));
        PhotoMovieContext a2 = this.f58959c.a();
        this.j = new PhotoMovieMusicAdapter(a2.mMusicList, a2.mMusic);
        this.j.f58938d = this;
        recyclerView.setAdapter(this.j);
        this.f58960d.setText(this.f58958b.getString(C0906R.string.cnu, new Object[]{a2.mMusic.getMusicName()}));
    }
}
