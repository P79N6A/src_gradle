package com.ss.android.ugc.aweme.app.api;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.app.api.b.b;
import com.ss.android.ugc.aweme.app.api.b.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.e;
import retrofit2.n;

public final class g extends e.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33832a;

    /* renamed from: b  reason: collision with root package name */
    private final Gson f33833b;

    public g(Gson gson) {
        if (gson != null) {
            this.f33833b = gson;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    @Nullable
    public final e<ResponseBody, ?> a(Type type, Annotation[] annotationArr, n nVar) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{type2, annotationArr, nVar}, this, f33832a, false, 23067, new Class[]{Type.class, Annotation[].class, n.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{type2, annotationArr, nVar}, this, f33832a, false, 23067, new Class[]{Type.class, Annotation[].class, n.class}, e.class);
        } else if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            if (parameterizedType.getRawType() == b.class) {
                return new c(parameterizedType, this.f33833b);
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
            return new f(ProtoAdapter.get(cls));
        }
    }

    @Nullable
    public final e<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, n nVar) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{type2, annotationArr, annotationArr2, nVar}, this, f33832a, false, 23068, new Class[]{Type.class, Annotation[].class, Annotation[].class, n.class}, e.class)) {
            Object[] objArr = {type2, annotationArr, annotationArr2, nVar};
            return (e) PatchProxy.accessDispatch(objArr, this, f33832a, false, 23068, new Class[]{Type.class, Annotation[].class, Annotation[].class, n.class}, e.class);
        } else if (!(type2 instanceof Class)) {
            return null;
        } else {
            Class cls = (Class) type2;
            if (!Message.class.isAssignableFrom(cls)) {
                return null;
            }
            return new e(ProtoAdapter.get(cls));
        }
    }
}
