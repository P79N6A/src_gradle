package com.ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.app.api.b.a;
import com.ss.android.ugc.aweme.app.api.b.b;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class x extends Converter.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33914a;

    /* renamed from: b  reason: collision with root package name */
    private final Gson f33915b;

    private x(Gson gson) {
        if (gson != null) {
            this.f33915b = gson;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    public static x a(Gson gson) {
        Gson gson2 = gson;
        if (!PatchProxy.isSupport(new Object[]{gson2}, null, f33914a, true, 23181, new Class[]{Gson.class}, x.class)) {
            return new x(gson2);
        }
        return (x) PatchProxy.accessDispatch(new Object[]{gson2}, null, f33914a, true, 23181, new Class[]{Gson.class}, x.class);
    }

    public final Converter<TypedInput, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{type2, annotationArr, retrofit}, this, f33914a, false, 23182, new Class[]{Type.class, Annotation[].class, Retrofit.class}, Converter.class)) {
            return (Converter) PatchProxy.accessDispatch(new Object[]{type2, annotationArr, retrofit}, this, f33914a, false, 23182, new Class[]{Type.class, Annotation[].class, Retrofit.class}, Converter.class);
        } else if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            if (parameterizedType.getRawType() == b.class) {
                return new a(parameterizedType, this.f33915b);
            }
            return null;
        } else {
            if (!(type2 instanceof Class)) {
                return null;
            }
            Class cls = (Class) type2;
            if (!Message.class.isAssignableFrom(cls)) {
                return null;
            }
            return new w(ProtoAdapter.get(cls));
        }
    }

    public final Converter<?, TypedOutput> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{type2, annotationArr, annotationArr2, retrofit}, this, f33914a, false, 23183, new Class[]{Type.class, Annotation[].class, Annotation[].class, Retrofit.class}, Converter.class)) {
            Object[] objArr = {type2, annotationArr, annotationArr2, retrofit};
            return (Converter) PatchProxy.accessDispatch(objArr, this, f33914a, false, 23183, new Class[]{Type.class, Annotation[].class, Annotation[].class, Retrofit.class}, Converter.class);
        } else if (!(type2 instanceof Class)) {
            return null;
        } else {
            Class cls = (Class) type2;
            if (!Message.class.isAssignableFrom(cls)) {
                return null;
            }
            return new v(ProtoAdapter.get(cls));
        }
    }
}
