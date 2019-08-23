package com.bytedance.android.livesdk.message.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum LinkmicStatus implements WireEnum {
    DISABLE(0),
    ENABLE(1),
    JUST_FOLLOWING(2);
    
    public static final ProtoAdapter<LinkmicStatus> ADAPTER = null;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = ProtoAdapter.newEnumAdapter(LinkmicStatus.class);
    }

    public static LinkmicStatus fromValue(int i) {
        switch (i) {
            case 0:
                return DISABLE;
            case 1:
                return ENABLE;
            case 2:
                return JUST_FOLLOWING;
            default:
                return null;
        }
    }

    private LinkmicStatus(int i) {
        this.value = i;
    }
}
