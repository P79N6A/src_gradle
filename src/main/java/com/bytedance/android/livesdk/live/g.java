package com.bytedance.android.livesdk.live;

import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public class g extends Converter.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15853a;

    public Converter<TypedInput, Message> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{type2, annotationArr, retrofit}, this, f15853a, false, 10284, new Class[]{Type.class, Annotation[].class, Retrofit.class}, Converter.class)) {
            return (Converter) PatchProxy.accessDispatch(new Object[]{type2, annotationArr, retrofit}, this, f15853a, false, 10284, new Class[]{Type.class, Annotation[].class, Retrofit.class}, Converter.class);
        } else if (!(type2 instanceof Class)) {
            return null;
        } else {
            Class cls = (Class) type2;
            if (!Message.class.isAssignableFrom(cls)) {
                return null;
            }
            return new h(ProtoAdapter.get(cls));
        }
    }
}
