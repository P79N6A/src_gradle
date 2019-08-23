package com.bytedance.android.live.room;

import android.text.Spannable;
import com.bytedance.android.live.base.b;
import com.bytedance.android.live.room.a.a;
import com.bytedance.android.livesdkapi.h.e;

public interface c extends b {
    a getCrossRoomGift();

    a messageManagerHelper();

    Spannable parsePatternAndGetSpannable(e eVar, String str);

    Spannable parsePatternAndGetSpannable(String str, e eVar);

    b room();

    a setCrossRoomGift(a aVar);

    d toolbarManagerHelper();
}
