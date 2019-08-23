package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.b.a;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.browser.c.c;
import com.bytedance.android.livesdk.chatroom.model.TaskGiftEvent;
import com.bytedance.android.livesdk.chatroom.model.ah;
import com.bytedance.android.livesdk.chatroom.model.ai;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.utils.n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Arrays;
import java.util.List;

public final class ez extends Dialog implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12251a;

    /* renamed from: b  reason: collision with root package name */
    private View f12252b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f12253c;

    /* renamed from: d  reason: collision with root package name */
    private View[] f12254d;

    /* renamed from: e  reason: collision with root package name */
    private String f12255e = null;

    /* renamed from: f  reason: collision with root package name */
    private Room f12256f;
    private List<TaskGiftEvent> g;

    public final void onClick(View view) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f12251a, false, 6453, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12251a, false, 6453, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        int i = 8;
        if (C0906R.id.ao3 == id) {
            if (PatchProxy.isSupport(new Object[0], this, f12251a, false, 6454, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12251a, false, 6454, new Class[0], Void.TYPE);
            } else {
                String str = (String) LiveConfigSettingKeys.TASK_GIFT_DESC_URL.a();
                if (!TextUtils.isEmpty(str)) {
                    ((a) b.a(a.class)).webViewManager().a(getContext(), c.b(str).a(""));
                } else {
                    if (this.f12252b.getVisibility() != 0) {
                        z = false;
                    }
                    View view2 = this.f12252b;
                    if (!z) {
                        i = 0;
                    }
                    view2.setVisibility(i);
                }
            }
            f.a(getContext());
            return;
        }
        if (C0906R.id.ao2 == id) {
            if (this.f12252b.getVisibility() == 0) {
                this.f12252b.setVisibility(8);
            }
        } else if (C0906R.id.c_d == id) {
            if (!TextUtils.isEmpty(this.f12255e)) {
                ((a) b.a(a.class)).webViewManager().a(getContext(), c.b(this.f12255e).a(getContext().getString(C0906R.string.ddh)));
            }
            f.a(getContext());
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        List list;
        int i2;
        int i3;
        boolean z;
        int i4;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f12251a, false, 6450, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f12251a, false, 6450, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(C0906R.layout.ahh, null));
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(80);
        }
        View findViewById = findViewById(C0906R.id.ao3);
        this.f12252b = findViewById(C0906R.id.ao2);
        this.f12253c = (TextView) findViewById(C0906R.id.dwl);
        TextView textView = (TextView) findViewById(C0906R.id.cql);
        TextView textView2 = (TextView) findViewById(C0906R.id.cpm);
        TextView textView3 = (TextView) findViewById(C0906R.id.ah6);
        TextView textView4 = (TextView) findViewById(C0906R.id.agu);
        TextView textView5 = (TextView) findViewById(C0906R.id.cp_);
        TextView textView6 = (TextView) findViewById(C0906R.id.ags);
        this.f12254d = new View[6];
        ViewGroup viewGroup = (ViewGroup) findViewById(C0906R.id.n7);
        int childCount = viewGroup.getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            if (!(childAt instanceof ImageView)) {
                if (i5 > 5) {
                    break;
                }
                this.f12254d[i5] = childAt;
                i5++;
            }
        }
        findViewById(C0906R.id.c_d).setOnClickListener(this);
        findViewById.setOnClickListener(this);
        this.f12252b.setOnClickListener(this);
        if (PatchProxy.isSupport(new Object[0], this, f12251a, false, 6451, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12251a, false, 6451, new Class[0], Void.TYPE);
        } else {
            TaskGiftEvent taskGiftEvent = this.g.get(0);
            if (taskGiftEvent.getType() == 1) {
                List asList = Arrays.asList((ai[]) com.bytedance.android.live.a.a().fromJson(taskGiftEvent.getData(), ai[].class));
                if (!CollectionUtils.isEmpty(asList)) {
                    int size = asList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        ai aiVar = (ai) asList.get(i7);
                        if (aiVar == null) {
                            list = asList;
                            i = size;
                        } else {
                            View view = this.f12254d[i7];
                            ImageView imageView = (ImageView) view.findViewById(C0906R.id.n4);
                            ProgressBar progressBar = (ProgressBar) view.findViewById(C0906R.id.n5);
                            TextView textView7 = (TextView) view.findViewById(C0906R.id.n6);
                            if (aiVar.f11095a > 0) {
                                i3 = 2130841406;
                                list = asList;
                                i = size;
                                i4 = C0906R.string.ddl;
                            } else if (aiVar.f11096b > 0) {
                                list = asList;
                                i = size;
                                i2 = (int) ((((float) aiVar.f11096b) / ((float) aiVar.f11097c)) * 100.0f);
                                i4 = C0906R.string.ddm;
                                z = true;
                                i3 = 2130841404;
                                imageView.setImageResource(i3);
                                progressBar.setProgress(i2);
                                textView7.setText(i4);
                                textView7.setEnabled(z);
                            } else {
                                i3 = 2130841405;
                                list = asList;
                                i = size;
                                i4 = C0906R.string.ddo;
                            }
                            z = false;
                            i2 = 0;
                            imageView.setImageResource(i3);
                            progressBar.setProgress(i2);
                            textView7.setText(i4);
                            textView7.setEnabled(z);
                        }
                        i7++;
                        asList = list;
                        size = i;
                    }
                    this.f12253c.setText(taskGiftEvent.getSubtitle());
                }
            }
        }
        a(this.g.get(1), 2, C0906R.string.ddi, textView, textView2, textView5);
        a(this.g.get(2), 4, C0906R.string.ddf, textView3, textView4, textView6);
    }

    public ez(@NonNull Context context, Room room, List<TaskGiftEvent> list, String str) {
        super(context, C0906R.style.vm);
        this.f12256f = room;
        this.g = list;
    }

    private void a(TaskGiftEvent taskGiftEvent, int i, int i2, TextView textView, TextView textView2, TextView textView3) {
        int i3;
        TextView textView4 = textView;
        TextView textView5 = textView2;
        TextView textView6 = textView3;
        int i4 = 3;
        if (PatchProxy.isSupport(new Object[]{taskGiftEvent, Integer.valueOf(i), Integer.valueOf(i2), textView4, textView5, textView6}, this, f12251a, false, 6452, new Class[]{TaskGiftEvent.class, Integer.TYPE, Integer.TYPE, TextView.class, TextView.class, TextView.class}, Void.TYPE)) {
            Object[] objArr = {taskGiftEvent, Integer.valueOf(i), Integer.valueOf(i2), textView4, textView5, textView6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f12251a, false, 6452, new Class[]{TaskGiftEvent.class, Integer.TYPE, Integer.TYPE, TextView.class, TextView.class, TextView.class}, Void.TYPE);
        } else if (taskGiftEvent != null && i == taskGiftEvent.getType()) {
            ah ahVar = (ah) com.bytedance.android.live.a.a().fromJson(taskGiftEvent.getData(), ah.class);
            if (ahVar.f11094a < 3) {
                i3 = C0906R.string.ddn;
            } else {
                i3 = C0906R.string.ddl;
            }
            textView6.setEnabled(false);
            textView6.setText(i3);
            String string = getContext().getString(i2);
            if (ahVar.f11094a <= 3) {
                i4 = ahVar.f11094a;
            }
            textView4.setText(n.a(string, Integer.valueOf(i4)));
            textView5.setText(taskGiftEvent.getSubtitle());
        }
    }
}
