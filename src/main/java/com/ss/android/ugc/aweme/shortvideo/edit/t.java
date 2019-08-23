package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IPromptService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/PromptServiceImpl;", "Lcom/ss/android/ugc/aweme/framework/services/IPromptService;", "()V", "editPromptShownMusic", "", "show", "", "hasPromptShownMusic", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class t implements IPromptService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67492a;

    public final boolean hasPromptShownMusic() {
        if (PatchProxy.isSupport(new Object[0], this, f67492a, false, 76304, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67492a, false, 76304, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{"music"}, null, s.f67486a, true, 76302, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{"music"}, null, s.f67486a, true, 76302, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull("music", "tag");
        return s.f67487b.a().contains("music");
    }

    public final void editPromptShownMusic(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67492a, false, 76305, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67492a, false, 76305, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        s.a("music", z);
    }
}
