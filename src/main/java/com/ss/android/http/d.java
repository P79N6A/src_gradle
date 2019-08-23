package com.ss.android.http;

import android.os.Handler;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

public abstract class d {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f29161d = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f29162e = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f29163f = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
    public static final Logger g = Logger.getLogger(d.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public Handler f29164a;

    /* renamed from: b  reason: collision with root package name */
    public p f29165b;

    /* renamed from: c  reason: collision with root package name */
    public u f29166c;
    public final String h;
    public final int i;
    public volatile ServerSocket j;
    public q k;
    public Thread l;
    public a m;
    public t n;

    public interface a {
        void a();

        void a(b bVar);

        void b(b bVar);
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final InputStream f29169a;

        /* renamed from: b  reason: collision with root package name */
        final Socket f29170b;

        public final void run() {
            OutputStream outputStream;
            Exception e2;
            try {
                outputStream = this.f29170b.getOutputStream();
                try {
                    k kVar = new k(d.this.n.a(), this.f29169a, outputStream, this.f29170b.getInetAddress());
                    while (!this.f29170b.isClosed()) {
                        kVar.a();
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        if ((!(e2 instanceof SocketException) || !"NanoHttpd Shutdown".equals(e2.getMessage())) && !(e2 instanceof SocketTimeoutException)) {
                            d.g.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", e2);
                        }
                        d.a((Object) outputStream);
                        d.a((Object) this.f29169a);
                        d.a((Object) this.f29170b);
                        d.this.m.a(this);
                    } catch (Throwable th) {
                        th = th;
                        d.a((Object) outputStream);
                        d.a((Object) this.f29169a);
                        d.a((Object) this.f29170b);
                        d.this.m.a(this);
                        throw th;
                    }
                }
            } catch (Exception e4) {
                Exception exc = e4;
                outputStream = null;
                e2 = exc;
                d.g.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", e2);
                d.a((Object) outputStream);
                d.a((Object) this.f29169a);
                d.a((Object) this.f29170b);
                d.this.m.a(this);
            } catch (Throwable th2) {
                Throwable th3 = th2;
                outputStream = null;
                th = th3;
                d.a((Object) outputStream);
                d.a((Object) this.f29169a);
                d.a((Object) this.f29170b);
                d.this.m.a(this);
                throw th;
            }
            d.a((Object) outputStream);
            d.a((Object) this.f29169a);
            d.a((Object) this.f29170b);
            d.this.m.a(this);
        }

        public b(InputStream inputStream, Socket socket) {
            this.f29169a = inputStream;
            this.f29170b = socket;
        }
    }

    protected static class c {

        /* renamed from: e  reason: collision with root package name */
        private static final Pattern f29172e = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);

        /* renamed from: f  reason: collision with root package name */
        private static final Pattern f29173f = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
        private static final Pattern g = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

        /* renamed from: a  reason: collision with root package name */
        public final String f29174a;

        /* renamed from: b  reason: collision with root package name */
        public final String f29175b;

        /* renamed from: c  reason: collision with root package name */
        final String f29176c;

        /* renamed from: d  reason: collision with root package name */
        public final String f29177d;

        public final String a() {
            if (this.f29176c == null) {
                return "US-ASCII";
            }
            return this.f29176c;
        }

        public c(String str) {
            this.f29174a = str;
            if (str != null) {
                this.f29175b = a(str, f29172e, "", 1);
                this.f29176c = a(str, f29173f, null, 2);
            } else {
                this.f29175b = "";
                this.f29176c = "UTF-8";
            }
            if ("multipart/form-data".equalsIgnoreCase(this.f29175b)) {
                this.f29177d = a(str, g, null, 2);
            } else {
                this.f29177d = null;
            }
        }

        private static String a(String str, Pattern pattern, String str2, int i) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group(i);
            }
            return str2;
        }
    }

    /* renamed from: com.ss.android.http.d$d  reason: collision with other inner class name */
    public static class C0350d {

        /* renamed from: a  reason: collision with root package name */
        final String f29178a;

        /* renamed from: b  reason: collision with root package name */
        final String f29179b;

        /* renamed from: c  reason: collision with root package name */
        final String f29180c;
    }

    public class e implements Iterable<String> {

        /* renamed from: b  reason: collision with root package name */
        private final HashMap<String, String> f29182b = new HashMap<>();

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<C0350d> f29183c = new ArrayList<>();

        public final Iterator<String> iterator() {
            return this.f29182b.keySet().iterator();
        }

        public final void a(n nVar) {
            Iterator<C0350d> it2 = this.f29183c.iterator();
            while (it2.hasNext()) {
                C0350d next = it2.next();
                nVar.a("Set-Cookie", String.format("%s=%s; expires=%s", new Object[]{next.f29178a, next.f29179b, next.f29180c}));
            }
        }

        public e(Map<String, String> map) {
            String str = map.get("cookie");
            if (str != null) {
                for (String trim : str.split(";")) {
                    String[] split = trim.trim().split("=");
                    if (split.length == 2) {
                        this.f29182b.put(split[0], split[1]);
                    }
                }
            }
        }
    }

    public static class f implements a {

        /* renamed from: a  reason: collision with root package name */
        public final List<b> f29184a = Collections.synchronizedList(new ArrayList());

        /* renamed from: b  reason: collision with root package name */
        private long f29185b;

        public final void a() {
            Iterator it2 = new ArrayList(this.f29184a).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                d.a((Object) bVar.f29169a);
                d.a((Object) bVar.f29170b);
            }
        }

        public final void a(b bVar) {
            this.f29184a.remove(bVar);
        }

        public final void b(b bVar) {
            this.f29185b++;
            Thread thread = new Thread(bVar);
            thread.setDaemon(true);
            thread.setName("NanoHttpd Request Processor (#" + this.f29185b + ")");
            this.f29184a.add(bVar);
            thread.start();
        }
    }

    public static class g implements q {
        public final ServerSocket a() throws IOException {
            return new ServerSocket();
        }
    }

    public static class h implements r {

        /* renamed from: a  reason: collision with root package name */
        private final File f29186a;

        /* renamed from: b  reason: collision with root package name */
        private final OutputStream f29187b = new FileOutputStream(this.f29186a);

        public final String b() {
            return this.f29186a.getAbsolutePath();
        }

        public final void a() throws Exception {
            d.a((Object) this.f29187b);
            if (!this.f29186a.delete()) {
                throw new Exception("could not delete temporary file: " + this.f29186a.getAbsolutePath());
            }
        }

        public h(File file) throws IOException {
            this.f29186a = File.createTempFile("NanoHTTPD-", "", file);
        }
    }

    public static class i implements s {

        /* renamed from: a  reason: collision with root package name */
        private final File f29188a = new File(System.getProperty("java.io.tmpdir"));

        /* renamed from: b  reason: collision with root package name */
        private final List<r> f29189b;

        public final r b() throws Exception {
            h hVar = new h(this.f29188a);
            this.f29189b.add(hVar);
            return hVar;
        }

        public i() {
            if (!this.f29188a.exists()) {
                this.f29188a.mkdirs();
            }
            this.f29189b = new ArrayList();
        }

        public final void a() {
            for (r a2 : this.f29189b) {
                try {
                    a2.a();
                } catch (Exception e2) {
                    d.g.log(Level.WARNING, "could not delete file ", e2);
                }
            }
            this.f29189b.clear();
        }
    }

    class j implements t {
        public final s a() {
            return new i();
        }

        private j() {
        }

        /* synthetic */ j(d dVar, byte b2) {
            this();
        }
    }

    protected class k implements l {

        /* renamed from: b  reason: collision with root package name */
        private final s f29192b;

        /* renamed from: c  reason: collision with root package name */
        private final OutputStream f29193c;

        /* renamed from: d  reason: collision with root package name */
        private final BufferedInputStream f29194d;

        /* renamed from: e  reason: collision with root package name */
        private int f29195e;

        /* renamed from: f  reason: collision with root package name */
        private int f29196f;
        private String g;
        private m h;
        private Map<String, List<String>> i;
        private Map<String, String> j;
        private e k;
        private String l;
        private String m;
        private String n;
        private String o;

        public final Map<String, String> b() {
            return this.j;
        }

        public final m c() {
            return this.h;
        }

        public final String e() {
            return this.l;
        }

        public final void a(Map<String, String> map) throws IOException, o {
            RandomAccessFile randomAccessFile;
            long j2;
            DataOutput dataOutput;
            ByteArrayOutputStream byteArrayOutputStream;
            ByteBuffer byteBuffer;
            try {
                if (this.j.containsKey("content-length")) {
                    j2 = Long.parseLong(this.j.get("content-length"));
                } else {
                    j2 = this.f29195e < this.f29196f ? (long) (this.f29196f - this.f29195e) : 0;
                }
                if (j2 < 1024) {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    dataOutput = new DataOutputStream(byteArrayOutputStream2);
                    byteArrayOutputStream = byteArrayOutputStream2;
                    randomAccessFile = null;
                } else {
                    randomAccessFile = f();
                    byteArrayOutputStream = null;
                    dataOutput = randomAccessFile;
                }
                try {
                    byte[] bArr = new byte[512];
                    while (this.f29196f >= 0 && j2 > 0) {
                        this.f29196f = this.f29194d.read(bArr, 0, (int) Math.min(j2, 512));
                        j2 -= (long) this.f29196f;
                        if (this.f29196f > 0) {
                            dataOutput.write(bArr, 0, this.f29196f);
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        byteBuffer = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                    } else {
                        MappedByteBuffer map2 = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, randomAccessFile.length());
                        randomAccessFile.seek(0);
                        byteBuffer = map2;
                    }
                    if (m.POST.equals(this.h)) {
                        c cVar = new c(this.j.get("content-type"));
                        if (!"multipart/form-data".equalsIgnoreCase(cVar.f29175b)) {
                            byte[] bArr2 = new byte[byteBuffer.remaining()];
                            byteBuffer.get(bArr2);
                            String trim = new String(bArr2, cVar.a()).trim();
                            if ("application/x-www-form-urlencoded".equalsIgnoreCase(cVar.f29175b)) {
                                a(trim, this.i);
                            } else if (trim.length() != 0) {
                                map.put("postData", trim);
                            }
                        } else if (cVar.f29177d != null) {
                            a(cVar, byteBuffer, this.i, map);
                        } else {
                            throw new o(n.c.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                        }
                    } else if (m.PUT.equals(this.h)) {
                        map.put(PushConstants.CONTENT, a(byteBuffer, 0, byteBuffer.limit(), (String) null));
                    }
                    d.a((Object) randomAccessFile);
                } catch (Throwable th) {
                    th = th;
                    d.a((Object) randomAccessFile);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = null;
                d.a((Object) randomAccessFile);
                throw th;
            }
        }

        private RandomAccessFile f() {
            try {
                return new RandomAccessFile(this.f29192b.b().b(), "rw");
            } catch (Exception e2) {
                throw new Error(e2);
            }
        }

        @Deprecated
        public final Map<String, String> d() {
            HashMap hashMap = new HashMap();
            for (String next : this.i.keySet()) {
                hashMap.put(next, this.i.get(next).get(0));
            }
            return hashMap;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c0, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x022a, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x022c, code lost:
            r0 = e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01c0 A[ExcHandler: o (e com.ss.android.http.d$o), Splitter:B:1:0x0003] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x022a A[Catch:{ SSLException -> 0x01bc, IOException -> 0x01aa, SocketException -> 0x022c, SocketTimeoutException -> 0x022a, o -> 0x01c0, SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0, all -> 0x01be }, ExcHandler: SocketTimeoutException (e java.net.SocketTimeoutException), Splitter:B:1:0x0003] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x022c A[Catch:{ SSLException -> 0x01bc, IOException -> 0x01aa, SocketException -> 0x022c, SocketTimeoutException -> 0x022a, o -> 0x01c0, SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0, all -> 0x01be }, ExcHandler: SocketException (e java.net.SocketException), Splitter:B:1:0x0003] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:83:0x01c1=Splitter:B:83:0x01c1, B:87:0x01df=Splitter:B:87:0x01df} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() throws java.io.IOException {
            /*
                r7 = this;
                r0 = 8192(0x2000, float:1.14794E-41)
                r1 = 0
                byte[] r2 = new byte[r0]     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r3 = 0
                r7.f29195e = r3     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r7.f29196f = r3     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.io.BufferedInputStream r4 = r7.f29194d     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r4.mark(r0)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.io.BufferedInputStream r4 = r7.f29194d     // Catch:{ SSLException -> 0x01bc, IOException -> 0x01aa, SocketException -> 0x022c, SocketTimeoutException -> 0x022a, o -> 0x01c0 }
                int r4 = r4.read(r2, r3, r0)     // Catch:{ SSLException -> 0x01bc, IOException -> 0x01aa, SocketException -> 0x022c, SocketTimeoutException -> 0x022a, o -> 0x01c0 }
                r5 = -1
                if (r4 == r5) goto L_0x0198
            L_0x0018:
                if (r4 <= 0) goto L_0x0038
                int r5 = r7.f29196f     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                int r5 = r5 + r4
                r7.f29196f = r5     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                int r4 = r7.f29196f     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                int r4 = b(r2, r4)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r7.f29195e = r4     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                int r4 = r7.f29195e     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                if (r4 > 0) goto L_0x0038
                java.io.BufferedInputStream r4 = r7.f29194d     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                int r5 = r7.f29196f     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                int r6 = r7.f29196f     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                int r6 = 8192 - r6
                int r4 = r4.read(r2, r5, r6)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                goto L_0x0018
            L_0x0038:
                int r0 = r7.f29195e     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                int r4 = r7.f29196f     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                if (r0 >= r4) goto L_0x004b
                java.io.BufferedInputStream r0 = r7.f29194d     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r0.reset()     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.io.BufferedInputStream r0 = r7.f29194d     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                int r4 = r7.f29195e     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                long r4 = (long) r4     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r0.skip(r4)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
            L_0x004b:
                java.util.HashMap r0 = new java.util.HashMap     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r0.<init>()     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r7.i = r0     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.util.Map<java.lang.String, java.lang.String> r0 = r7.j     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                if (r0 != 0) goto L_0x005e
                java.util.HashMap r0 = new java.util.HashMap     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r0.<init>()     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r7.j = r0     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                goto L_0x0063
            L_0x005e:
                java.util.Map<java.lang.String, java.lang.String> r0 = r7.j     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r0.clear()     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
            L_0x0063:
                java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                int r6 = r7.f29196f     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r5.<init>(r2, r3, r6)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r4.<init>(r5)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r0.<init>(r4)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.util.HashMap r2 = new java.util.HashMap     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r2.<init>()     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r4 = r7.i     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.util.Map<java.lang.String, java.lang.String> r5 = r7.j     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r7.a((java.io.BufferedReader) r0, (java.util.Map<java.lang.String, java.lang.String>) r2, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r4, (java.util.Map<java.lang.String, java.lang.String>) r5)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.String r0 = r7.m     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                if (r0 == 0) goto L_0x0096
                java.util.Map<java.lang.String, java.lang.String> r0 = r7.j     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.String r4 = "remote-addr"
                java.lang.String r5 = r7.m     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r0.put(r4, r5)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.util.Map<java.lang.String, java.lang.String> r0 = r7.j     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.String r4 = "http-client-ip"
                java.lang.String r5 = r7.m     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r0.put(r4, r5)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
            L_0x0096:
                java.lang.String r0 = "method"
                java.lang.Object r0 = r2.get(r0)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                com.ss.android.http.d$m r0 = com.ss.android.http.d.m.lookup(r0)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r7.h = r0     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                com.ss.android.http.d$m r0 = r7.h     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                if (r0 == 0) goto L_0x0175
                java.lang.String r0 = "uri"
                java.lang.Object r0 = r2.get(r0)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r7.g = r0     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                com.ss.android.http.d$e r0 = new com.ss.android.http.d$e     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                com.ss.android.http.d r2 = com.ss.android.http.d.this     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.util.Map<java.lang.String, java.lang.String> r4 = r7.j     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r0.<init>(r4)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r7.k = r0     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.util.Map<java.lang.String, java.lang.String> r0 = r7.j     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.String r2 = "connection"
                java.lang.Object r0 = r0.get(r2)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.String r2 = "HTTP/1.1"
                java.lang.String r4 = r7.o     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                boolean r2 = r2.equals(r4)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r4 = 1
                if (r2 == 0) goto L_0x00de
                if (r0 == 0) goto L_0x00dc
                java.lang.String r2 = "(?i).*close.*"
                boolean r0 = r0.matches(r2)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                if (r0 != 0) goto L_0x00de
            L_0x00dc:
                r0 = 1
                goto L_0x00df
            L_0x00de:
                r0 = 0
            L_0x00df:
                com.ss.android.http.d r2 = com.ss.android.http.d.this     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                com.ss.android.http.d$n r2 = r2.a((com.ss.android.http.d.l) r7)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                if (r2 == 0) goto L_0x0154
                java.util.Map<java.lang.String, java.lang.String> r1 = r7.j     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                java.lang.String r5 = "accept-encoding"
                java.lang.Object r1 = r1.get(r5)     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                com.ss.android.http.d$e r5 = r7.k     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                r5.a(r2)     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                com.ss.android.http.d$m r5 = r7.h     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                r2.f29201e = r5     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                java.lang.String r5 = r2.f29198b     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                if (r5 == 0) goto L_0x011c
                java.lang.String r5 = r2.f29198b     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                java.lang.String r5 = r5.toLowerCase()     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                java.lang.String r6 = "text/"
                boolean r5 = r5.contains(r6)     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                if (r5 != 0) goto L_0x011a
                java.lang.String r5 = r2.f29198b     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                java.lang.String r5 = r5.toLowerCase()     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                java.lang.String r6 = "/json"
                boolean r5 = r5.contains(r6)     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                if (r5 == 0) goto L_0x011c
            L_0x011a:
                r5 = 1
                goto L_0x011d
            L_0x011c:
                r5 = 0
            L_0x011d:
                if (r5 == 0) goto L_0x012a
                if (r1 == 0) goto L_0x012a
                java.lang.String r5 = "gzip"
                boolean r1 = r1.contains(r5)     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                if (r1 == 0) goto L_0x012a
                r3 = 1
            L_0x012a:
                r2.g = r3     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                r2.h = r0     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                java.io.OutputStream r1 = r7.f29193c     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                r2.a((java.io.OutputStream) r1)     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                if (r0 == 0) goto L_0x014c
                java.lang.String r0 = "close"
                java.lang.String r1 = "connection"
                java.lang.String r1 = r2.a((java.lang.String) r1)     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                boolean r0 = r0.equals(r1)     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                if (r0 != 0) goto L_0x014c
                com.ss.android.http.d.a((java.lang.Object) r2)
            L_0x0146:
                com.ss.android.http.d$s r0 = r7.f29192b
                r0.a()
                return
            L_0x014c:
                java.net.SocketException r0 = new java.net.SocketException     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                java.lang.String r1 = "NanoHttpd Shutdown"
                r0.<init>(r1)     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                throw r0     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
            L_0x0154:
                com.ss.android.http.d$o r0 = new com.ss.android.http.d$o     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                com.ss.android.http.d$n$c r1 = com.ss.android.http.d.n.c.INTERNAL_ERROR     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                java.lang.String r3 = "SERVER INTERNAL ERROR: Serve() returned a null response."
                r0.<init>(r1, r3)     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
                throw r0     // Catch:{ SocketException -> 0x0171, SocketTimeoutException -> 0x016d, SSLException -> 0x0169, IOException -> 0x0165, o -> 0x0162, all -> 0x015e }
            L_0x015e:
                r0 = move-exception
                r1 = r2
                goto L_0x022e
            L_0x0162:
                r0 = move-exception
                r1 = r2
                goto L_0x01c1
            L_0x0165:
                r0 = move-exception
                r1 = r2
                goto L_0x01df
            L_0x0169:
                r0 = move-exception
                r1 = r2
                goto L_0x0205
            L_0x016d:
                r0 = move-exception
                r1 = r2
                goto L_0x022b
            L_0x0171:
                r0 = move-exception
                r1 = r2
                goto L_0x022d
            L_0x0175:
                com.ss.android.http.d$o r0 = new com.ss.android.http.d$o     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                com.ss.android.http.d$n$c r3 = com.ss.android.http.d.n.c.BAD_REQUEST     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.String r5 = "BAD REQUEST: Syntax error. HTTP verb "
                r4.<init>(r5)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.String r5 = "method"
                java.lang.Object r2 = r2.get(r5)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r4.append(r2)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.String r2 = " unhandled."
                r4.append(r2)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.String r2 = r4.toString()     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                r0.<init>(r3, r2)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                throw r0     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
            L_0x0198:
                java.io.BufferedInputStream r0 = r7.f29194d     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                com.ss.android.http.d.a((java.lang.Object) r0)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.io.OutputStream r0 = r7.f29193c     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                com.ss.android.http.d.a((java.lang.Object) r0)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.net.SocketException r0 = new java.net.SocketException     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.String r2 = "NanoHttpd Shutdown"
                r0.<init>(r2)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                throw r0     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
            L_0x01aa:
                java.io.BufferedInputStream r0 = r7.f29194d     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                com.ss.android.http.d.a((java.lang.Object) r0)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.io.OutputStream r0 = r7.f29193c     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                com.ss.android.http.d.a((java.lang.Object) r0)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.net.SocketException r0 = new java.net.SocketException     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                java.lang.String r2 = "NanoHttpd Shutdown"
                r0.<init>(r2)     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
                throw r0     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
            L_0x01bc:
                r0 = move-exception
                throw r0     // Catch:{ SocketException -> 0x022c, SocketTimeoutException -> 0x022a, SSLException -> 0x0204, IOException -> 0x01de, o -> 0x01c0 }
            L_0x01be:
                r0 = move-exception
                goto L_0x022e
            L_0x01c0:
                r0 = move-exception
            L_0x01c1:
                com.ss.android.http.d$n$c r2 = r0.getStatus()     // Catch:{ all -> 0x01be }
                java.lang.String r3 = "text/plain"
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01be }
                com.ss.android.http.d$n r0 = com.ss.android.http.d.a(r2, r3, r0)     // Catch:{ all -> 0x01be }
                java.io.OutputStream r2 = r7.f29193c     // Catch:{ all -> 0x01be }
                r0.a((java.io.OutputStream) r2)     // Catch:{ all -> 0x01be }
                java.io.OutputStream r0 = r7.f29193c     // Catch:{ all -> 0x01be }
                com.ss.android.http.d.a((java.lang.Object) r0)     // Catch:{ all -> 0x01be }
            L_0x01d9:
                com.ss.android.http.d.a((java.lang.Object) r1)
                goto L_0x0146
            L_0x01de:
                r0 = move-exception
            L_0x01df:
                com.ss.android.http.d$n$c r2 = com.ss.android.http.d.n.c.INTERNAL_ERROR     // Catch:{ all -> 0x01be }
                java.lang.String r3 = "text/plain"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
                java.lang.String r5 = "SERVER INTERNAL ERROR: IOException: "
                r4.<init>(r5)     // Catch:{ all -> 0x01be }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01be }
                r4.append(r0)     // Catch:{ all -> 0x01be }
                java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01be }
                com.ss.android.http.d$n r0 = com.ss.android.http.d.a(r2, r3, r0)     // Catch:{ all -> 0x01be }
                java.io.OutputStream r2 = r7.f29193c     // Catch:{ all -> 0x01be }
                r0.a((java.io.OutputStream) r2)     // Catch:{ all -> 0x01be }
                java.io.OutputStream r0 = r7.f29193c     // Catch:{ all -> 0x01be }
                com.ss.android.http.d.a((java.lang.Object) r0)     // Catch:{ all -> 0x01be }
                goto L_0x01d9
            L_0x0204:
                r0 = move-exception
            L_0x0205:
                com.ss.android.http.d$n$c r2 = com.ss.android.http.d.n.c.INTERNAL_ERROR     // Catch:{ all -> 0x01be }
                java.lang.String r3 = "text/plain"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
                java.lang.String r5 = "SSL PROTOCOL FAILURE: "
                r4.<init>(r5)     // Catch:{ all -> 0x01be }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01be }
                r4.append(r0)     // Catch:{ all -> 0x01be }
                java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01be }
                com.ss.android.http.d$n r0 = com.ss.android.http.d.a(r2, r3, r0)     // Catch:{ all -> 0x01be }
                java.io.OutputStream r2 = r7.f29193c     // Catch:{ all -> 0x01be }
                r0.a((java.io.OutputStream) r2)     // Catch:{ all -> 0x01be }
                java.io.OutputStream r0 = r7.f29193c     // Catch:{ all -> 0x01be }
                com.ss.android.http.d.a((java.lang.Object) r0)     // Catch:{ all -> 0x01be }
                goto L_0x01d9
            L_0x022a:
                r0 = move-exception
            L_0x022b:
                throw r0     // Catch:{ all -> 0x01be }
            L_0x022c:
                r0 = move-exception
            L_0x022d:
                throw r0     // Catch:{ all -> 0x01be }
            L_0x022e:
                com.ss.android.http.d.a((java.lang.Object) r1)
                com.ss.android.http.d$s r1 = r7.f29192b
                r1.a()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.http.d.k.a():void");
        }

        private static int a(byte[] bArr, int i2) {
            while (bArr[i2] != 10) {
                i2++;
            }
            return i2 + 1;
        }

        private static int b(byte[] bArr, int i2) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i4 >= i2) {
                    return 0;
                }
                if (bArr[i3] == 13 && bArr[i4] == 10) {
                    int i5 = i3 + 3;
                    if (i5 < i2 && bArr[i3 + 2] == 13 && bArr[i5] == 10) {
                        return i3 + 4;
                    }
                }
                if (bArr[i3] == 10 && bArr[i4] == 10) {
                    return i3 + 2;
                }
                i3 = i4;
            }
        }

        private void a(String str, Map<String, List<String>> map) {
            String str2;
            String str3;
            if (str == null) {
                this.l = "";
                return;
            }
            this.l = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf >= 0) {
                    str3 = d.a(nextToken.substring(0, indexOf)).trim();
                    str2 = d.a(nextToken.substring(indexOf + 1));
                } else {
                    str3 = d.a(nextToken).trim();
                    str2 = "";
                }
                List list = map.get(str3);
                if (list == null) {
                    list = new ArrayList();
                    map.put(str3, list);
                }
                list.add(str2);
            }
        }

        private String a(ByteBuffer byteBuffer, int i2, int i3, String str) {
            String str2 = "";
            if (i3 > 0) {
                FileOutputStream fileOutputStream = null;
                try {
                    r b2 = this.f29192b.b();
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(b2.b());
                    try {
                        FileChannel channel = fileOutputStream2.getChannel();
                        duplicate.position(i2).limit(i2 + i3);
                        channel.write(duplicate.slice());
                        str2 = b2.b();
                        d.a((Object) fileOutputStream2);
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        try {
                            throw new Error(e);
                        } catch (Throwable th) {
                            th = th;
                            d.a((Object) fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        d.a((Object) fileOutputStream);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    throw new Error(e);
                }
            }
            return str2;
        }

        private void a(BufferedReader bufferedReader, Map<String, String> map, Map<String, List<String>> map2, Map<String, String> map3) throws o {
            String str;
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                    if (stringTokenizer.hasMoreTokens()) {
                        map.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, stringTokenizer.nextToken());
                        if (stringTokenizer.hasMoreTokens()) {
                            String nextToken = stringTokenizer.nextToken();
                            int indexOf = nextToken.indexOf(63);
                            if (indexOf >= 0) {
                                a(nextToken.substring(indexOf + 1), map2);
                                str = d.a(nextToken.substring(0, indexOf));
                            } else {
                                str = d.a(nextToken);
                            }
                            if (stringTokenizer.hasMoreTokens()) {
                                this.o = stringTokenizer.nextToken();
                            } else {
                                this.o = "HTTP/1.1";
                                d.g.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                            }
                            String readLine2 = bufferedReader.readLine();
                            while (readLine2 != null && !readLine2.trim().isEmpty()) {
                                int indexOf2 = readLine2.indexOf(58);
                                if (indexOf2 >= 0) {
                                    map3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                                }
                                readLine2 = bufferedReader.readLine();
                            }
                            map.put("uri", str);
                            return;
                        }
                        throw new o(n.c.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                    }
                    throw new o(n.c.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
            } catch (IOException e2) {
                n.c cVar = n.c.INTERNAL_ERROR;
                throw new o(cVar, "SERVER INTERNAL ERROR: IOException: " + e2.getMessage(), e2);
            }
        }

        private void a(c cVar, ByteBuffer byteBuffer, Map<String, List<String>> map, Map<String, String> map2) throws o {
            int[] iArr;
            int i2;
            int i3;
            c cVar2 = cVar;
            ByteBuffer byteBuffer2 = byteBuffer;
            Map<String, List<String>> map3 = map;
            Map<String, String> map4 = map2;
            try {
                byte[] bytes = cVar2.f29177d.getBytes();
                int i4 = 0;
                int[] iArr2 = new int[0];
                int i5 = 1;
                if (byteBuffer.remaining() < bytes.length) {
                    iArr = iArr2;
                } else {
                    byte[] bArr = new byte[(bytes.length + 4096)];
                    if (byteBuffer.remaining() < bArr.length) {
                        i3 = byteBuffer.remaining();
                    } else {
                        i3 = bArr.length;
                    }
                    byteBuffer2.get(bArr, 0, i3);
                    int length = i3 - bytes.length;
                    int[] iArr3 = iArr2;
                    int i6 = 0;
                    while (true) {
                        iArr = iArr3;
                        int i7 = 0;
                        while (i7 < length) {
                            int[] iArr4 = iArr;
                            int i8 = 0;
                            while (i8 < bytes.length && bArr[i7 + i8] == bytes[i8]) {
                                if (i8 == bytes.length - 1) {
                                    int[] iArr5 = new int[(iArr4.length + 1)];
                                    System.arraycopy(iArr4, 0, iArr5, 0, iArr4.length);
                                    iArr5[iArr4.length] = i6 + i7;
                                    iArr4 = iArr5;
                                }
                                i8++;
                            }
                            i7++;
                            iArr = iArr4;
                        }
                        i6 += length;
                        System.arraycopy(bArr, bArr.length - bytes.length, bArr, 0, bytes.length);
                        length = bArr.length - bytes.length;
                        if (byteBuffer.remaining() < length) {
                            length = byteBuffer.remaining();
                        }
                        byteBuffer2.get(bArr, bytes.length, length);
                        if (length <= 0) {
                            break;
                        }
                        iArr3 = iArr;
                    }
                }
                int i9 = 2;
                if (iArr.length >= 2) {
                    int i10 = 1024;
                    byte[] bArr2 = new byte[1024];
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < iArr.length - i5) {
                        byteBuffer2.position(iArr[i11]);
                        if (byteBuffer.remaining() < i10) {
                            i2 = byteBuffer.remaining();
                        } else {
                            i2 = 1024;
                        }
                        byteBuffer2.get(bArr2, i4, i2);
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr2, i4, i2), Charset.forName(cVar.a())), i2);
                        String readLine = bufferedReader.readLine();
                        if (readLine == null || !readLine.contains(cVar2.f29177d)) {
                            throw new o(n.c.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
                        }
                        String readLine2 = bufferedReader.readLine();
                        String str = null;
                        int i13 = i12;
                        String str2 = null;
                        String str3 = null;
                        int i14 = 2;
                        while (readLine2 != null && readLine2.trim().length() > 0) {
                            Matcher matcher = d.f29161d.matcher(readLine2);
                            if (matcher.matches()) {
                                Matcher matcher2 = d.f29163f.matcher(matcher.group(i9));
                                while (matcher2.find()) {
                                    String group = matcher2.group(i5);
                                    if ("name".equalsIgnoreCase(group)) {
                                        str = matcher2.group(2);
                                    } else if ("filename".equalsIgnoreCase(group)) {
                                        str2 = matcher2.group(2);
                                        if (!str2.isEmpty()) {
                                            if (i13 > 0) {
                                                str = str + String.valueOf(i13);
                                                i13++;
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }
                                    i5 = 1;
                                }
                            }
                            Matcher matcher3 = d.f29162e.matcher(readLine2);
                            if (matcher3.matches()) {
                                str3 = matcher3.group(2).trim();
                            }
                            readLine2 = bufferedReader.readLine();
                            i14++;
                            i9 = 2;
                            i5 = 1;
                        }
                        int i15 = 0;
                        while (true) {
                            int i16 = i14 - 1;
                            if (i14 <= 0) {
                                break;
                            }
                            i15 = a(bArr2, i15);
                            i14 = i16;
                        }
                        if (i15 < i2 - 4) {
                            int i17 = iArr[i11] + i15;
                            i11++;
                            int i18 = iArr[i11] - 4;
                            byteBuffer2.position(i17);
                            List list = map3.get(str);
                            if (list == null) {
                                list = new ArrayList();
                                map3.put(str, list);
                            }
                            if (str3 == null) {
                                byte[] bArr3 = new byte[(i18 - i17)];
                                byteBuffer2.get(bArr3);
                                list.add(new String(bArr3, cVar.a()));
                            } else {
                                try {
                                    String a2 = a(byteBuffer2, i17, i18 - i17, str2);
                                    if (!map4.containsKey(str)) {
                                        map4.put(str, a2);
                                    } else {
                                        int i19 = 2;
                                        while (true) {
                                            if (!map4.containsKey(str + i19)) {
                                                break;
                                            }
                                            i19++;
                                        }
                                        map4.put(str + i19, a2);
                                    }
                                    list.add(str2);
                                } catch (o e2) {
                                    e = e2;
                                    throw e;
                                } catch (Exception e3) {
                                    e = e3;
                                    throw new o(n.c.INTERNAL_ERROR, e.toString());
                                }
                            }
                            i12 = i13;
                            i10 = 1024;
                            i4 = 0;
                            i9 = 2;
                            i5 = 1;
                        } else {
                            throw new o(n.c.INTERNAL_ERROR, "Multipart header size exceeds MAX_HEADER_SIZE.");
                        }
                    }
                    return;
                }
                throw new o(n.c.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
            } catch (o e4) {
                e = e4;
                throw e;
            } catch (Exception e5) {
                e = e5;
                throw new o(n.c.INTERNAL_ERROR, e.toString());
            }
        }

        public k(s sVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            String str;
            String str2;
            this.f29192b = sVar;
            this.f29194d = new BufferedInputStream(inputStream, 8192);
            this.f29193c = outputStream;
            if (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) {
                str = "127.0.0.1";
            } else {
                str = inetAddress.getHostAddress().toString();
            }
            this.m = str;
            if (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) {
                str2 = "localhost";
            } else {
                str2 = inetAddress.getHostName().toString();
            }
            this.n = str2;
            this.j = new HashMap();
        }
    }

    public interface l {
        void a(Map<String, String> map) throws IOException, o;

        Map<String, String> b();

        m c();

        @Deprecated
        Map<String, String> d();

        String e();
    }

    public enum m {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS,
        TRACE,
        CONNECT,
        PATCH,
        PROPFIND,
        PROPPATCH,
        MKCOL,
        MOVE,
        COPY,
        LOCK,
        UNLOCK;

        static m lookup(String str) {
            if (str == null) {
                return null;
            }
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static class n implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public b f29197a;

        /* renamed from: b  reason: collision with root package name */
        public String f29198b;

        /* renamed from: c  reason: collision with root package name */
        public InputStream f29199c;

        /* renamed from: d  reason: collision with root package name */
        public final Map<String, String> f29200d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        public m f29201e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f29202f;
        public boolean g;
        public boolean h;
        private long i;
        private final Map<String, String> j = new HashMap<String, String>() {
            public final String put(String str, String str2) {
                String str3;
                Map<String, String> map = n.this.f29200d;
                if (str == null) {
                    str3 = str;
                } else {
                    str3 = str.toLowerCase();
                }
                map.put(str3, str2);
                return (String) super.put(str, str2);
            }
        };

        static class a extends FilterOutputStream {
            public final void a() throws IOException {
                this.out.write("0\r\n\r\n".getBytes());
            }

            public a(OutputStream outputStream) {
                super(outputStream);
            }

            public final void write(byte[] bArr) throws IOException {
                write(bArr, 0, bArr.length);
            }

            public final void write(int i) throws IOException {
                write(new byte[]{(byte) i}, 0, 1);
            }

            public final void write(byte[] bArr, int i, int i2) throws IOException {
                if (i2 != 0) {
                    this.out.write(String.format("%x\r\n", new Object[]{Integer.valueOf(i2)}).getBytes());
                    this.out.write(bArr, i, i2);
                    this.out.write("\r\n".getBytes());
                }
            }
        }

        public interface b {
            String getDescription();
        }

        public enum c implements b {
            SWITCH_PROTOCOL(BaseLoginOrRegisterActivity.o, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(201, "Created"),
            ACCEPTED(202, "Accepted"),
            NO_CONTENT(204, "No Content"),
            PARTIAL_CONTENT(206, "Partial Content"),
            MULTI_STATUS(207, "Multi-Status"),
            REDIRECT(301, "Moved Permanently"),
            FOUND(302, "Found"),
            REDIRECT_SEE_OTHER(303, "See Other"),
            NOT_MODIFIED(304, "Not Modified"),
            TEMPORARY_REDIRECT(307, "Temporary Redirect"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(401, "Unauthorized"),
            FORBIDDEN(403, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
            NOT_ACCEPTABLE(406, "Not Acceptable"),
            REQUEST_TIMEOUT(408, "Request Timeout"),
            CONFLICT(409, "Conflict"),
            GONE(410, "Gone"),
            LENGTH_REQUIRED(411, "Length Required"),
            PRECONDITION_FAILED(412, "Precondition Failed"),
            PAYLOAD_TOO_LARGE(413, "Payload Too Large"),
            UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
            RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
            EXPECTATION_FAILED(417, "Expectation Failed"),
            TOO_MANY_REQUESTS(429, "Too Many Requests"),
            INTERNAL_ERROR(500, "Internal Server Error"),
            NOT_IMPLEMENTED(501, "Not Implemented"),
            SERVICE_UNAVAILABLE(503, "Service Unavailable"),
            UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");
            
            private final String description;
            private final int requestStatus;

            public final int getRequestStatus() {
                return this.requestStatus;
            }

            public final String getDescription() {
                return this.requestStatus + " " + this.description;
            }

            public static c lookup(int i) {
                for (c cVar : values()) {
                    if (cVar.getRequestStatus() == i) {
                        return cVar;
                    }
                }
                return null;
            }

            private c(int i, String str) {
                this.requestStatus = i;
                this.description = str;
            }
        }

        public final void close() throws IOException {
            if (this.f29199c != null) {
                this.f29199c.close();
            }
        }

        public final String a(String str) {
            return this.f29200d.get(str.toLowerCase());
        }

        /* access modifiers changed from: protected */
        public final void a(OutputStream outputStream) {
            long j2;
            String str;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            try {
                if (this.f29197a != null) {
                    PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream, new c(this.f29198b).a())), false);
                    printWriter.append("HTTP/1.1 ").append(this.f29197a.getDescription()).append(" \r\n");
                    if (this.f29198b != null) {
                        a(printWriter, "Content-Type", this.f29198b);
                    }
                    if (a("date") == null) {
                        a(printWriter, "Date", simpleDateFormat.format(new Date()));
                    }
                    for (Map.Entry next : this.j.entrySet()) {
                        a(printWriter, (String) next.getKey(), (String) next.getValue());
                    }
                    if (a("connection") == null) {
                        if (this.h) {
                            str = "keep-alive";
                        } else {
                            str = "close";
                        }
                        a(printWriter, "Connection", str);
                    }
                    if (a("content-length") != null) {
                        this.g = false;
                    }
                    if (this.g) {
                        a(printWriter, "Content-Encoding", "gzip");
                        this.f29202f = true;
                    }
                    if (this.f29199c != null) {
                        j2 = this.i;
                    } else {
                        j2 = 0;
                    }
                    if (this.f29201e != m.HEAD && this.f29202f) {
                        a(printWriter, "Transfer-Encoding", "chunked");
                    } else if (!this.g) {
                        j2 = a(printWriter, j2);
                    }
                    printWriter.append("\r\n");
                    printWriter.flush();
                    if (this.f29201e == m.HEAD || !this.f29202f) {
                        a(outputStream, j2);
                    } else {
                        a aVar = new a(outputStream);
                        a((OutputStream) aVar, -1);
                        aVar.a();
                    }
                    outputStream.flush();
                    d.a((Object) this.f29199c);
                    return;
                }
                throw new Error("sendResponse(): Status can't be null.");
            } catch (IOException e2) {
                d.g.log(Level.SEVERE, "Could not send response to the client", e2);
            }
        }

        public final void a(String str, String str2) {
            this.j.put(str, str2);
        }

        private void a(OutputStream outputStream, long j2) throws IOException {
            if (this.g) {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                b(gZIPOutputStream, -1);
                gZIPOutputStream.finish();
                return;
            }
            b(outputStream, j2);
        }

        private long a(PrintWriter printWriter, long j2) {
            String a2 = a("content-length");
            if (a2 != null) {
                try {
                    j2 = Long.parseLong(a2);
                } catch (NumberFormatException unused) {
                    Logger logger = d.g;
                    logger.severe("content-length was no number " + a2);
                }
            }
            printWriter.print("Content-Length: " + j2 + "\r\n");
            return j2;
        }

        private void b(OutputStream outputStream, long j2) throws IOException {
            boolean z;
            byte[] bArr = new byte[16384];
            if (j2 == -1) {
                z = true;
            } else {
                z = false;
            }
            while (true) {
                if (j2 > 0 || z) {
                    long j3 = 16384;
                    if (!z) {
                        j3 = Math.min(j2, 16384);
                    }
                    int read = this.f29199c.read(bArr, 0, (int) j3);
                    if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        if (!z) {
                            j2 -= (long) read;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        private static void a(PrintWriter printWriter, String str, String str2) {
            printWriter.append(str).append(": ").append(str2).append("\r\n");
        }

        protected n(b bVar, String str, InputStream inputStream, long j2) {
            this.f29197a = bVar;
            this.f29198b = str;
            boolean z = false;
            if (inputStream == null) {
                this.f29199c = new ByteArrayInputStream(new byte[0]);
                this.i = 0;
            } else {
                this.f29199c = inputStream;
                this.i = j2;
            }
            this.f29202f = this.i < 0 ? true : z;
            this.h = true;
        }
    }

    public static final class o extends Exception {
        private static final long serialVersionUID = 6569838532917408380L;
        private final n.c status;

        public final n.c getStatus() {
            return this.status;
        }

        public o(n.c cVar, String str) {
            super(str);
            this.status = cVar;
        }

        public o(n.c cVar, String str, Exception exc) {
            super(str, exc);
            this.status = cVar;
        }
    }

    public class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public IOException f29203a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f29204b;

        /* renamed from: d  reason: collision with root package name */
        private final int f29206d;

        public final void run() {
            InetSocketAddress inetSocketAddress;
            try {
                ServerSocket serverSocket = d.this.j;
                if (d.this.h != null) {
                    inetSocketAddress = new InetSocketAddress(d.this.h, d.this.i);
                } else {
                    inetSocketAddress = new InetSocketAddress(d.this.i);
                }
                serverSocket.bind(inetSocketAddress);
                this.f29204b = true;
                do {
                    try {
                        Socket accept = d.this.j.accept();
                        if (this.f29206d > 0) {
                            accept.setSoTimeout(this.f29206d);
                        }
                        d.this.m.b(new b(accept.getInputStream(), accept));
                    } catch (IOException e2) {
                        d.g.log(Level.FINE, "Communication with the client broken", e2);
                    }
                } while (!d.this.j.isClosed());
            } catch (IOException e3) {
                this.f29203a = e3;
            }
        }

        public p(int i) {
            this.f29206d = i;
        }
    }

    public interface q {
        ServerSocket a() throws IOException;
    }

    public interface r {
        void a() throws Exception;

        String b();
    }

    public interface s {
        void a();

        r b() throws Exception;
    }

    public interface t {
        s a();
    }

    public interface u {
    }

    public final boolean c() {
        if (this.j == null || this.l == null) {
            return false;
        }
        return true;
    }

    public void b() {
        try {
            a((Object) this.j);
            this.m.a();
            if (this.l != null) {
                this.l.join();
            }
            if (this.f29164a != null) {
                this.f29164a.removeCallbacksAndMessages(null);
            }
        } catch (Exception e2) {
            g.log(Level.SEVERE, "Could not stop all connections", e2);
        }
    }

    public void a() throws IOException {
        b(5000, true);
    }

    public d(int i2) {
        this(null, i2);
    }

    private p a(int i2) {
        return new p(i2);
    }

    protected static String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e2) {
            g.log(Level.WARNING, "Encoding not supported, ignored", e2);
            return null;
        }
    }

    public static final void a(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else if (obj instanceof ServerSocket) {
                    ((ServerSocket) obj).close();
                } else {
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e2) {
                g.log(Level.SEVERE, "Could not close", e2);
            }
        }
    }

    public n a(l lVar) {
        HashMap hashMap = new HashMap();
        m c2 = lVar.c();
        if (m.PUT.equals(c2) || m.POST.equals(c2)) {
            try {
                lVar.a(hashMap);
            } catch (IOException e2) {
                n.c cVar = n.c.INTERNAL_ERROR;
                return a(cVar, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e2.getMessage());
            } catch (o e3) {
                return a(e3.getStatus(), "text/plain", e3.getMessage());
            }
        }
        lVar.d().put("NanoHttpd.QUERY_STRING", lVar.e());
        return a(n.c.NOT_FOUND, "text/plain", "Not Found");
    }

    private d(String str, int i2) {
        this.f29164a = new Handler();
        this.k = new g();
        this.h = null;
        this.i = i2;
        this.n = new j(this, (byte) 0);
        this.m = new f();
    }

    private void b(final int i2, boolean z) throws IOException {
        this.f29165b = a(i2, true);
        this.f29164a.postDelayed(new Runnable() {
            public final void run() {
                try {
                    if (d.this.l == null || !d.this.l.isAlive()) {
                        if (!d.this.j.isClosed()) {
                            d.a((Object) d.this.j);
                        }
                        d.this.f29165b = d.this.a(i2, true);
                    }
                    d.this.f29164a.postDelayed(this, 300000);
                } catch (Exception unused) {
                }
            }
        }, 300000);
        while (!this.f29165b.f29204b && this.f29165b.f29203a == null) {
            try {
                Thread.sleep(10);
            } catch (Throwable unused) {
            }
        }
        if (this.f29165b.f29203a != null) {
            throw this.f29165b.f29203a;
        }
    }

    public final p a(int i2, boolean z) throws IOException {
        this.j = this.k.a();
        this.j.setReuseAddress(true);
        p a2 = a(i2);
        this.l = new Thread(a2);
        this.l.setDaemon(z);
        this.l.setName("NanoHttpd Main Listener");
        this.l.start();
        return a2;
    }

    public static n a(n.b bVar, String str, String str2) {
        byte[] bArr;
        c cVar = new c(str);
        if (str2 == null) {
            return a(bVar, str, new ByteArrayInputStream(new byte[0]), 0);
        }
        try {
            if (!Charset.forName(cVar.a()).newEncoder().canEncode(str2) && cVar.f29176c == null) {
                cVar = new c(cVar.f29174a + "; charset=UTF-8");
            }
            bArr = str2.getBytes(cVar.a());
        } catch (UnsupportedEncodingException e2) {
            g.log(Level.SEVERE, "encoding problem, responding nothing", e2);
            bArr = new byte[0];
        }
        return a(bVar, cVar.f29174a, new ByteArrayInputStream(bArr), (long) bArr.length);
    }

    public static n a(n.b bVar, String str, InputStream inputStream, long j2) {
        n nVar = new n(bVar, str, inputStream, j2);
        return nVar;
    }
}
