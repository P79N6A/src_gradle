package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class o extends ViewModelProvider.NewInstanceFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70096a;

    /* renamed from: b  reason: collision with root package name */
    static volatile o f70097b;

    /* renamed from: c  reason: collision with root package name */
    private final InfoStickerRepository f70098c;

    private o(InfoStickerRepository infoStickerRepository) {
        this.f70098c = infoStickerRepository;
    }

    public static o a(Application application) {
        if (PatchProxy.isSupport(new Object[]{application}, null, f70096a, true, 79398, new Class[]{Application.class}, o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[]{application}, null, f70096a, true, 79398, new Class[]{Application.class}, o.class);
        }
        if (f70097b == null) {
            synchronized (o.class) {
                f70097b = new o(new InfoStickerRepository(application.getApplicationContext()));
            }
        }
        return f70097b;
    }

    @NonNull
    public <T extends ViewModel> T create(@NonNull Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f70096a, false, 79399, new Class[]{Class.class}, ViewModel.class)) {
            return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls2}, this, f70096a, false, 79399, new Class[]{Class.class}, ViewModel.class);
        } else if (cls2.isAssignableFrom(InfoStickerViewModel.class)) {
            return new InfoStickerViewModel(this.f70098c);
        } else {
            throw new IllegalArgumentException("Unknow ViewModel class: " + cls.getName());
        }
    }
}
