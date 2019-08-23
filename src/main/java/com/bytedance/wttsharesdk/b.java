package com.bytedance.wttsharesdk;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class b extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private String f22926a = "";

    /* renamed from: b  reason: collision with root package name */
    private a f22927b;

    class a extends AsyncTask<d, Object, C0244b> {
        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            super.onPreExecute();
        }

        private a() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            C0244b bVar = (C0244b) obj;
            super.onPostExecute(bVar);
            if (bVar.f22929a) {
                b.this.a();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C0244b doInBackground(d... dVarArr) {
            d dVar = dVarArr[0];
            C0244b bVar = new C0244b(b.this, (byte) 0);
            try {
                if (a.a(b.this) && dVar.mMultiImageEntity != null) {
                    ArrayList<Uri> arrayList = new ArrayList<>();
                    Iterator<Uri> it2 = dVar.mMultiImageEntity.f22936a.iterator();
                    while (it2.hasNext()) {
                        String a2 = a.a(b.this, it2.next(), 0);
                        if (!TextUtils.isEmpty(a2)) {
                            arrayList.add(Uri.fromFile(new File(a2)));
                        }
                    }
                    dVar.mMultiImageEntity.f22936a = arrayList;
                }
                bVar.f22930b = dVar;
                bVar.f22929a = true;
            } catch (Exception unused) {
                bVar.f22929a = false;
            }
            return bVar;
        }

        /* synthetic */ a(b bVar, byte b2) {
            this();
        }
    }

    /* renamed from: com.bytedance.wttsharesdk.b$b  reason: collision with other inner class name */
    class C0244b {

        /* renamed from: a  reason: collision with root package name */
        boolean f22929a;

        /* renamed from: b  reason: collision with root package name */
        d f22930b;

        private C0244b() {
        }

        /* synthetic */ C0244b(b bVar, byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    public final void a() {
        try {
            Intent intent = getIntent();
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(a.b(this), "com.ss.android.publish.send.TTSendPostActivity"));
            if (Build.VERSION.SDK_INT >= 11) {
                intent2.addFlags(32768);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                intent2.addFlags(67108864);
                intent2.addFlags(536870912);
            }
            intent2.putExtra("bundle_forbid_splash_ad_from_inner_app", true);
            intent2.putExtras(intent.getExtras());
            startActivity(intent2);
        } catch (Exception unused) {
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
        } else if (extras.getInt("share_result_code", -1) != -1) {
            finish();
        } else {
            this.f22926a = extras.getString("toutiao_share_startactivity");
            d dVar = new d();
            dVar.toObject(extras);
            if (dVar.mMultiImageEntity == null) {
                a();
                return;
            }
            if (this.f22927b != null) {
                this.f22927b.cancel(true);
            }
            this.f22927b = new a(this, (byte) 0);
            this.f22927b.execute(new d[]{dVar});
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
