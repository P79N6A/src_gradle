package com.bytedance.android.livesdk.message.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;

public enum VerifyAction implements WireEnum {
    UnknowAction(0),
    CloseChat(3),
    OpenChat(4),
    CloseDanmaku(5),
    OpenDanmaku(6),
    CloseGift(7),
    OpenGift(8),
    CloseDigg(12),
    OpenDigg(13);
    
    public static final ProtoAdapter<VerifyAction> ADAPTER = null;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = ProtoAdapter.newEnumAdapter(VerifyAction.class);
    }

    public static VerifyAction fromValue(int i) {
        if (i == 0) {
            return UnknowAction;
        }
        switch (i) {
            case 3:
                return CloseChat;
            case 4:
                return OpenChat;
            case 5:
                return CloseDanmaku;
            case 6:
                return OpenDanmaku;
            case e.l /*?: ONE_ARG  (7 int)*/:
                return CloseGift;
            case 8:
                return OpenGift;
            default:
                switch (i) {
                    case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                        return CloseDigg;
                    case 13:
                        return OpenDigg;
                    default:
                        return null;
                }
        }
    }

    private VerifyAction(int i) {
        this.value = i;
    }
}
