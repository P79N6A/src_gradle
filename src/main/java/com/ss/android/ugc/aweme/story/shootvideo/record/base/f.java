package com.ss.android.ugc.aweme.story.shootvideo.record.base;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/RecordState;", "", "(Ljava/lang/String;I)V", "RECORD_IDLE", "START_RECORD", "STOP_RECORD", "END_RECORD", "START_CONCAT", "CONCAT_FINISH", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public enum f {
    RECORD_IDLE,
    START_RECORD,
    STOP_RECORD,
    END_RECORD,
    START_CONCAT,
    CONCAT_FINISH;
    
    public static ChangeQuickRedirect changeQuickRedirect;
}