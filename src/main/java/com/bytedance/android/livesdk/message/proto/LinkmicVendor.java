package com.bytedance.android.livesdk.message.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum LinkmicVendor implements WireEnum {
    UNKNOWN(0),
    AGORO(1),
    ZEGO(2),
    BYTE(4);
    
    public static final ProtoAdapter<LinkmicVendor> ADAPTER = null;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = ProtoAdapter.newEnumAdapter(LinkmicVendor.class);
    }

    public static LinkmicVendor fromValue(int i) {
        if (i == 4) {
            return BYTE;
        }
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return AGORO;
            case 2:
                return ZEGO;
            default:
                return null;
        }
    }

    private LinkmicVendor(int i) {
        this.value = i;
    }
}
