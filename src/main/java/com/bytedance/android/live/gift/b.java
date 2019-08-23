package com.bytedance.android.live.gift;

import com.meituan.robust.ChangeQuickRedirect;

public enum b {
    UNKNOWN,
    NORMAL_GIFT,
    TASK_GIFT,
    STICKER_GIFT,
    MIDDLE_GIFT,
    SPECIAL_GIFT,
    FREE_CELL,
    GOLDEN_BEAN_CELL;
    
    public static ChangeQuickRedirect changeQuickRedirect;
}
