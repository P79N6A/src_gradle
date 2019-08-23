package com.bytedance.ies;

import android.content.Context;
import com.google.gson.GsonBuilder;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.WireTypeAdapterFactory;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import okio.Okio;

public final class b<M extends Message> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f20184a;

    /* renamed from: b  reason: collision with root package name */
    private final DefaultValueProtoAdapter<M> f20185b;

    /* renamed from: c  reason: collision with root package name */
    private final a<M> f20186c;

    /* renamed from: d  reason: collision with root package name */
    private final C0179b f20187d = null;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f20188e = false;

    public interface a<T> {
        T a();
    }

    /* renamed from: com.bytedance.ies.b$b  reason: collision with other inner class name */
    public interface C0179b {
        String a();
    }

    public final M a() {
        File a2 = a(this.f20184a);
        if (this.f20188e) {
            this.f20186c.a();
        }
        if (a2.exists()) {
            M a3 = a(a2, (M) null);
            if (a3 != null) {
                return a3;
            }
            M m = (Message) this.f20186c.a();
            M a4 = a(a2, m);
            if (a4 != null) {
                return a4;
            }
            return m;
        } else if (this.f20187d == null) {
            return (Message) this.f20186c.a();
        } else {
            M m2 = (Message) this.f20186c.a();
            try {
                String a5 = this.f20187d.a();
                WireTypeAdapterFactory wireTypeAdapterFactory = new WireTypeAdapterFactory();
                wireTypeAdapterFactory.registerDefaultValue(m2, null);
                M m3 = (Message) new GsonBuilder().registerTypeAdapterFactory(wireTypeAdapterFactory).create().fromJson(a5, m2.getClass());
                a(this.f20184a, (Message) m3);
                return m3;
            } catch (Throwable unused) {
                return m2;
            }
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static File a(Context context) {
        return new File(context.getFilesDir(), "ies_settings.pb");
    }

    private M a(File file, M m) {
        FileInputStream fileInputStream;
        M m2;
        M m3 = null;
        try {
            fileInputStream = new FileInputStream(file);
            if (m != null) {
                try {
                    m2 = (Message) this.f20185b.decode(new ProtoReader(Okio.buffer(Okio.source((InputStream) fileInputStream))), m);
                } catch (Throwable th) {
                    th = th;
                    a((Closeable) fileInputStream);
                    throw th;
                }
            } else {
                m2 = (Message) this.f20185b.decode((InputStream) fileInputStream);
            }
            m3 = m2;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            a((Closeable) fileInputStream);
            throw th;
        }
        a((Closeable) fileInputStream);
        return m3;
    }

    public static void a(Context context, Message message) {
        File a2 = a(context);
        FileOutputStream fileOutputStream = null;
        try {
            if (!a2.exists()) {
                a2.createNewFile();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(a2);
            try {
                message.encode((OutputStream) fileOutputStream2);
                a((Closeable) fileOutputStream2);
            } catch (FileNotFoundException unused) {
                fileOutputStream = fileOutputStream2;
                a((Closeable) fileOutputStream);
            } catch (IOException unused2) {
                fileOutputStream = fileOutputStream2;
                a((Closeable) fileOutputStream);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            a((Closeable) fileOutputStream);
        } catch (IOException unused4) {
            a((Closeable) fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            a((Closeable) fileOutputStream);
            throw th;
        }
    }

    public b(@Nonnull Context context, @Nonnull DefaultValueProtoAdapter<M> defaultValueProtoAdapter, @Nonnull a<M> aVar, @Nullable C0179b bVar, boolean z) {
        this.f20184a = context;
        this.f20185b = defaultValueProtoAdapter;
        this.f20186c = aVar;
    }
}
