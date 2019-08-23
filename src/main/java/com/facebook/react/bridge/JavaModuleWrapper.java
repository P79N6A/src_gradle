package com.facebook.react.bridge;

import com.facebook.e.a;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.NativeModule;
import com.lynx.base.CalledByNative;
import com.lynx.base.JNINamespace;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@DoNotStrip
@JNINamespace("JavaModuleWrapper")
public class JavaModuleWrapper {
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();
    private final JSInstance mJSInstance;
    private final ArrayList<NativeModule.NativeMethod> mMethods = new ArrayList<>();
    private final Class<? extends NativeModule> mModuleClass;
    private final ModuleHolder mModuleHolder;

    @DoNotStrip
    public class MethodDescriptor {
        @DoNotStrip
        Method method;
        @DoNotStrip
        String name;
        @DoNotStrip
        String signature;
        @DoNotStrip
        String type;

        public MethodDescriptor() {
        }
    }

    @CalledByNative
    public JSInstance getJSInstance() {
        return this.mJSInstance;
    }

    @DoNotStrip
    public String getName() {
        return this.mModuleHolder.getName();
    }

    @DoNotStrip
    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    @DoNotStrip
    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    @DoNotStrip
    @Nullable
    public NativeMap getConstants() {
        if (!this.mModuleHolder.getHasConstants()) {
            return null;
        }
        String name = getName();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        a.a("module.getConstants");
        Map<String, Object> constants = module.getConstants();
        a.a();
        a.a("create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            WritableNativeMap makeNativeMap = Arguments.makeNativeMap(constants);
            return makeNativeMap;
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END);
            a.a();
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END);
        }
    }

    @DoNotStrip
    private void findMethods() {
        a.a("findMethods");
        HashSet hashSet = new HashSet();
        Class<? extends NativeModule> cls = this.mModuleClass;
        Class<? super T> superclass = this.mModuleClass.getSuperclass();
        if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                if (!hashSet.contains(name)) {
                    MethodDescriptor methodDescriptor = new MethodDescriptor();
                    JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                    methodDescriptor.name = name;
                    methodDescriptor.type = javaMethodWrapper.getType();
                    if (methodDescriptor.type == "sync") {
                        methodDescriptor.signature = javaMethodWrapper.getSignature();
                        methodDescriptor.method = method;
                    }
                    this.mMethods.add(javaMethodWrapper);
                    this.mDescs.add(methodDescriptor);
                } else {
                    throw new IllegalArgumentException("Java Module " + getName() + " method name already registered: " + name);
                }
            }
        }
        a.a();
    }

    @DoNotStrip
    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        String.format("start invoke %d", new Object[]{Integer.valueOf(i)});
        String str = "methods:";
        Iterator<MethodDescriptor> it2 = this.mDescs.iterator();
        while (it2.hasNext()) {
            MethodDescriptor next = it2.next();
            String str2 = str + next.method;
            String str3 = str2 + ":";
            String str4 = str3 + next.name;
            str = str4 + ";";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.mModuleClass.getName());
        if (this.mMethods != null && i < this.mMethods.size()) {
            try {
                this.mMethods.get(i).invoke(this.mJSInstance, readableNativeArray);
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    public JavaModuleWrapper(JSInstance jSInstance, Class<? extends NativeModule> cls, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
        this.mModuleClass = cls;
    }
}
