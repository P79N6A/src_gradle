package com.ss.android.ugc.aweme.photomovie;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toPublishOutput", "Lcom/ss/android/ugc/aweme/services/publish/PublishOutput;", "Lcom/ss/android/ugc/aweme/photomovie/PhotoMovieContext;", "tools.service_release"}, k = 2, mv = {1, 1, 15})
@JvmName
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58871a;

    @NotNull
    public static final PublishOutput a(@NotNull PhotoMovieContext photoMovieContext) {
        PhotoMovieContext photoMovieContext2 = photoMovieContext;
        if (PatchProxy.isSupport(new Object[]{photoMovieContext2}, null, f58871a, true, 63918, new Class[]{PhotoMovieContext.class}, PublishOutput.class)) {
            return (PublishOutput) PatchProxy.accessDispatch(new Object[]{photoMovieContext2}, null, f58871a, true, 63918, new Class[]{PhotoMovieContext.class}, PublishOutput.class);
        }
        Intrinsics.checkParameterIsNotNull(photoMovieContext2, "$this$toPublishOutput");
        return new PublishOutput(photoMovieContext2.mFinalVideoTmpPath);
    }
}
