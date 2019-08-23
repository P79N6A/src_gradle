package com.bytedance.router;

import android.content.Intent;
import android.os.Bundle;

public class SmartIntent extends Intent {
    public Bundle getExtras() {
        return super.getExtras();
    }

    private SmartIntent(Intent intent) {
        super(intent);
    }

    public static boolean isSmartIntent(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent instanceof SmartIntent;
    }

    public static Intent smartIntent(Intent intent) {
        if (intent != null && !(intent instanceof SmartIntent)) {
            return new SmartIntent(intent);
        }
        return intent;
    }

    public boolean getBooleanExtra(String str, boolean z) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return z;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return z;
        }
        if (obj instanceof String) {
            try {
                return Boolean.parseBoolean((String) obj);
            } catch (NumberFormatException e2) {
                String str2 = str;
                typeWarning(str2, obj, "Boolean", Boolean.valueOf(z), e2);
                return z;
            }
        } else {
            try {
                return ((Boolean) obj).booleanValue();
            } catch (ClassCastException e3) {
                String str3 = str;
                typeWarning(str3, obj, "Boolean", Boolean.valueOf(z), e3);
                return z;
            }
        }
    }

    public byte getByteExtra(String str, byte b2) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return b2;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return b2;
        }
        if (obj instanceof String) {
            try {
                return Byte.parseByte((String) obj);
            } catch (NumberFormatException e2) {
                String str2 = str;
                typeWarning(str2, obj, "Byte", Byte.valueOf(b2), e2);
                return b2;
            }
        } else {
            try {
                return ((Byte) obj).byteValue();
            } catch (ClassCastException e3) {
                String str3 = str;
                typeWarning(str3, obj, "Byte", Byte.valueOf(b2), e3);
                return b2;
            }
        }
    }

    public double getDoubleExtra(String str, double d2) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return d2;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return d2;
        }
        if (obj instanceof String) {
            try {
                return Double.parseDouble((String) obj);
            } catch (NumberFormatException e2) {
                String str2 = str;
                typeWarning(str2, obj, "Double", Double.valueOf(d2), e2);
                return d2;
            }
        } else {
            try {
                return ((Double) obj).doubleValue();
            } catch (ClassCastException e3) {
                String str3 = str;
                typeWarning(str3, obj, "Double", Double.valueOf(d2), e3);
                return d2;
            }
        }
    }

    public float getFloatExtra(String str, float f2) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return f2;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return f2;
        }
        if (obj instanceof String) {
            try {
                return Float.parseFloat((String) obj);
            } catch (NumberFormatException e2) {
                String str2 = str;
                typeWarning(str2, obj, "Float", Float.valueOf(f2), e2);
                return f2;
            }
        } else {
            try {
                return ((Float) obj).floatValue();
            } catch (ClassCastException e3) {
                String str3 = str;
                typeWarning(str3, obj, "Float", Float.valueOf(f2), e3);
                return f2;
            }
        }
    }

    public int getIntExtra(String str, int i) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return i;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return i;
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException e2) {
                String str2 = str;
                typeWarning(str2, obj, "Integer", Integer.valueOf(i), e2);
                return i;
            }
        } else {
            try {
                return ((Integer) obj).intValue();
            } catch (ClassCastException e3) {
                String str3 = str;
                typeWarning(str3, obj, "Integer", Integer.valueOf(i), e3);
                return i;
            }
        }
    }

    public long getLongExtra(String str, long j) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return j;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return j;
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException e2) {
                String str2 = str;
                typeWarning(str2, obj, "Long", Long.valueOf(j), e2);
                return j;
            }
        } else {
            try {
                return ((Long) obj).longValue();
            } catch (ClassCastException e3) {
                String str3 = str;
                typeWarning(str3, obj, "Long", Long.valueOf(j), e3);
                return j;
            }
        }
    }

    public char getCharExtra(String str, char c2) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return c2;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return c2;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.length() == 1) {
                return str2.charAt(0);
            }
            typeWarning(str, obj, "Char", Character.valueOf(c2), null);
            return c2;
        }
        try {
            return ((Character) obj).charValue();
        } catch (ClassCastException e2) {
            String str3 = str;
            typeWarning(str3, obj, "Char", Character.valueOf(c2), e2);
            return c2;
        }
    }

    public short getShortExtra(String str, short s) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return s;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return s;
        }
        if (obj instanceof String) {
            try {
                return Short.valueOf(Short.parseShort((String) obj)).shortValue();
            } catch (NumberFormatException e2) {
                String str2 = str;
                typeWarning(str2, obj, "Short", Short.valueOf(s), e2);
                return s;
            }
        } else {
            try {
                return ((Short) obj).shortValue();
            } catch (ClassCastException e3) {
                String str3 = str;
                typeWarning(str3, obj, "Short", Short.valueOf(s), e3);
                return s;
            }
        }
    }

    private void typeWarning(String str, Object obj, String str2, Object obj2, RuntimeException runtimeException) {
        StringBuilder sb = new StringBuilder();
        sb.append("Key ");
        sb.append(str);
        sb.append(" expected ");
        sb.append(str2);
        sb.append(" but value was a ");
        sb.append(obj.getClass().getName());
        sb.append(".  The default value ");
        sb.append(obj2);
        sb.append(" was returned.");
    }
}
