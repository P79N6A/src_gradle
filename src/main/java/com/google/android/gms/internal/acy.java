package com.google.android.gms.internal;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class acy {
    private final ByteBuffer zzcrY;

    private acy(ByteBuffer byteBuffer) {
        this.zzcrY = byteBuffer;
        this.zzcrY.order(ByteOrder.LITTLE_ENDIAN);
    }

    private acy(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    public static acy zzI(byte[] bArr) {
        return zzc(bArr, 0, bArr.length);
    }

    public static int zzJ(byte[] bArr) {
        return zzcv(bArr.length) + bArr.length;
    }

    private static int zza(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int length = charSequence.length();
        int i4 = i2 + i;
        int i5 = 0;
        while (i5 < length) {
            int i6 = i5 + i;
            if (i6 >= i4) {
                break;
            }
            char charAt = charSequence.charAt(i5);
            if (charAt >= 128) {
                break;
            }
            bArr[i6] = (byte) charAt;
            i5++;
        }
        if (i5 == length) {
            return i + length;
        }
        int i7 = i + i5;
        while (i5 < length) {
            char charAt2 = charSequence.charAt(i5);
            if (charAt2 < 128 && i7 < i4) {
                i3 = i7 + 1;
                bArr[i7] = (byte) charAt2;
            } else if (charAt2 < 2048 && i7 <= i4 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                i7 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 & '?') | 128);
                i5++;
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i7 <= i4 - 3) {
                int i9 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 >>> 12) | 480);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((charAt2 >>> 6) & 63) | SearchJediMixFeedAdapter.f42517f);
                i3 = i10 + 1;
                bArr[i10] = (byte) ((charAt2 & '?') | 128);
            } else if (i7 <= i4 - 4) {
                int i11 = i5 + 1;
                if (i11 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i11);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i12 = i7 + 1;
                        bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                        int i13 = i12 + 1;
                        bArr[i12] = (byte) (((codePoint >>> 12) & 63) | SearchJediMixFeedAdapter.f42517f);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((codePoint >>> 6) & 63) | SearchJediMixFeedAdapter.f42517f);
                        i7 = i14 + 1;
                        bArr[i14] = (byte) ((codePoint & 63) | SearchJediMixFeedAdapter.f42517f);
                        i5 = i11;
                        i5++;
                    } else {
                        i5 = i11;
                    }
                }
                StringBuilder sb = new StringBuilder(39);
                sb.append("Unpaired surrogate at index ");
                sb.append(i5 - 1);
                throw new IllegalArgumentException(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Failed writing ");
                sb2.append(charAt2);
                sb2.append(" at index ");
                sb2.append(i7);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            i7 = i3;
            i5++;
        }
        return i7;
    }

    private static void zza(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(zza(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (ArrayIndexOutOfBoundsException e2) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e2);
                throw bufferOverflowException;
            }
        } else {
            zzb(charSequence, byteBuffer);
        }
    }

    private final void zzaO(long j) throws IOException {
        while ((-128 & j) != 0) {
            zzcs((((int) j) & 127) | SearchJediMixFeedAdapter.f42517f);
            j >>>= 7;
        }
        zzcs((int) j);
    }

    public static int zzaP(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    private final void zzaQ(long j) throws IOException {
        if (this.zzcrY.remaining() >= 8) {
            this.zzcrY.putLong(j);
            return;
        }
        throw new acz(this.zzcrY.position(), this.zzcrY.limit());
    }

    private static long zzaR(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzb(int i, adg adg) {
        int zzct = zzct(i);
        int zzLT = adg.zzLT();
        return zzct + zzcv(zzLT) + zzLT;
    }

    private static int zzb(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static void zzb(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt >= 128) {
                if (charAt < 2048) {
                    i = (charAt >>> 6) | 960;
                } else if (charAt < 55296 || 57343 < charAt) {
                    byteBuffer.put((byte) ((charAt >>> 12) | 480));
                    i = ((charAt >>> 6) & 63) | SearchJediMixFeedAdapter.f42517f;
                } else {
                    int i3 = i2 + 1;
                    if (i3 != charSequence.length()) {
                        char charAt2 = charSequence.charAt(i3);
                        if (Character.isSurrogatePair(charAt, charAt2)) {
                            int codePoint = Character.toCodePoint(charAt, charAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | SearchJediMixFeedAdapter.f42517f));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | SearchJediMixFeedAdapter.f42517f));
                            byteBuffer.put((byte) ((codePoint & 63) | SearchJediMixFeedAdapter.f42517f));
                            i2 = i3;
                            i2++;
                        } else {
                            i2 = i3;
                        }
                    }
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unpaired surrogate at index ");
                    sb.append(i2 - 1);
                    throw new IllegalArgumentException(sb.toString());
                }
                byteBuffer.put((byte) i);
                charAt = (charAt & '?') | 128;
            }
            byteBuffer.put((byte) charAt);
            i2++;
        }
    }

    public static int zzc(int i, byte[] bArr) {
        return zzct(i) + zzJ(bArr);
    }

    public static acy zzc(byte[] bArr, int i, int i2) {
        return new acy(bArr, 0, i2);
    }

    public static int zzcr(int i) {
        if (i >= 0) {
            return zzcv(i);
        }
        return 10;
    }

    private final void zzcs(int i) throws IOException {
        byte b2 = (byte) i;
        if (this.zzcrY.hasRemaining()) {
            this.zzcrY.put(b2);
            return;
        }
        throw new acz(this.zzcrY.position(), this.zzcrY.limit());
    }

    public static int zzct(int i) {
        return zzcv(i << 3);
    }

    public static int zzcv(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int zzcw(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int zze(int i, long j) {
        return zzct(i) + zzaP(j);
    }

    public static int zzf(int i, long j) {
        return zzct(i) + zzaP(zzaR(j));
    }

    public static int zzhQ(String str) {
        int zzb = zzb((CharSequence) str);
        return zzcv(zzb) + zzb;
    }

    public static int zzm(int i, String str) {
        return zzct(i) + zzhQ(str);
    }

    public static int zzs(int i, int i2) {
        return zzct(i) + zzcr(i2);
    }

    public final void zzK(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.zzcrY.remaining() >= length) {
            this.zzcrY.put(bArr, 0, length);
            return;
        }
        throw new acz(this.zzcrY.position(), this.zzcrY.limit());
    }

    public final void zzLK() {
        if (this.zzcrY.remaining() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zza(int i, double d2) throws IOException {
        zzt(i, 1);
        zzaQ(Double.doubleToLongBits(d2));
    }

    public final void zza(int i, long j) throws IOException {
        zzt(i, 0);
        zzaO(j);
    }

    public final void zza(int i, adg adg) throws IOException {
        zzt(i, 2);
        zzb(adg);
    }

    public final void zzb(int i, long j) throws IOException {
        zzt(i, 0);
        zzaO(j);
    }

    public final void zzb(int i, byte[] bArr) throws IOException {
        zzt(i, 2);
        zzcu(bArr.length);
        zzK(bArr);
    }

    public final void zzb(adg adg) throws IOException {
        zzcu(adg.zzLS());
        adg.zza(this);
    }

    public final void zzc(int i, float f2) throws IOException {
        zzt(i, 5);
        int floatToIntBits = Float.floatToIntBits(f2);
        if (this.zzcrY.remaining() >= 4) {
            this.zzcrY.putInt(floatToIntBits);
            return;
        }
        throw new acz(this.zzcrY.position(), this.zzcrY.limit());
    }

    public final void zzc(int i, long j) throws IOException {
        zzt(i, 1);
        zzaQ(j);
    }

    public final void zzcu(int i) throws IOException {
        while ((i & -128) != 0) {
            zzcs((i & 127) | SearchJediMixFeedAdapter.f42517f);
            i >>>= 7;
        }
        zzcs(i);
    }

    public final void zzd(int i, long j) throws IOException {
        zzt(i, 0);
        zzaO(zzaR(j));
    }

    public final void zzk(int i, boolean z) throws IOException {
        zzt(i, 0);
        byte b2 = z ? (byte) 1 : 0;
        if (this.zzcrY.hasRemaining()) {
            this.zzcrY.put(b2);
            return;
        }
        throw new acz(this.zzcrY.position(), this.zzcrY.limit());
    }

    public final void zzl(int i, String str) throws IOException {
        zzt(i, 2);
        try {
            int zzcv = zzcv(str.length());
            if (zzcv == zzcv(str.length() * 3)) {
                int position = this.zzcrY.position();
                if (this.zzcrY.remaining() >= zzcv) {
                    this.zzcrY.position(position + zzcv);
                    zza((CharSequence) str, this.zzcrY);
                    int position2 = this.zzcrY.position();
                    this.zzcrY.position(position);
                    zzcu((position2 - position) - zzcv);
                    this.zzcrY.position(position2);
                    return;
                }
                throw new acz(position + zzcv, this.zzcrY.limit());
            }
            zzcu(zzb((CharSequence) str));
            zza((CharSequence) str, this.zzcrY);
        } catch (BufferOverflowException e2) {
            acz acz = new acz(this.zzcrY.position(), this.zzcrY.limit());
            acz.initCause(e2);
            throw acz;
        }
    }

    public final void zzr(int i, int i2) throws IOException {
        zzt(i, 0);
        if (i2 >= 0) {
            zzcu(i2);
        } else {
            zzaO((long) i2);
        }
    }

    public final void zzt(int i, int i2) throws IOException {
        zzcu((i << 3) | i2);
    }
}
