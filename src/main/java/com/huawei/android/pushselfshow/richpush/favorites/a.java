package com.huawei.android.pushselfshow.richpush.favorites;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.utils.a.c;
import com.huawei.android.pushselfshow.utils.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class a extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    private Context f25241a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f25242b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f25243c;

    /* renamed from: d  reason: collision with root package name */
    private List f25244d = new ArrayList();

    /* renamed from: com.huawei.android.pushselfshow.richpush.favorites.a$a  reason: collision with other inner class name */
    static class C0293a {

        /* renamed from: a  reason: collision with root package name */
        ImageView f25245a;

        /* renamed from: b  reason: collision with root package name */
        TextView f25246b;

        /* renamed from: c  reason: collision with root package name */
        TextView f25247c;

        /* renamed from: d  reason: collision with root package name */
        CheckBox f25248d;

        private C0293a() {
        }
    }

    public a(Context context) {
        this.f25241a = context;
    }

    /* renamed from: a */
    public e getItem(int i) {
        return (e) this.f25244d.get(i);
    }

    public List a() {
        return this.f25244d;
    }

    public void a(int i, e eVar) {
        try {
            if (this.f25244d.size() >= i) {
                this.f25244d.set(i, eVar);
            }
        } catch (Exception unused) {
        }
    }

    public void a(boolean z) {
        this.f25242b = z;
        notifyDataSetChanged();
    }

    public void a(boolean z, Set set) {
        this.f25243c = z;
        int i = 0;
        for (e eVar : this.f25244d) {
            if (set == null || !set.contains(Integer.valueOf(i))) {
                eVar.a(z);
            } else {
                eVar.a(!z);
            }
            a(i, eVar);
            i++;
        }
        notifyDataSetChanged();
    }

    public void b() {
        this.f25244d = c.a(this.f25241a, (String) null);
    }

    public int getCount() {
        return this.f25244d.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C0293a aVar;
        if (view == null) {
            try {
                aVar = new C0293a();
                View inflate = ((LayoutInflater) this.f25241a.getSystemService("layout_inflater")).inflate(d.c(this.f25241a, "hwpush_collection_item"), null);
                try {
                    aVar.f25245a = (ImageView) inflate.findViewById(d.e(this.f25241a, "hwpush_favicon"));
                    aVar.f25246b = (TextView) inflate.findViewById(d.e(this.f25241a, "hwpush_selfshowmsg_title"));
                    aVar.f25247c = (TextView) inflate.findViewById(d.e(this.f25241a, "hwpush_selfshowmsg_content"));
                    aVar.f25248d = (CheckBox) inflate.findViewById(d.e(this.f25241a, "hwpush_delCheck"));
                    inflate.setTag(aVar);
                    view = inflate;
                } catch (Exception e2) {
                    e = e2;
                    view = inflate;
                    e.b("PushSelfShowLog", e.toString());
                    return view;
                }
            } catch (Exception e3) {
                e = e3;
                e.b("PushSelfShowLog", e.toString());
                return view;
            }
        } else {
            aVar = (C0293a) view.getTag();
        }
        Bitmap d2 = ((e) this.f25244d.get(i)).d();
        if (d2 == null) {
            d2 = BitmapFactory.decodeResource(this.f25241a.getResources(), d.g(this.f25241a, "hwpush_main_icon"));
        }
        aVar.f25245a.setBackgroundDrawable(new BitmapDrawable(this.f25241a.getResources(), d2));
        String str = ((e) this.f25244d.get(i)).b().s;
        if (str != null && str.length() > 0) {
            aVar.f25246b.setText(str);
        }
        String str2 = ((e) this.f25244d.get(i)).b().q;
        if (str2 != null && str2.length() > 0) {
            aVar.f25247c.setText(str2);
        }
        if (this.f25242b) {
            aVar.f25248d.setVisibility(4);
        } else {
            aVar.f25248d.setVisibility(0);
            if (!this.f25243c) {
                if (!((e) this.f25244d.get(i)).a()) {
                    aVar.f25248d.setChecked(false);
                }
            }
            aVar.f25248d.setChecked(true);
        }
        return view;
    }
}
