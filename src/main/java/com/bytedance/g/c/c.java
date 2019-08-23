package com.bytedance.g.c;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/vast/utils/TextUtils;", "", "()V", "isEmpty", "", "text", "", "vast"}, k = 1, mv = {1, 1, 13})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f20177a = new c();

    private c() {
    }

    @JvmStatic
    public static final boolean a(@Nullable String str) {
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }
}
