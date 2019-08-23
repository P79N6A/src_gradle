package com.facebook.imagepipeline.nativecode;

import com.facebook.imageutils.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a {
    public static final List<String> DEPENDENCIES = Collections.unmodifiableList(new ArrayList());

    public static void load() {
        b.a("imagepipeline");
    }
}
