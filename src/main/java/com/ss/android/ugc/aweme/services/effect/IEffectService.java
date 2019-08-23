package com.ss.android.ugc.aweme.services.effect;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.ss.android.ugc.aweme.common.m;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effectplatform.g;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;

public interface IEffectService {

    public interface OnVideoCoverCallback {
        void onGetVideoCoverFailed(int i);

        void onGetVideoCoverSuccess(@NonNull Bitmap bitmap);
    }

    g createEffectPlatform(Context context, String str, OkHttpClient okHttpClient);

    String getCacheDir();

    ArrayList<String> getDraftEffectList();

    String getLiveStickerPannel();

    void getVideoCoverByCallback(@NonNull String str, @NonNull List<EffectPointModel> list, @NonNull String str2, int i, boolean z, int i2, m mVar, @Nullable OnVideoCoverCallback onVideoCoverCallback);
}
