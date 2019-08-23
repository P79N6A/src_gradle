package com.bytedance.frameworks.plugin.hook;

import com.bytedance.frameworks.plugin.core.c;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.f.g;
import java.lang.reflect.Field;

public class ClassLoaderHook extends Hook {
    public void onHook() {
        try {
            ClassLoader classLoader = e.a().getClassLoader();
            c cVar = new c(classLoader.getParent());
            Field declaredField = ClassLoader.class.getDeclaredField("parent");
            declaredField.setAccessible(true);
            declaredField.set(classLoader, cVar);
        } catch (IllegalArgumentException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (NoSuchFieldException e4) {
            throw new RuntimeException(e4);
        } catch (Exception e5) {
            g.a("Hook Method ClassLoader Failed!!!", (Throwable) e5);
        }
    }
}
