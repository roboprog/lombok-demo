package com.roboprogs;

import lombok.experimental.Value;

/** nonsense that you cannot change once created (immutable value object) */
@Value
public class ConstBean
        implements Beanie {

    String foo;

    int bar;

    boolean quack;

}


// vi: ts=4 sw=4 expandtab
// *** EOF ***
