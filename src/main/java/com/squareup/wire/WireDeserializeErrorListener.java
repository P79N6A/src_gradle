package com.squareup.wire;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface WireDeserializeErrorListener {
    void onError(@Nonnull Class cls, @Nullable String str, @Nonnull Throwable th);
}
