package com.ss.android.ugc.aweme.services.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.cc;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/services/video/VideoModelCoverServiceImpl;", "Lcom/ss/android/ugc/aweme/services/video/IVideoModelCoverService;", "()V", "converToExposureData", "Lcom/ss/android/ugc/aweme/services/video/VideoExposureData;", "any", "", "convertFromDraft", "Ljava/io/Serializable;", "awemeDraft", "Lcom/ss/android/ugc/aweme/draft/model/AwemeDraft;", "instanceOfVideoPublishEditModel", "", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VideoModelCoverServiceImpl implements IVideoModelCoverService {
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Lazy INSTANCE$delegate = LazyKt.lazy(VideoModelCoverServiceImpl$Companion$INSTANCE$2.INSTANCE);
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/services/video/VideoModelCoverServiceImpl$Companion;", "", "()V", "INSTANCE", "Lcom/ss/android/ugc/aweme/services/video/VideoModelCoverServiceImpl;", "INSTANCE$annotations", "getINSTANCE", "()Lcom/ss/android/ugc/aweme/services/video/VideoModelCoverServiceImpl;", "INSTANCE$delegate", "Lkotlin/Lazy;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/services/video/VideoModelCoverServiceImpl;"))};
        public static ChangeQuickRedirect changeQuickRedirect;

        @JvmStatic
        public static /* synthetic */ void INSTANCE$annotations() {
        }

        @NotNull
        public final VideoModelCoverServiceImpl getINSTANCE() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71632, new Class[0], VideoModelCoverServiceImpl.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71632, new Class[0], VideoModelCoverServiceImpl.class);
            } else {
                value = VideoModelCoverServiceImpl.INSTANCE$delegate.getValue();
            }
            return (VideoModelCoverServiceImpl) value;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    public static final VideoModelCoverServiceImpl getINSTANCE() {
        return PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 71631, new Class[0], VideoModelCoverServiceImpl.class) ? (VideoModelCoverServiceImpl) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 71631, new Class[0], VideoModelCoverServiceImpl.class) : Companion.getINSTANCE();
    }

    private VideoModelCoverServiceImpl() {
    }

    public /* synthetic */ VideoModelCoverServiceImpl(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean instanceOfVideoPublishEditModel(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof cb;
    }

    @NotNull
    public final Serializable convertFromDraft(@NotNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 71629, new Class[]{c.class}, Serializable.class)) {
            return (Serializable) PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 71629, new Class[]{c.class}, Serializable.class);
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "awemeDraft");
        cb a2 = new cc("VideoModelCoverServiceImpl").a(cVar2);
        Intrinsics.checkExpressionValueIsNotNull(a2, "VideoPublishEditModelBri…vertFromDraft(awemeDraft)");
        return a2;
    }

    @NotNull
    public final VideoExposureData converToExposureData(@NotNull Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, changeQuickRedirect, false, 71630, new Class[]{Object.class}, VideoExposureData.class)) {
            return (VideoExposureData) PatchProxy.accessDispatch(new Object[]{obj2}, this, changeQuickRedirect, false, 71630, new Class[]{Object.class}, VideoExposureData.class);
        }
        Intrinsics.checkParameterIsNotNull(obj2, "any");
        cb cbVar = (cb) obj2;
        String str = cbVar.mPath;
        Intrinsics.checkExpressionValueIsNotNull(str, "any.mPath");
        float f2 = cbVar.mVideoCoverStartTm;
        String str2 = cbVar.mainBusinessData;
        String str3 = cbVar.mOutputFile;
        Intrinsics.checkExpressionValueIsNotNull(str3, "any.mOutputFile");
        String inputVideoFile = cbVar.getInputVideoFile();
        Intrinsics.checkExpressionValueIsNotNull(inputVideoFile, "any.inputVideoFile");
        String str4 = cbVar.creationId;
        if (str4 == null) {
            str4 = UUID.randomUUID().toString();
            Intrinsics.checkExpressionValueIsNotNull(str4, "UUID.randomUUID().toString()");
        }
        VideoExposureData videoExposureData = new VideoExposureData(str, f2, str2, str3, inputVideoFile, str4, cbVar.isSaveLocal(), cbVar.getLocalFinalPath(), cbVar.mSaveModel, cbVar.mOrigin, cbVar.getDraftPrimaryKey());
        return videoExposureData;
    }
}
