package com.bytedance.android.livesdkapi.host;

import com.bytedance.android.live.base.b;
import com.bytedance.android.livesdkapi.i.d;
import com.bytedance.android.livesdkapi.i.e;
import com.bytedance.retrofit2.Retrofit;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface h extends b {
    e<d> a(int i, String str, List<com.bytedance.android.live.base.model.e> list, String str2, byte[] bArr, long j, String str3) throws IOException;

    e<d> a(String str, List<com.bytedance.android.live.base.model.e> list) throws IOException;

    e<d> a(String str, List<com.bytedance.android.live.base.model.e> list, String str2, byte[] bArr) throws IOException;

    e<d> a(boolean z, int i, String str, List<com.bytedance.android.live.base.model.e> list, Object obj) throws IOException;

    Map<String, String> a();

    String b();

    Retrofit c();
}
