package com.ss.android.ugc.aweme.opensdk.share.base;

import android.os.Bundle;

public interface a {
    boolean checkArgs();

    void serialize(Bundle bundle);

    int type();

    void unserialize(Bundle bundle);
}
