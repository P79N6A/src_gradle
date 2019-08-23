package com.tencent.bugly.proguard;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f79476a;

    /* renamed from: b  reason: collision with root package name */
    private String f79477b;

    public final void a(short s, int i) {
        a(4);
        if (s < -128 || s > 127) {
            b((byte) 1, i);
            this.f79476a.putShort(s);
            return;
        }
        a((byte) s, i);
    }

    public final <K, V> void a(Map<K, V> map, int i) {
        int i2;
        a(8);
        b((byte) 8, i);
        if (map == null) {
            i2 = 0;
        } else {
            i2 = map.size();
        }
        a(i2, 0);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                a(next.getKey(), 0);
                a(next.getValue(), 1);
            }
        }
    }

    public final void a(byte[] bArr, int i) {
        a(bArr.length + 8);
        b((byte) 13, i);
        b((byte) 0, 0);
        a(bArr.length, 0);
        this.f79476a.put(bArr);
    }

    public j() {
        this(SearchJediMixFeedAdapter.f42517f);
    }

    public final ByteBuffer a() {
        return this.f79476a;
    }

    public final byte[] b() {
        byte[] bArr = new byte[this.f79476a.position()];
        System.arraycopy(this.f79476a.array(), 0, bArr, 0, this.f79476a.position());
        return bArr;
    }

    public final int a(String str) {
        this.f79477b = str;
        return 0;
    }

    public j(int i) {
        this.f79477b = "GBK";
        this.f79476a = ByteBuffer.allocate(i);
    }

    private void a(int i) {
        if (this.f79476a.remaining() < i) {
            ByteBuffer allocate = ByteBuffer.allocate((this.f79476a.capacity() + i) << 1);
            allocate.put(this.f79476a.array(), 0, this.f79476a.position());
            this.f79476a = allocate;
        }
    }

    public final void a(boolean z, int i) {
        a(z ? (byte) 1 : 0, i);
    }

    public final void a(byte b2, int i) {
        a(3);
        if (b2 == 0) {
            b((byte) 12, i);
            return;
        }
        b((byte) 0, i);
        this.f79476a.put(b2);
    }

    private void b(byte b2, int i) {
        if (i < 15) {
            this.f79476a.put((byte) (b2 | (i << 4)));
        } else if (i < 256) {
            this.f79476a.put((byte) (b2 | 240));
            this.f79476a.put((byte) i);
        } else {
            throw new b("tag is too large: ".concat(String.valueOf(i)));
        }
    }

    public final void a(int i, int i2) {
        a(6);
        if (i < -32768 || i > 32767) {
            b((byte) 2, i2);
            this.f79476a.putInt(i);
            return;
        }
        a((short) i, i2);
    }

    public final void a(long j, int i) {
        a(10);
        if (j < -2147483648L || j > 2147483647L) {
            b((byte) 3, i);
            this.f79476a.putLong(j);
            return;
        }
        a((int) j, i);
    }

    public final void a(k kVar, int i) {
        a(2);
        b((byte) 10, i);
        kVar.a(this);
        a(2);
        b((byte) 11, 0);
    }

    public final void a(Object obj, int i) {
        if (obj instanceof Byte) {
            a(((Byte) obj).byteValue(), i);
        } else if (obj instanceof Boolean) {
            a(((Boolean) obj).booleanValue() ? (byte) 1 : 0, i);
        } else if (obj instanceof Short) {
            a(((Short) obj).shortValue(), i);
        } else if (obj instanceof Integer) {
            a(((Integer) obj).intValue(), i);
        } else if (obj instanceof Long) {
            a(((Long) obj).longValue(), i);
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            a(6);
            b((byte) 4, i);
            this.f79476a.putFloat(floatValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            a(10);
            b((byte) 5, i);
            this.f79476a.putDouble(doubleValue);
        } else if (obj instanceof String) {
            a((String) obj, i);
        } else if (obj instanceof Map) {
            a((Map) obj, i);
        } else if (obj instanceof List) {
            a((Collection<T>) (List) obj, i);
        } else if (obj instanceof k) {
            a(2);
            b((byte) 10, i);
            ((k) obj).a(this);
            a(2);
            b((byte) 11, 0);
        } else if (obj instanceof byte[]) {
            a((byte[]) obj, i);
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            a(8);
            b((byte) 9, i);
            a(zArr.length, 0);
            for (boolean z : zArr) {
                a(z ? (byte) 1 : 0, 0);
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            a(8);
            b((byte) 9, i);
            a(sArr.length, 0);
            for (short a2 : sArr) {
                a(a2, 0);
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            a(8);
            b((byte) 9, i);
            a(iArr.length, 0);
            for (int a3 : iArr) {
                a(a3, 0);
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            a(8);
            b((byte) 9, i);
            a(jArr.length, 0);
            for (long a4 : jArr) {
                a(a4, 0);
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            a(8);
            b((byte) 9, i);
            a(fArr.length, 0);
            for (float putFloat : fArr) {
                a(6);
                b((byte) 4, 0);
                this.f79476a.putFloat(putFloat);
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            a(8);
            b((byte) 9, i);
            a(dArr.length, 0);
            for (double putDouble : dArr) {
                a(10);
                b((byte) 5, 0);
                this.f79476a.putDouble(putDouble);
            }
        } else if (obj.getClass().isArray()) {
            Object[] objArr = (Object[]) obj;
            a(8);
            b((byte) 9, i);
            a(objArr.length, 0);
            for (Object a5 : objArr) {
                a(a5, 0);
            }
        } else if (obj instanceof Collection) {
            a((Collection) obj, i);
        } else {
            throw new b("write object error: unsupport type. " + obj.getClass());
        }
    }

    public final void a(String str, int i) {
        byte[] bArr;
        try {
            bArr = str.getBytes(this.f79477b);
        } catch (UnsupportedEncodingException unused) {
            bArr = str.getBytes();
        }
        a(bArr.length + 10);
        if (bArr.length > 255) {
            b((byte) 7, i);
            this.f79476a.putInt(bArr.length);
            this.f79476a.put(bArr);
            return;
        }
        b((byte) 6, i);
        this.f79476a.put((byte) bArr.length);
        this.f79476a.put(bArr);
    }

    public final <T> void a(Collection<T> collection, int i) {
        int i2;
        a(8);
        b((byte) 9, i);
        if (collection == null) {
            i2 = 0;
        } else {
            i2 = collection.size();
        }
        a(i2, 0);
        if (collection != null) {
            for (T a2 : collection) {
                a((Object) a2, 0);
            }
        }
    }
}
