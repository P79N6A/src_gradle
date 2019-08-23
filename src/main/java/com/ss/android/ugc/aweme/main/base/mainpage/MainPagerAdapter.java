package com.ss.android.ugc.aweme.main.base.mainpage;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.adapter.FragmentPagerRebuildAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MainPagerAdapter extends FragmentPagerRebuildAdapter<CommonPageFragment> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f54442c;

    /* renamed from: d  reason: collision with root package name */
    public List<a> f54443d;

    /* renamed from: e  reason: collision with root package name */
    HashMap<String, a> f54444e;

    /* renamed from: f  reason: collision with root package name */
    public FragmentManager f54445f;
    private List<a> g;
    private int h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54446a;

        /* renamed from: b  reason: collision with root package name */
        List<a> f54447b = new ArrayList();

        public final a a(Class<? extends CommonPageFragment> cls, String str, Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{cls, str, bundle}, this, f54446a, false, 57842, new Class[]{Class.class, String.class, Bundle.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{cls, str, bundle}, this, f54446a, false, 57842, new Class[]{Class.class, String.class, Bundle.class}, a.class);
            }
            return a(cls, str, a(), 1.0f, bundle);
        }

        public final MainPagerAdapter a(FragmentManager fragmentManager) {
            if (PatchProxy.isSupport(new Object[]{fragmentManager}, this, f54446a, false, 57845, new Class[]{FragmentManager.class}, MainPagerAdapter.class)) {
                return (MainPagerAdapter) PatchProxy.accessDispatch(new Object[]{fragmentManager}, this, f54446a, false, 57845, new Class[]{FragmentManager.class}, MainPagerAdapter.class);
            }
            MainPagerAdapter mainPagerAdapter = new MainPagerAdapter(fragmentManager, a(this.f54447b));
            mainPagerAdapter.a(this.f54447b);
            return mainPagerAdapter;
        }

        private int a() {
            if (PatchProxy.isSupport(new Object[0], this, f54446a, false, 57839, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f54446a, false, 57839, new Class[0], Integer.TYPE)).intValue();
            } else if (CollectionUtils.isEmpty(this.f54447b)) {
                return 0;
            } else {
                Collections.sort(this.f54447b, new Comparator<a>() {
                    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                        return ((a) obj).f54454f - ((a) obj2).f54454f;
                    }
                });
                int i = 1;
                for (int i2 = 1; i2 < this.f54447b.size(); i2++) {
                    if (this.f54447b.get(i2 - 1).f54454f != this.f54447b.get(i2).f54454f) {
                        i++;
                    }
                }
                return i;
            }
        }

        private int a(List<a> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f54446a, false, 57846, new Class[]{List.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{list}, this, f54446a, false, 57846, new Class[]{List.class}, Integer.TYPE)).intValue();
            } else if (CollectionUtils.isEmpty(list)) {
                return 0;
            } else {
                HashSet hashSet = new HashSet();
                for (a next : list) {
                    if (next != null) {
                        hashSet.add(Integer.valueOf(next.f54454f));
                    }
                }
                return hashSet.size();
            }
        }

        public final a a(Class<? extends CommonPageFragment> cls, String str) {
            Class<? extends CommonPageFragment> cls2 = cls;
            String str2 = str;
            if (!PatchProxy.isSupport(new Object[]{cls2, str2}, this, f54446a, false, 57841, new Class[]{Class.class, String.class}, a.class)) {
                return a(cls2, str2, null);
            }
            return (a) PatchProxy.accessDispatch(new Object[]{cls2, str2}, this, f54446a, false, 57841, new Class[]{Class.class, String.class}, a.class);
        }

        public final a a(Class<? extends CommonPageFragment> cls, String str, int i, float f2) {
            if (!PatchProxy.isSupport(new Object[]{cls, str, 1, Float.valueOf(f2)}, this, f54446a, false, 57843, new Class[]{Class.class, String.class, Integer.TYPE, Float.TYPE}, a.class)) {
                return a(cls, str, 1, f2, null);
            }
            return (a) PatchProxy.accessDispatch(new Object[]{cls, str, 1, Float.valueOf(f2)}, this, f54446a, false, 57843, new Class[]{Class.class, String.class, Integer.TYPE, Float.TYPE}, a.class);
        }

        public final a a(Class<? extends CommonPageFragment> cls, String str, int i, float f2, Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{cls, str, Integer.valueOf(i), Float.valueOf(f2), bundle}, this, f54446a, false, 57844, new Class[]{Class.class, String.class, Integer.TYPE, Float.TYPE, Bundle.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{cls, str, Integer.valueOf(i), Float.valueOf(f2), bundle}, this, f54446a, false, 57844, new Class[]{Class.class, String.class, Integer.TYPE, Float.TYPE, Bundle.class}, a.class);
            } else if (cls != null || !com.ss.android.ugc.aweme.g.a.a()) {
                List<a> list = this.f54447b;
                a aVar = new a(cls, str, i, f2, bundle);
                list.add(aVar);
                return this;
            } else {
                throw new RuntimeException("can not add a null fragment @jiangkun");
            }
        }
    }

    public final /* bridge */ /* synthetic */ void a(Fragment fragment, int i) {
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
    }

    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    private long a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f54442c, false, 57829, new Class[]{a.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f54442c, false, 57829, new Class[]{a.class}, Long.TYPE)).longValue();
        } else if (aVar2 == null) {
            return -1;
        } else {
            return (long) this.f54443d.indexOf(aVar2);
        }
    }

    private String b(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f54442c, false, 57831, new Class[]{a.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aVar}, this, f54442c, false, 57831, new Class[]{a.class}, String.class);
        }
        return a(this.h, a(aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public CommonPageFragment b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54442c, false, 57824, new Class[]{Integer.TYPE}, CommonPageFragment.class)) {
            return (CommonPageFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54442c, false, 57824, new Class[]{Integer.TYPE}, CommonPageFragment.class);
        }
        a aVar = this.g.get(i);
        if (aVar != null) {
            try {
                CommonPageFragment commonPageFragment = (CommonPageFragment) aVar.f54450b.newInstance();
                if (!(aVar.f54452d == null || commonPageFragment == null)) {
                    commonPageFragment.setArguments(aVar.f54452d);
                }
                return commonPageFragment;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final int c(String str) {
        int i;
        if (PatchProxy.isSupport(new Object[]{str}, this, f54442c, false, 57833, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f54442c, false, 57833, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        if (this.g == null) {
            i = 0;
        } else {
            i = this.g.size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (TextUtils.equals(str, this.g.get(i2).f54451c)) {
                return i2;
            }
        }
        return 0;
    }

    public long getItemId(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54442c, false, 57828, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54442c, false, 57828, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
        } else if (this.g == null || this.f54443d == null) {
            return (long) i;
        } else {
            return (long) this.f54443d.indexOf(this.g.get(i));
        }
    }

    public final boolean b(String str) {
        int i;
        if (PatchProxy.isSupport(new Object[]{str}, this, f54442c, false, 57832, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f54442c, false, 57832, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.g == null) {
            i = 0;
        } else {
            i = this.g.size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (TextUtils.equals(str, this.g.get(i2).f54451c)) {
                return true;
            }
        }
        return false;
    }

    public final String c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54442c, false, 57834, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54442c, false, 57834, new Class[]{Integer.TYPE}, String.class);
        } else if (i < 0 || i >= this.g.size()) {
            return "";
        } else {
            return this.g.get(i).f54451c;
        }
    }

    public final CommonPageFragment d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f54442c, false, 57837, new Class[]{String.class}, CommonPageFragment.class)) {
            return (CommonPageFragment) PatchProxy.accessDispatch(new Object[]{str}, this, f54442c, false, 57837, new Class[]{String.class}, CommonPageFragment.class);
        }
        return (CommonPageFragment) a(c(str));
    }

    public float getPageWidth(int i) {
        a aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54442c, false, 57836, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54442c, false, 57836, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54442c, false, 57835, new Class[]{Integer.TYPE}, a.class)) {
            aVar = (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54442c, false, 57835, new Class[]{Integer.TYPE}, a.class);
        } else if (i < 0 || i >= this.g.size()) {
            aVar = null;
        } else {
            aVar = this.g.get(i);
        }
        float f2 = 1.0f;
        if (aVar != null && aVar.f54453e > 0.0f) {
            f2 = aVar.f54453e;
        }
        return f2;
    }

    /* access modifiers changed from: package-private */
    public final int a(List<a> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f54442c, false, 57826, new Class[]{List.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list}, this, f54442c, false, 57826, new Class[]{List.class}, Integer.TYPE)).intValue();
        }
        this.f54443d = list;
        if (PatchProxy.isSupport(new Object[0], this, f54442c, false, 57827, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f54442c, false, 57827, new Class[0], Integer.TYPE)).intValue();
        } else if (CollectionUtils.isEmpty(this.f54443d)) {
            return 0;
        } else {
            this.f54444e = new HashMap<>(this.f54443d.size());
            this.g = new ArrayList();
            for (a next : this.f54443d) {
                if (next != null) {
                    this.f54444e.put(next.f54451c, next);
                    int i = next.f54454f;
                    if (i >= this.g.size()) {
                        this.g.add(i, next);
                    }
                }
            }
            return this.g.size();
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f54442c, false, 57830, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f54442c, false, 57830, new Class[]{String.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.f54443d) && !CollectionUtils.isEmpty(this.g) && !TextUtils.isEmpty(str)) {
            a aVar = this.f54444e.get(str);
            if (aVar != null && this.g.size() > aVar.f54454f && !str.equals(this.g.get(aVar.f54454f).f54451c)) {
                FragmentTransaction beginTransaction = this.f54445f.beginTransaction();
                Fragment findFragmentByTag = this.f54445f.findFragmentByTag(b(this.g.get(aVar.f54454f)));
                if (findFragmentByTag != null) {
                    beginTransaction.hide(findFragmentByTag);
                }
                Fragment findFragmentByTag2 = this.f54445f.findFragmentByTag(b(aVar));
                if (findFragmentByTag2 != null && findFragmentByTag2.isAdded()) {
                    beginTransaction.show(findFragmentByTag2);
                }
                beginTransaction.commitAllowingStateLoss();
                this.g.remove(aVar.f54454f);
                this.g.add(aVar.f54454f, aVar);
                notifyDataSetChanged();
            }
        }
    }

    public MainPagerAdapter(FragmentManager fragmentManager, int i) {
        super(fragmentManager, i);
        this.f54445f = fragmentManager;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f54442c, false, 57825, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f54442c, false, 57825, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        this.h = viewGroup.getId();
        return super.instantiateItem(viewGroup, i);
    }

    public static String a(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, null, f54442c, true, 57838, new Class[]{Integer.TYPE, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, null, f54442c, true, 57838, new Class[]{Integer.TYPE, Long.TYPE}, String.class);
        }
        return "android:switcher:" + i + ":" + j2;
    }
}
