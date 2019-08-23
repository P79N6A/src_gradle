package com.ss.android.ugc.aweme.shortvideo.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.z;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"findLastDoorplateLevelPoi", "Lcom/ss/android/ugc/aweme/shortvideo/ui/StickerPoi;", "segments", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/shortvideo/ui/TimeSpeedModelExtension;", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class StickerPoiUtilsKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Nullable
    public static final z findLastDoorplateLevelPoi(@NotNull ArrayList<TimeSpeedModelExtension> arrayList) {
        Object obj;
        boolean z;
        ArrayList<TimeSpeedModelExtension> arrayList2 = arrayList;
        if (PatchProxy.isSupport(new Object[]{arrayList2}, null, changeQuickRedirect, true, 77673, new Class[]{ArrayList.class}, z.class)) {
            return (z) PatchProxy.accessDispatch(new Object[]{arrayList2}, null, changeQuickRedirect, true, 77673, new Class[]{ArrayList.class}, z.class);
        }
        Intrinsics.checkParameterIsNotNull(arrayList2, "segments");
        List list = arrayList2;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            z stickerPoi = ((TimeSpeedModelExtension) obj).getStickerPoi();
            if (stickerPoi != null) {
                z = stickerPoi.isDoorplateLevel();
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) obj;
        if (timeSpeedModelExtension != null) {
            return timeSpeedModelExtension.getStickerPoi();
        }
        return null;
    }
}
