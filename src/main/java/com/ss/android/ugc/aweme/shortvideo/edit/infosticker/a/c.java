package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a;

import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\r\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J%\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H&¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/time/TimeEditable;", "Data", "Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/time/ITimeEditData;", "", "dumpClonedData", "()Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/time/ITimeEditData;", "getEndTime", "", "default", "getStartTime", "loadData", "", "stickerData", "surfaceWidth", "surfaceHeight", "(Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/time/ITimeEditData;II)V", "setAlpha", "enable", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface c<Data extends a> {
    int a(int i);

    void a(@NotNull Data data, int i, int i2);

    int b(int i);

    @NotNull
    Data d();

    void setAlpha(boolean z);
}
