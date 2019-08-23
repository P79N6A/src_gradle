package com.ss.android.ugc.aweme.shortvideo;

import android.support.annotation.Keep;
import com.google.common.a.k;
import com.google.common.a.s;
import com.google.common.a.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.IRecordingStateService;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;

@Keep
public class RecordingStateServiceImpl implements IRecordingStateService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final s<k<IAVStoryService>> mIAVStoryServiceSupplier = t.a(ex.f67626b);

    public boolean isRecording() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 74516, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 74516, new Class[0], Boolean.TYPE)).booleanValue();
        }
        k kVar = (k) this.mIAVStoryServiceSupplier.get();
        if (kVar.isPresent()) {
            z = ((IAVStoryService) kVar.get()).isStoryRecording();
        }
        return z;
    }
}
