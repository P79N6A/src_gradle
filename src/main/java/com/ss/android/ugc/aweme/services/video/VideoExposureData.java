package com.ss.android.ugc.aweme.services.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\"\b\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0010HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0010HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lcom/ss/android/ugc/aweme/services/video/VideoExposureData;", "", "path", "", "videoCoverStartTm", "", "mainBusinessData", "outPutFile", "inputVideoFile", "creationId", "isSaveLocal", "", "localFinalPath", "avUploadSaveModel", "Lcom/ss/android/ugc/aweme/shortvideo/model/AVUploadSaveModel;", "origin", "", "draftPrimaryKey", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/ss/android/ugc/aweme/shortvideo/model/AVUploadSaveModel;ILjava/lang/String;)V", "getAvUploadSaveModel", "()Lcom/ss/android/ugc/aweme/shortvideo/model/AVUploadSaveModel;", "getCreationId", "()Ljava/lang/String;", "getDraftPrimaryKey", "getInputVideoFile", "()Z", "getLocalFinalPath", "getMainBusinessData", "getOrigin", "()I", "getOutPutFile", "getPath", "getVideoCoverStartTm", "()F", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class VideoExposureData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private final AVUploadSaveModel avUploadSaveModel;
    @NotNull
    private final String creationId;
    @Nullable
    private final String draftPrimaryKey;
    @NotNull
    private final String inputVideoFile;
    private final boolean isSaveLocal;
    @Nullable
    private final String localFinalPath;
    @Nullable
    private final String mainBusinessData;
    private final int origin;
    @NotNull
    private final String outPutFile;
    @NotNull
    private final String path;
    private final float videoCoverStartTm;

    public static /* synthetic */ VideoExposureData copy$default(VideoExposureData videoExposureData, String str, float f2, String str2, String str3, String str4, String str5, boolean z, String str6, AVUploadSaveModel aVUploadSaveModel, int i, String str7, int i2, Object obj) {
        VideoExposureData videoExposureData2 = videoExposureData;
        int i3 = i2;
        return videoExposureData.copy((i3 & 1) != 0 ? videoExposureData2.path : str, (i3 & 2) != 0 ? videoExposureData2.videoCoverStartTm : f2, (i3 & 4) != 0 ? videoExposureData2.mainBusinessData : str2, (i3 & 8) != 0 ? videoExposureData2.outPutFile : str3, (i3 & 16) != 0 ? videoExposureData2.inputVideoFile : str4, (i3 & 32) != 0 ? videoExposureData2.creationId : str5, (i3 & 64) != 0 ? videoExposureData2.isSaveLocal : z, (i3 & SearchJediMixFeedAdapter.f42517f) != 0 ? videoExposureData2.localFinalPath : str6, (i3 & 256) != 0 ? videoExposureData2.avUploadSaveModel : aVUploadSaveModel, (i3 & 512) != 0 ? videoExposureData2.origin : i, (i3 & 1024) != 0 ? videoExposureData2.draftPrimaryKey : str7);
    }

    @NotNull
    public final String component1() {
        return this.path;
    }

    public final int component10() {
        return this.origin;
    }

    @Nullable
    public final String component11() {
        return this.draftPrimaryKey;
    }

    public final float component2() {
        return this.videoCoverStartTm;
    }

    @Nullable
    public final String component3() {
        return this.mainBusinessData;
    }

    @NotNull
    public final String component4() {
        return this.outPutFile;
    }

    @NotNull
    public final String component5() {
        return this.inputVideoFile;
    }

    @NotNull
    public final String component6() {
        return this.creationId;
    }

    public final boolean component7() {
        return this.isSaveLocal;
    }

    @Nullable
    public final String component8() {
        return this.localFinalPath;
    }

    @Nullable
    public final AVUploadSaveModel component9() {
        return this.avUploadSaveModel;
    }

    @NotNull
    public final VideoExposureData copy(@NotNull String str, float f2, @Nullable String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @Nullable String str6, @Nullable AVUploadSaveModel aVUploadSaveModel, int i, @Nullable String str7) {
        String str8 = str;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        if (PatchProxy.isSupport(new Object[]{str8, Float.valueOf(f2), str2, str9, str10, str11, Byte.valueOf(z ? (byte) 1 : 0), str6, aVUploadSaveModel, Integer.valueOf(i), str7}, this, changeQuickRedirect, false, 71625, new Class[]{String.class, Float.TYPE, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, AVUploadSaveModel.class, Integer.TYPE, String.class}, VideoExposureData.class)) {
            return (VideoExposureData) PatchProxy.accessDispatch(new Object[]{str8, Float.valueOf(f2), str2, str9, str10, str11, Byte.valueOf(z), str6, aVUploadSaveModel, Integer.valueOf(i), str7}, this, changeQuickRedirect, false, 71625, new Class[]{String.class, Float.TYPE, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, AVUploadSaveModel.class, Integer.TYPE, String.class}, VideoExposureData.class);
        }
        Intrinsics.checkParameterIsNotNull(str8, "path");
        Intrinsics.checkParameterIsNotNull(str9, "outPutFile");
        Intrinsics.checkParameterIsNotNull(str10, "inputVideoFile");
        Intrinsics.checkParameterIsNotNull(str11, "creationId");
        VideoExposureData videoExposureData = new VideoExposureData(str, f2, str2, str3, str4, str5, z, str6, aVUploadSaveModel, i, str7);
        return videoExposureData;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 71628, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 71628, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof VideoExposureData) {
                VideoExposureData videoExposureData = (VideoExposureData) obj;
                if (Intrinsics.areEqual((Object) this.path, (Object) videoExposureData.path) && Float.compare(this.videoCoverStartTm, videoExposureData.videoCoverStartTm) == 0 && Intrinsics.areEqual((Object) this.mainBusinessData, (Object) videoExposureData.mainBusinessData) && Intrinsics.areEqual((Object) this.outPutFile, (Object) videoExposureData.outPutFile) && Intrinsics.areEqual((Object) this.inputVideoFile, (Object) videoExposureData.inputVideoFile) && Intrinsics.areEqual((Object) this.creationId, (Object) videoExposureData.creationId)) {
                    if ((this.isSaveLocal == videoExposureData.isSaveLocal) && Intrinsics.areEqual((Object) this.localFinalPath, (Object) videoExposureData.localFinalPath) && Intrinsics.areEqual((Object) this.avUploadSaveModel, (Object) videoExposureData.avUploadSaveModel)) {
                        if (!(this.origin == videoExposureData.origin) || !Intrinsics.areEqual((Object) this.draftPrimaryKey, (Object) videoExposureData.draftPrimaryKey)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71627, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71627, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.path;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Float.floatToIntBits(this.videoCoverStartTm)) * 31;
        String str2 = this.mainBusinessData;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.outPutFile;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.inputVideoFile;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.creationId;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.isSaveLocal;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        String str6 = this.localFinalPath;
        int hashCode6 = (i2 + (str6 != null ? str6.hashCode() : 0)) * 31;
        AVUploadSaveModel aVUploadSaveModel = this.avUploadSaveModel;
        int hashCode7 = (((hashCode6 + (aVUploadSaveModel != null ? aVUploadSaveModel.hashCode() : 0)) * 31) + this.origin) * 31;
        String str7 = this.draftPrimaryKey;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71626, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71626, new Class[0], String.class);
        }
        return "VideoExposureData(path=" + this.path + ", videoCoverStartTm=" + this.videoCoverStartTm + ", mainBusinessData=" + this.mainBusinessData + ", outPutFile=" + this.outPutFile + ", inputVideoFile=" + this.inputVideoFile + ", creationId=" + this.creationId + ", isSaveLocal=" + this.isSaveLocal + ", localFinalPath=" + this.localFinalPath + ", avUploadSaveModel=" + this.avUploadSaveModel + ", origin=" + this.origin + ", draftPrimaryKey=" + this.draftPrimaryKey + ")";
    }

    @Nullable
    public final AVUploadSaveModel getAvUploadSaveModel() {
        return this.avUploadSaveModel;
    }

    @NotNull
    public final String getCreationId() {
        return this.creationId;
    }

    @Nullable
    public final String getDraftPrimaryKey() {
        return this.draftPrimaryKey;
    }

    @NotNull
    public final String getInputVideoFile() {
        return this.inputVideoFile;
    }

    @Nullable
    public final String getLocalFinalPath() {
        return this.localFinalPath;
    }

    @Nullable
    public final String getMainBusinessData() {
        return this.mainBusinessData;
    }

    public final int getOrigin() {
        return this.origin;
    }

    @NotNull
    public final String getOutPutFile() {
        return this.outPutFile;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final float getVideoCoverStartTm() {
        return this.videoCoverStartTm;
    }

    public final boolean isSaveLocal() {
        return this.isSaveLocal;
    }

    public VideoExposureData(@NotNull String str, float f2, @Nullable String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @Nullable String str6, @Nullable AVUploadSaveModel aVUploadSaveModel, int i, @Nullable String str7) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        Intrinsics.checkParameterIsNotNull(str3, "outPutFile");
        Intrinsics.checkParameterIsNotNull(str4, "inputVideoFile");
        Intrinsics.checkParameterIsNotNull(str5, "creationId");
        this.path = str;
        this.videoCoverStartTm = f2;
        this.mainBusinessData = str2;
        this.outPutFile = str3;
        this.inputVideoFile = str4;
        this.creationId = str5;
        this.isSaveLocal = z;
        this.localFinalPath = str6;
        this.avUploadSaveModel = aVUploadSaveModel;
        this.origin = i;
        this.draftPrimaryKey = str7;
    }
}
