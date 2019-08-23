package com.ss.android.agilelogger.b.b.b;

import android.content.Intent;
import com.ss.android.agilelogger.f.f;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public final class b implements c<Intent> {
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return a((Intent) obj);
    }

    public static String a(Intent intent) {
        if (intent == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(SearchJediMixFeedAdapter.f42517f);
        sb.append("Intent { ");
        f.a(intent, sb);
        sb.append(" }");
        return sb.toString();
    }
}
