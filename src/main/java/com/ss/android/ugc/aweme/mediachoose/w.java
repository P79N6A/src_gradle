package com.ss.android.ugc.aweme.mediachoose;

import com.ss.android.ugc.aweme.music.b.a.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J©\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u001426\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00100\u00172K\u0010\u001b\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00100\u001cH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0005\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/mediachoose/VideoLegalChecker;", "", "checkerType", "", "getCheckerType", "()Ljava/lang/String;", "enterFrom", "getEnterFrom", "setEnterFrom", "(Ljava/lang/String;)V", "isLoadingDialogEnable", "", "()Z", "setLoadingDialogEnable", "(Z)V", "isCanImport", "", "mediaModel", "Lcom/ss/android/ugc/aweme/music/mediachoose/helper/MediaModel;", "minDuration", "", "maxDuration", "onSuccess", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "costTime", "onError", "Lkotlin/Function3;", "", "errorCode", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface w {
    void a(@NotNull a aVar, long j, long j2, @NotNull Function2<? super String, ? super Long, Unit> function2, @NotNull Function3<? super String, ? super Long, ? super Integer, Unit> function3);

    void a(@NotNull String str);

    void a(boolean z);
}
