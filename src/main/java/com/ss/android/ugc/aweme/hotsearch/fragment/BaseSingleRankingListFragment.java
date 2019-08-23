package com.ss.android.ugc.aweme.hotsearch.fragment;

import android.arch.lifecycle.Observer;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.hotsearch.view.d;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class BaseSingleRankingListFragment<T> extends BaseRankingListFragment<T> implements Observer<a> {
    public static ChangeQuickRedirect h;
    private static final SimpleDateFormat p = new SimpleDateFormat("yy.MM.dd", Locale.CHINESE);
    protected List<com.ss.android.ugc.aweme.hotsearch.b.a> i;
    public d j;
    int k;
    String l;
    int m;
    ShareInfo n;
    String o = "";

    public abstract int m();

    public abstract Uri o();

    public final ShareInfo f() {
        return this.n;
    }

    public final String g() {
        return this.o;
    }

    public final String k() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 49649, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, h, false, 49649, new Class[0], String.class);
        } else if (TextUtils.isEmpty(this.l)) {
            return "";
        } else {
            return this.l;
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 49660, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 49660, new Class[0], Void.TYPE);
            return;
        }
        this.g.e();
    }

    public final DataCenter e() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 49662, new Class[0], DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[0], this, h, false, 49662, new Class[0], DataCenter.class);
        }
        this.f49754c = super.e();
        this.f49754c.a("hot_search_banner", (Observer<a>) this);
        this.f49754c.a("hot_search_picker", (Observer<a>) this);
        this.f49754c.a("hot_search_last_update_time", (Observer<a>) this);
        this.f49754c.a("hot_search_share_info", (Observer<a>) this);
        return this.f49754c;
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 49651, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 49651, new Class[0], Void.TYPE);
            return;
        }
        d dVar = this.j;
        if (PatchProxy.isSupport(new Object[0], dVar, d.f49875a, false, 49848, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], dVar, d.f49875a, false, 49848, new Class[0], Void.TYPE);
        } else {
            dVar.f49879e.setExpanded(true);
        }
        this.g.f49869d.scrollToPosition(0);
    }

    public void p() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 49661, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 49661, new Class[0], Void.TYPE);
            return;
        }
        Intent intent = new Intent(getActivity(), CrossPlatformActivity.class);
        intent.putExtra("hide_nav_bar", true);
        intent.setData(o());
        startActivity(intent);
    }

    private static String a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, null, h, true, 49655, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j3)}, null, h, true, 49655, new Class[]{Long.TYPE}, String.class);
        }
        return p.format(new Date(j3 * 1000));
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, h, false, 49659, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, h, false, 49659, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 != this.m) {
            if (i2 == 0) {
                this.k = 0;
                this.l = "";
            } else {
                this.k = 1;
                this.l = this.i.get(i2 - 1).getUid();
            }
            this.m = i2;
            this.g.e();
            this.n = null;
            j();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, h, false, 49653, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, h, false, 49653, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.l = arguments.getString("edition_uid");
            if (!TextUtils.isEmpty(this.l)) {
                this.k = 1;
            }
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, h, false, 49658, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, h, false, 49658, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.l = str;
        this.k = TextUtils.isEmpty(str) ^ true ? 1 : 0;
        this.n = null;
        this.m = 0;
        if (this.i == null) {
            this.f49755d.a(m());
        } else {
            Iterator<com.ss.android.ugc.aweme.hotsearch.b.a> it2 = this.i.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                com.ss.android.ugc.aweme.hotsearch.b.a next = it2.next();
                if (TextUtils.equals(next.getUid(), this.l)) {
                    this.m = this.i.indexOf(next) + 1;
                    break;
                }
            }
            this.j.c(this.m);
        }
        j();
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        String str;
        boolean z;
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, h, false, 49663, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, h, false, 49663, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar != null && TextUtils.equals(aVar.f34376a, "hot_search_banner")) {
            UrlModel urlModel = (UrlModel) aVar.a();
            if (urlModel != null) {
                if (PatchProxy.isSupport(new Object[]{urlModel}, null, h, true, 49654, new Class[]{UrlModel.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{urlModel}, null, h, true, 49654, new Class[]{UrlModel.class}, Boolean.TYPE)).booleanValue();
                } else {
                    if (urlModel != null && !CollectionUtils.isEmpty(urlModel.getUrlList())) {
                        Iterator<String> it2 = urlModel.getUrlList().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!TextUtils.isEmpty(it2.next())) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z = false;
                }
                if (z) {
                    d dVar = this.j;
                    if (PatchProxy.isSupport(new Object[]{urlModel}, dVar, d.f49875a, false, 49843, new Class[]{UrlModel.class}, Void.TYPE)) {
                        d dVar2 = dVar;
                        PatchProxy.accessDispatch(new Object[]{urlModel}, dVar2, d.f49875a, false, 49843, new Class[]{UrlModel.class}, Void.TYPE);
                    } else if (!urlModel.equals(dVar.j)) {
                        dVar.j = urlModel;
                        c.b(dVar.f49880f, dVar.j);
                    }
                }
            }
        } else if (aVar != null && TextUtils.equals(aVar.f34376a, "hot_search_picker")) {
            b bVar = (b) aVar.a();
            if (bVar != null && ((Integer) bVar.a("picker_status")).intValue() == 0) {
                List<String> list = this.j.f49878d;
                this.i = (List) bVar.a("picker_list");
                for (com.ss.android.ugc.aweme.hotsearch.b.a next : this.i) {
                    list.add(getString(C0906R.string.bv5, Integer.valueOf(next.getEditionNo()), a(next.getStartTime()), a(next.getEndTime())));
                    if (this.k == 1 && TextUtils.equals(this.l, next.getUid())) {
                        this.m = this.i.indexOf(next) + 1;
                    }
                }
                this.j.a(list);
                if (this.m != 0) {
                    this.j.c(this.m);
                }
            }
        } else if (aVar != null && TextUtils.equals(aVar.f34376a, "hot_search_last_update_time")) {
            if (aVar.a() == null) {
                str = "";
            } else {
                str = (String) aVar.a();
            }
            this.o = str;
            if (m() == 4) {
                d dVar3 = this.j;
                String str2 = this.o;
                if (PatchProxy.isSupport(new Object[]{str2}, dVar3, d.f49875a, false, 49849, new Class[]{String.class}, Void.TYPE)) {
                    d dVar4 = dVar3;
                    PatchProxy.accessDispatch(new Object[]{str2}, dVar4, d.f49875a, false, 49849, new Class[]{String.class}, Void.TYPE);
                } else {
                    dVar3.h.setText(dVar3.f49876b.getString(C0906R.string.b4z, new Object[]{str2}));
                }
            } else if (this.m == 0) {
                this.j.c(this.m);
            }
        } else if (aVar != null && TextUtils.equals(aVar.f34376a, "hot_search_share_info")) {
            this.n = (ShareInfo) aVar.a();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, h, false, 49657, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, h, false, 49657, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.j = new d(view, getActivity(), this, m());
        ArrayList arrayList = new ArrayList();
        Date date = new Date();
        if (PatchProxy.isSupport(new Object[]{date}, this, h, false, 49652, new Class[]{Date.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{date}, this, h, false, 49652, new Class[]{Date.class}, String.class);
        } else {
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            if (1 == instance.get(7)) {
                instance.add(5, -1);
            }
            instance.setFirstDayOfWeek(2);
            instance.add(5, instance.getFirstDayOfWeek() - instance.get(7));
            String format = p.format(instance.getTime());
            instance.add(5, 6);
            str = getString(C0906R.string.bv2, format, p.format(instance.getTime()));
        }
        arrayList.add(str);
        this.j.a((List<String>) arrayList);
        this.f49755d.a(m());
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, h, false, 49656, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.qc, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, h, false, 49656, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
