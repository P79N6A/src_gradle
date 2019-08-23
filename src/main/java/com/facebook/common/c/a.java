package com.facebook.common.c;

import com.facebook.common.internal.g;
import java.util.Map;
import javax.annotation.Nullable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f23496a = g.of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    public static boolean a(@Nullable String str) {
        if (str == null || !str.startsWith("video/")) {
            return false;
        }
        return true;
    }
}
