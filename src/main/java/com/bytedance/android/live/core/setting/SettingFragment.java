package com.bytedance.android.live.core.setting;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.s;
import com.bytedance.android.live.core.widget.simple.SimpleViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class SettingFragment extends BaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8138a;

    /* renamed from: b  reason: collision with root package name */
    String[] f8139b;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f8140c;

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f8138a, false, 918, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f8138a, false, 918, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
    }

    public final String[] b(l lVar) {
        if (PatchProxy.isSupport(new Object[]{lVar}, this, f8138a, false, 922, new Class[]{l.class}, String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[]{lVar}, this, f8138a, false, 922, new Class[]{l.class}, String[].class);
        }
        String[] d2 = m.d(lVar);
        if (d2 == null || d2.length == 0) {
            return null;
        }
        String[] strArr = new String[(d2.length + 1)];
        for (int i = 0; i < d2.length; i++) {
            strArr[i] = d2[i];
        }
        strArr[d2.length] = ac.a((int) C0906R.string.djp);
        return strArr;
    }

    public static CharSequence a(l lVar) {
        String str;
        String str2;
        l lVar2 = lVar;
        if (PatchProxy.isSupport(new Object[]{lVar2}, null, f8138a, true, 921, new Class[]{l.class}, CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[]{lVar2}, null, f8138a, true, 921, new Class[]{l.class}, CharSequence.class);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("[ ");
        int length = spannableStringBuilder.length();
        if (PatchProxy.isSupport(new Object[]{lVar2}, null, m.f8186a, true, 933, new Class[]{l.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{lVar2}, null, m.f8186a, true, 933, new Class[]{l.class}, String.class);
        } else {
            str = g.a("key_ttlive_sdk_setting", lVar2);
        }
        if (PatchProxy.isSupport(new Object[]{lVar2}, null, m.f8186a, true, 934, new Class[]{l.class}, String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[]{lVar2}, null, m.f8186a, true, 934, new Class[]{l.class}, String.class);
        } else {
            if (PatchProxy.isSupport(new Object[]{lVar2}, null, g.f8166a, true, 914, new Class[]{l.class}, String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[]{lVar2}, null, g.f8166a, true, 914, new Class[]{l.class}, String.class);
            } else if (g.f8167b.contains(lVar2.f8181b)) {
                str2 = g.f8167b.getAll().get(lVar2.f8181b).toString();
            } else {
                str2 = null;
            }
        }
        if (m.b()) {
            spannableStringBuilder.append(" debug:").append(s.a(lVar2.f8184e));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-65536), length, spannableStringBuilder.length(), 33);
        } else if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
            spannableStringBuilder.append(" default:").append(String.valueOf(lVar2.f8183d));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-7829368), length, spannableStringBuilder.length(), 33);
        } else if (TextUtils.equals(str2, str) || TextUtils.isEmpty(str2)) {
            spannableStringBuilder.append(" server:").append(String.valueOf(str));
        } else if (!TextUtils.isEmpty(str2)) {
            spannableStringBuilder.append(" local:").append(String.valueOf(str2)).append(" server:").append(String.valueOf(str));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-65536), length, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.append(" ]\n").append(m.b(lVar)).append("\n");
        String[] d2 = m.d(lVar);
        if (d2 != null) {
            for (String append : d2) {
                spannableStringBuilder.append(append).append("\n");
            }
        }
        return spannableStringBuilder;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f8138a, false, 920, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f8138a, false, 920, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        this.f8140c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f8140c.setAdapter(new SimpleRecycleAdapter<l>(getContext(), d.a(this.f8139b)) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8141a;

            public final /* synthetic */ void b(SimpleViewHolder simpleViewHolder, Object obj, int i) {
                SimpleViewHolder simpleViewHolder2 = simpleViewHolder;
                l lVar = (l) obj;
                if (PatchProxy.isSupport(new Object[]{simpleViewHolder2, lVar, Integer.valueOf(i)}, this, f8141a, false, 923, new Class[]{SimpleViewHolder.class, l.class, Integer.TYPE}, Void.TYPE)) {
                    Object[] objArr = {simpleViewHolder2, lVar, Integer.valueOf(i)};
                    Object[] objArr2 = objArr;
                    PatchProxy.accessDispatch(objArr2, this, f8141a, false, 923, new Class[]{SimpleViewHolder.class, l.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                simpleViewHolder2.a((int) C0906R.id.title, m.a(lVar));
                CharSequence a2 = SettingFragment.a(lVar);
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.a3u), a2}, simpleViewHolder, SimpleViewHolder.f8365a, false, 1526, new Class[]{Integer.TYPE, CharSequence.class}, SimpleViewHolder.class)) {
                    SimpleViewHolder simpleViewHolder3 = simpleViewHolder;
                    SimpleViewHolder simpleViewHolder4 = (SimpleViewHolder) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.a3u), a2}, simpleViewHolder3, SimpleViewHolder.f8365a, false, 1526, new Class[]{Integer.TYPE, CharSequence.class}, SimpleViewHolder.class);
                } else {
                    ((TextView) simpleViewHolder2.a((int) C0906R.id.a3u)).setText(a2);
                }
            }

            public final /* synthetic */ void a(SimpleViewHolder simpleViewHolder, Object obj, int i) {
                ABTestDialog aBTestDialog;
                int i2 = i;
                l lVar = (l) obj;
                if (PatchProxy.isSupport(new Object[]{simpleViewHolder, lVar, Integer.valueOf(i)}, this, f8141a, false, 924, new Class[]{SimpleViewHolder.class, l.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{simpleViewHolder, lVar, Integer.valueOf(i)}, this, f8141a, false, 924, new Class[]{SimpleViewHolder.class, l.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                String[] d2 = m.d(lVar);
                if (d2 == null || d2.length <= 0) {
                    if (PatchProxy.isSupport(new Object[0], null, ABTestDialog.f8124a, true, 877, new Class[0], ABTestDialog.class)) {
                        aBTestDialog = (ABTestDialog) PatchProxy.accessDispatch(new Object[0], null, ABTestDialog.f8124a, true, 877, new Class[0], ABTestDialog.class);
                    } else {
                        aBTestDialog = new ABTestDialog();
                    }
                    aBTestDialog.f8127c = lVar;
                    aBTestDialog.f8128d = i2;
                    aBTestDialog.f8129e = new k(this);
                    FragmentManager fragmentManager = SettingFragment.this.getFragmentManager();
                    if (PatchProxy.isSupport(new Object[]{fragmentManager}, aBTestDialog, ABTestDialog.f8124a, false, 878, new Class[]{FragmentManager.class}, Void.TYPE)) {
                        ABTestDialog aBTestDialog2 = aBTestDialog;
                        PatchProxy.accessDispatch(new Object[]{fragmentManager}, aBTestDialog2, ABTestDialog.f8124a, false, 878, new Class[]{FragmentManager.class}, Void.TYPE);
                        return;
                    }
                    aBTestDialog.show(fragmentManager, "AbtestDialog");
                    return;
                }
                new AlertDialog.Builder(SettingFragment.this.getContext()).setTitle(m.b(lVar)).setSingleChoiceItems(SettingFragment.this.b(lVar), -1, new j(this, d2, lVar, i2)).create().show();
            }
        });
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, f8138a, false, 919, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, f8138a, false, 919, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.f8140c = new RecyclerView(getContext());
        this.f8140c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return this.f8140c;
    }
}
