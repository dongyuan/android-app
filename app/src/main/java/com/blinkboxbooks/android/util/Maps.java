// Copyright (c) 2014 blinkbox Entertainment Limited. All rights reserved.
package com.blinkboxbooks.android.util;

import java.util.HashMap;

/**
 * Provides static methods for creating mutable {@code Maps} instances easily.
 */
public class Maps {
    /**
     * Creates a {@code HashMap} instance.
     *
     * @return a newly-created, initially-empty {@code HashMap}
     */
    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<K, V>();
    }
}
