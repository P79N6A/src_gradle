package com.ss.android.ugc.aweme.shortvideo.edit;

import a.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0015\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/ReverseVideoGenerator;", "", "cancelReverse", "", "getReversedAudioPaths", "", "", "()[Ljava/lang/String;", "getReversedVideoPaths", "getTempVideoPaths", "isReversedVideoReady", "", "prepare", "Lbolts/Task;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface u {
    @NotNull
    i<Boolean> a();

    boolean b();

    @Nullable
    String[] c();

    @Nullable
    String[] d();

    @Nullable
    String[] e();
}
