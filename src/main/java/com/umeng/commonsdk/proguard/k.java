package com.umeng.commonsdk.proguard;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator f80853a = new a();

    static class a implements Comparator {
        private a() {
        }

        public int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            if (obj instanceof List) {
                return k.a((List) obj, (List) obj2);
            }
            if (obj instanceof Set) {
                return k.a((Set) obj, (Set) obj2);
            }
            if (obj instanceof Map) {
                return k.a((Map) obj, (Map) obj2);
            }
            if (obj instanceof byte[]) {
                return k.a((byte[]) obj, (byte[]) obj2);
            }
            return k.a((Comparable) obj, (Comparable) obj2);
        }
    }

    public static int a(byte b2, byte b3) {
        if (b2 < b3) {
            return -1;
        }
        return b3 < b2 ? 1 : 0;
    }

    public static int a(double d2, double d3) {
        if (d2 < d3) {
            return -1;
        }
        return d3 < d2 ? 1 : 0;
    }

    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i2 < i ? 1 : 0;
    }

    public static int a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j2 < j ? 1 : 0;
    }

    public static int a(short s, short s2) {
        if (s < s2) {
            return -1;
        }
        return s2 < s ? 1 : 0;
    }

    private k() {
    }

    public static int a(boolean z, boolean z2) {
        return Boolean.valueOf(z).compareTo(Boolean.valueOf(z2));
    }

    public static int a(byte[] bArr, byte[] bArr2) {
        int a2 = a(bArr.length, bArr2.length);
        if (a2 != 0) {
            return a2;
        }
        for (int i = 0; i < bArr.length; i++) {
            int a3 = a(bArr[i], bArr2[i]);
            if (a3 != 0) {
                return a3;
            }
        }
        return 0;
    }

    public static int a(Set set, Set set2) {
        int a2 = a(set.size(), set2.size());
        if (a2 != 0) {
            return a2;
        }
        TreeSet treeSet = new TreeSet(f80853a);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(f80853a);
        treeSet2.addAll(set2);
        Iterator it2 = treeSet.iterator();
        Iterator it3 = treeSet2.iterator();
        while (it2.hasNext() && it3.hasNext()) {
            int compare = f80853a.compare(it2.next(), it3.next());
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    public static void a(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        int position = byteBuffer.position() + arrayOffset;
        int limit = arrayOffset + byteBuffer.limit();
        int i = limit - position > 128 ? position + SearchJediMixFeedAdapter.f42517f : limit;
        for (int i2 = position; i2 < i; i2++) {
            if (i2 > position) {
                sb.append(" ");
            }
            sb.append(a(array[i2]));
        }
        if (limit != i) {
            sb.append("...");
        }
    }

    public static String a(byte b2) {
        return Integer.toHexString((b2 | 256) & 511).toUpperCase().substring(1);
    }

    public static byte[] a(ByteBuffer byteBuffer) {
        if (b(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        a(byteBuffer, bArr, 0);
        return bArr;
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static boolean b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity()) {
            return true;
        }
        return false;
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (b(byteBuffer)) {
            return byteBuffer;
        }
        return ByteBuffer.wrap(a(byteBuffer));
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(new byte[byteBuffer.remaining()]);
        if (byteBuffer.hasArray()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), wrap.array(), 0, byteBuffer.remaining());
        } else {
            byteBuffer.slice().get(wrap.array());
        }
        return wrap;
    }

    public static int a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static int a(Object obj, Object obj2) {
        if (obj instanceof Comparable) {
            return a((Comparable) obj, (Comparable) obj2);
        }
        if (obj instanceof List) {
            return a((List) obj, (List) obj2);
        }
        if (obj instanceof Set) {
            return a((Set) obj, (Set) obj2);
        }
        if (obj instanceof Map) {
            return a((Map) obj, (Map) obj2);
        }
        if (obj instanceof byte[]) {
            return a((byte[]) obj, (byte[]) obj2);
        }
        throw new IllegalArgumentException("Cannot compare objects of type " + obj.getClass());
    }

    public static int a(String str, String str2) {
        return str.compareTo(str2);
    }

    public static int a(List list, List list2) {
        int a2 = a(list.size(), list2.size());
        if (a2 != 0) {
            return a2;
        }
        for (int i = 0; i < list.size(); i++) {
            int compare = f80853a.compare(list.get(i), list2.get(i));
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    public static int a(Map map, Map map2) {
        int a2 = a(map.size(), map2.size());
        if (a2 != 0) {
            return a2;
        }
        TreeMap treeMap = new TreeMap(f80853a);
        treeMap.putAll(map);
        Iterator it2 = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(f80853a);
        treeMap2.putAll(map2);
        Iterator it3 = treeMap2.entrySet().iterator();
        while (it2.hasNext() && it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Map.Entry entry2 = (Map.Entry) it3.next();
            int compare = f80853a.compare(entry.getKey(), entry2.getKey());
            if (compare != 0) {
                return compare;
            }
            int compare2 = f80853a.compare(entry.getValue(), entry2.getValue());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return 0;
    }

    public static int a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int remaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i, remaining);
        return remaining;
    }
}
