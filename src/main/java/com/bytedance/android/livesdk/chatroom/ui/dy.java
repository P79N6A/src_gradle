package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.w;
import com.bytedance.android.livesdk.chatroom.model.x;
import com.bytedance.android.livesdk.chatroom.presenter.au;
import com.bytedance.android.livesdk.chatroom.ui.LuckyBoxSendAdapter;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.w.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dy extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12118a;

    /* renamed from: b  reason: collision with root package name */
    public List<w> f12119b;

    /* renamed from: c  reason: collision with root package name */
    public au f12120c;

    /* renamed from: d  reason: collision with root package name */
    w f12121d;

    /* renamed from: e  reason: collision with root package name */
    x f12122e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12123f;
    LuckyBoxDescriptionAdapter g;
    TextView h;
    CheckBox i;
    LinearLayoutManager j;
    private Map<w, TextView> k = new HashMap();
    private LuckyBoxSendAdapter l;
    private TextView m;
    private View n;
    private View.OnClickListener o = new dz(this);
    private View.OnClickListener p = new ea(this);
    private LuckyBoxSendAdapter.a q = new eb(this);

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f12118a, false, 6257, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12118a, false, 6257, new Class[0], Void.TYPE);
            return;
        }
        if (this.f12119b != null && this.f12119b.size() > 0) {
            LinearLayout linearLayout = (LinearLayout) findViewById(C0906R.id.cyn);
            if (!a.a()) {
                for (w next : this.f12119b) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C0906R.layout.anf, linearLayout, false);
                    textView.setText(next.f11175b);
                    textView.setSelected(false);
                    textView.setOnClickListener(new ed(this, next));
                    this.k.put(next, textView);
                    linearLayout.addView(textView);
                }
            } else {
                linearLayout.setVisibility(8);
                TextView textView2 = (TextView) findViewById(C0906R.id.dkk);
                textView2.setVisibility(0);
                textView2.setText(this.f12119b.get(0).f11175b);
            }
            a(this.f12119b.get(0));
        }
    }

    public dy(@NonNull Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public void a(w wVar) {
        w wVar2 = wVar;
        if (PatchProxy.isSupport(new Object[]{wVar2}, this, f12118a, false, 6259, new Class[]{w.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{wVar2}, this, f12118a, false, 6259, new Class[]{w.class}, Void.TYPE);
            return;
        }
        this.f12121d = wVar2;
        b(wVar);
    }

    private void b(w wVar) {
        String str;
        boolean z;
        w wVar2 = wVar;
        if (PatchProxy.isSupport(new Object[]{wVar2}, this, f12118a, false, 6258, new Class[]{w.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{wVar2}, this, f12118a, false, 6258, new Class[]{w.class}, Void.TYPE);
            return;
        }
        if (this.k != null && this.k.size() > 0) {
            for (w next : this.f12119b) {
                TextView textView = this.k.get(next);
                if (next == wVar2) {
                    z = true;
                } else {
                    z = false;
                }
                textView.setSelected(z);
            }
        }
        this.m.setText(wVar2.f11176c.f11179a);
        if (TextUtils.isEmpty(wVar2.f11176c.f11180b)) {
            this.n.setVisibility(8);
        } else {
            this.n.setVisibility(0);
        }
        LuckyBoxSendAdapter luckyBoxSendAdapter = this.l;
        List<x> list = wVar2.f11177d;
        if (PatchProxy.isSupport(new Object[]{list}, luckyBoxSendAdapter, LuckyBoxSendAdapter.f11696a, false, 6248, new Class[]{List.class}, Void.TYPE)) {
            LuckyBoxSendAdapter luckyBoxSendAdapter2 = luckyBoxSendAdapter;
            PatchProxy.accessDispatch(new Object[]{list}, luckyBoxSendAdapter2, LuckyBoxSendAdapter.f11696a, false, 6248, new Class[]{List.class}, Void.TYPE);
        } else {
            luckyBoxSendAdapter.f11698b = list;
            luckyBoxSendAdapter.f11700d = 0;
            luckyBoxSendAdapter.notifyDataSetChanged();
            luckyBoxSendAdapter.f11699c.a(list.get(luckyBoxSendAdapter.f11700d));
        }
        CheckBox checkBox = this.i;
        Object[] objArr = new Object[1];
        int i2 = wVar2.f11178e;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, ah.f17576a, true, 13736, new Class[]{Integer.TYPE}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, ah.f17576a, true, 13736, new Class[]{Integer.TYPE}, String.class);
        } else {
            StringBuilder sb = new StringBuilder();
            Context e2 = ac.e();
            if (i2 <= 0) {
                str = "";
            } else {
                int i3 = i2 / 3600;
                int i4 = i2 - (i3 * 3600);
                int i5 = i4 / 60;
                int i6 = i4 - (i5 * 60);
                if (i3 != 0) {
                    sb.append(i3);
                    sb.append(e2.getResources().getQuantityString(C0906R.plurals.i, i3));
                }
                if (i5 != 0) {
                    sb.append(i5);
                    sb.append(e2.getResources().getQuantityString(C0906R.plurals.j, i5));
                }
                if (i6 != 0) {
                    sb.append(i6);
                    sb.append(e2.getResources().getQuantityString(C0906R.plurals.l, i6));
                }
                str = sb.toString();
            }
        }
        objArr[0] = str;
        checkBox.setText(ac.a((int) C0906R.string.dia, objArr));
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f12118a, false, 6256, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f12118a, false, 6256, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            dismiss();
            return;
        }
        window.requestFeature(1);
        window.setBackgroundDrawable(new BitmapDrawable());
        setContentView(C0906R.layout.agz);
        View findViewById = findViewById(C0906R.id.chy);
        if (!this.f12123f) {
            findViewById.post(new ec(findViewById));
        }
        this.m = (TextView) findViewById(C0906R.id.dki);
        this.n = findViewById(C0906R.id.o8);
        this.h = (TextView) findViewById(C0906R.id.daw);
        this.i = (CheckBox) findViewById(C0906R.id.sf);
        View findViewById2 = findViewById(C0906R.id.p1);
        this.n.setOnClickListener(this.p);
        findViewById2.setOnClickListener(this.o);
        if (((Boolean) com.bytedance.android.livesdk.config.a.aa.a()).booleanValue()) {
            this.i.setChecked(false);
            this.i.setVisibility(8);
        } else {
            this.i.setChecked(TTLiveSDKContext.getHostService().b().b().a(e.SEND_DELAY_RED_ENVELOPE));
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        RecyclerView recyclerView = (RecyclerView) findViewById(C0906R.id.bcw);
        this.l = new LuckyBoxSendAdapter(from, this.q);
        recyclerView.setAdapter(this.l);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(C0906R.id.bcq);
        this.g = new LuckyBoxDescriptionAdapter(from, C0906R.layout.and);
        recyclerView2.setAdapter(this.g);
        if (a.a()) {
            this.j = new GridLayoutManager(getContext(), 3);
        } else {
            this.j = new LinearLayoutManager(getContext(), 0, false);
        }
        recyclerView2.setLayoutManager(this.j);
        a();
    }
}
