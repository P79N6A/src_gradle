package com.bytedance.android.livesdk.chatroom.c;

import android.arch.lifecycle.Observer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public class c<V extends View> implements Observer<KVData> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9859a;

    /* renamed from: b  reason: collision with root package name */
    DataCenter f9860b;

    /* renamed from: c  reason: collision with root package name */
    public V f9861c;

    /* renamed from: d  reason: collision with root package name */
    Map<String, b> f9862d;

    public static final class a<V extends View> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9863a;

        /* renamed from: b  reason: collision with root package name */
        public a<V> f9864b;

        /* renamed from: c  reason: collision with root package name */
        public C0083c<V> f9865c;

        /* renamed from: d  reason: collision with root package name */
        public C0082a f9866d;

        /* renamed from: e  reason: collision with root package name */
        private d f9867e;

        /* renamed from: f  reason: collision with root package name */
        private DataCenter f9868f;
        private V g;

        /* renamed from: com.bytedance.android.livesdk.chatroom.c.c$a$a  reason: collision with other inner class name */
        static final class C0082a<V extends View, T> {

            /* renamed from: a  reason: collision with root package name */
            public String f9869a;

            /* renamed from: b  reason: collision with root package name */
            public b<V, T> f9870b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f9871c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f9872d;

            private C0082a(String str, b<V, T> bVar, boolean z, boolean z2) {
                this.f9869a = str;
                this.f9870b = bVar;
                this.f9871c = z;
                this.f9872d = z2;
            }

            /* synthetic */ C0082a(String str, b bVar, boolean z, boolean z2, byte b2) {
                this(str, bVar, false, false);
            }
        }

        public final c<V> a() {
            if (PatchProxy.isSupport(new Object[0], this, f9863a, false, 4303, new Class[0], c.class)) {
                return (c) PatchProxy.accessDispatch(new Object[0], this, f9863a, false, 4303, new Class[0], c.class);
            }
            c<V> cVar = new c<>(this.f9868f, this.g, this.f9864b, (byte) 0);
            d dVar = this.f9867e;
            if (PatchProxy.isSupport(new Object[]{cVar}, dVar, d.f9873a, false, 4305, new Class[]{c.class}, Void.TYPE)) {
                d dVar2 = dVar;
                PatchProxy.accessDispatch(new Object[]{cVar}, dVar2, d.f9873a, false, 4305, new Class[]{c.class}, Void.TYPE);
            } else {
                dVar.f9874b.add(cVar);
            }
            return cVar;
        }

        public final a<V> a(C0083c<V> cVar) {
            this.f9865c = cVar;
            return this;
        }

        public final <T> a<V> a(String str, b<V, T> bVar) {
            if (PatchProxy.isSupport(new Object[]{str, bVar}, this, f9863a, false, 4299, new Class[]{String.class, b.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, bVar}, this, f9863a, false, 4299, new Class[]{String.class, b.class}, a.class);
            }
            C0082a aVar = new C0082a(str, bVar, false, false, (byte) 0);
            this.f9866d = aVar;
            if (PatchProxy.isSupport(new Object[0], this, f9863a, false, 4304, new Class[0], a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[0], this, f9863a, false, 4304, new Class[0], a.class);
            }
            a<V> aVar2 = new a<>(this.f9868f, this.g, this.f9867e);
            aVar2.f9864b = this;
            aVar2.f9865c = this.f9865c;
            return aVar2;
        }

        a(DataCenter dataCenter, V v, d dVar) {
            this.f9868f = dataCenter;
            this.g = v;
            this.f9867e = dVar;
        }
    }

    public interface b<V extends View, T> {
        void a(@NonNull V v, @NonNull T t);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.c.c$c  reason: collision with other inner class name */
    public interface C0083c<V extends View> {
        void a(@NonNull V v);
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f9859a, false, 4298, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f9859a, false, 4298, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            Object data = kVData.getData();
            if (this.f9862d.keySet().contains(key)) {
                this.f9862d.get(key).a(this.f9861c, data);
            }
        }
    }

    private c(DataCenter dataCenter, V v, a<V> aVar) {
        this.f9862d = new HashMap();
        this.f9860b = dataCenter;
        this.f9861c = v;
        if (aVar.f9865c != null) {
            aVar.f9865c.a(this.f9861c);
        }
        while (aVar != null) {
            a.C0082a aVar2 = aVar.f9866d;
            this.f9862d.put(aVar2.f9869a, aVar2.f9870b);
            if (aVar2.f9871c) {
                if (aVar2.f9872d) {
                    this.f9860b.observeForever(aVar2.f9869a, this, true);
                } else {
                    this.f9860b.observeForever(aVar2.f9869a, this);
                }
            } else if (aVar2.f9872d) {
                this.f9860b.observe(aVar2.f9869a, this, true);
            } else {
                this.f9860b.observe(aVar2.f9869a, this);
            }
            aVar = aVar.f9864b;
        }
    }

    /* synthetic */ c(DataCenter dataCenter, View view, a aVar, byte b2) {
        this(dataCenter, view, aVar);
    }
}
