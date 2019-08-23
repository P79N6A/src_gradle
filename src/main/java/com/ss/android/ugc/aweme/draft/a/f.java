package com.ss.android.ugc.aweme.draft.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bB\u000f\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB\u0005¢\u0006\u0002\u0010\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001eH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/draft/model/DraftEditTransferModel;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "primaryKey", "", "createTime", "", "(Ljava/lang/String;J)V", "videoSegment", "", "Lcom/ss/android/ugc/aweme/draft/model/DraftVideoSegment;", "(Ljava/lang/String;JLjava/util/List;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "getCreateTime", "()J", "setCreateTime", "(J)V", "getPrimaryKey", "()Ljava/lang/String;", "setPrimaryKey", "(Ljava/lang/String;)V", "videoSegmentsCopy", "getVideoSegmentsCopy", "()Ljava/util/List;", "setVideoSegmentsCopy", "(Ljava/util/List;)V", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class f implements Parcelable, Serializable {
    public static final a CREATOR = new a((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("create_time")
    private long createTime;
    @SerializedName("primary_key")
    @Nullable
    private String primaryKey;
    @SerializedName("video_segments_copy")
    @Nullable
    private List<j> videoSegmentsCopy;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/draft/model/DraftEditTransferModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/aweme/draft/model/DraftEditTransferModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/aweme/draft/model/DraftEditTransferModel;", "tools.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Parcelable.Creator<f> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43443a;

        private a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new f[i];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2}, this, f43443a, false, 38490, new Class[]{Parcel.class}, f.class)) {
                return (f) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f43443a, false, 38490, new Class[]{Parcel.class}, f.class);
            }
            Intrinsics.checkParameterIsNotNull(parcel2, "parcel");
            return new f(parcel2);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getPrimaryKey() {
        return this.primaryKey;
    }

    @Nullable
    public final List<j> getVideoSegmentsCopy() {
        return this.videoSegmentsCopy;
    }

    public f() {
        this.primaryKey = "";
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setPrimaryKey(@Nullable String str) {
        this.primaryKey = str;
    }

    public final void setVideoSegmentsCopy(@Nullable List<j> list) {
        this.videoSegmentsCopy = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.primaryKey = parcel.readString();
        this.createTime = parcel.readLong();
        this.videoSegmentsCopy = parcel.createTypedArrayList(j.CREATOR);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(@NotNull String str, long j) {
        this();
        Intrinsics.checkParameterIsNotNull(str, "primaryKey");
        this.primaryKey = str;
        this.createTime = j;
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 38489, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 38489, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.primaryKey);
        parcel.writeLong(this.createTime);
        parcel.writeTypedList(this.videoSegmentsCopy);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(@NotNull String str, long j, @Nullable List<j> list) {
        this();
        Intrinsics.checkParameterIsNotNull(str, "primaryKey");
        this.primaryKey = str;
        this.createTime = j;
        this.videoSegmentsCopy = list;
    }
}
