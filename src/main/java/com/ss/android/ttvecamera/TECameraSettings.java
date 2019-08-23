package com.ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class TECameraSettings {
    public static final int[] A = {2, 0, 1, 3};
    public static final int[] B = {1, 2, 0, 3};

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f31290a = {"auto", "portrait", "party", "sunset", "candlelight", "night", "hdr", "action", "landscape", "snow"};

    /* renamed from: b  reason: collision with root package name */
    public Context f31291b;
    @CameraType

    /* renamed from: c  reason: collision with root package name */
    public int f31292c = 1;

    /* renamed from: d  reason: collision with root package name */
    public ab f31293d = new ab(7, 30);
    @CameraFacing

    /* renamed from: e  reason: collision with root package name */
    public int f31294e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f31295f = 0;
    public int g = -1;
    public int h = 17;
    public boolean i = false;
    public ac j = new ac(1280, 720);
    public ac k = new ac(1920, 1080);
    public int l = 1;
    public int m = 0;
    public int n = 1;
    public int o = 1;
    public Bundle p;
    public byte q = 1;
    public String r = "auto";
    public String s = PushConstants.PUSH_TYPE_NOTIFY;
    public a t = new a();
    public boolean u = true;
    @FPS
    public int v = 0;
    public boolean w = true;
    public boolean x = false;
    public int y = 0;
    @WhiteBalanceValue
    public String z = "auto";

    @Retention(RetentionPolicy.CLASS)
    public @interface CameraFacing {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface CameraType {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface FPS {
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f31296a;

        /* renamed from: b  reason: collision with root package name */
        public int f31297b;

        /* renamed from: c  reason: collision with root package name */
        public int f31298c;

        /* renamed from: d  reason: collision with root package name */
        public float f31299d;

        public final boolean a() {
            if (this.f31296a <= this.f31298c || this.f31299d <= 0.001f) {
                return false;
            }
            return true;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final Map<String, Class> f31300a;

        static {
            HashMap hashMap = new HashMap();
            f31300a = hashMap;
            hashMap.put("device_support_wide_angle", Boolean.class);
            f31300a.put("device_support_camera", Boolean.class);
            f31300a.put("support_wide_angle", Boolean.class);
            f31300a.put("support_body_beauty", Boolean.class);
            f31300a.put("support_anti_shake", Boolean.class);
            f31300a.put("support_fps_480", Boolean.class);
            f31300a.put("support_fps_120", Boolean.class);
            f31300a.put("support_fps_60", Boolean.class);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f31301a;

        public c(int i) {
            this.f31301a = i;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private static final Map<String, Class> f31302a;

        static {
            HashMap hashMap = new HashMap();
            f31302a = hashMap;
            hashMap.put("enable_body_beauty", Boolean.class);
            f31302a.put("enable_anti_shake", Boolean.class);
            f31302a.put("video_path", String.class);
            f31302a.put("body_beauty_level", Integer.class);
        }

        public static boolean a(String str, Object obj) {
            if (!f31302a.containsKey(str) || (obj != null && obj.getClass() != f31302a.get(str))) {
                return false;
            }
            return true;
        }
    }

    public interface e {
        void a();

        void a(e eVar, c cVar);
    }

    public interface f {
        void a(int i, float f2, boolean z);

        void a(int i, boolean z, boolean z2, float f2, List<Integer> list);

        boolean a();
    }

    public TECameraSettings(Context context) {
        this.f31291b = context;
    }

    public TECameraSettings(Context context, int i2) {
        this.f31291b = context;
        this.f31292c = i2;
    }

    public TECameraSettings(Context context, int i2, int i3, int i4) {
        this.f31291b = context;
        this.f31292c = i2;
        this.j.f31335a = i3;
        this.j.f31336b = i4;
    }
}
