package com.huawei.android.pushselfshow.richpush.favorites;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.richpush.html.HtmlViewer;
import com.huawei.android.pushselfshow.utils.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FavoritesActivity implements c.a {

    /* renamed from: a  reason: collision with root package name */
    com.huawei.android.pushselfshow.utils.c f25229a = new com.huawei.android.pushselfshow.utils.c(this);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Activity f25230b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public ImageView f25231c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public TextView f25232d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public TextView f25233e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public ListView f25234f;
    private LinearLayout g;
    /* access modifiers changed from: private */
    public a h;
    /* access modifiers changed from: private */
    public MenuItem i;
    private MenuItem j;
    /* access modifiers changed from: private */
    public boolean k;
    private byte[] l;
    private byte[] m;
    private AlertDialog n;

    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        private Context f25236b;

        private a(Context context) {
            this.f25236b = context;
        }

        /* synthetic */ a(FavoritesActivity favoritesActivity, Context context, b bVar) {
            this(context);
        }

        public void onClick(View view) {
            if (FavoritesActivity.this.k) {
                FavoritesActivity.this.e();
                return;
            }
            ActionBar actionBar = FavoritesActivity.this.f25230b.getActionBar();
            if (actionBar != null) {
                actionBar.setDisplayShowHomeEnabled(true);
                actionBar.setDisplayHomeAsUpEnabled(true);
                actionBar.setDisplayShowTitleEnabled(true);
                actionBar.setDisplayShowCustomEnabled(false);
                actionBar.setTitle(this.f25236b.getString(com.huawei.android.pushselfshow.utils.d.a(this.f25236b, "hwpush_msg_collect")));
            }
            FavoritesActivity.this.f25231c.setVisibility(4);
            FavoritesActivity.this.f25233e.setVisibility(8);
            FavoritesActivity.this.f25233e.setText("");
            FavoritesActivity.this.f25232d.setText(this.f25236b.getString(com.huawei.android.pushselfshow.utils.d.a(this.f25236b, "hwpush_msg_collect")));
            FavoritesActivity.this.a(false);
            FavoritesActivity.this.h.a(true);
            FavoritesActivity.this.f25234f.setOnItemClickListener(new d(FavoritesActivity.this, null));
            FavoritesActivity.this.f25234f.setLongClickable(true);
        }
    }

    class b implements AdapterView.OnItemClickListener {

        /* renamed from: b  reason: collision with root package name */
        private Context f25238b;

        private b(Context context) {
            this.f25238b = context;
        }

        /* synthetic */ b(FavoritesActivity favoritesActivity, Context context, b bVar) {
            this(context);
        }

        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            CheckBox checkBox = (CheckBox) view.findViewById(com.huawei.android.pushselfshow.utils.d.e(this.f25238b, "hwpush_delCheck"));
            e a2 = FavoritesActivity.this.h.getItem(i);
            if (checkBox.isChecked()) {
                checkBox.setChecked(false);
                a2.a(false);
            } else {
                checkBox.setChecked(true);
                a2.a(true);
            }
            FavoritesActivity.this.h.a(i, a2);
            List<e> a3 = FavoritesActivity.this.h.a();
            int i2 = 0;
            for (e a4 : a3) {
                if (a4.a()) {
                    i2++;
                }
            }
            if (i2 > 0) {
                FavoritesActivity.this.f25233e.setVisibility(0);
                FavoritesActivity.this.f25233e.setText(String.valueOf(i2));
                FavoritesActivity.this.i.setEnabled(true);
                if (i2 == a3.size()) {
                    FavoritesActivity.this.a(this.f25238b, true);
                } else {
                    FavoritesActivity.this.a(this.f25238b, false);
                }
            } else {
                FavoritesActivity.this.f25233e.setVisibility(8);
                FavoritesActivity.this.f25233e.setText("");
                FavoritesActivity.this.i.setEnabled(false);
                FavoritesActivity.this.a(this.f25238b, false);
            }
        }
    }

    class c implements AdapterView.OnItemLongClickListener {
        private c() {
        }

        /* synthetic */ c(FavoritesActivity favoritesActivity, b bVar) {
            this();
        }

        public boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
            FavoritesActivity.this.d();
            FavoritesActivity.this.i.setEnabled(true);
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(i));
            FavoritesActivity.this.h.a(false, (Set) hashSet);
            FavoritesActivity.this.f25233e.setVisibility(0);
            FavoritesActivity.this.f25233e.setText(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            return true;
        }
    }

    class d implements AdapterView.OnItemClickListener {
        private d() {
        }

        /* synthetic */ d(FavoritesActivity favoritesActivity, b bVar) {
            this();
        }

        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            e a2 = FavoritesActivity.this.h.getItem(i);
            Intent intent = new Intent("com.huawei.android.push.intent.RICHPUSH");
            intent.putExtra("type", a2.b().E);
            intent.putExtra("selfshow_info", a2.b().c());
            intent.putExtra("selfshow_token", a2.b().d());
            intent.putExtra("selfshow_from_list", true);
            intent.setFlags(268468240);
            intent.setPackage(FavoritesActivity.this.f25230b.getPackageName());
            FavoritesActivity.this.f25230b.finish();
            FavoritesActivity.this.f25230b.startActivity(intent);
        }
    }

    private View a() {
        View inflate = this.f25230b.getLayoutInflater().inflate(com.huawei.android.pushselfshow.utils.d.c(this.f25230b, "hwpush_collection_listview"), null);
        this.f25234f = (ListView) inflate.findViewById(com.huawei.android.pushselfshow.utils.d.e(this.f25230b, "hwpush_collection_list"));
        this.h = new a(this.f25230b);
        this.f25234f.setAdapter(this.h);
        this.f25234f.setLongClickable(true);
        this.f25234f.setOnItemLongClickListener(new c(this, null));
        this.f25234f.setOnItemClickListener(new d(this, null));
        return inflate;
    }

    /* access modifiers changed from: private */
    public void a(Context context, boolean z) {
        String str;
        String str2;
        if (z) {
            this.j.setTitle(com.huawei.android.pushselfshow.utils.d.a(context, "hwpush_unselectall"));
            Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), com.huawei.android.pushselfshow.utils.d.g(context, "hwpush_ic_toolbar_multiple1"));
            try {
                int identifier = context.getResources().getIdentifier("colorful_emui", "color", "androidhwext");
                if (identifier != 0) {
                    int color = context.getResources().getColor(identifier);
                    if (color != 0) {
                        a2.setTint(color);
                    }
                }
            } catch (Resources.NotFoundException e2) {
                str2 = "PushSelfShowLog";
                str = e2.toString();
                e.d(str2, str);
                this.j.setIcon(a2);
                return;
            } catch (Exception e3) {
                str2 = "PushSelfShowLog";
                str = e3.toString();
                e.d(str2, str);
                this.j.setIcon(a2);
                return;
            }
            this.j.setIcon(a2);
            return;
        }
        this.j.setIcon(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), com.huawei.android.pushselfshow.utils.d.g(context, "hwpush_ic_toolbar_multiple")));
        this.j.setTitle(com.huawei.android.pushselfshow.utils.d.a(context, "hwpush_selectall"));
    }

    private void a(View view) {
        int i2;
        this.f25231c = (ImageView) view.findViewById(com.huawei.android.pushselfshow.utils.d.e(this.f25230b, "hwpush_bt_delete"));
        this.f25232d = (TextView) view.findViewById(com.huawei.android.pushselfshow.utils.d.e(this.f25230b, "hwpush_txt_delitem"));
        this.f25233e = (TextView) view.findViewById(com.huawei.android.pushselfshow.utils.d.e(this.f25230b, "hwpush_txt_delnum"));
        com.huawei.android.pushselfshow.utils.a.a((Context) this.f25230b, this.f25232d);
        com.huawei.android.pushselfshow.utils.a.a((Context) this.f25230b, this.f25233e);
        if (com.huawei.android.pushselfshow.utils.a.d()) {
            int j2 = com.huawei.android.pushselfshow.utils.a.j(this.f25230b);
            if (-1 != j2) {
                if (j2 == 0) {
                    i2 = this.f25230b.getResources().getColor(com.huawei.android.pushselfshow.utils.d.f(this.f25230b, "hwpush_black"));
                    this.f25231c.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(this.f25230b.getResources(), com.huawei.android.pushselfshow.utils.d.g(this.f25230b, "hwpush_ic_cancel_light")));
                    this.f25233e.setBackground(com.ss.android.ugc.bytex.a.a.a.a(this.f25230b.getResources(), com.huawei.android.pushselfshow.utils.d.g(this.f25230b, "hwpush_pic_ab_number_light")));
                } else {
                    i2 = this.f25230b.getResources().getColor(com.huawei.android.pushselfshow.utils.d.f(this.f25230b, "hwpush_white"));
                    this.f25231c.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(this.f25230b.getResources(), com.huawei.android.pushselfshow.utils.d.g(this.f25230b, "hwpush_ic_cancel")));
                    this.f25233e.setBackground(com.ss.android.ugc.bytex.a.a.a.a(this.f25230b.getResources(), com.huawei.android.pushselfshow.utils.d.g(this.f25230b, "hwpush_pic_ab_number")));
                    this.f25233e.setTextColor(i2);
                }
                this.f25232d.setTextColor(i2);
            }
        }
        this.f25231c.setOnClickListener(new a(this, this.f25230b, null));
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.i.setVisible(z);
        this.j.setVisible(z);
    }

    private void b() {
        if (!(this.h == null || this.f25234f == null || this.g == null)) {
            e.a("PushSelfShowLog", "count:" + this.h.getCount());
            if (this.h.getCount() == 0) {
                this.f25234f.setVisibility(8);
                this.g.setVisibility(0);
                return;
            }
            this.f25234f.setVisibility(0);
            this.g.setVisibility(8);
        }
    }

    private int c() {
        int i2 = 0;
        if (this.h == null) {
            return 0;
        }
        for (e eVar : this.h.a()) {
            if (eVar != null && eVar.a()) {
                i2++;
            }
        }
        e.a("PushSelfShowLog", "selectItemsNum:" + i2);
        return i2;
    }

    /* access modifiers changed from: private */
    public void d() {
        ActionBar actionBar = this.f25230b.getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setDisplayShowCustomEnabled(true);
            actionBar.setDisplayShowHomeEnabled(false);
            View inflate = this.f25230b.getLayoutInflater().inflate(com.huawei.android.pushselfshow.utils.d.c(this.f25230b, "hwpush_custom_titlebar"), null);
            a(inflate);
            actionBar.setCustomView(inflate);
        }
        a(true);
        this.f25231c.setVisibility(0);
        this.f25232d.setText(com.huawei.android.pushselfshow.utils.d.a(this.f25230b, "hwpush_deltitle"));
        this.f25234f.setOnItemClickListener(new b(this, this.f25230b, null));
        this.h.a(false);
        this.f25234f.setLongClickable(false);
        if (1 == this.h.a().size()) {
            a((Context) this.f25230b, true);
        } else {
            a((Context) this.f25230b, false);
        }
    }

    /* access modifiers changed from: private */
    public void e() {
        Intent intent = new Intent("com.huawei.android.push.intent.RICHPUSH");
        intent.putExtra("type", "html");
        intent.putExtra("selfshow_info", this.l);
        intent.putExtra("selfshow_token", this.m);
        intent.setFlags(268468240);
        intent.setPackage(this.f25230b.getPackageName());
        this.f25230b.finish();
        this.f25230b.startActivity(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.what     // Catch:{ Exception -> 0x003f }
            switch(r0) {
                case 1000: goto L_0x0025;
                case 1001: goto L_0x0006;
                default: goto L_0x0005;
            }     // Catch:{ Exception -> 0x003f }
        L_0x0005:
            goto L_0x003e
        L_0x0006:
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r1 = "mHandler MSG_DELETE_DONE"
            com.huawei.android.pushagent.utils.a.e.a(r0, r1)     // Catch:{ Exception -> 0x003f }
            boolean r0 = r4.k     // Catch:{ Exception -> 0x003f }
            if (r0 == 0) goto L_0x0015
            r4.e()     // Catch:{ Exception -> 0x003f }
            return
        L_0x0015:
            android.widget.ListView r0 = r4.f25234f     // Catch:{ Exception -> 0x003f }
            com.huawei.android.pushselfshow.richpush.favorites.a r1 = r4.h     // Catch:{ Exception -> 0x003f }
            r0.setAdapter(r1)     // Catch:{ Exception -> 0x003f }
            android.widget.ImageView r0 = r4.f25231c     // Catch:{ Exception -> 0x003f }
            r0.performClick()     // Catch:{ Exception -> 0x003f }
            r4.b()     // Catch:{ Exception -> 0x003f }
            goto L_0x003e
        L_0x0025:
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r1 = "mHandler MSG_LOAD_DONE"
            com.huawei.android.pushagent.utils.a.e.a(r0, r1)     // Catch:{ Exception -> 0x003f }
            android.widget.ListView r0 = r4.f25234f     // Catch:{ Exception -> 0x003f }
            com.huawei.android.pushselfshow.richpush.favorites.a r1 = r4.h     // Catch:{ Exception -> 0x003f }
            r0.setAdapter(r1)     // Catch:{ Exception -> 0x003f }
            r4.b()     // Catch:{ Exception -> 0x003f }
            boolean r0 = r4.k     // Catch:{ Exception -> 0x003f }
            if (r0 == 0) goto L_0x003e
            r4.d()     // Catch:{ Exception -> 0x003f }
            goto L_0x0061
        L_0x003e:
            return
        L_0x003f:
            r0 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "handleMessage error:"
            r2.<init>(r3)
            int r5 = r5.what
            r2.append(r5)
            java.lang.String r5 = ","
            r2.append(r5)
            java.lang.String r5 = r0.toString()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.huawei.android.pushagent.utils.a.e.c(r1, r5, r0)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.richpush.favorites.FavoritesActivity.handleMessage(android.os.Message):void");
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        e.a("PushSelfShowLog", "FavoritesActivity onActivityResult");
    }

    public void onCreate(Intent intent) {
        e.a("PushSelfShowLog", "FavoritesActivity onCreate");
        try {
            ActionBar actionBar = this.f25230b.getActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(true);
                actionBar.setDisplayShowTitleEnabled(true);
                actionBar.setTitle(this.f25230b.getString(com.huawei.android.pushselfshow.utils.d.a(this.f25230b, "hwpush_msg_favorites")));
            }
            this.k = intent.getBooleanExtra("selfshowMsgOutOfBound", false);
            this.l = intent.getByteArrayExtra("selfshow_info");
            this.m = intent.getByteArrayExtra("selfshow_token");
            RelativeLayout relativeLayout = new RelativeLayout(this.f25230b);
            View a2 = a();
            this.g = (LinearLayout) a2.findViewById(com.huawei.android.pushselfshow.utils.d.e(this.f25230b, "hwpush_no_collection_view"));
            e.a("PushSelfShowLog", "mNoCollectionLayout:" + this.g);
            relativeLayout.addView(a2);
            new Thread(new b(this)).start();
            this.f25230b.setContentView(relativeLayout);
            if (this.k && this.i != null) {
                this.i.setEnabled(false);
            }
        } catch (RuntimeException e2) {
            e.c("PushSelfShowLog", "call" + HtmlViewer.class.getName() + " onCreate(Intent intent) err: " + e2.toString(), e2);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.f25230b.getMenuInflater().inflate(com.huawei.android.pushselfshow.utils.d.d(this.f25230b, "hwpush_collection_menu"), menu);
        return true;
    }

    public void onDestroy() {
        e.a("PushSelfShowLog", "FavoritesActivity onDestroy");
        if (this.n != null && this.n.isShowing()) {
            this.n.dismiss();
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        e.a("PushSelfShowLog", "FavoritesActivity onKeyDown");
        if (i2 == 4 && keyEvent.getAction() == 0) {
            boolean z = false;
            if (this.f25231c != null && this.f25231c.getVisibility() == 0) {
                z = true;
            }
            if (this.k) {
                e();
            } else if (z) {
                this.f25231c.performClick();
            } else {
                this.f25230b.finish();
            }
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        String str;
        e.b("PushSelfShowLog", "FavoritesActivity onOptionsItemSelected:" + menuItem);
        if (menuItem == null) {
            e.d("PushSelfShowLog", "onOptionsItemSelected, item is null");
            return false;
        }
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onKeyDown(4, new KeyEvent(0, 4));
        } else if (itemId == com.huawei.android.pushselfshow.utils.d.e(this.f25230b, "hwpush_menu_delete")) {
            try {
                str = this.f25230b.getResources().getQuantityString(com.huawei.android.pushselfshow.utils.d.b(this.f25230b, "hwpush_delete_tip"), c());
            } catch (Resources.NotFoundException e2) {
                e.c("PushSelfShowLog", e2.toString(), e2);
                str = "";
            }
            this.n = new AlertDialog.Builder(this.f25230b, com.huawei.android.pushselfshow.utils.a.h(this.f25230b)).setTitle(str).setPositiveButton(com.huawei.android.pushselfshow.utils.d.a(this.f25230b, "hwpush_delete"), new c(this)).setNegativeButton(com.huawei.android.pushselfshow.utils.d.a(this.f25230b, "hwpush_cancel"), null).create();
            this.n.show();
            this.n.getButton(-1).setTextColor(Color.parseColor("#ffd43e25"));
        } else if (itemId == com.huawei.android.pushselfshow.utils.d.e(this.f25230b, "hwpush_menu_selectall")) {
            Iterator it2 = this.h.a().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!((e) it2.next()).a()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            this.h.a(z, (Set) null);
            if (z) {
                this.f25233e.setVisibility(0);
                this.f25233e.setText(String.valueOf(this.h.getCount()));
                this.i.setEnabled(true);
                a((Context) this.f25230b, true);
            } else {
                this.f25233e.setVisibility(8);
                this.f25233e.setText("");
                this.i.setEnabled(false);
                a((Context) this.f25230b, false);
            }
        }
        return true;
    }

    public void onPause() {
        e.a("PushSelfShowLog", "FavoritesActivity onPause");
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        e.b("PushSelfShowLog", "FavoritesActivity onPrepareOptionsMenu:" + menu);
        this.i = menu.findItem(com.huawei.android.pushselfshow.utils.d.e(this.f25230b, "hwpush_menu_delete"));
        this.j = menu.findItem(com.huawei.android.pushselfshow.utils.d.e(this.f25230b, "hwpush_menu_selectall"));
        a(false);
        return true;
    }

    public void onRestart() {
        e.a("PushSelfShowLog", "FavoritesActivity onRestart");
    }

    public void onResume() {
        e.a("PushSelfShowLog", "FavoritesActivity onResume");
    }

    public void onStart() {
        e.a("PushSelfShowLog", "FavoritesActivity onStart");
    }

    public void onStop() {
        e.a("PushSelfShowLog", "FavoritesActivity onStop");
    }

    public void setActivity(Activity activity) {
        this.f25230b = activity;
    }
}
