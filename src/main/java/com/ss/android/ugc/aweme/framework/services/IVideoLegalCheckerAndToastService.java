package com.ss.android.ugc.aweme.framework.services;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J=\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032#\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/framework/services/IVideoLegalCheckerAndToastService;", "", "isVideoLengthOrTypeSupportedAndShowErrToast", "", "videoPath", "", "isShowErrToast", "onError", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "errCode", "", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface IVideoLegalCheckerAndToastService {
    boolean isVideoLengthOrTypeSupportedAndShowErrToast(@NotNull String str, boolean z);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(@NotNull String str, boolean z, @Nullable Function1<? super Integer, Unit> function1);
}
