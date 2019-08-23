package com.facebook.imagepipeline.b;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.c;
import com.facebook.common.internal.k;
import com.facebook.common.memory.a;
import com.facebook.common.memory.d;
import com.facebook.imagepipeline.image.b;
import java.io.IOException;
import java.io.InputStream;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private int f23817a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f23818b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f23819c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f23820d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final a f23821e;
    public int mBestScanEndOffset = 0;
    public int mBestScanNumber = 0;
    public boolean mEndMarkerRead;

    private void a(int i) {
        if (this.f23820d > 0) {
            this.mBestScanEndOffset = i;
        }
        int i2 = this.f23820d;
        this.f23820d = i2 + 1;
        this.mBestScanNumber = i2;
    }

    public f(a aVar) {
        this.f23821e = (a) Preconditions.checkNotNull(aVar);
    }

    public final boolean parseMoreData(b bVar) {
        if (this.f23817a == 6 || bVar.getSize() <= this.f23819c) {
            return false;
        }
        d dVar = new d(bVar.getInputStream(), (byte[]) this.f23821e.get(16384), this.f23821e);
        try {
            com.facebook.common.f.d.a(dVar, (long) this.f23819c);
            return a((InputStream) dVar);
        } catch (IOException e2) {
            k.b(e2);
            return false;
        } finally {
            c.a(dVar);
        }
    }

    private boolean a(InputStream inputStream) {
        boolean z;
        int i = this.mBestScanNumber;
        while (this.f23817a != 6) {
            try {
                int read = inputStream.read();
                if (read != -1) {
                    this.f23819c++;
                    if (this.mEndMarkerRead) {
                        this.f23817a = 6;
                        this.mEndMarkerRead = false;
                        return false;
                    }
                    switch (this.f23817a) {
                        case 0:
                            if (read != 255) {
                                this.f23817a = 6;
                                break;
                            } else {
                                this.f23817a = 1;
                                break;
                            }
                        case 1:
                            if (read != 216) {
                                this.f23817a = 6;
                                break;
                            } else {
                                this.f23817a = 2;
                                break;
                            }
                        case 2:
                            if (read != 255) {
                                break;
                            } else {
                                this.f23817a = 3;
                                break;
                            }
                        case 3:
                            if (read != 255) {
                                if (read != 0) {
                                    if (read != 217) {
                                        if (read == 218) {
                                            a(this.f23819c - 2);
                                        }
                                        if (read == 1 || ((read >= 208 && read <= 215) || read == 217 || read == 216)) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        if (!z) {
                                            this.f23817a = 2;
                                            break;
                                        } else {
                                            this.f23817a = 4;
                                            break;
                                        }
                                    } else {
                                        this.mEndMarkerRead = true;
                                        a(this.f23819c - 2);
                                        this.f23817a = 2;
                                        break;
                                    }
                                } else {
                                    this.f23817a = 2;
                                    break;
                                }
                            } else {
                                this.f23817a = 3;
                                break;
                            }
                        case 4:
                            this.f23817a = 5;
                            break;
                        case 5:
                            int i2 = ((this.f23818b << 8) + read) - 2;
                            com.facebook.common.f.d.a(inputStream, (long) i2);
                            this.f23819c += i2;
                            this.f23817a = 2;
                            break;
                        default:
                            Preconditions.checkState(false);
                            break;
                    }
                    this.f23818b = read;
                } else if (this.f23817a != 6 || this.mBestScanNumber == i) {
                    return false;
                } else {
                    return true;
                }
            } catch (IOException e2) {
                k.b(e2);
            }
        }
        if (this.f23817a != 6) {
        }
        return false;
    }
}
