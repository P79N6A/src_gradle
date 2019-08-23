package com.bytedance.retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface CallAdapter<T> {

    public static abstract class Factory {
        public abstract CallAdapter<?> get(Type type, Annotation[] annotationArr, Retrofit retrofit);

        public static Class<?> getRawType(Type type) {
            return s.a(type);
        }

        protected static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
            return s.a(i, parameterizedType);
        }
    }

    <R> T a(Call<R> call);

    Type a();
}
