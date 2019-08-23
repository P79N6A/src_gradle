package com.bytedance.f;

import android.content.Context;
import com.ss.android.ugc.aweme.q.c;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static String f19627c = "TTVideoSettingsStoreKey";

    /* renamed from: f  reason: collision with root package name */
    private static a f19628f;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f19629a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f19630b;

    /* renamed from: d  reason: collision with root package name */
    public boolean f19631d = false;

    /* renamed from: e  reason: collision with root package name */
    private Context f19632e;
    private final ReentrantReadWriteLock g = new ReentrantReadWriteLock();
    private final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    private ArrayList<Object> i = new ArrayList<>();

    public static synchronized a a(Context context) throws JSONException {
        a aVar;
        synchronized (a.class) {
            if (f19628f == null) {
                f19628f = new a(context.getApplicationContext());
            }
            aVar = f19628f;
        }
        return aVar;
    }

    private a(Context context) throws JSONException {
        String str;
        this.f19632e = context;
        if (this.f19631d) {
            Context context2 = this.f19632e;
            String str2 = f19627c;
            if (str2 == null || str2.isEmpty()) {
                str = null;
            } else {
                if (b.f19635c == null) {
                    b.f19635c = c.a(context2, "com.video.ttvideosetting", 0);
                }
                str = b.f19635c.getString(str2, "");
            }
            if (str == null || str.isEmpty()) {
                this.f19629a = new JSONObject();
                this.f19630b = new JSONObject();
            } else {
                this.f19629a = new JSONObject(str);
                this.f19630b = new JSONObject(str);
            }
        }
    }
}
