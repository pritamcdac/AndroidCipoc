 
package com.cybage.androidciproject
 
import org.junit.Assert.assertEquals
import org.junit.Test
 
class MainActivityTest {
 
    @Test
    fun testAppName() {
        val appName = "AndroidCIProject"
        assertEquals("AndroidCIProject", appName)
    }
 
    @Test
    fun dummyTest_passes() {
        assertEquals(4, 2 + 2)
    }
}