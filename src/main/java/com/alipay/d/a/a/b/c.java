package com.alipay.d.a.a.b;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

public final class c implements FileFilter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f5359a;

    c(b bVar) {
        this.f5359a = bVar;
    }

    public final boolean accept(File file) {
        return Pattern.matches("cpu[0-9]+", file.getName());
    }
}
