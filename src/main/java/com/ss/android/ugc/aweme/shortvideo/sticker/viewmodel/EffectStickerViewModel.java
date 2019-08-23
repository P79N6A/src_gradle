package com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.k;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.List;

public class EffectStickerViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70266a;

    /* renamed from: b  reason: collision with root package name */
    public String f70267b;

    /* renamed from: c  reason: collision with root package name */
    public EffectPlatform f70268c;

    /* renamed from: d  reason: collision with root package name */
    public MutableLiveData<a<List<EffectCategoryResponse>>> f70269d;

    /* renamed from: e  reason: collision with root package name */
    public MutableLiveData<a<PanelInfoModel>> f70270e;

    /* renamed from: f  reason: collision with root package name */
    private MutableLiveData<List<String>> f70271f;

    public final MutableLiveData<List<String>> a() {
        if (PatchProxy.isSupport(new Object[0], this, f70266a, false, 79902, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f70266a, false, 79902, new Class[0], MutableLiveData.class);
        }
        if (this.f70271f == null) {
            this.f70271f = new MutableLiveData<>();
        }
        return this.f70271f;
    }

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f70266a, false, 79910, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70266a, false, 79910, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
        if (this.f70268c != null) {
            this.f70268c.destroy();
        }
    }

    public final MutableLiveData<a<PanelInfoModel>> a(EffectPlatform effectPlatform, String str) {
        if (PatchProxy.isSupport(new Object[]{effectPlatform, str}, this, f70266a, false, 79905, new Class[]{EffectPlatform.class, String.class}, MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[]{effectPlatform, str}, this, f70266a, false, 79905, new Class[]{EffectPlatform.class, String.class}, MutableLiveData.class);
        }
        if (this.f70270e == null) {
            this.f70270e = new MutableLiveData<>();
            effectPlatform.a(str, true, "", 0, 0, new k() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70276a;

                public final void a(c cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f70276a, false, 79919, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f70276a, false, 79919, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    EffectStickerViewModel.this.f70270e.setValue(a.a(a.C0799a.ERROR, null));
                }

                public final void a(PanelInfoModel panelInfoModel) {
                    PanelInfoModel panelInfoModel2 = panelInfoModel;
                    if (PatchProxy.isSupport(new Object[]{panelInfoModel2}, this, f70276a, false, 79918, new Class[]{PanelInfoModel.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{panelInfoModel2}, this, f70276a, false, 79918, new Class[]{PanelInfoModel.class}, Void.TYPE);
                        return;
                    }
                    EffectStickerViewModel.this.f70270e.setValue(a.a(a.C0799a.SUCCESS, panelInfoModel2));
                }
            });
        }
        return this.f70270e;
    }

    public final MutableLiveData<a<CategoryEffectModel>> a(EffectPlatform effectPlatform, String str, String str2, int i, int i2, int i3, String str3) {
        EffectPlatform effectPlatform2 = effectPlatform;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{effectPlatform2, str, str4, 0, 0, 0, str3}, this, f70266a, false, 79906, new Class[]{EffectPlatform.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[]{effectPlatform2, str, str4, 0, 0, 0, str3}, this, f70266a, false, 79906, new Class[]{EffectPlatform.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, MutableLiveData.class);
        }
        MutableLiveData<a<CategoryEffectModel>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(a.a(a.C0799a.LOADING, null));
        Observable create = Observable.create(new b(this, effectPlatform2, str4));
        c cVar = new c(this, effectPlatform, str, str2, 0, 0, 0, str3);
        create.flatMap(cVar).observeOn(AndroidSchedulers.mainThread()).subscribe(new d(mutableLiveData), new e(mutableLiveData));
        return mutableLiveData;
    }
}
