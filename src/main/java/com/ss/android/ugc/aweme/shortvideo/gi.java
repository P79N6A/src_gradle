package com.ss.android.ugc.aweme.shortvideo;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001f\u001a\u00020\bH\u0016J\u0011\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0!¢\u0006\u0002\u0010\"J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\bH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\f¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/StoryBoomModel;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "fps", "", "getFps", "()I", "setFps", "(I)V", "originVideoPath", "", "getOriginVideoPath", "()Ljava/lang/String;", "setOriginVideoPath", "(Ljava/lang/String;)V", "replayTime", "getReplayTime", "setReplayTime", "reverseVideoPath", "getReverseVideoPath", "setReverseVideoPath", "singleDuration", "getSingleDuration", "setSingleDuration", "totalDuration", "getTotalDuration", "setTotalDuration", "describeContents", "getVideoList", "", "()[Ljava/lang/String;", "writeToParcel", "", "flags", "CREATOR", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class gi implements Parcelable, Serializable {
    public static final a CREATOR = new a((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    private int fps;
    @Nullable
    private String originVideoPath;
    private int replayTime;
    @Nullable
    private String reverseVideoPath;
    private int singleDuration;
    private int totalDuration;

    @SuppressLint({"SerializableImplementsRule"})
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/StoryBoomModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/aweme/shortvideo/StoryBoomModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/aweme/shortvideo/StoryBoomModel;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Parcelable.Creator<gi> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67932a;

        private a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new gi[i];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2}, this, f67932a, false, 74738, new Class[]{Parcel.class}, gi.class)) {
                return (gi) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f67932a, false, 74738, new Class[]{Parcel.class}, gi.class);
            }
            Intrinsics.checkParameterIsNotNull(parcel2, "parcel");
            return new gi(parcel2);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final int getFps() {
        return this.fps;
    }

    @Nullable
    public final String getOriginVideoPath() {
        return this.originVideoPath;
    }

    public final int getReplayTime() {
        return this.replayTime;
    }

    @Nullable
    public final String getReverseVideoPath() {
        return this.reverseVideoPath;
    }

    public final int getSingleDuration() {
        return this.singleDuration;
    }

    public final int getTotalDuration() {
        return this.totalDuration;
    }

    public gi() {
        this.replayTime = 3;
        this.fps = 20;
    }

    @NotNull
    public final String[] getVideoList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 74736, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 74736, new Class[0], String[].class);
        }
        List arrayList = new ArrayList();
        int i = this.replayTime;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.reverseVideoPath;
            if (str != null) {
                arrayList.add(str);
            }
            String str2 = this.originVideoPath;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void setFps(int i) {
        this.fps = i;
    }

    public final void setOriginVideoPath(@Nullable String str) {
        this.originVideoPath = str;
    }

    public final void setReplayTime(int i) {
        this.replayTime = i;
    }

    public final void setReverseVideoPath(@Nullable String str) {
        this.reverseVideoPath = str;
    }

    public final void setSingleDuration(int i) {
        this.singleDuration = i;
    }

    public final void setTotalDuration(int i) {
        this.totalDuration = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public gi(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.replayTime = parcel.readInt();
        this.fps = parcel.readInt();
        this.singleDuration = parcel.readInt();
        this.totalDuration = parcel.readInt();
        this.originVideoPath = parcel.readString();
        this.reverseVideoPath = parcel.readString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 74737, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 74737, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.replayTime);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.singleDuration);
        parcel.writeInt(this.totalDuration);
        parcel.writeString(this.originVideoPath);
        parcel.writeString(this.reverseVideoPath);
    }
}
