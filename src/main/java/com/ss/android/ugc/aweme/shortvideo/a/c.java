package com.ss.android.ugc.aweme.shortvideo.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/WorkSpace/WorkSpaceGenerator;", "", "()V", "generateWorkspace", "Lcom/ss/android/ugc/aweme/shortvideo/WorkSpace/Workspace;", "model", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65440a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f65441b = new c();

    private c() {
    }

    @NotNull
    public final d a(@NotNull cb cbVar) {
        cb cbVar2 = cbVar;
        if (PatchProxy.isSupport(new Object[]{cbVar2}, this, f65440a, false, 74928, new Class[]{cb.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{cbVar2}, this, f65440a, false, 74928, new Class[]{cb.class}, d.class);
        }
        Intrinsics.checkParameterIsNotNull(cbVar2, "model");
        if (cbVar2.previewConfigure == null) {
            d a2 = d.a(cbVar2.mPath, cbVar2.mWavFile, cbVar2.mMusicPath, cbVar2.mReversePath, cbVar2.mOutPutWavFile);
            Intrinsics.checkExpressionValueIsNotNull(a2, "Workspace.createOldFromD…    model.mOutPutWavFile)");
            return a2;
        }
        d a3 = d.a(null, null, cbVar2.mMusicPath, cbVar2.mReversePath, cbVar2.mOutPutWavFile);
        Intrinsics.checkExpressionValueIsNotNull(a3, "Workspace.createOldFromD…    model.mOutPutWavFile)");
        return a3;
    }
}
