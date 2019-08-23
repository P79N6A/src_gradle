package com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.j;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.LinkedList;
import java.util.List;

public class FavoriteStickerViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70296a;

    /* renamed from: b  reason: collision with root package name */
    public a f70297b;

    /* renamed from: c  reason: collision with root package name */
    public List<Effect> f70298c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    public MutableLiveData<com.ss.android.ugc.aweme.w.b.a<List<Effect>>> f70299d = new MutableLiveData<>();

    public interface a {
        void a(@NonNull Effect effect);
    }

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f70296a, false, 79934, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70296a, false, 79934, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
        this.f70297b = null;
    }

    public final LiveData<com.ss.android.ugc.aweme.w.b.a<List<Effect>>> a(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f70296a, false, 79930, new Class[]{Effect.class}, LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[]{effect}, this, f70296a, false, 79930, new Class[]{Effect.class}, LiveData.class);
        } else if (effect == null) {
            return this.f70299d;
        } else {
            if (this.f70297b != null) {
                this.f70297b.a(effect);
            }
            this.f70298c.add(0, effect);
            this.f70299d.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.SUCCESS, this.f70298c));
            return this.f70299d;
        }
    }

    public final LiveData<com.ss.android.ugc.aweme.w.b.a<List<Effect>>> b(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f70296a, false, 79931, new Class[]{Effect.class}, LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[]{effect}, this, f70296a, false, 79931, new Class[]{Effect.class}, LiveData.class);
        } else if (effect == null) {
            return this.f70299d;
        } else {
            if (this.f70298c.contains(effect)) {
                this.f70298c.remove(effect);
            }
            this.f70299d.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.SUCCESS, this.f70298c));
            return this.f70299d;
        }
    }

    private void b(EffectPlatform effectPlatform, String str) {
        EffectPlatform effectPlatform2 = effectPlatform;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{effectPlatform2, str2}, this, f70296a, false, 79933, new Class[]{EffectPlatform.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectPlatform2, str2}, this, f70296a, false, 79933, new Class[]{EffectPlatform.class, String.class}, Void.TYPE);
            return;
        }
        effectPlatform2.a(str2, (j) new j() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70300a;

            public final void a(c cVar) {
                c cVar2 = cVar;
                if (PatchProxy.isSupport(new Object[]{cVar2}, this, f70300a, false, 79936, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar2}, this, f70300a, false, 79936, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                FavoriteStickerViewModel.this.f70299d.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.ERROR, cVar2.f77317c));
            }

            public final void a(List<Effect> list, String str) {
                if (PatchProxy.isSupport(new Object[]{list, str}, this, f70300a, false, 79935, new Class[]{List.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list, str}, this, f70300a, false, 79935, new Class[]{List.class, String.class}, Void.TYPE);
                    return;
                }
                FavoriteStickerViewModel.this.f70298c = list;
                FavoriteStickerViewModel.this.f70299d.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.SUCCESS, list));
            }
        });
    }

    public final LiveData<com.ss.android.ugc.aweme.w.b.a<List<Effect>>> a(@NonNull EffectPlatform effectPlatform, String str) {
        if (PatchProxy.isSupport(new Object[]{effectPlatform, str}, this, f70296a, false, 79932, new Class[]{EffectPlatform.class, String.class}, LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[]{effectPlatform, str}, this, f70296a, false, 79932, new Class[]{EffectPlatform.class, String.class}, LiveData.class);
        }
        b(effectPlatform, str);
        return this.f70299d;
    }
}
