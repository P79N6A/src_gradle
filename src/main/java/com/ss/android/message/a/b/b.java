package com.ss.android.message.a.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public enum b {
    SOCKET_CONNECTING(1),
    SOCKET_CONNECTED(2),
    HANDSSHAKEING(4),
    HANDSSHAKEED(8),
    REGISTERING(16),
    REGISTERED(32),
    SOCKET_DISCONNECTING(64),
    SOCKET_DISCONNECTED(SearchJediMixFeedAdapter.f42517f),
    ALL(256);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    final int mStateValue;

    public final int getStateValue() {
        return this.mStateValue;
    }

    private b(int i) {
        this.mStateValue = i;
    }
}
