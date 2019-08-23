package com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

public final /* synthetic */ class c implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70311a;

    /* renamed from: b  reason: collision with root package name */
    private final EffectStickerViewModel f70312b;

    /* renamed from: c  reason: collision with root package name */
    private final EffectPlatform f70313c;

    /* renamed from: d  reason: collision with root package name */
    private final String f70314d;

    /* renamed from: e  reason: collision with root package name */
    private final String f70315e;

    /* renamed from: f  reason: collision with root package name */
    private final int f70316f;
    private final int g;
    private final int h;
    private final String i;

    c(EffectStickerViewModel effectStickerViewModel, EffectPlatform effectPlatform, String str, String str2, int i2, int i3, int i4, String str3) {
        this.f70312b = effectStickerViewModel;
        this.f70313c = effectPlatform;
        this.f70314d = str;
        this.f70315e = str2;
        this.f70316f = i2;
        this.g = i3;
        this.h = i4;
        this.i = str3;
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70311a, false, 79912, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f70311a, false, 79912, new Class[]{Object.class}, Object.class);
        }
        f fVar = new f(this.f70312b, this.f70313c, this.f70314d, this.f70315e, (Boolean) obj, this.f70316f, this.g, this.h, this.i);
        return Observable.create(fVar);
    }
}
