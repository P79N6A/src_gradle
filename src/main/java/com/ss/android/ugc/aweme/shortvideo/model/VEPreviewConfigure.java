package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.g;
import com.ss.android.ugc.aweme.draft.a.j;
import com.ss.android.ugc.aweme.shortvideo.fg;
import dmt.av.video.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 02\u00020\u0001:\u00010B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010'\u001a\u00020\u0013H\u0016J\b\u0010(\u001a\u00020)H\u0002J\u0006\u0010*\u001a\u00020\u0007J;\u0010+\u001a\u00020)2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c¢\u0006\u0002\u0010-J\u0018\u0010.\u001a\u00020)2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u0013H\u0016R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001b\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u001b\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR0\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u0005¨\u00061"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/model/VEPreviewConfigure;", "Ldmt/av/video/VEPreviewParams;", "videoSegments", "", "Lcom/ss/android/ugc/aweme/shortvideo/model/VEVideoSegment;", "(Ljava/util/List;)V", "draftPreviewConfigure", "Lcom/ss/android/ugc/aweme/draft/model/DraftPreviewConfigure;", "(Lcom/ss/android/ugc/aweme/draft/model/DraftPreviewConfigure;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "draftDir", "", "getDraftDir", "()Ljava/lang/String;", "setDraftDir", "(Ljava/lang/String;)V", "previewHeight", "", "getPreviewHeight", "()I", "setPreviewHeight", "(I)V", "previewWidth", "getPreviewWidth", "setPreviewWidth", "reverseAudioArray", "", "getReverseAudioArray", "()[Ljava/lang/String;", "reverseVideoArray", "getReverseVideoArray", "tempVideoArray", "getTempVideoArray", "value", "getVideoSegments", "()Ljava/util/List;", "setVideoSegments", "describeContents", "fillArrayData", "", "transform", "updateReverseVideoContent", "tepmVideoArray", "([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "writeToParcel", "flags", "CREATOR", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VEPreviewConfigure extends u {
    public static final CREATOR CREATOR = new CREATOR(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String draftDir;
    private int previewHeight = 1024;
    private int previewWidth = 576;
    @NotNull
    private List<VEVideoSegment> videoSegments = CollectionsKt.emptyList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/model/VEPreviewConfigure$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/ugc/aweme/shortvideo/model/VEPreviewConfigure;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/ugc/aweme/shortvideo/model/VEPreviewConfigure;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class CREATOR implements Parcelable.Creator<VEPreviewConfigure> {
        public static ChangeQuickRedirect changeQuickRedirect;

        private CREATOR() {
        }

        @NotNull
        public final VEPreviewConfigure[] newArray(int i) {
            return new VEPreviewConfigure[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VEPreviewConfigure createFromParcel(@NotNull Parcel parcel) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2}, this, changeQuickRedirect, false, 77689, new Class[]{Parcel.class}, VEPreviewConfigure.class)) {
                return (VEPreviewConfigure) PatchProxy.accessDispatch(new Object[]{parcel2}, this, changeQuickRedirect, false, 77689, new Class[]{Parcel.class}, VEPreviewConfigure.class);
            }
            Intrinsics.checkParameterIsNotNull(parcel2, "parcel");
            return new VEPreviewConfigure(parcel2);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final int getPreviewHeight() {
        return this.previewHeight;
    }

    public final int getPreviewWidth() {
        return this.previewWidth;
    }

    @NotNull
    public final List<VEVideoSegment> getVideoSegments() {
        return this.videoSegments;
    }

    @Nullable
    public final String getDraftDir() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77684, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77684, new Class[0], String.class);
        }
        CharSequence charSequence = this.draftDir;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (z) {
            this.draftDir = fg.h + "fast_import/" + System.currentTimeMillis() + '/';
        }
        return this.draftDir;
    }

    @Nullable
    public final String[] getReverseAudioArray() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77682, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77682, new Class[0], String[].class);
        }
        int size = this.videoSegments.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = null;
        }
        for (Object next : this.videoSegments) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            strArr[i] = ((VEVideoSegment) next).audioPath;
            i = i3;
        }
        if (ArraysKt.filterNotNull(strArr).isEmpty()) {
            return null;
        }
        return strArr;
    }

    @Nullable
    public final String[] getReverseVideoArray() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77681, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77681, new Class[0], String[].class);
        }
        int size = this.videoSegments.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = null;
        }
        for (Object next : this.videoSegments) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            strArr[i] = ((VEVideoSegment) next).reversePath;
            i = i3;
        }
        if (ArraysKt.filterNotNull(strArr).isEmpty()) {
            return null;
        }
        return strArr;
    }

    @Nullable
    public final String[] getTempVideoArray() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77683, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77683, new Class[0], String[].class);
        }
        int size = this.videoSegments.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = null;
        }
        for (Object next : this.videoSegments) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            strArr[i] = ((VEVideoSegment) next).tempVideoPath;
            i = i3;
        }
        if (ArraysKt.filterNotNull(strArr).isEmpty()) {
            return null;
        }
        return strArr;
    }

    private final void fillArrayData() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77687, new Class[0], Void.TYPE);
            return;
        }
        int size = this.videoSegments.size();
        if (size > 0) {
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                strArr[i2] = "";
            }
            this.mVideoPaths = strArr;
            String[] strArr2 = new String[size];
            for (int i3 = 0; i3 < size; i3++) {
                strArr2[i3] = "";
            }
            this.mAudioPaths = strArr2;
            this.speedArray = new float[size];
            this.rotateArray = new int[size];
            this.mVTrimIn = new int[size];
            this.mVTrimOut = new int[size];
            for (Object next : this.videoSegments) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                VEVideoSegment vEVideoSegment = (VEVideoSegment) next;
                this.mVideoPaths[i] = vEVideoSegment.videoPath;
                this.mAudioPaths[i] = vEVideoSegment.audioPath;
                this.speedArray[i] = vEVideoSegment.speed;
                this.rotateArray[i] = vEVideoSegment.rotate;
                this.mVTrimIn[i] = vEVideoSegment.start;
                this.mVTrimOut[i] = vEVideoSegment.getEnd();
                i = i4;
            }
            return;
        }
        this.mVideoPaths = null;
        this.mAudioPaths = null;
        this.speedArray = null;
        this.rotateArray = null;
        this.mVTrimIn = null;
        this.mVTrimOut = null;
    }

    @NotNull
    public final g transform() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77685, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77685, new Class[0], g.class);
        }
        g gVar = new g(0, 0, null, 0.0f, 0, 0, 0, null, 255);
        gVar.i = getDraftDir();
        Iterable<VEVideoSegment> iterable = this.videoSegments;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (VEVideoSegment transform2Draft : iterable) {
            arrayList.add(transform2Draft.transform2Draft());
        }
        gVar.a((List) arrayList);
        gVar.f43446c = this.previewHeight;
        gVar.f43445b = this.previewWidth;
        gVar.g = this.sceneIn;
        gVar.h = this.sceneOut;
        gVar.f43448e = this.mVolume;
        gVar.f43449f = this.mFps;
        return gVar;
    }

    public final void setDraftDir(@Nullable String str) {
        this.draftDir = str;
    }

    public final void setPreviewHeight(int i) {
        this.previewHeight = i;
    }

    public final void setPreviewWidth(int i) {
        this.previewWidth = i;
    }

    public VEPreviewConfigure(@NotNull List<VEVideoSegment> list) {
        Intrinsics.checkParameterIsNotNull(list, "videoSegments");
        setVideoSegments(list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VEPreviewConfigure(@NotNull Parcel parcel) {
        super(parcel);
        List list;
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.draftDir = parcel.readString();
        this.previewWidth = parcel.readInt();
        this.previewHeight = parcel.readInt();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(VEVideoSegment.CREATOR);
        if (createTypedArrayList != null) {
            list = createTypedArrayList;
        } else {
            list = CollectionsKt.emptyList();
        }
        setVideoSegments(list);
    }

    public VEPreviewConfigure(@NotNull g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "draftPreviewConfigure");
        this.draftDir = gVar.i;
        this.previewHeight = gVar.f43446c;
        this.previewWidth = gVar.f43445b;
        Iterable<j> iterable = gVar.f43447d;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (j vEVideoSegment : iterable) {
            arrayList.add(new VEVideoSegment(vEVideoSegment));
        }
        setVideoSegments((List) arrayList);
        this.sceneIn = gVar.g;
        this.sceneOut = gVar.h;
        this.mVolume = gVar.f43448e;
        this.mFps = gVar.f43449f;
    }

    public final void setVideoSegments(@NotNull List<VEVideoSegment> list) {
        List<VEVideoSegment> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 77680, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 77680, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "value");
        this.videoSegments = list2;
        fillArrayData();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 77688, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 77688, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeString(getDraftDir());
        parcel.writeInt(this.previewWidth);
        parcel.writeInt(this.previewHeight);
        parcel.writeTypedList(this.videoSegments);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateReverseVideoContent(@org.jetbrains.annotations.Nullable java.lang.String[] r16, @org.jetbrains.annotations.Nullable java.lang.String[] r17, @org.jetbrains.annotations.Nullable java.lang.String[] r18) {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            r13 = 1
            r0[r13] = r9
            r14 = 2
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r13] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 77686(0x12f76, float:1.08861E-40)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0053
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 77686(0x12f76, float:1.08861E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r13] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0053:
            if (r8 == 0) goto L_0x0074
            int r0 = r8.length
            r1 = 0
            r2 = 0
        L_0x0058:
            if (r1 >= r0) goto L_0x0074
            r3 = r8[r1]
            int r4 = r2 + 1
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment> r5 = r7.videoSegments
            int r5 = r5.size()
            if (r5 <= r2) goto L_0x0070
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment> r5 = r7.videoSegments
            java.lang.Object r2 = r5.get(r2)
            com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment r2 = (com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment) r2
            r2.reversePath = r3
        L_0x0070:
            int r1 = r1 + 1
            r2 = r4
            goto L_0x0058
        L_0x0074:
            if (r9 == 0) goto L_0x0095
            int r0 = r9.length
            r1 = 0
            r2 = 0
        L_0x0079:
            if (r1 >= r0) goto L_0x0095
            r3 = r9[r1]
            int r4 = r2 + 1
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment> r5 = r7.videoSegments
            int r5 = r5.size()
            if (r5 <= r2) goto L_0x0091
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment> r5 = r7.videoSegments
            java.lang.Object r2 = r5.get(r2)
            com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment r2 = (com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment) r2
            r2.audioPath = r3
        L_0x0091:
            int r1 = r1 + 1
            r2 = r4
            goto L_0x0079
        L_0x0095:
            if (r10 == 0) goto L_0x00b6
            int r0 = r10.length
            r1 = 0
        L_0x0099:
            if (r12 >= r0) goto L_0x00b5
            r2 = r10[r12]
            int r3 = r1 + 1
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment> r4 = r7.videoSegments
            int r4 = r4.size()
            if (r4 <= r1) goto L_0x00b1
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment> r4 = r7.videoSegments
            java.lang.Object r1 = r4.get(r1)
            com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment r1 = (com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment) r1
            r1.tempVideoPath = r2
        L_0x00b1:
            int r12 = r12 + 1
            r1 = r3
            goto L_0x0099
        L_0x00b5:
            return
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure.updateReverseVideoContent(java.lang.String[], java.lang.String[], java.lang.String[]):void");
    }
}
