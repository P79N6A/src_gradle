package com.bytedance.sdk.account.bdplatform.b;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;

public class c {
    public String A;
    public String B;
    public int C;
    public int D;
    public int E;
    public String F;
    public String G;

    /* renamed from: a  reason: collision with root package name */
    public String f22274a;

    /* renamed from: b  reason: collision with root package name */
    public String f22275b;

    /* renamed from: c  reason: collision with root package name */
    public String f22276c;

    /* renamed from: d  reason: collision with root package name */
    public String f22277d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22278e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f22279f;
    public Drawable g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public float s;
    public int t;
    public ArrayList<String> u;
    public String v;
    public Drawable w;
    public Drawable x;
    public Drawable y;
    public String z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public c f22280a = new c((byte) 0);

        public final a a(float f2) {
            this.f22280a.s = 13.0f;
            return this;
        }

        public final a b(int i) {
            this.f22280a.D = 32;
            return this;
        }

        public final a c(Drawable drawable) {
            this.f22280a.y = drawable;
            return this;
        }

        public final a d(String str) {
            this.f22280a.i = str;
            return this;
        }

        public final a f(String str) {
            this.f22280a.k = str;
            return this;
        }

        public final a h(String str) {
            this.f22280a.n = str;
            return this;
        }

        public final a o(String str) {
            this.f22280a.F = str;
            return this;
        }

        public final a p(String str) {
            this.f22280a.G = str;
            return this;
        }

        public final a a(int i) {
            this.f22280a.C = 32;
            return this;
        }

        public final a b(Drawable drawable) {
            this.f22280a.x = drawable;
            return this;
        }

        public final a a(Drawable drawable) {
            this.f22280a.w = drawable;
            return this;
        }

        public final a b(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    Color.parseColor(str);
                    this.f22280a.f22277d = str;
                    return this;
                } catch (Exception unused) {
                    throw new IllegalArgumentException("Unknown color");
                }
            } else {
                throw new IllegalArgumentException("titleBarCancelColor is empty");
            }
        }

        public final a c(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    Color.parseColor(str);
                    this.f22280a.h = str;
                    return this;
                } catch (Exception unused) {
                    throw new IllegalArgumentException("Unknown color");
                }
            } else {
                throw new IllegalArgumentException("applyAuthAppColor is empty");
            }
        }

        public final a e(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    Color.parseColor(str);
                    this.f22280a.j = str;
                    return this;
                } catch (Exception unused) {
                    throw new IllegalArgumentException("Unknown color");
                }
            } else {
                throw new IllegalArgumentException("applyAuthAppColor is empty");
            }
        }

        public final a g(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    Color.parseColor(str);
                    this.f22280a.m = str;
                    return this;
                } catch (Exception unused) {
                    throw new IllegalArgumentException("Unknown color");
                }
            } else {
                throw new IllegalArgumentException("userAvatarBgColor is empty");
            }
        }

        public final a i(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    Color.parseColor(str);
                    this.f22280a.o = str;
                    return this;
                } catch (Exception unused) {
                    throw new IllegalArgumentException("Unknown color");
                }
            } else {
                throw new IllegalArgumentException("userNameColor is empty");
            }
        }

        public final a j(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    Color.parseColor(str);
                    this.f22280a.p = str;
                    return this;
                } catch (Exception unused) {
                    throw new IllegalArgumentException("Unknown color");
                }
            } else {
                throw new IllegalArgumentException("borderColor is empty");
            }
        }

        public final a k(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    Color.parseColor(str);
                    this.f22280a.r = str;
                    return this;
                } catch (Exception unused) {
                    throw new IllegalArgumentException("Unknown color");
                }
            } else {
                throw new IllegalArgumentException("authDescTitleColor is empty");
            }
        }

        public final a l(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    Color.parseColor(str);
                    this.f22280a.v = str;
                    return this;
                } catch (Exception unused) {
                    throw new IllegalArgumentException("Unknown color");
                }
            } else {
                throw new IllegalArgumentException("authDescColor is empty");
            }
        }

        public final a m(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f22280a.z = str;
                return this;
            }
            throw new IllegalArgumentException("loginButtonText is empty");
        }

        public final a n(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    Color.parseColor(str);
                    this.f22280a.B = str;
                    return this;
                } catch (Exception unused) {
                    throw new IllegalArgumentException("Unknown color");
                }
            } else {
                throw new IllegalArgumentException("loginButtonBgColor is empty");
            }
        }

        public final a a(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    Color.parseColor(str);
                    this.f22280a.f22275b = str;
                    return this;
                } catch (Exception unused) {
                    throw new IllegalArgumentException("Unknown color");
                }
            } else {
                throw new IllegalArgumentException("contentBgColor is empty");
            }
        }

        public final a a(ArrayList<String> arrayList) {
            this.f22280a.u = arrayList;
            return this;
        }

        public final a a(boolean z) {
            this.f22280a.f22278e = false;
            return this;
        }
    }

    private c() {
        this.t = -1;
    }

    /* synthetic */ c(byte b2) {
        this();
    }
}
