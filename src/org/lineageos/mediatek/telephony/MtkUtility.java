package org.lineageos.mediatek.telephony;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class MtkUtility {
    // Make a field non-final
    public static void definalize(Field f) throws NoSuchFieldException, IllegalAccessException {
        Field modifiersField = Field.class.getDeclaredField("accessFlags");
        modifiersField.setAccessible(true);
        modifiersField.setInt(f, modifiersField.getInt(f) & ~Modifier.FINAL);
    }
}
