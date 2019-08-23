package com.bytedance.android.livesdkapi;

import com.meituan.robust.ChangeQuickRedirect;

public interface d extends com.bytedance.android.live.base.b {

    public interface a {
        Object defValue();

        String key();

        boolean supportPersist();

        b type();
    }

    public enum b {
        Boolean,
        Integer,
        Long,
        Float,
        String,
        StrSet;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    void a(a aVar, int i);

    void a(a aVar, long j);

    void a(a aVar, String str);

    void a(a aVar, boolean z);

    boolean a(a aVar);

    int b(a aVar);

    long c(a aVar);

    String d(a aVar);
}
