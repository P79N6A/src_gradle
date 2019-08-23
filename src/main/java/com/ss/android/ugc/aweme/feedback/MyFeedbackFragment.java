package com.ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.LongSparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.g.a;
import com.ss.android.image.f;
import com.ss.android.image.j;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.newmedia.app.LargeImageDialog;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.util.ArrayList;
import java.util.List;

public class MyFeedbackFragment extends AmeBaseFragment implements WeakHandler.IHandler, p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47093a;

    /* renamed from: b  reason: collision with root package name */
    boolean f47094b = false;

    /* renamed from: c  reason: collision with root package name */
    private Context f47095c;

    /* renamed from: d  reason: collision with root package name */
    private List<d> f47096d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private WeakHandler f47097e = new WeakHandler(this);

    /* renamed from: f  reason: collision with root package name */
    private int f47098f;
    private boolean g = false;
    private e h;
    private ListView i;
    private ProgressBar j;
    private ViewGroup k;
    private BaseAppData l;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f47093a, false, 43821, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47093a, false, 43821, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.f47094b) {
            if (this.g) {
                this.f47094b = false;
                return;
            }
            this.f47098f++;
            this.g = true;
            this.j.setVisibility(8);
            long j2 = 0;
            if (this.f47096d != null && this.f47096d.size() > 0) {
                j2 = this.f47096d.get(this.f47096d.size() - 1).f47146c;
            }
            o oVar = new o(0, j2, -1, (long) this.f47098f, 3);
            new FeedbackThread2((Handler) this.f47097e, this.f47095c, oVar).start();
        }
        this.f47094b = false;
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f47093a, false, 43820, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f47093a, false, 43820, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.f47095c = getActivity();
        this.l = BaseAppData.a();
        if (a.b()) {
            this.k.setBackgroundColor(getResources().getColor(C0906R.color.a17));
        } else {
            this.k.setBackgroundColor(getResources().getColor(C0906R.color.a2c));
        }
        this.h = new e(this.f47095c, this);
        registerLifeCycleMonitor(this.h);
        this.i.setAdapter(this.h);
        this.f47098f++;
        this.g = true;
        o oVar = new o(0, 0, -1, (long) this.f47098f, 5);
        new FeedbackThread2((Handler) this.f47097e, this.f47095c, oVar).start();
    }

    public void handleMsg(Message message) {
        int i2;
        List list;
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f47093a, false, 43822, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f47093a, false, 43822, new Class[]{Message.class}, Void.TYPE);
        } else if (isViewValid() && (message2.obj instanceof o)) {
            o oVar = (o) message2.obj;
            if (((long) this.f47098f) == oVar.f47208d) {
                if (message2.what == 11) {
                    if (!(message2.arg1 == 19 || message2.arg1 == 18) || this.f47096d.isEmpty()) {
                        UIUtils.displayToast(this.f47095c, 2130838336, getString(e.a(message2.arg1)));
                    }
                    this.g = false;
                    this.j.setVisibility(8);
                    return;
                }
                if (oVar.f47209e == 3) {
                    List<d> list2 = this.f47096d;
                    List<d> list3 = oVar.g;
                    List<d> list4 = list3;
                    List<d> list5 = list2;
                    if (PatchProxy.isSupport(new Object[]{list2, list3}, this, f47093a, false, 43823, new Class[]{List.class, List.class}, List.class)) {
                        list = (List) PatchProxy.accessDispatch(new Object[]{list5, list4}, this, f47093a, false, 43823, new Class[]{List.class, List.class}, List.class);
                    } else {
                        list = new ArrayList();
                        if (list5 == null || list5.size() <= 0) {
                            list.addAll(list4);
                        } else if (list4 != null && list4.size() > 0) {
                            LongSparseArray longSparseArray = new LongSparseArray();
                            for (d next : list5) {
                                longSparseArray.put(next.f47146c, next);
                            }
                            for (d next2 : list4) {
                                if (longSparseArray.get(next2.f47146c, null) == null) {
                                    list.add(next2);
                                }
                            }
                        }
                    }
                    this.f47096d.addAll(list);
                } else if (oVar.f47209e == 4 || oVar.f47209e == 5 || oVar.f47209e == 1) {
                    if (oVar.f47209e == 1) {
                        this.l.I = System.currentTimeMillis();
                    }
                    this.f47096d.clear();
                    this.f47096d.addAll(oVar.g);
                } else {
                    return;
                }
                e eVar = this.h;
                List<d> list6 = this.f47096d;
                List<d> list7 = oVar.h;
                if (PatchProxy.isSupport(new Object[]{list6, list7}, eVar, e.f47159a, false, 43783, new Class[]{List.class, List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list6, list7}, eVar, e.f47159a, false, 43783, new Class[]{List.class, List.class}, Void.TYPE);
                } else {
                    eVar.f47160b.clear();
                    if (list7 != null && list7.size() > 0 && !a.b()) {
                        eVar.f47160b.addAll(list7);
                    }
                    if (list6 != null && list6.size() > 0) {
                        eVar.f47160b.addAll(list6);
                    }
                    eVar.notifyDataSetChanged();
                }
                this.i.setSelection(this.h.getCount());
                this.g = false;
                this.j.setVisibility(8);
                if (oVar.f47209e == 5) {
                    if (NetworkUtils.isNetworkAvailable(this.f47095c)) {
                        this.f47098f++;
                        this.g = true;
                        if (System.currentTimeMillis() - this.l.I > 864000000) {
                            i2 = 1;
                        } else {
                            i2 = 4;
                        }
                        o oVar2 = new o(0, 0, -1, (long) this.f47098f, i2);
                        new FeedbackThread2((Handler) this.f47097e, this.f47095c, oVar2).start();
                        return;
                    }
                    UIUtils.displayToastWithIcon(this.f47095c, 2130838336, (int) C0906R.string.cae);
                }
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f47093a, false, 43819, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f47093a, false, 43819, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.aaq, viewGroup2, false);
        this.i = (ListView) inflate.findViewById(C0906R.id.bd0);
        this.j = (ProgressBar) inflate.findViewById(C0906R.id.c82);
        this.k = (ViewGroup) inflate.findViewById(C0906R.id.yp);
        return inflate;
    }

    public final void a(String str, String str2, Bitmap bitmap) {
        String str3 = str;
        String str4 = str2;
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{str3, str4, bitmap2}, this, f47093a, false, 43824, new Class[]{String.class, String.class, Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, bitmap2}, this, f47093a, false, 43824, new Class[]{String.class, String.class, Bitmap.class}, Void.TYPE);
        } else if (isViewValid()) {
            FragmentActivity activity = getActivity();
            if (activity instanceof FeedbackActivity) {
                FeedbackActivity feedbackActivity = (FeedbackActivity) activity;
                if (PatchProxy.isSupport(new Object[]{str3, str4, bitmap2}, feedbackActivity, FeedbackActivity.f47077a, false, 43748, new Class[]{String.class, String.class, Bitmap.class}, Void.TYPE)) {
                    FeedbackActivity feedbackActivity2 = feedbackActivity;
                    PatchProxy.accessDispatch(new Object[]{str3, str4, bitmap2}, feedbackActivity2, FeedbackActivity.f47077a, false, 43748, new Class[]{String.class, String.class, Bitmap.class}, Void.TYPE);
                    return;
                }
                if (feedbackActivity.isViewValid() && !StringUtils.isEmpty(str)) {
                    if (feedbackActivity.f47079c == null) {
                        feedbackActivity.f47079c = new LargeImageDialog(feedbackActivity, feedbackActivity.f47081e, true);
                        j jVar = new j(feedbackActivity, feedbackActivity.f47082f, feedbackActivity.f47081e, feedbackActivity.f47079c, feedbackActivity.f47079c);
                        feedbackActivity.f47080d = jVar;
                        feedbackActivity.f47079c.f30135e = feedbackActivity.f47080d;
                    }
                    if (!feedbackActivity.f47079c.isShowing()) {
                        LargeImageDialog largeImageDialog = feedbackActivity.f47079c;
                        if (PatchProxy.isSupport(new Object[]{str3, str4, bitmap2}, largeImageDialog, LargeImageDialog.f30131a, false, 18505, new Class[]{String.class, String.class, Bitmap.class}, Void.TYPE)) {
                            LargeImageDialog largeImageDialog2 = largeImageDialog;
                            PatchProxy.accessDispatch(new Object[]{str3, str4, bitmap2}, largeImageDialog2, LargeImageDialog.f30131a, false, 18505, new Class[]{String.class, String.class, Bitmap.class}, Void.TYPE);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            if (str3 != null) {
                                arrayList.add(new f(str3, str4));
                            }
                            if (PatchProxy.isSupport(new Object[]{arrayList, 0}, largeImageDialog, LargeImageDialog.f30131a, false, 18506, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
                                LargeImageDialog largeImageDialog3 = largeImageDialog;
                                PatchProxy.accessDispatch(new Object[]{arrayList, 0}, largeImageDialog3, LargeImageDialog.f30131a, false, 18506, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
                            } else {
                                largeImageDialog.m.clear();
                                largeImageDialog.m.addAll(arrayList);
                                largeImageDialog.o = 0;
                            }
                            if (bitmap2 != null && !StringUtils.isEmpty(str)) {
                                largeImageDialog.g.a(str3, bitmap2);
                            }
                        }
                        feedbackActivity.f47079c.show();
                    }
                }
            }
        }
    }
}
