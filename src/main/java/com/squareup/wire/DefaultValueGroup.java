package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;

public interface DefaultValueGroup<M extends Message<M, B>, B extends Message.Builder<M, B>> {
    void addDefaultValues(B b2);
}