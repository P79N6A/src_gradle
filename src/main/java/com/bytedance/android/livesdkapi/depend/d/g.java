package com.bytedance.android.livesdkapi.depend.d;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.TextureView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public interface g {

    public interface c {
        void a(b bVar, Object obj);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18623a;

        public static String a(Context context) {
            if (PatchProxy.isSupport(new Object[]{context}, null, f18623a, true, 14932, new Class[]{Context.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f18623a, true, 14932, new Class[]{Context.class}, String.class);
            } else if (context == null) {
                return "@";
            } else {
                return context.toString();
            }
        }
    }

    public enum b {
        UNKNOWN,
        PLAYER_PREPARED,
        COMPLETE_PLAY,
        MEDIA_ERROR,
        DISPLAYED_PLAY,
        STOP_WHEN_PLAYING_OTHER,
        STOP_WHEN_JOIN_INTERACT,
        BUFFERING_START,
        BUFFERING_END,
        INTERACT_SEI,
        VIDEO_SIZE_CHANGED;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static b valueOf(int i) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 14935, new Class[]{Integer.TYPE}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 14935, new Class[]{Integer.TYPE}, b.class);
            } else if (i2 < 0 || i2 >= values().length) {
                return UNKNOWN;
            } else {
                return values()[i2];
            }
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18624a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18625b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f18626c;

        /* renamed from: d  reason: collision with root package name */
        public final int f18627d;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f18628a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f18629b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f18630c;

            /* renamed from: d  reason: collision with root package name */
            public int f18631d;

            public final d a() {
                if (!PatchProxy.isSupport(new Object[0], this, f18628a, false, 14937, new Class[0], d.class)) {
                    return new d(this, (byte) 0);
                }
                return (d) PatchProxy.accessDispatch(new Object[0], this, f18628a, false, 14937, new Class[0], d.class);
            }

            public final a a(int i) {
                this.f18631d = i;
                return this;
            }

            public final a b(boolean z) {
                this.f18630c = z;
                return this;
            }

            public final a a(boolean z) {
                this.f18629b = z;
                return this;
            }
        }

        public static a a() {
            if (PatchProxy.isSupport(new Object[0], null, f18624a, true, 14936, new Class[0], a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[0], null, f18624a, true, 14936, new Class[0], a.class);
            }
            return new a();
        }

        private d(a aVar) {
            this.f18625b = aVar.f18629b;
            this.f18626c = aVar.f18630c;
            this.f18627d = aVar.f18631d;
        }

        /* synthetic */ d(a aVar, byte b2) {
            this(aVar);
        }
    }

    void a(String str, TextureView textureView, int i, @Nullable d dVar, c cVar, String str2) throws Exception;

    void a(boolean z, Context context);

    void c(Context context);

    void c(boolean z);

    void d(Context context);

    int e();

    void e(Context context);

    void f(Context context);

    boolean f();

    boolean g();

    String h();
}
