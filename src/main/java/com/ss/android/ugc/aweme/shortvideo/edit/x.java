package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/StoryFastImportVideoSizeProvider;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/FastImportVideoSizeProvider;", "editModel", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "(Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;)V", "getCanvasVideoHeight", "", "getCanvasVideoWidth", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class x extends l {
    public static ChangeQuickRedirect h;

    public final int d() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76311, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 76311, new Class[0], Integer.TYPE)).intValue();
        }
        h();
        return this.f67456e;
    }

    public final int e() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76312, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 76312, new Class[0], Integer.TYPE)).intValue();
        }
        h();
        return this.f67457f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(@NotNull cb cbVar) {
        super(cbVar);
        Intrinsics.checkParameterIsNotNull(cbVar, "editModel");
    }
}
