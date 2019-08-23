package com.ss.android.ugc.aweme.shortvideo.record;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/record/DTTabConfig;", "", "nameResId", "", "tagResId", "(Ljava/lang/String;III)V", "getNameResId", "()I", "getTagResId", "PHOTO_SHORT", "RECORD_CLICK", "RECORD_NORMAL", "RECORD_COMBINE", "RECORD_COMBINE_60", "RECORD_COMBINE_15", "RECORD_MODE_M", "RECORD_LIVE", "RECORD_HUAWEI_SLOW", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public enum g {
    PHOTO_SHORT(C0906R.string.bx8, C0906R.string.bx9),
    RECORD_CLICK(C0906R.string.bwt, C0906R.string.bwu),
    RECORD_NORMAL(C0906R.string.bx6, C0906R.string.bx7),
    RECORD_COMBINE(C0906R.string.bwz, C0906R.string.bwy),
    RECORD_COMBINE_60(C0906R.string.bwm, C0906R.string.bwx),
    RECORD_COMBINE_15(C0906R.string.bwl, C0906R.string.bww),
    RECORD_MODE_M(C0906R.string.bx4, C0906R.string.bx5),
    RECORD_LIVE(C0906R.string.bx2, C0906R.string.bx3),
    RECORD_HUAWEI_SLOW(C0906R.string.ix, C0906R.string.bx1);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int nameResId;
    private final int tagResId;

    public final int getNameResId() {
        return this.nameResId;
    }

    public final int getTagResId() {
        return this.tagResId;
    }

    private g(int i, int i2) {
        this.nameResId = i;
        this.tagResId = i2;
    }
}
