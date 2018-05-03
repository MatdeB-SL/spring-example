package com.example.demo.silly;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SillyClassTest {

    @Test
    public void getSillyNumber() {
        SillyClass silly = new SillyClass();
        assertThat(silly.getSillyNumber()).isEqualTo(1);

    }
}