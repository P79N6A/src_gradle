package com.bytedance.android.livesdkapi.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;

public enum d {
    UNKNOWN(0, ""),
    STRING(1, "string"),
    USER(11, AllStoryActivity.f73306b),
    GIFT(12, "gift"),
    HEART(13, "heart"),
    PATTERN_REF(14, "pref");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private int pieceType;
    private String tag;

    public final int getPieceType() {
        return this.pieceType;
    }

    public final String getTag() {
        return this.tag;
    }

    private d(int i, String str) {
        this.pieceType = i;
        this.tag = str;
    }
}
