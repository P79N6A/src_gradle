package com.ss.android.ugc.aweme.app.debug;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.annotation.c;
import com.ss.android.ugc.aweme.setting.ui.a;
import com.ss.android.ugc.aweme.setting.ui.b;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class AbTestSettingSearchActivity extends AbsABActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34127a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<c> f34128b = new ArrayList<>();
    @SuppressLint({"CI_HandlerLeak", "HandlerLeak"})

    /* renamed from: c  reason: collision with root package name */
    public Handler f34129c = new Handler() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34134a;

        public final void handleMessage(Message message) {
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f34134a, false, 23337, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f34134a, false, 23337, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            AbTestSettingSearchActivity.this.a((String) message2.obj);
        }
    };
    private EditText u;
    private RecyclerView v;
    private ArrayList<c> w = new ArrayList<>();
    private RecyclerView.Adapter x = new RecyclerView.Adapter() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34130a;

        public int getItemCount() {
            if (!PatchProxy.isSupport(new Object[0], this, f34130a, false, 23336, new Class[0], Integer.TYPE)) {
                return AbTestSettingSearchActivity.this.f34128b.size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f34130a, false, 23336, new Class[0], Integer.TYPE)).intValue();
        }

        public int getItemViewType(int i) {
            int i2 = 1;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34130a, false, 23335, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34130a, false, 23335, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
            }
            if (AbTestSettingSearchActivity.this.f34128b.get(i).g == null) {
                i2 = 0;
            }
            return i2;
        }

        @NonNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f34130a, false, 23333, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
                return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f34130a, false, 23333, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
            } else if (i == 0) {
                return new RecyclerView.ViewHolder(new b(AbTestSettingSearchActivity.this)) {
                };
            } else {
                return new RecyclerView.ViewHolder(new a(AbTestSettingSearchActivity.this)) {
                };
            }
        }

        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
            if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f34130a, false, 23334, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f34130a, false, 23334, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            } else if (viewHolder.itemView instanceof b) {
                ((b) viewHolder.itemView).a(AbTestSettingSearchActivity.this.f34128b.get(i).f63825e, AbTestSettingSearchActivity.this.f2650f);
            } else {
                if (viewHolder.itemView instanceof a) {
                    ((a) viewHolder.itemView).a(AbTestSettingSearchActivity.this.f34128b.get(i).f63825e, AbTestSettingSearchActivity.this.f2650f);
                }
            }
        }
    };

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f34127a, false, 23330, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f34127a, false, 23330, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f34127a, false, 23331, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34127a, false, 23331, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34127a, false, 23332, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34127a, false, 23332, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f34127a, false, 23329, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34127a, false, 23329, new Class[0], Void.TYPE);
            return;
        }
        this.x.notifyDataSetChanged();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f34127a, false, 23325, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34127a, false, 23325, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f34129c.removeCallbacksAndMessages(null);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f34127a, false, 23327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34127a, false, 23327, new Class[0], Void.TYPE);
            return;
        }
        this.w.addAll(c.f63823c);
        for (int size = this.w.size() - 1; size >= 0; size--) {
            if (this.w.get(size).g == null && this.w.get(size).f63826f == null) {
                this.w.remove(size);
            } else if (this.w.get(size).g != null && !this.w.get(size).f63825e.getType().equals(Integer.TYPE)) {
                this.w.remove(size);
            } else if (this.w.get(size).f63826f != null && !this.w.get(size).f63825e.getType().equals(Boolean.TYPE)) {
                this.w.remove(size);
            }
        }
        Collections.sort(this.w, new Comparator<c>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34140a;

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                c cVar = (c) obj;
                c cVar2 = (c) obj2;
                if (!PatchProxy.isSupport(new Object[]{cVar, cVar2}, this, f34140a, false, 23340, new Class[]{c.class, c.class}, Integer.TYPE)) {
                    return cVar.i.compareTo(cVar2.i);
                }
                return ((Integer) PatchProxy.accessDispatch(new Object[]{cVar, cVar2}, this, f34140a, false, 23340, new Class[]{c.class, c.class}, Integer.TYPE)).intValue();
            }
        });
        this.f34128b.addAll(this.w);
        this.v.setAdapter(this.x);
        a("");
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f34127a, false, 23326, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34127a, false, 23326, new Class[0], Void.TYPE);
            return;
        }
        findViewById(C0906R.id.dw5).setVisibility(8);
        this.v = (RecyclerView) findViewById(C0906R.id.ciy);
        this.v.setVisibility(0);
        this.g = (a) getIntent().getSerializableExtra("paeg_param");
        ((TextView) findViewById(C0906R.id.title)).setText("搜索并设置AB");
        this.u = (EditText) findViewById(C0906R.id.a94);
        this.u.setVisibility(0);
        this.u.setHint("搜索并设置AB(支持搜hint, key, 变量名)");
        this.f2649e = (LinearLayout) findViewById(C0906R.id.b7o);
        this.f2649e.setVisibility(8);
        this.v.setLayoutManager(new WrapLinearLayoutManager(this));
        this.f2650f = AbTestManager.a().d();
        c();
        this.u.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34136a;

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f34136a, false, 23338, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f34136a, false, 23338, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                } else if (keyEvent.getKeyCode() == 66) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        this.u.addTextChangedListener(new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34138a;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f34138a, false, 23339, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f34138a, false, 23339, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                AbTestSettingSearchActivity.this.f34129c.removeCallbacksAndMessages(null);
                Message obtain = Message.obtain();
                obtain.obj = editable.toString();
                AbTestSettingSearchActivity.this.f34129c.sendMessageDelayed(obtain, 200);
            }
        });
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f34127a, false, 23328, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f34127a, false, 23328, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f34128b.clear();
        if (TextUtils.isEmpty(str)) {
            this.f34128b.addAll(this.w);
            h();
            return;
        }
        Iterator<c> it2 = this.w.iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            Iterator<String> it3 = next.h.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (it3.next().contains(str.toLowerCase())) {
                        this.f34128b.add(next);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        h();
    }
}
