package com.ss.android.ugc.aweme.port.in;

import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.ss.android.ugc.aweme.sticker.data.PoiStruct;

public interface ae {

    public interface a {
        void a();

        void a(@Nullable PoiStruct poiStruct, String str);

        void b();
    }

    public interface b {
        void a(@Nullable PoiStruct poiStruct, String str);
    }

    String a(PoiStruct poiStruct);

    String a(String str);

    void a(FragmentActivity fragmentActivity, b bVar);

    void a(a aVar, FragmentActivity fragmentActivity, boolean z);

    void a(b bVar, FragmentActivity fragmentActivity, boolean z);

    PoiStruct b(String str);
}
