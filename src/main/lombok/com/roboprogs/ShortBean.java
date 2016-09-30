package com.roboprogs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/** a container of nonsense (but a short one) */
@ToString()
public class ShortBean {

    @Getter @Setter
    private String foo;

    @Getter @Setter
    private int bar;

    @Getter @Setter
    private boolean quack;

}


// vi: ts=4 sw=4 expandtab
// *** EOF ***
