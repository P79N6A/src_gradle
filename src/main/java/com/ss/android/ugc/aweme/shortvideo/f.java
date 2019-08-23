package com.ss.android.ugc.aweme.shortvideo;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/AVMusicWaveBean;", "Ljava/io/Serializable;", "()V", "musicLength", "", "getMusicLength", "()J", "setMusicLength", "(J)V", "musicWavePointArray", "", "getMusicWavePointArray", "()[F", "setMusicWavePointArray", "([F)V", "videoLenght", "getVideoLenght", "setVideoLenght", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class f implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("music_length")
    private long musicLength;
    @SerializedName("music_wave_ary")
    @NotNull
    private float[] musicWavePointArray = new float[0];
    @SerializedName("video_length")
    private long videoLenght;

    public final long getMusicLength() {
        return this.musicLength;
    }

    @NotNull
    public final float[] getMusicWavePointArray() {
        return this.musicWavePointArray;
    }

    public final long getVideoLenght() {
        return this.videoLenght;
    }

    public final void setMusicLength(long j) {
        this.musicLength = j;
    }

    public final void setVideoLenght(long j) {
        this.videoLenght = j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMusicWavePointArray(@org.jetbrains.annotations.NotNull float[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<float[]> r3 = float[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 73901(0x120ad, float:1.03557E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 73901(0x120ad, float:1.03557E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<float[]> r0 = float[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            java.lang.String r1 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            r1 = r17
            r1.musicWavePointArray = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.f.setMusicWavePointArray(float[]):void");
    }
}
