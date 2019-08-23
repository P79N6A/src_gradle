package com.ss.android.ugc.aweme.music.ui;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.concurrent.Callable;

public final /* synthetic */ class q implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56752a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicModel f56753b;

    q(MusicModel musicModel) {
        this.f56753b = musicModel;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f56752a, false, 60347, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f56752a, false, 60347, new Class[0], Object.class);
        }
        MusicModel musicModel = this.f56753b;
        if (TextUtils.isEmpty(musicModel.getMusicId())) {
            return musicModel;
        }
        musicModel.setMusic(MusicApi.a(musicModel.getMusicId(), 0).music);
        musicModel.setStrongBeatUrl(musicModel.getMusic().getStrongBeatUrl());
        return musicModel;
    }
}
