package com.bytedance.im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;

public enum StatusCode implements WireEnum {
    OK(0),
    INVALID_TOKEN(1),
    EXPIRED_TOKEN(100),
    INVALID_TICKET(2),
    CONVERSATION_NOT_FOUND(3),
    INVALID_REQUEST(4),
    INVALID_CMD(5),
    SERVER_ERR(6),
    USER_FORBIDDEN(11),
    DEVICE_NOT_BIND(7),
    MESSAGE_ILLEGAL(8),
    USER_ILLEGAL(9),
    USER_NOT_FRIENDS(10),
    USER_SILENCE(12),
    USER_NOT_IN_GROUP(13),
    USER_BANNED_TO_POST(14),
    INTERNAL_ERROR(500);
    
    public static final ProtoAdapter<StatusCode> ADAPTER = null;
    private final int value;

    static final class ProtoAdapter_StatusCode extends EnumAdapter<StatusCode> {
        ProtoAdapter_StatusCode() {
            super(StatusCode.class);
        }

        /* access modifiers changed from: protected */
        public final StatusCode fromValue(int i) {
            return StatusCode.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_StatusCode();
    }

    public static StatusCode fromValue(int i) {
        if (i == 100) {
            return EXPIRED_TOKEN;
        }
        if (i == 500) {
            return INTERNAL_ERROR;
        }
        switch (i) {
            case 0:
                return OK;
            case 1:
                return INVALID_TOKEN;
            case 2:
                return INVALID_TICKET;
            case 3:
                return CONVERSATION_NOT_FOUND;
            case 4:
                return INVALID_REQUEST;
            case 5:
                return INVALID_CMD;
            case 6:
                return SERVER_ERR;
            case e.l /*?: ONE_ARG  (7 int)*/:
                return DEVICE_NOT_BIND;
            case 8:
                return MESSAGE_ILLEGAL;
            case 9:
                return USER_ILLEGAL;
            case 10:
                return USER_NOT_FRIENDS;
            case 11:
                return USER_FORBIDDEN;
            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                return USER_SILENCE;
            case 13:
                return USER_NOT_IN_GROUP;
            case 14:
                return USER_BANNED_TO_POST;
            default:
                return null;
        }
    }

    private StatusCode(int i) {
        this.value = i;
    }
}
