package com.ss.android.ugc.aweme.feed.h;

import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeAdStatus;

public interface s extends o {
    void a(AwemeAdStatus awemeAdStatus, String str);

    void a(Exception exc, AwemeAdStatus awemeAdStatus, String str, Aweme aweme);
}
