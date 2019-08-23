package com.ss.android.ugc.aweme.im.sdk.relations.a;

import android.icu.text.AlphabeticIndex;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.im.sdk.utils.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52031a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f52032c;

    /* renamed from: b  reason: collision with root package name */
    public Locale f52033b;

    /* renamed from: d  reason: collision with root package name */
    private c f52034d;

    static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52035a;

        public a(List<Locale> list) {
            super(list);
        }

        public final int a(String str, int i) {
            String str2 = str;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f52035a, false, 53021, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f52035a, false, 53021, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            int c2 = c(str2.substring(i2, i2 + 1));
            char charAt = str.charAt(i);
            if (i2 != 0 && Character.isLowerCase(charAt)) {
                c2 += 26;
            }
            if (c2 == -1) {
                if (a.b(charAt)) {
                    c2 = ((a() + charAt) - 48) + 26;
                } else if (a.c(charAt)) {
                    c2 = a() + 36;
                } else if (a.a(str.substring(i))) {
                    c2 = 99;
                } else {
                    c2 = a() + 37;
                }
            }
            return c2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b$b  reason: collision with other inner class name */
    static class C0606b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52036a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f52037b;

        public C0606b() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], null, y.f52669a, true, 53549, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, y.f52669a, true, 53549, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (TextUtils.equals(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage()) || TextUtils.equals(Locale.getDefault().getLanguage(), Locale.ENGLISH.getLanguage())) {
                z = true;
            }
            this.f52037b = z;
        }

        public final String b(String str) {
            if (!PatchProxy.isSupport(new Object[]{str}, this, f52036a, false, 53025, new Class[]{String.class}, String.class)) {
                return a.d(str);
            }
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f52036a, false, 53025, new Class[]{String.class}, String.class);
        }

        public final String a(String str) {
            boolean z;
            boolean z2;
            boolean z3;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f52036a, false, 53024, new Class[]{String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f52036a, false, 53024, new Class[]{String.class}, String.class);
            }
            boolean z4 = this.f52037b;
            if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z4 ? (byte) 1 : 0)}, null, a.f52030a, true, 53012, new Class[]{String.class, Boolean.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z4)}, null, a.f52030a, true, 53012, new Class[]{String.class, Boolean.TYPE}, String.class);
            }
            String str3 = "#";
            if (!TextUtils.isEmpty(str)) {
                char charAt = str2.charAt(0);
                if (PatchProxy.isSupport(new Object[]{Character.valueOf(charAt)}, null, a.f52030a, true, 53006, new Class[]{Character.TYPE}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Character.valueOf(charAt)}, null, a.f52030a, true, 53006, new Class[]{Character.TYPE}, Boolean.TYPE)).booleanValue();
                } else {
                    if (charAt < 19968 || charAt > 40869) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3 || a.a(charAt)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    str3 = a.c(str).substring(0, 1).toUpperCase();
                    if (TextUtils.isEmpty(str3)) {
                        str3 = str2.substring(0, 1).toUpperCase();
                    }
                } else {
                    if (PatchProxy.isSupport(new Object[]{Character.valueOf(charAt)}, null, a.f52030a, true, 53007, new Class[]{Character.TYPE}, Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Character.valueOf(charAt)}, null, a.f52030a, true, 53007, new Class[]{Character.TYPE}, Boolean.TYPE)).booleanValue();
                    } else if (a.b(charAt) || a.c(charAt)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 || a.a(str)) {
                        str3 = "#";
                    } else if (z4) {
                        str3 = "#";
                    } else {
                        str3 = str2.substring(0, 1);
                    }
                }
            }
            return str3;
        }
    }

    static class c implements c {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f52038b;

        /* renamed from: a  reason: collision with root package name */
        private final int f52039a;

        /* renamed from: c  reason: collision with root package name */
        protected final AlphabeticIndex.ImmutableIndex f52040c;

        public final int a() {
            return this.f52039a + 1;
        }

        public c(List<Locale> list) {
            AlphabeticIndex maxLabelCount = new AlphabeticIndex(list.get(0)).setMaxLabelCount(100);
            for (Locale locale : list) {
                maxLabelCount.addLabels(new Locale[]{locale});
            }
            this.f52040c = maxLabelCount.buildImmutableIndex();
            this.f52039a = this.f52040c.getBucketCount();
        }

        public final String b(String str) {
            int i;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f52038b, false, 53033, new Class[]{String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f52038b, false, 53033, new Class[]{String.class}, String.class);
            } else if (TextUtils.isEmpty(str)) {
                return PushConstants.PUSH_TYPE_NOTIFY;
            } else {
                StringBuilder sb = new StringBuilder();
                int i2 = 0;
                int i3 = 0;
                while (i2 < 12) {
                    if (i3 < str.length()) {
                        i = a(str2, i3);
                    } else {
                        i = 0;
                    }
                    if (i < 10) {
                        sb.append(PushConstants.PUSH_TYPE_NOTIFY);
                    }
                    if (i == 99) {
                        i3++;
                    }
                    sb.append(String.valueOf(i));
                    i2++;
                    i3++;
                }
                return sb.toString();
            }
        }

        public int c(String str) {
            AlphabeticIndex.Bucket bucket;
            if (PatchProxy.isSupport(new Object[]{str}, this, f52038b, false, 53029, new Class[]{String.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f52038b, false, 53029, new Class[]{String.class}, Integer.TYPE)).intValue();
            } else if (TextUtils.isEmpty(str)) {
                return -1;
            } else {
                int bucketIndex = this.f52040c.getBucketIndex(str);
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(bucketIndex)}, this, f52038b, false, 53030, new Class[]{Integer.TYPE}, AlphabeticIndex.Bucket.class)) {
                    bucket = (AlphabeticIndex.Bucket) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(bucketIndex)}, this, f52038b, false, 53030, new Class[]{Integer.TYPE}, AlphabeticIndex.Bucket.class);
                } else {
                    bucket = this.f52040c.getBucket(bucketIndex);
                }
                if (bucket.getLabelType() != AlphabeticIndex.Bucket.LabelType.NORMAL) {
                    return -1;
                }
                return bucketIndex;
            }
        }

        public final String a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f52038b, false, 53031, new Class[]{String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f52038b, false, 53031, new Class[]{String.class}, String.class);
            } else if (a.a(str)) {
                return "#";
            } else {
                int c2 = c(str);
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(c2)}, this, f52038b, false, 53028, new Class[]{Integer.TYPE}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(c2)}, this, f52038b, false, 53028, new Class[]{Integer.TYPE}, String.class);
                } else if (c2 >= 0 && c2 < a()) {
                    return this.f52040c.getBucket(c2).getLabel();
                } else {
                    return "#";
                }
            }
        }

        public int a(String str, int i) {
            String str2 = str;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f52038b, false, 53032, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f52038b, false, 53032, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            int c2 = c(str2.substring(i2, i2 + 1));
            if (c2 == -1) {
                char charAt = str.charAt(i);
                if (Character.isUpperCase(charAt)) {
                    c2 = (a() + charAt) - 65;
                } else if (Character.isLowerCase(charAt)) {
                    c2 = ((a() + charAt) - 97) + 26;
                } else if (a.b(charAt)) {
                    c2 = ((a() + charAt) - 48) + 52;
                } else if (a.c(charAt)) {
                    c2 = a() + 62;
                } else if (a.a(str.substring(i))) {
                    c2 = 99;
                } else {
                    c2 = a() + 63;
                }
            }
            return c2;
        }
    }

    static class d extends c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52041a;

        public d(List<Locale> list) {
            super(list);
        }

        public final int c(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f52041a, false, 53034, new Class[]{String.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f52041a, false, 53034, new Class[]{String.class}, Integer.TYPE)).intValue();
            } else if (TextUtils.isEmpty(str)) {
                return -1;
            } else {
                int c2 = super.c(str);
                if (c2 == -1) {
                    c2 = super.c(a.c(str));
                }
                return c2;
            }
        }
    }

    static class e extends c {
        public e(List<Locale> list) {
            super(list);
        }
    }

    private b() {
        b();
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f52031a, true, 53014, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f52031a, true, 53014, new Class[0], b.class);
        }
        b bVar = f52032c;
        if (bVar == null) {
            synchronized (b.class) {
                if (bVar == null) {
                    try {
                        bVar = new b();
                        f52032c = bVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return bVar;
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f52031a, false, 53016, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52031a, false, 53016, new Class[0], Void.TYPE);
            return;
        }
        this.f52033b = y.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f52033b);
        if (Build.VERSION.SDK_INT <= 24) {
            this.f52034d = new C0606b();
        } else if (this.f52033b.getLanguage().equals(Locale.CHINESE.getLanguage())) {
            this.f52034d = new a(arrayList);
        } else if (this.f52033b.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
            this.f52034d = new a(arrayList);
        } else if (this.f52033b.getLanguage().equals(Locale.JAPANESE.getLanguage())) {
            arrayList.add(Locale.CHINESE);
            this.f52034d = new d(arrayList);
        } else if (this.f52033b.getLanguage().equals(Locale.KOREAN.getLanguage())) {
            this.f52034d = new e(arrayList);
        } else {
            this.f52034d = new c(arrayList);
        }
    }

    public final String a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f52031a, false, 53017, new Class[]{String.class}, String.class)) {
            return this.f52034d.a(str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f52031a, false, 53017, new Class[]{String.class}, String.class);
    }

    public final String b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f52031a, false, 53018, new Class[]{String.class}, String.class)) {
            return this.f52034d.b(str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f52031a, false, 53018, new Class[]{String.class}, String.class);
    }
}
