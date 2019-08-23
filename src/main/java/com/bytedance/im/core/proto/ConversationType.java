package com.bytedance.im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ConversationType implements WireEnum {
    ONE_TO_ONE_CHAT(1),
    GROUP_CHAT(2),
    LIVE_CHAT(3);
    
    public static final ProtoAdapter<ConversationType> ADAPTER = null;
    private final int value;

    static final class ProtoAdapter_ConversationType extends EnumAdapter<ConversationType> {
        ProtoAdapter_ConversationType() {
            super(ConversationType.class);
        }

        /* access modifiers changed from: protected */
        public final ConversationType fromValue(int i) {
            return ConversationType.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_ConversationType();
    }

    public static ConversationType fromValue(int i) {
        switch (i) {
            case 1:
                return ONE_TO_ONE_CHAT;
            case 2:
                return GROUP_CHAT;
            case 3:
                return LIVE_CHAT;
            default:
                return null;
        }
    }

    private ConversationType(int i) {
        this.value = i;
    }
}
