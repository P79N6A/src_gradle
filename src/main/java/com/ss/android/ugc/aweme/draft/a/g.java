package com.ss.android.ugc.aweme.draft.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ja\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u00020\u000eHÖ\u0001R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00066"}, d2 = {"Lcom/ss/android/ugc/aweme/draft/model/DraftPreviewConfigure;", "", "previewWidth", "", "previewHeight", "videoSegments", "", "Lcom/ss/android/ugc/aweme/draft/model/DraftVideoSegment;", "mVolume", "", "mFps", "sceneIn", "sceneOut", "draftDir", "", "(IILjava/util/List;FIIILjava/lang/String;)V", "getDraftDir", "()Ljava/lang/String;", "setDraftDir", "(Ljava/lang/String;)V", "getMFps", "()I", "setMFps", "(I)V", "getMVolume", "()F", "setMVolume", "(F)V", "getPreviewHeight", "setPreviewHeight", "getPreviewWidth", "setPreviewWidth", "getSceneIn", "setSceneIn", "getSceneOut", "setSceneOut", "getVideoSegments", "()Ljava/util/List;", "setVideoSegments", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43444a;
    @SerializedName("preview_width")

    /* renamed from: b  reason: collision with root package name */
    public int f43445b;
    @SerializedName("preview_height")

    /* renamed from: c  reason: collision with root package name */
    public int f43446c;
    @SerializedName("video_segment_list")
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public List<j> f43447d;
    @SerializedName("volume")

    /* renamed from: e  reason: collision with root package name */
    public float f43448e;
    @SerializedName("fps")

    /* renamed from: f  reason: collision with root package name */
    public int f43449f;
    @SerializedName("scene_in")
    public int g;
    @SerializedName("scene_out")
    public int h;
    @SerializedName("draftDir")
    @Nullable
    public String i;

    public g() {
        this(0, 0, null, 0.0f, 0, 0, 0, null, 255);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43444a, false, 38495, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f43444a, false, 38495, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.f43445b == gVar.f43445b) {
                    if ((this.f43446c == gVar.f43446c) && Intrinsics.areEqual((Object) this.f43447d, (Object) gVar.f43447d) && Float.compare(this.f43448e, gVar.f43448e) == 0) {
                        if (this.f43449f == gVar.f43449f) {
                            if (this.g == gVar.g) {
                                if (!(this.h == gVar.h) || !Intrinsics.areEqual((Object) this.i, (Object) gVar.i)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f43444a, false, 38494, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43444a, false, 38494, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = ((this.f43445b * 31) + this.f43446c) * 31;
        List<j> list = this.f43447d;
        int hashCode = (((((((((i3 + (list != null ? list.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f43448e)) * 31) + this.f43449f) * 31) + this.g) * 31) + this.h) * 31;
        String str = this.i;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f43444a, false, 38493, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f43444a, false, 38493, new Class[0], String.class);
        }
        return "DraftPreviewConfigure(previewWidth=" + this.f43445b + ", previewHeight=" + this.f43446c + ", videoSegments=" + this.f43447d + ", mVolume=" + this.f43448e + ", mFps=" + this.f43449f + ", sceneIn=" + this.g + ", sceneOut=" + this.h + ", draftDir=" + this.i + ")";
    }

    public final void a(@NotNull List<j> list) {
        List<j> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f43444a, false, 38491, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f43444a, false, 38491, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "<set-?>");
        this.f43447d = list2;
    }

    private g(int i2, int i3, @NotNull List<j> list, float f2, int i4, int i5, int i6, @Nullable String str) {
        Intrinsics.checkParameterIsNotNull(list, "videoSegments");
        this.f43445b = i2;
        this.f43446c = i3;
        this.f43447d = list;
        this.f43448e = f2;
        this.f43449f = i4;
        this.g = i5;
        this.h = i6;
        this.i = str;
    }

    public /* synthetic */ g(int i2, int i3, List list, float f2, int i4, int i5, int i6, String str, int i7) {
        this(576, 1024, CollectionsKt.emptyList(), 0.0f, -1, 0, 0, null);
    }
}
