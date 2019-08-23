package com.tt.miniapphost.permission;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;

public enum AppbrandPermissionType {
    PERMISSION_USER_INFO(11),
    PERMISSION_LOCATION(12),
    PERMISSION_RECORD_AUDIO(13),
    PERMISSION_CAMERA(14),
    PERMISSION_ADDRESS(15),
    PERMISSION_PHONE_NUMBER(16),
    PERMISSION_ALBUM(17);
    
    private int mData;

    public final int getmData() {
        return this.mData;
    }

    public final void setmData(int i) {
        this.mData = i;
    }

    public static AppbrandPermissionType getTypeFromInt(int i) {
        switch (i) {
            case 11:
                return PERMISSION_USER_INFO;
            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                return PERMISSION_LOCATION;
            case 13:
                return PERMISSION_RECORD_AUDIO;
            case 14:
                return PERMISSION_CAMERA;
            case 15:
                return PERMISSION_ADDRESS;
            case SearchJediMixFeedAdapter.f42514c:
                return PERMISSION_PHONE_NUMBER;
            case 17:
                return PERMISSION_ALBUM;
            default:
                return PERMISSION_USER_INFO;
        }
    }

    private AppbrandPermissionType(int i) {
        this.mData = i;
    }
}
