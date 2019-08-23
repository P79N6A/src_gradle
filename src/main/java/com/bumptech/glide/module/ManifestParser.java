package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public final class ManifestParser {
    private final Context context;

    public final List<GlideModule> parse() {
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (applicationInfo.metaData == null) {
                return arrayList;
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(parseModule(str));
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e2);
        }
    }

    public ManifestParser(Context context2) {
        this.context = context2;
    }

    private static GlideModule parseModule(String str) {
        try {
            Class<?> cls = Class.forName(str);
            GlideModule glideModule = null;
            try {
                glideModule = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e2) {
                throwInstantiateGlideModuleException(cls, e2);
            } catch (IllegalAccessException e3) {
                throwInstantiateGlideModuleException(cls, e3);
            } catch (NoSuchMethodException e4) {
                throwInstantiateGlideModuleException(cls, e4);
            } catch (InvocationTargetException e5) {
                throwInstantiateGlideModuleException(cls, e5);
            }
            if (glideModule instanceof GlideModule) {
                return glideModule;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + glideModule);
        } catch (ClassNotFoundException e6) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e6);
        }
    }

    private static void throwInstantiateGlideModuleException(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }
}
