package com.ss.android.ugc.aweme.story.shootvideo.record.base;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/CameraState;", "", "(Ljava/lang/String;I)V", "STATE_OPEN", "STATE_OPEN_FAILED", "STATE_CHANGED", "STATE_CLOSED", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public enum b {
    STATE_OPEN,
    STATE_OPEN_FAILED,
    STATE_CHANGED,
    STATE_CLOSED;
    
    public static ChangeQuickRedirect changeQuickRedirect;
}
