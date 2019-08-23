package com.ss.android.ugc.aweme.services;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&J`\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0003H&¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/services/ISDKService;", "", "checkAudioFile", "", "path", "", "initVideoToGraph", "", "videoPath", "rencodeAndSplitFile", "inVideo", "outVideo", "outWAV", "width", "height", "screenWidth", "inPoint", "", "outPoint", "rotateAngle", "minDurationMs", "isCpuEncode", "", "uninitVideoToGraph", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface ISDKService {
    int checkAudioFile(@NotNull String str);

    @NotNull
    int[] initVideoToGraph(@NotNull String str);

    int rencodeAndSplitFile(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, int i3, long j, long j2, int i4, int i5, boolean z);

    int uninitVideoToGraph();
}
