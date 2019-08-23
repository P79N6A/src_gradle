package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.j;
import com.ss.android.ugc.aweme.music.b.a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 <2\u00020\u0001:\u0001<B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\r\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u00105\u001a\u00020\u0013H\u0016J\u0006\u00106\u001a\u000207J\u0006\u00108\u001a\u00020\u0006J\u0018\u00109\u001a\u00020:2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u0013H\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u00020\u00138FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\rR\u001a\u0010!\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u001c\u0010-\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0010\"\u0004\b/\u0010\rR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0010\"\u0004\b1\u0010\rR\u001a\u00102\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u0010\u0017¨\u0006="}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/model/VEVideoSegment;", "Landroid/os/Parcelable;", "videoSegment", "Lcom/ss/android/ugc/aweme/shortvideo/cut/model/VideoSegment;", "(Lcom/ss/android/ugc/aweme/shortvideo/cut/model/VideoSegment;)V", "draftVideoSegment", "Lcom/ss/android/ugc/aweme/draft/model/DraftVideoSegment;", "(Lcom/ss/android/ugc/aweme/draft/model/DraftVideoSegment;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "videoPath", "", "(Ljava/lang/String;)V", "audioPath", "getAudioPath", "()Ljava/lang/String;", "setAudioPath", "duration", "", "getDuration", "()I", "setDuration", "(I)V", "end", "getEnd", "setEnd", "height", "getHeight", "setHeight", "reversePath", "getReversePath", "setReversePath", "rotate", "getRotate", "setRotate", "speed", "", "getSpeed", "()F", "setSpeed", "(F)V", "start", "getStart", "setStart", "tempVideoPath", "getTempVideoPath", "setTempVideoPath", "getVideoPath", "setVideoPath", "width", "getWidth", "setWidth", "describeContents", "transform", "Lcom/ss/android/ugc/aweme/music/mediachoose/helper/MediaModel;", "transform2Draft", "writeToParcel", "", "flags", "CREATOR", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VEVideoSegment implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    public String audioPath;
    public int duration;
    public int end;
    public int height;
    @Nullable
    public String reversePath;
    public int rotate;
    public float speed;
    public int start;
    @Nullable
    public String tempVideoPath;
    @NotNull
    public String videoPath;
    public int width;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/model/VEVideoSegment$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/aweme/shortvideo/model/VEVideoSegment;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/aweme/shortvideo/model/VEVideoSegment;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class CREATOR implements Parcelable.Creator<VEVideoSegment> {
        public static ChangeQuickRedirect changeQuickRedirect;

        private CREATOR() {
        }

        @NotNull
        public final VEVideoSegment[] newArray(int i) {
            return new VEVideoSegment[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VEVideoSegment createFromParcel(@NotNull Parcel parcel) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2}, this, changeQuickRedirect, false, 77698, new Class[]{Parcel.class}, VEVideoSegment.class)) {
                return (VEVideoSegment) PatchProxy.accessDispatch(new Object[]{parcel2}, this, changeQuickRedirect, false, 77698, new Class[]{Parcel.class}, VEVideoSegment.class);
            }
            Intrinsics.checkParameterIsNotNull(parcel2, "parcel");
            return new VEVideoSegment(parcel2);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final int getEnd() {
        if (this.end <= 0) {
            this.end = this.duration;
        }
        return this.end;
    }

    @NotNull
    public final a transform() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77694, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77694, new Class[0], a.class);
        }
        a aVar = new a(-1);
        aVar.f56315e = this.videoPath;
        aVar.l = this.width;
        aVar.m = this.height;
        aVar.h = (long) (((float) this.duration) / this.speed);
        return aVar;
    }

    @NotNull
    public final j transform2Draft() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77695, new Class[0], j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77695, new Class[0], j.class);
        }
        j jVar = new j(this.width, this.height, this.start, getEnd(), this.duration, this.speed, this.rotate, this.videoPath, this.audioPath, this.reversePath, this.tempVideoPath);
        return jVar;
    }

    public VEVideoSegment(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "videoPath");
        this.videoPath = str;
        this.speed = 1.0f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VEVideoSegment(@NotNull j jVar) {
        this(jVar.i);
        Intrinsics.checkParameterIsNotNull(jVar, "draftVideoSegment");
        this.width = jVar.f43457b;
        this.height = jVar.f43458c;
        this.start = jVar.f43459d;
        this.end = jVar.f43460e;
        this.duration = jVar.f43461f;
        this.speed = jVar.g;
        this.rotate = jVar.h;
        this.reversePath = jVar.k;
        this.audioPath = jVar.j;
        this.tempVideoPath = jVar.l;
    }

    public final void setVideoPath(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 77697, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 77697, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.videoPath = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VEVideoSegment(@NotNull Parcel parcel) {
        this(parcel.readString() == null ? "" : parcel.readString());
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.duration = parcel.readInt();
        this.speed = parcel.readFloat();
        this.rotate = parcel.readInt();
        this.audioPath = parcel.readString();
        this.reversePath = parcel.readString();
        this.tempVideoPath = parcel.readString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VEVideoSegment(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.shortvideo.cut.model.h r3) {
        /*
            r2 = this;
            java.lang.String r0 = "videoSegment"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.lang.String r0 = r3.f66495b
            java.lang.String r1 = "videoSegment.path"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r2.<init>((java.lang.String) r0)
            int r0 = r3.g
            r2.width = r0
            int r0 = r3.h
            r2.height = r0
            long r0 = r3.f66497d
            int r0 = (int) r0
            r2.start = r0
            long r0 = r3.f66498e
            int r0 = (int) r0
            r2.end = r0
            long r0 = r3.f66496c
            int r0 = (int) r0
            r2.duration = r0
            float r0 = r3.f66499f
            r2.speed = r0
            int r3 = r3.k
            r2.rotate = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment.<init>(com.ss.android.ugc.aweme.shortvideo.cut.model.h):void");
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 77696, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 77696, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.videoPath);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.start);
        parcel.writeInt(getEnd());
        parcel.writeInt(this.duration);
        parcel.writeFloat(this.speed);
        parcel.writeInt(this.rotate);
        parcel.writeString(this.audioPath);
        parcel.writeString(this.reversePath);
        parcel.writeString(this.tempVideoPath);
    }
}
