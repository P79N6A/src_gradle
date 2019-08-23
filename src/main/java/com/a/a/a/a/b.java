package com.a.a.a.a;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.zip.ZipFile;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<File, ZipFile> f1810a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    ByteBuffer f1811b = ByteBuffer.allocate(4);

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, a> f1812c = new HashMap<>();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final File f1813a;

        /* renamed from: b  reason: collision with root package name */
        public final String f1814b;

        /* renamed from: c  reason: collision with root package name */
        public final String f1815c;

        /* renamed from: d  reason: collision with root package name */
        public long f1816d;

        /* renamed from: e  reason: collision with root package name */
        public int f1817e;

        /* renamed from: f  reason: collision with root package name */
        public long f1818f;
        public long g;
        public long h;
        public long i;
        public long j = -1;

        public final AssetFileDescriptor a() {
            if (this.f1817e == 0) {
                try {
                    AssetFileDescriptor assetFileDescriptor = new AssetFileDescriptor(ParcelFileDescriptor.open(this.f1813a, 268435456), this.j, this.i);
                    return assetFileDescriptor;
                } catch (FileNotFoundException unused) {
                }
            }
            return null;
        }

        public final void a(RandomAccessFile randomAccessFile, ByteBuffer byteBuffer) throws IOException {
            long j2 = this.f1816d;
            try {
                randomAccessFile.seek(j2);
                randomAccessFile.readFully(byteBuffer.array());
                if (byteBuffer.getInt(0) == 67324752) {
                    this.j = j2 + 30 + ((long) (byteBuffer.getShort(26) & 65535)) + ((long) (byteBuffer.getShort(28) & 65535));
                    return;
                }
                throw new IOException();
            } catch (FileNotFoundException unused) {
            } catch (IOException unused2) {
            }
        }

        public a(String str, File file, String str2) {
            this.f1814b = str2;
            this.f1815c = str;
            this.f1813a = file;
        }
    }

    public b(String str) throws IOException {
        b(str);
    }

    private static int a(RandomAccessFile randomAccessFile) throws EOFException, IOException {
        int readInt = randomAccessFile.readInt();
        return ((readInt & 255) << 24) + ((65280 & readInt) << 8) + ((16711680 & readInt) >>> 8) + ((readInt >>> 24) & 255);
    }

    public final AssetFileDescriptor a(String str) {
        a aVar = this.f1812c.get(str);
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) throws IOException {
        String str2 = str;
        File file = new File(str2);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        long length = randomAccessFile.length();
        if (length >= 22) {
            long j = 65557;
            if (65557 > length) {
                j = length;
            }
            randomAccessFile.seek(0);
            int a2 = a(randomAccessFile);
            if (a2 == 101010256) {
                throw new IOException();
            } else if (a2 == 67324752) {
                randomAccessFile.seek(length - j);
                ByteBuffer allocate = ByteBuffer.allocate((int) j);
                byte[] array = allocate.array();
                randomAccessFile.readFully(array);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                int length2 = array.length - 22;
                while (length2 >= 0 && (array[length2] != 80 || allocate.getInt(length2) != 101010256)) {
                    length2--;
                }
                short s = allocate.getShort(length2 + 8);
                long j2 = ((long) allocate.getInt(length2 + 12)) & 4294967295L;
                long j3 = ((long) allocate.getInt(length2 + 16)) & 4294967295L;
                if (j3 + j2 > length) {
                    throw new IOException();
                } else if (s != 0) {
                    MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, j3, j2);
                    map.order(ByteOrder.LITTLE_ENDIAN);
                    short s2 = 65535;
                    byte[] bArr = new byte[65535];
                    ByteBuffer allocate2 = ByteBuffer.allocate(30);
                    allocate2.order(ByteOrder.LITTLE_ENDIAN);
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < s) {
                        if (map.getInt(i3) == 33639248) {
                            short s3 = map.getShort(i3 + 28) & s2;
                            short s4 = map.getShort(i3 + 30) & s2;
                            short s5 = map.getShort(i3 + 32) & s2;
                            map.position(i3 + 46);
                            map.get(bArr, i, s3);
                            map.position(i);
                            String str3 = new String(bArr, i, s3);
                            a aVar = new a(str2, file, str3);
                            aVar.f1817e = map.getShort(i3 + 10) & s2;
                            aVar.f1818f = ((long) map.getInt(i3 + 12)) & 4294967295L;
                            aVar.g = map.getLong(i3 + 16) & 4294967295L;
                            aVar.h = map.getLong(i3 + 20) & 4294967295L;
                            aVar.i = map.getLong(i3 + 24) & 4294967295L;
                            aVar.f1816d = ((long) map.getInt(i3 + 42)) & 4294967295L;
                            allocate2.clear();
                            aVar.a(randomAccessFile, allocate2);
                            this.f1812c.put(str3, aVar);
                            i3 += s3 + 46 + s4 + s5;
                            i2++;
                            bArr = bArr;
                            s2 = 65535;
                            i = 0;
                        } else {
                            throw new IOException();
                        }
                    }
                } else {
                    throw new IOException();
                }
            } else {
                throw new IOException();
            }
        } else {
            throw new IOException();
        }
    }
}
