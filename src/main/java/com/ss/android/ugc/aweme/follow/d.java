package com.ss.android.ugc.aweme.follow;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"checkValid", "", "lastViewData", "Lcom/ss/android/ugc/aweme/follow/LastViewData;", "listSize", "", "main_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class d {
    public static final boolean a(@Nullable c cVar, int i) {
        if (cVar != null) {
            int i2 = cVar.f47754b;
            if (i2 >= 0 && i >= i2) {
                return true;
            }
        }
        return false;
    }
}
