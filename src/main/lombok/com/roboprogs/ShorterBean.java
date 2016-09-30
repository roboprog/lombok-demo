package com.roboprogs;

import lombok.Data;
import lombok.AllArgsConstructor;

/** an even shorter container of nonsense */
@Data
@AllArgsConstructor
public class ShorterBean
        implements Beanie {

    private String foo;

    private int bar;

    private boolean quack;

}


// vi: ts=4 sw=4 expandtab
// *** EOF ***
