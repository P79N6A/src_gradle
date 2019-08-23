package com.taobao.accs;

import com.meizu.cloud.pushsdk.constants.PushConstants;

public class ErrorCode {

    public enum INIT_ERROR {
        NO_NETWORK,
        APPKEY_NULL,
        APPSECRET_NULL,
        APPRECEIVER_NULL,
        REQ_TIME_OUT,
        CONN_INVALID,
        NO_CONNECTTION,
        UNKNOWN_ERROR,
        SERVER_TAIR_ERROR,
        SERVER_DEVICEID_INVALID,
        SERVER_APPKEY_INVALID,
        SERVER_PACKAGENAME_INVALID,
        SUCCESS;

        public final int getErrorCode() {
            return ordinal() + PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        }
    }

    public static boolean isChannelError(int i) {
        return i == -1 || i == -9 || i == -11 || i == -7;
    }

    public static INIT_ERROR convertError(int i) {
        INIT_ERROR init_error = INIT_ERROR.UNKNOWN_ERROR;
        if (i == -301) {
            return INIT_ERROR.CONN_INVALID;
        }
        if (i == -11) {
            return INIT_ERROR.NO_CONNECTTION;
        }
        if (i == 102) {
            return INIT_ERROR.SERVER_TAIR_ERROR;
        }
        if (i == 200) {
            return INIT_ERROR.SUCCESS;
        }
        switch (i) {
            case -16:
                return INIT_ERROR.APPRECEIVER_NULL;
            case -15:
                return INIT_ERROR.APPSECRET_NULL;
            case -14:
                return INIT_ERROR.APPKEY_NULL;
            case -13:
                return INIT_ERROR.NO_NETWORK;
            default:
                switch (i) {
                    case -9:
                        return INIT_ERROR.REQ_TIME_OUT;
                    case -8:
                        return INIT_ERROR.UNKNOWN_ERROR;
                    default:
                        switch (i) {
                            case 302:
                                return INIT_ERROR.SERVER_DEVICEID_INVALID;
                            case 303:
                                return INIT_ERROR.SERVER_APPKEY_INVALID;
                            case 304:
                                return INIT_ERROR.SERVER_PACKAGENAME_INVALID;
                            default:
                                return init_error;
                        }
                }
        }
    }
}
