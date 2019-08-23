package com.amap.api.mapcore2d;

import android.graphics.Bitmap;
import com.amap.api.maps2d.AMapException;
import com.amap.api.maps2d.model.TileProvider;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public class bw extends bj<ArrayList<bs>, ArrayList<bs>> {

    /* renamed from: b  reason: collision with root package name */
    private an f5795b;

    /* renamed from: f  reason: collision with root package name */
    private TileProvider f5796f;

    public Map<String, String> f() {
        return null;
    }

    /* access modifiers changed from: protected */
    public byte[] b() throws AMapException {
        if (this.f5796f != null) {
            return this.f5796f.getTile(((bs) ((ArrayList) this.f5748a).get(0)).f5777b, ((bs) ((ArrayList) this.f5748a).get(0)).f5778c, ((bs) ((ArrayList) this.f5748a).get(0)).f5779d).data;
        }
        return super.b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public ArrayList<bs> c() {
        ArrayList<bs> arrayList = new ArrayList<>();
        Iterator it2 = ((ArrayList) this.f5748a).iterator();
        while (it2.hasNext()) {
            arrayList.add(new bs((bs) it2.next()));
        }
        return arrayList;
    }

    public Map<String, String> e() {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", "AMAP_SDK_Android_2DMap_5.2.0");
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", new Object[]{"5.2.0", "2dmap"}));
        hashMap.put("X-INFO", cs.a(ar.f5624a));
        hashMap.put("key", cp.f(ar.f5624a));
        hashMap.put("logversion", "2.1");
        return hashMap;
    }

    public String g() {
        int i = ((bs) ((ArrayList) this.f5748a).get(0)).f5777b;
        int i2 = ((bs) ((ArrayList) this.f5748a).get(0)).f5778c;
        int i3 = ((bs) ((ArrayList) this.f5748a).get(0)).f5779d;
        if (q.i != 0 || i3 <= 9 || cl.a(i, i2, i3)) {
            int pow = (int) Math.pow(2.0d, (double) ((bs) ((ArrayList) this.f5748a).get(0)).f5779d);
            int i4 = ((bs) ((ArrayList) this.f5748a).get(0)).f5777b;
            if (i4 >= pow) {
                i4 -= pow;
            } else if (i4 < 0) {
                i4 += pow;
            }
            String a2 = this.f5795b.j.a(i4, i2, i3);
            ((bs) ((ArrayList) this.f5748a).get(0)).b();
            return a2;
        }
        return String.format(Locale.US, ax.a().d(), new Object[]{Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2)});
    }

    public void a(an anVar) {
        this.f5795b = anVar;
    }

    private byte[] a(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            cm.a(th, "TileServerHandler", "Bitmap2Bytes");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ArrayList<bs> a(byte[] bArr) throws AMapException {
        ArrayList<bs> arrayList = null;
        if (this.f5748a == null || bArr == null) {
            return null;
        }
        try {
            int size = ((ArrayList) this.f5748a).size();
            for (int i = 0; i < size; i++) {
                bs bsVar = (bs) ((ArrayList) this.f5748a).get(i);
                if (a(bArr, bsVar) < 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    bs bsVar2 = new bs(bsVar);
                    if (this.f5795b.h && bsVar2.f5779d > 9 && !cl.a(bsVar2.f5777b, bsVar2.f5778c, bsVar2.f5779d)) {
                        bsVar2.i = true;
                    }
                    arrayList.add(bsVar2);
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public bw(ArrayList<bs> arrayList, TileProvider tileProvider) {
        super(arrayList);
        this.f5796f = tileProvider;
        a(cw.a(ar.f5624a));
        a(5000);
        b(50000);
    }

    private void a(bs bsVar, int i) {
        if (bsVar != null && i >= 0 && this.f5795b != null && this.f5795b.p != null) {
            bn<bs> bnVar = this.f5795b.p;
            synchronized (this.f5795b) {
                int size = bnVar.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (i2 < bnVar.size()) {
                        bs bsVar2 = (bs) bnVar.get(i2);
                        if (bsVar2 != null && bsVar2.equals(bsVar)) {
                            bsVar2.h = i;
                            break;
                        }
                    }
                    i2++;
                }
            }
        }
    }

    public int a(byte[] bArr, bs bsVar) {
        int i;
        if (bsVar == null || bArr == null || this.f5795b == null || this.f5795b.n == null) {
            return -1;
        }
        try {
            i = this.f5795b.n.a(null, bArr, false, null, bsVar.c());
            if (i < 0) {
                return -1;
            }
            try {
                a(bsVar, i);
                if (this.f5795b == null) {
                    return i;
                }
                if (this.f5795b.f5602f) {
                    byte[] a2 = a(this.f5795b.n.a(i));
                    if (!(this.f5795b == null || this.f5795b.o == null)) {
                        this.f5795b.o.a(a2, bsVar);
                    }
                }
                return i;
            } catch (Throwable th) {
                th = th;
                cm.a(th, "TileServerHandler", "saveImgToMemory");
                return i;
            }
        } catch (Throwable th2) {
            th = th2;
            i = -1;
            cm.a(th, "TileServerHandler", "saveImgToMemory");
            return i;
        }
    }
}
