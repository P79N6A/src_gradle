package com.ss.sys.ces.out;

import android.content.Context;
import com.ss.sys.ces.c.a;
import java.util.HashMap;

public interface ISdk {
    void InitSelas();

    void SetRegionType(int i);

    String debugEntry(Context context, int i);

    byte[] encode(byte[] bArr);

    String onEvent();

    void reportNow(String str);

    void setCustomInfo(HashMap<String, Object> hashMap);

    void setInterface(a aVar);

    void setNetwork(boolean z);

    void setParams(String str, String str2);

    void setParams(String str, String str2, boolean z);

    void setSession(String str);

    void setUrlInterface(int i, String str);
}
