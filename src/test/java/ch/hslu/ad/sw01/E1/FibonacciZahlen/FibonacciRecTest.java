/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.ad.sw01.E1.FibonacciZahlen;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alexi
 */
public class FibonacciRecTest {
    
     @Test
    public void testfiboRec11() {
        assertThat(FibonacciRecIterDemo.fiborec1(0)).isEqualTo(0);
    }

}
