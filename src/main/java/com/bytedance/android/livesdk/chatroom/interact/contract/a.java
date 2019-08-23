package com.bytedance.android.livesdk.chatroom.interact.contract;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.a.i;
import com.bytedance.android.livesdk.common.d;
import com.bytedance.android.livesdk.common.e;
import java.util.List;

public final class a {

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.contract.a$a  reason: collision with other inner class name */
    public static abstract class C0087a extends d<b> {
        public abstract int a();

        public abstract void a(int i);

        public abstract void a(com.bytedance.android.livesdk.sticker.b.a aVar);

        public abstract void a(String str);

        public abstract String b();

        public abstract void b(int i);

        public abstract ImageModel c();

        public abstract void c(int i);

        public abstract boolean d();

        public abstract void e();

        public abstract List<i> f();

        public abstract String g();
    }

    public interface b extends e {
        void a(Throwable th);

        void b();
    }
}
