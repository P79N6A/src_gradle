package com.ss.android.ugc.aweme.feed.k;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Aweme f45564a;

    /* renamed from: b  reason: collision with root package name */
    private static List<Aweme> f45565b;

    public static List<Aweme> a() {
        return f45565b;
    }

    public static void a(Aweme aweme) {
        f45564a = aweme;
    }

    public static void a(List<Aweme> list) {
        f45565b = list;
    }

    public static void b(List<Aweme> list) {
        if (f45565b == list) {
            f45565b = null;
        }
    }
}
