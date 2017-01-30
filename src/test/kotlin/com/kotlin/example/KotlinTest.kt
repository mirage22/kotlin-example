package com.kotlin.example

import com.sun.tools.doclint.DocLint
import kotlin.test.assertEquals
import org.junit.Test

/**
 * @author Miro Wengner (@miragemiko)
 * @since 29.01.2017
 */
class KotlinTest {

    @Test fun f(){
        val km = KotlinMain()
        assertEquals("Hello, world!", km.getGreeting())
    }

}