package com.bytedance.retrofit2;

import com.bytedance.retrofit2.CallAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public final class d extends CallAdapter.Factory {

    /* renamed from: a  reason: collision with root package name */
    static final CallAdapter.Factory f21852a = new d();

    d() {
    }

    public final CallAdapter<?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (getRawType(type) != Call.class) {
            return null;
        }
        final Type e2 = s.e(type);
        return new CallAdapter<Call<?>>() {
            public final /* bridge */ /* synthetic */ Object a(Call call) {
                return call;
            }

            public final Type a() {
                return e2;
            }
        };
    }
}
