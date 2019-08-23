package com.bytedance.g;

import com.bytedance.g.a.b;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Document;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/vast/DefaultUriFetcher;", "Lcom/bytedance/vast/UriFetcher;", "()V", "fetchUri", "Lorg/w3c/dom/Document;", "uri", "", "vast"}, k = 1, mv = {1, 1, 13})
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20175a = new a();

    private a() {
    }

    @Nullable
    public final Document a(@Nullable String str) throws com.bytedance.g.a.a, b {
        if (str != null) {
            return com.bytedance.g.c.b.a(str);
        }
        return null;
    }
}
