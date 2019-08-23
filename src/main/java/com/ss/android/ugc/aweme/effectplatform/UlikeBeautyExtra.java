package com.ss.android.ugc.aweme.effectplatform;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006XD¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b$\u0010\u000bR\u001a\u0010%\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b&\u0010\u000bR\u001a\u0010'\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b(\u0010\u000bR\u001a\u0010)\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b*\u0010\u000b¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/effectplatform/UlikeBeautyExtra;", "", "()V", "abGroup", "", "getAbGroup", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "blushDefault", "", "getBlushDefault", "()Ljava/lang/Float;", "Ljava/lang/Float;", "blushMax", "getBlushMax", "eyeDefault", "getEyeDefault", "eyeMax", "getEyeMax", "faceDefault", "getFaceDefault", "faceMax", "getFaceMax", "gender", "", "getGender", "()Ljava/lang/String;", "lipstickDefault", "getLipstickDefault", "lipstickMax", "getLipstickMax", "resourceType", "getResourceType", "setResourceType", "(Ljava/lang/String;)V", "sharpDefault", "getSharpDefault", "sharpMax", "getSharpMax", "skinDefault", "getSkinDefault", "skinMax", "getSkinMax", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UlikeBeautyExtra {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ab_group")
    @Nullable
    private final Integer abGroup = 0;
    @SerializedName("blush_default")
    @Nullable
    private final Float blushDefault;
    @SerializedName("blush_max")
    @Nullable
    private final Float blushMax;
    @SerializedName("eye_default")
    @Nullable
    private final Float eyeDefault;
    @SerializedName("eye_max")
    @Nullable
    private final Float eyeMax;
    @SerializedName("face_default")
    @Nullable
    private final Float faceDefault;
    @SerializedName("face_max")
    @Nullable
    private final Float faceMax;
    @NotNull
    private final String gender = PushConstants.PUSH_TYPE_NOTIFY;
    @SerializedName("lipstick_default")
    @Nullable
    private final Float lipstickDefault;
    @SerializedName("lipstick_max")
    @Nullable
    private final Float lipstickMax;
    @NotNull
    private String resourceType = PushConstants.PUSH_TYPE_NOTIFY;
    @SerializedName("sharp_default")
    @Nullable
    private final Float sharpDefault;
    @SerializedName("sharp_max")
    @Nullable
    private final Float sharpMax;
    @SerializedName("skin_default")
    @Nullable
    private final Float skinDefault;
    @SerializedName("skin_max")
    @Nullable
    private final Float skinMax;

    @Nullable
    public final Integer getAbGroup() {
        return this.abGroup;
    }

    @Nullable
    public final Float getBlushDefault() {
        return this.blushDefault;
    }

    @Nullable
    public final Float getBlushMax() {
        return this.blushMax;
    }

    @Nullable
    public final Float getEyeDefault() {
        return this.eyeDefault;
    }

    @Nullable
    public final Float getEyeMax() {
        return this.eyeMax;
    }

    @Nullable
    public final Float getFaceDefault() {
        return this.faceDefault;
    }

    @Nullable
    public final Float getFaceMax() {
        return this.faceMax;
    }

    @NotNull
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    public final Float getLipstickDefault() {
        return this.lipstickDefault;
    }

    @Nullable
    public final Float getLipstickMax() {
        return this.lipstickMax;
    }

    @NotNull
    public final String getResourceType() {
        return this.resourceType;
    }

    @Nullable
    public final Float getSharpDefault() {
        return this.sharpDefault;
    }

    @Nullable
    public final Float getSharpMax() {
        return this.sharpMax;
    }

    @Nullable
    public final Float getSkinDefault() {
        return this.skinDefault;
    }

    @Nullable
    public final Float getSkinMax() {
        return this.skinMax;
    }

    public final void setResourceType(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 39014, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 39014, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.resourceType = str2;
    }
}
