package com.roboprogs;

import lombok.experimental.Value;
import lombok.experimental.Wither;

/** nonsense that allows a "do over" for changes" - make new instances for updates */
@Value
public class ClonerBean
        implements Beanie {

    @Wither
    String foo;

    @Wither
    int bar;

    @Wither
    boolean quack;

}


// vi: ts=4 sw=4 expandtab
// *** EOF ***
