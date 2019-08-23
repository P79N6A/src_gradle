package com.bytedance.android.livesdkapi.host;

import android.webkit.WebResourceResponse;
import com.bytedance.android.live.base.b;
import java.util.List;
import java.util.Map;

public interface o extends b {
    List<String> a();

    List<String> a(String str);

    Map<String, String> b(String str);

    WebResourceResponse c(String str);
}
