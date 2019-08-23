package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.upload.ITTUploaderConfigService;
import com.ss.android.ugc.aweme.services.upload.UploadVideoType;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/TTUploaderConfigServiceImpl;", "Lcom/ss/android/ugc/aweme/services/upload/ITTUploaderConfigService;", "()V", "getVideoCreation", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/ss/android/ugc/aweme/shortvideo/model/VideoCreation;", "uploadVideoType", "Lcom/ss/android/ugc/aweme/services/upload/UploadVideoType;", "params", "Ljava/util/LinkedHashMap;", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class gv implements ITTUploaderConfigService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68011a;

    @NotNull
    public final q<VideoCreation> getVideoCreation(@NotNull UploadVideoType uploadVideoType, @NotNull LinkedHashMap<String, String> linkedHashMap) {
        UploadVideoType uploadVideoType2 = uploadVideoType;
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        if (PatchProxy.isSupport(new Object[]{uploadVideoType2, linkedHashMap2}, this, f68011a, false, 74769, new Class[]{UploadVideoType.class, LinkedHashMap.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{uploadVideoType2, linkedHashMap2}, this, f68011a, false, 74769, new Class[]{UploadVideoType.class, LinkedHashMap.class}, q.class);
        }
        Intrinsics.checkParameterIsNotNull(uploadVideoType2, "uploadVideoType");
        Intrinsics.checkParameterIsNotNull(linkedHashMap2, "params");
        q<VideoCreation> a2 = new TTUploaderService(uploadVideoType.getVideoType()).a(linkedHashMap2);
        Intrinsics.checkExpressionValueIsNotNull(a2, "TTUploaderService(upload…loadAuthKeyConfig(params)");
        return a2;
    }
}
