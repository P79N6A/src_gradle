package com.ss.android.ugc.aweme.services;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.IAVService;

public final /* synthetic */ class AVServiceImpl$$Lambda$5 implements g {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final IAVService.MusicWaveDataListener arg$1;

    AVServiceImpl$$Lambda$5(IAVService.MusicWaveDataListener musicWaveDataListener) {
        this.arg$1 = musicWaveDataListener;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, changeQuickRedirect, false, 71258, new Class[]{i.class}, Object.class)) {
            return AVServiceImpl.lambda$getAvMusicWaveBean$5$AVServiceImpl(this.arg$1, iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, changeQuickRedirect, false, 71258, new Class[]{i.class}, Object.class);
    }
}
