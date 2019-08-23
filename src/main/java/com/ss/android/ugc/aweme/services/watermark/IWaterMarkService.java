package com.ss.android.ugc.aweme.services.watermark;

import com.ss.android.ugc.aweme.aq.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J=\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/services/watermark/IWaterMarkService;", "", "cancelWaterMark", "", "createWaterMarkImages", "", "", "text", "dir", "commonName", "waterPicDir", "leftAlign", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)[Ljava/lang/String;", "waterMark", "waterMarkBuilder", "Lcom/ss/android/ugc/aweme/watermark/WaterMarkBuilder;", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface IWaterMarkService {
    void cancelWaterMark();

    @NotNull
    String[] createWaterMarkImages(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, boolean z);

    void waterMark(@NotNull a aVar);
}
