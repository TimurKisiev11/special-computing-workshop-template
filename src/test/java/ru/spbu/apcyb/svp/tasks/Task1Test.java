package ru.spbu.apcyb.svp.tasks;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class Task1Test {
  @Test
    void combinations1() {
    Integer[] arr = {200, 100, 50};
    int actual = Task1.combinations(620, 200, "", arr);
    int expected = 0;
    assertEquals(expected, actual);
  }

  @Test
    void combinations2() {
    Integer[] arr = {10, 6};
    int actual = Task1.combinations(5, 10, "", arr);
    int expected = 0;
    assertEquals(expected, actual);
  }

  @Test
    void combinations3() {
    Integer[] arr = {3, 2};
    int actual = Task1.combinations(5, 3, "", arr);
    int expected = 1;
    assertEquals(expected, actual);
  }

  @Test
    void combinations4() {
    Integer[] arr = {2, 1};
    int actual = Task1.combinations(4, 2, "", arr);
    int expected = 3;
    assertEquals(expected, actual);
  }

  @Test
    void combinations5() {
    Integer[] arr = {1, 2};
    int actual = Task1.combinations(4, 2, "", arr);
    int expected = 3;
    assertEquals(expected, actual);
  }

  @Test
    void combinations7() {
    Integer[] arr = {1, 2};
    int actual = Task1.combinations(-1, 2, "", arr);
    int expected = 0;
    assertEquals(expected, actual);

  }

  @Test
    void combinations8() {
    Integer[] arr = {};
    int actual = Task1.combinations(200, 0, "", arr);
    int expected = 0;
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @ValueSource(strings = {"-100 50 20", "a", ""})
  void numIn(String arg) {
    boolean thrown = false;
    try {
      Task1.nomIn(arg);
    } catch (Exception e) {
      thrown = true;
    }
    assertTrue(thrown);
  }

  @ParameterizedTest
  @ValueSource(strings = {"100 50 20", "100 20 50", "3 2", "1"})
  void numIn2(String arg) {
    boolean thrown = true;
    try {
      Task1.nomIn(arg);
    } catch (Exception e) {
      thrown = false;
    }
    assertTrue(thrown);
  }

  @ParameterizedTest
  @ValueSource(strings = {"-100", "a", " "})
  void sumIn(String arg) {
    boolean thrown = false;
    try {
      Task1.sumIn(arg);
    } catch (Exception e) {
      thrown = true;
    }
    assertTrue(thrown);
  }

  @ParameterizedTest
  @ValueSource(strings = {"100", "1", "1000"})
  void sumIn2(String arg) {
    boolean thrown = true;
    try {
      Task1.sumIn(arg);
    } catch (Exception e) {
      thrown = false;
    }
    assertTrue(thrown);
  }

}