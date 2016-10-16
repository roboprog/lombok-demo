package com.roboprogs;

import lombok.Builder;
import lombok.experimental.Value;

/** nonsense that you cannot change once created, but which you can build piece at a time */
@Builder
@Value
public class BuilderBean
        implements Beanie {

    String foo;

    int bar;

    boolean quack;

}


// vi: ts=4 sw=4 expandtab
// *** EOF ***
