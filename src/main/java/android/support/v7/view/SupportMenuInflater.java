package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.support.annotation.RestrictTo;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.appcompat.R$styleable;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuItemWrapperICS;
import android.support.v7.widget.DrawableUtils;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SupportMenuInflater extends MenuInflater {
    static final Class<?>[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    static final Class<?>[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    final Object[] mActionProviderConstructorArguments = this.mActionViewConstructorArguments;
    final Object[] mActionViewConstructorArguments;
    Context mContext;
    private Object mRealOwner;

    static class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] PARAM_TYPES = {MenuItem.class};
        private Method mMethod;
        private Object mRealOwner;

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.mMethod.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.mMethod.invoke(this.mRealOwner, new Object[]{menuItem})).booleanValue();
                }
                this.mMethod.invoke(this.mRealOwner, new Object[]{menuItem});
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }

        public InflatedOnMenuItemClickListener(Object obj, String str) {
            this.mRealOwner = obj;
            Class<?> cls = obj.getClass();
            try {
                this.mMethod = cls.getMethod(str, PARAM_TYPES);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
    }

    class MenuState {
        private int groupCategory;
        private int groupCheckable;
        private boolean groupEnabled;
        private int groupId;
        private int groupOrder;
        private boolean groupVisible;
        ActionProvider itemActionProvider;
        private String itemActionProviderClassName;
        private String itemActionViewClassName;
        private int itemActionViewLayout;
        private boolean itemAdded;
        private int itemAlphabeticModifiers;
        private char itemAlphabeticShortcut;
        private int itemCategoryOrder;
        private int itemCheckable;
        private boolean itemChecked;
        private CharSequence itemContentDescription;
        private boolean itemEnabled;
        private int itemIconResId;
        private ColorStateList itemIconTintList;
        private PorterDuff.Mode itemIconTintMode;
        private int itemId;
        private String itemListenerMethodName;
        private int itemNumericModifiers;
        private char itemNumericShortcut;
        private int itemShowAsAction;
        private CharSequence itemTitle;
        private CharSequence itemTitleCondensed;
        private CharSequence itemTooltipText;
        private boolean itemVisible;
        private Menu menu;

        public boolean hasAddedItem() {
            return this.itemAdded;
        }

        public void resetGroup() {
            this.groupId = 0;
            this.groupCategory = 0;
            this.groupOrder = 0;
            this.groupCheckable = 0;
            this.groupVisible = true;
            this.groupEnabled = true;
        }

        public void addItem() {
            this.itemAdded = true;
            setItem(this.menu.add(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle));
        }

        public SubMenu addSubMenuItem() {
            this.itemAdded = true;
            SubMenu addSubMenu = this.menu.addSubMenu(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle);
            setItem(addSubMenu.getItem());
            return addSubMenu;
        }

        private char getShortcut(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        public void readGroup(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = SupportMenuInflater.this.mContext.obtainStyledAttributes(attributeSet, R$styleable.MenuGroup);
            this.groupId = obtainStyledAttributes.getResourceId(1, 0);
            this.groupCategory = obtainStyledAttributes.getInt(3, 0);
            this.groupOrder = obtainStyledAttributes.getInt(4, 0);
            this.groupCheckable = obtainStyledAttributes.getInt(5, 0);
            this.groupVisible = obtainStyledAttributes.getBoolean(2, true);
            this.groupEnabled = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        private void setItem(MenuItem menuItem) {
            boolean z;
            MenuItem enabled = menuItem.setChecked(this.itemChecked).setVisible(this.itemVisible).setEnabled(this.itemEnabled);
            boolean z2 = false;
            if (this.itemCheckable > 0) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.itemTitleCondensed).setIcon(this.itemIconResId);
            if (this.itemShowAsAction >= 0) {
                menuItem.setShowAsAction(this.itemShowAsAction);
            }
            if (this.itemListenerMethodName != null) {
                if (!SupportMenuInflater.this.mContext.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new InflatedOnMenuItemClickListener(SupportMenuInflater.this.getRealOwner(), this.itemListenerMethodName));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.itemCheckable >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).setExclusiveCheckable(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).setExclusiveCheckable(true);
                }
            }
            if (this.itemActionViewClassName != null) {
                menuItem.setActionView((View) newInstance(this.itemActionViewClassName, SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, SupportMenuInflater.this.mActionViewConstructorArguments));
                z2 = true;
            }
            if (this.itemActionViewLayout > 0 && !z2) {
                menuItem.setActionView(this.itemActionViewLayout);
            }
            if (this.itemActionProvider != null) {
                MenuItemCompat.setActionProvider(menuItem, this.itemActionProvider);
            }
            MenuItemCompat.setContentDescription(menuItem, this.itemContentDescription);
            MenuItemCompat.setTooltipText(menuItem, this.itemTooltipText);
            MenuItemCompat.setAlphabeticShortcut(menuItem, this.itemAlphabeticShortcut, this.itemAlphabeticModifiers);
            MenuItemCompat.setNumericShortcut(menuItem, this.itemNumericShortcut, this.itemNumericModifiers);
            if (this.itemIconTintMode != null) {
                MenuItemCompat.setIconTintMode(menuItem, this.itemIconTintMode);
            }
            if (this.itemIconTintList != null) {
                MenuItemCompat.setIconTintList(menuItem, this.itemIconTintList);
            }
        }

        public void readItem(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = SupportMenuInflater.this.mContext.obtainStyledAttributes(attributeSet, R$styleable.MenuItem);
            this.itemId = obtainStyledAttributes.getResourceId(2, 0);
            this.itemCategoryOrder = (obtainStyledAttributes.getInt(5, this.groupCategory) & -65536) | (obtainStyledAttributes.getInt(6, this.groupOrder) & 65535);
            this.itemTitle = obtainStyledAttributes.getText(7);
            this.itemTitleCondensed = obtainStyledAttributes.getText(8);
            this.itemIconResId = obtainStyledAttributes.getResourceId(0, 0);
            this.itemAlphabeticShortcut = getShortcut(obtainStyledAttributes.getString(9));
            this.itemAlphabeticModifiers = obtainStyledAttributes.getInt(16, 4096);
            this.itemNumericShortcut = getShortcut(obtainStyledAttributes.getString(10));
            this.itemNumericModifiers = obtainStyledAttributes.getInt(20, 4096);
            if (obtainStyledAttributes.hasValue(11)) {
                this.itemCheckable = obtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
            } else {
                this.itemCheckable = this.groupCheckable;
            }
            this.itemChecked = obtainStyledAttributes.getBoolean(3, false);
            this.itemVisible = obtainStyledAttributes.getBoolean(4, this.groupVisible);
            boolean z = true;
            this.itemEnabled = obtainStyledAttributes.getBoolean(1, this.groupEnabled);
            this.itemShowAsAction = obtainStyledAttributes.getInt(21, -1);
            this.itemListenerMethodName = obtainStyledAttributes.getString(12);
            this.itemActionViewLayout = obtainStyledAttributes.getResourceId(13, 0);
            this.itemActionViewClassName = obtainStyledAttributes.getString(15);
            this.itemActionProviderClassName = obtainStyledAttributes.getString(14);
            if (this.itemActionProviderClassName == null) {
                z = false;
            }
            if (z && this.itemActionViewLayout == 0 && this.itemActionViewClassName == null) {
                this.itemActionProvider = (ActionProvider) newInstance(this.itemActionProviderClassName, SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, SupportMenuInflater.this.mActionProviderConstructorArguments);
            } else {
                this.itemActionProvider = null;
            }
            this.itemContentDescription = obtainStyledAttributes.getText(17);
            this.itemTooltipText = obtainStyledAttributes.getText(22);
            if (obtainStyledAttributes.hasValue(19)) {
                this.itemIconTintMode = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(19, -1), this.itemIconTintMode);
            } else {
                this.itemIconTintMode = null;
            }
            if (obtainStyledAttributes.hasValue(18)) {
                this.itemIconTintList = obtainStyledAttributes.getColorStateList(18);
            } else {
                this.itemIconTintList = null;
            }
            obtainStyledAttributes.recycle();
            this.itemAdded = false;
        }

        public MenuState(Menu menu2) {
            this.menu = menu2;
            resetGroup();
        }

        private <T> T newInstance(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = SupportMenuInflater.this.mContext.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r2 = 0
            r0[r2] = r1
            ACTION_VIEW_CONSTRUCTOR_SIGNATURE = r0
            ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.SupportMenuInflater.<clinit>():void");
    }

    /* access modifiers changed from: package-private */
    public Object getRealOwner() {
        if (this.mRealOwner == null) {
            this.mRealOwner = findRealOwner(this.mContext);
        }
        return this.mRealOwner;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.mContext = context;
        this.mActionViewConstructorArguments = new Object[]{context};
    }

    private Object findRealOwner(Object obj) {
        while (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(@android.support.annotation.LayoutRes int r3, android.view.Menu r4) {
        /*
            r2 = this;
            boolean r0 = r4 instanceof android.support.v4.internal.view.SupportMenu
            if (r0 != 0) goto L_0x0008
            super.inflate(r3, r4)
            return
        L_0x0008:
            r0 = 0
            android.content.Context r1 = r2.mContext     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x002c }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x002c }
            android.content.res.XmlResourceParser r3 = r1.getLayout(r3)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x002c }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r3)     // Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0024, all -> 0x0021 }
            r2.parseMenu(r3, r0, r4)     // Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0024, all -> 0x0021 }
            if (r3 == 0) goto L_0x0020
            r3.close()
            return
        L_0x0020:
            return
        L_0x0021:
            r4 = move-exception
            r0 = r3
            goto L_0x003e
        L_0x0024:
            r4 = move-exception
            r0 = r3
            goto L_0x002d
        L_0x0027:
            r4 = move-exception
            r0 = r3
            goto L_0x0036
        L_0x002a:
            r4 = move-exception
            goto L_0x003e
        L_0x002c:
            r4 = move-exception
        L_0x002d:
            android.view.InflateException r3 = new android.view.InflateException     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "Error inflating menu XML"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x002a }
            throw r3     // Catch:{ all -> 0x002a }
        L_0x0035:
            r4 = move-exception
        L_0x0036:
            android.view.InflateException r3 = new android.view.InflateException     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "Error inflating menu XML"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x002a }
            throw r3     // Catch:{ all -> 0x002a }
        L_0x003e:
            if (r0 == 0) goto L_0x0043
            r0.close()
        L_0x0043:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.SupportMenuInflater.inflate(int, android.view.Menu):void");
    }

    private void parseMenu(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        MenuState menuState = new MenuState(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                if (xmlPullParser.getName().equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + r11);
                }
            }
        }
        int i = eventType;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            switch (i) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (z2) {
                        break;
                    } else {
                        String name = xmlPullParser.getName();
                        if (!name.equals("group")) {
                            if (!name.equals("item")) {
                                if (!name.equals("menu")) {
                                    str = name;
                                    z2 = true;
                                    break;
                                } else {
                                    parseMenu(xmlPullParser, attributeSet, menuState.addSubMenuItem());
                                    break;
                                }
                            } else {
                                menuState.readItem(attributeSet);
                                break;
                            }
                        } else {
                            menuState.readGroup(attributeSet);
                            break;
                        }
                    }
                case 3:
                    String name2 = xmlPullParser.getName();
                    if (!z2 || !name2.equals(str)) {
                        if (!name2.equals("group")) {
                            if (!name2.equals("item")) {
                                if (!name2.equals("menu")) {
                                    break;
                                } else {
                                    z = true;
                                    break;
                                }
                            } else if (!menuState.hasAddedItem()) {
                                if (menuState.itemActionProvider != null && menuState.itemActionProvider.hasSubMenu()) {
                                    menuState.addSubMenuItem();
                                    break;
                                } else {
                                    menuState.addItem();
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            menuState.resetGroup();
                            break;
                        }
                    } else {
                        str = null;
                        z2 = false;
                        break;
                    }
            }
            i = xmlPullParser.next();
        }
    }
}
