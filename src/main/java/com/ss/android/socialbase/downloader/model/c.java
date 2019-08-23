package com.ss.android.socialbase.downloader.model;

import com.ss.android.socialbase.downloader.exception.BaseException;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public BufferedOutputStream f31065a;

    /* renamed from: b  reason: collision with root package name */
    public FileDescriptor f31066b;

    /* renamed from: c  reason: collision with root package name */
    public RandomAccessFile f31067c;

    public final void a() throws IOException {
        if (this.f31067c != null) {
            this.f31067c.close();
        }
        this.f31065a.close();
    }

    public c(File file) throws BaseException {
        try {
            this.f31067c = new RandomAccessFile(file, "rw");
            this.f31066b = this.f31067c.getFD();
            this.f31065a = new BufferedOutputStream(new FileOutputStream(this.f31067c.getFD()));
        } catch (IOException e2) {
            throw new BaseException(1039, (Throwable) e2);
        }
    }
}
