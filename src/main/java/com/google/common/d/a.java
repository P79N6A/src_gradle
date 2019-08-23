package com.google.common.d;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.OutputStream;

@GwtIncompatible
public abstract class a {
    public abstract OutputStream a() throws IOException;

    protected a() {
    }
}
