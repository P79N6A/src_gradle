package com.bytedance.android.livesdk.chatroom.d;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.ac;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

@RequiresApi(api = 21)
public class g extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9902a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f9903b = "g";

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f9904c = {"screenshot", ac.a((int) C0906R.string.djb), ac.a((int) C0906R.string.dhb)};
    private static final String[] g = {"width", "_data", "_size", "date_added"};

    /* renamed from: d  reason: collision with root package name */
    private Handler f9905d;

    /* renamed from: e  reason: collision with root package name */
    private int f9906e = 3;

    /* renamed from: f  reason: collision with root package name */
    private int f9907f;
    private ContentResolver h;
    private String i;

    public void onChange(boolean z, Uri uri) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), uri}, this, f9902a, false, 5358, new Class[]{Boolean.TYPE, Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), uri}, this, f9902a, false, 5358, new Class[]{Boolean.TYPE, Uri.class}, Void.TYPE);
            return;
        }
        super.onChange(z, uri);
        try {
            Cursor query = MediaStore.Images.Media.query(this.h, uri, g, "width>=" + this.f9907f, "date_added DESC");
            if (query != null) {
                if (!query.moveToFirst()) {
                    query.close();
                    return;
                }
                long currentTimeMillis = (System.currentTimeMillis() / 1000) - query.getLong(query.getColumnIndex("date_added"));
                if (currentTimeMillis < 0 || currentTimeMillis > 13) {
                    query.close();
                } else if (query.getLong(query.getColumnIndex("_size")) < 10) {
                    query.close();
                } else {
                    String string = query.getString(query.getColumnIndex("_data"));
                    query.close();
                    if (!TextUtils.isEmpty(string) && !string.equals(this.i)) {
                        this.i = string;
                        String lowerCase = string.toLowerCase();
                        for (String contains : f9904c) {
                            if (lowerCase.contains(contains)) {
                                this.f9905d.obtainMessage(this.f9906e, string).sendToTarget();
                                return;
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public g(Context context, Handler handler, int i2) {
        super(handler);
        this.f9905d = handler;
        this.h = context.getContentResolver();
        this.f9907f = context.getResources().getDisplayMetrics().widthPixels;
    }
}
