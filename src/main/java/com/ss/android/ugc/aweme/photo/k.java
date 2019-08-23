package com.ss.android.ugc.aweme.photo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toPublishOutput", "Lcom/ss/android/ugc/aweme/services/publish/PublishOutput;", "Lcom/ss/android/ugc/aweme/photo/PhotoContext;", "tools.service_release"}, k = 2, mv = {1, 1, 15})
@JvmName
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58551a;

    @NotNull
    public static final PublishOutput a(@NotNull PhotoContext photoContext) {
        PhotoContext photoContext2 = photoContext;
        if (PatchProxy.isSupport(new Object[]{photoContext2}, null, f58551a, true, 63579, new Class[]{PhotoContext.class}, PublishOutput.class)) {
            return (PublishOutput) PatchProxy.accessDispatch(new Object[]{photoContext2}, null, f58551a, true, 63579, new Class[]{PhotoContext.class}, PublishOutput.class);
        }
        Intrinsics.checkParameterIsNotNull(photoContext2, "$this$toPublishOutput");
        return new PublishOutput(photoContext2.mPhotoLocalPath);
    }
}
