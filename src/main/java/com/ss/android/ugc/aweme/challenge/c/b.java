package com.ss.android.ugc.aweme.challenge.c;

import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.discover.model.Challenge;

public final class b extends a<Challenge> {
    public final boolean sendRequest(Object... objArr) {
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }
}
