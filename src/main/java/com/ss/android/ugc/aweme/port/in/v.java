package com.ss.android.ugc.aweme.port.in;

import com.meituan.robust.ChangeQuickRedirect;

public interface v {

    public interface a {
        void onEvent(b bVar);
    }

    public enum b {
        LiveRestartEvent;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }
}
