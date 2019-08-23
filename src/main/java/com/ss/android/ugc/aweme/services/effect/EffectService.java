package com.ss.android.ugc.aweme.services.effect;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.m;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.presenter.a;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;

public class EffectService implements IEffectService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public String getLiveStickerPannel() {
        return "livestreaming";
    }

    public ArrayList<String> getDraftEffectList() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71523, new Class[0], ArrayList.class)) {
            return EffectPlatform.g();
        }
        return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71523, new Class[0], ArrayList.class);
    }

    public String getCacheDir() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71520, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71520, new Class[0], String.class);
        } else if (PatchProxy.isSupport(new Object[0], null, EffectPlatform.f3091a, true, 38912, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, EffectPlatform.f3091a, true, 38912, new Class[0], String.class);
        } else {
            return EffectPlatform.f3092b.getAbsolutePath();
        }
    }

    public g createEffectPlatform(Context context, String str, OkHttpClient okHttpClient) {
        Context context2 = context;
        String str2 = str;
        OkHttpClient okHttpClient2 = okHttpClient;
        if (!PatchProxy.isSupport(new Object[]{context2, str2, okHttpClient2}, this, changeQuickRedirect, false, 71521, new Class[]{Context.class, String.class, OkHttpClient.class}, g.class)) {
            return new EffectPlatform(context2, str2, okHttpClient2);
        }
        return (g) PatchProxy.accessDispatch(new Object[]{context2, str2, okHttpClient2}, this, changeQuickRedirect, false, 71521, new Class[]{Context.class, String.class, OkHttpClient.class}, g.class);
    }

    public void getVideoCoverByCallback(@NonNull String str, @NonNull List<EffectPointModel> list, @NonNull String str2, int i, boolean z, int i2, m mVar, @Nullable IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        if (PatchProxy.isSupport(new Object[]{str, list, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), mVar, onVideoCoverCallback}, this, changeQuickRedirect, false, 71522, new Class[]{String.class, List.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, m.class, IEffectService.OnVideoCoverCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, list, str2, Integer.valueOf(i), Byte.valueOf(z), Integer.valueOf(i2), mVar, onVideoCoverCallback}, this, changeQuickRedirect, false, 71522, new Class[]{String.class, List.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, m.class, IEffectService.OnVideoCoverCallback.class}, Void.TYPE);
            return;
        }
        a.a(str, list, str2, i, z, i2, mVar, onVideoCoverCallback);
    }
}
