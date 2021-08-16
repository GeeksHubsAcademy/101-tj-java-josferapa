package es.geekshubs.academy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NumbersTest {

  private Numbers numbers;
  
  @Before
  public void setUp() throws Exception {
    numbers = new Numbers();
  }

  @After
  public void tearDown() throws Exception {
    numbers = null;
  }
  
  @Test public void test01 () {
    final List<String> expected  = Arrays.asList("0.0000", "0.0000", "1.0000") ;
    final List<String> result = numbers.apply(Arrays.asList(0));
    assertEquals(expected, result);
  }

  @Test public void test02 () {
    final List<String> expected  = Arrays.asList("0.0000", "1.0000", "0.0000") ;
    final List<String> result = numbers.apply(Arrays.asList(-4));
    assertEquals(expected, result);
  }

  @Test public void test03 () {
    final List<String> expected  = Arrays.asList("1.0000", "0.0000", "0.0000") ;
    final List<String> result = numbers.apply(Arrays.asList(10));
    assertEquals(expected, result);
  }

  @Test public void test04 () {
    final List<String> expected  = Arrays.asList("0.5000", "0.3333", "0.1667") ;
    final List<String> result = numbers.apply(Arrays.asList(-4, 3, -9, 0, 4, 1));
    assertEquals(expected, result);
  }

  @Test public void test05 () {
    final List<String> expected  = Arrays.asList("0.5000","0.3333", "0.1667") ;
    final List<String> result = numbers.apply(Arrays.asList(5, -2, -9, 2, 0, 9));
    assertEquals(expected, result);
  }

  @Test public void test06 () {
    final List<String> expected  = Arrays.asList("0.1667","0.1667", "0.6667") ;
    final List<String> result = numbers.apply(Arrays.asList(0, 0, 0, 10, 0, -8));
    assertEquals(expected, result);
  }

  @Test public void test07 () {
    final List<String> expected  = Arrays.asList("0.0000", "0.6667", "0.3333") ;
    final List<String> result = numbers.apply(Arrays.asList(-5, -6, -9, -6, 0, 0));
    assertEquals(expected, result);
  }

  @Test public void test08 () {
    final List<String> expected  = Arrays.asList("0.5000","0.5000", "0.0000") ;
    final List<String> result = numbers.apply(Arrays.asList(5, 2, 9, -2, -2, -9));
    assertEquals(expected, result);
  }

  @Test public void test09 () {
    final List<String> expected  = Arrays.asList("0.3333", "0.3333","0.3333") ;
    final List<String> result = numbers.apply(Arrays.asList(10, 0, -8));
    assertEquals(expected, result);
  }

}