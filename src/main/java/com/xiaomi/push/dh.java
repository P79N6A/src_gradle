package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.xiaomi.push.service.ag;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class dh {

    /* renamed from: a  reason: collision with root package name */
    private static volatile dh f81928a;

    /* renamed from: a  reason: collision with other field name */
    private Context f253a;

    /* renamed from: a  reason: collision with other field name */
    private dg f254a;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with other field name */
    public final ArrayList<a> f255a;

    /* renamed from: a  reason: collision with other field name */
    private final HashMap<String, df> f256a = new HashMap<>();

    /* renamed from: a  reason: collision with other field name */
    private ThreadPoolExecutor f257a;

    public static abstract class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private int f81929a = 0;

        /* renamed from: a  reason: collision with other field name */
        protected df f258a;

        /* renamed from: a  reason: collision with other field name */
        private a f259a;

        /* renamed from: a  reason: collision with other field name */
        private String f260a;

        /* renamed from: a  reason: collision with other field name */
        private WeakReference<Context> f261a;

        /* renamed from: a  reason: collision with other field name */
        private Random f262a = new Random();

        /* renamed from: b  reason: collision with root package name */
        protected String f81930b;

        public a(String str) {
            this.f260a = str;
        }

        public SQLiteDatabase a() {
            return this.f258a.getWritableDatabase();
        }

        /* renamed from: a  reason: collision with other method in class */
        public Object m173a() {
            return null;
        }

        /* renamed from: a  reason: collision with other method in class */
        public String m174a() {
            return this.f260a;
        }

        /* access modifiers changed from: package-private */
        public void a(Context context) {
            if (this.f259a != null) {
                this.f259a.a(context, a());
            }
            b(context);
        }

        public abstract void a(Context context, SQLiteDatabase sQLiteDatabase);

        public void a(Context context, Object obj) {
            dh.a(context).a(this);
        }

        /* access modifiers changed from: package-private */
        public void a(df dfVar, Context context) {
            this.f258a = dfVar;
            this.f81930b = this.f258a.a();
            this.f261a = new WeakReference<>(context);
        }

        public void a(a aVar) {
            this.f259a = aVar;
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m175a() {
            return this.f258a == null || TextUtils.isEmpty(this.f81930b) || this.f261a == null;
        }

        public void b(Context context) {
        }

        public final void run() {
            if (this.f261a != null) {
                Context context = (Context) this.f261a.get();
                if (context != null && context.getFilesDir() != null && this.f258a != null && !TextUtils.isEmpty(this.f260a)) {
                    File file = new File(this.f260a);
                    w.a(context, new File(file.getParentFile(), ay.b(file.getAbsolutePath())), new dj(this, context));
                }
            }
        }
    }

    public static abstract class b<T> extends a {

        /* renamed from: a  reason: collision with root package name */
        private int f81931a;

        /* renamed from: a  reason: collision with other field name */
        private String f263a;

        /* renamed from: a  reason: collision with other field name */
        private List<String> f264a;

        /* renamed from: a  reason: collision with other field name */
        private String[] f265a;

        /* renamed from: b  reason: collision with root package name */
        private List<T> f81932b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private String f81933c;

        /* renamed from: d  reason: collision with root package name */
        private String f81934d;

        /* renamed from: e  reason: collision with root package name */
        private String f81935e;

        public b(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i) {
            super(str);
            this.f264a = list;
            this.f263a = str2;
            this.f265a = strArr;
            this.f81933c = str3;
            this.f81934d = str4;
            this.f81935e = str5;
            this.f81931a = i;
        }

        public SQLiteDatabase a() {
            return this.f258a.getReadableDatabase();
        }

        public abstract T a(Context context, Cursor cursor);

        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            this.f81932b.clear();
            String str = null;
            if (this.f264a == null || this.f264a.size() <= 0) {
                strArr = null;
            } else {
                String[] strArr2 = new String[this.f264a.size()];
                this.f264a.toArray(strArr2);
                strArr = strArr2;
            }
            if (this.f81931a > 0) {
                str = String.valueOf(this.f81931a);
            }
            Cursor query = sQLiteDatabase.query(this.f81930b, strArr, this.f263a, this.f265a, this.f81933c, this.f81934d, this.f81935e, str);
            if (query != null && query.moveToFirst()) {
                do {
                    Object a2 = a(context, query);
                    if (a2 != null) {
                        this.f81932b.add(a2);
                    }
                } while (query.moveToNext());
                query.close();
            }
            a(context, this.f81932b);
        }

        public abstract void a(Context context, List<T> list);
    }

    public static class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<a> f81936a = new ArrayList<>();

        public c(String str, ArrayList<a> arrayList) {
            super(str);
            this.f81936a.addAll(arrayList);
        }

        public final void a(Context context) {
            super.a(context);
            Iterator<a> it2 = this.f81936a.iterator();
            while (it2.hasNext()) {
                a next = it2.next();
                if (next != null) {
                    next.a(context);
                }
            }
        }

        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            Iterator<a> it2 = this.f81936a.iterator();
            while (it2.hasNext()) {
                a next = it2.next();
                if (next != null) {
                    next.a(context, sQLiteDatabase);
                }
            }
        }
    }

    public static class d extends a {

        /* renamed from: a  reason: collision with root package name */
        private String f81937a;

        /* renamed from: a  reason: collision with other field name */
        protected String[] f266a;

        public d(String str, String str2, String[] strArr) {
            super(str);
            this.f81937a = str2;
            this.f266a = strArr;
        }

        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.delete(this.f81930b, this.f81937a, this.f266a);
        }
    }

    public static class e extends a {

        /* renamed from: a  reason: collision with root package name */
        private ContentValues f81938a;

        public e(String str, ContentValues contentValues) {
            super(str);
            this.f81938a = contentValues;
        }

        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.insert(this.f81930b, null, this.f81938a);
        }
    }

    private dh(Context context) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f257a = threadPoolExecutor;
        this.f255a = new ArrayList<>();
        this.f253a = context;
    }

    private df a(String str) {
        df dfVar = this.f256a.get(str);
        if (dfVar == null) {
            synchronized (this.f256a) {
                if (dfVar == null) {
                    try {
                        dfVar = this.f254a.a(this.f253a, str);
                        this.f256a.put(str, dfVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return dfVar;
    }

    public static dh a(Context context) {
        if (f81928a == null) {
            synchronized (dh.class) {
                try {
                    if (f81928a == null) {
                        f81928a = new dh(context);
                    }
                } catch (Throwable th) {
                    Class<dh> cls = dh.class;
                    throw th;
                }
            }
        }
        return f81928a;
    }

    private void a() {
        aj.a(this.f253a).b(new di(this), ag.a(this.f253a).a(ip.StatDataProcessFrequency.a(), 5));
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m172a(String str) {
        return a(str).a();
    }

    public void a(a aVar) {
        df dfVar;
        if (aVar != null) {
            if (this.f254a != null) {
                String a2 = aVar.a();
                synchronized (this.f256a) {
                    dfVar = this.f256a.get(a2);
                    if (dfVar == null) {
                        dfVar = this.f254a.a(this.f253a, a2);
                        this.f256a.put(a2, dfVar);
                    }
                }
                if (!this.f257a.isShutdown()) {
                    aVar.a(dfVar, this.f253a);
                    synchronized (this.f255a) {
                        this.f255a.add(aVar);
                        a();
                    }
                }
            } else {
                throw new IllegalStateException("should exec init method first!");
            }
        }
    }

    public void a(Runnable runnable) {
        if (!this.f257a.isShutdown()) {
            this.f257a.execute(runnable);
        }
    }

    public void a(ArrayList<a> arrayList) {
        if (this.f254a != null) {
            HashMap hashMap = new HashMap();
            if (!this.f257a.isShutdown()) {
                Iterator<a> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    a next = it2.next();
                    if (next.a()) {
                        next.a(a(next.a()), this.f253a);
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get(next.a());
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        hashMap.put(next.a(), arrayList2);
                    }
                    arrayList2.add(next);
                }
                for (String str : hashMap.keySet()) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        c cVar = new c(str, arrayList3);
                        cVar.a(((a) arrayList3.get(0)).f258a, this.f253a);
                        this.f257a.execute(cVar);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("should exec setDbHelperFactory method first!");
    }

    public void b(a aVar) {
        df dfVar;
        if (aVar != null) {
            if (this.f254a != null) {
                String a2 = aVar.a();
                synchronized (this.f256a) {
                    dfVar = this.f256a.get(a2);
                    if (dfVar == null) {
                        dfVar = this.f254a.a(this.f253a, a2);
                        this.f256a.put(a2, dfVar);
                    }
                }
                if (!this.f257a.isShutdown()) {
                    aVar.a(dfVar, this.f253a);
                    a((Runnable) aVar);
                    return;
                }
                return;
            }
            throw new IllegalStateException("should exec init method first!");
        }
    }
}
